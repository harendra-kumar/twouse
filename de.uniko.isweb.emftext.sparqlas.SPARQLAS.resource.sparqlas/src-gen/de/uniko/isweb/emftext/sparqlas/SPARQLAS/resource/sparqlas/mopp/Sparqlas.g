grammar Sparqlas;

options {
	superClass = SparqlasANTLRParserBase;
	backtrack = true;
	memoize = true;
}

@lexer::header {
	package de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp;
}

@lexer::members {
	public java.util.List<org.antlr.runtime.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime.RecognitionException>();
	public java.util.List<java.lang.Integer> lexerExceptionsPosition       = new java.util.ArrayList<java.lang.Integer>();
	
	public void reportError(org.antlr.runtime.RecognitionException e) {
		lexerExceptions.add(e);
		lexerExceptionsPosition.add(((org.antlr.runtime.ANTLRStringStream) input).index());
	}
}
@header{
	package de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp;
}

@members{
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
}

start returns [ org.eclipse.emf.ecore.EObject element = null]
:
	{
	}
	(
		{
		}
		c0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_OntologyDocument{ element = c0; }
	)
	EOF	
;

parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_OntologyDocument returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.OntologyDocument element = null]
@init{
}
:
	{
		// expected element before STAR or QUESTIONMARK or PLUS
	}
	(
		{
			// expected element is a Terminal
		}
		(
			a0_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition			{
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
		)
		
	)*	{
		// expected element after STAR or PLUS
	}
	
	{
		// expected element is a Terminal
	}
	(
		a1_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Query		{
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
	)
	
;

parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_PrefixDefinition returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.PrefixDefinition element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = 'Namespace' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createPrefixDefinition();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a CsString
	}
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createPrefixDefinition();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	
	{
		// expected element before STAR or QUESTIONMARK or PLUS
	}
	(
		{
			// expected element is a Terminal
		}
		(
			a2 = STRING			
			{
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
		)
		
	)?	
	{
		// expected element is a CsString
	}
	a3 = '=' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createPrefixDefinition();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a4_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FullIRI		{
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
	)
	
	{
		// expected element is a CsString
	}
	a5 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createPrefixDefinition();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a5, element);
	}
	
;

parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Query returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.Query element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = 'Query' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createQuery();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a CsString
	}
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createQuery();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	
	{
		// expected element before STAR or QUESTIONMARK or PLUS
	}
	(
		{
			// expected element is a Terminal
		}
		(
			a2_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI			{
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
		)
		
	)?	
	{
		// expected element before STAR or QUESTIONMARK or PLUS
	}
	(
		{
			// expected element is a Terminal
		}
		(
			a3_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom			{
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
		)
		
	)*	{
		// expected element after STAR or PLUS
	}
	
	{
		// expected element is a CsString
	}
	a4 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createQuery();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a4, element);
	}
	
;

parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassVariable returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassVariable element = null]
@init{
}
:
	{
		// expected element is a Terminal
	}
	(
		a0 = VARIABLE		
		{
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
	)
	
;

parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyVariable returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyVariable element = null]
@init{
}
:
	{
		// expected element is a Terminal
	}
	(
		a0 = VARIABLE		
		{
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
	)
	
;

parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyVariable returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyVariable element = null]
@init{
}
:
	{
		// expected element is a Terminal
	}
	(
		a0 = VARIABLE		
		{
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
	)
	
;

parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualVariable returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.IndividualVariable element = null]
@init{
}
:
	{
		// expected element is a Terminal
	}
	(
		a0 = VARIABLE		
		{
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
	)
	
;

parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Class returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.Class element = null]
@init{
}
:
	{
		// expected element is a Terminal
	}
	(
		a0_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI		{
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
	)
	
;

parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Datatype returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.Datatype element = null]
@init{
}
:
	{
		// expected element is a Terminal
	}
	(
		a0_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI		{
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
	)
	
;

parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectProperty returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectProperty element = null]
@init{
}
:
	{
		// expected element is a Terminal
	}
	(
		a0_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI		{
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
	)
	
;

parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataProperty returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataProperty element = null]
@init{
}
:
	{
		// expected element is a Terminal
	}
	(
		a0_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI		{
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
	)
	
;

parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_NamedIndividual returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.NamedIndividual element = null]
@init{
}
:
	{
		// expected element is a Terminal
	}
	(
		a0_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI		{
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
	)
	
;

parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AnonymousIndividual returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.AnonymousIndividual element = null]
@init{
}
:
	{
		// expected element is a Terminal
	}
	(
		a0 = NODE		
		{
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
	)
	
;

parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.Literal element = null]
@init{
}
:
	{
		// expected element is a Terminal
	}
	(
		a0 = LITERAL		
		{
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
	)
	
	{
		// expected element is a CsString
	}
	a1 = '^^' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createLiteral();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a2_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Datatype		{
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
	)
	
;

parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentClasses returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.EquivalentClasses element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = 'EquivalentClass' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createEquivalentClasses();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a CsString
	}
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createEquivalentClasses();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a2_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression		{
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
	)
	
	{
		// expected element before STAR or QUESTIONMARK or PLUS
	}
	(
		{
			// expected element is a Terminal
		}
		(
			a3_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression			{
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
		)
		
	)+	{
		// expected element after STAR or PLUS
	}
	
	{
		// expected element is a CsString
	}
	a4 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createEquivalentClasses();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a4, element);
	}
	
;

parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubClassOf returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.SubClassOf element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = 'SubClassOf' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createSubClassOf();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a CsString
	}
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createSubClassOf();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a2_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression		{
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
	)
	
	{
		// expected element is a Terminal
	}
	(
		a3_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression		{
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
	)
	
	{
		// expected element is a CsString
	}
	a4 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createSubClassOf();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a4, element);
	}
	
;

parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DisjointClasses returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.DisjointClasses element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = 'DisjointWith' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDisjointClasses();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a CsString
	}
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDisjointClasses();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a2_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression		{
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
	)
	
	{
		// expected element before STAR or QUESTIONMARK or PLUS
	}
	(
		{
			// expected element is a Terminal
		}
		(
			a3_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression			{
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
		)
		
	)+	{
		// expected element after STAR or PLUS
	}
	
	{
		// expected element is a CsString
	}
	a4 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDisjointClasses();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a4, element);
	}
	
;

parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyAssertion returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyAssertion element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = 'PropertyValue' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectPropertyAssertion();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a CsString
	}
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectPropertyAssertion();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a2_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual		{
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
	)
	
	{
		// expected element is a Terminal
	}
	(
		a3_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression		{
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
	)
	
	{
		// expected element is a Terminal
	}
	(
		a4_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual		{
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
	)
	
	{
		// expected element is a CsString
	}
	a5 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectPropertyAssertion();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a5, element);
	}
	
;

parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyAssertion returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyAssertion element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = 'PropertyValue' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDataPropertyAssertion();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a CsString
	}
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDataPropertyAssertion();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a2_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual		{
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
	)
	
	{
		// expected element is a Terminal
	}
	(
		a3_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyExpression		{
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
	)
	
	{
		// expected element is a Terminal
	}
	(
		a4_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal		{
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
	)
	
	{
		// expected element is a CsString
	}
	a5 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDataPropertyAssertion();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a5, element);
	}
	
;

parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassAssertion returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassAssertion element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = 'Type' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createClassAssertion();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a CsString
	}
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createClassAssertion();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a2_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual		{
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
	)
	
	{
		// expected element is a Terminal
	}
	(
		a3_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression		{
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
	)
	
	{
		// expected element is a CsString
	}
	a4 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createClassAssertion();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a4, element);
	}
	
;

parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SameIndividual returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.SameIndividual element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = 'SameAs' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createSameIndividual();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a CsString
	}
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createSameIndividual();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a2_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual		{
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
	)
	
	{
		// expected element before STAR or QUESTIONMARK or PLUS
	}
	(
		{
			// expected element is a Terminal
		}
		(
			a3_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual			{
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
		)
		
	)+	{
		// expected element after STAR or PLUS
	}
	
	{
		// expected element is a CsString
	}
	a4 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createSameIndividual();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a4, element);
	}
	
;

parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DifferentIndividuals returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.DifferentIndividuals element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = 'DifferentFrom' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDifferentIndividuals();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a CsString
	}
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDifferentIndividuals();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a2_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual		{
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
	)
	
	{
		// expected element before STAR or QUESTIONMARK or PLUS
	}
	(
		{
			// expected element is a Terminal
		}
		(
			a3_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual			{
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
		)
		
	)+	{
		// expected element after STAR or PLUS
	}
	
	{
		// expected element is a CsString
	}
	a4 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDifferentIndividuals();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a4, element);
	}
	
;

parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentObjectProperties returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.EquivalentObjectProperties element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = 'EquivalentProperty' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createEquivalentObjectProperties();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a CsString
	}
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createEquivalentObjectProperties();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a2_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression		{
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
	)
	
	{
		// expected element before STAR or QUESTIONMARK or PLUS
	}
	(
		{
			// expected element is a Terminal
		}
		(
			a3_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression			{
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
		)
		
	)+	{
		// expected element after STAR or PLUS
	}
	
	{
		// expected element is a CsString
	}
	a4 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createEquivalentObjectProperties();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a4, element);
	}
	
;

parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubPropertyOf returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.SubPropertyOf element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = 'SubPropertyOf' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createSubPropertyOf();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a CsString
	}
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createSubPropertyOf();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a2_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression		{
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
	)
	
	{
		// expected element is a Terminal
	}
	(
		a3_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression		{
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
	)
	
	{
		// expected element is a CsString
	}
	a4 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createSubPropertyOf();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a4, element);
	}
	
;

parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectProperty returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseObjectProperty element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = 'InverseOf' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createInverseObjectProperty();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a CsString
	}
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createInverseObjectProperty();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a2_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression		{
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
	)
	
	{
		// expected element is a CsString
	}
	a3 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createInverseObjectProperty();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	
;

parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectPropertyAtom returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseObjectPropertyAtom element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = 'InverseOf' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createInverseObjectPropertyAtom();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a CsString
	}
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createInverseObjectPropertyAtom();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a2_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression		{
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
	)
	
	{
		// expected element is a Terminal
	}
	(
		a3_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression		{
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
	)
	
	{
		// expected element is a CsString
	}
	a4 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createInverseObjectPropertyAtom();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a4, element);
	}
	
;

parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FunctionalObjectProperty returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.FunctionalObjectProperty element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = 'Functional' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createFunctionalObjectProperty();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a CsString
	}
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createFunctionalObjectProperty();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a2_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression		{
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
	)
	
	{
		// expected element is a CsString
	}
	a3 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createFunctionalObjectProperty();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	
;

parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseFunctionalObjectProperty returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseFunctionalObjectProperty element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = 'InverseFunctional' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createInverseFunctionalObjectProperty();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a CsString
	}
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createInverseFunctionalObjectProperty();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a2_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression		{
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
	)
	
	{
		// expected element is a CsString
	}
	a3 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createInverseFunctionalObjectProperty();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	
;

parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_TransitiveObjectProperty returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.TransitiveObjectProperty element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = 'Transitive' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createTransitiveObjectProperty();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a CsString
	}
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createTransitiveObjectProperty();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a2_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression		{
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
	)
	
	{
		// expected element is a CsString
	}
	a3 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createTransitiveObjectProperty();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	
;

parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SymmetricObjectProperty returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.SymmetricObjectProperty element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = 'Symmetric' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createSymmetricObjectProperty();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a CsString
	}
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createSymmetricObjectProperty();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a2_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression		{
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
	)
	
	{
		// expected element is a CsString
	}
	a3 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createSymmetricObjectProperty();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	
;

parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectUnionOf returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectUnionOf element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = 'UnionOf' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectUnionOf();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a CsString
	}
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectUnionOf();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a2_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression		{
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
	)
	
	{
		// expected element before STAR or QUESTIONMARK or PLUS
	}
	(
		{
			// expected element is a Terminal
		}
		(
			a3_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression			{
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
		)
		
	)+	{
		// expected element after STAR or PLUS
	}
	
	{
		// expected element is a CsString
	}
	a4 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectUnionOf();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a4, element);
	}
	
;

parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectComplementOf returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectComplementOf element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = 'ComplementOf' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectComplementOf();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a CsString
	}
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectComplementOf();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a2_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression		{
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
	)
	
	{
		// expected element is a CsString
	}
	a3 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectComplementOf();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	
;

parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectOneOf returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectOneOf element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = 'OneOf' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectOneOf();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a CsString
	}
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectOneOf();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	
	{
		// expected element before STAR or QUESTIONMARK or PLUS
	}
	(
		{
			// expected element is a Terminal
		}
		(
			a2_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual			{
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
		)
		
	)+	{
		// expected element after STAR or PLUS
	}
	
	{
		// expected element is a CsString
	}
	a3 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectOneOf();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	
;

parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectIntersectionOf returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectIntersectionOf element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = 'IntersectionOf' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectIntersectionOf();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a CsString
	}
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectIntersectionOf();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a2_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression		{
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
	)
	
	{
		// expected element before STAR or QUESTIONMARK or PLUS
	}
	(
		{
			// expected element is a Terminal
		}
		(
			a3_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression			{
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
		)
		
	)+	{
		// expected element after STAR or PLUS
	}
	
	{
		// expected element is a CsString
	}
	a4 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectIntersectionOf();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a4, element);
	}
	
;

parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectAllValuesFrom returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectAllValuesFrom element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = 'All' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectAllValuesFrom();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a CsString
	}
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectAllValuesFrom();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a2_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression		{
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
	)
	
	{
		// expected element is a Terminal
	}
	(
		a3_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression		{
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
	)
	
	{
		// expected element is a CsString
	}
	a4 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectAllValuesFrom();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a4, element);
	}
	
;

parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectSomeValuesFrom returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectSomeValuesFrom element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = 'Some' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectSomeValuesFrom();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a CsString
	}
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectSomeValuesFrom();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a2_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression		{
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
	)
	
	{
		// expected element is a Terminal
	}
	(
		a3_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression		{
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
	)
	
	{
		// expected element is a CsString
	}
	a4 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectSomeValuesFrom();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a4, element);
	}
	
;

parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectHasValue returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectHasValue element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = 'Has' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectHasValue();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a CsString
	}
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectHasValue();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a2_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression		{
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
	)
	
	{
		// expected element is a Terminal
	}
	(
		a3_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual		{
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
	)
	
	{
		// expected element is a CsString
	}
	a4 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectHasValue();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a4, element);
	}
	
;

parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMinCardinality returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectMinCardinality element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = 'Min' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectMinCardinality();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a CsString
	}
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectMinCardinality();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a2 = INTEGER		
		{
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
	)
	
	{
		// expected element is a Terminal
	}
	(
		a3_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression		{
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
	)
	
	{
		// expected element before STAR or QUESTIONMARK or PLUS
	}
	(
		{
			// expected element is a Terminal
		}
		(
			a4_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression			{
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
		)
		
	)?	
	{
		// expected element is a CsString
	}
	a5 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectMinCardinality();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a5, element);
	}
	
;

parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMaxCardinality returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectMaxCardinality element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = 'Max' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectMaxCardinality();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a CsString
	}
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectMaxCardinality();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a2 = INTEGER		
		{
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
	)
	
	{
		// expected element is a Terminal
	}
	(
		a3_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression		{
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
	)
	
	{
		// expected element before STAR or QUESTIONMARK or PLUS
	}
	(
		{
			// expected element is a Terminal
		}
		(
			a4_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression			{
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
		)
		
	)?	
	{
		// expected element is a CsString
	}
	a5 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectMaxCardinality();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a5, element);
	}
	
;

parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectExactCardinality returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectExactCardinality element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = 'Exact' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectExactCardinality();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a CsString
	}
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectExactCardinality();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a2 = INTEGER		
		{
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
	)
	
	{
		// expected element is a Terminal
	}
	(
		a3_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression		{
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
	)
	
	{
		// expected element before STAR or QUESTIONMARK or PLUS
	}
	(
		{
			// expected element is a Terminal
		}
		(
			a4_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression			{
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
		)
		
	)?	
	{
		// expected element is a CsString
	}
	a5 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectExactCardinality();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a5, element);
	}
	
;

parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataHasValue returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataHasValue element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = 'Has' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDataHasValue();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a CsString
	}
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDataHasValue();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a2_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyExpression		{
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
	)
	
	{
		// expected element is a Terminal
	}
	(
		a3_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Literal		{
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
	)
	
	{
		// expected element is a CsString
	}
	a4 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDataHasValue();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a4, element);
	}
	
;

parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FullIRI returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.FullIRI element = null]
@init{
}
:
	{
		// expected element is a Terminal
	}
	(
		a0 = FULLIRI		
		{
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
	)
	
;

parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AbbreviatedIRI returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.AbbreviatedIRI element = null]
@init{
}
:
	{
		// expected element is a Terminal
	}
	(
		a0 = ABBRIRI		
		{
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
	)
	
;

parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyDeclaration returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyDeclaration element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = 'ObjectProperty' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectPropertyDeclaration();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a CsString
	}
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectPropertyDeclaration();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a2_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyVariable		{
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
	)
	
	{
		// expected element is a CsString
	}
	a3 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createObjectPropertyDeclaration();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	
;

parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DatatypePropertyDeclaration returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.DatatypePropertyDeclaration element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = 'DatatypeProperty' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDatatypePropertyDeclaration();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a CsString
	}
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDatatypePropertyDeclaration();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a2_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyVariable		{
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
	)
	
	{
		// expected element is a CsString
	}
	a3 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createDatatypePropertyDeclaration();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	
;

parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualDeclaration returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.IndividualDeclaration element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = 'Individual' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createIndividualDeclaration();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a CsString
	}
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createIndividualDeclaration();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a2_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualVariable		{
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
	)
	
	{
		// expected element is a CsString
	}
	a3 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createIndividualDeclaration();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	
;

parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassDeclaration returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassDeclaration element = null]
@init{
}
:
	{
		// expected element is a CsString
	}
	a0 = 'Class' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createClassDeclaration();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	
	{
		// expected element is a CsString
	}
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createClassDeclaration();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	
	{
		// expected element is a Terminal
	}
	(
		a2_0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassVariable		{
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
	)
	
	{
		// expected element is a CsString
	}
	a3 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory.eINSTANCE.createClassDeclaration();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	
;

parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IRI returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.IRI element = null]
:
	c0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FullIRI{ element = c0; /* this is a subclass choice */ }
	|	c1 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AbbreviatedIRI{ element = c1; /* this is a subclass choice */ }
	
;

parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Atom returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.Atom element = null]
:
	c0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentClasses{ element = c0; /* this is a subclass choice */ }
	|	c1 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubClassOf{ element = c1; /* this is a subclass choice */ }
	|	c2 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DisjointClasses{ element = c2; /* this is a subclass choice */ }
	|	c3 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyAssertion{ element = c3; /* this is a subclass choice */ }
	|	c4 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyAssertion{ element = c4; /* this is a subclass choice */ }
	|	c5 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassAssertion{ element = c5; /* this is a subclass choice */ }
	|	c6 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SameIndividual{ element = c6; /* this is a subclass choice */ }
	|	c7 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DifferentIndividuals{ element = c7; /* this is a subclass choice */ }
	|	c8 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_EquivalentObjectProperties{ element = c8; /* this is a subclass choice */ }
	|	c9 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SubPropertyOf{ element = c9; /* this is a subclass choice */ }
	|	c10 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectPropertyAtom{ element = c10; /* this is a subclass choice */ }
	|	c11 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_FunctionalObjectProperty{ element = c11; /* this is a subclass choice */ }
	|	c12 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseFunctionalObjectProperty{ element = c12; /* this is a subclass choice */ }
	|	c13 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_TransitiveObjectProperty{ element = c13; /* this is a subclass choice */ }
	|	c14 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_SymmetricObjectProperty{ element = c14; /* this is a subclass choice */ }
	|	c15 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyDeclaration{ element = c15; /* this is a subclass choice */ }
	|	c16 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DatatypePropertyDeclaration{ element = c16; /* this is a subclass choice */ }
	|	c17 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualDeclaration{ element = c17; /* this is a subclass choice */ }
	|	c18 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassDeclaration{ element = c18; /* this is a subclass choice */ }
	
;

parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassExpression returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassExpression element = null]
:
	c0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ClassVariable{ element = c0; /* this is a subclass choice */ }
	|	c1 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Class{ element = c1; /* this is a subclass choice */ }
	|	c2 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectUnionOf{ element = c2; /* this is a subclass choice */ }
	|	c3 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectComplementOf{ element = c3; /* this is a subclass choice */ }
	|	c4 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectOneOf{ element = c4; /* this is a subclass choice */ }
	|	c5 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectIntersectionOf{ element = c5; /* this is a subclass choice */ }
	|	c6 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectAllValuesFrom{ element = c6; /* this is a subclass choice */ }
	|	c7 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectSomeValuesFrom{ element = c7; /* this is a subclass choice */ }
	|	c8 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectHasValue{ element = c8; /* this is a subclass choice */ }
	|	c9 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMinCardinality{ element = c9; /* this is a subclass choice */ }
	|	c10 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectMaxCardinality{ element = c10; /* this is a subclass choice */ }
	|	c11 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectExactCardinality{ element = c11; /* this is a subclass choice */ }
	|	c12 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataHasValue{ element = c12; /* this is a subclass choice */ }
	
;

parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_Individual returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.Individual element = null]
:
	c0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_IndividualVariable{ element = c0; /* this is a subclass choice */ }
	|	c1 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_NamedIndividual{ element = c1; /* this is a subclass choice */ }
	|	c2 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_AnonymousIndividual{ element = c2; /* this is a subclass choice */ }
	
;

parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyExpression returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyExpression element = null]
:
	c0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectPropertyVariable{ element = c0; /* this is a subclass choice */ }
	|	c1 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_ObjectProperty{ element = c1; /* this is a subclass choice */ }
	|	c2 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_InverseObjectProperty{ element = c2; /* this is a subclass choice */ }
	
;

parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyExpression returns [de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyExpression element = null]
:
	c0 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataPropertyVariable{ element = c0; /* this is a subclass choice */ }
	|	c1 = parse_de_uniko_isweb_emftext_sparqlas_SPARQLAS_DataProperty{ element = c1; /* this is a subclass choice */ }
	
;

WHITESPACE:
	(' '|'\t'|'\f')
	{ _channel = 99; }
;
LINEBREAKS:
	('\r\n'|'\r'|'\n')
	{ _channel = 99; }
;
COMMENT:
	'//'(~('\n'|'\r'|'\uffff'))*
	{ _channel = 99; }
;
INTEGER:
	('-')?('1'..'9')('0'..'9')*|'0';
FLOAT:
	('-')?(('1'..'9') ('0'..'9')* | '0') '.' ('0'..'9')+	{ _channel = 99; }
;
STRING:
	('A'..'Z' | 'a'..'z' | '0'..'9' | '-')+;
LITERAL:
	('"')('A'..'Z' | 'a'..'z' | '0'..'9' | '-')+('"')
;
NODE:
	('_')(':')('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-')+;
VARIABLE:
	('?')('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-')+;
ABBRIRI:
	('A'..'Z' | 'a'..'z' | '0'..'9' | '-')+(':')('A'..'Z' | 'a'..'z' | '0'..'9' |'_' | '-')+;
FULLIRI:
	(('<')(~('>')|('\\''>'))*('>'))|(('A'..'Z' | ':' | 'a'..'z' | '0'..'9' | '-' )('A'..'Z' | ':' | 'a'..'z' | '0'..'9' | '_' | '-' )+)
;
