// $ANTLR ${project.version} ${buildNumber}

	package west.twouse.language.yuml.resource.yuml.mopp;


import org.antlr.runtime3_2_0.*;
import java.util.HashMap;
@SuppressWarnings("unused")
public class YumlParser extends YumlANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALPHANUM", "TEXT", "CARDINALITY", "VISIBILITY", "WHITESPACE", "LINEBREAKS", "','", "'['", "'<<'", "'>>'", "'|'", "';'", "'{bg:'", "'}'", "']'", "'<'", "'-'", "'>'", "'^'", "'..'", "' : '", "'('", "')'", "'[note: '"
    };
    public static final int VISIBILITY=7;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int WHITESPACE=8;
    public static final int TEXT=5;
    public static final int LINEBREAKS=9;
    public static final int EOF=-1;
    public static final int ALPHANUM=4;
    public static final int CARDINALITY=6;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;

    // delegates
    // delegators


        public YumlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public YumlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[46+1];
             
             
        }
        

    public String[] getTokenNames() { return YumlParser.tokenNames; }
    public String getGrammarFileName() { return "Yuml.g"; }


    	private west.twouse.language.yuml.resource.yuml.IYumlTokenResolverFactory tokenResolverFactory = new west.twouse.language.yuml.resource.yuml.mopp.YumlTokenResolverFactory();
    	
    	/**
    	 * the index of the last token that was handled by collectHiddenTokens()
    	 */
    	private int lastPosition;
    	
    	/**
    	 * the index of the last token that was handled by retrieveLayoutInformation()
    	 */
    	private int lastPosition2;
    	
    	private west.twouse.language.yuml.resource.yuml.mopp.YumlTokenResolveResult tokenResolveResult = new west.twouse.language.yuml.resource.yuml.mopp.YumlTokenResolveResult();
    	
    	/**
    	 * A flag that indicates whether the parser should remember all expected elements.
    	 * This flag is set to true when using the parse for code completion. Otherwise it
    	 * is set to false.
    	 */
    	private boolean rememberExpectedElements = false;
    	
    	private Object parseToIndexTypeObject;
    	private int lastTokenIndex = 0;
    	
    	/**
    	 * A list of expected elements the were collected while parsing the input stream.
    	 * This list is only filled if <code>rememberExpectedElements</code> is set to
    	 * true.
    	 */
    	private java.util.List<west.twouse.language.yuml.resource.yuml.mopp.YumlExpectedTerminal> expectedElements = new java.util.ArrayList<west.twouse.language.yuml.resource.yuml.mopp.YumlExpectedTerminal>();
    	
    	private int mismatchedTokenRecoveryTries = 0;
    	private java.util.Map<?, ?> options;
    	/**
    	 * A helper list to allow a lexer to pass errors to its parser
    	 */
    	protected java.util.List<org.antlr.runtime3_2_0.RecognitionException> lexerExceptions = java.util.Collections.synchronizedList(new java.util.ArrayList<org.antlr.runtime3_2_0.RecognitionException>());
    	
    	/**
    	 * Another helper list to allow a lexer to pass positions of errors to its parser
    	 */
    	protected java.util.List<Integer> lexerExceptionsPosition = java.util.Collections.synchronizedList(new java.util.ArrayList<Integer>());
    	
    	/**
    	 * A stack for incomplete objects. This stack is used filled when the parser is
    	 * used for code completion. Whenever the parser starts to read an object it is
    	 * pushed on the stack. Once the element was parser completely it is popped from
    	 * the stack.
    	 */
    	protected java.util.Stack<org.eclipse.emf.ecore.EObject> incompleteObjects = new java.util.Stack<org.eclipse.emf.ecore.EObject>();
    	
    	private int stopIncludingHiddenTokens;
    	private int stopExcludingHiddenTokens;
    	/**
    	 * A collection that is filled with commands to be executed after parsing. This
    	 * collection is cleared before parsing starts and returned as part of the parse
    	 * result object.
    	 */
    	private java.util.Collection<west.twouse.language.yuml.resource.yuml.IYumlCommand<west.twouse.language.yuml.resource.yuml.IYumlTextResource>> postParseCommands;
    	
    	/**
    	 * A flag to indicate that the parser should stop parsing as soon as possible. The
    	 * flag is set to false before parsing starts. It can be set to true by invoking
    	 * the terminateParsing() method from another thread. This feature is used, when
    	 * documents are parsed in the background (i.e., while editing them). In order to
    	 * cancel running parsers, the parsing process can be terminated. This is done
    	 * whenever a document changes, because the previous content of the document is
    	 * not valid anymore and parsing the old content is not necessary any longer.
    	 */
    	private boolean terminateParsing;
    	
    	private int tokenIndexOfLastCompleteElement;
    	
    	private int expectedElementsIndexOfLastCompleteElement;
    	
    	/**
    	 * a collection to store all anonymous tokens
    	 */
    	private java.util.List<org.antlr.runtime3_2_0.CommonToken> anonymousTokens = new java.util.ArrayList<org.antlr.runtime3_2_0.CommonToken>();
    	
    	/**
    	 * The offset indicating the cursor position when the parser is used for code
    	 * completion by calling parseToExpectedElements().
    	 */
    	private int cursorOffset;
    	
    	/**
    	 * The offset of the first hidden token of the last expected element. This offset
    	 * is used to discard expected elements, which are not needed for code completion.
    	 */
    	private int lastStartIncludingHidden;
    	
    	protected void addErrorToResource(final String errorMessage, final int line, final int charPositionInLine, final int startIndex, final int stopIndex) {
    		postParseCommands.add(new west.twouse.language.yuml.resource.yuml.IYumlCommand<west.twouse.language.yuml.resource.yuml.IYumlTextResource>() {
    			public boolean execute(west.twouse.language.yuml.resource.yuml.IYumlTextResource resource) {
    				if (resource == null) {
    					// the resource can be null if the parser is used for code completion
    					return true;
    				}
    				resource.addProblem(new west.twouse.language.yuml.resource.yuml.IYumlProblem() {
    					public west.twouse.language.yuml.resource.yuml.YumlEProblemType getType() {
    						return west.twouse.language.yuml.resource.yuml.YumlEProblemType.ERROR;
    					}
    					public String getMessage() {
    						return errorMessage;
    					}
    					public java.util.Collection<west.twouse.language.yuml.resource.yuml.IYumlQuickFix> getQuickFixes() {
    						return null;
    					}
    				}, line, charPositionInLine, startIndex, stopIndex);
    				return true;
    			}
    		});
    	}
    	
    	public void addExpectedElement(west.twouse.language.yuml.resource.yuml.IYumlExpectedElement terminal, int followSetID, org.eclipse.emf.ecore.EStructuralFeature... containmentTrace) {
    		if (!this.rememberExpectedElements) {
    			return;
    		}
    		west.twouse.language.yuml.resource.yuml.mopp.YumlExpectedTerminal expectedElement = new west.twouse.language.yuml.resource.yuml.mopp.YumlExpectedTerminal(terminal, followSetID, containmentTrace);
    		setPosition(expectedElement, input.index());
    		int startIncludingHiddenTokens = expectedElement.getStartIncludingHiddenTokens();
    		if (lastStartIncludingHidden >= 0 && lastStartIncludingHidden < startIncludingHiddenTokens && cursorOffset > startIncludingHiddenTokens) {
    			// clear list of expected elements
    			this.expectedElements.clear();
    		}
    		lastStartIncludingHidden = startIncludingHiddenTokens;
    		this.expectedElements.add(expectedElement);
    	}
    	
    	protected void addMapEntry(org.eclipse.emf.ecore.EObject element, org.eclipse.emf.ecore.EStructuralFeature structuralFeature, west.twouse.language.yuml.resource.yuml.mopp.YumlDummyEObject dummy) {
    		Object value = element.eGet(structuralFeature);
    		Object mapKey = dummy.getValueByName("key");
    		Object mapValue = dummy.getValueByName("value");
    		if (value instanceof org.eclipse.emf.common.util.EMap<?, ?>) {
    			org.eclipse.emf.common.util.EMap<Object, Object> valueMap = west.twouse.language.yuml.resource.yuml.util.YumlMapUtil.castToEMap(value);
    			if (mapKey != null && mapValue != null) {
    				valueMap.put(mapKey, mapValue);
    			}
    		}
    	}
    	
    	@SuppressWarnings("unchecked")
    	
    	public boolean addObjectToList(org.eclipse.emf.ecore.EObject container, int featureID, Object object) {
    		return ((java.util.List<Object>) container.eGet(container.eClass().getEStructuralFeature(featureID))).add(object);
    	}
    	
    	@SuppressWarnings("unchecked")
    	
    	public boolean addObjectToList(org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EStructuralFeature feature, Object object) {
    		return ((java.util.List<Object>) container.eGet(feature)).add(object);
    	}
    	
    	protected org.eclipse.emf.ecore.EObject apply(org.eclipse.emf.ecore.EObject target, java.util.List<org.eclipse.emf.ecore.EObject> dummyEObjects) {
    		org.eclipse.emf.ecore.EObject currentTarget = target;
    		for (org.eclipse.emf.ecore.EObject object : dummyEObjects) {
    			assert(object instanceof west.twouse.language.yuml.resource.yuml.mopp.YumlDummyEObject);
    			west.twouse.language.yuml.resource.yuml.mopp.YumlDummyEObject dummy = (west.twouse.language.yuml.resource.yuml.mopp.YumlDummyEObject) object;
    			org.eclipse.emf.ecore.EObject newEObject = dummy.applyTo(currentTarget);
    			currentTarget = newEObject;
    		}
    		return currentTarget;
    	}
    	
    	protected void collectHiddenTokens(org.eclipse.emf.ecore.EObject element) {
    	}
    	
    	protected void copyLocalizationInfos(final org.eclipse.emf.ecore.EObject source, final org.eclipse.emf.ecore.EObject target) {
    		postParseCommands.add(new west.twouse.language.yuml.resource.yuml.IYumlCommand<west.twouse.language.yuml.resource.yuml.IYumlTextResource>() {
    			public boolean execute(west.twouse.language.yuml.resource.yuml.IYumlTextResource resource) {
    				west.twouse.language.yuml.resource.yuml.IYumlLocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for code completion
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
    	
    	protected void copyLocalizationInfos(final org.antlr.runtime3_2_0.CommonToken source, final org.eclipse.emf.ecore.EObject target) {
    		postParseCommands.add(new west.twouse.language.yuml.resource.yuml.IYumlCommand<west.twouse.language.yuml.resource.yuml.IYumlTextResource>() {
    			public boolean execute(west.twouse.language.yuml.resource.yuml.IYumlTextResource resource) {
    				west.twouse.language.yuml.resource.yuml.IYumlLocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for code completion
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
    	
    	/**
    	 * Sets the end character index and the last line for the given object in the
    	 * location map.
    	 */
    	protected void setLocalizationEnd(java.util.Collection<west.twouse.language.yuml.resource.yuml.IYumlCommand<west.twouse.language.yuml.resource.yuml.IYumlTextResource>> postParseCommands , final org.eclipse.emf.ecore.EObject object, final int endChar, final int endLine) {
    		postParseCommands.add(new west.twouse.language.yuml.resource.yuml.IYumlCommand<west.twouse.language.yuml.resource.yuml.IYumlTextResource>() {
    			public boolean execute(west.twouse.language.yuml.resource.yuml.IYumlTextResource resource) {
    				west.twouse.language.yuml.resource.yuml.IYumlLocationMap locationMap = resource.getLocationMap();
    				if (locationMap == null) {
    					// the locationMap can be null if the parser is used for code completion
    					return true;
    				}
    				locationMap.setCharEnd(object, endChar);
    				locationMap.setLine(object, endLine);
    				return true;
    			}
    		});
    	}
    	
    	public west.twouse.language.yuml.resource.yuml.IYumlTextParser createInstance(java.io.InputStream actualInputStream, String encoding) {
    		try {
    			if (encoding == null) {
    				return new YumlParser(new org.antlr.runtime3_2_0.CommonTokenStream(new YumlLexer(new org.antlr.runtime3_2_0.ANTLRInputStream(actualInputStream))));
    			} else {
    				return new YumlParser(new org.antlr.runtime3_2_0.CommonTokenStream(new YumlLexer(new org.antlr.runtime3_2_0.ANTLRInputStream(actualInputStream, encoding))));
    			}
    		} catch (java.io.IOException e) {
    			west.twouse.language.yuml.resource.yuml.mopp.YumlPlugin.logError("Error while creating parser.", e);
    			return null;
    		}
    	}
    	
    	/**
    	 * This default constructor is only used to call createInstance() on it.
    	 */
    	public YumlParser() {
    		super(null);
    	}
    	
    	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime3_2_0.RecognitionException {
    		this.lastPosition = 0;
    		// required because the lexer class can not be subclassed
    		((YumlLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
    		((YumlLexer) getTokenStream().getTokenSource()).lexerExceptionsPosition = lexerExceptionsPosition;
    		Object typeObject = getTypeObject();
    		if (typeObject == null) {
    			return start();
    		} else if (typeObject instanceof org.eclipse.emf.ecore.EClass) {
    			org.eclipse.emf.ecore.EClass type = (org.eclipse.emf.ecore.EClass) typeObject;
    			if (type.getInstanceClass() == west.twouse.language.yuml.Model.class) {
    				return parse_west_twouse_language_yuml_Model();
    			}
    			if (type.getInstanceClass() == west.twouse.language.yuml.Class.class) {
    				return parse_west_twouse_language_yuml_Class();
    			}
    			if (type.getInstanceClass() == west.twouse.language.yuml.Association.class) {
    				return parse_west_twouse_language_yuml_Association();
    			}
    			if (type.getInstanceClass() == west.twouse.language.yuml.Inheritance.class) {
    				return parse_west_twouse_language_yuml_Inheritance();
    			}
    			if (type.getInstanceClass() == west.twouse.language.yuml.Cardinality.class) {
    				return parse_west_twouse_language_yuml_Cardinality();
    			}
    			if (type.getInstanceClass() == west.twouse.language.yuml.Attribute.class) {
    				return parse_west_twouse_language_yuml_Attribute();
    			}
    			if (type.getInstanceClass() == west.twouse.language.yuml.Method.class) {
    				return parse_west_twouse_language_yuml_Method();
    			}
    			if (type.getInstanceClass() == west.twouse.language.yuml.Note.class) {
    				return parse_west_twouse_language_yuml_Note();
    			}
    			if (type.getInstanceClass() == west.twouse.language.yuml.Equivalence.class) {
    				return parse_west_twouse_language_yuml_Equivalence();
    			}
    		}
    		throw new west.twouse.language.yuml.resource.yuml.mopp.YumlUnexpectedContentTypeException(typeObject);
    	}
    	
    	private west.twouse.language.yuml.resource.yuml.mopp.YumlTokenResolveResult getFreshTokenResolveResult() {
    		tokenResolveResult.clear();
    		return tokenResolveResult;
    	}
    	
    	public int getMismatchedTokenRecoveryTries() {
    		return mismatchedTokenRecoveryTries;
    	}
    	
    	public Object getMissingSymbol(org.antlr.runtime3_2_0.IntStream arg0, org.antlr.runtime3_2_0.RecognitionException arg1, int arg2, org.antlr.runtime3_2_0.BitSet arg3) {
    		mismatchedTokenRecoveryTries++;
    		return super.getMissingSymbol(arg0, arg1, arg2, arg3);
    	}
    	
    	protected java.util.Map<?,?> getOptions() {
    		return options;
    	}
    	
    	public west.twouse.language.yuml.resource.yuml.mopp.YumlMetaInformation getMetaInformation() {
    		return new west.twouse.language.yuml.resource.yuml.mopp.YumlMetaInformation();
    	}
    	
    	public Object getParseToIndexTypeObject() {
    		return parseToIndexTypeObject;
    	}
    	
    	protected west.twouse.language.yuml.resource.yuml.mopp.YumlReferenceResolverSwitch getReferenceResolverSwitch() {
    		return (west.twouse.language.yuml.resource.yuml.mopp.YumlReferenceResolverSwitch) getMetaInformation().getReferenceResolverSwitch();
    	}
    	
    	protected Object getTypeObject() {
    		Object typeObject = getParseToIndexTypeObject();
    		if (typeObject != null) {
    			return typeObject;
    		}
    		java.util.Map<?,?> options = getOptions();
    		if (options != null) {
    			typeObject = options.get(west.twouse.language.yuml.resource.yuml.IYumlOptions.RESOURCE_CONTENT_TYPE);
    		}
    		return typeObject;
    	}
    	
    	/**
    	 * Implementation that calls {@link #doParse()} and handles the thrown
    	 * RecognitionExceptions.
    	 */
    	public west.twouse.language.yuml.resource.yuml.IYumlParseResult parse() {
    		terminateParsing = false;
    		postParseCommands = new java.util.ArrayList<west.twouse.language.yuml.resource.yuml.IYumlCommand<west.twouse.language.yuml.resource.yuml.IYumlTextResource>>();
    		west.twouse.language.yuml.resource.yuml.mopp.YumlParseResult parseResult = new west.twouse.language.yuml.resource.yuml.mopp.YumlParseResult();
    		try {
    			org.eclipse.emf.ecore.EObject result =  doParse();
    			if (lexerExceptions.isEmpty()) {
    				parseResult.setRoot(result);
    			}
    		} catch (org.antlr.runtime3_2_0.RecognitionException re) {
    			reportError(re);
    		} catch (java.lang.IllegalArgumentException iae) {
    			if ("The 'no null' constraint is violated".equals(iae.getMessage())) {
    				// can be caused if a null is set on EMF models where not allowed. this will just
    				// happen if other errors occurred before
    			} else {
    				iae.printStackTrace();
    			}
    		}
    		for (org.antlr.runtime3_2_0.RecognitionException re : lexerExceptions) {
    			reportLexicalError(re);
    		}
    		parseResult.getPostParseCommands().addAll(postParseCommands);
    		return parseResult;
    	}
    	
    	public java.util.List<west.twouse.language.yuml.resource.yuml.mopp.YumlExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, west.twouse.language.yuml.resource.yuml.IYumlTextResource dummyResource, int cursorOffset) {
    		this.rememberExpectedElements = true;
    		this.parseToIndexTypeObject = type;
    		this.cursorOffset = cursorOffset;
    		this.lastStartIncludingHidden = -1;
    		final org.antlr.runtime3_2_0.CommonTokenStream tokenStream = (org.antlr.runtime3_2_0.CommonTokenStream) getTokenStream();
    		west.twouse.language.yuml.resource.yuml.IYumlParseResult result = parse();
    		for (org.eclipse.emf.ecore.EObject incompleteObject : incompleteObjects) {
    			org.antlr.runtime3_2_0.Lexer lexer = (org.antlr.runtime3_2_0.Lexer) tokenStream.getTokenSource();
    			int endChar = lexer.getCharIndex();
    			int endLine = lexer.getLine();
    			setLocalizationEnd(result.getPostParseCommands(), incompleteObject, endChar, endLine);
    		}
    		if (result != null) {
    			org.eclipse.emf.ecore.EObject root = result.getRoot();
    			if (root != null) {
    				dummyResource.getContents().add(root);
    			}
    			for (west.twouse.language.yuml.resource.yuml.IYumlCommand<west.twouse.language.yuml.resource.yuml.IYumlTextResource> command : result.getPostParseCommands()) {
    				command.execute(dummyResource);
    			}
    		}
    		// remove all expected elements that were added after the last complete element
    		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
    		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
    		java.util.Set<west.twouse.language.yuml.resource.yuml.mopp.YumlExpectedTerminal> currentFollowSet = new java.util.LinkedHashSet<west.twouse.language.yuml.resource.yuml.mopp.YumlExpectedTerminal>();
    		java.util.List<west.twouse.language.yuml.resource.yuml.mopp.YumlExpectedTerminal> newFollowSet = new java.util.ArrayList<west.twouse.language.yuml.resource.yuml.mopp.YumlExpectedTerminal>();
    		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
    			west.twouse.language.yuml.resource.yuml.mopp.YumlExpectedTerminal expectedElementI = expectedElements.get(i);
    			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
    				currentFollowSet.add(expectedElementI);
    			} else {
    				break;
    			}
    		}
    		int followSetID = 89;
    		int i;
    		for (i = tokenIndexOfLastCompleteElement; i < tokenStream.size(); i++) {
    			org.antlr.runtime3_2_0.CommonToken nextToken = (org.antlr.runtime3_2_0.CommonToken) tokenStream.get(i);
    			if (nextToken.getChannel() == 99) {
    				// hidden tokens do not reduce the follow set
    			} else {
    				// now that we have found the next visible token the position for that expected
    				// terminals can be set
    				for (west.twouse.language.yuml.resource.yuml.mopp.YumlExpectedTerminal nextFollow : newFollowSet) {
    					lastTokenIndex = 0;
    					setPosition(nextFollow, i);
    				}
    				newFollowSet.clear();
    				// normal tokens do reduce the follow set - only elements that match the token are
    				// kept
    				for (west.twouse.language.yuml.resource.yuml.mopp.YumlExpectedTerminal nextFollow : currentFollowSet) {
    					if (nextFollow.getTerminal().getTokenNames().contains(getTokenNames()[nextToken.getType()])) {
    						// keep this one - it matches
    						java.util.Collection<west.twouse.language.yuml.resource.yuml.util.YumlPair<west.twouse.language.yuml.resource.yuml.IYumlExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
    						for (west.twouse.language.yuml.resource.yuml.util.YumlPair<west.twouse.language.yuml.resource.yuml.IYumlExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]> newFollowerPair : newFollowers) {
    							west.twouse.language.yuml.resource.yuml.IYumlExpectedElement newFollower = newFollowerPair.getLeft();
    							west.twouse.language.yuml.resource.yuml.mopp.YumlExpectedTerminal newFollowTerminal = new west.twouse.language.yuml.resource.yuml.mopp.YumlExpectedTerminal(newFollower, followSetID, newFollowerPair.getRight());
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
    		// after the last token in the stream we must set the position for the elements
    		// that were added during the last iteration of the loop
    		for (west.twouse.language.yuml.resource.yuml.mopp.YumlExpectedTerminal nextFollow : newFollowSet) {
    			lastTokenIndex = 0;
    			setPosition(nextFollow, i);
    		}
    		return this.expectedElements;
    	}
    	
    	public void setPosition(west.twouse.language.yuml.resource.yuml.mopp.YumlExpectedTerminal expectedElement, int tokenIndex) {
    		int currentIndex = Math.max(0, tokenIndex);
    		for (int index = lastTokenIndex; index < currentIndex; index++) {
    			if (index >= input.size()) {
    				break;
    			}
    			org.antlr.runtime3_2_0.CommonToken tokenAtIndex = (org.antlr.runtime3_2_0.CommonToken) input.get(index);
    			stopIncludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
    			if (tokenAtIndex.getChannel() != 99) {
    				stopExcludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
    			}
    		}
    		lastTokenIndex = Math.max(0, currentIndex);
    		expectedElement.setPosition(stopExcludingHiddenTokens, stopIncludingHiddenTokens);
    	}
    	
    	public Object recoverFromMismatchedToken(org.antlr.runtime3_2_0.IntStream input, int ttype, org.antlr.runtime3_2_0.BitSet follow) throws org.antlr.runtime3_2_0.RecognitionException {
    		if (!rememberExpectedElements) {
    			return super.recoverFromMismatchedToken(input, ttype, follow);
    		} else {
    			return null;
    		}
    	}
    	
    	protected <ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> void registerContextDependentProxy(final west.twouse.language.yuml.resource.yuml.mopp.YumlContextDependentURIFragmentFactory<ContainerType, ReferenceType> factory, final ContainerType element, final org.eclipse.emf.ecore.EReference reference, final String id, final org.eclipse.emf.ecore.EObject proxy) {
    		postParseCommands.add(new west.twouse.language.yuml.resource.yuml.IYumlCommand<west.twouse.language.yuml.resource.yuml.IYumlTextResource>() {
    			public boolean execute(west.twouse.language.yuml.resource.yuml.IYumlTextResource resource) {
    				if (resource == null) {
    					// the resource can be null if the parser is used for code completion
    					return true;
    				}
    				resource.registerContextDependentProxy(factory, element, reference, id, proxy);
    				return true;
    			}
    		});
    	}
    	
    	/**
    	 * Translates errors thrown by the parser into human readable messages.
    	 */
    	public void reportError(final org.antlr.runtime3_2_0.RecognitionException e)  {
    		String message = e.getMessage();
    		if (e instanceof org.antlr.runtime3_2_0.MismatchedTokenException) {
    			org.antlr.runtime3_2_0.MismatchedTokenException mte = (org.antlr.runtime3_2_0.MismatchedTokenException) e;
    			String tokenName = "<unknown>";
    			if (mte.expecting == Token.EOF) {
    				tokenName = "EOF";
    			} else {
    				tokenName = getTokenNames()[mte.expecting];
    				tokenName = west.twouse.language.yuml.resource.yuml.util.YumlStringUtil.formatTokenName(tokenName);
    			}
    			message = "Syntax error on token \"" + e.token.getText() + "\", \"" + tokenName + "\" expected";
    		} else if (e instanceof org.antlr.runtime3_2_0.MismatchedTreeNodeException) {
    			org.antlr.runtime3_2_0.MismatchedTreeNodeException mtne = (org.antlr.runtime3_2_0.MismatchedTreeNodeException) e;
    			String tokenName = "<unknown>";
    			if (mtne.expecting == Token.EOF) {
    				tokenName = "EOF";
    			} else {
    				tokenName = getTokenNames()[mtne.expecting];
    			}
    			message = "mismatched tree node: " + "xxx" + "; expecting " + tokenName;
    		} else if (e instanceof org.antlr.runtime3_2_0.NoViableAltException) {
    			message = "Syntax error on token \"" + e.token.getText() + "\", check following tokens";
    		} else if (e instanceof org.antlr.runtime3_2_0.EarlyExitException) {
    			message = "Syntax error on token \"" + e.token.getText() + "\", delete this token";
    		} else if (e instanceof org.antlr.runtime3_2_0.MismatchedSetException) {
    			org.antlr.runtime3_2_0.MismatchedSetException mse = (org.antlr.runtime3_2_0.MismatchedSetException) e;
    			message = "mismatched token: " + e.token + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_2_0.MismatchedNotSetException) {
    			org.antlr.runtime3_2_0.MismatchedNotSetException mse = (org.antlr.runtime3_2_0.MismatchedNotSetException) e;
    			message = "mismatched token: " +  e.token + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_2_0.FailedPredicateException) {
    			org.antlr.runtime3_2_0.FailedPredicateException fpe = (org.antlr.runtime3_2_0.FailedPredicateException) e;
    			message = "rule " + fpe.ruleName + " failed predicate: {" +  fpe.predicateText + "}?";
    		}
    		// the resource may be null if the parse is used for code completion
    		final String finalMessage = message;
    		if (e.token instanceof org.antlr.runtime3_2_0.CommonToken) {
    			final org.antlr.runtime3_2_0.CommonToken ct = (org.antlr.runtime3_2_0.CommonToken) e.token;
    			addErrorToResource(finalMessage, ct.getCharPositionInLine(), ct.getLine(), ct.getStartIndex(), ct.getStopIndex());
    		} else {
    			addErrorToResource(finalMessage, e.token.getCharPositionInLine(), e.token.getLine(), 1, 5);
    		}
    	}
    	
    	/**
    	 * Translates errors thrown by the lexer into human readable messages.
    	 */
    	public void reportLexicalError(final org.antlr.runtime3_2_0.RecognitionException e)  {
    		String message = "";
    		if (e instanceof org.antlr.runtime3_2_0.MismatchedTokenException) {
    			org.antlr.runtime3_2_0.MismatchedTokenException mte = (org.antlr.runtime3_2_0.MismatchedTokenException) e;
    			message = "Syntax error on token \"" + ((char) e.c) + "\", \"" + (char) mte.expecting + "\" expected";
    		} else if (e instanceof org.antlr.runtime3_2_0.NoViableAltException) {
    			message = "Syntax error on token \"" + ((char) e.c) + "\", delete this token";
    		} else if (e instanceof org.antlr.runtime3_2_0.EarlyExitException) {
    			org.antlr.runtime3_2_0.EarlyExitException eee = (org.antlr.runtime3_2_0.EarlyExitException) e;
    			message ="required (...)+ loop (decision=" + eee.decisionNumber + ") did not match anything; on line " + e.line + ":" + e.charPositionInLine + " char=" + ((char) e.c) + "'";
    		} else if (e instanceof org.antlr.runtime3_2_0.MismatchedSetException) {
    			org.antlr.runtime3_2_0.MismatchedSetException mse = (org.antlr.runtime3_2_0.MismatchedSetException) e;
    			message ="mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_2_0.MismatchedNotSetException) {
    			org.antlr.runtime3_2_0.MismatchedNotSetException mse = (org.antlr.runtime3_2_0.MismatchedNotSetException) e;
    			message ="mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
    		} else if (e instanceof org.antlr.runtime3_2_0.MismatchedRangeException) {
    			org.antlr.runtime3_2_0.MismatchedRangeException mre = (org.antlr.runtime3_2_0.MismatchedRangeException) e;
    			message ="mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set '" + (char) mre.a + "'..'" + (char) mre.b + "'";
    		} else if (e instanceof org.antlr.runtime3_2_0.FailedPredicateException) {
    			org.antlr.runtime3_2_0.FailedPredicateException fpe = (org.antlr.runtime3_2_0.FailedPredicateException) e;
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
    	
    	protected void completedElement(Object object, boolean isContainment) {
    		if (isContainment && !this.incompleteObjects.isEmpty()) {
    			this.incompleteObjects.pop();
    		}
    		if (object instanceof org.eclipse.emf.ecore.EObject) {
    			this.tokenIndexOfLastCompleteElement = getTokenStream().index();
    			this.expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
    		}
    	}
    	
    	/**
    	 * Creates a dynamic Java proxy that mimics the interface of the given class.
    	 */
    	@SuppressWarnings("unchecked")
    	
    	public <T> T createDynamicProxy(Class<T> clazz) {
    		Object proxy = java.lang.reflect.Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class<?>[]{clazz, org.eclipse.emf.ecore.EObject.class, org.eclipse.emf.ecore.InternalEObject.class}, new java.lang.reflect.InvocationHandler() {
    			
    			private org.eclipse.emf.ecore.EObject dummyObject = new org.eclipse.emf.ecore.impl.EObjectImpl() {};
    			
    			public Object invoke(Object object, java.lang.reflect.Method method, Object[] args) throws Throwable {
    				// search in dummyObject for the requested method
    				java.lang.reflect.Method[] methodsInDummy = dummyObject.getClass().getMethods();
    				for (java.lang.reflect.Method methodInDummy : methodsInDummy) {
    					boolean matches = true;
    					if (methodInDummy.getName().equals(method.getName())) {
    						Class<?>[] parameterTypes = method.getParameterTypes();
    						Class<?>[] parameterTypesInDummy = methodInDummy.getParameterTypes();
    						if (parameterTypes.length == parameterTypesInDummy.length) {
    							for (int p = 0; p < parameterTypes.length; p++) {
    								Class<?> parameterType = parameterTypes[p];
    								Class<?> parameterTypeInDummy = parameterTypesInDummy[p];
    								if (!parameterType.equals(parameterTypeInDummy)) {
    									matches = false;
    								}
    							}
    						} else {
    							matches = false;
    						}
    					} else {
    						matches = false;
    					}
    					if (matches) {
    						return methodInDummy.invoke(dummyObject, args);
    					}
    				}
    				return null;
    			}
    		});
    		return (T) proxy;
    	}
    	
    	protected void retrieveLayoutInformation(org.eclipse.emf.ecore.EObject element, west.twouse.language.yuml.resource.yuml.grammar.YumlSyntaxElement syntaxElement, Object object) {
    		if (!(syntaxElement instanceof west.twouse.language.yuml.resource.yuml.grammar.YumlPlaceholder) && !(syntaxElement instanceof west.twouse.language.yuml.resource.yuml.grammar.YumlKeyword)) {
    			return;
    		}
    		west.twouse.language.yuml.resource.yuml.mopp.YumlLayoutInformationAdapter layoutInformationAdapter = getLayoutInformationAdapter(element);
    		for (org.antlr.runtime3_2_0.CommonToken anonymousToken : anonymousTokens) {
    			layoutInformationAdapter.addLayoutInformation(new west.twouse.language.yuml.resource.yuml.mopp.YumlLayoutInformation(syntaxElement, object, anonymousToken.getStartIndex(), anonymousToken.getText(), ""));
    		}
    		anonymousTokens.clear();
    		int currentPos = getTokenStream().index();
    		if (currentPos == 0) {
    			return;
    		}
    		int endPos = currentPos - 1;
    		for (; endPos >= this.lastPosition2; endPos--) {
    			org.antlr.runtime3_2_0.Token token = getTokenStream().get(endPos);
    			int _channel = token.getChannel();
    			if (_channel != 99) {
    				break;
    			}
    		}
    		StringBuilder hiddenTokenText = new StringBuilder();
    		StringBuilder visibleTokenText = new StringBuilder();
    		org.antlr.runtime3_2_0.CommonToken firstToken = null;
    		for (int pos = this.lastPosition2; pos <= endPos; pos++) {
    			org.antlr.runtime3_2_0.Token token = getTokenStream().get(pos);
    			if (firstToken == null) {
    				firstToken = (org.antlr.runtime3_2_0.CommonToken) token;
    			}
    			int _channel = token.getChannel();
    			if (_channel == 99) {
    				hiddenTokenText.append(token.getText());
    			} else {
    				visibleTokenText.append(token.getText());
    			}
    		}
    		int offset = -1;
    		if (firstToken != null) {
    			offset = firstToken.getStartIndex();
    		}
    		layoutInformationAdapter.addLayoutInformation(new west.twouse.language.yuml.resource.yuml.mopp.YumlLayoutInformation(syntaxElement, object, offset, hiddenTokenText.toString(), visibleTokenText.toString()));
    		this.lastPosition2 = (endPos < 0 ? 0 : endPos + 1);
    	}
    	
    	protected west.twouse.language.yuml.resource.yuml.mopp.YumlLayoutInformationAdapter getLayoutInformationAdapter(org.eclipse.emf.ecore.EObject element) {
    		for (org.eclipse.emf.common.notify.Adapter adapter : element.eAdapters()) {
    			if (adapter instanceof west.twouse.language.yuml.resource.yuml.mopp.YumlLayoutInformationAdapter) {
    				return (west.twouse.language.yuml.resource.yuml.mopp.YumlLayoutInformationAdapter) adapter;
    			}
    		}
    		west.twouse.language.yuml.resource.yuml.mopp.YumlLayoutInformationAdapter newAdapter = new west.twouse.language.yuml.resource.yuml.mopp.YumlLayoutInformationAdapter();
    		element.eAdapters().add(newAdapter);
    		return newAdapter;
    	}
    	



    // $ANTLR start "start"
    // Yuml.g:692:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_west_twouse_language_yuml_Model ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;
        int start_StartIndex = input.index();
        west.twouse.language.yuml.Model c0 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return element; }
            // Yuml.g:693:1: ( (c0= parse_west_twouse_language_yuml_Model ) EOF )
            // Yuml.g:694:2: (c0= parse_west_twouse_language_yuml_Model ) EOF
            {
            if ( state.backtracking==0 ) {

              		// follow set for start rule(s)
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_0, 0, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_0);
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_1, 0, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_1, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_0);
              		expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
              	
            }
            // Yuml.g:700:2: (c0= parse_west_twouse_language_yuml_Model )
            // Yuml.g:701:3: c0= parse_west_twouse_language_yuml_Model
            {
            pushFollow(FOLLOW_parse_west_twouse_language_yuml_Model_in_start82);
            c0=parse_west_twouse_language_yuml_Model();

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


    // $ANTLR start "parse_west_twouse_language_yuml_Model"
    // Yuml.g:706:1: parse_west_twouse_language_yuml_Model returns [west.twouse.language.yuml.Model element = null] : ( ( (a0_0= parse_west_twouse_language_yuml_ModelElement ) ( (a1= ',' (a2_0= parse_west_twouse_language_yuml_ModelElement ) ) )* ) )? ;
    public final west.twouse.language.yuml.Model parse_west_twouse_language_yuml_Model() throws RecognitionException {
        west.twouse.language.yuml.Model element =  null;
        int parse_west_twouse_language_yuml_Model_StartIndex = input.index();
        Token a1=null;
        west.twouse.language.yuml.ModelElement a0_0 = null;

        west.twouse.language.yuml.ModelElement a2_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return element; }
            // Yuml.g:709:1: ( ( ( (a0_0= parse_west_twouse_language_yuml_ModelElement ) ( (a1= ',' (a2_0= parse_west_twouse_language_yuml_ModelElement ) ) )* ) )? )
            // Yuml.g:710:2: ( ( (a0_0= parse_west_twouse_language_yuml_ModelElement ) ( (a1= ',' (a2_0= parse_west_twouse_language_yuml_ModelElement ) ) )* ) )?
            {
            // Yuml.g:710:2: ( ( (a0_0= parse_west_twouse_language_yuml_ModelElement ) ( (a1= ',' (a2_0= parse_west_twouse_language_yuml_ModelElement ) ) )* ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11||LA2_0==27) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // Yuml.g:711:3: ( (a0_0= parse_west_twouse_language_yuml_ModelElement ) ( (a1= ',' (a2_0= parse_west_twouse_language_yuml_ModelElement ) ) )* )
                    {
                    // Yuml.g:711:3: ( (a0_0= parse_west_twouse_language_yuml_ModelElement ) ( (a1= ',' (a2_0= parse_west_twouse_language_yuml_ModelElement ) ) )* )
                    // Yuml.g:712:4: (a0_0= parse_west_twouse_language_yuml_ModelElement ) ( (a1= ',' (a2_0= parse_west_twouse_language_yuml_ModelElement ) ) )*
                    {
                    // Yuml.g:712:4: (a0_0= parse_west_twouse_language_yuml_ModelElement )
                    // Yuml.g:713:5: a0_0= parse_west_twouse_language_yuml_ModelElement
                    {
                    pushFollow(FOLLOW_parse_west_twouse_language_yuml_ModelElement_in_parse_west_twouse_language_yuml_Model127);
                    a0_0=parse_west_twouse_language_yuml_ModelElement();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new west.twouse.language.yuml.resource.yuml.mopp.YumlTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createModel();
                      						incompleteObjects.push(element);
                      						// initialize boolean attributes
                      					}
                      					if (a0_0 != null) {
                      						if (a0_0 != null) {
                      							addObjectToList(element, west.twouse.language.yuml.YumlPackage.MODEL__ELEMENTS, a0_0);
                      							completedElement(a0_0, true);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_0_0_0_0_0_0_0, a0_0);
                      						copyLocalizationInfos(a0_0, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_2, 1);
                      			
                    }
                    // Yuml.g:738:4: ( (a1= ',' (a2_0= parse_west_twouse_language_yuml_ModelElement ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==10) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // Yuml.g:739:5: (a1= ',' (a2_0= parse_west_twouse_language_yuml_ModelElement ) )
                    	    {
                    	    // Yuml.g:739:5: (a1= ',' (a2_0= parse_west_twouse_language_yuml_ModelElement ) )
                    	    // Yuml.g:740:6: a1= ',' (a2_0= parse_west_twouse_language_yuml_ModelElement )
                    	    {
                    	    a1=(Token)match(input,10,FOLLOW_10_in_parse_west_twouse_language_yuml_Model168); if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      						if (element == null) {
                    	      							element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createModel();
                    	      							incompleteObjects.push(element);
                    	      							// initialize boolean attributes
                    	      						}
                    	      						collectHiddenTokens(element);
                    	      						retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_0_0_0_0_0_0_1_0_0_0, null);
                    	      						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						// expected elements (follow set)
                    	      						addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_0, 2, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_0);
                    	      						addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_1, 2, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_1, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_0);
                    	      					
                    	    }
                    	    // Yuml.g:756:6: (a2_0= parse_west_twouse_language_yuml_ModelElement )
                    	    // Yuml.g:757:7: a2_0= parse_west_twouse_language_yuml_ModelElement
                    	    {
                    	    pushFollow(FOLLOW_parse_west_twouse_language_yuml_ModelElement_in_parse_west_twouse_language_yuml_Model202);
                    	    a2_0=parse_west_twouse_language_yuml_ModelElement();

                    	    state._fsp--;
                    	    if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      							if (terminateParsing) {
                    	      								throw new west.twouse.language.yuml.resource.yuml.mopp.YumlTerminateParsingException();
                    	      							}
                    	      							if (element == null) {
                    	      								element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createModel();
                    	      								incompleteObjects.push(element);
                    	      								// initialize boolean attributes
                    	      							}
                    	      							if (a2_0 != null) {
                    	      								if (a2_0 != null) {
                    	      									addObjectToList(element, west.twouse.language.yuml.YumlPackage.MODEL__ELEMENTS, a2_0);
                    	      									completedElement(a2_0, true);
                    	      								}
                    	      								collectHiddenTokens(element);
                    	      								retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_0_0_0_0_0_0_1_0_0_2, a2_0);
                    	      								copyLocalizationInfos(a2_0, element);
                    	      							}
                    	      						
                    	    }

                    	    }

                    	    if ( state.backtracking==0 ) {

                    	      						// expected elements (follow set)
                    	      						addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_2, 3);
                    	      					
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
                      				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_2, 4);
                      			
                    }

                    }


                    }
                    break;

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
            if ( state.backtracking>0 ) { memoize(input, 2, parse_west_twouse_language_yuml_Model_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_west_twouse_language_yuml_Model"


    // $ANTLR start "parse_west_twouse_language_yuml_Class"
    // Yuml.g:797:1: parse_west_twouse_language_yuml_Class returns [west.twouse.language.yuml.Class element = null] : a0= '[' ( (a1= '<<' (a2= ALPHANUM ) a3= '>>' ) )? (a4= TEXT ) ( (a5= '|' (a6_0= parse_west_twouse_language_yuml_Attribute ) ( (a7= ';' (a8_0= parse_west_twouse_language_yuml_Attribute ) ) )* ) )? ( (a9= '|' (a10_0= parse_west_twouse_language_yuml_Method ) ( (a11= ';' (a12_0= parse_west_twouse_language_yuml_Method ) ) )* ) )? ( (a13= '{bg:' (a14= TEXT ) a15= '}' ) )? a16= ']' ;
    public final west.twouse.language.yuml.Class parse_west_twouse_language_yuml_Class() throws RecognitionException {
        west.twouse.language.yuml.Class element =  null;
        int parse_west_twouse_language_yuml_Class_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a7=null;
        Token a9=null;
        Token a11=null;
        Token a13=null;
        Token a14=null;
        Token a15=null;
        Token a16=null;
        west.twouse.language.yuml.Attribute a6_0 = null;

        west.twouse.language.yuml.Attribute a8_0 = null;

        west.twouse.language.yuml.Method a10_0 = null;

        west.twouse.language.yuml.Method a12_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return element; }
            // Yuml.g:800:1: (a0= '[' ( (a1= '<<' (a2= ALPHANUM ) a3= '>>' ) )? (a4= TEXT ) ( (a5= '|' (a6_0= parse_west_twouse_language_yuml_Attribute ) ( (a7= ';' (a8_0= parse_west_twouse_language_yuml_Attribute ) ) )* ) )? ( (a9= '|' (a10_0= parse_west_twouse_language_yuml_Method ) ( (a11= ';' (a12_0= parse_west_twouse_language_yuml_Method ) ) )* ) )? ( (a13= '{bg:' (a14= TEXT ) a15= '}' ) )? a16= ']' )
            // Yuml.g:801:2: a0= '[' ( (a1= '<<' (a2= ALPHANUM ) a3= '>>' ) )? (a4= TEXT ) ( (a5= '|' (a6_0= parse_west_twouse_language_yuml_Attribute ) ( (a7= ';' (a8_0= parse_west_twouse_language_yuml_Attribute ) ) )* ) )? ( (a9= '|' (a10_0= parse_west_twouse_language_yuml_Method ) ( (a11= ';' (a12_0= parse_west_twouse_language_yuml_Method ) ) )* ) )? ( (a13= '{bg:' (a14= TEXT ) a15= '}' ) )? a16= ']'
            {
            a0=(Token)match(input,11,FOLLOW_11_in_parse_west_twouse_language_yuml_Class291); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createClass();
              			incompleteObjects.push(element);
              			// initialize boolean attributes
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_1_0_0_0, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_3, 6);
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_4, 6);
              	
            }
            // Yuml.g:817:2: ( (a1= '<<' (a2= ALPHANUM ) a3= '>>' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // Yuml.g:818:3: (a1= '<<' (a2= ALPHANUM ) a3= '>>' )
                    {
                    // Yuml.g:818:3: (a1= '<<' (a2= ALPHANUM ) a3= '>>' )
                    // Yuml.g:819:4: a1= '<<' (a2= ALPHANUM ) a3= '>>'
                    {
                    a1=(Token)match(input,12,FOLLOW_12_in_parse_west_twouse_language_yuml_Class314); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createClass();
                      					incompleteObjects.push(element);
                      					// initialize boolean attributes
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_1_0_0_1_0_0_0, null);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_5, 7);
                      			
                    }
                    // Yuml.g:834:4: (a2= ALPHANUM )
                    // Yuml.g:835:5: a2= ALPHANUM
                    {
                    a2=(Token)match(input,ALPHANUM,FOLLOW_ALPHANUM_in_parse_west_twouse_language_yuml_Class340); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new west.twouse.language.yuml.resource.yuml.mopp.YumlTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createClass();
                      						incompleteObjects.push(element);
                      						// initialize boolean attributes
                      					}
                      					if (a2 != null) {
                      						west.twouse.language.yuml.resource.yuml.IYumlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("ALPHANUM");
                      						tokenResolver.setOptions(getOptions());
                      						west.twouse.language.yuml.resource.yuml.IYumlTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.CLASS__STEREOTYPE), result);
                      						Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStopIndex());
                      						}
                      						java.lang.String resolved = (java.lang.String)resolvedObject;
                      						if (resolved != null) {
                      							element.eSet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.CLASS__STEREOTYPE), resolved);
                      							completedElement(resolved, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_1_0_0_1_0_0_1, resolved);
                      						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_6, 8);
                      			
                    }
                    a3=(Token)match(input,13,FOLLOW_13_in_parse_west_twouse_language_yuml_Class373); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createClass();
                      					incompleteObjects.push(element);
                      					// initialize boolean attributes
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_1_0_0_1_0_0_2, null);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_4, 9);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_4, 10);
              	
            }
            // Yuml.g:892:2: (a4= TEXT )
            // Yuml.g:893:3: a4= TEXT
            {
            a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_west_twouse_language_yuml_Class410); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new west.twouse.language.yuml.resource.yuml.mopp.YumlTerminateParsingException();
              			}
              			if (element == null) {
              				element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createClass();
              				incompleteObjects.push(element);
              				// initialize boolean attributes
              			}
              			if (a4 != null) {
              				west.twouse.language.yuml.resource.yuml.IYumlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				west.twouse.language.yuml.resource.yuml.IYumlTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.CLASS__NAME), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.CLASS__NAME), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_1_0_0_2, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a4, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_7, 11);
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_8, 11);
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_9, 11);
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_10, 11);
              	
            }
            // Yuml.g:931:2: ( (a5= '|' (a6_0= parse_west_twouse_language_yuml_Attribute ) ( (a7= ';' (a8_0= parse_west_twouse_language_yuml_Attribute ) ) )* ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==VISIBILITY||LA5_1==12) ) {
                    alt5=1;
                }
                else if ( (LA5_1==TEXT) ) {
                    int LA5_4 = input.LA(3);

                    if ( ((LA5_4>=14 && LA5_4<=16)||LA5_4==18||LA5_4==24) ) {
                        alt5=1;
                    }
                }
            }
            switch (alt5) {
                case 1 :
                    // Yuml.g:932:3: (a5= '|' (a6_0= parse_west_twouse_language_yuml_Attribute ) ( (a7= ';' (a8_0= parse_west_twouse_language_yuml_Attribute ) ) )* )
                    {
                    // Yuml.g:932:3: (a5= '|' (a6_0= parse_west_twouse_language_yuml_Attribute ) ( (a7= ';' (a8_0= parse_west_twouse_language_yuml_Attribute ) ) )* )
                    // Yuml.g:933:4: a5= '|' (a6_0= parse_west_twouse_language_yuml_Attribute ) ( (a7= ';' (a8_0= parse_west_twouse_language_yuml_Attribute ) ) )*
                    {
                    a5=(Token)match(input,14,FOLLOW_14_in_parse_west_twouse_language_yuml_Class440); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createClass();
                      					incompleteObjects.push(element);
                      					// initialize boolean attributes
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_1_0_0_3_0_0_0, null);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a5, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_11, 12, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_2);
                      				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_12, 12, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_2);
                      				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_13, 12, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_2);
                      			
                    }
                    // Yuml.g:950:4: (a6_0= parse_west_twouse_language_yuml_Attribute )
                    // Yuml.g:951:5: a6_0= parse_west_twouse_language_yuml_Attribute
                    {
                    pushFollow(FOLLOW_parse_west_twouse_language_yuml_Attribute_in_parse_west_twouse_language_yuml_Class466);
                    a6_0=parse_west_twouse_language_yuml_Attribute();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new west.twouse.language.yuml.resource.yuml.mopp.YumlTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createClass();
                      						incompleteObjects.push(element);
                      						// initialize boolean attributes
                      					}
                      					if (a6_0 != null) {
                      						if (a6_0 != null) {
                      							addObjectToList(element, west.twouse.language.yuml.YumlPackage.CLASS__ATTRIBUTES, a6_0);
                      							completedElement(a6_0, true);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_1_0_0_3_0_0_1, a6_0);
                      						copyLocalizationInfos(a6_0, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_14, 13);
                      				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_8, 13);
                      				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_9, 13);
                      				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_10, 13);
                      			
                    }
                    // Yuml.g:979:4: ( (a7= ';' (a8_0= parse_west_twouse_language_yuml_Attribute ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==15) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // Yuml.g:980:5: (a7= ';' (a8_0= parse_west_twouse_language_yuml_Attribute ) )
                    	    {
                    	    // Yuml.g:980:5: (a7= ';' (a8_0= parse_west_twouse_language_yuml_Attribute ) )
                    	    // Yuml.g:981:6: a7= ';' (a8_0= parse_west_twouse_language_yuml_Attribute )
                    	    {
                    	    a7=(Token)match(input,15,FOLLOW_15_in_parse_west_twouse_language_yuml_Class507); if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      						if (element == null) {
                    	      							element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createClass();
                    	      							incompleteObjects.push(element);
                    	      							// initialize boolean attributes
                    	      						}
                    	      						collectHiddenTokens(element);
                    	      						retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_1_0_0_3_0_0_2_0_0_0, null);
                    	      						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a7, element);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						// expected elements (follow set)
                    	      						addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_11, 14, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_2);
                    	      						addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_12, 14, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_2);
                    	      						addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_13, 14, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_2);
                    	      					
                    	    }
                    	    // Yuml.g:998:6: (a8_0= parse_west_twouse_language_yuml_Attribute )
                    	    // Yuml.g:999:7: a8_0= parse_west_twouse_language_yuml_Attribute
                    	    {
                    	    pushFollow(FOLLOW_parse_west_twouse_language_yuml_Attribute_in_parse_west_twouse_language_yuml_Class541);
                    	    a8_0=parse_west_twouse_language_yuml_Attribute();

                    	    state._fsp--;
                    	    if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      							if (terminateParsing) {
                    	      								throw new west.twouse.language.yuml.resource.yuml.mopp.YumlTerminateParsingException();
                    	      							}
                    	      							if (element == null) {
                    	      								element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createClass();
                    	      								incompleteObjects.push(element);
                    	      								// initialize boolean attributes
                    	      							}
                    	      							if (a8_0 != null) {
                    	      								if (a8_0 != null) {
                    	      									addObjectToList(element, west.twouse.language.yuml.YumlPackage.CLASS__ATTRIBUTES, a8_0);
                    	      									completedElement(a8_0, true);
                    	      								}
                    	      								collectHiddenTokens(element);
                    	      								retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_1_0_0_3_0_0_2_0_0_1, a8_0);
                    	      								copyLocalizationInfos(a8_0, element);
                    	      							}
                    	      						
                    	    }

                    	    }

                    	    if ( state.backtracking==0 ) {

                    	      						// expected elements (follow set)
                    	      						addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_14, 15);
                    	      						addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_8, 15);
                    	      						addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_9, 15);
                    	      						addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_10, 15);
                    	      					
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
                      				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_14, 16);
                      				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_8, 16);
                      				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_9, 16);
                      				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_10, 16);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_8, 17);
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_9, 17);
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_10, 17);
              	
            }
            // Yuml.g:1046:2: ( (a9= '|' (a10_0= parse_west_twouse_language_yuml_Method ) ( (a11= ';' (a12_0= parse_west_twouse_language_yuml_Method ) ) )* ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // Yuml.g:1047:3: (a9= '|' (a10_0= parse_west_twouse_language_yuml_Method ) ( (a11= ';' (a12_0= parse_west_twouse_language_yuml_Method ) ) )* )
                    {
                    // Yuml.g:1047:3: (a9= '|' (a10_0= parse_west_twouse_language_yuml_Method ) ( (a11= ';' (a12_0= parse_west_twouse_language_yuml_Method ) ) )* )
                    // Yuml.g:1048:4: a9= '|' (a10_0= parse_west_twouse_language_yuml_Method ) ( (a11= ';' (a12_0= parse_west_twouse_language_yuml_Method ) ) )*
                    {
                    a9=(Token)match(input,14,FOLLOW_14_in_parse_west_twouse_language_yuml_Class624); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createClass();
                      					incompleteObjects.push(element);
                      					// initialize boolean attributes
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_1_0_0_4_0_0_0, null);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a9, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_15, 18, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_3);
                      			
                    }
                    // Yuml.g:1063:4: (a10_0= parse_west_twouse_language_yuml_Method )
                    // Yuml.g:1064:5: a10_0= parse_west_twouse_language_yuml_Method
                    {
                    pushFollow(FOLLOW_parse_west_twouse_language_yuml_Method_in_parse_west_twouse_language_yuml_Class650);
                    a10_0=parse_west_twouse_language_yuml_Method();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new west.twouse.language.yuml.resource.yuml.mopp.YumlTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createClass();
                      						incompleteObjects.push(element);
                      						// initialize boolean attributes
                      					}
                      					if (a10_0 != null) {
                      						if (a10_0 != null) {
                      							addObjectToList(element, west.twouse.language.yuml.YumlPackage.CLASS__METHODS, a10_0);
                      							completedElement(a10_0, true);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_1_0_0_4_0_0_1, a10_0);
                      						copyLocalizationInfos(a10_0, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_16, 19);
                      				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_9, 19);
                      				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_10, 19);
                      			
                    }
                    // Yuml.g:1091:4: ( (a11= ';' (a12_0= parse_west_twouse_language_yuml_Method ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==15) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // Yuml.g:1092:5: (a11= ';' (a12_0= parse_west_twouse_language_yuml_Method ) )
                    	    {
                    	    // Yuml.g:1092:5: (a11= ';' (a12_0= parse_west_twouse_language_yuml_Method ) )
                    	    // Yuml.g:1093:6: a11= ';' (a12_0= parse_west_twouse_language_yuml_Method )
                    	    {
                    	    a11=(Token)match(input,15,FOLLOW_15_in_parse_west_twouse_language_yuml_Class691); if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      						if (element == null) {
                    	      							element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createClass();
                    	      							incompleteObjects.push(element);
                    	      							// initialize boolean attributes
                    	      						}
                    	      						collectHiddenTokens(element);
                    	      						retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_1_0_0_4_0_0_2_0_0_0, null);
                    	      						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a11, element);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						// expected elements (follow set)
                    	      						addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_15, 20, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_3);
                    	      					
                    	    }
                    	    // Yuml.g:1108:6: (a12_0= parse_west_twouse_language_yuml_Method )
                    	    // Yuml.g:1109:7: a12_0= parse_west_twouse_language_yuml_Method
                    	    {
                    	    pushFollow(FOLLOW_parse_west_twouse_language_yuml_Method_in_parse_west_twouse_language_yuml_Class725);
                    	    a12_0=parse_west_twouse_language_yuml_Method();

                    	    state._fsp--;
                    	    if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      							if (terminateParsing) {
                    	      								throw new west.twouse.language.yuml.resource.yuml.mopp.YumlTerminateParsingException();
                    	      							}
                    	      							if (element == null) {
                    	      								element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createClass();
                    	      								incompleteObjects.push(element);
                    	      								// initialize boolean attributes
                    	      							}
                    	      							if (a12_0 != null) {
                    	      								if (a12_0 != null) {
                    	      									addObjectToList(element, west.twouse.language.yuml.YumlPackage.CLASS__METHODS, a12_0);
                    	      									completedElement(a12_0, true);
                    	      								}
                    	      								collectHiddenTokens(element);
                    	      								retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_1_0_0_4_0_0_2_0_0_1, a12_0);
                    	      								copyLocalizationInfos(a12_0, element);
                    	      							}
                    	      						
                    	    }

                    	    }

                    	    if ( state.backtracking==0 ) {

                    	      						// expected elements (follow set)
                    	      						addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_16, 21);
                    	      						addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_9, 21);
                    	      						addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_10, 21);
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_16, 22);
                      				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_9, 22);
                      				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_10, 22);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_9, 23);
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_10, 23);
              	
            }
            // Yuml.g:1153:2: ( (a13= '{bg:' (a14= TEXT ) a15= '}' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // Yuml.g:1154:3: (a13= '{bg:' (a14= TEXT ) a15= '}' )
                    {
                    // Yuml.g:1154:3: (a13= '{bg:' (a14= TEXT ) a15= '}' )
                    // Yuml.g:1155:4: a13= '{bg:' (a14= TEXT ) a15= '}'
                    {
                    a13=(Token)match(input,16,FOLLOW_16_in_parse_west_twouse_language_yuml_Class808); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createClass();
                      					incompleteObjects.push(element);
                      					// initialize boolean attributes
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_1_0_0_5_0_0_0, null);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a13, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_17, 24);
                      			
                    }
                    // Yuml.g:1170:4: (a14= TEXT )
                    // Yuml.g:1171:5: a14= TEXT
                    {
                    a14=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_west_twouse_language_yuml_Class834); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new west.twouse.language.yuml.resource.yuml.mopp.YumlTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createClass();
                      						incompleteObjects.push(element);
                      						// initialize boolean attributes
                      					}
                      					if (a14 != null) {
                      						west.twouse.language.yuml.resource.yuml.IYumlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                      						tokenResolver.setOptions(getOptions());
                      						west.twouse.language.yuml.resource.yuml.IYumlTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a14.getText(), element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.CLASS__COLOR), result);
                      						Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a14).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a14).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a14).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a14).getStopIndex());
                      						}
                      						java.lang.String resolved = (java.lang.String)resolvedObject;
                      						if (resolved != null) {
                      							element.eSet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.CLASS__COLOR), resolved);
                      							completedElement(resolved, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_1_0_0_5_0_0_1, resolved);
                      						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a14, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_18, 25);
                      			
                    }
                    a15=(Token)match(input,17,FOLLOW_17_in_parse_west_twouse_language_yuml_Class867); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createClass();
                      					incompleteObjects.push(element);
                      					// initialize boolean attributes
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_1_0_0_5_0_0_2, null);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a15, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_10, 26);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_10, 27);
              	
            }
            a16=(Token)match(input,18,FOLLOW_18_in_parse_west_twouse_language_yuml_Class900); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createClass();
              			incompleteObjects.push(element);
              			// initialize boolean attributes
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_1_0_0_6, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a16, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_2, 28);
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_19, 28);
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_20, 28);
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_21, 28, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_4);
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_22, 28);
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_23, 28);
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_24, 28);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, parse_west_twouse_language_yuml_Class_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_west_twouse_language_yuml_Class"


    // $ANTLR start "parse_west_twouse_language_yuml_Association"
    // Yuml.g:1251:1: parse_west_twouse_language_yuml_Association returns [west.twouse.language.yuml.Association element = null] : (a0_0= parse_west_twouse_language_yuml_Class ) ( ( (a1= '<' )? ) )? ( (a4= TEXT ) )? ( (a5_0= parse_west_twouse_language_yuml_Cardinality ) )? a6= '-' ( (a7= TEXT ) )? ( (a8_0= parse_west_twouse_language_yuml_Cardinality ) )? ( ( (a9= '>' )? ) )? (a12_0= parse_west_twouse_language_yuml_ColorableElement ) ;
    public final west.twouse.language.yuml.Association parse_west_twouse_language_yuml_Association() throws RecognitionException {
        west.twouse.language.yuml.Association element =  null;
        int parse_west_twouse_language_yuml_Association_StartIndex = input.index();
        Token a1=null;
        Token a4=null;
        Token a6=null;
        Token a7=null;
        Token a9=null;
        west.twouse.language.yuml.Class a0_0 = null;

        west.twouse.language.yuml.Cardinality a5_0 = null;

        west.twouse.language.yuml.Cardinality a8_0 = null;

        west.twouse.language.yuml.ColorableElement a12_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return element; }
            // Yuml.g:1254:1: ( (a0_0= parse_west_twouse_language_yuml_Class ) ( ( (a1= '<' )? ) )? ( (a4= TEXT ) )? ( (a5_0= parse_west_twouse_language_yuml_Cardinality ) )? a6= '-' ( (a7= TEXT ) )? ( (a8_0= parse_west_twouse_language_yuml_Cardinality ) )? ( ( (a9= '>' )? ) )? (a12_0= parse_west_twouse_language_yuml_ColorableElement ) )
            // Yuml.g:1255:2: (a0_0= parse_west_twouse_language_yuml_Class ) ( ( (a1= '<' )? ) )? ( (a4= TEXT ) )? ( (a5_0= parse_west_twouse_language_yuml_Cardinality ) )? a6= '-' ( (a7= TEXT ) )? ( (a8_0= parse_west_twouse_language_yuml_Cardinality ) )? ( ( (a9= '>' )? ) )? (a12_0= parse_west_twouse_language_yuml_ColorableElement )
            {
            // Yuml.g:1255:2: (a0_0= parse_west_twouse_language_yuml_Class )
            // Yuml.g:1256:3: a0_0= parse_west_twouse_language_yuml_Class
            {
            pushFollow(FOLLOW_parse_west_twouse_language_yuml_Class_in_parse_west_twouse_language_yuml_Association933);
            a0_0=parse_west_twouse_language_yuml_Class();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new west.twouse.language.yuml.resource.yuml.mopp.YumlTerminateParsingException();
              			}
              			if (element == null) {
              				element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createAssociation();
              				incompleteObjects.push(element);
              				// initialize boolean attributes
              				element.eSet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ASSOCIATION__NAVIGABLE_SOURCE), false);
              				completedElement(false, false);
              				element.eSet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ASSOCIATION__NAVIGABLE_TARGET), false);
              				completedElement(false, false);
              			}
              			if (a0_0 != null) {
              				if (a0_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ASSOCIATION__SOURCE), a0_0);
              					completedElement(a0_0, true);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_2_0_0_0, a0_0);
              				copyLocalizationInfos(a0_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_19, 29);
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_20, 29);
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_21, 29, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_4);
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_22, 29);
              	
            }
            // Yuml.g:1288:2: ( ( (a1= '<' )? ) )?
            int alt10=2;
            switch ( input.LA(1) ) {
                case 19:
                    {
                    alt10=1;
                    }
                    break;
                case TEXT:
                    {
                    int LA10_2 = input.LA(2);

                    if ( (synpred10_Yuml()) ) {
                        alt10=1;
                    }
                    }
                    break;
                case CARDINALITY:
                    {
                    int LA10_3 = input.LA(2);

                    if ( (synpred10_Yuml()) ) {
                        alt10=1;
                    }
                    }
                    break;
                case 20:
                    {
                    int LA10_4 = input.LA(2);

                    if ( (synpred10_Yuml()) ) {
                        alt10=1;
                    }
                    }
                    break;
            }

            switch (alt10) {
                case 1 :
                    // Yuml.g:1289:3: ( (a1= '<' )? )
                    {
                    // Yuml.g:1289:3: ( (a1= '<' )? )
                    // Yuml.g:1290:4: (a1= '<' )?
                    {
                    // Yuml.g:1290:4: (a1= '<' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==19) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // Yuml.g:1291:5: a1= '<'
                            {
                            a1=(Token)match(input,19,FOLLOW_19_in_parse_west_twouse_language_yuml_Association966); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              					if (element == null) {
                              						element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createAssociation();
                              						incompleteObjects.push(element);
                              						// initialize boolean attributes
                              						element.eSet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ASSOCIATION__NAVIGABLE_SOURCE), false);
                              						completedElement(false, false);
                              						element.eSet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ASSOCIATION__NAVIGABLE_TARGET), false);
                              						completedElement(false, false);
                              					}
                              					collectHiddenTokens(element);
                              					retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_2_0_0_1, null);
                              					copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
                              					// set value of boolean attribute
                              					element.eSet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ASSOCIATION__NAVIGABLE_SOURCE), true);
                              					completedElement(true, false);
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_20, 30);
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_21, 30, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_4);
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_22, 30);
              	
            }
            // Yuml.g:1317:2: ( (a4= TEXT ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==TEXT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // Yuml.g:1318:3: (a4= TEXT )
                    {
                    // Yuml.g:1318:3: (a4= TEXT )
                    // Yuml.g:1319:4: a4= TEXT
                    {
                    a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_west_twouse_language_yuml_Association1004); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new west.twouse.language.yuml.resource.yuml.mopp.YumlTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createAssociation();
                      					incompleteObjects.push(element);
                      					// initialize boolean attributes
                      					element.eSet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ASSOCIATION__NAVIGABLE_SOURCE), false);
                      					completedElement(false, false);
                      					element.eSet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ASSOCIATION__NAVIGABLE_TARGET), false);
                      					completedElement(false, false);
                      				}
                      				if (a4 != null) {
                      					west.twouse.language.yuml.resource.yuml.IYumlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                      					tokenResolver.setOptions(getOptions());
                      					west.twouse.language.yuml.resource.yuml.IYumlTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ASSOCIATION__SOURCE_LABEL), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStopIndex());
                      					}
                      					java.lang.String resolved = (java.lang.String)resolvedObject;
                      					if (resolved != null) {
                      						element.eSet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ASSOCIATION__SOURCE_LABEL), resolved);
                      						completedElement(resolved, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_2_0_0_2, resolved);
                      					copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a4, element);
                      				}
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_21, 31, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_4);
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_22, 31);
              	
            }
            // Yuml.g:1360:2: ( (a5_0= parse_west_twouse_language_yuml_Cardinality ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==CARDINALITY) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // Yuml.g:1361:3: (a5_0= parse_west_twouse_language_yuml_Cardinality )
                    {
                    // Yuml.g:1361:3: (a5_0= parse_west_twouse_language_yuml_Cardinality )
                    // Yuml.g:1362:4: a5_0= parse_west_twouse_language_yuml_Cardinality
                    {
                    pushFollow(FOLLOW_parse_west_twouse_language_yuml_Cardinality_in_parse_west_twouse_language_yuml_Association1043);
                    a5_0=parse_west_twouse_language_yuml_Cardinality();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new west.twouse.language.yuml.resource.yuml.mopp.YumlTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createAssociation();
                      					incompleteObjects.push(element);
                      					// initialize boolean attributes
                      					element.eSet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ASSOCIATION__NAVIGABLE_SOURCE), false);
                      					completedElement(false, false);
                      					element.eSet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ASSOCIATION__NAVIGABLE_TARGET), false);
                      					completedElement(false, false);
                      				}
                      				if (a5_0 != null) {
                      					if (a5_0 != null) {
                      						element.eSet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ASSOCIATION__SOURCE_CARDINALITY), a5_0);
                      						completedElement(a5_0, true);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_2_0_0_3, a5_0);
                      					copyLocalizationInfos(a5_0, element);
                      				}
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_22, 32);
              	
            }
            a6=(Token)match(input,20,FOLLOW_20_in_parse_west_twouse_language_yuml_Association1069); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createAssociation();
              			incompleteObjects.push(element);
              			// initialize boolean attributes
              			element.eSet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ASSOCIATION__NAVIGABLE_SOURCE), false);
              			completedElement(false, false);
              			element.eSet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ASSOCIATION__NAVIGABLE_TARGET), false);
              			completedElement(false, false);
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_2_0_0_4, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a6, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_25, 33);
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_21, 33, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_5);
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_26, 33);
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_0, 33, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_1);
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_1, 33, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_1);
              	
            }
            // Yuml.g:1415:2: ( (a7= TEXT ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==TEXT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // Yuml.g:1416:3: (a7= TEXT )
                    {
                    // Yuml.g:1416:3: (a7= TEXT )
                    // Yuml.g:1417:4: a7= TEXT
                    {
                    a7=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_west_twouse_language_yuml_Association1092); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new west.twouse.language.yuml.resource.yuml.mopp.YumlTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createAssociation();
                      					incompleteObjects.push(element);
                      					// initialize boolean attributes
                      					element.eSet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ASSOCIATION__NAVIGABLE_SOURCE), false);
                      					completedElement(false, false);
                      					element.eSet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ASSOCIATION__NAVIGABLE_TARGET), false);
                      					completedElement(false, false);
                      				}
                      				if (a7 != null) {
                      					west.twouse.language.yuml.resource.yuml.IYumlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                      					tokenResolver.setOptions(getOptions());
                      					west.twouse.language.yuml.resource.yuml.IYumlTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a7.getText(), element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ASSOCIATION__TARGET_LABEL), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a7).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a7).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a7).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a7).getStopIndex());
                      					}
                      					java.lang.String resolved = (java.lang.String)resolvedObject;
                      					if (resolved != null) {
                      						element.eSet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ASSOCIATION__TARGET_LABEL), resolved);
                      						completedElement(resolved, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_2_0_0_5, resolved);
                      					copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a7, element);
                      				}
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_21, 34, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_5);
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_26, 34);
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_0, 34, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_1);
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_1, 34, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_1);
              	
            }
            // Yuml.g:1460:2: ( (a8_0= parse_west_twouse_language_yuml_Cardinality ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==CARDINALITY) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // Yuml.g:1461:3: (a8_0= parse_west_twouse_language_yuml_Cardinality )
                    {
                    // Yuml.g:1461:3: (a8_0= parse_west_twouse_language_yuml_Cardinality )
                    // Yuml.g:1462:4: a8_0= parse_west_twouse_language_yuml_Cardinality
                    {
                    pushFollow(FOLLOW_parse_west_twouse_language_yuml_Cardinality_in_parse_west_twouse_language_yuml_Association1131);
                    a8_0=parse_west_twouse_language_yuml_Cardinality();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new west.twouse.language.yuml.resource.yuml.mopp.YumlTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createAssociation();
                      					incompleteObjects.push(element);
                      					// initialize boolean attributes
                      					element.eSet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ASSOCIATION__NAVIGABLE_SOURCE), false);
                      					completedElement(false, false);
                      					element.eSet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ASSOCIATION__NAVIGABLE_TARGET), false);
                      					completedElement(false, false);
                      				}
                      				if (a8_0 != null) {
                      					if (a8_0 != null) {
                      						element.eSet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ASSOCIATION__TARGET_CARDINALITY), a8_0);
                      						completedElement(a8_0, true);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_2_0_0_6, a8_0);
                      					copyLocalizationInfos(a8_0, element);
                      				}
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_26, 35);
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_0, 35, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_1);
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_1, 35, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_1);
              	
            }
            // Yuml.g:1494:2: ( ( (a9= '>' )? ) )?
            int alt16=2;
            switch ( input.LA(1) ) {
                case 21:
                    {
                    alt16=1;
                    }
                    break;
                case 11:
                    {
                    int LA16_2 = input.LA(2);

                    if ( (synpred16_Yuml()) ) {
                        alt16=1;
                    }
                    }
                    break;
                case 27:
                    {
                    int LA16_3 = input.LA(2);

                    if ( (synpred16_Yuml()) ) {
                        alt16=1;
                    }
                    }
                    break;
            }

            switch (alt16) {
                case 1 :
                    // Yuml.g:1495:3: ( (a9= '>' )? )
                    {
                    // Yuml.g:1495:3: ( (a9= '>' )? )
                    // Yuml.g:1496:4: (a9= '>' )?
                    {
                    // Yuml.g:1496:4: (a9= '>' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==21) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // Yuml.g:1497:5: a9= '>'
                            {
                            a9=(Token)match(input,21,FOLLOW_21_in_parse_west_twouse_language_yuml_Association1172); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              					if (element == null) {
                              						element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createAssociation();
                              						incompleteObjects.push(element);
                              						// initialize boolean attributes
                              						element.eSet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ASSOCIATION__NAVIGABLE_SOURCE), false);
                              						completedElement(false, false);
                              						element.eSet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ASSOCIATION__NAVIGABLE_TARGET), false);
                              						completedElement(false, false);
                              					}
                              					collectHiddenTokens(element);
                              					retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_2_0_0_7, null);
                              					copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a9, element);
                              					// set value of boolean attribute
                              					element.eSet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ASSOCIATION__NAVIGABLE_TARGET), true);
                              					completedElement(true, false);
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_0, 36, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_1);
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_1, 36, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_1);
              	
            }
            // Yuml.g:1522:2: (a12_0= parse_west_twouse_language_yuml_ColorableElement )
            // Yuml.g:1523:3: a12_0= parse_west_twouse_language_yuml_ColorableElement
            {
            pushFollow(FOLLOW_parse_west_twouse_language_yuml_ColorableElement_in_parse_west_twouse_language_yuml_Association1205);
            a12_0=parse_west_twouse_language_yuml_ColorableElement();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new west.twouse.language.yuml.resource.yuml.mopp.YumlTerminateParsingException();
              			}
              			if (element == null) {
              				element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createAssociation();
              				incompleteObjects.push(element);
              				// initialize boolean attributes
              				element.eSet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ASSOCIATION__NAVIGABLE_SOURCE), false);
              				completedElement(false, false);
              				element.eSet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ASSOCIATION__NAVIGABLE_TARGET), false);
              				completedElement(false, false);
              			}
              			if (a12_0 != null) {
              				if (a12_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ASSOCIATION__TARGET), a12_0);
              					completedElement(a12_0, true);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_2_0_0_8, a12_0);
              				copyLocalizationInfos(a12_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_2, 37);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, parse_west_twouse_language_yuml_Association_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_west_twouse_language_yuml_Association"


    // $ANTLR start "parse_west_twouse_language_yuml_Inheritance"
    // Yuml.g:1554:1: parse_west_twouse_language_yuml_Inheritance returns [west.twouse.language.yuml.Inheritance element = null] : ( ( (a0_0= parse_west_twouse_language_yuml_Class ) a1= '^' (a2_0= parse_west_twouse_language_yuml_ColorableElement ) ) | ( (a3_0= parse_west_twouse_language_yuml_Class ) a4= '-' ( (a5= TEXT ) )? a6= '^' (a7_0= parse_west_twouse_language_yuml_ColorableElement ) ) | ( (a8_0= parse_west_twouse_language_yuml_ColorableElement ) a9= '^' ( (a10= TEXT ) )? a11= '-' (a12_0= parse_west_twouse_language_yuml_Class ) ) );
    public final west.twouse.language.yuml.Inheritance parse_west_twouse_language_yuml_Inheritance() throws RecognitionException {
        west.twouse.language.yuml.Inheritance element =  null;
        int parse_west_twouse_language_yuml_Inheritance_StartIndex = input.index();
        Token a1=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a9=null;
        Token a10=null;
        Token a11=null;
        west.twouse.language.yuml.Class a0_0 = null;

        west.twouse.language.yuml.ColorableElement a2_0 = null;

        west.twouse.language.yuml.Class a3_0 = null;

        west.twouse.language.yuml.ColorableElement a7_0 = null;

        west.twouse.language.yuml.ColorableElement a8_0 = null;

        west.twouse.language.yuml.Class a12_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return element; }
            // Yuml.g:1557:1: ( ( (a0_0= parse_west_twouse_language_yuml_Class ) a1= '^' (a2_0= parse_west_twouse_language_yuml_ColorableElement ) ) | ( (a3_0= parse_west_twouse_language_yuml_Class ) a4= '-' ( (a5= TEXT ) )? a6= '^' (a7_0= parse_west_twouse_language_yuml_ColorableElement ) ) | ( (a8_0= parse_west_twouse_language_yuml_ColorableElement ) a9= '^' ( (a10= TEXT ) )? a11= '-' (a12_0= parse_west_twouse_language_yuml_Class ) ) )
            int alt19=3;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // Yuml.g:1558:2: ( (a0_0= parse_west_twouse_language_yuml_Class ) a1= '^' (a2_0= parse_west_twouse_language_yuml_ColorableElement ) )
                    {
                    // Yuml.g:1558:2: ( (a0_0= parse_west_twouse_language_yuml_Class ) a1= '^' (a2_0= parse_west_twouse_language_yuml_ColorableElement ) )
                    // Yuml.g:1559:3: (a0_0= parse_west_twouse_language_yuml_Class ) a1= '^' (a2_0= parse_west_twouse_language_yuml_ColorableElement )
                    {
                    // Yuml.g:1559:3: (a0_0= parse_west_twouse_language_yuml_Class )
                    // Yuml.g:1560:4: a0_0= parse_west_twouse_language_yuml_Class
                    {
                    pushFollow(FOLLOW_parse_west_twouse_language_yuml_Class_in_parse_west_twouse_language_yuml_Inheritance1247);
                    a0_0=parse_west_twouse_language_yuml_Class();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new west.twouse.language.yuml.resource.yuml.mopp.YumlTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createInheritance();
                      					incompleteObjects.push(element);
                      					// initialize boolean attributes
                      				}
                      				if (a0_0 != null) {
                      					if (a0_0 != null) {
                      						element.eSet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.INHERITANCE__SOURCE), a0_0);
                      						completedElement(a0_0, true);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_3_0_0_0_0_0_0, a0_0);
                      					copyLocalizationInfos(a0_0, element);
                      				}
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_23, 38);
                      		
                    }
                    a1=(Token)match(input,22,FOLLOW_22_in_parse_west_twouse_language_yuml_Inheritance1270); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      			if (element == null) {
                      				element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createInheritance();
                      				incompleteObjects.push(element);
                      				// initialize boolean attributes
                      			}
                      			collectHiddenTokens(element);
                      			retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_3_0_0_0_0_0_1, null);
                      			copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_0, 39, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_1);
                      			addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_1, 39, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_1);
                      		
                    }
                    // Yuml.g:1601:3: (a2_0= parse_west_twouse_language_yuml_ColorableElement )
                    // Yuml.g:1602:4: a2_0= parse_west_twouse_language_yuml_ColorableElement
                    {
                    pushFollow(FOLLOW_parse_west_twouse_language_yuml_ColorableElement_in_parse_west_twouse_language_yuml_Inheritance1292);
                    a2_0=parse_west_twouse_language_yuml_ColorableElement();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new west.twouse.language.yuml.resource.yuml.mopp.YumlTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createInheritance();
                      					incompleteObjects.push(element);
                      					// initialize boolean attributes
                      				}
                      				if (a2_0 != null) {
                      					if (a2_0 != null) {
                      						element.eSet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.INHERITANCE__TARGET), a2_0);
                      						completedElement(a2_0, true);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_3_0_0_0_0_0_2, a2_0);
                      					copyLocalizationInfos(a2_0, element);
                      				}
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_2, 40);
                      		
                    }

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_2, 41);
                      	
                    }

                    }
                    break;
                case 2 :
                    // Yuml.g:1634:4: ( (a3_0= parse_west_twouse_language_yuml_Class ) a4= '-' ( (a5= TEXT ) )? a6= '^' (a7_0= parse_west_twouse_language_yuml_ColorableElement ) )
                    {
                    // Yuml.g:1634:4: ( (a3_0= parse_west_twouse_language_yuml_Class ) a4= '-' ( (a5= TEXT ) )? a6= '^' (a7_0= parse_west_twouse_language_yuml_ColorableElement ) )
                    // Yuml.g:1635:3: (a3_0= parse_west_twouse_language_yuml_Class ) a4= '-' ( (a5= TEXT ) )? a6= '^' (a7_0= parse_west_twouse_language_yuml_ColorableElement )
                    {
                    // Yuml.g:1635:3: (a3_0= parse_west_twouse_language_yuml_Class )
                    // Yuml.g:1636:4: a3_0= parse_west_twouse_language_yuml_Class
                    {
                    pushFollow(FOLLOW_parse_west_twouse_language_yuml_Class_in_parse_west_twouse_language_yuml_Inheritance1335);
                    a3_0=parse_west_twouse_language_yuml_Class();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new west.twouse.language.yuml.resource.yuml.mopp.YumlTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createInheritance();
                      					incompleteObjects.push(element);
                      					// initialize boolean attributes
                      				}
                      				if (a3_0 != null) {
                      					if (a3_0 != null) {
                      						element.eSet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.INHERITANCE__SOURCE), a3_0);
                      						completedElement(a3_0, true);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_3_0_1_0_0_0_0, a3_0);
                      					copyLocalizationInfos(a3_0, element);
                      				}
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_27, 42);
                      		
                    }
                    a4=(Token)match(input,20,FOLLOW_20_in_parse_west_twouse_language_yuml_Inheritance1358); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      			if (element == null) {
                      				element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createInheritance();
                      				incompleteObjects.push(element);
                      				// initialize boolean attributes
                      			}
                      			collectHiddenTokens(element);
                      			retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_3_0_1_0_0_0_1, null);
                      			copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a4, element);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_28, 43);
                      			addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_29, 43);
                      		
                    }
                    // Yuml.g:1677:3: ( (a5= TEXT ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==TEXT) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // Yuml.g:1678:4: (a5= TEXT )
                            {
                            // Yuml.g:1678:4: (a5= TEXT )
                            // Yuml.g:1679:5: a5= TEXT
                            {
                            a5=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_west_twouse_language_yuml_Inheritance1386); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              					if (terminateParsing) {
                              						throw new west.twouse.language.yuml.resource.yuml.mopp.YumlTerminateParsingException();
                              					}
                              					if (element == null) {
                              						element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createInheritance();
                              						incompleteObjects.push(element);
                              						// initialize boolean attributes
                              					}
                              					if (a5 != null) {
                              						west.twouse.language.yuml.resource.yuml.IYumlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                              						tokenResolver.setOptions(getOptions());
                              						west.twouse.language.yuml.resource.yuml.IYumlTokenResolveResult result = getFreshTokenResolveResult();
                              						tokenResolver.resolve(a5.getText(), element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.INHERITANCE__TARGET_LABEL), result);
                              						Object resolvedObject = result.getResolvedToken();
                              						if (resolvedObject == null) {
                              							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a5).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a5).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a5).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a5).getStopIndex());
                              						}
                              						java.lang.String resolved = (java.lang.String)resolvedObject;
                              						if (resolved != null) {
                              							element.eSet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.INHERITANCE__TARGET_LABEL), resolved);
                              							completedElement(resolved, false);
                              						}
                              						collectHiddenTokens(element);
                              						retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_3_0_1_0_0_0_2, resolved);
                              						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a5, element);
                              					}
                              				
                            }

                            }


                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_29, 44);
                      		
                    }
                    a6=(Token)match(input,22,FOLLOW_22_in_parse_west_twouse_language_yuml_Inheritance1424); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      			if (element == null) {
                      				element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createInheritance();
                      				incompleteObjects.push(element);
                      				// initialize boolean attributes
                      			}
                      			collectHiddenTokens(element);
                      			retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_3_0_1_0_0_0_3, null);
                      			copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a6, element);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_0, 45, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_1);
                      			addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_1, 45, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_1);
                      		
                    }
                    // Yuml.g:1731:3: (a7_0= parse_west_twouse_language_yuml_ColorableElement )
                    // Yuml.g:1732:4: a7_0= parse_west_twouse_language_yuml_ColorableElement
                    {
                    pushFollow(FOLLOW_parse_west_twouse_language_yuml_ColorableElement_in_parse_west_twouse_language_yuml_Inheritance1446);
                    a7_0=parse_west_twouse_language_yuml_ColorableElement();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new west.twouse.language.yuml.resource.yuml.mopp.YumlTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createInheritance();
                      					incompleteObjects.push(element);
                      					// initialize boolean attributes
                      				}
                      				if (a7_0 != null) {
                      					if (a7_0 != null) {
                      						element.eSet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.INHERITANCE__TARGET), a7_0);
                      						completedElement(a7_0, true);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_3_0_1_0_0_0_4, a7_0);
                      					copyLocalizationInfos(a7_0, element);
                      				}
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_2, 46);
                      		
                    }

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_2, 47);
                      	
                    }

                    }
                    break;
                case 3 :
                    // Yuml.g:1764:4: ( (a8_0= parse_west_twouse_language_yuml_ColorableElement ) a9= '^' ( (a10= TEXT ) )? a11= '-' (a12_0= parse_west_twouse_language_yuml_Class ) )
                    {
                    // Yuml.g:1764:4: ( (a8_0= parse_west_twouse_language_yuml_ColorableElement ) a9= '^' ( (a10= TEXT ) )? a11= '-' (a12_0= parse_west_twouse_language_yuml_Class ) )
                    // Yuml.g:1765:3: (a8_0= parse_west_twouse_language_yuml_ColorableElement ) a9= '^' ( (a10= TEXT ) )? a11= '-' (a12_0= parse_west_twouse_language_yuml_Class )
                    {
                    // Yuml.g:1765:3: (a8_0= parse_west_twouse_language_yuml_ColorableElement )
                    // Yuml.g:1766:4: a8_0= parse_west_twouse_language_yuml_ColorableElement
                    {
                    pushFollow(FOLLOW_parse_west_twouse_language_yuml_ColorableElement_in_parse_west_twouse_language_yuml_Inheritance1489);
                    a8_0=parse_west_twouse_language_yuml_ColorableElement();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new west.twouse.language.yuml.resource.yuml.mopp.YumlTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createInheritance();
                      					incompleteObjects.push(element);
                      					// initialize boolean attributes
                      				}
                      				if (a8_0 != null) {
                      					if (a8_0 != null) {
                      						element.eSet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.INHERITANCE__TARGET), a8_0);
                      						completedElement(a8_0, true);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_3_0_2_0_0_0_0, a8_0);
                      					copyLocalizationInfos(a8_0, element);
                      				}
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_30, 48);
                      		
                    }
                    a9=(Token)match(input,22,FOLLOW_22_in_parse_west_twouse_language_yuml_Inheritance1512); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      			if (element == null) {
                      				element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createInheritance();
                      				incompleteObjects.push(element);
                      				// initialize boolean attributes
                      			}
                      			collectHiddenTokens(element);
                      			retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_3_0_2_0_0_0_1, null);
                      			copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a9, element);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_31, 49);
                      			addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_32, 49);
                      		
                    }
                    // Yuml.g:1807:3: ( (a10= TEXT ) )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==TEXT) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // Yuml.g:1808:4: (a10= TEXT )
                            {
                            // Yuml.g:1808:4: (a10= TEXT )
                            // Yuml.g:1809:5: a10= TEXT
                            {
                            a10=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_west_twouse_language_yuml_Inheritance1540); if (state.failed) return element;
                            if ( state.backtracking==0 ) {

                              					if (terminateParsing) {
                              						throw new west.twouse.language.yuml.resource.yuml.mopp.YumlTerminateParsingException();
                              					}
                              					if (element == null) {
                              						element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createInheritance();
                              						incompleteObjects.push(element);
                              						// initialize boolean attributes
                              					}
                              					if (a10 != null) {
                              						west.twouse.language.yuml.resource.yuml.IYumlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                              						tokenResolver.setOptions(getOptions());
                              						west.twouse.language.yuml.resource.yuml.IYumlTokenResolveResult result = getFreshTokenResolveResult();
                              						tokenResolver.resolve(a10.getText(), element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.INHERITANCE__TARGET_LABEL), result);
                              						Object resolvedObject = result.getResolvedToken();
                              						if (resolvedObject == null) {
                              							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a10).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a10).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a10).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a10).getStopIndex());
                              						}
                              						java.lang.String resolved = (java.lang.String)resolvedObject;
                              						if (resolved != null) {
                              							element.eSet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.INHERITANCE__TARGET_LABEL), resolved);
                              							completedElement(resolved, false);
                              						}
                              						collectHiddenTokens(element);
                              						retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_3_0_2_0_0_0_2, resolved);
                              						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a10, element);
                              					}
                              				
                            }

                            }


                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_32, 50);
                      		
                    }
                    a11=(Token)match(input,20,FOLLOW_20_in_parse_west_twouse_language_yuml_Inheritance1578); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      			if (element == null) {
                      				element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createInheritance();
                      				incompleteObjects.push(element);
                      				// initialize boolean attributes
                      			}
                      			collectHiddenTokens(element);
                      			retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_3_0_2_0_0_0_3, null);
                      			copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a11, element);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_0, 51, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_6);
                      		
                    }
                    // Yuml.g:1860:3: (a12_0= parse_west_twouse_language_yuml_Class )
                    // Yuml.g:1861:4: a12_0= parse_west_twouse_language_yuml_Class
                    {
                    pushFollow(FOLLOW_parse_west_twouse_language_yuml_Class_in_parse_west_twouse_language_yuml_Inheritance1600);
                    a12_0=parse_west_twouse_language_yuml_Class();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new west.twouse.language.yuml.resource.yuml.mopp.YumlTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createInheritance();
                      					incompleteObjects.push(element);
                      					// initialize boolean attributes
                      				}
                      				if (a12_0 != null) {
                      					if (a12_0 != null) {
                      						element.eSet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.INHERITANCE__SOURCE), a12_0);
                      						completedElement(a12_0, true);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_3_0_2_0_0_0_4, a12_0);
                      					copyLocalizationInfos(a12_0, element);
                      				}
                      			
                    }

                    }

                    if ( state.backtracking==0 ) {

                      			// expected elements (follow set)
                      			addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_2, 52);
                      		
                    }

                    }

                    if ( state.backtracking==0 ) {

                      		// expected elements (follow set)
                      		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_2, 53);
                      	
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
            if ( state.backtracking>0 ) { memoize(input, 5, parse_west_twouse_language_yuml_Inheritance_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_west_twouse_language_yuml_Inheritance"


    // $ANTLR start "parse_west_twouse_language_yuml_Cardinality"
    // Yuml.g:1894:1: parse_west_twouse_language_yuml_Cardinality returns [west.twouse.language.yuml.Cardinality element = null] : (a0= CARDINALITY ) ( (a1= '..' (a2= CARDINALITY ) ) )? ;
    public final west.twouse.language.yuml.Cardinality parse_west_twouse_language_yuml_Cardinality() throws RecognitionException {
        west.twouse.language.yuml.Cardinality element =  null;
        int parse_west_twouse_language_yuml_Cardinality_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return element; }
            // Yuml.g:1897:1: ( (a0= CARDINALITY ) ( (a1= '..' (a2= CARDINALITY ) ) )? )
            // Yuml.g:1898:2: (a0= CARDINALITY ) ( (a1= '..' (a2= CARDINALITY ) ) )?
            {
            // Yuml.g:1898:2: (a0= CARDINALITY )
            // Yuml.g:1899:3: a0= CARDINALITY
            {
            a0=(Token)match(input,CARDINALITY,FOLLOW_CARDINALITY_in_parse_west_twouse_language_yuml_Cardinality1649); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new west.twouse.language.yuml.resource.yuml.mopp.YumlTerminateParsingException();
              			}
              			if (element == null) {
              				element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createCardinality();
              				incompleteObjects.push(element);
              				// initialize boolean attributes
              			}
              			if (a0 != null) {
              				west.twouse.language.yuml.resource.yuml.IYumlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("CARDINALITY");
              				tokenResolver.setOptions(getOptions());
              				west.twouse.language.yuml.resource.yuml.IYumlTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.CARDINALITY__LOWER_BOUND), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.CARDINALITY__LOWER_BOUND), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_4_0_0_0, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_33, 54);
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_22, 54);
              	
            }
            // Yuml.g:1935:2: ( (a1= '..' (a2= CARDINALITY ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==23) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // Yuml.g:1936:3: (a1= '..' (a2= CARDINALITY ) )
                    {
                    // Yuml.g:1936:3: (a1= '..' (a2= CARDINALITY ) )
                    // Yuml.g:1937:4: a1= '..' (a2= CARDINALITY )
                    {
                    a1=(Token)match(input,23,FOLLOW_23_in_parse_west_twouse_language_yuml_Cardinality1679); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createCardinality();
                      					incompleteObjects.push(element);
                      					// initialize boolean attributes
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_4_0_0_1_0_0_0, null);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_34, 55);
                      			
                    }
                    // Yuml.g:1952:4: (a2= CARDINALITY )
                    // Yuml.g:1953:5: a2= CARDINALITY
                    {
                    a2=(Token)match(input,CARDINALITY,FOLLOW_CARDINALITY_in_parse_west_twouse_language_yuml_Cardinality1705); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new west.twouse.language.yuml.resource.yuml.mopp.YumlTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createCardinality();
                      						incompleteObjects.push(element);
                      						// initialize boolean attributes
                      					}
                      					if (a2 != null) {
                      						west.twouse.language.yuml.resource.yuml.IYumlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("CARDINALITY");
                      						tokenResolver.setOptions(getOptions());
                      						west.twouse.language.yuml.resource.yuml.IYumlTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.CARDINALITY__UPPER_BOUND), result);
                      						Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStopIndex());
                      						}
                      						java.lang.String resolved = (java.lang.String)resolvedObject;
                      						if (resolved != null) {
                      							element.eSet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.CARDINALITY__UPPER_BOUND), resolved);
                      							completedElement(resolved, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_4_0_0_1_0_0_1, resolved);
                      						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_22, 56);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_22, 57);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, parse_west_twouse_language_yuml_Cardinality_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_west_twouse_language_yuml_Cardinality"


    // $ANTLR start "parse_west_twouse_language_yuml_Attribute"
    // Yuml.g:1997:1: parse_west_twouse_language_yuml_Attribute returns [west.twouse.language.yuml.Attribute element = null] : ( (a0= VISIBILITY ) )? ( (a1= '<<' (a2= ALPHANUM ) a3= '>>' ) )? (a4= TEXT ) ( (a5= ' : ' (a6= TEXT ) ) )? ;
    public final west.twouse.language.yuml.Attribute parse_west_twouse_language_yuml_Attribute() throws RecognitionException {
        west.twouse.language.yuml.Attribute element =  null;
        int parse_west_twouse_language_yuml_Attribute_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return element; }
            // Yuml.g:2000:1: ( ( (a0= VISIBILITY ) )? ( (a1= '<<' (a2= ALPHANUM ) a3= '>>' ) )? (a4= TEXT ) ( (a5= ' : ' (a6= TEXT ) ) )? )
            // Yuml.g:2001:2: ( (a0= VISIBILITY ) )? ( (a1= '<<' (a2= ALPHANUM ) a3= '>>' ) )? (a4= TEXT ) ( (a5= ' : ' (a6= TEXT ) ) )?
            {
            // Yuml.g:2001:2: ( (a0= VISIBILITY ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==VISIBILITY) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // Yuml.g:2002:3: (a0= VISIBILITY )
                    {
                    // Yuml.g:2002:3: (a0= VISIBILITY )
                    // Yuml.g:2003:4: a0= VISIBILITY
                    {
                    a0=(Token)match(input,VISIBILITY,FOLLOW_VISIBILITY_in_parse_west_twouse_language_yuml_Attribute1775); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new west.twouse.language.yuml.resource.yuml.mopp.YumlTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createAttribute();
                      					incompleteObjects.push(element);
                      					// initialize boolean attributes
                      				}
                      				if (a0 != null) {
                      					west.twouse.language.yuml.resource.yuml.IYumlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("VISIBILITY");
                      					tokenResolver.setOptions(getOptions());
                      					west.twouse.language.yuml.resource.yuml.IYumlTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ATTRIBUTE__VISIBILITY), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStopIndex());
                      					}
                      					west.twouse.language.yuml.Visibility resolved = (west.twouse.language.yuml.Visibility)resolvedObject;
                      					if (resolved != null) {
                      						element.eSet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ATTRIBUTE__VISIBILITY), resolved);
                      						completedElement(resolved, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_5_0_0_0, resolved);
                      					copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a0, element);
                      				}
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_12, 58);
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_13, 58);
              	
            }
            // Yuml.g:2040:2: ( (a1= '<<' (a2= ALPHANUM ) a3= '>>' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==12) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // Yuml.g:2041:3: (a1= '<<' (a2= ALPHANUM ) a3= '>>' )
                    {
                    // Yuml.g:2041:3: (a1= '<<' (a2= ALPHANUM ) a3= '>>' )
                    // Yuml.g:2042:4: a1= '<<' (a2= ALPHANUM ) a3= '>>'
                    {
                    a1=(Token)match(input,12,FOLLOW_12_in_parse_west_twouse_language_yuml_Attribute1814); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createAttribute();
                      					incompleteObjects.push(element);
                      					// initialize boolean attributes
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_5_0_0_1_0_0_0, null);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_35, 59);
                      			
                    }
                    // Yuml.g:2057:4: (a2= ALPHANUM )
                    // Yuml.g:2058:5: a2= ALPHANUM
                    {
                    a2=(Token)match(input,ALPHANUM,FOLLOW_ALPHANUM_in_parse_west_twouse_language_yuml_Attribute1840); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new west.twouse.language.yuml.resource.yuml.mopp.YumlTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createAttribute();
                      						incompleteObjects.push(element);
                      						// initialize boolean attributes
                      					}
                      					if (a2 != null) {
                      						west.twouse.language.yuml.resource.yuml.IYumlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("ALPHANUM");
                      						tokenResolver.setOptions(getOptions());
                      						west.twouse.language.yuml.resource.yuml.IYumlTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ATTRIBUTE__STEREOTYPE), result);
                      						Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStopIndex());
                      						}
                      						java.lang.String resolved = (java.lang.String)resolvedObject;
                      						if (resolved != null) {
                      							element.eSet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ATTRIBUTE__STEREOTYPE), resolved);
                      							completedElement(resolved, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_5_0_0_1_0_0_1, resolved);
                      						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_36, 60);
                      			
                    }
                    a3=(Token)match(input,13,FOLLOW_13_in_parse_west_twouse_language_yuml_Attribute1873); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createAttribute();
                      					incompleteObjects.push(element);
                      					// initialize boolean attributes
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_5_0_0_1_0_0_2, null);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_13, 61);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_13, 62);
              	
            }
            // Yuml.g:2115:2: (a4= TEXT )
            // Yuml.g:2116:3: a4= TEXT
            {
            a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_west_twouse_language_yuml_Attribute1910); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new west.twouse.language.yuml.resource.yuml.mopp.YumlTerminateParsingException();
              			}
              			if (element == null) {
              				element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createAttribute();
              				incompleteObjects.push(element);
              				// initialize boolean attributes
              			}
              			if (a4 != null) {
              				west.twouse.language.yuml.resource.yuml.IYumlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				west.twouse.language.yuml.resource.yuml.IYumlTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ATTRIBUTE__NAME), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ATTRIBUTE__NAME), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_5_0_0_2, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a4, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_37, 63);
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_14, 63);
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_8, 63);
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_9, 63);
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_10, 63);
              	
            }
            // Yuml.g:2155:2: ( (a5= ' : ' (a6= TEXT ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==24) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // Yuml.g:2156:3: (a5= ' : ' (a6= TEXT ) )
                    {
                    // Yuml.g:2156:3: (a5= ' : ' (a6= TEXT ) )
                    // Yuml.g:2157:4: a5= ' : ' (a6= TEXT )
                    {
                    a5=(Token)match(input,24,FOLLOW_24_in_parse_west_twouse_language_yuml_Attribute1940); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createAttribute();
                      					incompleteObjects.push(element);
                      					// initialize boolean attributes
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_5_0_0_3_0_0_0, null);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a5, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_38, 64);
                      			
                    }
                    // Yuml.g:2172:4: (a6= TEXT )
                    // Yuml.g:2173:5: a6= TEXT
                    {
                    a6=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_west_twouse_language_yuml_Attribute1966); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new west.twouse.language.yuml.resource.yuml.mopp.YumlTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createAttribute();
                      						incompleteObjects.push(element);
                      						// initialize boolean attributes
                      					}
                      					if (a6 != null) {
                      						west.twouse.language.yuml.resource.yuml.IYumlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                      						tokenResolver.setOptions(getOptions());
                      						west.twouse.language.yuml.resource.yuml.IYumlTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a6.getText(), element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ATTRIBUTE__TYPE), result);
                      						Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a6).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a6).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a6).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a6).getStopIndex());
                      						}
                      						java.lang.String resolved = (java.lang.String)resolvedObject;
                      						if (resolved != null) {
                      							element.eSet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ATTRIBUTE__TYPE), resolved);
                      							completedElement(resolved, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_5_0_0_3_0_0_1, resolved);
                      						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a6, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_14, 65);
                      				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_8, 65);
                      				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_9, 65);
                      				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_10, 65);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_14, 66);
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_8, 66);
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_9, 66);
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_10, 66);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, parse_west_twouse_language_yuml_Attribute_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_west_twouse_language_yuml_Attribute"


    // $ANTLR start "parse_west_twouse_language_yuml_Method"
    // Yuml.g:2223:1: parse_west_twouse_language_yuml_Method returns [west.twouse.language.yuml.Method element = null] : (a0= TEXT ) a1= '(' ( ( (a2= TEXT ) ( (a3= ',' (a4= TEXT ) ) )* ) )? a5= ')' ;
    public final west.twouse.language.yuml.Method parse_west_twouse_language_yuml_Method() throws RecognitionException {
        west.twouse.language.yuml.Method element =  null;
        int parse_west_twouse_language_yuml_Method_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return element; }
            // Yuml.g:2226:1: ( (a0= TEXT ) a1= '(' ( ( (a2= TEXT ) ( (a3= ',' (a4= TEXT ) ) )* ) )? a5= ')' )
            // Yuml.g:2227:2: (a0= TEXT ) a1= '(' ( ( (a2= TEXT ) ( (a3= ',' (a4= TEXT ) ) )* ) )? a5= ')'
            {
            // Yuml.g:2227:2: (a0= TEXT )
            // Yuml.g:2228:3: a0= TEXT
            {
            a0=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_west_twouse_language_yuml_Method2031); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new west.twouse.language.yuml.resource.yuml.mopp.YumlTerminateParsingException();
              			}
              			if (element == null) {
              				element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createMethod();
              				incompleteObjects.push(element);
              				// initialize boolean attributes
              			}
              			if (a0 != null) {
              				west.twouse.language.yuml.resource.yuml.IYumlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				west.twouse.language.yuml.resource.yuml.IYumlTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.METHOD__NAME), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a0).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.METHOD__NAME), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_6_0_0_0, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_39, 67);
              	
            }
            a1=(Token)match(input,25,FOLLOW_25_in_parse_west_twouse_language_yuml_Method2052); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createMethod();
              			incompleteObjects.push(element);
              			// initialize boolean attributes
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_6_0_0_1, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_40, 68);
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_41, 68);
              	
            }
            // Yuml.g:2279:2: ( ( (a2= TEXT ) ( (a3= ',' (a4= TEXT ) ) )* ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==TEXT) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // Yuml.g:2280:3: ( (a2= TEXT ) ( (a3= ',' (a4= TEXT ) ) )* )
                    {
                    // Yuml.g:2280:3: ( (a2= TEXT ) ( (a3= ',' (a4= TEXT ) ) )* )
                    // Yuml.g:2281:4: (a2= TEXT ) ( (a3= ',' (a4= TEXT ) ) )*
                    {
                    // Yuml.g:2281:4: (a2= TEXT )
                    // Yuml.g:2282:5: a2= TEXT
                    {
                    a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_west_twouse_language_yuml_Method2081); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new west.twouse.language.yuml.resource.yuml.mopp.YumlTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createMethod();
                      						incompleteObjects.push(element);
                      						// initialize boolean attributes
                      					}
                      					if (a2 != null) {
                      						west.twouse.language.yuml.resource.yuml.IYumlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                      						tokenResolver.setOptions(getOptions());
                      						west.twouse.language.yuml.resource.yuml.IYumlTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.METHOD__ARGUMENTS), result);
                      						Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStopIndex());
                      						}
                      						java.lang.String resolved = (java.lang.String)resolvedObject;
                      						if (resolved != null) {
                      							addObjectToList(element, west.twouse.language.yuml.YumlPackage.METHOD__ARGUMENTS, resolved);
                      							completedElement(resolved, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_6_0_0_2_0_0_0, resolved);
                      						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_42, 69);
                      				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_41, 69);
                      			
                    }
                    // Yuml.g:2318:4: ( (a3= ',' (a4= TEXT ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==10) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // Yuml.g:2319:5: (a3= ',' (a4= TEXT ) )
                    	    {
                    	    // Yuml.g:2319:5: (a3= ',' (a4= TEXT ) )
                    	    // Yuml.g:2320:6: a3= ',' (a4= TEXT )
                    	    {
                    	    a3=(Token)match(input,10,FOLLOW_10_in_parse_west_twouse_language_yuml_Method2127); if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      						if (element == null) {
                    	      							element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createMethod();
                    	      							incompleteObjects.push(element);
                    	      							// initialize boolean attributes
                    	      						}
                    	      						collectHiddenTokens(element);
                    	      						retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_6_0_0_2_0_0_1_0_0_0, null);
                    	      						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
                    	      					
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      						// expected elements (follow set)
                    	      						addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_43, 70);
                    	      					
                    	    }
                    	    // Yuml.g:2335:6: (a4= TEXT )
                    	    // Yuml.g:2336:7: a4= TEXT
                    	    {
                    	    a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_west_twouse_language_yuml_Method2161); if (state.failed) return element;
                    	    if ( state.backtracking==0 ) {

                    	      							if (terminateParsing) {
                    	      								throw new west.twouse.language.yuml.resource.yuml.mopp.YumlTerminateParsingException();
                    	      							}
                    	      							if (element == null) {
                    	      								element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createMethod();
                    	      								incompleteObjects.push(element);
                    	      								// initialize boolean attributes
                    	      							}
                    	      							if (a4 != null) {
                    	      								west.twouse.language.yuml.resource.yuml.IYumlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                    	      								tokenResolver.setOptions(getOptions());
                    	      								west.twouse.language.yuml.resource.yuml.IYumlTokenResolveResult result = getFreshTokenResolveResult();
                    	      								tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.METHOD__ARGUMENTS), result);
                    	      								Object resolvedObject = result.getResolvedToken();
                    	      								if (resolvedObject == null) {
                    	      									addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStopIndex());
                    	      								}
                    	      								java.lang.String resolved = (java.lang.String)resolvedObject;
                    	      								if (resolved != null) {
                    	      									addObjectToList(element, west.twouse.language.yuml.YumlPackage.METHOD__ARGUMENTS, resolved);
                    	      									completedElement(resolved, false);
                    	      								}
                    	      								collectHiddenTokens(element);
                    	      								retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_6_0_0_2_0_0_1_0_0_1, resolved);
                    	      								copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a4, element);
                    	      							}
                    	      						
                    	    }

                    	    }

                    	    if ( state.backtracking==0 ) {

                    	      						// expected elements (follow set)
                    	      						addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_42, 71);
                    	      						addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_41, 71);
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_42, 72);
                      				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_41, 72);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_41, 73);
              	
            }
            a5=(Token)match(input,26,FOLLOW_26_in_parse_west_twouse_language_yuml_Method2242); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createMethod();
              			incompleteObjects.push(element);
              			// initialize boolean attributes
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_6_0_0_3, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_16, 74);
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_9, 74);
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_10, 74);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, parse_west_twouse_language_yuml_Method_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_west_twouse_language_yuml_Method"


    // $ANTLR start "parse_west_twouse_language_yuml_Note"
    // Yuml.g:2406:1: parse_west_twouse_language_yuml_Note returns [west.twouse.language.yuml.Note element = null] : a0= '[note: ' (a1= TEXT ) ( (a2= '{bg:' (a3= TEXT ) a4= '}' ) )? a5= ']' ;
    public final west.twouse.language.yuml.Note parse_west_twouse_language_yuml_Note() throws RecognitionException {
        west.twouse.language.yuml.Note element =  null;
        int parse_west_twouse_language_yuml_Note_StartIndex = input.index();
        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return element; }
            // Yuml.g:2409:1: (a0= '[note: ' (a1= TEXT ) ( (a2= '{bg:' (a3= TEXT ) a4= '}' ) )? a5= ']' )
            // Yuml.g:2410:2: a0= '[note: ' (a1= TEXT ) ( (a2= '{bg:' (a3= TEXT ) a4= '}' ) )? a5= ']'
            {
            a0=(Token)match(input,27,FOLLOW_27_in_parse_west_twouse_language_yuml_Note2271); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createNote();
              			incompleteObjects.push(element);
              			// initialize boolean attributes
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_7_0_0_0, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_44, 75);
              	
            }
            // Yuml.g:2425:2: (a1= TEXT )
            // Yuml.g:2426:3: a1= TEXT
            {
            a1=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_west_twouse_language_yuml_Note2289); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new west.twouse.language.yuml.resource.yuml.mopp.YumlTerminateParsingException();
              			}
              			if (element == null) {
              				element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createNote();
              				incompleteObjects.push(element);
              				// initialize boolean attributes
              			}
              			if (a1 != null) {
              				west.twouse.language.yuml.resource.yuml.IYumlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
              				tokenResolver.setOptions(getOptions());
              				west.twouse.language.yuml.resource.yuml.IYumlTokenResolveResult result = getFreshTokenResolveResult();
              				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.NOTE__TEXT), result);
              				Object resolvedObject = result.getResolvedToken();
              				if (resolvedObject == null) {
              					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a1).getStopIndex());
              				}
              				java.lang.String resolved = (java.lang.String)resolvedObject;
              				if (resolved != null) {
              					element.eSet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.NOTE__TEXT), resolved);
              					completedElement(resolved, false);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_7_0_0_1, resolved);
              				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a1, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_45, 76);
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_46, 76);
              	
            }
            // Yuml.g:2462:2: ( (a2= '{bg:' (a3= TEXT ) a4= '}' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==16) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // Yuml.g:2463:3: (a2= '{bg:' (a3= TEXT ) a4= '}' )
                    {
                    // Yuml.g:2463:3: (a2= '{bg:' (a3= TEXT ) a4= '}' )
                    // Yuml.g:2464:4: a2= '{bg:' (a3= TEXT ) a4= '}'
                    {
                    a2=(Token)match(input,16,FOLLOW_16_in_parse_west_twouse_language_yuml_Note2319); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createNote();
                      					incompleteObjects.push(element);
                      					// initialize boolean attributes
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_7_0_0_2_0_0_0, null);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_47, 77);
                      			
                    }
                    // Yuml.g:2479:4: (a3= TEXT )
                    // Yuml.g:2480:5: a3= TEXT
                    {
                    a3=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_west_twouse_language_yuml_Note2345); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      					if (terminateParsing) {
                      						throw new west.twouse.language.yuml.resource.yuml.mopp.YumlTerminateParsingException();
                      					}
                      					if (element == null) {
                      						element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createNote();
                      						incompleteObjects.push(element);
                      						// initialize boolean attributes
                      					}
                      					if (a3 != null) {
                      						west.twouse.language.yuml.resource.yuml.IYumlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                      						tokenResolver.setOptions(getOptions());
                      						west.twouse.language.yuml.resource.yuml.IYumlTokenResolveResult result = getFreshTokenResolveResult();
                      						tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.NOTE__COLOR), result);
                      						Object resolvedObject = result.getResolvedToken();
                      						if (resolvedObject == null) {
                      							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a3).getStopIndex());
                      						}
                      						java.lang.String resolved = (java.lang.String)resolvedObject;
                      						if (resolved != null) {
                      							element.eSet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.NOTE__COLOR), resolved);
                      							completedElement(resolved, false);
                      						}
                      						collectHiddenTokens(element);
                      						retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_7_0_0_2_0_0_1, resolved);
                      						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a3, element);
                      					}
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_48, 78);
                      			
                    }
                    a4=(Token)match(input,17,FOLLOW_17_in_parse_west_twouse_language_yuml_Note2378); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (element == null) {
                      					element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createNote();
                      					incompleteObjects.push(element);
                      					// initialize boolean attributes
                      				}
                      				collectHiddenTokens(element);
                      				retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_7_0_0_2_0_0_2, null);
                      				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a4, element);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				// expected elements (follow set)
                      				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_46, 79);
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_46, 80);
              	
            }
            a5=(Token)match(input,18,FOLLOW_18_in_parse_west_twouse_language_yuml_Note2411); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createNote();
              			incompleteObjects.push(element);
              			// initialize boolean attributes
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_7_0_0_3, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_2, 81);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, parse_west_twouse_language_yuml_Note_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_west_twouse_language_yuml_Note"


    // $ANTLR start "parse_west_twouse_language_yuml_Equivalence"
    // Yuml.g:2554:1: parse_west_twouse_language_yuml_Equivalence returns [west.twouse.language.yuml.Equivalence element = null] : (a0_0= parse_west_twouse_language_yuml_Class ) a1= '^' ( (a2= TEXT ) )? a3= '-' ( (a4= TEXT ) )? a5= '^' (a6_0= parse_west_twouse_language_yuml_ColorableElement ) ;
    public final west.twouse.language.yuml.Equivalence parse_west_twouse_language_yuml_Equivalence() throws RecognitionException {
        west.twouse.language.yuml.Equivalence element =  null;
        int parse_west_twouse_language_yuml_Equivalence_StartIndex = input.index();
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        west.twouse.language.yuml.Class a0_0 = null;

        west.twouse.language.yuml.ColorableElement a6_0 = null;




        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return element; }
            // Yuml.g:2557:1: ( (a0_0= parse_west_twouse_language_yuml_Class ) a1= '^' ( (a2= TEXT ) )? a3= '-' ( (a4= TEXT ) )? a5= '^' (a6_0= parse_west_twouse_language_yuml_ColorableElement ) )
            // Yuml.g:2558:2: (a0_0= parse_west_twouse_language_yuml_Class ) a1= '^' ( (a2= TEXT ) )? a3= '-' ( (a4= TEXT ) )? a5= '^' (a6_0= parse_west_twouse_language_yuml_ColorableElement )
            {
            // Yuml.g:2558:2: (a0_0= parse_west_twouse_language_yuml_Class )
            // Yuml.g:2559:3: a0_0= parse_west_twouse_language_yuml_Class
            {
            pushFollow(FOLLOW_parse_west_twouse_language_yuml_Class_in_parse_west_twouse_language_yuml_Equivalence2444);
            a0_0=parse_west_twouse_language_yuml_Class();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new west.twouse.language.yuml.resource.yuml.mopp.YumlTerminateParsingException();
              			}
              			if (element == null) {
              				element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createEquivalence();
              				incompleteObjects.push(element);
              				// initialize boolean attributes
              			}
              			if (a0_0 != null) {
              				if (a0_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.EQUIVALENCE__SOURCE), a0_0);
              					completedElement(a0_0, true);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_8_0_0_0, a0_0);
              				copyLocalizationInfos(a0_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_24, 82);
              	
            }
            a1=(Token)match(input,22,FOLLOW_22_in_parse_west_twouse_language_yuml_Equivalence2462); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createEquivalence();
              			incompleteObjects.push(element);
              			// initialize boolean attributes
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_8_0_0_1, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_49, 83);
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_50, 83);
              	
            }
            // Yuml.g:2600:2: ( (a2= TEXT ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==TEXT) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // Yuml.g:2601:3: (a2= TEXT )
                    {
                    // Yuml.g:2601:3: (a2= TEXT )
                    // Yuml.g:2602:4: a2= TEXT
                    {
                    a2=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_west_twouse_language_yuml_Equivalence2485); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new west.twouse.language.yuml.resource.yuml.mopp.YumlTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createEquivalence();
                      					incompleteObjects.push(element);
                      					// initialize boolean attributes
                      				}
                      				if (a2 != null) {
                      					west.twouse.language.yuml.resource.yuml.IYumlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                      					tokenResolver.setOptions(getOptions());
                      					west.twouse.language.yuml.resource.yuml.IYumlTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.EQUIVALENCE__SOURCE_LABEL), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a2).getStopIndex());
                      					}
                      					java.lang.String resolved = (java.lang.String)resolvedObject;
                      					if (resolved != null) {
                      						element.eSet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.EQUIVALENCE__SOURCE_LABEL), resolved);
                      						completedElement(resolved, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_8_0_0_2, resolved);
                      					copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a2, element);
                      				}
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_50, 84);
              	
            }
            a3=(Token)match(input,20,FOLLOW_20_in_parse_west_twouse_language_yuml_Equivalence2515); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createEquivalence();
              			incompleteObjects.push(element);
              			// initialize boolean attributes
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_8_0_0_3, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_51, 85);
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_52, 85);
              	
            }
            // Yuml.g:2654:2: ( (a4= TEXT ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==TEXT) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // Yuml.g:2655:3: (a4= TEXT )
                    {
                    // Yuml.g:2655:3: (a4= TEXT )
                    // Yuml.g:2656:4: a4= TEXT
                    {
                    a4=(Token)match(input,TEXT,FOLLOW_TEXT_in_parse_west_twouse_language_yuml_Equivalence2538); if (state.failed) return element;
                    if ( state.backtracking==0 ) {

                      				if (terminateParsing) {
                      					throw new west.twouse.language.yuml.resource.yuml.mopp.YumlTerminateParsingException();
                      				}
                      				if (element == null) {
                      					element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createEquivalence();
                      					incompleteObjects.push(element);
                      					// initialize boolean attributes
                      				}
                      				if (a4 != null) {
                      					west.twouse.language.yuml.resource.yuml.IYumlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("TEXT");
                      					tokenResolver.setOptions(getOptions());
                      					west.twouse.language.yuml.resource.yuml.IYumlTokenResolveResult result = getFreshTokenResolveResult();
                      					tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.EQUIVALENCE__TARGET_LABEL), result);
                      					Object resolvedObject = result.getResolvedToken();
                      					if (resolvedObject == null) {
                      						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_2_0.CommonToken) a4).getLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStartIndex(), ((org.antlr.runtime3_2_0.CommonToken) a4).getStopIndex());
                      					}
                      					java.lang.String resolved = (java.lang.String)resolvedObject;
                      					if (resolved != null) {
                      						element.eSet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.EQUIVALENCE__TARGET_LABEL), resolved);
                      						completedElement(resolved, false);
                      					}
                      					collectHiddenTokens(element);
                      					retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_8_0_0_4, resolved);
                      					copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken) a4, element);
                      				}
                      			
                    }

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_52, 86);
              	
            }
            a5=(Token)match(input,22,FOLLOW_22_in_parse_west_twouse_language_yuml_Equivalence2568); if (state.failed) return element;
            if ( state.backtracking==0 ) {

              		if (element == null) {
              			element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createEquivalence();
              			incompleteObjects.push(element);
              			// initialize boolean attributes
              		}
              		collectHiddenTokens(element);
              		retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_8_0_0_5, null);
              		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a5, element);
              	
            }
            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_0, 87, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_1);
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_1, 87, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_1);
              	
            }
            // Yuml.g:2708:2: (a6_0= parse_west_twouse_language_yuml_ColorableElement )
            // Yuml.g:2709:3: a6_0= parse_west_twouse_language_yuml_ColorableElement
            {
            pushFollow(FOLLOW_parse_west_twouse_language_yuml_ColorableElement_in_parse_west_twouse_language_yuml_Equivalence2586);
            a6_0=parse_west_twouse_language_yuml_ColorableElement();

            state._fsp--;
            if (state.failed) return element;
            if ( state.backtracking==0 ) {

              			if (terminateParsing) {
              				throw new west.twouse.language.yuml.resource.yuml.mopp.YumlTerminateParsingException();
              			}
              			if (element == null) {
              				element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createEquivalence();
              				incompleteObjects.push(element);
              				// initialize boolean attributes
              			}
              			if (a6_0 != null) {
              				if (a6_0 != null) {
              					element.eSet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.EQUIVALENCE__TARGET), a6_0);
              					completedElement(a6_0, true);
              				}
              				collectHiddenTokens(element);
              				retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_8_0_0_6, a6_0);
              				copyLocalizationInfos(a6_0, element);
              			}
              		
            }

            }

            if ( state.backtracking==0 ) {

              		// expected elements (follow set)
              		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_2, 88);
              	
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, parse_west_twouse_language_yuml_Equivalence_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_west_twouse_language_yuml_Equivalence"


    // $ANTLR start "parse_west_twouse_language_yuml_ModelElement"
    // Yuml.g:2736:1: parse_west_twouse_language_yuml_ModelElement returns [west.twouse.language.yuml.ModelElement element = null] : (c0= parse_west_twouse_language_yuml_Class | c1= parse_west_twouse_language_yuml_Association | c2= parse_west_twouse_language_yuml_Inheritance | c3= parse_west_twouse_language_yuml_Note | c4= parse_west_twouse_language_yuml_Equivalence );
    public final west.twouse.language.yuml.ModelElement parse_west_twouse_language_yuml_ModelElement() throws RecognitionException {
        west.twouse.language.yuml.ModelElement element =  null;
        int parse_west_twouse_language_yuml_ModelElement_StartIndex = input.index();
        west.twouse.language.yuml.Class c0 = null;

        west.twouse.language.yuml.Association c1 = null;

        west.twouse.language.yuml.Inheritance c2 = null;

        west.twouse.language.yuml.Note c3 = null;

        west.twouse.language.yuml.Equivalence c4 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return element; }
            // Yuml.g:2737:1: (c0= parse_west_twouse_language_yuml_Class | c1= parse_west_twouse_language_yuml_Association | c2= parse_west_twouse_language_yuml_Inheritance | c3= parse_west_twouse_language_yuml_Note | c4= parse_west_twouse_language_yuml_Equivalence )
            int alt29=5;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // Yuml.g:2738:2: c0= parse_west_twouse_language_yuml_Class
                    {
                    pushFollow(FOLLOW_parse_west_twouse_language_yuml_Class_in_parse_west_twouse_language_yuml_ModelElement2615);
                    c0=parse_west_twouse_language_yuml_Class();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // Yuml.g:2739:4: c1= parse_west_twouse_language_yuml_Association
                    {
                    pushFollow(FOLLOW_parse_west_twouse_language_yuml_Association_in_parse_west_twouse_language_yuml_ModelElement2625);
                    c1=parse_west_twouse_language_yuml_Association();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 3 :
                    // Yuml.g:2740:4: c2= parse_west_twouse_language_yuml_Inheritance
                    {
                    pushFollow(FOLLOW_parse_west_twouse_language_yuml_Inheritance_in_parse_west_twouse_language_yuml_ModelElement2635);
                    c2=parse_west_twouse_language_yuml_Inheritance();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c2; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 4 :
                    // Yuml.g:2741:4: c3= parse_west_twouse_language_yuml_Note
                    {
                    pushFollow(FOLLOW_parse_west_twouse_language_yuml_Note_in_parse_west_twouse_language_yuml_ModelElement2645);
                    c3=parse_west_twouse_language_yuml_Note();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c3; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 5 :
                    // Yuml.g:2742:4: c4= parse_west_twouse_language_yuml_Equivalence
                    {
                    pushFollow(FOLLOW_parse_west_twouse_language_yuml_Equivalence_in_parse_west_twouse_language_yuml_ModelElement2655);
                    c4=parse_west_twouse_language_yuml_Equivalence();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c4; /* this is a subclass or primitive expression choice */ 
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
            if ( state.backtracking>0 ) { memoize(input, 11, parse_west_twouse_language_yuml_ModelElement_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_west_twouse_language_yuml_ModelElement"


    // $ANTLR start "parse_west_twouse_language_yuml_ColorableElement"
    // Yuml.g:2746:1: parse_west_twouse_language_yuml_ColorableElement returns [west.twouse.language.yuml.ColorableElement element = null] : (c0= parse_west_twouse_language_yuml_Class | c1= parse_west_twouse_language_yuml_Note );
    public final west.twouse.language.yuml.ColorableElement parse_west_twouse_language_yuml_ColorableElement() throws RecognitionException {
        west.twouse.language.yuml.ColorableElement element =  null;
        int parse_west_twouse_language_yuml_ColorableElement_StartIndex = input.index();
        west.twouse.language.yuml.Class c0 = null;

        west.twouse.language.yuml.Note c1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return element; }
            // Yuml.g:2747:1: (c0= parse_west_twouse_language_yuml_Class | c1= parse_west_twouse_language_yuml_Note )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==11) ) {
                alt30=1;
            }
            else if ( (LA30_0==27) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // Yuml.g:2748:2: c0= parse_west_twouse_language_yuml_Class
                    {
                    pushFollow(FOLLOW_parse_west_twouse_language_yuml_Class_in_parse_west_twouse_language_yuml_ColorableElement2676);
                    c0=parse_west_twouse_language_yuml_Class();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c0; /* this is a subclass or primitive expression choice */ 
                    }

                    }
                    break;
                case 2 :
                    // Yuml.g:2749:4: c1= parse_west_twouse_language_yuml_Note
                    {
                    pushFollow(FOLLOW_parse_west_twouse_language_yuml_Note_in_parse_west_twouse_language_yuml_ColorableElement2686);
                    c1=parse_west_twouse_language_yuml_Note();

                    state._fsp--;
                    if (state.failed) return element;
                    if ( state.backtracking==0 ) {
                       element = c1; /* this is a subclass or primitive expression choice */ 
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
            if ( state.backtracking>0 ) { memoize(input, 12, parse_west_twouse_language_yuml_ColorableElement_StartIndex); }
        }
        return element;
    }
    // $ANTLR end "parse_west_twouse_language_yuml_ColorableElement"

    // $ANTLR start synpred10_Yuml
    public final void synpred10_Yuml_fragment() throws RecognitionException {   
        Token a1=null;

        // Yuml.g:1289:3: ( ( (a1= '<' )? ) )
        // Yuml.g:1289:3: ( (a1= '<' )? )
        {
        // Yuml.g:1289:3: ( (a1= '<' )? )
        // Yuml.g:1290:4: (a1= '<' )?
        {
        // Yuml.g:1290:4: (a1= '<' )?
        int alt34=2;
        int LA34_0 = input.LA(1);

        if ( (LA34_0==19) ) {
            alt34=1;
        }
        switch (alt34) {
            case 1 :
                // Yuml.g:1291:5: a1= '<'
                {
                a1=(Token)match(input,19,FOLLOW_19_in_synpred10_Yuml966); if (state.failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred10_Yuml

    // $ANTLR start synpred16_Yuml
    public final void synpred16_Yuml_fragment() throws RecognitionException {   
        Token a9=null;

        // Yuml.g:1495:3: ( ( (a9= '>' )? ) )
        // Yuml.g:1495:3: ( (a9= '>' )? )
        {
        // Yuml.g:1495:3: ( (a9= '>' )? )
        // Yuml.g:1496:4: (a9= '>' )?
        {
        // Yuml.g:1496:4: (a9= '>' )?
        int alt35=2;
        int LA35_0 = input.LA(1);

        if ( (LA35_0==21) ) {
            alt35=1;
        }
        switch (alt35) {
            case 1 :
                // Yuml.g:1497:5: a9= '>'
                {
                a9=(Token)match(input,21,FOLLOW_21_in_synpred16_Yuml1172); if (state.failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred16_Yuml

    // Delegated rules

    public final boolean synpred10_Yuml() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_Yuml_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_Yuml() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_Yuml_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA19 dfa19 = new DFA19(this);
    protected DFA29 dfa29 = new DFA29(this);
    static final String DFA19_eotS =
        "\55\uffff";
    static final String DFA19_eofS =
        "\55\uffff";
    static final String DFA19_minS =
        "\1\13\1\5\1\uffff\1\4\1\16\1\15\2\5\1\24\2\5\1\4\1\16\1\21\1\5"+
        "\1\uffff\1\16\1\15\4\5\1\22\1\uffff\1\5\1\12\1\17\1\16\1\5\1\4\1"+
        "\16\1\31\2\5\1\15\1\5\1\12\1\31\1\5\1\16\1\5\1\12\1\17\1\5\1\12";
    static final String DFA19_maxS =
        "\1\33\1\14\1\uffff\1\4\1\22\1\15\1\14\1\5\1\26\1\5\1\14\1\4\1\31"+
        "\1\21\1\33\1\uffff\1\30\1\15\1\32\1\5\1\14\1\5\1\22\1\uffff\1\5"+
        "\1\32\2\22\1\14\1\4\1\30\1\31\2\5\1\15\1\5\1\32\1\31\1\5\1\22\2"+
        "\32\1\22\1\5\1\32";
    static final String DFA19_acceptS =
        "\2\uffff\1\3\14\uffff\1\2\7\uffff\1\1\25\uffff";
    static final String DFA19_specialS =
        "\55\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\1\17\uffff\1\2",
            "\1\4\6\uffff\1\3",
            "",
            "\1\5",
            "\1\6\1\uffff\1\7\1\uffff\1\10",
            "\1\11",
            "\1\14\1\uffff\1\12\4\uffff\1\13",
            "\1\15",
            "\1\17\1\uffff\1\16",
            "\1\4",
            "\1\20\6\uffff\1\13",
            "\1\21",
            "\1\25\1\24\1\7\1\uffff\1\10\5\uffff\1\23\1\22",
            "\1\26",
            "\1\2\5\uffff\1\27\10\uffff\1\2\6\uffff\1\27",
            "",
            "\1\25\1\24\1\7\1\uffff\1\10\5\uffff\1\23",
            "\1\30",
            "\1\31\24\uffff\1\32",
            "\1\33",
            "\1\36\1\uffff\1\34\4\uffff\1\35",
            "\1\37",
            "\1\10",
            "",
            "\1\20",
            "\1\40\17\uffff\1\32",
            "\1\41\1\7\1\uffff\1\10",
            "\1\25\1\24\1\7\1\uffff\1\10",
            "\1\36\6\uffff\1\35",
            "\1\42",
            "\1\25\1\24\1\7\1\uffff\1\10\5\uffff\1\43",
            "\1\22",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\40\17\uffff\1\32",
            "\1\50",
            "\1\36",
            "\1\25\1\24\1\7\1\uffff\1\10",
            "\1\51\24\uffff\1\52",
            "\1\53\17\uffff\1\52",
            "\1\41\1\7\1\uffff\1\10",
            "\1\54",
            "\1\53\17\uffff\1\52"
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "1554:1: parse_west_twouse_language_yuml_Inheritance returns [west.twouse.language.yuml.Inheritance element = null] : ( ( (a0_0= parse_west_twouse_language_yuml_Class ) a1= '^' (a2_0= parse_west_twouse_language_yuml_ColorableElement ) ) | ( (a3_0= parse_west_twouse_language_yuml_Class ) a4= '-' ( (a5= TEXT ) )? a6= '^' (a7_0= parse_west_twouse_language_yuml_ColorableElement ) ) | ( (a8_0= parse_west_twouse_language_yuml_ColorableElement ) a9= '^' ( (a10= TEXT ) )? a11= '-' (a12_0= parse_west_twouse_language_yuml_Class ) ) );";
        }
    }
    static final String DFA29_eotS =
        "\71\uffff";
    static final String DFA29_eofS =
        "\11\uffff\1\24\1\uffff\1\27\55\uffff";
    static final String DFA29_minS =
        "\1\13\2\5\1\4\1\16\1\20\1\15\4\5\1\12\1\5\1\16\1\5\1\4\1\21\1\5"+
        "\1\uffff\1\5\1\uffff\1\21\2\uffff\4\5\1\16\1\15\1\22\1\24\1\5\1"+
        "\6\1\22\1\12\1\17\1\16\1\5\1\4\1\16\1\31\1\5\1\uffff\2\5\1\15\1"+
        "\5\1\12\1\31\1\5\1\16\1\5\1\12\1\17\1\5\1\12";
    static final String DFA29_maxS =
        "\1\33\1\14\1\5\1\4\2\22\1\15\1\14\1\5\1\26\1\5\1\26\1\5\1\31\1"+
        "\14\1\4\1\21\1\33\1\uffff\1\33\1\uffff\1\21\2\uffff\1\32\1\5\1\14"+
        "\1\5\1\30\1\15\1\22\1\24\1\26\1\33\1\22\1\32\2\22\1\14\1\4\1\30"+
        "\1\31\1\5\1\uffff\2\5\1\15\1\5\1\32\1\31\1\5\1\22\2\32\1\22\1\5"+
        "\1\32";
    static final String DFA29_acceptS =
        "\22\uffff\1\2\1\uffff\1\1\1\uffff\1\3\1\4\23\uffff\1\5\15\uffff";
    static final String DFA29_specialS =
        "\71\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\1\17\uffff\1\2",
            "\1\4\6\uffff\1\3",
            "\1\5",
            "\1\6",
            "\1\7\1\uffff\1\10\1\uffff\1\11",
            "\1\12\1\uffff\1\13",
            "\1\14",
            "\1\15\1\uffff\1\16\4\uffff\1\17",
            "\1\20",
            "\2\22\3\uffff\1\24\10\uffff\1\22\1\23\1\uffff\1\21",
            "\1\25",
            "\1\27\13\uffff\1\26",
            "\1\4",
            "\1\33\1\32\1\10\1\uffff\1\11\5\uffff\1\31\1\30",
            "\1\34\6\uffff\1\17",
            "\1\35",
            "\1\36",
            "\1\37\5\uffff\1\26\10\uffff\1\40\6\uffff\1\26",
            "",
            "\1\41\1\22\4\uffff\1\22\11\uffff\1\22\1\26\4\uffff\1\22",
            "",
            "\1\42",
            "",
            "",
            "\1\43\24\uffff\1\44",
            "\1\45",
            "\1\50\1\uffff\1\46\4\uffff\1\47",
            "\1\51",
            "\1\33\1\32\1\10\1\uffff\1\11\5\uffff\1\31",
            "\1\52",
            "\1\11",
            "\1\40",
            "\1\53\5\uffff\1\26\12\uffff\1\53",
            "\1\22\4\uffff\1\22\11\uffff\1\22\1\26\4\uffff\1\22",
            "\1\13",
            "\1\54\17\uffff\1\44",
            "\1\55\1\10\1\uffff\1\11",
            "\1\33\1\32\1\10\1\uffff\1\11",
            "\1\50\6\uffff\1\47",
            "\1\56",
            "\1\33\1\32\1\10\1\uffff\1\11\5\uffff\1\57",
            "\1\30",
            "\1\34",
            "",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\54\17\uffff\1\44",
            "\1\64",
            "\1\50",
            "\1\33\1\32\1\10\1\uffff\1\11",
            "\1\65\24\uffff\1\66",
            "\1\67\17\uffff\1\66",
            "\1\55\1\10\1\uffff\1\11",
            "\1\70",
            "\1\67\17\uffff\1\66"
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "2736:1: parse_west_twouse_language_yuml_ModelElement returns [west.twouse.language.yuml.ModelElement element = null] : (c0= parse_west_twouse_language_yuml_Class | c1= parse_west_twouse_language_yuml_Association | c2= parse_west_twouse_language_yuml_Inheritance | c3= parse_west_twouse_language_yuml_Note | c4= parse_west_twouse_language_yuml_Equivalence );";
        }
    }
 

    public static final BitSet FOLLOW_parse_west_twouse_language_yuml_Model_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_west_twouse_language_yuml_ModelElement_in_parse_west_twouse_language_yuml_Model127 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_parse_west_twouse_language_yuml_Model168 = new BitSet(new long[]{0x0000000008000800L});
    public static final BitSet FOLLOW_parse_west_twouse_language_yuml_ModelElement_in_parse_west_twouse_language_yuml_Model202 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_11_in_parse_west_twouse_language_yuml_Class291 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_12_in_parse_west_twouse_language_yuml_Class314 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALPHANUM_in_parse_west_twouse_language_yuml_Class340 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_west_twouse_language_yuml_Class373 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_TEXT_in_parse_west_twouse_language_yuml_Class410 = new BitSet(new long[]{0x0000000000054000L});
    public static final BitSet FOLLOW_14_in_parse_west_twouse_language_yuml_Class440 = new BitSet(new long[]{0x00000000000010A0L});
    public static final BitSet FOLLOW_parse_west_twouse_language_yuml_Attribute_in_parse_west_twouse_language_yuml_Class466 = new BitSet(new long[]{0x000000000005C000L});
    public static final BitSet FOLLOW_15_in_parse_west_twouse_language_yuml_Class507 = new BitSet(new long[]{0x00000000000010A0L});
    public static final BitSet FOLLOW_parse_west_twouse_language_yuml_Attribute_in_parse_west_twouse_language_yuml_Class541 = new BitSet(new long[]{0x000000000005C000L});
    public static final BitSet FOLLOW_14_in_parse_west_twouse_language_yuml_Class624 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_parse_west_twouse_language_yuml_Method_in_parse_west_twouse_language_yuml_Class650 = new BitSet(new long[]{0x0000000000058000L});
    public static final BitSet FOLLOW_15_in_parse_west_twouse_language_yuml_Class691 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_parse_west_twouse_language_yuml_Method_in_parse_west_twouse_language_yuml_Class725 = new BitSet(new long[]{0x0000000000058000L});
    public static final BitSet FOLLOW_16_in_parse_west_twouse_language_yuml_Class808 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_TEXT_in_parse_west_twouse_language_yuml_Class834 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_west_twouse_language_yuml_Class867 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_west_twouse_language_yuml_Class900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_west_twouse_language_yuml_Class_in_parse_west_twouse_language_yuml_Association933 = new BitSet(new long[]{0x0000000000180060L});
    public static final BitSet FOLLOW_19_in_parse_west_twouse_language_yuml_Association966 = new BitSet(new long[]{0x0000000000100060L});
    public static final BitSet FOLLOW_TEXT_in_parse_west_twouse_language_yuml_Association1004 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_parse_west_twouse_language_yuml_Cardinality_in_parse_west_twouse_language_yuml_Association1043 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_parse_west_twouse_language_yuml_Association1069 = new BitSet(new long[]{0x0000000008200860L});
    public static final BitSet FOLLOW_TEXT_in_parse_west_twouse_language_yuml_Association1092 = new BitSet(new long[]{0x0000000008200840L});
    public static final BitSet FOLLOW_parse_west_twouse_language_yuml_Cardinality_in_parse_west_twouse_language_yuml_Association1131 = new BitSet(new long[]{0x0000000008200800L});
    public static final BitSet FOLLOW_21_in_parse_west_twouse_language_yuml_Association1172 = new BitSet(new long[]{0x0000000008000800L});
    public static final BitSet FOLLOW_parse_west_twouse_language_yuml_ColorableElement_in_parse_west_twouse_language_yuml_Association1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_west_twouse_language_yuml_Class_in_parse_west_twouse_language_yuml_Inheritance1247 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_parse_west_twouse_language_yuml_Inheritance1270 = new BitSet(new long[]{0x0000000008000800L});
    public static final BitSet FOLLOW_parse_west_twouse_language_yuml_ColorableElement_in_parse_west_twouse_language_yuml_Inheritance1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_west_twouse_language_yuml_Class_in_parse_west_twouse_language_yuml_Inheritance1335 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_parse_west_twouse_language_yuml_Inheritance1358 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_TEXT_in_parse_west_twouse_language_yuml_Inheritance1386 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_parse_west_twouse_language_yuml_Inheritance1424 = new BitSet(new long[]{0x0000000008000800L});
    public static final BitSet FOLLOW_parse_west_twouse_language_yuml_ColorableElement_in_parse_west_twouse_language_yuml_Inheritance1446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_west_twouse_language_yuml_ColorableElement_in_parse_west_twouse_language_yuml_Inheritance1489 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_parse_west_twouse_language_yuml_Inheritance1512 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_TEXT_in_parse_west_twouse_language_yuml_Inheritance1540 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_parse_west_twouse_language_yuml_Inheritance1578 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_parse_west_twouse_language_yuml_Class_in_parse_west_twouse_language_yuml_Inheritance1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CARDINALITY_in_parse_west_twouse_language_yuml_Cardinality1649 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_parse_west_twouse_language_yuml_Cardinality1679 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_CARDINALITY_in_parse_west_twouse_language_yuml_Cardinality1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VISIBILITY_in_parse_west_twouse_language_yuml_Attribute1775 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_12_in_parse_west_twouse_language_yuml_Attribute1814 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ALPHANUM_in_parse_west_twouse_language_yuml_Attribute1840 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_west_twouse_language_yuml_Attribute1873 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_TEXT_in_parse_west_twouse_language_yuml_Attribute1910 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_parse_west_twouse_language_yuml_Attribute1940 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_TEXT_in_parse_west_twouse_language_yuml_Attribute1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_parse_west_twouse_language_yuml_Method2031 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_parse_west_twouse_language_yuml_Method2052 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_TEXT_in_parse_west_twouse_language_yuml_Method2081 = new BitSet(new long[]{0x0000000004000400L});
    public static final BitSet FOLLOW_10_in_parse_west_twouse_language_yuml_Method2127 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_TEXT_in_parse_west_twouse_language_yuml_Method2161 = new BitSet(new long[]{0x0000000004000400L});
    public static final BitSet FOLLOW_26_in_parse_west_twouse_language_yuml_Method2242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_parse_west_twouse_language_yuml_Note2271 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_TEXT_in_parse_west_twouse_language_yuml_Note2289 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_16_in_parse_west_twouse_language_yuml_Note2319 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_TEXT_in_parse_west_twouse_language_yuml_Note2345 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_west_twouse_language_yuml_Note2378 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_west_twouse_language_yuml_Note2411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_west_twouse_language_yuml_Class_in_parse_west_twouse_language_yuml_Equivalence2444 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_parse_west_twouse_language_yuml_Equivalence2462 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_TEXT_in_parse_west_twouse_language_yuml_Equivalence2485 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_parse_west_twouse_language_yuml_Equivalence2515 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_TEXT_in_parse_west_twouse_language_yuml_Equivalence2538 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_parse_west_twouse_language_yuml_Equivalence2568 = new BitSet(new long[]{0x0000000008000800L});
    public static final BitSet FOLLOW_parse_west_twouse_language_yuml_ColorableElement_in_parse_west_twouse_language_yuml_Equivalence2586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_west_twouse_language_yuml_Class_in_parse_west_twouse_language_yuml_ModelElement2615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_west_twouse_language_yuml_Association_in_parse_west_twouse_language_yuml_ModelElement2625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_west_twouse_language_yuml_Inheritance_in_parse_west_twouse_language_yuml_ModelElement2635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_west_twouse_language_yuml_Note_in_parse_west_twouse_language_yuml_ModelElement2645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_west_twouse_language_yuml_Equivalence_in_parse_west_twouse_language_yuml_ModelElement2655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_west_twouse_language_yuml_Class_in_parse_west_twouse_language_yuml_ColorableElement2676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_west_twouse_language_yuml_Note_in_parse_west_twouse_language_yuml_ColorableElement2686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_synpred10_Yuml966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_synpred16_Yuml1172 = new BitSet(new long[]{0x0000000000000002L});

}