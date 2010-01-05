// $ANTLR 3.1.1

	package de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp;


import org.antlr.runtime.*;
import java.util.HashMap;
public class SparqlasParser extends SparqlasANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FULLIRI", "ABBRIRI", "VARIABLE", "NODE", "LITERAL", "INTEGER", "WHITESPACE", "LINEBREAKS", "COMMENT", "FLOAT", "'Namespace'", "'('", "'='", "')'", "'Query'", "'^^'", "'PropertyValue'", "'Type'", "'SameAs'", "'DifferentFrom'", "'EquivalentTo'", "'SubClassOf'", "'DisjointWith'", "'Or'", "'Not'", "'OneOf'", "'And'", "'All'", "'Some'", "'Has'", "'Min'", "'Max'", "'Exact'", "'EquivalentProperty'", "'SubPropertyOf'", "'InverseOf'", "'Functional'", "'InverseFunctional'", "'Transitive'", "'Symmetric'", "'ObjectProperty'", "'DatatypeProperty'", "'Individual'", "'Class'"
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
    public static final int FLOAT=13;
    public static final int LINEBREAKS=11;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int ABBRIRI=5;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int COMMENT=12;
    public static final int T__42=42;
    public static final int INTEGER=9;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int NODE=7;
    public static final int T__45=45;
    public static final int WHITESPACE=10;
    public static final int LITERAL=8;
    public static final int FULLIRI=4;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int VARIABLE=6;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;

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
    public String getGrammarFileName() { return "C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g"; }


    	private de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolverFactory tokenResolverFactory = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTokenResolverFactory();
    	@SuppressWarnings("unused")
    	
    	private int lastPosition;
    	private de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTokenResolveResult tokenResolveResult = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTokenResolveResult();
    	private boolean rememberExpectedElements = false;
    	private java.lang.Object parseToIndexTypeObject;
    	private int lastTokenIndex = 0;
    	private java.util.List<de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal> expectedElements = new java.util.ArrayList<de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal>();
    	private int mismatchedTokenRecoveryTries = 0;
    	private java.util.Map<?, ?> options;
    	//helper lists to allow a lexer to pass errors to its parser
    	protected java.util.List<org.antlr.runtime.RecognitionException> lexerExceptions = java.util.Collections.synchronizedList(new java.util.ArrayList<org.antlr.runtime.RecognitionException>());
    	protected java.util.List<java.lang.Integer> lexerExceptionsPosition = java.util.Collections.synchronizedList(new java.util.ArrayList<java.lang.Integer>());
    	private int stopIncludingHiddenTokens;
    	private int stopExcludingHiddenTokens;
    	private java.util.Collection<de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasCommand<de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTextResource>> postParseCommands;
    	private boolean terminateParsing;
    	private int tokenIndexOfLastCompleteElement;
    	private int expectedElementsIndexOfLastCompleteElement;
    	
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
    	
    	public void addExpectedElement(de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal expectedElement) {
    		if (!this.rememberExpectedElements) {
    			return;
    		}
    		setPosition(expectedElement, input.index());
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
    				de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasLocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for
    					// code completion
    					return true;
    				}
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
    				de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasLocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for
    					// code completion
    					return true;
    				}
    				if (source == null) {
    					return true;
    				}
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
    		// required because the lexer class can not be subclassed
    		((SparqlasLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
    		((SparqlasLexer) getTokenStream().getTokenSource()).lexerExceptionsPosition = lexerExceptionsPosition;
    		java.lang.Object typeObject = getTypeObject();
    		if (typeObject == null) {
    			return start();
    		} else if (typeObject instanceof org.eclipse.emf.ecore.EClass) {
    			org.eclipse.emf.ecore.EClass type = (org.eclipse.emf.ecore.EClass) typeObject;
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.FullIRI.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FullIRI();
    			}
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.AbbreviatedIRI.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AbbreviatedIRI();
    			}
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
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.EquivalentClasses.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentClasses();
    			}
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.SubClassOf.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubClassOf();
    			}
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.DisjointClasses.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DisjointClasses();
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
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.EquivalentObjectProperties.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentObjectProperties();
    			}
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.SubPropertyOf.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubPropertyOf();
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
    			if (type.getInstanceClass() == de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseObjectProperty.class) {
    				return parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectProperty();
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
    	
    	public java.util.List<de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTextResource dummyResource) {
    		rememberExpectedElements = true;
    		parseToIndexTypeObject = type;
    		final org.antlr.runtime.CommonTokenStream tokenStream = (org.antlr.runtime.CommonTokenStream) getTokenStream();
    		de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasParseResult result = parse();
    		if (result != null) {
    			org.eclipse.emf.ecore.EObject root = result.getRoot();
    			if (root != null) {
    				dummyResource.getContents().add(root);
    			}
    			for (de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasCommand<de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTextResource> command : result.getPostParseCommands()) {
    				command.execute(dummyResource);
    			}
    		}
    		// remove all expected elements that were added after the last complete element
    		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
    		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
    		java.util.Set<de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal> currentFollowSet = new java.util.LinkedHashSet<de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal>();
    		java.util.List<de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal> newFollowSet = new java.util.ArrayList<de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal>();
    		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
    			de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal expectedElementI = expectedElements.get(i);
    			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
    				currentFollowSet.add(expectedElementI);
    			} else {
    				break;
    			}
    		}
    		int followSetID = 178;
    		int i;
    		for (i = tokenIndexOfLastCompleteElement; i < tokenStream.size(); i++) {
    			org.antlr.runtime.CommonToken nextToken = (org.antlr.runtime.CommonToken) tokenStream.get(i);
    			if (nextToken.getChannel() == 99) {
    				// hidden tokens do not reduce the follow set
    			} else {
    				// now that we have found the next visible token the position for that expected terminals
    				// can be set
    				for (de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal nextFollow : newFollowSet) {
    					lastTokenIndex = 0;
    					setPosition(nextFollow, i);
    				}
    				newFollowSet.clear();
    				// normal tokens do reduce the follow set - only elements that match the token are kept
    				for (de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal nextFollow : currentFollowSet) {
    					if (nextFollow.getTerminal().getTokenName().equals(getTokenNames()[nextToken.getType()])) {
    						// keep this one - it matches
    						java.util.Collection<de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement> newFollowers = nextFollow.getTerminal().getFollowers();
    						for (de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement newFollower : newFollowers) {
    							de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal newFollowTerminal = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(newFollower, followSetID);
    							newFollowSet.add(newFollowTerminal);
    							expectedElements.add(newFollowTerminal);
    						}
    					}
    				}
    				currentFollowSet.clear();
    				currentFollowSet.addAll(newFollowSet);
    			}
    			followSetID++;
    		}
    		// after the last token in the stream we must set the position for the elements that were
    		// added during the last iteration of the loop
    		for (de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal nextFollow : newFollowSet) {
    			lastTokenIndex = 0;
    			setPosition(nextFollow, i);
    		}
    		return this.expectedElements;
    	}
    	
    	public void setPosition(de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal expectedElement, int tokenIndex) {
    		int currentIndex = java.lang.Math.max(0, tokenIndex);
    		for (int index = lastTokenIndex; index < currentIndex; index++) {
    			if (index >= input.size()) {
    				break;
    			}
    			org.antlr.runtime.CommonToken tokenAtIndex = (org.antlr.runtime.CommonToken) input.get(index);
    			stopIncludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
    			if (tokenAtIndex.getChannel() != 99) {
    				stopExcludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
    			}
    		}
    		lastTokenIndex = java.lang.Math.max(0, currentIndex);
    		expectedElement.setPosition(stopExcludingHiddenTokens, stopIncludingHiddenTokens);
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
    	
    	protected void completedElement(Object element) {
    		if (element instanceof org.eclipse.emf.ecore.EObject) {
    			this.tokenIndexOfLastCompleteElement = getTokenStream().index();
    			this.expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
    		}
    	}
    	
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_0 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("Namespace");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_1 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("Query");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_2 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.eINSTANCE.getFullIRI().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.FULL_IRI__ID), "FULLIRI");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_3 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString(")");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_4 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("PropertyValue");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_5 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("PropertyValue");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_6 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("Type");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_7 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("SameAs");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_8 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("DifferentFrom");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_9 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("EquivalentTo");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_10 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("SubClassOf");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_11 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("DisjointWith");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_12 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("EquivalentProperty");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_13 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("SubPropertyOf");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_14 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("InverseOf");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_15 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("Functional");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_16 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("InverseFunctional");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_17 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("Transitive");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_18 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("Symmetric");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_19 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("ObjectProperty");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_20 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("DatatypeProperty");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_21 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("Individual");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_22 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("Class");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_23 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString(")");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_24 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString(")");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_25 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.eINSTANCE.getClassVariable().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.CLASS_VARIABLE__SYMBOL), "VARIABLE");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_26 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.eINSTANCE.getAbbreviatedIRI().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.ABBREVIATED_IRI__ID), "ABBRIRI");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_27 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("Or");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_28 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("Not");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_29 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("OneOf");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_30 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("And");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_31 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("All");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_32 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("Some");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_33 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("Has");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_34 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("Min");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_35 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("Max");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_36 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("Exact");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_37 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("Has");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_38 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString(")");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_39 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString(")");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_40 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString(")");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_41 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString(")");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_42 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString(")");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_43 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString(")");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_44 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString(")");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_45 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString(")");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_46 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.eINSTANCE.getIndividualVariable().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.INDIVIDUAL_VARIABLE__SYMBOL), "VARIABLE");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_47 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.eINSTANCE.getAnonymousIndividual().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.ANONYMOUS_INDIVIDUAL__NODE_ID), "NODE");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_48 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.eINSTANCE.getObjectPropertyVariable().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_PROPERTY_VARIABLE__SYMBOL), "VARIABLE");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_49 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("InverseOf");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_50 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString(")");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_51 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString(")");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_52 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString(")");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_53 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString(")");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_54 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString(")");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_55 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString(")");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_56 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("(");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_57 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.eINSTANCE.getPrefixDefinition().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.PREFIX_DEFINITION__PREF), "ABBRIRI");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_58 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("=");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_59 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("(");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_60 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString(")");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_61 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString(")");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_62 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.eINSTANCE.getDataPropertyVariable().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.DATA_PROPERTY_VARIABLE__SYMBOL), "VARIABLE");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_63 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.eINSTANCE.getLiteral().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.LITERAL__LEXICAL_FORM), "LITERAL");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_64 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString(")");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_65 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString(")");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_66 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString(")");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_67 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("^^");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_68 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("(");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_69 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString(")");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_70 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("(");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_71 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("(");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_72 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("(");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_73 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString(")");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_74 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("(");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_75 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString(")");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_76 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("(");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_77 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString(")");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_78 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("(");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_79 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString(")");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_80 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("(");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_81 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString(")");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_82 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("(");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_83 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString(")");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_84 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("(");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_85 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("(");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_86 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("(");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_87 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString(")");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_88 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("(");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_89 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("(");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_90 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("(");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_91 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("(");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_92 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.eINSTANCE.getObjectMinCardinality().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_MIN_CARDINALITY__CARDINALITY), "INTEGER");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_93 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("(");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_94 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.eINSTANCE.getObjectMaxCardinality().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_MAX_CARDINALITY__CARDINALITY), "INTEGER");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_95 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("(");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_96 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.eINSTANCE.getObjectExactCardinality().getEStructuralFeature(de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASPackage.OBJECT_EXACT_CARDINALITY__CARDINALITY), "INTEGER");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_97 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("(");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_98 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("(");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_99 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString(")");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_100 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("(");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_101 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString(")");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_102 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("(");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_103 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString(")");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_104 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("(");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_105 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("(");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_106 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("(");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_107 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("(");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_108 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("(");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_109 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("(");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_110 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("(");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_111 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("(");
    	private final static de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasExpectedElement TERMINAL_112 = new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedCsString("(");
    	
    	public static void wire0() {
    		TERMINAL_2.addFollower(TERMINAL_3);
    		TERMINAL_2.addFollower(TERMINAL_4);
    		TERMINAL_2.addFollower(TERMINAL_5);
    		TERMINAL_2.addFollower(TERMINAL_6);
    		TERMINAL_2.addFollower(TERMINAL_7);
    		TERMINAL_2.addFollower(TERMINAL_8);
    		TERMINAL_2.addFollower(TERMINAL_9);
    		TERMINAL_2.addFollower(TERMINAL_10);
    		TERMINAL_2.addFollower(TERMINAL_11);
    		TERMINAL_2.addFollower(TERMINAL_12);
    		TERMINAL_2.addFollower(TERMINAL_13);
    		TERMINAL_2.addFollower(TERMINAL_14);
    		TERMINAL_2.addFollower(TERMINAL_15);
    		TERMINAL_2.addFollower(TERMINAL_16);
    		TERMINAL_2.addFollower(TERMINAL_17);
    		TERMINAL_2.addFollower(TERMINAL_18);
    		TERMINAL_2.addFollower(TERMINAL_19);
    		TERMINAL_2.addFollower(TERMINAL_20);
    		TERMINAL_2.addFollower(TERMINAL_21);
    		TERMINAL_2.addFollower(TERMINAL_22);
    		TERMINAL_2.addFollower(TERMINAL_23);
    		TERMINAL_2.addFollower(TERMINAL_24);
    		TERMINAL_2.addFollower(TERMINAL_25);
    		TERMINAL_2.addFollower(TERMINAL_2);
    		TERMINAL_2.addFollower(TERMINAL_26);
    		TERMINAL_2.addFollower(TERMINAL_27);
    		TERMINAL_2.addFollower(TERMINAL_28);
    		TERMINAL_2.addFollower(TERMINAL_29);
    		TERMINAL_2.addFollower(TERMINAL_30);
    		TERMINAL_2.addFollower(TERMINAL_31);
    		TERMINAL_2.addFollower(TERMINAL_32);
    		TERMINAL_2.addFollower(TERMINAL_33);
    		TERMINAL_2.addFollower(TERMINAL_34);
    		TERMINAL_2.addFollower(TERMINAL_35);
    		TERMINAL_2.addFollower(TERMINAL_36);
    		TERMINAL_2.addFollower(TERMINAL_37);
    		TERMINAL_2.addFollower(TERMINAL_38);
    		TERMINAL_2.addFollower(TERMINAL_39);
    		TERMINAL_2.addFollower(TERMINAL_40);
    		TERMINAL_2.addFollower(TERMINAL_41);
    		TERMINAL_2.addFollower(TERMINAL_42);
    		TERMINAL_2.addFollower(TERMINAL_43);
    		TERMINAL_2.addFollower(TERMINAL_44);
    		TERMINAL_2.addFollower(TERMINAL_45);
    		TERMINAL_2.addFollower(TERMINAL_46);
    		TERMINAL_2.addFollower(TERMINAL_47);
    		TERMINAL_2.addFollower(TERMINAL_48);
    		TERMINAL_2.addFollower(TERMINAL_49);
    		TERMINAL_2.addFollower(TERMINAL_50);
    		TERMINAL_2.addFollower(TERMINAL_51);
    		TERMINAL_2.addFollower(TERMINAL_52);
    		TERMINAL_2.addFollower(TERMINAL_53);
    		TERMINAL_2.addFollower(TERMINAL_54);
    		TERMINAL_2.addFollower(TERMINAL_55);
    		TERMINAL_26.addFollower(TERMINAL_4);
    		TERMINAL_26.addFollower(TERMINAL_5);
    		TERMINAL_26.addFollower(TERMINAL_6);
    		TERMINAL_26.addFollower(TERMINAL_7);
    		TERMINAL_26.addFollower(TERMINAL_8);
    		TERMINAL_26.addFollower(TERMINAL_9);
    		TERMINAL_26.addFollower(TERMINAL_10);
    		TERMINAL_26.addFollower(TERMINAL_11);
    		TERMINAL_26.addFollower(TERMINAL_12);
    		TERMINAL_26.addFollower(TERMINAL_13);
    		TERMINAL_26.addFollower(TERMINAL_14);
    		TERMINAL_26.addFollower(TERMINAL_15);
    		TERMINAL_26.addFollower(TERMINAL_16);
    		TERMINAL_26.addFollower(TERMINAL_17);
    		TERMINAL_26.addFollower(TERMINAL_18);
    		TERMINAL_26.addFollower(TERMINAL_19);
    		TERMINAL_26.addFollower(TERMINAL_20);
    		TERMINAL_26.addFollower(TERMINAL_21);
    		TERMINAL_26.addFollower(TERMINAL_22);
    		TERMINAL_26.addFollower(TERMINAL_23);
    		TERMINAL_26.addFollower(TERMINAL_24);
    		TERMINAL_26.addFollower(TERMINAL_25);
    		TERMINAL_26.addFollower(TERMINAL_2);
    		TERMINAL_26.addFollower(TERMINAL_26);
    		TERMINAL_26.addFollower(TERMINAL_27);
    		TERMINAL_26.addFollower(TERMINAL_28);
    		TERMINAL_26.addFollower(TERMINAL_29);
    		TERMINAL_26.addFollower(TERMINAL_30);
    		TERMINAL_26.addFollower(TERMINAL_31);
    		TERMINAL_26.addFollower(TERMINAL_32);
    		TERMINAL_26.addFollower(TERMINAL_33);
    		TERMINAL_26.addFollower(TERMINAL_34);
    		TERMINAL_26.addFollower(TERMINAL_35);
    		TERMINAL_26.addFollower(TERMINAL_36);
    		TERMINAL_26.addFollower(TERMINAL_37);
    		TERMINAL_26.addFollower(TERMINAL_38);
    		TERMINAL_26.addFollower(TERMINAL_39);
    		TERMINAL_26.addFollower(TERMINAL_40);
    		TERMINAL_26.addFollower(TERMINAL_41);
    		TERMINAL_26.addFollower(TERMINAL_42);
    		TERMINAL_26.addFollower(TERMINAL_43);
    		TERMINAL_26.addFollower(TERMINAL_44);
    		TERMINAL_26.addFollower(TERMINAL_45);
    		TERMINAL_26.addFollower(TERMINAL_46);
    		TERMINAL_26.addFollower(TERMINAL_47);
    		TERMINAL_26.addFollower(TERMINAL_48);
    		TERMINAL_26.addFollower(TERMINAL_49);
    		TERMINAL_26.addFollower(TERMINAL_50);
    		TERMINAL_26.addFollower(TERMINAL_51);
    		TERMINAL_26.addFollower(TERMINAL_52);
    		TERMINAL_26.addFollower(TERMINAL_53);
    		TERMINAL_26.addFollower(TERMINAL_54);
    		TERMINAL_26.addFollower(TERMINAL_55);
    		TERMINAL_0.addFollower(TERMINAL_56);
    		TERMINAL_56.addFollower(TERMINAL_57);
    		TERMINAL_56.addFollower(TERMINAL_58);
    		TERMINAL_57.addFollower(TERMINAL_58);
    		TERMINAL_58.addFollower(TERMINAL_2);
    		TERMINAL_3.addFollower(TERMINAL_0);
    		TERMINAL_3.addFollower(TERMINAL_1);
    		TERMINAL_1.addFollower(TERMINAL_59);
    		TERMINAL_59.addFollower(TERMINAL_2);
    		TERMINAL_59.addFollower(TERMINAL_26);
    		TERMINAL_59.addFollower(TERMINAL_4);
    		TERMINAL_59.addFollower(TERMINAL_5);
    		TERMINAL_59.addFollower(TERMINAL_6);
    		TERMINAL_59.addFollower(TERMINAL_7);
    		TERMINAL_59.addFollower(TERMINAL_8);
    		TERMINAL_59.addFollower(TERMINAL_9);
    		TERMINAL_59.addFollower(TERMINAL_10);
    		TERMINAL_59.addFollower(TERMINAL_11);
    		TERMINAL_59.addFollower(TERMINAL_12);
    		TERMINAL_59.addFollower(TERMINAL_13);
    		TERMINAL_59.addFollower(TERMINAL_14);
    		TERMINAL_59.addFollower(TERMINAL_15);
    		TERMINAL_59.addFollower(TERMINAL_16);
    		TERMINAL_59.addFollower(TERMINAL_17);
    		TERMINAL_59.addFollower(TERMINAL_18);
    		TERMINAL_59.addFollower(TERMINAL_19);
    		TERMINAL_59.addFollower(TERMINAL_20);
    		TERMINAL_59.addFollower(TERMINAL_21);
    		TERMINAL_59.addFollower(TERMINAL_22);
    		TERMINAL_59.addFollower(TERMINAL_23);
    		TERMINAL_25.addFollower(TERMINAL_24);
    		TERMINAL_25.addFollower(TERMINAL_25);
    		TERMINAL_25.addFollower(TERMINAL_2);
    		TERMINAL_25.addFollower(TERMINAL_26);
    		TERMINAL_25.addFollower(TERMINAL_27);
    		TERMINAL_25.addFollower(TERMINAL_28);
    		TERMINAL_25.addFollower(TERMINAL_29);
    		TERMINAL_25.addFollower(TERMINAL_30);
    		TERMINAL_25.addFollower(TERMINAL_31);
    		TERMINAL_25.addFollower(TERMINAL_32);
    		TERMINAL_25.addFollower(TERMINAL_33);
    		TERMINAL_25.addFollower(TERMINAL_34);
    		TERMINAL_25.addFollower(TERMINAL_35);
    		TERMINAL_25.addFollower(TERMINAL_36);
    		TERMINAL_25.addFollower(TERMINAL_37);
    		TERMINAL_25.addFollower(TERMINAL_38);
    		TERMINAL_25.addFollower(TERMINAL_39);
    		TERMINAL_25.addFollower(TERMINAL_40);
    		TERMINAL_25.addFollower(TERMINAL_41);
    		TERMINAL_25.addFollower(TERMINAL_42);
    		TERMINAL_25.addFollower(TERMINAL_43);
    		TERMINAL_25.addFollower(TERMINAL_60);
    		TERMINAL_48.addFollower(TERMINAL_46);
    		TERMINAL_48.addFollower(TERMINAL_2);
    		TERMINAL_48.addFollower(TERMINAL_26);
    		TERMINAL_48.addFollower(TERMINAL_47);
    		TERMINAL_48.addFollower(TERMINAL_25);
    		TERMINAL_48.addFollower(TERMINAL_27);
    		TERMINAL_48.addFollower(TERMINAL_28);
    		TERMINAL_48.addFollower(TERMINAL_29);
    		TERMINAL_48.addFollower(TERMINAL_30);
    		TERMINAL_48.addFollower(TERMINAL_31);
    		TERMINAL_48.addFollower(TERMINAL_32);
    		TERMINAL_48.addFollower(TERMINAL_33);
    		TERMINAL_48.addFollower(TERMINAL_34);
    		TERMINAL_48.addFollower(TERMINAL_35);
    		TERMINAL_48.addFollower(TERMINAL_36);
    		TERMINAL_48.addFollower(TERMINAL_37);
    		TERMINAL_48.addFollower(TERMINAL_41);
    		TERMINAL_48.addFollower(TERMINAL_42);
    		TERMINAL_48.addFollower(TERMINAL_43);
    		TERMINAL_48.addFollower(TERMINAL_48);
    		TERMINAL_48.addFollower(TERMINAL_49);
    		TERMINAL_48.addFollower(TERMINAL_50);
    		TERMINAL_48.addFollower(TERMINAL_51);
    		TERMINAL_48.addFollower(TERMINAL_52);
    		TERMINAL_48.addFollower(TERMINAL_53);
    		TERMINAL_48.addFollower(TERMINAL_54);
    		TERMINAL_48.addFollower(TERMINAL_61);
    		TERMINAL_62.addFollower(TERMINAL_63);
    		TERMINAL_62.addFollower(TERMINAL_64);
    		TERMINAL_46.addFollower(TERMINAL_48);
    		TERMINAL_46.addFollower(TERMINAL_2);
    		TERMINAL_46.addFollower(TERMINAL_26);
    		TERMINAL_46.addFollower(TERMINAL_49);
    		TERMINAL_46.addFollower(TERMINAL_62);
    		TERMINAL_46.addFollower(TERMINAL_25);
    		TERMINAL_46.addFollower(TERMINAL_27);
    		TERMINAL_46.addFollower(TERMINAL_28);
    		TERMINAL_46.addFollower(TERMINAL_29);
    		TERMINAL_46.addFollower(TERMINAL_30);
    		TERMINAL_46.addFollower(TERMINAL_31);
    		TERMINAL_46.addFollower(TERMINAL_32);
    		TERMINAL_46.addFollower(TERMINAL_33);
    		TERMINAL_46.addFollower(TERMINAL_34);
    		TERMINAL_46.addFollower(TERMINAL_35);
    		TERMINAL_46.addFollower(TERMINAL_36);
    		TERMINAL_46.addFollower(TERMINAL_37);
    		TERMINAL_46.addFollower(TERMINAL_46);
    		TERMINAL_46.addFollower(TERMINAL_47);
    		TERMINAL_46.addFollower(TERMINAL_55);
    		TERMINAL_46.addFollower(TERMINAL_65);
    		TERMINAL_46.addFollower(TERMINAL_66);
    		TERMINAL_47.addFollower(TERMINAL_48);
    		TERMINAL_47.addFollower(TERMINAL_2);
    		TERMINAL_47.addFollower(TERMINAL_26);
    		TERMINAL_47.addFollower(TERMINAL_49);
    		TERMINAL_47.addFollower(TERMINAL_62);
    		TERMINAL_47.addFollower(TERMINAL_25);
    		TERMINAL_47.addFollower(TERMINAL_27);
    		TERMINAL_47.addFollower(TERMINAL_28);
    		TERMINAL_47.addFollower(TERMINAL_29);
    		TERMINAL_47.addFollower(TERMINAL_30);
    		TERMINAL_47.addFollower(TERMINAL_31);
    		TERMINAL_47.addFollower(TERMINAL_32);
    		TERMINAL_47.addFollower(TERMINAL_33);
    		TERMINAL_47.addFollower(TERMINAL_34);
    		TERMINAL_47.addFollower(TERMINAL_35);
    		TERMINAL_47.addFollower(TERMINAL_36);
    		TERMINAL_47.addFollower(TERMINAL_37);
    		TERMINAL_47.addFollower(TERMINAL_46);
    		TERMINAL_47.addFollower(TERMINAL_47);
    		TERMINAL_47.addFollower(TERMINAL_55);
    		TERMINAL_47.addFollower(TERMINAL_65);
    		TERMINAL_63.addFollower(TERMINAL_67);
    		TERMINAL_67.addFollower(TERMINAL_2);
    		TERMINAL_67.addFollower(TERMINAL_26);
    		TERMINAL_4.addFollower(TERMINAL_68);
    		TERMINAL_68.addFollower(TERMINAL_46);
    		TERMINAL_68.addFollower(TERMINAL_2);
    		TERMINAL_68.addFollower(TERMINAL_26);
    		TERMINAL_68.addFollower(TERMINAL_47);
    		TERMINAL_69.addFollower(TERMINAL_4);
    		TERMINAL_69.addFollower(TERMINAL_5);
    		TERMINAL_69.addFollower(TERMINAL_6);
    		TERMINAL_69.addFollower(TERMINAL_7);
    		TERMINAL_69.addFollower(TERMINAL_8);
    		TERMINAL_69.addFollower(TERMINAL_9);
    		TERMINAL_69.addFollower(TERMINAL_10);
    		TERMINAL_69.addFollower(TERMINAL_11);
    		TERMINAL_69.addFollower(TERMINAL_12);
    		TERMINAL_69.addFollower(TERMINAL_13);
    		TERMINAL_69.addFollower(TERMINAL_14);
    		TERMINAL_69.addFollower(TERMINAL_15);
    		TERMINAL_69.addFollower(TERMINAL_16);
    		TERMINAL_69.addFollower(TERMINAL_17);
    		TERMINAL_69.addFollower(TERMINAL_18);
    		TERMINAL_69.addFollower(TERMINAL_19);
    		TERMINAL_69.addFollower(TERMINAL_20);
    		TERMINAL_69.addFollower(TERMINAL_21);
    		TERMINAL_69.addFollower(TERMINAL_22);
    		TERMINAL_69.addFollower(TERMINAL_23);
    		TERMINAL_5.addFollower(TERMINAL_70);
    		TERMINAL_70.addFollower(TERMINAL_46);
    		TERMINAL_70.addFollower(TERMINAL_2);
    		TERMINAL_70.addFollower(TERMINAL_26);
    		TERMINAL_70.addFollower(TERMINAL_47);
    		TERMINAL_44.addFollower(TERMINAL_4);
    		TERMINAL_44.addFollower(TERMINAL_5);
    		TERMINAL_44.addFollower(TERMINAL_6);
    		TERMINAL_44.addFollower(TERMINAL_7);
    		TERMINAL_44.addFollower(TERMINAL_8);
    		TERMINAL_44.addFollower(TERMINAL_9);
    		TERMINAL_44.addFollower(TERMINAL_10);
    		TERMINAL_44.addFollower(TERMINAL_11);
    		TERMINAL_44.addFollower(TERMINAL_12);
    		TERMINAL_44.addFollower(TERMINAL_13);
    		TERMINAL_44.addFollower(TERMINAL_14);
    		TERMINAL_44.addFollower(TERMINAL_15);
    		TERMINAL_44.addFollower(TERMINAL_16);
    		TERMINAL_44.addFollower(TERMINAL_17);
    		TERMINAL_44.addFollower(TERMINAL_18);
    		TERMINAL_44.addFollower(TERMINAL_19);
    		TERMINAL_44.addFollower(TERMINAL_20);
    		TERMINAL_44.addFollower(TERMINAL_21);
    		TERMINAL_44.addFollower(TERMINAL_22);
    		TERMINAL_44.addFollower(TERMINAL_23);
    		TERMINAL_6.addFollower(TERMINAL_71);
    		TERMINAL_71.addFollower(TERMINAL_46);
    		TERMINAL_71.addFollower(TERMINAL_2);
    		TERMINAL_71.addFollower(TERMINAL_26);
    		TERMINAL_71.addFollower(TERMINAL_47);
    		TERMINAL_24.addFollower(TERMINAL_4);
    		TERMINAL_24.addFollower(TERMINAL_5);
    		TERMINAL_24.addFollower(TERMINAL_6);
    		TERMINAL_24.addFollower(TERMINAL_7);
    		TERMINAL_24.addFollower(TERMINAL_8);
    		TERMINAL_24.addFollower(TERMINAL_9);
    		TERMINAL_24.addFollower(TERMINAL_10);
    		TERMINAL_24.addFollower(TERMINAL_11);
    		TERMINAL_24.addFollower(TERMINAL_12);
    		TERMINAL_24.addFollower(TERMINAL_13);
    		TERMINAL_24.addFollower(TERMINAL_14);
    		TERMINAL_24.addFollower(TERMINAL_15);
    		TERMINAL_24.addFollower(TERMINAL_16);
    		TERMINAL_24.addFollower(TERMINAL_17);
    		TERMINAL_24.addFollower(TERMINAL_18);
    		TERMINAL_24.addFollower(TERMINAL_19);
    		TERMINAL_24.addFollower(TERMINAL_20);
    		TERMINAL_24.addFollower(TERMINAL_21);
    		TERMINAL_24.addFollower(TERMINAL_22);
    		TERMINAL_24.addFollower(TERMINAL_23);
    		TERMINAL_7.addFollower(TERMINAL_72);
    		TERMINAL_72.addFollower(TERMINAL_46);
    		TERMINAL_72.addFollower(TERMINAL_2);
    		TERMINAL_72.addFollower(TERMINAL_26);
    		TERMINAL_72.addFollower(TERMINAL_47);
    		TERMINAL_73.addFollower(TERMINAL_4);
    		TERMINAL_73.addFollower(TERMINAL_5);
    		TERMINAL_73.addFollower(TERMINAL_6);
    		TERMINAL_73.addFollower(TERMINAL_7);
    		TERMINAL_73.addFollower(TERMINAL_8);
    		TERMINAL_73.addFollower(TERMINAL_9);
    		TERMINAL_73.addFollower(TERMINAL_10);
    		TERMINAL_73.addFollower(TERMINAL_11);
    		TERMINAL_73.addFollower(TERMINAL_12);
    		TERMINAL_73.addFollower(TERMINAL_13);
    		TERMINAL_73.addFollower(TERMINAL_14);
    		TERMINAL_73.addFollower(TERMINAL_15);
    		TERMINAL_73.addFollower(TERMINAL_16);
    		TERMINAL_73.addFollower(TERMINAL_17);
    		TERMINAL_73.addFollower(TERMINAL_18);
    		TERMINAL_73.addFollower(TERMINAL_19);
    		TERMINAL_73.addFollower(TERMINAL_20);
    		TERMINAL_73.addFollower(TERMINAL_21);
    		TERMINAL_73.addFollower(TERMINAL_22);
    		TERMINAL_73.addFollower(TERMINAL_23);
    		TERMINAL_8.addFollower(TERMINAL_74);
    		TERMINAL_74.addFollower(TERMINAL_46);
    		TERMINAL_74.addFollower(TERMINAL_2);
    		TERMINAL_74.addFollower(TERMINAL_26);
    		TERMINAL_74.addFollower(TERMINAL_47);
    		TERMINAL_75.addFollower(TERMINAL_4);
    		TERMINAL_75.addFollower(TERMINAL_5);
    		TERMINAL_75.addFollower(TERMINAL_6);
    		TERMINAL_75.addFollower(TERMINAL_7);
    		TERMINAL_75.addFollower(TERMINAL_8);
    		TERMINAL_75.addFollower(TERMINAL_9);
    		TERMINAL_75.addFollower(TERMINAL_10);
    		TERMINAL_75.addFollower(TERMINAL_11);
    		TERMINAL_75.addFollower(TERMINAL_12);
    		TERMINAL_75.addFollower(TERMINAL_13);
    		TERMINAL_75.addFollower(TERMINAL_14);
    		TERMINAL_75.addFollower(TERMINAL_15);
    		TERMINAL_75.addFollower(TERMINAL_16);
    		TERMINAL_75.addFollower(TERMINAL_17);
    		TERMINAL_75.addFollower(TERMINAL_18);
    		TERMINAL_75.addFollower(TERMINAL_19);
    		TERMINAL_75.addFollower(TERMINAL_20);
    		TERMINAL_75.addFollower(TERMINAL_21);
    		TERMINAL_75.addFollower(TERMINAL_22);
    		TERMINAL_75.addFollower(TERMINAL_23);
    		TERMINAL_9.addFollower(TERMINAL_76);
    		TERMINAL_76.addFollower(TERMINAL_25);
    		TERMINAL_76.addFollower(TERMINAL_2);
    		TERMINAL_76.addFollower(TERMINAL_26);
    		TERMINAL_76.addFollower(TERMINAL_27);
    		TERMINAL_76.addFollower(TERMINAL_28);
    		TERMINAL_76.addFollower(TERMINAL_29);
    		TERMINAL_76.addFollower(TERMINAL_30);
    		TERMINAL_76.addFollower(TERMINAL_31);
    		TERMINAL_76.addFollower(TERMINAL_32);
    		TERMINAL_76.addFollower(TERMINAL_33);
    		TERMINAL_76.addFollower(TERMINAL_34);
    		TERMINAL_76.addFollower(TERMINAL_35);
    		TERMINAL_76.addFollower(TERMINAL_36);
    		TERMINAL_76.addFollower(TERMINAL_37);
    		TERMINAL_77.addFollower(TERMINAL_4);
    		TERMINAL_77.addFollower(TERMINAL_5);
    		TERMINAL_77.addFollower(TERMINAL_6);
    		TERMINAL_77.addFollower(TERMINAL_7);
    		TERMINAL_77.addFollower(TERMINAL_8);
    		TERMINAL_77.addFollower(TERMINAL_9);
    		TERMINAL_77.addFollower(TERMINAL_10);
    		TERMINAL_77.addFollower(TERMINAL_11);
    		TERMINAL_77.addFollower(TERMINAL_12);
    		TERMINAL_77.addFollower(TERMINAL_13);
    		TERMINAL_77.addFollower(TERMINAL_14);
    		TERMINAL_77.addFollower(TERMINAL_15);
    		TERMINAL_77.addFollower(TERMINAL_16);
    		TERMINAL_77.addFollower(TERMINAL_17);
    		TERMINAL_77.addFollower(TERMINAL_18);
    		TERMINAL_77.addFollower(TERMINAL_19);
    		TERMINAL_77.addFollower(TERMINAL_20);
    		TERMINAL_77.addFollower(TERMINAL_21);
    		TERMINAL_77.addFollower(TERMINAL_22);
    		TERMINAL_77.addFollower(TERMINAL_23);
    		TERMINAL_10.addFollower(TERMINAL_78);
    		TERMINAL_78.addFollower(TERMINAL_25);
    		TERMINAL_78.addFollower(TERMINAL_2);
    		TERMINAL_78.addFollower(TERMINAL_26);
    		TERMINAL_78.addFollower(TERMINAL_27);
    		TERMINAL_78.addFollower(TERMINAL_28);
    		TERMINAL_78.addFollower(TERMINAL_29);
    		TERMINAL_78.addFollower(TERMINAL_30);
    		TERMINAL_78.addFollower(TERMINAL_31);
    		TERMINAL_78.addFollower(TERMINAL_32);
    		TERMINAL_78.addFollower(TERMINAL_33);
    		TERMINAL_78.addFollower(TERMINAL_34);
    		TERMINAL_78.addFollower(TERMINAL_35);
    		TERMINAL_78.addFollower(TERMINAL_36);
    		TERMINAL_78.addFollower(TERMINAL_37);
    		TERMINAL_79.addFollower(TERMINAL_4);
    		TERMINAL_79.addFollower(TERMINAL_5);
    		TERMINAL_79.addFollower(TERMINAL_6);
    		TERMINAL_79.addFollower(TERMINAL_7);
    		TERMINAL_79.addFollower(TERMINAL_8);
    		TERMINAL_79.addFollower(TERMINAL_9);
    		TERMINAL_79.addFollower(TERMINAL_10);
    		TERMINAL_79.addFollower(TERMINAL_11);
    		TERMINAL_79.addFollower(TERMINAL_12);
    		TERMINAL_79.addFollower(TERMINAL_13);
    		TERMINAL_79.addFollower(TERMINAL_14);
    		TERMINAL_79.addFollower(TERMINAL_15);
    		TERMINAL_79.addFollower(TERMINAL_16);
    		TERMINAL_79.addFollower(TERMINAL_17);
    		TERMINAL_79.addFollower(TERMINAL_18);
    		TERMINAL_79.addFollower(TERMINAL_19);
    		TERMINAL_79.addFollower(TERMINAL_20);
    		TERMINAL_79.addFollower(TERMINAL_21);
    		TERMINAL_79.addFollower(TERMINAL_22);
    		TERMINAL_79.addFollower(TERMINAL_23);
    		TERMINAL_11.addFollower(TERMINAL_80);
    		TERMINAL_80.addFollower(TERMINAL_25);
    		TERMINAL_80.addFollower(TERMINAL_2);
    		TERMINAL_80.addFollower(TERMINAL_26);
    		TERMINAL_80.addFollower(TERMINAL_27);
    		TERMINAL_80.addFollower(TERMINAL_28);
    		TERMINAL_80.addFollower(TERMINAL_29);
    		TERMINAL_80.addFollower(TERMINAL_30);
    		TERMINAL_80.addFollower(TERMINAL_31);
    		TERMINAL_80.addFollower(TERMINAL_32);
    		TERMINAL_80.addFollower(TERMINAL_33);
    		TERMINAL_80.addFollower(TERMINAL_34);
    		TERMINAL_80.addFollower(TERMINAL_35);
    		TERMINAL_80.addFollower(TERMINAL_36);
    		TERMINAL_80.addFollower(TERMINAL_37);
    		TERMINAL_81.addFollower(TERMINAL_4);
    		TERMINAL_81.addFollower(TERMINAL_5);
    		TERMINAL_81.addFollower(TERMINAL_6);
    		TERMINAL_81.addFollower(TERMINAL_7);
    		TERMINAL_81.addFollower(TERMINAL_8);
    		TERMINAL_81.addFollower(TERMINAL_9);
    		TERMINAL_81.addFollower(TERMINAL_10);
    		TERMINAL_81.addFollower(TERMINAL_11);
    		TERMINAL_81.addFollower(TERMINAL_12);
    		TERMINAL_81.addFollower(TERMINAL_13);
    		TERMINAL_81.addFollower(TERMINAL_14);
    		TERMINAL_81.addFollower(TERMINAL_15);
    		TERMINAL_81.addFollower(TERMINAL_16);
    		TERMINAL_81.addFollower(TERMINAL_17);
    		TERMINAL_81.addFollower(TERMINAL_18);
    		TERMINAL_81.addFollower(TERMINAL_19);
    		TERMINAL_81.addFollower(TERMINAL_20);
    		TERMINAL_81.addFollower(TERMINAL_21);
    		TERMINAL_81.addFollower(TERMINAL_22);
    		TERMINAL_81.addFollower(TERMINAL_23);
    		TERMINAL_27.addFollower(TERMINAL_82);
    		TERMINAL_82.addFollower(TERMINAL_25);
    		TERMINAL_82.addFollower(TERMINAL_2);
    		TERMINAL_82.addFollower(TERMINAL_26);
    		TERMINAL_82.addFollower(TERMINAL_27);
    		TERMINAL_82.addFollower(TERMINAL_28);
    		TERMINAL_82.addFollower(TERMINAL_29);
    		TERMINAL_82.addFollower(TERMINAL_30);
    		TERMINAL_82.addFollower(TERMINAL_31);
    		TERMINAL_82.addFollower(TERMINAL_32);
    		TERMINAL_82.addFollower(TERMINAL_33);
    		TERMINAL_82.addFollower(TERMINAL_34);
    		TERMINAL_82.addFollower(TERMINAL_35);
    		TERMINAL_82.addFollower(TERMINAL_36);
    		TERMINAL_82.addFollower(TERMINAL_37);
    		TERMINAL_83.addFollower(TERMINAL_24);
    		TERMINAL_83.addFollower(TERMINAL_25);
    		TERMINAL_83.addFollower(TERMINAL_2);
    		TERMINAL_83.addFollower(TERMINAL_26);
    		TERMINAL_83.addFollower(TERMINAL_27);
    		TERMINAL_83.addFollower(TERMINAL_28);
    		TERMINAL_83.addFollower(TERMINAL_29);
    		TERMINAL_83.addFollower(TERMINAL_30);
    		TERMINAL_83.addFollower(TERMINAL_31);
    		TERMINAL_83.addFollower(TERMINAL_32);
    		TERMINAL_83.addFollower(TERMINAL_33);
    		TERMINAL_83.addFollower(TERMINAL_34);
    		TERMINAL_83.addFollower(TERMINAL_35);
    		TERMINAL_83.addFollower(TERMINAL_36);
    		TERMINAL_83.addFollower(TERMINAL_37);
    		TERMINAL_83.addFollower(TERMINAL_38);
    		TERMINAL_83.addFollower(TERMINAL_39);
    		TERMINAL_83.addFollower(TERMINAL_40);
    		TERMINAL_83.addFollower(TERMINAL_41);
    		TERMINAL_83.addFollower(TERMINAL_42);
    		TERMINAL_83.addFollower(TERMINAL_43);
    		TERMINAL_28.addFollower(TERMINAL_84);
    		TERMINAL_84.addFollower(TERMINAL_25);
    		TERMINAL_84.addFollower(TERMINAL_2);
    		TERMINAL_84.addFollower(TERMINAL_26);
    		TERMINAL_84.addFollower(TERMINAL_27);
    		TERMINAL_84.addFollower(TERMINAL_28);
    		TERMINAL_84.addFollower(TERMINAL_29);
    		TERMINAL_84.addFollower(TERMINAL_30);
    		TERMINAL_84.addFollower(TERMINAL_31);
    		TERMINAL_84.addFollower(TERMINAL_32);
    		TERMINAL_84.addFollower(TERMINAL_33);
    		TERMINAL_84.addFollower(TERMINAL_34);
    		TERMINAL_84.addFollower(TERMINAL_35);
    		TERMINAL_84.addFollower(TERMINAL_36);
    		TERMINAL_84.addFollower(TERMINAL_37);
    		TERMINAL_38.addFollower(TERMINAL_24);
    		TERMINAL_38.addFollower(TERMINAL_25);
    		TERMINAL_38.addFollower(TERMINAL_2);
    		TERMINAL_38.addFollower(TERMINAL_26);
    		TERMINAL_38.addFollower(TERMINAL_27);
    		TERMINAL_38.addFollower(TERMINAL_28);
    		TERMINAL_38.addFollower(TERMINAL_29);
    		TERMINAL_38.addFollower(TERMINAL_30);
    		TERMINAL_38.addFollower(TERMINAL_31);
    		TERMINAL_38.addFollower(TERMINAL_32);
    		TERMINAL_38.addFollower(TERMINAL_33);
    		TERMINAL_38.addFollower(TERMINAL_34);
    		TERMINAL_38.addFollower(TERMINAL_35);
    		TERMINAL_38.addFollower(TERMINAL_36);
    		TERMINAL_38.addFollower(TERMINAL_37);
    		TERMINAL_38.addFollower(TERMINAL_38);
    		TERMINAL_38.addFollower(TERMINAL_39);
    		TERMINAL_38.addFollower(TERMINAL_40);
    		TERMINAL_38.addFollower(TERMINAL_41);
    		TERMINAL_38.addFollower(TERMINAL_42);
    		TERMINAL_38.addFollower(TERMINAL_43);
    		TERMINAL_29.addFollower(TERMINAL_85);
    		TERMINAL_85.addFollower(TERMINAL_46);
    		TERMINAL_85.addFollower(TERMINAL_2);
    		TERMINAL_85.addFollower(TERMINAL_26);
    		TERMINAL_85.addFollower(TERMINAL_47);
    		TERMINAL_55.addFollower(TERMINAL_24);
    		TERMINAL_55.addFollower(TERMINAL_25);
    		TERMINAL_55.addFollower(TERMINAL_2);
    		TERMINAL_55.addFollower(TERMINAL_26);
    		TERMINAL_55.addFollower(TERMINAL_27);
    		TERMINAL_55.addFollower(TERMINAL_28);
    		TERMINAL_55.addFollower(TERMINAL_29);
    		TERMINAL_55.addFollower(TERMINAL_30);
    		TERMINAL_55.addFollower(TERMINAL_31);
    		TERMINAL_55.addFollower(TERMINAL_32);
    		TERMINAL_55.addFollower(TERMINAL_33);
    		TERMINAL_55.addFollower(TERMINAL_34);
    		TERMINAL_55.addFollower(TERMINAL_35);
    		TERMINAL_55.addFollower(TERMINAL_36);
    		TERMINAL_55.addFollower(TERMINAL_37);
    		TERMINAL_55.addFollower(TERMINAL_38);
    		TERMINAL_55.addFollower(TERMINAL_39);
    		TERMINAL_55.addFollower(TERMINAL_40);
    		TERMINAL_55.addFollower(TERMINAL_41);
    		TERMINAL_55.addFollower(TERMINAL_42);
    		TERMINAL_55.addFollower(TERMINAL_43);
    		TERMINAL_30.addFollower(TERMINAL_86);
    		TERMINAL_86.addFollower(TERMINAL_25);
    		TERMINAL_86.addFollower(TERMINAL_2);
    		TERMINAL_86.addFollower(TERMINAL_26);
    		TERMINAL_86.addFollower(TERMINAL_27);
    		TERMINAL_86.addFollower(TERMINAL_28);
    		TERMINAL_86.addFollower(TERMINAL_29);
    		TERMINAL_86.addFollower(TERMINAL_30);
    		TERMINAL_86.addFollower(TERMINAL_31);
    		TERMINAL_86.addFollower(TERMINAL_32);
    		TERMINAL_86.addFollower(TERMINAL_33);
    		TERMINAL_86.addFollower(TERMINAL_34);
    		TERMINAL_86.addFollower(TERMINAL_35);
    		TERMINAL_86.addFollower(TERMINAL_36);
    		TERMINAL_86.addFollower(TERMINAL_37);
    		TERMINAL_87.addFollower(TERMINAL_24);
    		TERMINAL_87.addFollower(TERMINAL_25);
    		TERMINAL_87.addFollower(TERMINAL_2);
    		TERMINAL_87.addFollower(TERMINAL_26);
    		TERMINAL_87.addFollower(TERMINAL_27);
    		TERMINAL_87.addFollower(TERMINAL_28);
    		TERMINAL_87.addFollower(TERMINAL_29);
    		TERMINAL_87.addFollower(TERMINAL_30);
    		TERMINAL_87.addFollower(TERMINAL_31);
    		TERMINAL_87.addFollower(TERMINAL_32);
    		TERMINAL_87.addFollower(TERMINAL_33);
    		TERMINAL_87.addFollower(TERMINAL_34);
    		TERMINAL_87.addFollower(TERMINAL_35);
    		TERMINAL_87.addFollower(TERMINAL_36);
    		TERMINAL_87.addFollower(TERMINAL_37);
    		TERMINAL_87.addFollower(TERMINAL_38);
    		TERMINAL_87.addFollower(TERMINAL_39);
    		TERMINAL_87.addFollower(TERMINAL_40);
    		TERMINAL_87.addFollower(TERMINAL_41);
    		TERMINAL_87.addFollower(TERMINAL_42);
    		TERMINAL_87.addFollower(TERMINAL_43);
    		TERMINAL_31.addFollower(TERMINAL_88);
    		TERMINAL_88.addFollower(TERMINAL_48);
    		TERMINAL_88.addFollower(TERMINAL_2);
    		TERMINAL_88.addFollower(TERMINAL_26);
    		TERMINAL_88.addFollower(TERMINAL_49);
    		TERMINAL_39.addFollower(TERMINAL_24);
    		TERMINAL_39.addFollower(TERMINAL_25);
    		TERMINAL_39.addFollower(TERMINAL_2);
    		TERMINAL_39.addFollower(TERMINAL_26);
    		TERMINAL_39.addFollower(TERMINAL_27);
    		TERMINAL_39.addFollower(TERMINAL_28);
    		TERMINAL_39.addFollower(TERMINAL_29);
    		TERMINAL_39.addFollower(TERMINAL_30);
    		TERMINAL_39.addFollower(TERMINAL_31);
    		TERMINAL_39.addFollower(TERMINAL_32);
    		TERMINAL_39.addFollower(TERMINAL_33);
    		TERMINAL_39.addFollower(TERMINAL_34);
    		TERMINAL_39.addFollower(TERMINAL_35);
    		TERMINAL_39.addFollower(TERMINAL_36);
    		TERMINAL_39.addFollower(TERMINAL_37);
    		TERMINAL_39.addFollower(TERMINAL_38);
    		TERMINAL_39.addFollower(TERMINAL_39);
    		TERMINAL_39.addFollower(TERMINAL_40);
    		TERMINAL_39.addFollower(TERMINAL_41);
    		TERMINAL_39.addFollower(TERMINAL_42);
    		TERMINAL_39.addFollower(TERMINAL_43);
    		TERMINAL_32.addFollower(TERMINAL_89);
    		TERMINAL_89.addFollower(TERMINAL_48);
    		TERMINAL_89.addFollower(TERMINAL_2);
    		TERMINAL_89.addFollower(TERMINAL_26);
    		TERMINAL_89.addFollower(TERMINAL_49);
    		TERMINAL_40.addFollower(TERMINAL_24);
    		TERMINAL_40.addFollower(TERMINAL_25);
    		TERMINAL_40.addFollower(TERMINAL_2);
    		TERMINAL_40.addFollower(TERMINAL_26);
    		TERMINAL_40.addFollower(TERMINAL_27);
    		TERMINAL_40.addFollower(TERMINAL_28);
    		TERMINAL_40.addFollower(TERMINAL_29);
    		TERMINAL_40.addFollower(TERMINAL_30);
    		TERMINAL_40.addFollower(TERMINAL_31);
    		TERMINAL_40.addFollower(TERMINAL_32);
    		TERMINAL_40.addFollower(TERMINAL_33);
    		TERMINAL_40.addFollower(TERMINAL_34);
    		TERMINAL_40.addFollower(TERMINAL_35);
    		TERMINAL_40.addFollower(TERMINAL_36);
    		TERMINAL_40.addFollower(TERMINAL_37);
    		TERMINAL_40.addFollower(TERMINAL_38);
    		TERMINAL_40.addFollower(TERMINAL_39);
    		TERMINAL_40.addFollower(TERMINAL_40);
    		TERMINAL_40.addFollower(TERMINAL_41);
    		TERMINAL_40.addFollower(TERMINAL_42);
    		TERMINAL_40.addFollower(TERMINAL_43);
    		TERMINAL_33.addFollower(TERMINAL_90);
    		TERMINAL_90.addFollower(TERMINAL_48);
    		TERMINAL_90.addFollower(TERMINAL_2);
    		TERMINAL_90.addFollower(TERMINAL_26);
    		TERMINAL_90.addFollower(TERMINAL_49);
    		TERMINAL_65.addFollower(TERMINAL_24);
    		TERMINAL_65.addFollower(TERMINAL_25);
    		TERMINAL_65.addFollower(TERMINAL_2);
    		TERMINAL_65.addFollower(TERMINAL_26);
    		TERMINAL_65.addFollower(TERMINAL_27);
    		TERMINAL_65.addFollower(TERMINAL_28);
    		TERMINAL_65.addFollower(TERMINAL_29);
    		TERMINAL_65.addFollower(TERMINAL_30);
    		TERMINAL_65.addFollower(TERMINAL_31);
    		TERMINAL_65.addFollower(TERMINAL_32);
    		TERMINAL_65.addFollower(TERMINAL_33);
    		TERMINAL_65.addFollower(TERMINAL_34);
    		TERMINAL_65.addFollower(TERMINAL_35);
    		TERMINAL_65.addFollower(TERMINAL_36);
    		TERMINAL_65.addFollower(TERMINAL_37);
    		TERMINAL_65.addFollower(TERMINAL_38);
    		TERMINAL_65.addFollower(TERMINAL_39);
    		TERMINAL_65.addFollower(TERMINAL_40);
    		TERMINAL_65.addFollower(TERMINAL_41);
    		TERMINAL_65.addFollower(TERMINAL_42);
    		TERMINAL_65.addFollower(TERMINAL_43);
    		TERMINAL_34.addFollower(TERMINAL_91);
    		TERMINAL_91.addFollower(TERMINAL_92);
    		TERMINAL_92.addFollower(TERMINAL_48);
    		TERMINAL_92.addFollower(TERMINAL_2);
    		TERMINAL_92.addFollower(TERMINAL_26);
    		TERMINAL_92.addFollower(TERMINAL_49);
    		TERMINAL_41.addFollower(TERMINAL_24);
    		TERMINAL_41.addFollower(TERMINAL_25);
    		TERMINAL_41.addFollower(TERMINAL_2);
    		TERMINAL_41.addFollower(TERMINAL_26);
    		TERMINAL_41.addFollower(TERMINAL_27);
    		TERMINAL_41.addFollower(TERMINAL_28);
    		TERMINAL_41.addFollower(TERMINAL_29);
    		TERMINAL_41.addFollower(TERMINAL_30);
    		TERMINAL_41.addFollower(TERMINAL_31);
    		TERMINAL_41.addFollower(TERMINAL_32);
    		TERMINAL_41.addFollower(TERMINAL_33);
    		TERMINAL_41.addFollower(TERMINAL_34);
    		TERMINAL_41.addFollower(TERMINAL_35);
    		TERMINAL_41.addFollower(TERMINAL_36);
    		TERMINAL_41.addFollower(TERMINAL_37);
    		TERMINAL_41.addFollower(TERMINAL_38);
    		TERMINAL_41.addFollower(TERMINAL_39);
    		TERMINAL_41.addFollower(TERMINAL_40);
    		TERMINAL_41.addFollower(TERMINAL_41);
    		TERMINAL_41.addFollower(TERMINAL_42);
    		TERMINAL_41.addFollower(TERMINAL_43);
    		TERMINAL_35.addFollower(TERMINAL_93);
    		TERMINAL_93.addFollower(TERMINAL_94);
    		TERMINAL_94.addFollower(TERMINAL_48);
    		TERMINAL_94.addFollower(TERMINAL_2);
    		TERMINAL_94.addFollower(TERMINAL_26);
    		TERMINAL_94.addFollower(TERMINAL_49);
    		TERMINAL_42.addFollower(TERMINAL_24);
    		TERMINAL_42.addFollower(TERMINAL_25);
    		TERMINAL_42.addFollower(TERMINAL_2);
    		TERMINAL_42.addFollower(TERMINAL_26);
    		TERMINAL_42.addFollower(TERMINAL_27);
    		TERMINAL_42.addFollower(TERMINAL_28);
    		TERMINAL_42.addFollower(TERMINAL_29);
    		TERMINAL_42.addFollower(TERMINAL_30);
    		TERMINAL_42.addFollower(TERMINAL_31);
    		TERMINAL_42.addFollower(TERMINAL_32);
    		TERMINAL_42.addFollower(TERMINAL_33);
    		TERMINAL_42.addFollower(TERMINAL_34);
    		TERMINAL_42.addFollower(TERMINAL_35);
    		TERMINAL_42.addFollower(TERMINAL_36);
    		TERMINAL_42.addFollower(TERMINAL_37);
    		TERMINAL_42.addFollower(TERMINAL_38);
    		TERMINAL_42.addFollower(TERMINAL_39);
    		TERMINAL_42.addFollower(TERMINAL_40);
    		TERMINAL_42.addFollower(TERMINAL_41);
    		TERMINAL_42.addFollower(TERMINAL_42);
    		TERMINAL_42.addFollower(TERMINAL_43);
    		TERMINAL_36.addFollower(TERMINAL_95);
    		TERMINAL_95.addFollower(TERMINAL_96);
    		TERMINAL_96.addFollower(TERMINAL_48);
    		TERMINAL_96.addFollower(TERMINAL_2);
    		TERMINAL_96.addFollower(TERMINAL_26);
    		TERMINAL_96.addFollower(TERMINAL_49);
    		TERMINAL_43.addFollower(TERMINAL_24);
    		TERMINAL_43.addFollower(TERMINAL_25);
    		TERMINAL_43.addFollower(TERMINAL_2);
    		TERMINAL_43.addFollower(TERMINAL_26);
    		TERMINAL_43.addFollower(TERMINAL_27);
    		TERMINAL_43.addFollower(TERMINAL_28);
    		TERMINAL_43.addFollower(TERMINAL_29);
    		TERMINAL_43.addFollower(TERMINAL_30);
    		TERMINAL_43.addFollower(TERMINAL_31);
    		TERMINAL_43.addFollower(TERMINAL_32);
    		TERMINAL_43.addFollower(TERMINAL_33);
    		TERMINAL_43.addFollower(TERMINAL_34);
    		TERMINAL_43.addFollower(TERMINAL_35);
    		TERMINAL_43.addFollower(TERMINAL_36);
    		TERMINAL_43.addFollower(TERMINAL_37);
    		TERMINAL_43.addFollower(TERMINAL_38);
    		TERMINAL_43.addFollower(TERMINAL_39);
    		TERMINAL_43.addFollower(TERMINAL_40);
    		TERMINAL_43.addFollower(TERMINAL_41);
    		TERMINAL_43.addFollower(TERMINAL_42);
    		TERMINAL_43.addFollower(TERMINAL_43);
    		TERMINAL_37.addFollower(TERMINAL_97);
    		TERMINAL_97.addFollower(TERMINAL_62);
    		TERMINAL_97.addFollower(TERMINAL_2);
    		TERMINAL_97.addFollower(TERMINAL_26);
    		TERMINAL_45.addFollower(TERMINAL_24);
    		TERMINAL_45.addFollower(TERMINAL_25);
    		TERMINAL_45.addFollower(TERMINAL_2);
    		TERMINAL_45.addFollower(TERMINAL_26);
    		TERMINAL_45.addFollower(TERMINAL_27);
    		TERMINAL_45.addFollower(TERMINAL_28);
    		TERMINAL_45.addFollower(TERMINAL_29);
    		TERMINAL_45.addFollower(TERMINAL_30);
    		TERMINAL_45.addFollower(TERMINAL_31);
    		TERMINAL_45.addFollower(TERMINAL_32);
    		TERMINAL_45.addFollower(TERMINAL_33);
    		TERMINAL_45.addFollower(TERMINAL_34);
    		TERMINAL_45.addFollower(TERMINAL_35);
    		TERMINAL_45.addFollower(TERMINAL_36);
    		TERMINAL_45.addFollower(TERMINAL_37);
    		TERMINAL_45.addFollower(TERMINAL_38);
    		TERMINAL_45.addFollower(TERMINAL_39);
    		TERMINAL_45.addFollower(TERMINAL_40);
    		TERMINAL_45.addFollower(TERMINAL_41);
    		TERMINAL_45.addFollower(TERMINAL_42);
    		TERMINAL_45.addFollower(TERMINAL_43);
    		TERMINAL_12.addFollower(TERMINAL_98);
    		TERMINAL_98.addFollower(TERMINAL_48);
    		TERMINAL_98.addFollower(TERMINAL_2);
    		TERMINAL_98.addFollower(TERMINAL_26);
    		TERMINAL_98.addFollower(TERMINAL_49);
    		TERMINAL_99.addFollower(TERMINAL_4);
    		TERMINAL_99.addFollower(TERMINAL_5);
    		TERMINAL_99.addFollower(TERMINAL_6);
    		TERMINAL_99.addFollower(TERMINAL_7);
    		TERMINAL_99.addFollower(TERMINAL_8);
    		TERMINAL_99.addFollower(TERMINAL_9);
    		TERMINAL_99.addFollower(TERMINAL_10);
    		TERMINAL_99.addFollower(TERMINAL_11);
    		TERMINAL_99.addFollower(TERMINAL_12);
    		TERMINAL_99.addFollower(TERMINAL_13);
    		TERMINAL_99.addFollower(TERMINAL_14);
    		TERMINAL_99.addFollower(TERMINAL_15);
    		TERMINAL_99.addFollower(TERMINAL_16);
    		TERMINAL_99.addFollower(TERMINAL_17);
    		TERMINAL_99.addFollower(TERMINAL_18);
    		TERMINAL_99.addFollower(TERMINAL_19);
    		TERMINAL_99.addFollower(TERMINAL_20);
    		TERMINAL_99.addFollower(TERMINAL_21);
    		TERMINAL_99.addFollower(TERMINAL_22);
    		TERMINAL_99.addFollower(TERMINAL_23);
    		TERMINAL_13.addFollower(TERMINAL_100);
    		TERMINAL_100.addFollower(TERMINAL_48);
    		TERMINAL_100.addFollower(TERMINAL_2);
    		TERMINAL_100.addFollower(TERMINAL_26);
    		TERMINAL_100.addFollower(TERMINAL_49);
    		TERMINAL_101.addFollower(TERMINAL_4);
    		TERMINAL_101.addFollower(TERMINAL_5);
    		TERMINAL_101.addFollower(TERMINAL_6);
    		TERMINAL_101.addFollower(TERMINAL_7);
    		TERMINAL_101.addFollower(TERMINAL_8);
    		TERMINAL_101.addFollower(TERMINAL_9);
    		TERMINAL_101.addFollower(TERMINAL_10);
    		TERMINAL_101.addFollower(TERMINAL_11);
    		TERMINAL_101.addFollower(TERMINAL_12);
    		TERMINAL_101.addFollower(TERMINAL_13);
    		TERMINAL_101.addFollower(TERMINAL_14);
    		TERMINAL_101.addFollower(TERMINAL_15);
    		TERMINAL_101.addFollower(TERMINAL_16);
    		TERMINAL_101.addFollower(TERMINAL_17);
    		TERMINAL_101.addFollower(TERMINAL_18);
    		TERMINAL_101.addFollower(TERMINAL_19);
    		TERMINAL_101.addFollower(TERMINAL_20);
    		TERMINAL_101.addFollower(TERMINAL_21);
    		TERMINAL_101.addFollower(TERMINAL_22);
    		TERMINAL_101.addFollower(TERMINAL_23);
    		TERMINAL_14.addFollower(TERMINAL_102);
    		TERMINAL_102.addFollower(TERMINAL_48);
    		TERMINAL_102.addFollower(TERMINAL_2);
    		TERMINAL_102.addFollower(TERMINAL_26);
    		TERMINAL_102.addFollower(TERMINAL_49);
    		TERMINAL_103.addFollower(TERMINAL_4);
    		TERMINAL_103.addFollower(TERMINAL_5);
    		TERMINAL_103.addFollower(TERMINAL_6);
    		TERMINAL_103.addFollower(TERMINAL_7);
    		TERMINAL_103.addFollower(TERMINAL_8);
    		TERMINAL_103.addFollower(TERMINAL_9);
    		TERMINAL_103.addFollower(TERMINAL_10);
    		TERMINAL_103.addFollower(TERMINAL_11);
    		TERMINAL_103.addFollower(TERMINAL_12);
    		TERMINAL_103.addFollower(TERMINAL_13);
    		TERMINAL_103.addFollower(TERMINAL_14);
    		TERMINAL_103.addFollower(TERMINAL_15);
    		TERMINAL_103.addFollower(TERMINAL_16);
    		TERMINAL_103.addFollower(TERMINAL_17);
    		TERMINAL_103.addFollower(TERMINAL_18);
    		TERMINAL_103.addFollower(TERMINAL_19);
    		TERMINAL_103.addFollower(TERMINAL_20);
    		TERMINAL_103.addFollower(TERMINAL_21);
    		TERMINAL_103.addFollower(TERMINAL_22);
    		TERMINAL_103.addFollower(TERMINAL_23);
    		TERMINAL_15.addFollower(TERMINAL_104);
    		TERMINAL_104.addFollower(TERMINAL_48);
    		TERMINAL_104.addFollower(TERMINAL_2);
    		TERMINAL_104.addFollower(TERMINAL_26);
    		TERMINAL_104.addFollower(TERMINAL_49);
    		TERMINAL_50.addFollower(TERMINAL_4);
    		TERMINAL_50.addFollower(TERMINAL_5);
    		TERMINAL_50.addFollower(TERMINAL_6);
    		TERMINAL_50.addFollower(TERMINAL_7);
    		TERMINAL_50.addFollower(TERMINAL_8);
    		TERMINAL_50.addFollower(TERMINAL_9);
    		TERMINAL_50.addFollower(TERMINAL_10);
    		TERMINAL_50.addFollower(TERMINAL_11);
    		TERMINAL_50.addFollower(TERMINAL_12);
    		TERMINAL_50.addFollower(TERMINAL_13);
    		TERMINAL_50.addFollower(TERMINAL_14);
    		TERMINAL_50.addFollower(TERMINAL_15);
    		TERMINAL_50.addFollower(TERMINAL_16);
    		TERMINAL_50.addFollower(TERMINAL_17);
    		TERMINAL_50.addFollower(TERMINAL_18);
    		TERMINAL_50.addFollower(TERMINAL_19);
    		TERMINAL_50.addFollower(TERMINAL_20);
    		TERMINAL_50.addFollower(TERMINAL_21);
    		TERMINAL_50.addFollower(TERMINAL_22);
    		TERMINAL_50.addFollower(TERMINAL_23);
    		TERMINAL_16.addFollower(TERMINAL_105);
    		TERMINAL_105.addFollower(TERMINAL_48);
    		TERMINAL_105.addFollower(TERMINAL_2);
    		TERMINAL_105.addFollower(TERMINAL_26);
    		TERMINAL_105.addFollower(TERMINAL_49);
    		TERMINAL_51.addFollower(TERMINAL_4);
    		TERMINAL_51.addFollower(TERMINAL_5);
    		TERMINAL_51.addFollower(TERMINAL_6);
    		TERMINAL_51.addFollower(TERMINAL_7);
    		TERMINAL_51.addFollower(TERMINAL_8);
    		TERMINAL_51.addFollower(TERMINAL_9);
    		TERMINAL_51.addFollower(TERMINAL_10);
    		TERMINAL_51.addFollower(TERMINAL_11);
    		TERMINAL_51.addFollower(TERMINAL_12);
    		TERMINAL_51.addFollower(TERMINAL_13);
    		TERMINAL_51.addFollower(TERMINAL_14);
    		TERMINAL_51.addFollower(TERMINAL_15);
    		TERMINAL_51.addFollower(TERMINAL_16);
    		TERMINAL_51.addFollower(TERMINAL_17);
    		TERMINAL_51.addFollower(TERMINAL_18);
    		TERMINAL_51.addFollower(TERMINAL_19);
    		TERMINAL_51.addFollower(TERMINAL_20);
    		TERMINAL_51.addFollower(TERMINAL_21);
    		TERMINAL_51.addFollower(TERMINAL_22);
    		TERMINAL_51.addFollower(TERMINAL_23);
    		TERMINAL_17.addFollower(TERMINAL_106);
    		TERMINAL_106.addFollower(TERMINAL_48);
    		TERMINAL_106.addFollower(TERMINAL_2);
    		TERMINAL_106.addFollower(TERMINAL_26);
    		TERMINAL_106.addFollower(TERMINAL_49);
    		TERMINAL_52.addFollower(TERMINAL_4);
    		TERMINAL_52.addFollower(TERMINAL_5);
    		TERMINAL_52.addFollower(TERMINAL_6);
    		TERMINAL_52.addFollower(TERMINAL_7);
    		TERMINAL_52.addFollower(TERMINAL_8);
    		TERMINAL_52.addFollower(TERMINAL_9);
    		TERMINAL_52.addFollower(TERMINAL_10);
    		TERMINAL_52.addFollower(TERMINAL_11);
    		TERMINAL_52.addFollower(TERMINAL_12);
    		TERMINAL_52.addFollower(TERMINAL_13);
    		TERMINAL_52.addFollower(TERMINAL_14);
    		TERMINAL_52.addFollower(TERMINAL_15);
    		TERMINAL_52.addFollower(TERMINAL_16);
    		TERMINAL_52.addFollower(TERMINAL_17);
    		TERMINAL_52.addFollower(TERMINAL_18);
    		TERMINAL_52.addFollower(TERMINAL_19);
    		TERMINAL_52.addFollower(TERMINAL_20);
    		TERMINAL_52.addFollower(TERMINAL_21);
    		TERMINAL_52.addFollower(TERMINAL_22);
    		TERMINAL_52.addFollower(TERMINAL_23);
    		TERMINAL_18.addFollower(TERMINAL_107);
    		TERMINAL_107.addFollower(TERMINAL_48);
    		TERMINAL_107.addFollower(TERMINAL_2);
    		TERMINAL_107.addFollower(TERMINAL_26);
    		TERMINAL_107.addFollower(TERMINAL_49);
    		TERMINAL_53.addFollower(TERMINAL_4);
    		TERMINAL_53.addFollower(TERMINAL_5);
    		TERMINAL_53.addFollower(TERMINAL_6);
    		TERMINAL_53.addFollower(TERMINAL_7);
    		TERMINAL_53.addFollower(TERMINAL_8);
    		TERMINAL_53.addFollower(TERMINAL_9);
    		TERMINAL_53.addFollower(TERMINAL_10);
    		TERMINAL_53.addFollower(TERMINAL_11);
    		TERMINAL_53.addFollower(TERMINAL_12);
    		TERMINAL_53.addFollower(TERMINAL_13);
    		TERMINAL_53.addFollower(TERMINAL_14);
    		TERMINAL_53.addFollower(TERMINAL_15);
    		TERMINAL_53.addFollower(TERMINAL_16);
    		TERMINAL_53.addFollower(TERMINAL_17);
    		TERMINAL_53.addFollower(TERMINAL_18);
    		TERMINAL_53.addFollower(TERMINAL_19);
    		TERMINAL_53.addFollower(TERMINAL_20);
    		TERMINAL_53.addFollower(TERMINAL_21);
    		TERMINAL_53.addFollower(TERMINAL_22);
    		TERMINAL_53.addFollower(TERMINAL_23);
    		TERMINAL_49.addFollower(TERMINAL_108);
    		TERMINAL_108.addFollower(TERMINAL_48);
    		TERMINAL_108.addFollower(TERMINAL_2);
    		TERMINAL_108.addFollower(TERMINAL_26);
    		TERMINAL_108.addFollower(TERMINAL_49);
    	}
    	public static void wire1() {
    		TERMINAL_54.addFollower(TERMINAL_46);
    		TERMINAL_54.addFollower(TERMINAL_2);
    		TERMINAL_54.addFollower(TERMINAL_26);
    		TERMINAL_54.addFollower(TERMINAL_47);
    		TERMINAL_54.addFollower(TERMINAL_25);
    		TERMINAL_54.addFollower(TERMINAL_27);
    		TERMINAL_54.addFollower(TERMINAL_28);
    		TERMINAL_54.addFollower(TERMINAL_29);
    		TERMINAL_54.addFollower(TERMINAL_30);
    		TERMINAL_54.addFollower(TERMINAL_31);
    		TERMINAL_54.addFollower(TERMINAL_32);
    		TERMINAL_54.addFollower(TERMINAL_33);
    		TERMINAL_54.addFollower(TERMINAL_34);
    		TERMINAL_54.addFollower(TERMINAL_35);
    		TERMINAL_54.addFollower(TERMINAL_36);
    		TERMINAL_54.addFollower(TERMINAL_37);
    		TERMINAL_54.addFollower(TERMINAL_41);
    		TERMINAL_54.addFollower(TERMINAL_42);
    		TERMINAL_54.addFollower(TERMINAL_43);
    		TERMINAL_54.addFollower(TERMINAL_48);
    		TERMINAL_54.addFollower(TERMINAL_49);
    		TERMINAL_54.addFollower(TERMINAL_50);
    		TERMINAL_54.addFollower(TERMINAL_51);
    		TERMINAL_54.addFollower(TERMINAL_52);
    		TERMINAL_54.addFollower(TERMINAL_53);
    		TERMINAL_54.addFollower(TERMINAL_54);
    		TERMINAL_19.addFollower(TERMINAL_109);
    		TERMINAL_109.addFollower(TERMINAL_48);
    		TERMINAL_61.addFollower(TERMINAL_4);
    		TERMINAL_61.addFollower(TERMINAL_5);
    		TERMINAL_61.addFollower(TERMINAL_6);
    		TERMINAL_61.addFollower(TERMINAL_7);
    		TERMINAL_61.addFollower(TERMINAL_8);
    		TERMINAL_61.addFollower(TERMINAL_9);
    		TERMINAL_61.addFollower(TERMINAL_10);
    		TERMINAL_61.addFollower(TERMINAL_11);
    		TERMINAL_61.addFollower(TERMINAL_12);
    		TERMINAL_61.addFollower(TERMINAL_13);
    		TERMINAL_61.addFollower(TERMINAL_14);
    		TERMINAL_61.addFollower(TERMINAL_15);
    		TERMINAL_61.addFollower(TERMINAL_16);
    		TERMINAL_61.addFollower(TERMINAL_17);
    		TERMINAL_61.addFollower(TERMINAL_18);
    		TERMINAL_61.addFollower(TERMINAL_19);
    		TERMINAL_61.addFollower(TERMINAL_20);
    		TERMINAL_61.addFollower(TERMINAL_21);
    		TERMINAL_61.addFollower(TERMINAL_22);
    		TERMINAL_61.addFollower(TERMINAL_23);
    		TERMINAL_20.addFollower(TERMINAL_110);
    		TERMINAL_110.addFollower(TERMINAL_62);
    		TERMINAL_64.addFollower(TERMINAL_4);
    		TERMINAL_64.addFollower(TERMINAL_5);
    		TERMINAL_64.addFollower(TERMINAL_6);
    		TERMINAL_64.addFollower(TERMINAL_7);
    		TERMINAL_64.addFollower(TERMINAL_8);
    		TERMINAL_64.addFollower(TERMINAL_9);
    		TERMINAL_64.addFollower(TERMINAL_10);
    		TERMINAL_64.addFollower(TERMINAL_11);
    		TERMINAL_64.addFollower(TERMINAL_12);
    		TERMINAL_64.addFollower(TERMINAL_13);
    		TERMINAL_64.addFollower(TERMINAL_14);
    		TERMINAL_64.addFollower(TERMINAL_15);
    		TERMINAL_64.addFollower(TERMINAL_16);
    		TERMINAL_64.addFollower(TERMINAL_17);
    		TERMINAL_64.addFollower(TERMINAL_18);
    		TERMINAL_64.addFollower(TERMINAL_19);
    		TERMINAL_64.addFollower(TERMINAL_20);
    		TERMINAL_64.addFollower(TERMINAL_21);
    		TERMINAL_64.addFollower(TERMINAL_22);
    		TERMINAL_64.addFollower(TERMINAL_23);
    		TERMINAL_21.addFollower(TERMINAL_111);
    		TERMINAL_111.addFollower(TERMINAL_46);
    		TERMINAL_66.addFollower(TERMINAL_4);
    		TERMINAL_66.addFollower(TERMINAL_5);
    		TERMINAL_66.addFollower(TERMINAL_6);
    		TERMINAL_66.addFollower(TERMINAL_7);
    		TERMINAL_66.addFollower(TERMINAL_8);
    		TERMINAL_66.addFollower(TERMINAL_9);
    		TERMINAL_66.addFollower(TERMINAL_10);
    		TERMINAL_66.addFollower(TERMINAL_11);
    		TERMINAL_66.addFollower(TERMINAL_12);
    		TERMINAL_66.addFollower(TERMINAL_13);
    		TERMINAL_66.addFollower(TERMINAL_14);
    		TERMINAL_66.addFollower(TERMINAL_15);
    		TERMINAL_66.addFollower(TERMINAL_16);
    		TERMINAL_66.addFollower(TERMINAL_17);
    		TERMINAL_66.addFollower(TERMINAL_18);
    		TERMINAL_66.addFollower(TERMINAL_19);
    		TERMINAL_66.addFollower(TERMINAL_20);
    		TERMINAL_66.addFollower(TERMINAL_21);
    		TERMINAL_66.addFollower(TERMINAL_22);
    		TERMINAL_66.addFollower(TERMINAL_23);
    		TERMINAL_22.addFollower(TERMINAL_112);
    		TERMINAL_112.addFollower(TERMINAL_25);
    		TERMINAL_60.addFollower(TERMINAL_4);
    		TERMINAL_60.addFollower(TERMINAL_5);
    		TERMINAL_60.addFollower(TERMINAL_6);
    		TERMINAL_60.addFollower(TERMINAL_7);
    		TERMINAL_60.addFollower(TERMINAL_8);
    		TERMINAL_60.addFollower(TERMINAL_9);
    		TERMINAL_60.addFollower(TERMINAL_10);
    		TERMINAL_60.addFollower(TERMINAL_11);
    		TERMINAL_60.addFollower(TERMINAL_12);
    		TERMINAL_60.addFollower(TERMINAL_13);
    		TERMINAL_60.addFollower(TERMINAL_14);
    		TERMINAL_60.addFollower(TERMINAL_15);
    		TERMINAL_60.addFollower(TERMINAL_16);
    		TERMINAL_60.addFollower(TERMINAL_17);
    		TERMINAL_60.addFollower(TERMINAL_18);
    		TERMINAL_60.addFollower(TERMINAL_19);
    		TERMINAL_60.addFollower(TERMINAL_20);
    		TERMINAL_60.addFollower(TERMINAL_21);
    		TERMINAL_60.addFollower(TERMINAL_22);
    		TERMINAL_60.addFollower(TERMINAL_23);
    	}
    	// wire the terminals
    	static {
    		wire0();
    		wire1();
    	}



    // $ANTLR start "start"
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1784:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_OntologyDocument ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;
        int start_StartIndex = input.index();
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.OntologyDocument c0 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1785:1: ( (c0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_OntologyDocument ) EOF )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1786:2: (c0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_OntologyDocument ) EOF
            {
            if ( state.backtracking==0 ) {

              		// follow set for start rule(s)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_0, 0));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_1, 0));
              		expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1792:2: (c0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_OntologyDocument )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1793:3: c0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_OntologyDocument
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_OntologyDocument_in_start82);
            c0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_OntologyDocument();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {
               element = c0; 
            }

            }

            match(input,EOF,FOLLOW_EOF_in_start89); if (state.failed) return element;

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


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FullIRI"
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1798:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FullIRI returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.FullIRI element = null] : (a0= FULLIRI ) ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.FullIRI parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FullIRI() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.FullIRI element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FullIRI_StartIndex = input.index();
        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1801:1: ( (a0= FULLIRI ) )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1802:2: (a0= FULLIRI )
            {
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1802:2: (a0= FULLIRI )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1803:3: a0= FULLIRI
            {
            a0=(Token)match(input,FULLIRI,FOLLOW_FULLIRI_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FullIRI116); if (state.failed) return element;
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
              					completedElement(resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_3, 1));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_4, 1));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_5, 1));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_6, 1));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_7, 1));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_8, 1));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_9, 1));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_10, 1));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_11, 1));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_12, 1));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_13, 1));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_14, 1));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_15, 1));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_16, 1));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_17, 1));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_18, 1));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_19, 1));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_20, 1));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_21, 1));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_22, 1));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_23, 1));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_24, 1));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_25, 1));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 1));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 1));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_27, 1));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_28, 1));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_29, 1));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_30, 1));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_31, 1));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_32, 1));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_33, 1));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_34, 1));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_35, 1));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_36, 1));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_37, 1));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_38, 1));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_39, 1));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_40, 1));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_41, 1));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_42, 1));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_43, 1));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_44, 1));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_45, 1));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_46, 1));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_47, 1));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_48, 1));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_49, 1));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_50, 1));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_51, 1));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_52, 1));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_53, 1));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_54, 1));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_55, 1));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FullIRI_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FullIRI"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AbbreviatedIRI"
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1890:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AbbreviatedIRI returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.AbbreviatedIRI element = null] : (a0= ABBRIRI ) ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.AbbreviatedIRI parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AbbreviatedIRI() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.AbbreviatedIRI element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AbbreviatedIRI_StartIndex = input.index();
        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1893:1: ( (a0= ABBRIRI ) )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1894:2: (a0= ABBRIRI )
            {
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1894:2: (a0= ABBRIRI )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1895:3: a0= ABBRIRI
            {
            a0=(Token)match(input,ABBRIRI,FOLLOW_ABBRIRI_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AbbreviatedIRI156); if (state.failed) return element;
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
              					completedElement(resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_4, 2));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_5, 2));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_6, 2));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_7, 2));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_8, 2));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_9, 2));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_10, 2));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_11, 2));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_12, 2));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_13, 2));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_14, 2));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_15, 2));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_16, 2));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_17, 2));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_18, 2));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_19, 2));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_20, 2));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_21, 2));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_22, 2));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_23, 2));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_24, 2));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_25, 2));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 2));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 2));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_27, 2));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_28, 2));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_29, 2));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_30, 2));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_31, 2));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_32, 2));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_33, 2));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_34, 2));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_35, 2));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_36, 2));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_37, 2));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_38, 2));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_39, 2));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_40, 2));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_41, 2));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_42, 2));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_43, 2));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_44, 2));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_45, 2));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_46, 2));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_47, 2));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_48, 2));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_49, 2));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_50, 2));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_51, 2));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_52, 2));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_53, 2));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_54, 2));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_55, 2));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AbbreviatedIRI_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AbbreviatedIRI"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_OntologyDocument"
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1981:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_OntologyDocument returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.OntologyDocument element = null] : ( (a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition ) )* (a1_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Query ) ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.OntologyDocument parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_OntologyDocument() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.OntologyDocument element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_OntologyDocument_StartIndex = input.index();
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.PrefixDefinition a0_0 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.Query a1_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1984:1: ( ( (a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition ) )* (a1_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Query ) )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1985:2: ( (a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition ) )* (a1_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Query )
            {
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1985:2: ( (a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1986:3: (a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition )
            	    {
            	    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1986:3: (a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition )
            	    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:1987:4: a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition
            	    {
            	    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_OntologyDocument201);
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
            	      						completedElement(a0_0);
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

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_0, 3));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_1, 3));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2010:2: (a1_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Query )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2011:3: a1_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Query
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Query_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_OntologyDocument231);
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
              					completedElement(a1_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a1_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_OntologyDocument_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_OntologyDocument"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition"
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2033:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.PrefixDefinition element = null] : a0= 'Namespace' a1= '(' ( (a2= ABBRIRI ) )? a3= '=' (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FullIRI ) a5= ')' ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2036:1: (a0= 'Namespace' a1= '(' ( (a2= ABBRIRI ) )? a3= '=' (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FullIRI ) a5= ')' )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2037:2: a0= 'Namespace' a1= '(' ( (a2= ABBRIRI ) )? a3= '=' (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FullIRI ) a5= ')'
            {
            a0=(Token)match(input,14,FOLLOW_14_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition264); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createPrefixDefinition();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_56, 5));
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition278); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createPrefixDefinition();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_57, 6));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_58, 6));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2062:2: ( (a2= ABBRIRI ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ABBRIRI) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2063:3: (a2= ABBRIRI )
                    {
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2063:3: (a2= ABBRIRI )
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2064:4: a2= ABBRIRI
                    {
                    a2=(Token)match(input,ABBRIRI,FOLLOW_ABBRIRI_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition301); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createPrefixDefinition();
                      				}
                      				if (a2 != null) {
                      					de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("ABBRIRI");
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
                      						completedElement(resolved);
                      					}
                      					collectHiddenTokens(element);
                      					copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
                      				}
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_58, 7));
              	
            }
            a3=(Token)match(input,16,FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition331); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createPrefixDefinition();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 8));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2109:2: (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FullIRI )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2110:3: a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FullIRI
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FullIRI_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition349);
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
              					completedElement(a4_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a4_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_3, 9));
              	
            }
            a5=(Token)match(input,17,FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition367); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createPrefixDefinition();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_0, 10));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_1, 10));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Query"
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2146:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Query returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.Query element = null] : a0= 'Query' a1= '(' ( (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI ) )? ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom ) )* a4= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.Query parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Query() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.Query element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Query_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a4=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.IRI a2_0 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.Atom a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2149:1: (a0= 'Query' a1= '(' ( (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI ) )? ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom ) )* a4= ')' )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2150:2: a0= 'Query' a1= '(' ( (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI ) )? ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom ) )* a4= ')'
            {
            a0=(Token)match(input,18,FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Query396); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createQuery();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_59, 11));
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Query410); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createQuery();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 12));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 12));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_4, 12));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_5, 12));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_6, 12));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_7, 12));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_8, 12));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_9, 12));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_10, 12));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_11, 12));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_12, 12));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_13, 12));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_14, 12));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_15, 12));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_16, 12));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_17, 12));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_18, 12));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_19, 12));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_20, 12));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_21, 12));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_22, 12));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_23, 12));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2195:2: ( (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=FULLIRI && LA3_0<=ABBRIRI)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2196:3: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI )
                    {
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2196:3: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI )
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2197:4: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Query433);
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
                      						completedElement(a2_0);
                      					}
                      					collectHiddenTokens(element);
                      					copyLocalizationInfos(a2_0, element); 				}
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_4, 13));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_5, 13));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_6, 13));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_7, 13));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_8, 13));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_9, 13));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_10, 13));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_11, 13));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_12, 13));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_13, 13));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_14, 13));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_15, 13));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_16, 13));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_17, 13));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_18, 13));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_19, 13));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_20, 13));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_21, 13));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_22, 13));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_23, 13));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2238:2: ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=20 && LA4_0<=26)||(LA4_0>=37 && LA4_0<=47)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2239:3: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom )
            	    {
            	    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2239:3: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom )
            	    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2240:4: a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom
            	    {
            	    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Query468);
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
            	      						completedElement(a3_0);
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

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_4, 14));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_5, 14));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_6, 14));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_7, 14));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_8, 14));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_9, 14));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_10, 14));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_11, 14));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_12, 14));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_13, 14));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_14, 14));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_15, 14));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_16, 14));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_17, 14));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_18, 14));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_19, 14));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_20, 14));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_21, 14));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_22, 14));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_23, 14));
              	
            }
            a4=(Token)match(input,17,FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Query494); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createQuery();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Query_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Query"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassVariable"
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2294:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassVariable returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassVariable element = null] : (a0= VARIABLE ) ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassVariable parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassVariable() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassVariable element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassVariable_StartIndex = input.index();
        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return element; }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2297:1: ( (a0= VARIABLE ) )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2298:2: (a0= VARIABLE )
            {
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2298:2: (a0= VARIABLE )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2299:3: a0= VARIABLE
            {
            a0=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassVariable527); if (state.failed) return element;
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
              					completedElement(resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_24, 16));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_25, 16));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 16));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 16));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_27, 16));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_28, 16));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_29, 16));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_30, 16));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_31, 16));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_32, 16));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_33, 16));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_34, 16));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_35, 16));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_36, 16));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_37, 16));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_38, 16));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_39, 16));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_40, 16));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_41, 16));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_42, 16));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_43, 16));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_60, 16));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassVariable_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassVariable"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyVariable"
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2354:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyVariable returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyVariable element = null] : (a0= VARIABLE ) ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyVariable parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyVariable() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyVariable element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyVariable_StartIndex = input.index();
        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return element; }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2357:1: ( (a0= VARIABLE ) )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2358:2: (a0= VARIABLE )
            {
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2358:2: (a0= VARIABLE )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2359:3: a0= VARIABLE
            {
            a0=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyVariable567); if (state.failed) return element;
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
              					completedElement(resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_46, 17));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 17));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 17));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_47, 17));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_25, 17));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_27, 17));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_28, 17));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_29, 17));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_30, 17));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_31, 17));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_32, 17));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_33, 17));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_34, 17));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_35, 17));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_36, 17));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_37, 17));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_41, 17));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_42, 17));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_43, 17));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_48, 17));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_49, 17));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_50, 17));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_51, 17));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_52, 17));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_53, 17));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_54, 17));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_61, 17));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyVariable_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyVariable"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyVariable"
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2419:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyVariable returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyVariable element = null] : (a0= VARIABLE ) ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyVariable parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyVariable() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyVariable element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyVariable_StartIndex = input.index();
        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return element; }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2422:1: ( (a0= VARIABLE ) )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2423:2: (a0= VARIABLE )
            {
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2423:2: (a0= VARIABLE )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2424:3: a0= VARIABLE
            {
            a0=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyVariable607); if (state.failed) return element;
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
              					completedElement(resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_63, 18));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_64, 18));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyVariable_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyVariable"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualVariable"
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2459:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualVariable returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.IndividualVariable element = null] : (a0= VARIABLE ) ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.IndividualVariable parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualVariable() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.IndividualVariable element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualVariable_StartIndex = input.index();
        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return element; }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2462:1: ( (a0= VARIABLE ) )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2463:2: (a0= VARIABLE )
            {
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2463:2: (a0= VARIABLE )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2464:3: a0= VARIABLE
            {
            a0=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualVariable647); if (state.failed) return element;
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
              					completedElement(resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_48, 19));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 19));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 19));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_49, 19));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_62, 19));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_25, 19));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_27, 19));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_28, 19));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_29, 19));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_30, 19));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_31, 19));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_32, 19));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_33, 19));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_34, 19));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_35, 19));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_36, 19));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_37, 19));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_46, 19));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_47, 19));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_55, 19));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_65, 19));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_66, 19));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualVariable_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualVariable"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Class"
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2519:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Class returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.Class element = null] : (a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI ) ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.Class parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Class() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.Class element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Class_StartIndex = input.index();
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.IRI a0_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return element; }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2522:1: ( (a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI ) )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2523:2: (a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI )
            {
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2523:2: (a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2524:3: a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Class687);
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
              					completedElement(a0_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a0_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_24, 20));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_25, 20));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 20));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 20));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_27, 20));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_28, 20));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_29, 20));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_30, 20));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_31, 20));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_32, 20));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_33, 20));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_34, 20));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_35, 20));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_36, 20));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_37, 20));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_38, 20));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_39, 20));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_40, 20));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_41, 20));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_42, 20));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_43, 20));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Class_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Class"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Datatype"
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2567:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Datatype returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.Datatype element = null] : (a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI ) ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.Datatype parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Datatype() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.Datatype element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Datatype_StartIndex = input.index();
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.IRI a0_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return element; }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2570:1: ( (a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI ) )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2571:2: (a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI )
            {
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2571:2: (a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2572:3: a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Datatype724);
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
              					completedElement(a0_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a0_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_44, 21));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_45, 21));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Datatype_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Datatype"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectProperty"
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2596:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectProperty returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectProperty element = null] : (a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI ) ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectProperty parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectProperty() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectProperty element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectProperty_StartIndex = input.index();
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.IRI a0_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return element; }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2599:1: ( (a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI ) )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2600:2: (a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI )
            {
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2600:2: (a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2601:3: a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectProperty761);
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
              					completedElement(a0_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a0_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_46, 22));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 22));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 22));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_47, 22));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_25, 22));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_27, 22));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_28, 22));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_29, 22));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_30, 22));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_31, 22));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_32, 22));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_33, 22));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_34, 22));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_35, 22));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_36, 22));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_37, 22));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_41, 22));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_42, 22));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_43, 22));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_48, 22));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_49, 22));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_50, 22));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_51, 22));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_52, 22));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_53, 22));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_54, 22));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectProperty_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectProperty"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataProperty"
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2649:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataProperty returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataProperty element = null] : (a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI ) ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataProperty parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataProperty() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataProperty element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataProperty_StartIndex = input.index();
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.IRI a0_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return element; }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2652:1: ( (a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI ) )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2653:2: (a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI )
            {
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2653:2: (a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2654:3: a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataProperty798);
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
              					completedElement(a0_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a0_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_63, 23));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataProperty_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataProperty"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_NamedIndividual"
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2677:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_NamedIndividual returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.NamedIndividual element = null] : (a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI ) ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.NamedIndividual parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_NamedIndividual() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.NamedIndividual element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_NamedIndividual_StartIndex = input.index();
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.IRI a0_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return element; }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2680:1: ( (a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI ) )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2681:2: (a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI )
            {
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2681:2: (a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2682:3: a0_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_NamedIndividual835);
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
              					completedElement(a0_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a0_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_48, 24));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 24));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 24));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_49, 24));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_62, 24));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_25, 24));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_27, 24));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_28, 24));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_29, 24));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_30, 24));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_31, 24));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_32, 24));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_33, 24));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_34, 24));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_35, 24));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_36, 24));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_37, 24));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_46, 24));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_47, 24));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_55, 24));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_65, 24));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_NamedIndividual_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_NamedIndividual"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AnonymousIndividual"
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2725:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AnonymousIndividual returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.AnonymousIndividual element = null] : (a0= NODE ) ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.AnonymousIndividual parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AnonymousIndividual() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.AnonymousIndividual element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AnonymousIndividual_StartIndex = input.index();
        Token a0=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return element; }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2728:1: ( (a0= NODE ) )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2729:2: (a0= NODE )
            {
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2729:2: (a0= NODE )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2730:3: a0= NODE
            {
            a0=(Token)match(input,NODE,FOLLOW_NODE_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AnonymousIndividual872); if (state.failed) return element;
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
              					completedElement(resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_48, 25));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 25));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 25));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_49, 25));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_62, 25));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_25, 25));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_27, 25));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_28, 25));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_29, 25));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_30, 25));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_31, 25));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_32, 25));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_33, 25));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_34, 25));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_35, 25));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_36, 25));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_37, 25));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_46, 25));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_47, 25));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_55, 25));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_65, 25));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AnonymousIndividual_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AnonymousIndividual"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal"
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2784:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.Literal element = null] : (a0= LITERAL ) a1= '^^' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Datatype ) ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.Literal parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.Literal element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.Datatype a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return element; }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2787:1: ( (a0= LITERAL ) a1= '^^' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Datatype ) )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2788:2: (a0= LITERAL ) a1= '^^' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Datatype )
            {
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2788:2: (a0= LITERAL )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2789:3: a0= LITERAL
            {
            a0=(Token)match(input,LITERAL,FOLLOW_LITERAL_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal912); if (state.failed) return element;
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
              					completedElement(resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_67, 26));
              	
            }
            a1=(Token)match(input,19,FOLLOW_19_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal933); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createLiteral();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 27));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 27));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2834:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Datatype )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2835:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Datatype
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Datatype_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal951);
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
              					completedElement(a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_44, 28));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_45, 28));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyAssertion"
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2859:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyAssertion returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyAssertion element = null] : a0= 'PropertyValue' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) a5= ')' ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return element; }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2862:1: (a0= 'PropertyValue' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) a5= ')' )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2863:2: a0= 'PropertyValue' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) a5= ')'
            {
            a0=(Token)match(input,20,FOLLOW_20_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyAssertion984); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectPropertyAssertion();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_68, 29));
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyAssertion998); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectPropertyAssertion();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_46, 30));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 30));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 30));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_47, 30));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2890:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2891:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyAssertion1016);
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
              					completedElement(a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_48, 31));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 31));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 31));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_49, 31));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2915:2: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2916:3: a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyAssertion1038);
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
              					completedElement(a3_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a3_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_46, 32));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 32));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 32));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_47, 32));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2940:2: (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2941:3: a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyAssertion1060);
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
              					completedElement(a4_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a4_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_69, 33));
              	
            }
            a5=(Token)match(input,17,FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyAssertion1078); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectPropertyAssertion();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_4, 34));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_5, 34));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_6, 34));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_7, 34));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_8, 34));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_9, 34));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_10, 34));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_11, 34));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_12, 34));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_13, 34));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_14, 34));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_15, 34));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_16, 34));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_17, 34));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_18, 34));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_19, 34));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_20, 34));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_21, 34));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_22, 34));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_23, 34));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 18, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyAssertion_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyAssertion"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyAssertion"
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2995:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyAssertion returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyAssertion element = null] : a0= 'PropertyValue' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyExpression ) (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal ) a5= ')' ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return element; }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2998:1: (a0= 'PropertyValue' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyExpression ) (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal ) a5= ')' )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:2999:2: a0= 'PropertyValue' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyExpression ) (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal ) a5= ')'
            {
            a0=(Token)match(input,20,FOLLOW_20_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyAssertion1107); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDataPropertyAssertion();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_70, 35));
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyAssertion1121); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDataPropertyAssertion();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_46, 36));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 36));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 36));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_47, 36));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3026:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3027:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyAssertion1139);
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
              					completedElement(a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_62, 37));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 37));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 37));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3050:2: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyExpression )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3051:3: a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyAssertion1161);
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
              					completedElement(a3_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a3_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_63, 38));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3072:2: (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3073:3: a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyAssertion1183);
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
              					completedElement(a4_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a4_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_44, 39));
              	
            }
            a5=(Token)match(input,17,FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyAssertion1201); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDataPropertyAssertion();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_4, 40));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_5, 40));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_6, 40));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_7, 40));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_8, 40));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_9, 40));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_10, 40));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_11, 40));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_12, 40));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_13, 40));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_14, 40));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_15, 40));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_16, 40));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_17, 40));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_18, 40));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_19, 40));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_20, 40));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_21, 40));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_22, 40));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_23, 40));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyAssertion_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyAssertion"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassAssertion"
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3127:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassAssertion returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassAssertion element = null] : a0= 'Type' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) a4= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassAssertion parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassAssertion() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassAssertion element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassAssertion_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a4=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.Individual a2_0 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassExpression a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return element; }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3130:1: (a0= 'Type' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) a4= ')' )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3131:2: a0= 'Type' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) a4= ')'
            {
            a0=(Token)match(input,21,FOLLOW_21_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassAssertion1230); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createClassAssertion();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_71, 41));
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassAssertion1244); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createClassAssertion();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_46, 42));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 42));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 42));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_47, 42));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3158:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3159:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassAssertion1262);
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
              					completedElement(a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_25, 43));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 43));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 43));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_27, 43));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_28, 43));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_29, 43));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_30, 43));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_31, 43));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_32, 43));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_33, 43));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_34, 43));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_35, 43));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_36, 43));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_37, 43));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3193:2: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3194:3: a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassAssertion1284);
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
              					completedElement(a3_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a3_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_24, 44));
              	
            }
            a4=(Token)match(input,17,FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassAssertion1302); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createClassAssertion();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_4, 45));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_5, 45));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_6, 45));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_7, 45));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_8, 45));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_9, 45));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_10, 45));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_11, 45));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_12, 45));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_13, 45));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_14, 45));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_15, 45));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_16, 45));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_17, 45));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_18, 45));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_19, 45));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_20, 45));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_21, 45));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_22, 45));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_23, 45));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassAssertion_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassAssertion"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SameIndividual"
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3248:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SameIndividual returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.SameIndividual element = null] : a0= 'SameAs' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) )+ a4= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.SameIndividual parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SameIndividual() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.SameIndividual element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SameIndividual_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a4=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.Individual a2_0 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.Individual a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return element; }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3251:1: (a0= 'SameAs' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) )+ a4= ')' )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3252:2: a0= 'SameAs' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) )+ a4= ')'
            {
            a0=(Token)match(input,22,FOLLOW_22_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SameIndividual1331); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createSameIndividual();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_72, 46));
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SameIndividual1345); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createSameIndividual();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_46, 47));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 47));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 47));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_47, 47));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3279:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3280:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SameIndividual1363);
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
              					completedElement(a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_46, 48));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 48));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 48));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_47, 48));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3304:2: ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=FULLIRI && LA5_0<=NODE)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3305:3: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual )
            	    {
            	    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3305:3: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual )
            	    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3306:4: a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual
            	    {
            	    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SameIndividual1390);
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
            	      						completedElement(a3_0);
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

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_46, 49));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 49));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 49));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_47, 49));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_73, 49));
              	
            }
            a4=(Token)match(input,17,FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SameIndividual1416); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createSameIndividual();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_4, 50));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_5, 50));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_6, 50));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_7, 50));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_8, 50));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_9, 50));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_10, 50));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_11, 50));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_12, 50));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_13, 50));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_14, 50));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_15, 50));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_16, 50));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_17, 50));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_18, 50));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_19, 50));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_20, 50));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_21, 50));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_22, 50));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_23, 50));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SameIndividual_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SameIndividual"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DifferentIndividuals"
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3365:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DifferentIndividuals returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.DifferentIndividuals element = null] : a0= 'DifferentFrom' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) )+ a4= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.DifferentIndividuals parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DifferentIndividuals() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.DifferentIndividuals element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DifferentIndividuals_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a4=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.Individual a2_0 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.Individual a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return element; }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3368:1: (a0= 'DifferentFrom' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) )+ a4= ')' )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3369:2: a0= 'DifferentFrom' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) )+ a4= ')'
            {
            a0=(Token)match(input,23,FOLLOW_23_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DifferentIndividuals1445); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDifferentIndividuals();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_74, 51));
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DifferentIndividuals1459); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDifferentIndividuals();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_46, 52));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 52));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 52));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_47, 52));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3396:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3397:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DifferentIndividuals1477);
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
              					completedElement(a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_46, 53));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 53));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 53));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_47, 53));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3421:2: ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=FULLIRI && LA6_0<=NODE)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3422:3: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual )
            	    {
            	    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3422:3: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual )
            	    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3423:4: a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual
            	    {
            	    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DifferentIndividuals1504);
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
            	      						completedElement(a3_0);
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

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_46, 54));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 54));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 54));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_47, 54));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_75, 54));
              	
            }
            a4=(Token)match(input,17,FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DifferentIndividuals1530); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDifferentIndividuals();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_4, 55));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_5, 55));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_6, 55));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_7, 55));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_8, 55));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_9, 55));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_10, 55));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_11, 55));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_12, 55));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_13, 55));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_14, 55));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_15, 55));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_16, 55));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_17, 55));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_18, 55));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_19, 55));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_20, 55));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_21, 55));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_22, 55));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_23, 55));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DifferentIndividuals_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DifferentIndividuals"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentClasses"
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3482:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentClasses returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.EquivalentClasses element = null] : a0= 'EquivalentTo' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )+ a4= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.EquivalentClasses parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentClasses() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.EquivalentClasses element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentClasses_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a4=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassExpression a2_0 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassExpression a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return element; }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3485:1: (a0= 'EquivalentTo' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )+ a4= ')' )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3486:2: a0= 'EquivalentTo' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )+ a4= ')'
            {
            a0=(Token)match(input,24,FOLLOW_24_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentClasses1559); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createEquivalentClasses();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_76, 56));
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentClasses1573); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createEquivalentClasses();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_25, 57));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 57));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 57));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_27, 57));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_28, 57));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_29, 57));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_30, 57));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_31, 57));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_32, 57));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_33, 57));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_34, 57));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_35, 57));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_36, 57));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_37, 57));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3523:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3524:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentClasses1591);
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
              					completedElement(a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_25, 58));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 58));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 58));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_27, 58));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_28, 58));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_29, 58));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_30, 58));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_31, 58));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_32, 58));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_33, 58));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_34, 58));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_35, 58));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_36, 58));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_37, 58));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3558:2: ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=FULLIRI && LA7_0<=VARIABLE)||(LA7_0>=27 && LA7_0<=36)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3559:3: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression )
            	    {
            	    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3559:3: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression )
            	    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3560:4: a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression
            	    {
            	    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentClasses1618);
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
            	      						completedElement(a3_0);
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

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_25, 59));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 59));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 59));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_27, 59));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_28, 59));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_29, 59));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_30, 59));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_31, 59));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_32, 59));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_33, 59));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_34, 59));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_35, 59));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_36, 59));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_37, 59));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_77, 59));
              	
            }
            a4=(Token)match(input,17,FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentClasses1644); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createEquivalentClasses();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_4, 60));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_5, 60));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_6, 60));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_7, 60));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_8, 60));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_9, 60));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_10, 60));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_11, 60));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_12, 60));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_13, 60));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_14, 60));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_15, 60));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_16, 60));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_17, 60));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_18, 60));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_19, 60));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_20, 60));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_21, 60));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_22, 60));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_23, 60));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentClasses_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentClasses"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubClassOf"
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3629:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubClassOf returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.SubClassOf element = null] : a0= 'SubClassOf' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) a4= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.SubClassOf parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubClassOf() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.SubClassOf element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubClassOf_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a4=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassExpression a2_0 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassExpression a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return element; }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3632:1: (a0= 'SubClassOf' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) a4= ')' )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3633:2: a0= 'SubClassOf' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) a4= ')'
            {
            a0=(Token)match(input,25,FOLLOW_25_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubClassOf1673); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createSubClassOf();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_78, 61));
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubClassOf1687); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createSubClassOf();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_25, 62));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 62));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 62));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_27, 62));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_28, 62));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_29, 62));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_30, 62));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_31, 62));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_32, 62));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_33, 62));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_34, 62));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_35, 62));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_36, 62));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_37, 62));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3670:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3671:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubClassOf1705);
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
              					completedElement(a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_25, 63));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 63));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 63));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_27, 63));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_28, 63));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_29, 63));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_30, 63));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_31, 63));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_32, 63));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_33, 63));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_34, 63));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_35, 63));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_36, 63));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_37, 63));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3705:2: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3706:3: a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubClassOf1727);
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
              					completedElement(a3_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a3_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_79, 64));
              	
            }
            a4=(Token)match(input,17,FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubClassOf1745); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createSubClassOf();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_4, 65));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_5, 65));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_6, 65));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_7, 65));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_8, 65));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_9, 65));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_10, 65));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_11, 65));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_12, 65));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_13, 65));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_14, 65));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_15, 65));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_16, 65));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_17, 65));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_18, 65));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_19, 65));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_20, 65));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_21, 65));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_22, 65));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_23, 65));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 24, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubClassOf_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubClassOf"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DisjointClasses"
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3760:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DisjointClasses returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.DisjointClasses element = null] : a0= 'DisjointWith' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )+ a4= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.DisjointClasses parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DisjointClasses() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.DisjointClasses element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DisjointClasses_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a4=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassExpression a2_0 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassExpression a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return element; }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3763:1: (a0= 'DisjointWith' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )+ a4= ')' )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3764:2: a0= 'DisjointWith' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )+ a4= ')'
            {
            a0=(Token)match(input,26,FOLLOW_26_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DisjointClasses1774); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDisjointClasses();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_80, 66));
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DisjointClasses1788); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDisjointClasses();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_25, 67));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 67));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 67));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_27, 67));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_28, 67));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_29, 67));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_30, 67));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_31, 67));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_32, 67));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_33, 67));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_34, 67));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_35, 67));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_36, 67));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_37, 67));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3801:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3802:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DisjointClasses1806);
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
              					completedElement(a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_25, 68));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 68));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 68));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_27, 68));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_28, 68));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_29, 68));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_30, 68));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_31, 68));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_32, 68));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_33, 68));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_34, 68));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_35, 68));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_36, 68));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_37, 68));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3836:2: ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=FULLIRI && LA8_0<=VARIABLE)||(LA8_0>=27 && LA8_0<=36)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3837:3: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression )
            	    {
            	    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3837:3: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression )
            	    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3838:4: a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression
            	    {
            	    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DisjointClasses1833);
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
            	      						completedElement(a3_0);
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

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_25, 69));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 69));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 69));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_27, 69));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_28, 69));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_29, 69));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_30, 69));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_31, 69));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_32, 69));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_33, 69));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_34, 69));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_35, 69));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_36, 69));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_37, 69));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_81, 69));
              	
            }
            a4=(Token)match(input,17,FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DisjointClasses1859); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDisjointClasses();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_4, 70));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_5, 70));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_6, 70));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_7, 70));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_8, 70));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_9, 70));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_10, 70));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_11, 70));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_12, 70));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_13, 70));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_14, 70));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_15, 70));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_16, 70));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_17, 70));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_18, 70));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_19, 70));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_20, 70));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_21, 70));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_22, 70));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_23, 70));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DisjointClasses_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DisjointClasses"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectUnionOf"
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3907:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectUnionOf returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectUnionOf element = null] : a0= 'Or' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )+ a4= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectUnionOf parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectUnionOf() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectUnionOf element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectUnionOf_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a4=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassExpression a2_0 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassExpression a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return element; }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3910:1: (a0= 'Or' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )+ a4= ')' )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3911:2: a0= 'Or' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )+ a4= ')'
            {
            a0=(Token)match(input,27,FOLLOW_27_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectUnionOf1888); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectUnionOf();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_82, 71));
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectUnionOf1902); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectUnionOf();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_25, 72));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 72));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 72));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_27, 72));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_28, 72));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_29, 72));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_30, 72));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_31, 72));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_32, 72));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_33, 72));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_34, 72));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_35, 72));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_36, 72));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_37, 72));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3948:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3949:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectUnionOf1920);
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
              					completedElement(a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_25, 73));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 73));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 73));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_27, 73));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_28, 73));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_29, 73));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_30, 73));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_31, 73));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_32, 73));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_33, 73));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_34, 73));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_35, 73));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_36, 73));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_37, 73));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3983:2: ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=FULLIRI && LA9_0<=VARIABLE)||(LA9_0>=27 && LA9_0<=36)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3984:3: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression )
            	    {
            	    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3984:3: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression )
            	    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:3985:4: a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression
            	    {
            	    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectUnionOf1947);
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
            	      						completedElement(a3_0);
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

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_25, 74));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 74));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 74));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_27, 74));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_28, 74));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_29, 74));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_30, 74));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_31, 74));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_32, 74));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_33, 74));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_34, 74));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_35, 74));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_36, 74));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_37, 74));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_83, 74));
              	
            }
            a4=(Token)match(input,17,FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectUnionOf1973); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectUnionOf();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_24, 75));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_25, 75));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 75));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 75));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_27, 75));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_28, 75));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_29, 75));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_30, 75));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_31, 75));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_32, 75));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_33, 75));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_34, 75));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_35, 75));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_36, 75));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_37, 75));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_38, 75));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_39, 75));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_40, 75));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_41, 75));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_42, 75));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_43, 75));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 26, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectUnionOf_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectUnionOf"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectComplementOf"
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4055:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectComplementOf returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectComplementOf element = null] : a0= 'Not' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) a3= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectComplementOf parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectComplementOf() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectComplementOf element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectComplementOf_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a3=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassExpression a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return element; }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4058:1: (a0= 'Not' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) a3= ')' )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4059:2: a0= 'Not' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) a3= ')'
            {
            a0=(Token)match(input,28,FOLLOW_28_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectComplementOf2002); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectComplementOf();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_84, 76));
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectComplementOf2016); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectComplementOf();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_25, 77));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 77));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 77));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_27, 77));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_28, 77));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_29, 77));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_30, 77));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_31, 77));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_32, 77));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_33, 77));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_34, 77));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_35, 77));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_36, 77));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_37, 77));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4096:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4097:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectComplementOf2034);
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
              					completedElement(a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_38, 78));
              	
            }
            a3=(Token)match(input,17,FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectComplementOf2052); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectComplementOf();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_24, 79));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_25, 79));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 79));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 79));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_27, 79));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_28, 79));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_29, 79));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_30, 79));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_31, 79));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_32, 79));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_33, 79));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_34, 79));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_35, 79));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_36, 79));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_37, 79));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_38, 79));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_39, 79));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_40, 79));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_41, 79));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_42, 79));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_43, 79));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectComplementOf_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectComplementOf"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectOneOf"
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4152:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectOneOf returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectOneOf element = null] : a0= 'OneOf' a1= '(' ( (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) )+ a3= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectOneOf parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectOneOf() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectOneOf element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectOneOf_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a3=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.Individual a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return element; }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4155:1: (a0= 'OneOf' a1= '(' ( (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) )+ a3= ')' )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4156:2: a0= 'OneOf' a1= '(' ( (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) )+ a3= ')'
            {
            a0=(Token)match(input,29,FOLLOW_29_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectOneOf2081); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectOneOf();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_85, 80));
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectOneOf2095); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectOneOf();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_46, 81));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 81));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 81));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_47, 81));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4183:2: ( (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=FULLIRI && LA10_0<=NODE)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4184:3: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual )
            	    {
            	    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4184:3: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual )
            	    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4185:4: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual
            	    {
            	    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectOneOf2118);
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
            	      						completedElement(a2_0);
            	      					}
            	      					collectHiddenTokens(element);
            	      					copyLocalizationInfos(a2_0, element); 				}
            	      			
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

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_46, 82));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 82));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 82));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_47, 82));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_55, 82));
              	
            }
            a3=(Token)match(input,17,FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectOneOf2144); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectOneOf();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_24, 83));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_25, 83));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 83));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 83));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_27, 83));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_28, 83));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_29, 83));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_30, 83));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_31, 83));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_32, 83));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_33, 83));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_34, 83));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_35, 83));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_36, 83));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_37, 83));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_38, 83));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_39, 83));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_40, 83));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_41, 83));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_42, 83));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_43, 83));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 28, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectOneOf_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectOneOf"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectIntersectionOf"
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4245:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectIntersectionOf returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectIntersectionOf element = null] : a0= 'And' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )+ a4= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectIntersectionOf parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectIntersectionOf() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectIntersectionOf element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectIntersectionOf_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a4=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassExpression a2_0 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassExpression a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return element; }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4248:1: (a0= 'And' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )+ a4= ')' )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4249:2: a0= 'And' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )+ a4= ')'
            {
            a0=(Token)match(input,30,FOLLOW_30_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectIntersectionOf2173); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectIntersectionOf();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_86, 84));
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectIntersectionOf2187); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectIntersectionOf();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_25, 85));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 85));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 85));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_27, 85));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_28, 85));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_29, 85));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_30, 85));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_31, 85));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_32, 85));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_33, 85));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_34, 85));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_35, 85));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_36, 85));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_37, 85));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4286:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4287:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectIntersectionOf2205);
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
              					completedElement(a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_25, 86));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 86));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 86));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_27, 86));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_28, 86));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_29, 86));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_30, 86));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_31, 86));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_32, 86));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_33, 86));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_34, 86));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_35, 86));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_36, 86));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_37, 86));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4321:2: ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=FULLIRI && LA11_0<=VARIABLE)||(LA11_0>=27 && LA11_0<=36)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4322:3: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression )
            	    {
            	    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4322:3: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression )
            	    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4323:4: a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression
            	    {
            	    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectIntersectionOf2232);
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
            	      						completedElement(a3_0);
            	      					}
            	      					collectHiddenTokens(element);
            	      					copyLocalizationInfos(a3_0, element); 				}
            	      			
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

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_25, 87));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 87));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 87));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_27, 87));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_28, 87));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_29, 87));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_30, 87));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_31, 87));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_32, 87));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_33, 87));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_34, 87));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_35, 87));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_36, 87));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_37, 87));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_87, 87));
              	
            }
            a4=(Token)match(input,17,FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectIntersectionOf2258); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectIntersectionOf();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_24, 88));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_25, 88));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 88));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 88));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_27, 88));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_28, 88));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_29, 88));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_30, 88));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_31, 88));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_32, 88));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_33, 88));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_34, 88));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_35, 88));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_36, 88));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_37, 88));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_38, 88));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_39, 88));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_40, 88));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_41, 88));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_42, 88));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_43, 88));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 29, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectIntersectionOf_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectIntersectionOf"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectAllValuesFrom"
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4393:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectAllValuesFrom returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectAllValuesFrom element = null] : a0= 'All' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) a4= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectAllValuesFrom parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectAllValuesFrom() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectAllValuesFrom element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectAllValuesFrom_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a4=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyExpression a2_0 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassExpression a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return element; }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4396:1: (a0= 'All' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) a4= ')' )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4397:2: a0= 'All' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) a4= ')'
            {
            a0=(Token)match(input,31,FOLLOW_31_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectAllValuesFrom2287); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectAllValuesFrom();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_88, 89));
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectAllValuesFrom2301); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectAllValuesFrom();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_48, 90));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 90));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 90));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_49, 90));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4424:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4425:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectAllValuesFrom2319);
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
              					completedElement(a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_25, 91));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 91));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 91));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_27, 91));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_28, 91));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_29, 91));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_30, 91));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_31, 91));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_32, 91));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_33, 91));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_34, 91));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_35, 91));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_36, 91));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_37, 91));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4459:2: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4460:3: a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectAllValuesFrom2341);
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
              					completedElement(a3_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a3_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_39, 92));
              	
            }
            a4=(Token)match(input,17,FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectAllValuesFrom2359); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectAllValuesFrom();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_24, 93));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_25, 93));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 93));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 93));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_27, 93));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_28, 93));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_29, 93));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_30, 93));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_31, 93));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_32, 93));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_33, 93));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_34, 93));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_35, 93));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_36, 93));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_37, 93));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_38, 93));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_39, 93));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_40, 93));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_41, 93));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_42, 93));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_43, 93));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 30, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectAllValuesFrom_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectAllValuesFrom"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectSomeValuesFrom"
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4515:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectSomeValuesFrom returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectSomeValuesFrom element = null] : a0= 'Some' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) a4= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectSomeValuesFrom parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectSomeValuesFrom() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectSomeValuesFrom element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectSomeValuesFrom_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a4=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyExpression a2_0 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassExpression a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return element; }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4518:1: (a0= 'Some' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) a4= ')' )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4519:2: a0= 'Some' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) a4= ')'
            {
            a0=(Token)match(input,32,FOLLOW_32_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectSomeValuesFrom2388); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectSomeValuesFrom();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_89, 94));
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectSomeValuesFrom2402); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectSomeValuesFrom();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_48, 95));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 95));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 95));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_49, 95));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4546:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4547:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectSomeValuesFrom2420);
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
              					completedElement(a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_25, 96));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 96));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 96));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_27, 96));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_28, 96));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_29, 96));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_30, 96));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_31, 96));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_32, 96));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_33, 96));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_34, 96));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_35, 96));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_36, 96));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_37, 96));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4581:2: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4582:3: a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectSomeValuesFrom2442);
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
              					completedElement(a3_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a3_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_40, 97));
              	
            }
            a4=(Token)match(input,17,FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectSomeValuesFrom2460); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectSomeValuesFrom();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_24, 98));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_25, 98));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 98));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 98));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_27, 98));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_28, 98));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_29, 98));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_30, 98));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_31, 98));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_32, 98));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_33, 98));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_34, 98));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_35, 98));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_36, 98));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_37, 98));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_38, 98));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_39, 98));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_40, 98));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_41, 98));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_42, 98));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_43, 98));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 31, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectSomeValuesFrom_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectSomeValuesFrom"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectHasValue"
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4637:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectHasValue returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectHasValue element = null] : a0= 'Has' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) a4= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectHasValue parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectHasValue() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectHasValue element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectHasValue_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a4=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyExpression a2_0 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.Individual a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return element; }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4640:1: (a0= 'Has' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) a4= ')' )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4641:2: a0= 'Has' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual ) a4= ')'
            {
            a0=(Token)match(input,33,FOLLOW_33_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectHasValue2489); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectHasValue();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_90, 99));
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectHasValue2503); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectHasValue();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_48, 100));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 100));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 100));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_49, 100));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4668:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4669:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectHasValue2521);
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
              					completedElement(a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_46, 101));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 101));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 101));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_47, 101));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4693:2: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4694:3: a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectHasValue2543);
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
              					completedElement(a3_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a3_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_65, 102));
              	
            }
            a4=(Token)match(input,17,FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectHasValue2561); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectHasValue();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_24, 103));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_25, 103));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 103));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 103));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_27, 103));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_28, 103));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_29, 103));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_30, 103));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_31, 103));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_32, 103));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_33, 103));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_34, 103));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_35, 103));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_36, 103));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_37, 103));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_38, 103));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_39, 103));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_40, 103));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_41, 103));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_42, 103));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_43, 103));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 32, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectHasValue_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectHasValue"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMinCardinality"
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4749:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMinCardinality returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectMinCardinality element = null] : a0= 'Min' a1= '(' (a2= INTEGER ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) ( (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )? a5= ')' ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return element; }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4752:1: (a0= 'Min' a1= '(' (a2= INTEGER ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) ( (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )? a5= ')' )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4753:2: a0= 'Min' a1= '(' (a2= INTEGER ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) ( (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )? a5= ')'
            {
            a0=(Token)match(input,34,FOLLOW_34_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMinCardinality2590); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectMinCardinality();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_91, 104));
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMinCardinality2604); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectMinCardinality();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_92, 105));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4777:2: (a2= INTEGER )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4778:3: a2= INTEGER
            {
            a2=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMinCardinality2622); if (state.failed) return element;
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
              					completedElement(resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_48, 106));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 106));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 106));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_49, 106));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4813:2: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4814:3: a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMinCardinality2647);
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
              					completedElement(a3_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a3_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_25, 107));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 107));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 107));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_27, 107));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_28, 107));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_29, 107));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_30, 107));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_31, 107));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_32, 107));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_33, 107));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_34, 107));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_35, 107));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_36, 107));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_37, 107));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_41, 107));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4849:2: ( (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=FULLIRI && LA12_0<=VARIABLE)||(LA12_0>=27 && LA12_0<=36)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4850:3: (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression )
                    {
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4850:3: (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression )
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4851:4: a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMinCardinality2674);
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
                      						completedElement(a4_0);
                      					}
                      					collectHiddenTokens(element);
                      					copyLocalizationInfos(a4_0, element); 				}
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_41, 108));
              	
            }
            a5=(Token)match(input,17,FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMinCardinality2700); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectMinCardinality();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_24, 109));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_25, 109));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 109));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 109));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_27, 109));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_28, 109));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_29, 109));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_30, 109));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_31, 109));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_32, 109));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_33, 109));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_34, 109));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_35, 109));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_36, 109));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_37, 109));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_38, 109));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_39, 109));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_40, 109));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_41, 109));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_42, 109));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_43, 109));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 33, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMinCardinality_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMinCardinality"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMaxCardinality"
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4907:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMaxCardinality returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectMaxCardinality element = null] : a0= 'Max' a1= '(' (a2= INTEGER ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) ( (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )? a5= ')' ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return element; }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4910:1: (a0= 'Max' a1= '(' (a2= INTEGER ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) ( (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )? a5= ')' )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4911:2: a0= 'Max' a1= '(' (a2= INTEGER ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) ( (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )? a5= ')'
            {
            a0=(Token)match(input,35,FOLLOW_35_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMaxCardinality2729); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectMaxCardinality();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_93, 110));
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMaxCardinality2743); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectMaxCardinality();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_94, 111));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4935:2: (a2= INTEGER )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4936:3: a2= INTEGER
            {
            a2=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMaxCardinality2761); if (state.failed) return element;
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
              					completedElement(resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_48, 112));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 112));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 112));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_49, 112));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4971:2: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:4972:3: a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMaxCardinality2786);
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
              					completedElement(a3_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a3_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_25, 113));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 113));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 113));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_27, 113));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_28, 113));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_29, 113));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_30, 113));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_31, 113));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_32, 113));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_33, 113));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_34, 113));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_35, 113));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_36, 113));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_37, 113));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_42, 113));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5007:2: ( (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=FULLIRI && LA13_0<=VARIABLE)||(LA13_0>=27 && LA13_0<=36)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5008:3: (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression )
                    {
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5008:3: (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression )
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5009:4: a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMaxCardinality2813);
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
                      						completedElement(a4_0);
                      					}
                      					collectHiddenTokens(element);
                      					copyLocalizationInfos(a4_0, element); 				}
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_42, 114));
              	
            }
            a5=(Token)match(input,17,FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMaxCardinality2839); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectMaxCardinality();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_24, 115));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_25, 115));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 115));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 115));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_27, 115));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_28, 115));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_29, 115));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_30, 115));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_31, 115));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_32, 115));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_33, 115));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_34, 115));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_35, 115));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_36, 115));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_37, 115));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_38, 115));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_39, 115));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_40, 115));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_41, 115));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_42, 115));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_43, 115));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 34, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMaxCardinality_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMaxCardinality"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectExactCardinality"
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5065:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectExactCardinality returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectExactCardinality element = null] : a0= 'Exact' a1= '(' (a2= INTEGER ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) ( (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )? a5= ')' ;
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return element; }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5068:1: (a0= 'Exact' a1= '(' (a2= INTEGER ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) ( (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )? a5= ')' )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5069:2: a0= 'Exact' a1= '(' (a2= INTEGER ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) ( (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )? a5= ')'
            {
            a0=(Token)match(input,36,FOLLOW_36_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectExactCardinality2868); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectExactCardinality();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_95, 116));
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectExactCardinality2882); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectExactCardinality();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_96, 117));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5093:2: (a2= INTEGER )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5094:3: a2= INTEGER
            {
            a2=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectExactCardinality2900); if (state.failed) return element;
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
              					completedElement(resolved);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_48, 118));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 118));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 118));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_49, 118));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5129:2: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5130:3: a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectExactCardinality2925);
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
              					completedElement(a3_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a3_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_25, 119));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 119));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 119));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_27, 119));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_28, 119));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_29, 119));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_30, 119));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_31, 119));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_32, 119));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_33, 119));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_34, 119));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_35, 119));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_36, 119));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_37, 119));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_43, 119));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5165:2: ( (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=FULLIRI && LA14_0<=VARIABLE)||(LA14_0>=27 && LA14_0<=36)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5166:3: (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression )
                    {
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5166:3: (a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression )
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5167:4: a4_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectExactCardinality2952);
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
                      						completedElement(a4_0);
                      					}
                      					collectHiddenTokens(element);
                      					copyLocalizationInfos(a4_0, element); 				}
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_43, 120));
              	
            }
            a5=(Token)match(input,17,FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectExactCardinality2978); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectExactCardinality();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_24, 121));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_25, 121));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 121));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 121));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_27, 121));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_28, 121));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_29, 121));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_30, 121));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_31, 121));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_32, 121));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_33, 121));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_34, 121));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_35, 121));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_36, 121));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_37, 121));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_38, 121));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_39, 121));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_40, 121));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_41, 121));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_42, 121));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_43, 121));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 35, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectExactCardinality_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectExactCardinality"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataHasValue"
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5223:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataHasValue returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataHasValue element = null] : a0= 'Has' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyExpression ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal ) a4= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataHasValue parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataHasValue() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataHasValue element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataHasValue_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a4=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyExpression a2_0 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.Literal a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return element; }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5226:1: (a0= 'Has' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyExpression ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal ) a4= ')' )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5227:2: a0= 'Has' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyExpression ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal ) a4= ')'
            {
            a0=(Token)match(input,33,FOLLOW_33_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataHasValue3007); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDataHasValue();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_97, 122));
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataHasValue3021); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDataHasValue();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_62, 123));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 123));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 123));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5253:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyExpression )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5254:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataHasValue3039);
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
              					completedElement(a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_63, 124));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5275:2: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5276:3: a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataHasValue3061);
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
              					completedElement(a3_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a3_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_45, 125));
              	
            }
            a4=(Token)match(input,17,FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataHasValue3079); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDataHasValue();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_24, 126));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_25, 126));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 126));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 126));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_27, 126));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_28, 126));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_29, 126));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_30, 126));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_31, 126));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_32, 126));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_33, 126));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_34, 126));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_35, 126));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_36, 126));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_37, 126));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_38, 126));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_39, 126));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_40, 126));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_41, 126));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_42, 126));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_43, 126));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 36, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataHasValue_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataHasValue"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentObjectProperties"
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5331:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentObjectProperties returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.EquivalentObjectProperties element = null] : a0= 'EquivalentProperty' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) )+ a4= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.EquivalentObjectProperties parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentObjectProperties() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.EquivalentObjectProperties element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentObjectProperties_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a4=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyExpression a2_0 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyExpression a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return element; }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5334:1: (a0= 'EquivalentProperty' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) )+ a4= ')' )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5335:2: a0= 'EquivalentProperty' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) )+ a4= ')'
            {
            a0=(Token)match(input,37,FOLLOW_37_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentObjectProperties3108); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createEquivalentObjectProperties();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_98, 127));
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentObjectProperties3122); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createEquivalentObjectProperties();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_48, 128));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 128));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 128));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_49, 128));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5362:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5363:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentObjectProperties3140);
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
              					completedElement(a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_48, 129));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 129));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 129));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_49, 129));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5387:2: ( (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=FULLIRI && LA15_0<=VARIABLE)||LA15_0==39) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5388:3: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression )
            	    {
            	    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5388:3: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression )
            	    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5389:4: a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression
            	    {
            	    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentObjectProperties3167);
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
            	      						completedElement(a3_0);
            	      					}
            	      					collectHiddenTokens(element);
            	      					copyLocalizationInfos(a3_0, element); 				}
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_48, 130));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 130));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 130));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_49, 130));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_99, 130));
              	
            }
            a4=(Token)match(input,17,FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentObjectProperties3193); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createEquivalentObjectProperties();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_4, 131));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_5, 131));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_6, 131));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_7, 131));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_8, 131));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_9, 131));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_10, 131));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_11, 131));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_12, 131));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_13, 131));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_14, 131));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_15, 131));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_16, 131));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_17, 131));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_18, 131));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_19, 131));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_20, 131));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_21, 131));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_22, 131));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_23, 131));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 37, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentObjectProperties_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentObjectProperties"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubPropertyOf"
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5448:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubPropertyOf returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.SubPropertyOf element = null] : a0= 'SubPropertyOf' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) a4= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.SubPropertyOf parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubPropertyOf() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.SubPropertyOf element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubPropertyOf_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a4=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyExpression a2_0 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyExpression a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return element; }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5451:1: (a0= 'SubPropertyOf' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) a4= ')' )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5452:2: a0= 'SubPropertyOf' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) a4= ')'
            {
            a0=(Token)match(input,38,FOLLOW_38_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubPropertyOf3222); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createSubPropertyOf();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_100, 132));
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubPropertyOf3236); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createSubPropertyOf();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_48, 133));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 133));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 133));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_49, 133));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5479:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5480:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubPropertyOf3254);
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
              					completedElement(a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_48, 134));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 134));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 134));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_49, 134));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5504:2: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5505:3: a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubPropertyOf3276);
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
              					completedElement(a3_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a3_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_101, 135));
              	
            }
            a4=(Token)match(input,17,FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubPropertyOf3294); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createSubPropertyOf();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_4, 136));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_5, 136));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_6, 136));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_7, 136));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_8, 136));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_9, 136));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_10, 136));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_11, 136));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_12, 136));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_13, 136));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_14, 136));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_15, 136));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_16, 136));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_17, 136));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_18, 136));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_19, 136));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_20, 136));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_21, 136));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_22, 136));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_23, 136));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 38, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubPropertyOf_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubPropertyOf"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectPropertyAtom"
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5559:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectPropertyAtom returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseObjectPropertyAtom element = null] : a0= 'InverseOf' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) a4= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseObjectPropertyAtom parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectPropertyAtom() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseObjectPropertyAtom element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectPropertyAtom_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a4=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyExpression a2_0 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyExpression a3_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return element; }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5562:1: (a0= 'InverseOf' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) a4= ')' )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5563:2: a0= 'InverseOf' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) a4= ')'
            {
            a0=(Token)match(input,39,FOLLOW_39_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectPropertyAtom3323); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createInverseObjectPropertyAtom();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_102, 137));
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectPropertyAtom3337); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createInverseObjectPropertyAtom();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_48, 138));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 138));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 138));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_49, 138));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5590:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5591:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectPropertyAtom3355);
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
              					completedElement(a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_48, 139));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 139));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 139));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_49, 139));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5615:2: (a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5616:3: a3_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectPropertyAtom3377);
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
              					completedElement(a3_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a3_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_103, 140));
              	
            }
            a4=(Token)match(input,17,FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectPropertyAtom3395); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createInverseObjectPropertyAtom();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_4, 141));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_5, 141));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_6, 141));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_7, 141));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_8, 141));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_9, 141));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_10, 141));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_11, 141));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_12, 141));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_13, 141));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_14, 141));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_15, 141));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_16, 141));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_17, 141));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_18, 141));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_19, 141));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_20, 141));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_21, 141));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_22, 141));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_23, 141));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 39, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectPropertyAtom_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectPropertyAtom"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FunctionalObjectProperty"
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5670:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FunctionalObjectProperty returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.FunctionalObjectProperty element = null] : a0= 'Functional' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) a3= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.FunctionalObjectProperty parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FunctionalObjectProperty() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.FunctionalObjectProperty element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FunctionalObjectProperty_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a3=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyExpression a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return element; }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5673:1: (a0= 'Functional' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) a3= ')' )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5674:2: a0= 'Functional' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) a3= ')'
            {
            a0=(Token)match(input,40,FOLLOW_40_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FunctionalObjectProperty3424); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createFunctionalObjectProperty();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_104, 142));
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FunctionalObjectProperty3438); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createFunctionalObjectProperty();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_48, 143));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 143));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 143));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_49, 143));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5701:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5702:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FunctionalObjectProperty3456);
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
              					completedElement(a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_50, 144));
              	
            }
            a3=(Token)match(input,17,FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FunctionalObjectProperty3474); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createFunctionalObjectProperty();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_4, 145));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_5, 145));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_6, 145));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_7, 145));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_8, 145));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_9, 145));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_10, 145));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_11, 145));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_12, 145));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_13, 145));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_14, 145));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_15, 145));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_16, 145));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_17, 145));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_18, 145));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_19, 145));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_20, 145));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_21, 145));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_22, 145));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_23, 145));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 40, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FunctionalObjectProperty_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FunctionalObjectProperty"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseFunctionalObjectProperty"
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5756:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseFunctionalObjectProperty returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseFunctionalObjectProperty element = null] : a0= 'InverseFunctional' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) a3= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseFunctionalObjectProperty parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseFunctionalObjectProperty() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseFunctionalObjectProperty element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseFunctionalObjectProperty_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a3=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyExpression a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return element; }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5759:1: (a0= 'InverseFunctional' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) a3= ')' )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5760:2: a0= 'InverseFunctional' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) a3= ')'
            {
            a0=(Token)match(input,41,FOLLOW_41_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseFunctionalObjectProperty3503); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createInverseFunctionalObjectProperty();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_105, 146));
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseFunctionalObjectProperty3517); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createInverseFunctionalObjectProperty();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_48, 147));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 147));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 147));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_49, 147));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5787:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5788:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseFunctionalObjectProperty3535);
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
              					completedElement(a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_51, 148));
              	
            }
            a3=(Token)match(input,17,FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseFunctionalObjectProperty3553); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createInverseFunctionalObjectProperty();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_4, 149));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_5, 149));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_6, 149));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_7, 149));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_8, 149));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_9, 149));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_10, 149));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_11, 149));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_12, 149));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_13, 149));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_14, 149));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_15, 149));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_16, 149));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_17, 149));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_18, 149));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_19, 149));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_20, 149));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_21, 149));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_22, 149));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_23, 149));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 41, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseFunctionalObjectProperty_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseFunctionalObjectProperty"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_TransitiveObjectProperty"
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5842:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_TransitiveObjectProperty returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.TransitiveObjectProperty element = null] : a0= 'Transitive' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) a3= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.TransitiveObjectProperty parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_TransitiveObjectProperty() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.TransitiveObjectProperty element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_TransitiveObjectProperty_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a3=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyExpression a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return element; }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5845:1: (a0= 'Transitive' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) a3= ')' )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5846:2: a0= 'Transitive' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) a3= ')'
            {
            a0=(Token)match(input,42,FOLLOW_42_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_TransitiveObjectProperty3582); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createTransitiveObjectProperty();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_106, 150));
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_TransitiveObjectProperty3596); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createTransitiveObjectProperty();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_48, 151));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 151));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 151));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_49, 151));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5873:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5874:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_TransitiveObjectProperty3614);
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
              					completedElement(a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_52, 152));
              	
            }
            a3=(Token)match(input,17,FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_TransitiveObjectProperty3632); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createTransitiveObjectProperty();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_4, 153));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_5, 153));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_6, 153));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_7, 153));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_8, 153));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_9, 153));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_10, 153));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_11, 153));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_12, 153));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_13, 153));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_14, 153));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_15, 153));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_16, 153));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_17, 153));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_18, 153));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_19, 153));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_20, 153));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_21, 153));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_22, 153));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_23, 153));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 42, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_TransitiveObjectProperty_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_TransitiveObjectProperty"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SymmetricObjectProperty"
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5928:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SymmetricObjectProperty returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.SymmetricObjectProperty element = null] : a0= 'Symmetric' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) a3= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.SymmetricObjectProperty parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SymmetricObjectProperty() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.SymmetricObjectProperty element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SymmetricObjectProperty_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a3=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyExpression a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return element; }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5931:1: (a0= 'Symmetric' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) a3= ')' )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5932:2: a0= 'Symmetric' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) a3= ')'
            {
            a0=(Token)match(input,43,FOLLOW_43_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SymmetricObjectProperty3661); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createSymmetricObjectProperty();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_107, 154));
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SymmetricObjectProperty3675); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createSymmetricObjectProperty();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_48, 155));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 155));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 155));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_49, 155));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5959:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:5960:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SymmetricObjectProperty3693);
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
              					completedElement(a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_53, 156));
              	
            }
            a3=(Token)match(input,17,FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SymmetricObjectProperty3711); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createSymmetricObjectProperty();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_4, 157));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_5, 157));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_6, 157));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_7, 157));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_8, 157));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_9, 157));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_10, 157));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_11, 157));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_12, 157));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_13, 157));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_14, 157));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_15, 157));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_16, 157));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_17, 157));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_18, 157));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_19, 157));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_20, 157));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_21, 157));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_22, 157));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_23, 157));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 43, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SymmetricObjectProperty_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SymmetricObjectProperty"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectProperty"
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6014:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectProperty returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseObjectProperty element = null] : a0= 'InverseOf' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) a3= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseObjectProperty parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectProperty() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseObjectProperty element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectProperty_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a3=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyExpression a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return element; }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6017:1: (a0= 'InverseOf' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) a3= ')' )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6018:2: a0= 'InverseOf' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression ) a3= ')'
            {
            a0=(Token)match(input,39,FOLLOW_39_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectProperty3740); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createInverseObjectProperty();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_108, 158));
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectProperty3754); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createInverseObjectProperty();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_48, 159));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 159));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 159));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_49, 159));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6045:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6046:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectProperty3772);
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
              					completedElement(a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_54, 160));
              	
            }
            a3=(Token)match(input,17,FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectProperty3790); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createInverseObjectProperty();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_46, 161));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_2, 161));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_26, 161));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_47, 161));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_25, 161));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_27, 161));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_28, 161));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_29, 161));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_30, 161));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_31, 161));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_32, 161));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_33, 161));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_34, 161));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_35, 161));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_36, 161));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_37, 161));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_41, 161));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_42, 161));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_43, 161));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_48, 161));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_49, 161));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_50, 161));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_51, 161));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_52, 161));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_53, 161));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_54, 161));
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 44, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectProperty_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectProperty"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyDeclaration"
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6106:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyDeclaration returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyDeclaration element = null] : a0= 'ObjectProperty' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyVariable ) a3= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyDeclaration parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyDeclaration() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyDeclaration element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyDeclaration_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a3=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyVariable a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return element; }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6109:1: (a0= 'ObjectProperty' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyVariable ) a3= ')' )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6110:2: a0= 'ObjectProperty' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyVariable ) a3= ')'
            {
            a0=(Token)match(input,44,FOLLOW_44_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyDeclaration3819); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectPropertyDeclaration();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_109, 162));
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyDeclaration3833); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectPropertyDeclaration();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_48, 163));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6134:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyVariable )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6135:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyVariable
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyVariable_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyDeclaration3851);
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
              					completedElement(a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_61, 164));
              	
            }
            a3=(Token)match(input,17,FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyDeclaration3869); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectPropertyDeclaration();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_4, 165));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_5, 165));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_6, 165));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_7, 165));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_8, 165));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_9, 165));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_10, 165));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_11, 165));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_12, 165));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_13, 165));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_14, 165));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_15, 165));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_16, 165));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_17, 165));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_18, 165));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_19, 165));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_20, 165));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_21, 165));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_22, 165));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_23, 165));
              	
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
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6189:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DatatypePropertyDeclaration returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.DatatypePropertyDeclaration element = null] : a0= 'DatatypeProperty' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyVariable ) a3= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.DatatypePropertyDeclaration parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DatatypePropertyDeclaration() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.DatatypePropertyDeclaration element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DatatypePropertyDeclaration_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a3=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyVariable a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return element; }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6192:1: (a0= 'DatatypeProperty' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyVariable ) a3= ')' )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6193:2: a0= 'DatatypeProperty' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyVariable ) a3= ')'
            {
            a0=(Token)match(input,45,FOLLOW_45_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DatatypePropertyDeclaration3898); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDatatypePropertyDeclaration();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_110, 166));
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DatatypePropertyDeclaration3912); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDatatypePropertyDeclaration();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_62, 167));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6217:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyVariable )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6218:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyVariable
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyVariable_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DatatypePropertyDeclaration3930);
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
              					completedElement(a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_64, 168));
              	
            }
            a3=(Token)match(input,17,FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DatatypePropertyDeclaration3948); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDatatypePropertyDeclaration();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_4, 169));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_5, 169));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_6, 169));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_7, 169));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_8, 169));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_9, 169));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_10, 169));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_11, 169));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_12, 169));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_13, 169));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_14, 169));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_15, 169));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_16, 169));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_17, 169));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_18, 169));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_19, 169));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_20, 169));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_21, 169));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_22, 169));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_23, 169));
              	
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
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6272:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualDeclaration returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.IndividualDeclaration element = null] : a0= 'Individual' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualVariable ) a3= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.IndividualDeclaration parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualDeclaration() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.IndividualDeclaration element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualDeclaration_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a3=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.IndividualVariable a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return element; }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6275:1: (a0= 'Individual' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualVariable ) a3= ')' )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6276:2: a0= 'Individual' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualVariable ) a3= ')'
            {
            a0=(Token)match(input,46,FOLLOW_46_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualDeclaration3977); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createIndividualDeclaration();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_111, 170));
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualDeclaration3991); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createIndividualDeclaration();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_46, 171));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6300:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualVariable )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6301:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualVariable
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualVariable_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualDeclaration4009);
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
              					completedElement(a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_66, 172));
              	
            }
            a3=(Token)match(input,17,FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualDeclaration4027); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createIndividualDeclaration();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_4, 173));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_5, 173));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_6, 173));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_7, 173));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_8, 173));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_9, 173));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_10, 173));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_11, 173));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_12, 173));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_13, 173));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_14, 173));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_15, 173));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_16, 173));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_17, 173));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_18, 173));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_19, 173));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_20, 173));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_21, 173));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_22, 173));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_23, 173));
              	
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
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6355:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassDeclaration returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassDeclaration element = null] : a0= 'Class' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassVariable ) a3= ')' ;
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassDeclaration parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassDeclaration() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassDeclaration element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassDeclaration_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a3=null;
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassVariable a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return element; }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6358:1: (a0= 'Class' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassVariable ) a3= ')' )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6359:2: a0= 'Class' a1= '(' (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassVariable ) a3= ')'
            {
            a0=(Token)match(input,47,FOLLOW_47_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassDeclaration4056); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createClassDeclaration();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_112, 174));
              	
            }
            a1=(Token)match(input,15,FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassDeclaration4070); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createClassDeclaration();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_25, 175));
              	
            }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6383:2: (a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassVariable )
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6384:3: a2_0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassVariable
            {
            pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassVariable_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassDeclaration4088);
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
              					completedElement(a2_0);
              				}
              				collectHiddenTokens(element);
              				copyLocalizationInfos(a2_0, element); 			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_60, 176));
              	
            }
            a3=(Token)match(input,17,FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassDeclaration4106); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createClassDeclaration();
              		}
              		collectHiddenTokens(element);
              		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_4, 177));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_5, 177));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_6, 177));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_7, 177));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_8, 177));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_9, 177));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_10, 177));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_11, 177));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_12, 177));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_13, 177));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_14, 177));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_15, 177));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_16, 177));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_17, 177));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_18, 177));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_19, 177));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_20, 177));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_21, 177));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_22, 177));
              		addExpectedElement(new de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp.SparqlasExpectedTerminal(TERMINAL_23, 177));
              	
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
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6438:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.IRI element = null] : (c0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FullIRI | c1= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AbbreviatedIRI );
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.IRI parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.IRI element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI_StartIndex = input.index();
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.FullIRI c0 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.AbbreviatedIRI c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return element; }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6439:1: (c0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FullIRI | c1= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AbbreviatedIRI )
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
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6440:2: c0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FullIRI
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FullIRI_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI4131);
                    c0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FullIRI();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 2 :
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6441:4: c1= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AbbreviatedIRI
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AbbreviatedIRI_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI4141);
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
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6445:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.Atom element = null] : (c0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyAssertion | c1= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyAssertion | c2= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassAssertion | c3= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SameIndividual | c4= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DifferentIndividuals | c5= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentClasses | c6= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubClassOf | c7= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DisjointClasses | c8= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentObjectProperties | c9= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubPropertyOf | c10= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectPropertyAtom | c11= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FunctionalObjectProperty | c12= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseFunctionalObjectProperty | c13= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_TransitiveObjectProperty | c14= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SymmetricObjectProperty | c15= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyDeclaration | c16= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DatatypePropertyDeclaration | c17= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualDeclaration | c18= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassDeclaration );
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.Atom parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.Atom element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom_StartIndex = input.index();
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyAssertion c0 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyAssertion c1 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassAssertion c2 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.SameIndividual c3 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.DifferentIndividuals c4 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.EquivalentClasses c5 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.SubClassOf c6 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.DisjointClasses c7 = null;

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
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6446:1: (c0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyAssertion | c1= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyAssertion | c2= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassAssertion | c3= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SameIndividual | c4= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DifferentIndividuals | c5= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentClasses | c6= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubClassOf | c7= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DisjointClasses | c8= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentObjectProperties | c9= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubPropertyOf | c10= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectPropertyAtom | c11= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FunctionalObjectProperty | c12= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseFunctionalObjectProperty | c13= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_TransitiveObjectProperty | c14= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SymmetricObjectProperty | c15= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyDeclaration | c16= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DatatypePropertyDeclaration | c17= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualDeclaration | c18= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassDeclaration )
            int alt17=19;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6447:2: c0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyAssertion
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyAssertion_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4162);
                    c0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyAssertion();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 2 :
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6448:4: c1= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyAssertion
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyAssertion_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4172);
                    c1=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyAssertion();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 3 :
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6449:4: c2= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassAssertion
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassAssertion_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4182);
                    c2=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassAssertion();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c2; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 4 :
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6450:4: c3= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SameIndividual
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SameIndividual_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4192);
                    c3=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SameIndividual();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c3; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 5 :
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6451:4: c4= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DifferentIndividuals
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DifferentIndividuals_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4202);
                    c4=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DifferentIndividuals();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c4; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 6 :
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6452:4: c5= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentClasses
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentClasses_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4212);
                    c5=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentClasses();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c5; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 7 :
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6453:4: c6= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubClassOf
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubClassOf_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4222);
                    c6=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubClassOf();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c6; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 8 :
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6454:4: c7= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DisjointClasses
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DisjointClasses_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4232);
                    c7=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DisjointClasses();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c7; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 9 :
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6455:4: c8= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentObjectProperties
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentObjectProperties_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4242);
                    c8=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentObjectProperties();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c8; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 10 :
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6456:4: c9= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubPropertyOf
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubPropertyOf_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4252);
                    c9=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubPropertyOf();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c9; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 11 :
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6457:4: c10= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectPropertyAtom
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectPropertyAtom_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4262);
                    c10=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectPropertyAtom();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c10; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 12 :
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6458:4: c11= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FunctionalObjectProperty
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FunctionalObjectProperty_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4272);
                    c11=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FunctionalObjectProperty();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c11; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 13 :
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6459:4: c12= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseFunctionalObjectProperty
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseFunctionalObjectProperty_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4282);
                    c12=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseFunctionalObjectProperty();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c12; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 14 :
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6460:4: c13= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_TransitiveObjectProperty
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_TransitiveObjectProperty_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4292);
                    c13=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_TransitiveObjectProperty();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c13; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 15 :
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6461:4: c14= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SymmetricObjectProperty
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SymmetricObjectProperty_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4302);
                    c14=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SymmetricObjectProperty();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c14; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 16 :
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6462:4: c15= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyDeclaration
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyDeclaration_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4312);
                    c15=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyDeclaration();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c15; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 17 :
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6463:4: c16= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DatatypePropertyDeclaration
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DatatypePropertyDeclaration_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4322);
                    c16=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DatatypePropertyDeclaration();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c16; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 18 :
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6464:4: c17= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualDeclaration
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualDeclaration_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4332);
                    c17=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualDeclaration();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c17; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 19 :
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6465:4: c18= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassDeclaration
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassDeclaration_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4342);
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


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual"
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6469:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.Individual element = null] : (c0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualVariable | c1= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_NamedIndividual | c2= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AnonymousIndividual );
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.Individual parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.Individual element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual_StartIndex = input.index();
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.IndividualVariable c0 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.NamedIndividual c1 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.AnonymousIndividual c2 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return element; }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6470:1: (c0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualVariable | c1= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_NamedIndividual | c2= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AnonymousIndividual )
            int alt18=3;
            switch ( input.LA(1) ) {
            case VARIABLE:
                {
                alt18=1;
                }
                break;
            case FULLIRI:
            case ABBRIRI:
                {
                alt18=2;
                }
                break;
            case NODE:
                {
                alt18=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6471:2: c0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualVariable
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualVariable_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual4363);
                    c0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualVariable();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 2 :
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6472:4: c1= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_NamedIndividual
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_NamedIndividual_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual4373);
                    c1=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_NamedIndividual();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 3 :
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6473:4: c2= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AnonymousIndividual
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AnonymousIndividual_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual4383);
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
            if ( state.backtracking>0 ) { memoize(input, 51, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression"
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6477:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyExpression element = null] : (c0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyVariable | c1= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectProperty | c2= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectProperty );
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyExpression parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyExpression element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_StartIndex = input.index();
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyVariable c0 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectProperty c1 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseObjectProperty c2 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return element; }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6478:1: (c0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyVariable | c1= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectProperty | c2= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectProperty )
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
            case 39:
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
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6479:2: c0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyVariable
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyVariable_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression4404);
                    c0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyVariable();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 2 :
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6480:4: c1= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectProperty
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectProperty_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression4414);
                    c1=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectProperty();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 3 :
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6481:4: c2= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectProperty
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectProperty_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression4424);
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
            if ( state.backtracking>0 ) { memoize(input, 52, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyExpression"
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6485:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyExpression returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyExpression element = null] : (c0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyVariable | c1= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataProperty );
    public final de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyExpression parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyExpression() throws RecognitionException {
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyExpression element =  null;
        int parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyExpression_StartIndex = input.index();
        de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyVariable c0 = null;

        de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataProperty c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return element; }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6486:1: (c0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyVariable | c1= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataProperty )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==VARIABLE) ) {
                alt20=1;
            }
            else if ( ((LA20_0>=FULLIRI && LA20_0<=ABBRIRI)) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6487:2: c0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyVariable
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyVariable_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyExpression4445);
                    c0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyVariable();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 2 :
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6488:4: c1= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataProperty
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataProperty_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyExpression4455);
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
            if ( state.backtracking>0 ) { memoize(input, 53, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyExpression_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyExpression"


    // $ANTLR start "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression"
    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6492:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassExpression element = null] : (c0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassVariable | c1= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Class | c2= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectUnionOf | c3= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectComplementOf | c4= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectOneOf | c5= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectIntersectionOf | c6= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectAllValuesFrom | c7= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectSomeValuesFrom | c8= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectHasValue | c9= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMinCardinality | c10= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMaxCardinality | c11= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectExactCardinality | c12= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataHasValue );
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
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return element; }
            // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6493:1: (c0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassVariable | c1= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Class | c2= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectUnionOf | c3= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectComplementOf | c4= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectOneOf | c5= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectIntersectionOf | c6= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectAllValuesFrom | c7= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectSomeValuesFrom | c8= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectHasValue | c9= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMinCardinality | c10= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMaxCardinality | c11= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectExactCardinality | c12= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataHasValue )
            int alt21=13;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6494:2: c0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassVariable
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassVariable_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression4476);
                    c0=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassVariable();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 2 :
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6495:4: c1= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Class
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Class_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression4486);
                    c1=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Class();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 3 :
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6496:4: c2= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectUnionOf
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectUnionOf_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression4496);
                    c2=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectUnionOf();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c2; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 4 :
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6497:4: c3= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectComplementOf
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectComplementOf_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression4506);
                    c3=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectComplementOf();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c3; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 5 :
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6498:4: c4= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectOneOf
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectOneOf_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression4516);
                    c4=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectOneOf();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c4; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 6 :
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6499:4: c5= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectIntersectionOf
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectIntersectionOf_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression4526);
                    c5=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectIntersectionOf();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c5; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 7 :
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6500:4: c6= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectAllValuesFrom
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectAllValuesFrom_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression4536);
                    c6=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectAllValuesFrom();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c6; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 8 :
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6501:4: c7= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectSomeValuesFrom
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectSomeValuesFrom_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression4546);
                    c7=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectSomeValuesFrom();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c7; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 9 :
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6502:4: c8= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectHasValue
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectHasValue_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression4556);
                    c8=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectHasValue();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c8; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 10 :
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6503:4: c9= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMinCardinality
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMinCardinality_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression4566);
                    c9=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMinCardinality();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c9; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 11 :
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6504:4: c10= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMaxCardinality
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMaxCardinality_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression4576);
                    c10=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMaxCardinality();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c10; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 12 :
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6505:4: c11= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectExactCardinality
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectExactCardinality_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression4586);
                    c11=parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectExactCardinality();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c11; /* this is a subclass choice */ 
                    }

                    }
                    break;
                case 13 :
                    // C:\\svn-client\\intern\\twouse\\workspaces\\twouse-toolkit\\de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas\\src-gen\\de\\uniko\\isweb\\emftext\\sparqlas\\SPARQLAS\\resource\\sparqlas\\mopp\\Sparqlas.g:6506:4: c12= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataHasValue
                    {
                    pushFollow(FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataHasValue_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression4596);
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
            if ( state.backtracking>0 ) { memoize(input, 54, parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression"

    // Delegated rules


    protected DFA17 dfa17 = new DFA17(this);
    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA17_eotS =
        "\35\uffff";
    static final String DFA17_eofS =
        "\35\uffff";
    static final String DFA17_minS =
        "\1\24\1\17\21\uffff\10\4\2\uffff";
    static final String DFA17_maxS =
        "\1\57\1\17\21\uffff\1\7\4\47\3\10\2\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
        "\1\17\1\20\1\21\1\22\1\23\10\uffff\1\1\1\2";
    static final String DFA17_specialS =
        "\35\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\12\uffff\1\10\1\11\1\12\1\13\1"+
            "\14\1\15\1\16\1\17\1\20\1\21\1\22",
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
            "",
            "",
            "",
            "\1\25\1\26\1\24\1\27",
            "\1\31\1\32\1\30\40\uffff\1\33",
            "\1\31\1\32\1\30\40\uffff\1\33",
            "\1\31\1\32\1\30\40\uffff\1\33",
            "\1\31\1\32\1\30\40\uffff\1\33",
            "\4\33\1\34",
            "\4\33\1\34",
            "\4\33\1\34",
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
            return "6445:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.Atom element = null] : (c0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyAssertion | c1= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyAssertion | c2= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassAssertion | c3= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SameIndividual | c4= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DifferentIndividuals | c5= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentClasses | c6= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubClassOf | c7= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DisjointClasses | c8= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentObjectProperties | c9= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubPropertyOf | c10= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectPropertyAtom | c11= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FunctionalObjectProperty | c12= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseFunctionalObjectProperty | c13= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_TransitiveObjectProperty | c14= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SymmetricObjectProperty | c15= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyDeclaration | c16= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DatatypePropertyDeclaration | c17= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualDeclaration | c18= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassDeclaration );";
        }
    }
    static final String DFA21_eotS =
        "\23\uffff";
    static final String DFA21_eofS =
        "\23\uffff";
    static final String DFA21_minS =
        "\1\4\10\uffff\1\17\3\uffff\4\4\2\uffff";
    static final String DFA21_maxS =
        "\1\44\10\uffff\1\17\3\uffff\1\47\3\10\2\uffff";
    static final String DFA21_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\12\1\13\1\14"+
        "\4\uffff\1\11\1\15";
    static final String DFA21_specialS =
        "\23\uffff}>";
    static final String[] DFA21_transitionS = {
            "\2\2\1\1\24\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
            "\14",
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
            "\1\17\1\20\1\16\40\uffff\1\21",
            "\4\21\1\22",
            "\4\21\1\22",
            "\4\21\1\22",
            "",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "6492:1: parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassExpression element = null] : (c0= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassVariable | c1= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Class | c2= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectUnionOf | c3= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectComplementOf | c4= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectOneOf | c5= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectIntersectionOf | c6= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectAllValuesFrom | c7= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectSomeValuesFrom | c8= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectHasValue | c9= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMinCardinality | c10= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMaxCardinality | c11= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectExactCardinality | c12= parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataHasValue );";
        }
    }
 

    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_OntologyDocument_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FULLIRI_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FullIRI116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ABBRIRI_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AbbreviatedIRI156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_OntologyDocument201 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Query_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_OntologyDocument231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition264 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition278 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_ABBRIRI_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition301 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition331 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FullIRI_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition349 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Query396 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Query410 = new BitSet(new long[]{0x0000FFE007F20030L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Query433 = new BitSet(new long[]{0x0000FFE007F20000L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Query468 = new BitSet(new long[]{0x0000FFE007F20000L});
    public static final BitSet FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Query494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassVariable527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyVariable567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyVariable607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualVariable647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Class687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Datatype724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectProperty761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataProperty798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_NamedIndividual835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NODE_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AnonymousIndividual872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LITERAL_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal912 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal933 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Datatype_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyAssertion984 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyAssertion998 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyAssertion1016 = new BitSet(new long[]{0x0000008000000070L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyAssertion1038 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyAssertion1060 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyAssertion1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyAssertion1107 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyAssertion1121 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyAssertion1139 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyAssertion1161 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyAssertion1183 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyAssertion1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassAssertion1230 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassAssertion1244 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassAssertion1262 = new BitSet(new long[]{0x0000001FF8000070L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassAssertion1284 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassAssertion1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SameIndividual1331 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SameIndividual1345 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SameIndividual1363 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SameIndividual1390 = new BitSet(new long[]{0x00000000000200F0L});
    public static final BitSet FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SameIndividual1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DifferentIndividuals1445 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DifferentIndividuals1459 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DifferentIndividuals1477 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DifferentIndividuals1504 = new BitSet(new long[]{0x00000000000200F0L});
    public static final BitSet FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DifferentIndividuals1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentClasses1559 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentClasses1573 = new BitSet(new long[]{0x0000001FF8000070L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentClasses1591 = new BitSet(new long[]{0x0000001FF8000070L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentClasses1618 = new BitSet(new long[]{0x0000001FF8020070L});
    public static final BitSet FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentClasses1644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubClassOf1673 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubClassOf1687 = new BitSet(new long[]{0x0000001FF8000070L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubClassOf1705 = new BitSet(new long[]{0x0000001FF8000070L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubClassOf1727 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubClassOf1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DisjointClasses1774 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DisjointClasses1788 = new BitSet(new long[]{0x0000001FF8000070L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DisjointClasses1806 = new BitSet(new long[]{0x0000001FF8000070L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DisjointClasses1833 = new BitSet(new long[]{0x0000001FF8020070L});
    public static final BitSet FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DisjointClasses1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectUnionOf1888 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectUnionOf1902 = new BitSet(new long[]{0x0000001FF8000070L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectUnionOf1920 = new BitSet(new long[]{0x0000001FF8000070L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectUnionOf1947 = new BitSet(new long[]{0x0000001FF8020070L});
    public static final BitSet FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectUnionOf1973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectComplementOf2002 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectComplementOf2016 = new BitSet(new long[]{0x0000001FF8000070L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectComplementOf2034 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectComplementOf2052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectOneOf2081 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectOneOf2095 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectOneOf2118 = new BitSet(new long[]{0x00000000000200F0L});
    public static final BitSet FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectOneOf2144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectIntersectionOf2173 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectIntersectionOf2187 = new BitSet(new long[]{0x0000001FF8000070L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectIntersectionOf2205 = new BitSet(new long[]{0x0000001FF8000070L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectIntersectionOf2232 = new BitSet(new long[]{0x0000001FF8020070L});
    public static final BitSet FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectIntersectionOf2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectAllValuesFrom2287 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectAllValuesFrom2301 = new BitSet(new long[]{0x0000008000000070L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectAllValuesFrom2319 = new BitSet(new long[]{0x0000001FF8000070L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectAllValuesFrom2341 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectAllValuesFrom2359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectSomeValuesFrom2388 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectSomeValuesFrom2402 = new BitSet(new long[]{0x0000008000000070L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectSomeValuesFrom2420 = new BitSet(new long[]{0x0000001FF8000070L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectSomeValuesFrom2442 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectSomeValuesFrom2460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectHasValue2489 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectHasValue2503 = new BitSet(new long[]{0x0000008000000070L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectHasValue2521 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectHasValue2543 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectHasValue2561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMinCardinality2590 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMinCardinality2604 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_INTEGER_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMinCardinality2622 = new BitSet(new long[]{0x0000008000000070L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMinCardinality2647 = new BitSet(new long[]{0x0000001FF8020070L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMinCardinality2674 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMinCardinality2700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMaxCardinality2729 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMaxCardinality2743 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_INTEGER_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMaxCardinality2761 = new BitSet(new long[]{0x0000008000000070L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMaxCardinality2786 = new BitSet(new long[]{0x0000001FF8020070L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMaxCardinality2813 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMaxCardinality2839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectExactCardinality2868 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectExactCardinality2882 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_INTEGER_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectExactCardinality2900 = new BitSet(new long[]{0x0000008000000070L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectExactCardinality2925 = new BitSet(new long[]{0x0000001FF8020070L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectExactCardinality2952 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectExactCardinality2978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataHasValue3007 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataHasValue3021 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataHasValue3039 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataHasValue3061 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataHasValue3079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentObjectProperties3108 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentObjectProperties3122 = new BitSet(new long[]{0x0000008000000070L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentObjectProperties3140 = new BitSet(new long[]{0x0000008000000070L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentObjectProperties3167 = new BitSet(new long[]{0x0000008000020070L});
    public static final BitSet FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentObjectProperties3193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubPropertyOf3222 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubPropertyOf3236 = new BitSet(new long[]{0x0000008000000070L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubPropertyOf3254 = new BitSet(new long[]{0x0000008000000070L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubPropertyOf3276 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubPropertyOf3294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectPropertyAtom3323 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectPropertyAtom3337 = new BitSet(new long[]{0x0000008000000070L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectPropertyAtom3355 = new BitSet(new long[]{0x0000008000000070L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectPropertyAtom3377 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectPropertyAtom3395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FunctionalObjectProperty3424 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FunctionalObjectProperty3438 = new BitSet(new long[]{0x0000008000000070L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FunctionalObjectProperty3456 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FunctionalObjectProperty3474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseFunctionalObjectProperty3503 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseFunctionalObjectProperty3517 = new BitSet(new long[]{0x0000008000000070L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseFunctionalObjectProperty3535 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseFunctionalObjectProperty3553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_TransitiveObjectProperty3582 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_TransitiveObjectProperty3596 = new BitSet(new long[]{0x0000008000000070L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_TransitiveObjectProperty3614 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_TransitiveObjectProperty3632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SymmetricObjectProperty3661 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SymmetricObjectProperty3675 = new BitSet(new long[]{0x0000008000000070L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SymmetricObjectProperty3693 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SymmetricObjectProperty3711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectProperty3740 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectProperty3754 = new BitSet(new long[]{0x0000008000000070L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectProperty3772 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectProperty3790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyDeclaration3819 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyDeclaration3833 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyVariable_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyDeclaration3851 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyDeclaration3869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DatatypePropertyDeclaration3898 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DatatypePropertyDeclaration3912 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyVariable_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DatatypePropertyDeclaration3930 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DatatypePropertyDeclaration3948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualDeclaration3977 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualDeclaration3991 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualVariable_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualDeclaration4009 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualDeclaration4027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassDeclaration4056 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassDeclaration4070 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassVariable_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassDeclaration4088 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassDeclaration4106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FullIRI_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI4131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AbbreviatedIRI_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI4141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyAssertion_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyAssertion_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassAssertion_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SameIndividual_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DifferentIndividuals_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentClasses_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubClassOf_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DisjointClasses_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentObjectProperties_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubPropertyOf_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectPropertyAtom_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FunctionalObjectProperty_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseFunctionalObjectProperty_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_TransitiveObjectProperty_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SymmetricObjectProperty_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyDeclaration_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DatatypePropertyDeclaration_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualDeclaration_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassDeclaration_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom4342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualVariable_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual4363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_NamedIndividual_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual4373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AnonymousIndividual_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual4383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyVariable_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression4404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectProperty_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression4414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectProperty_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression4424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyVariable_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyExpression4445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataProperty_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyExpression4455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassVariable_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression4476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Class_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression4486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectUnionOf_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression4496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectComplementOf_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression4506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectOneOf_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression4516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectIntersectionOf_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression4526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectAllValuesFrom_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression4536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectSomeValuesFrom_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression4546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectHasValue_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression4556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMinCardinality_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression4566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMaxCardinality_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression4576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectExactCardinality_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression4586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataHasValue_in_parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression4596 = new BitSet(new long[]{0x0000000000000002L});

}