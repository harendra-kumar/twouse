grammar Yuml;

options {
	superClass = YumlANTLRParserBase;
	backtrack = true;
	memoize = true;
}

@lexer::header {
	package west.twouse.language.yuml.resource.yuml.mopp;
}

@lexer::members {
	public java.util.List<org.antlr.runtime3_2_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_2_0.RecognitionException>();
	public java.util.List<Integer> lexerExceptionsPosition = new java.util.ArrayList<Integer>();
	
	public void reportError(org.antlr.runtime3_2_0.RecognitionException e) {
		lexerExceptions.add(e);
		lexerExceptionsPosition.add(((org.antlr.runtime3_2_0.ANTLRStringStream) input).index());
	}
}
@header{
	package west.twouse.language.yuml.resource.yuml.mopp;
}

@members{
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
	
}

start returns [ org.eclipse.emf.ecore.EObject element = null]
:
	{
		// follow set for start rule(s)
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_0, 0, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_0);
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_1, 0, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_1, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_0);
		expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
	}
	(
		c0 = parse_west_twouse_language_yuml_Model{ element = c0; }
	)
	EOF	
;

parse_west_twouse_language_yuml_Model returns [west.twouse.language.yuml.Model element = null]
@init{
}
:
	(
		(
			(
				a0_0 = parse_west_twouse_language_yuml_ModelElement				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_2, 1);
			}
			
			(
				(
					a1 = ',' {
						if (element == null) {
							element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createModel();
							incompleteObjects.push(element);
							// initialize boolean attributes
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_0_0_0_0_0_0_1_0_0_0, null);
						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_0, 2, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_0);
						addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_1, 2, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_1, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_0);
					}
					
					(
						a2_0 = parse_west_twouse_language_yuml_ModelElement						{
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
					)
					{
						// expected elements (follow set)
						addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_2, 3);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_2, 4);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
	}
	
;

parse_west_twouse_language_yuml_Class returns [west.twouse.language.yuml.Class element = null]
@init{
}
:
	a0 = '[' {
		if (element == null) {
			element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createClass();
			incompleteObjects.push(element);
			// initialize boolean attributes
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_1_0_0_0, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_3, 6);
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_4, 6);
	}
	
	(
		(
			a1 = '<<' {
				if (element == null) {
					element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createClass();
					incompleteObjects.push(element);
					// initialize boolean attributes
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_1_0_0_1_0_0_0, null);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_5, 7);
			}
			
			(
				a2 = ALPHANUM				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_6, 8);
			}
			
			a3 = '>>' {
				if (element == null) {
					element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createClass();
					incompleteObjects.push(element);
					// initialize boolean attributes
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_1_0_0_1_0_0_2, null);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_4, 9);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_4, 10);
	}
	
	(
		a4 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_7, 11);
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_8, 11);
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_9, 11);
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_10, 11);
	}
	
	(
		(
			a5 = '|' {
				if (element == null) {
					element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createClass();
					incompleteObjects.push(element);
					// initialize boolean attributes
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_1_0_0_3_0_0_0, null);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_11, 12, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_2);
				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_12, 12, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_2);
				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_13, 12, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_2);
			}
			
			(
				a6_0 = parse_west_twouse_language_yuml_Attribute				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_14, 13);
				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_8, 13);
				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_9, 13);
				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_10, 13);
			}
			
			(
				(
					a7 = ';' {
						if (element == null) {
							element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createClass();
							incompleteObjects.push(element);
							// initialize boolean attributes
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_1_0_0_3_0_0_2_0_0_0, null);
						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a7, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_11, 14, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_2);
						addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_12, 14, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_2);
						addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_13, 14, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_2);
					}
					
					(
						a8_0 = parse_west_twouse_language_yuml_Attribute						{
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
					)
					{
						// expected elements (follow set)
						addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_14, 15);
						addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_8, 15);
						addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_9, 15);
						addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_10, 15);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_14, 16);
				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_8, 16);
				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_9, 16);
				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_10, 16);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_8, 17);
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_9, 17);
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_10, 17);
	}
	
	(
		(
			a9 = '|' {
				if (element == null) {
					element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createClass();
					incompleteObjects.push(element);
					// initialize boolean attributes
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_1_0_0_4_0_0_0, null);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a9, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_15, 18, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_3);
			}
			
			(
				a10_0 = parse_west_twouse_language_yuml_Method				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_16, 19);
				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_9, 19);
				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_10, 19);
			}
			
			(
				(
					a11 = ';' {
						if (element == null) {
							element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createClass();
							incompleteObjects.push(element);
							// initialize boolean attributes
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_1_0_0_4_0_0_2_0_0_0, null);
						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a11, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_15, 20, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_3);
					}
					
					(
						a12_0 = parse_west_twouse_language_yuml_Method						{
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
					)
					{
						// expected elements (follow set)
						addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_16, 21);
						addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_9, 21);
						addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_10, 21);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_16, 22);
				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_9, 22);
				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_10, 22);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_9, 23);
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_10, 23);
	}
	
	(
		(
			a13 = '{bg:' {
				if (element == null) {
					element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createClass();
					incompleteObjects.push(element);
					// initialize boolean attributes
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_1_0_0_5_0_0_0, null);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a13, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_17, 24);
			}
			
			(
				a14 = TEXT				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_18, 25);
			}
			
			a15 = '}' {
				if (element == null) {
					element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createClass();
					incompleteObjects.push(element);
					// initialize boolean attributes
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_1_0_0_5_0_0_2, null);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a15, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_10, 26);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_10, 27);
	}
	
	a16 = ']' {
		if (element == null) {
			element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createClass();
			incompleteObjects.push(element);
			// initialize boolean attributes
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_1_0_0_6, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a16, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_2, 28);
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_19, 28);
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_20, 28);
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_21, 28, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_4);
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_22, 28);
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_23, 28);
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_24, 28);
	}
	
;

parse_west_twouse_language_yuml_Association returns [west.twouse.language.yuml.Association element = null]
@init{
}
:
	(
		a0_0 = parse_west_twouse_language_yuml_Class		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_19, 29);
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_20, 29);
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_21, 29, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_4);
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_22, 29);
	}
	
	(
		(
			(
				a1 = '<' {
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
			)?		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_20, 30);
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_21, 30, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_4);
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_22, 30);
	}
	
	(
		(
			a4 = TEXT			
			{
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
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_21, 31, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_4);
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_22, 31);
	}
	
	(
		(
			a5_0 = parse_west_twouse_language_yuml_Cardinality			{
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
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_22, 32);
	}
	
	a6 = '-' {
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
	{
		// expected elements (follow set)
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_25, 33);
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_21, 33, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_5);
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_26, 33);
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_0, 33, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_1);
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_1, 33, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_1);
	}
	
	(
		(
			a7 = TEXT			
			{
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
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_21, 34, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_5);
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_26, 34);
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_0, 34, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_1);
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_1, 34, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_1);
	}
	
	(
		(
			a8_0 = parse_west_twouse_language_yuml_Cardinality			{
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
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_26, 35);
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_0, 35, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_1);
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_1, 35, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_1);
	}
	
	(
		(
			(
				a9 = '>' {
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
			)?		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_0, 36, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_1);
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_1, 36, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_1);
	}
	
	(
		a12_0 = parse_west_twouse_language_yuml_ColorableElement		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_2, 37);
	}
	
;

parse_west_twouse_language_yuml_Inheritance returns [west.twouse.language.yuml.Inheritance element = null]
@init{
}
:
	(
		(
			a0_0 = parse_west_twouse_language_yuml_Class			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_23, 38);
		}
		
		a1 = '^' {
			if (element == null) {
				element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createInheritance();
				incompleteObjects.push(element);
				// initialize boolean attributes
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_3_0_0_0_0_0_1, null);
			copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_0, 39, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_1);
			addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_1, 39, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_1);
		}
		
		(
			a2_0 = parse_west_twouse_language_yuml_ColorableElement			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_2, 40);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_2, 41);
	}
	
	
	|	(
		(
			a3_0 = parse_west_twouse_language_yuml_Class			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_27, 42);
		}
		
		a4 = '-' {
			if (element == null) {
				element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createInheritance();
				incompleteObjects.push(element);
				// initialize boolean attributes
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_3_0_1_0_0_0_1, null);
			copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a4, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_28, 43);
			addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_29, 43);
		}
		
		(
			(
				a5 = TEXT				
				{
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
			)
			
		)?		{
			// expected elements (follow set)
			addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_29, 44);
		}
		
		a6 = '^' {
			if (element == null) {
				element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createInheritance();
				incompleteObjects.push(element);
				// initialize boolean attributes
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_3_0_1_0_0_0_3, null);
			copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a6, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_0, 45, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_1);
			addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_1, 45, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_1);
		}
		
		(
			a7_0 = parse_west_twouse_language_yuml_ColorableElement			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_2, 46);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_2, 47);
	}
	
	
	|	(
		(
			a8_0 = parse_west_twouse_language_yuml_ColorableElement			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_30, 48);
		}
		
		a9 = '^' {
			if (element == null) {
				element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createInheritance();
				incompleteObjects.push(element);
				// initialize boolean attributes
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_3_0_2_0_0_0_1, null);
			copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a9, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_31, 49);
			addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_32, 49);
		}
		
		(
			(
				a10 = TEXT				
				{
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
			)
			
		)?		{
			// expected elements (follow set)
			addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_32, 50);
		}
		
		a11 = '-' {
			if (element == null) {
				element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createInheritance();
				incompleteObjects.push(element);
				// initialize boolean attributes
			}
			collectHiddenTokens(element);
			retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_3_0_2_0_0_0_3, null);
			copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a11, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_0, 51, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_6);
		}
		
		(
			a12_0 = parse_west_twouse_language_yuml_Class			{
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
		)
		{
			// expected elements (follow set)
			addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_2, 52);
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_2, 53);
	}
	
;

parse_west_twouse_language_yuml_Cardinality returns [west.twouse.language.yuml.Cardinality element = null]
@init{
}
:
	(
		a0 = CARDINALITY		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_33, 54);
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_22, 54);
	}
	
	(
		(
			a1 = '..' {
				if (element == null) {
					element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createCardinality();
					incompleteObjects.push(element);
					// initialize boolean attributes
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_4_0_0_1_0_0_0, null);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_34, 55);
			}
			
			(
				a2 = CARDINALITY				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_22, 56);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_22, 57);
	}
	
;

parse_west_twouse_language_yuml_Attribute returns [west.twouse.language.yuml.Attribute element = null]
@init{
}
:
	(
		(
			a0 = VISIBILITY			
			{
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
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_12, 58);
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_13, 58);
	}
	
	(
		(
			a1 = '<<' {
				if (element == null) {
					element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createAttribute();
					incompleteObjects.push(element);
					// initialize boolean attributes
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_5_0_0_1_0_0_0, null);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_35, 59);
			}
			
			(
				a2 = ALPHANUM				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_36, 60);
			}
			
			a3 = '>>' {
				if (element == null) {
					element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createAttribute();
					incompleteObjects.push(element);
					// initialize boolean attributes
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_5_0_0_1_0_0_2, null);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_13, 61);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_13, 62);
	}
	
	(
		a4 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_37, 63);
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_14, 63);
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_8, 63);
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_9, 63);
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_10, 63);
	}
	
	(
		(
			a5 = ' : ' {
				if (element == null) {
					element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createAttribute();
					incompleteObjects.push(element);
					// initialize boolean attributes
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_5_0_0_3_0_0_0, null);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_38, 64);
			}
			
			(
				a6 = TEXT				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_14, 65);
				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_8, 65);
				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_9, 65);
				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_10, 65);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_14, 66);
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_8, 66);
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_9, 66);
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_10, 66);
	}
	
;

parse_west_twouse_language_yuml_Method returns [west.twouse.language.yuml.Method element = null]
@init{
}
:
	(
		a0 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_39, 67);
	}
	
	a1 = '(' {
		if (element == null) {
			element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createMethod();
			incompleteObjects.push(element);
			// initialize boolean attributes
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_6_0_0_1, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_40, 68);
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_41, 68);
	}
	
	(
		(
			(
				a2 = TEXT				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_42, 69);
				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_41, 69);
			}
			
			(
				(
					a3 = ',' {
						if (element == null) {
							element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createMethod();
							incompleteObjects.push(element);
							// initialize boolean attributes
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_6_0_0_2_0_0_1_0_0_0, null);
						copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_43, 70);
					}
					
					(
						a4 = TEXT						
						{
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
					)
					{
						// expected elements (follow set)
						addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_42, 71);
						addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_41, 71);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_42, 72);
				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_41, 72);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_41, 73);
	}
	
	a5 = ')' {
		if (element == null) {
			element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createMethod();
			incompleteObjects.push(element);
			// initialize boolean attributes
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_6_0_0_3, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_16, 74);
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_9, 74);
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_10, 74);
	}
	
;

parse_west_twouse_language_yuml_Note returns [west.twouse.language.yuml.Note element = null]
@init{
}
:
	a0 = '[note: ' {
		if (element == null) {
			element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createNote();
			incompleteObjects.push(element);
			// initialize boolean attributes
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_7_0_0_0, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_44, 75);
	}
	
	(
		a1 = TEXT		
		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_45, 76);
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_46, 76);
	}
	
	(
		(
			a2 = '{bg:' {
				if (element == null) {
					element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createNote();
					incompleteObjects.push(element);
					// initialize boolean attributes
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_7_0_0_2_0_0_0, null);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_47, 77);
			}
			
			(
				a3 = TEXT				
				{
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
			)
			{
				// expected elements (follow set)
				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_48, 78);
			}
			
			a4 = '}' {
				if (element == null) {
					element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createNote();
					incompleteObjects.push(element);
					// initialize boolean attributes
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_7_0_0_2_0_0_2, null);
				copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_46, 79);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_46, 80);
	}
	
	a5 = ']' {
		if (element == null) {
			element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createNote();
			incompleteObjects.push(element);
			// initialize boolean attributes
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_7_0_0_3, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_2, 81);
	}
	
;

parse_west_twouse_language_yuml_Equivalence returns [west.twouse.language.yuml.Equivalence element = null]
@init{
}
:
	(
		a0_0 = parse_west_twouse_language_yuml_Class		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_24, 82);
	}
	
	a1 = '^' {
		if (element == null) {
			element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createEquivalence();
			incompleteObjects.push(element);
			// initialize boolean attributes
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_8_0_0_1, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_49, 83);
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_50, 83);
	}
	
	(
		(
			a2 = TEXT			
			{
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
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_50, 84);
	}
	
	a3 = '-' {
		if (element == null) {
			element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createEquivalence();
			incompleteObjects.push(element);
			// initialize boolean attributes
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_8_0_0_3, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_51, 85);
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_52, 85);
	}
	
	(
		(
			a4 = TEXT			
			{
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
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_52, 86);
	}
	
	a5 = '^' {
		if (element == null) {
			element = west.twouse.language.yuml.YumlFactory.eINSTANCE.createEquivalence();
			incompleteObjects.push(element);
			// initialize boolean attributes
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_8_0_0_5, null);
		copyLocalizationInfos((org.antlr.runtime3_2_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_0, 87, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_1);
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_1, 87, west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.FEATURE_1);
	}
	
	(
		a6_0 = parse_west_twouse_language_yuml_ColorableElement		{
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
	)
	{
		// expected elements (follow set)
		addExpectedElement(west.twouse.language.yuml.resource.yuml.grammar.YumlFollowSetProvider.TERMINAL_2, 88);
	}
	
;

parse_west_twouse_language_yuml_ModelElement returns [west.twouse.language.yuml.ModelElement element = null]
:
	c0 = parse_west_twouse_language_yuml_Class{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_west_twouse_language_yuml_Association{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_west_twouse_language_yuml_Inheritance{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_west_twouse_language_yuml_Note{ element = c3; /* this is a subclass or primitive expression choice */ }
	|	c4 = parse_west_twouse_language_yuml_Equivalence{ element = c4; /* this is a subclass or primitive expression choice */ }
	
;

parse_west_twouse_language_yuml_ColorableElement returns [west.twouse.language.yuml.ColorableElement element = null]
:
	c0 = parse_west_twouse_language_yuml_Class{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_west_twouse_language_yuml_Note{ element = c1; /* this is a subclass or primitive expression choice */ }
	
;

WHITESPACE:
	((' '|'\t'|'\f'))
	{ _channel = 99; }
;
LINEBREAKS:
	(('\r\n'|'\r'|'\n'))
	{ _channel = 99; }
;
CARDINALITY:
	('0' |('1'..'9')('0'..'9')*| '*')
;
ALPHANUM:
	((('A'..'Z''a'..'z') | ('0'..'9'))+)
;
VISIBILITY:
	(('+' | '-'))
;
TEXT:
	(('\u0000'..'\u0029' | '\u002F'..'\u003A' | '\u003D' | '\u0040'..'\u005A' | '\u005F'..'\u007A' | '\u007E'..'\uFFFF')+)
;

