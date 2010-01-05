grammar Owl2fs;

options {
	superClass = Owl2fsANTLRParserBase;
	backtrack = true;
	memoize = true;
}

@lexer::header {
	package de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp;
}

@lexer::members {
	public java.util.List<org.antlr.runtime.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime.RecognitionException>();
	public java.util.List<java.lang.Integer> lexerExceptionsPosition = new java.util.ArrayList<java.lang.Integer>();
	
	public void reportError(org.antlr.runtime.RecognitionException e) {
		lexerExceptions.add(e);
		lexerExceptionsPosition.add(((org.antlr.runtime.ANTLRStringStream) input).index());
	}
}
@header{
	package de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp;
}

@members{
	private de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolverFactory tokenResolverFactory = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTokenResolverFactory();
	@SuppressWarnings("unused")
	
	private int lastPosition;
	private de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTokenResolveResult tokenResolveResult = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTokenResolveResult();
	private boolean rememberExpectedElements = false;
	private java.lang.Object parseToIndexTypeObject;
	private int lastTokenIndex = 0;
	private java.util.List<de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal> expectedElements = new java.util.ArrayList<de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal>();
	private int mismatchedTokenRecoveryTries = 0;
	private java.util.Map<?, ?> options;
	//helper lists to allow a lexer to pass errors to its parser
	protected java.util.List<org.antlr.runtime.RecognitionException> lexerExceptions = java.util.Collections.synchronizedList(new java.util.ArrayList<org.antlr.runtime.RecognitionException>());
	protected java.util.List<java.lang.Integer> lexerExceptionsPosition = java.util.Collections.synchronizedList(new java.util.ArrayList<java.lang.Integer>());
	private int stopIncludingHiddenTokens;
	private int stopExcludingHiddenTokens;
	private java.util.Collection<de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsCommand<de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTextResource>> postParseCommands;
	private boolean terminateParsing;
	private int tokenIndexOfLastCompleteElement;
	private int expectedElementsIndexOfLastCompleteElement;
	
	protected void addErrorToResource(final java.lang.String errorMessage, final int line, final int charPositionInLine, final int startIndex, final int stopIndex) {
		postParseCommands.add(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsCommand<de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTextResource>() {
			public boolean execute(de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTextResource resource) {
				if (resource == null) {
					// the resource can be null if the parser is used for
					// code completion
					return true;
				}
				resource.addProblem(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsProblem() {
					public de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.Owl2fsEProblemType getType() {
						return de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.Owl2fsEProblemType.ERROR;
					}
					public java.lang.String getMessage() {
						return errorMessage;
					}
				}, line, charPositionInLine, startIndex, stopIndex);
				return true;
			}
		});
	}
	
	public void addExpectedElement(de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal expectedElement) {
		if (!this.rememberExpectedElements) {
			return;
		}
		setPosition(expectedElement, input.index());
		this.expectedElements.add(expectedElement);
	}
	
	protected void addMapEntry(org.eclipse.emf.ecore.EObject element, org.eclipse.emf.ecore.EStructuralFeature structuralFeature, de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsDummyEObject dummy) {
		java.lang.Object value = element.eGet(structuralFeature);
		java.lang.Object mapKey = dummy.getValueByName("key");
		java.lang.Object mapValue = dummy.getValueByName("value");
		if (value instanceof org.eclipse.emf.common.util.EMap<?, ?>) {
			org.eclipse.emf.common.util.EMap<java.lang.Object, java.lang.Object> valueMap = de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.util.Owl2fsMapUtil.castToEMap(value);
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
			assert(object instanceof de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsDummyEObject);
			de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsDummyEObject dummy = (de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsDummyEObject) object;
			org.eclipse.emf.ecore.EObject newEObject = dummy.applyTo(currentTarget);
			currentTarget = newEObject;
		}
		return currentTarget;
	}
	
	protected void collectHiddenTokens(org.eclipse.emf.ecore.EObject element) {
	}
	
	protected void copyLocalizationInfos(final org.eclipse.emf.ecore.EObject source, final org.eclipse.emf.ecore.EObject target) {
		postParseCommands.add(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsCommand<de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTextResource>() {
			public boolean execute(de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTextResource resource) {
				de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsLocationMap locationMap = resource.getLocationMap();
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
		postParseCommands.add(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsCommand<de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTextResource>() {
			public boolean execute(de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTextResource resource) {
				de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsLocationMap locationMap = resource.getLocationMap();
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
	
	public de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTextParser createInstance(java.io.InputStream actualInputStream, java.lang.String encoding) {
		try {
			if (encoding == null) {
				return new Owl2fsParser(new org.antlr.runtime.CommonTokenStream(new Owl2fsLexer(new org.antlr.runtime.ANTLRInputStream(actualInputStream))));
			} else {
				return new Owl2fsParser(new org.antlr.runtime.CommonTokenStream(new Owl2fsLexer(new org.antlr.runtime.ANTLRInputStream(actualInputStream, encoding))));
			}
		} catch (java.io.IOException e) {
			de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsPlugin.logError("Error while creating parser.", e);
			return null;
		}
	}
	
	// This default constructor is only used to call createInstance() on it
	public Owl2fsParser() {
		super(null);
	}
	
	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime.RecognitionException {
		this.lastPosition = 0;
		// required because the lexer class can not be subclassed
		((Owl2fsLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
		((Owl2fsLexer) getTokenStream().getTokenSource()).lexerExceptionsPosition = lexerExceptionsPosition;
		java.lang.Object typeObject = getTypeObject();
		if (typeObject == null) {
			return start();
		} else if (typeObject instanceof org.eclipse.emf.ecore.EClass) {
			org.eclipse.emf.ecore.EClass type = (org.eclipse.emf.ecore.EClass) typeObject;
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.URI.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_URI();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.FullURI.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_FullURI();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.AbbreviatedURI.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_AbbreviatedURI();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.OntologyDocument.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_OntologyDocument();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.PrefixDefinition.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_PrefixDefinition();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.Ontology.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Ontology();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.Declaration.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Declaration();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.Class.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Class();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.Datatype.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Datatype();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectProperty.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectProperty();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.DataProperty.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataProperty();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.NamedIndividual.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_NamedIndividual();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.AnonymousIndividual.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_AnonymousIndividual();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.Literal.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Literal();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.InverseObjectProperty.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_InverseObjectProperty();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.DataComplementOf.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataComplementOf();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.DataOneOf.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataOneOf();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.DatatypeRestriction.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DatatypeRestriction();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.FacetConstantPair.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_FacetConstantPair();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectIntersectionOf.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectIntersectionOf();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectUnionOf.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectUnionOf();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectComplementOf.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectComplementOf();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectOneOf.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectOneOf();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectSomeValuesFrom.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectSomeValuesFrom();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectAllValuesFrom.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectAllValuesFrom();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectHasValue.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectHasValue();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectExistsSelf.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectExistsSelf();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectMinCardinality.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectMinCardinality();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectMaxCardinality.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectMaxCardinality();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectExactCardinality.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectExactCardinality();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.DataSomeValuesFrom.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataSomeValuesFrom();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.DataAllValuesFrom.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataAllValuesFrom();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.DataHasValue.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataHasValue();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.DataMinCardinality.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataMinCardinality();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.DataMaxCardinality.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataMaxCardinality();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.DataExactCardinality.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataExactCardinality();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.SubClassOf.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_SubClassOf();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.EquivalentClasses.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_EquivalentClasses();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointClasses.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DisjointClasses();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointUnion.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DisjointUnion();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.SubObjectPropertyOf.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_SubObjectPropertyOf();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.EquivalentObjectProperties.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_EquivalentObjectProperties();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointObjectProperties.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DisjointObjectProperties();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyDomain.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectPropertyDomain();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyRange.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectPropertyRange();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.InverseObjectProperties.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_InverseObjectProperties();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.FunctionalObjectProperty.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_FunctionalObjectProperty();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.InverseFunctionalObjectProperty.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_InverseFunctionalObjectProperty();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.ReflexiveObjectProperty.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ReflexiveObjectProperty();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.IrreflexiveObjectProperty.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_IrreflexiveObjectProperty();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.SymmetricObjectProperty.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_SymmetricObjectProperty();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.AsymmetricObjectProperty.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_AsymmetricObjectProperty();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.TransitiveObjectProperty.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_TransitiveObjectProperty();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.SubDataPropertyOf.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_SubDataPropertyOf();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.EquivalentDataProperties.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_EquivalentDataProperties();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointDataProperties.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DisjointDataProperties();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyDomain.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataPropertyDomain();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyRange.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataPropertyRange();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.FunctionalDataProperty.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_FunctionalDataProperty();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.KeyFor.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_KeyFor();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.SameIndividual.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_SameIndividual();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.DifferentIndividuals.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DifferentIndividuals();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.ClassAssertion.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ClassAssertion();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyAssertion.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectPropertyAssertion();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.NegativeObjectPropertyAssertion.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_NegativeObjectPropertyAssertion();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyAssertion.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataPropertyAssertion();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.NegativeDataPropertyAssertion.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_NegativeDataPropertyAssertion();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.Annotation.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Annotation();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.AnnotationProperty.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_AnnotationProperty();
			}
			if (type.getInstanceClass() == de.uniko.isweb.emftext.owl2fs.owl2fs.EntityAnnotation.class) {
				return parse_de_uniko_isweb_emftext_owl2fs_owl2fs_EntityAnnotation();
			}
		}
		throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsUnexpectedContentTypeException(typeObject);
	}
	
	private de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTokenResolveResult getFreshTokenResolveResult() {
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
	
	public de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsMetaInformation getMetaInformation() {
		return new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsMetaInformation();
	}
	
	public java.lang.Object getParseToIndexTypeObject() {
		return parseToIndexTypeObject;
	}
	
	protected de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsReferenceResolverSwitch getReferenceResolverSwitch() {
		return (de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsReferenceResolverSwitch) getMetaInformation().getReferenceResolverSwitch();
	}
	
	protected java.lang.Object getTypeObject() {
		java.lang.Object typeObject = getParseToIndexTypeObject();
		if (typeObject != null) {
			return typeObject;
		}
		java.util.Map<?,?> options = getOptions();
		if (options != null) {
			typeObject = options.get(de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsOptions.RESOURCE_CONTENT_TYPE);
		}
		return typeObject;
	}
	
	// Implementation that calls {@link #doParse()}  and handles the thrown
	// RecognitionExceptions.
	public de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsParseResult parse() {
		terminateParsing = false;
		postParseCommands = new java.util.ArrayList<de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsCommand<de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTextResource>>();
		de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsParseResult parseResult = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsParseResult();
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
	
	public java.util.List<de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTextResource dummyResource) {
		rememberExpectedElements = true;
		parseToIndexTypeObject = type;
		final org.antlr.runtime.CommonTokenStream tokenStream = (org.antlr.runtime.CommonTokenStream) getTokenStream();
		de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsParseResult result = parse();
		if (result != null) {
			org.eclipse.emf.ecore.EObject root = result.getRoot();
			if (root != null) {
				dummyResource.getContents().add(root);
			}
			for (de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsCommand<de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTextResource> command : result.getPostParseCommands()) {
				command.execute(dummyResource);
			}
		}
		// remove all expected elements that were added after the last complete element
		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
		java.util.Set<de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal> currentFollowSet = new java.util.LinkedHashSet<de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal>();
		java.util.List<de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal> newFollowSet = new java.util.ArrayList<de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal>();
		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
			de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal expectedElementI = expectedElements.get(i);
			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
				currentFollowSet.add(expectedElementI);
			} else {
				break;
			}
		}
		int followSetID = 370;
		int i;
		for (i = tokenIndexOfLastCompleteElement; i < tokenStream.size(); i++) {
			org.antlr.runtime.CommonToken nextToken = (org.antlr.runtime.CommonToken) tokenStream.get(i);
			if (nextToken.getChannel() == 99) {
				// hidden tokens do not reduce the follow set
			} else {
				// now that we have found the next visible token the position for that expected terminals
				// can be set
				for (de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal nextFollow : newFollowSet) {
					lastTokenIndex = 0;
					setPosition(nextFollow, i);
				}
				newFollowSet.clear();
				// normal tokens do reduce the follow set - only elements that match the token are kept
				for (de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal nextFollow : currentFollowSet) {
					if (nextFollow.getTerminal().getTokenName().equals(getTokenNames()[nextToken.getType()])) {
						// keep this one - it matches
						java.util.Collection<de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement> newFollowers = nextFollow.getTerminal().getFollowers();
						for (de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement newFollower : newFollowers) {
							de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal newFollowTerminal = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(newFollower, followSetID);
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
		for (de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal nextFollow : newFollowSet) {
			lastTokenIndex = 0;
			setPosition(nextFollow, i);
		}
		return this.expectedElements;
	}
	
	public void setPosition(de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal expectedElement, int tokenIndex) {
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
	protected <ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> void registerContextDependentProxy(final de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsContextDependentURIFragmentFactory<ContainerType, ReferenceType> factory, final ContainerType element, final org.eclipse.emf.ecore.EReference reference, final String id, final org.eclipse.emf.ecore.EObject proxy) {
		postParseCommands.add(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsCommand<de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTextResource>() {
			public boolean execute(de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTextResource resource) {
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
				tokenName = de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.util.Owl2fsStringUtil.formatTokenName(tokenName);
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
	
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_0 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("Namespace");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_1 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.eINSTANCE.getURI().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.URI__VALUE), "DIRTYIRI");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_2 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_3 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("ObjectIntersectionOf");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_4 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("ObjectUnionOf");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_5 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("ObjectComplementOf");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_6 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("ObjectOneOf");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_7 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("ObjectSomeValuesFrom");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_8 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("ObjectAllValuesFrom");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_9 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("ObjectHasValue");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_10 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("ObjectExistsSelf");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_11 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("ObjectMinCardinality");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_12 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("ObjectMaxCardinality");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_13 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("ObjectExactCardinality");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_14 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("DataSomeValuesFrom");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_15 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("DataAllValuesFrom");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_16 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("DataHasValue");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_17 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("DataMinCardinality");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_18 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("DataMaxCardinality");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_19 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("DataExactCardinality");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_20 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_21 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_22 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_23 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_24 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_25 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_26 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_27 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_28 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_29 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_30 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_31 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_32 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_33 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.eINSTANCE.getAnonymousIndividual().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ANONYMOUS_INDIVIDUAL__NODE_ID), "NODE");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_34 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_35 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("ObjectInverseOf");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_36 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_37 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_38 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_39 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_40 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_41 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_42 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_43 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.eINSTANCE.getDatatype().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATATYPE__DATA_TYPE), "DIRTYIRI");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_44 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("DataComplementOf");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_45 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("DataOneOf");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_46 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("DatatypeRestriction");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_47 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.eINSTANCE.getLiteral().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.LITERAL__LEXICAL_VALUE), "LITERAL");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_48 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_49 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_50 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_51 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_52 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_53 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_54 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.eINSTANCE.getFullURI().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.FULL_URI__IRI), "FULLIRI");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_55 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_56 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("AbbreviatedURI");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_57 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("{");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_58 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("localName");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_59 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("}");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_60 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(":");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_61 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.eINSTANCE.getAbbreviatedURI().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ABBREVIATED_URI__LOCAL_NAME), "QUOTED_34_34");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_62 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("Ontology");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_63 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_64 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.eINSTANCE.getPrefixDefinition().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.PREFIX_DEFINITION__PREF), "DIRTYIRI");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_65 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("=");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_66 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_67 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.eINSTANCE.getOntology().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ONTOLOGY__ONTOLOGY_URI), "FULLIRI");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_68 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.eINSTANCE.getOntology().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ONTOLOGY__VERSION_URI), "DIRTYIRI");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_69 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("Import");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_70 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("Annotation");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_71 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("Comment");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_72 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("Label");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_73 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("Declaration");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_74 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("SubClassOf");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_75 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("EquivalentClasses");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_76 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("DisjointClasses");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_77 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("DisjointUnion");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_78 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("SubObjectPropertyOf");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_79 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("EquivalentObjectProperties");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_80 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("DisjointObjectProperties");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_81 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("ObjectPropertyDomain");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_82 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("ObjectPropertyRange");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_83 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("InverseObjectProperties");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_84 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("FunctionalObjectProperty");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_85 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("InverseFunctionalObjectProperty");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_86 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("ReflexiveObjectProperty");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_87 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("IrreflexiveObjectProperty");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_88 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("SymmetricObjectProperty");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_89 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("AsymmetricObjectProperty");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_90 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("TransitiveObjectProperty");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_91 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("SubDataPropertyOf");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_92 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("EquivalentDataProperties");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_93 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("DisjointDataProperties");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_94 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("DataPropertyDomain");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_95 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("DataPropertyRange");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_96 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("FunctionalDataProperty");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_97 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("KeyFor");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_98 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("SameIndividual");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_99 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("DifferentIndividuals");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_100 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("ClassAssertion");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_101 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("ObjectPropertyAssertion");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_102 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("NegativeObjectPropertyAssertion");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_103 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("DataPropertyAssertion");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_104 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("NegativeDataPropertyAssertion");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_105 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("EntityAnnotation");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_106 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_107 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_108 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_109 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_110 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("Class");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_111 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("Datatype");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_112 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("ObjectProperty");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_113 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("DataProperty");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_114 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("Individual");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_115 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_116 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_117 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_118 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.eINSTANCE.getFacetConstantPair().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.FACET_CONSTANT_PAIR__FACET), "DIRTYIRI");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_119 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_120 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_121 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_122 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_123 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_124 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_125 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_126 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_127 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_128 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_129 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_130 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("^^");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_131 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_132 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_133 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_134 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_135 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_136 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_137 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_138 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_139 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_140 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_141 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_142 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_143 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_144 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_145 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_146 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.eINSTANCE.getObjectMinCardinality().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_MIN_CARDINALITY__CARDINALITY), "INTEGER");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_147 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_148 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.eINSTANCE.getObjectMaxCardinality().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_MAX_CARDINALITY__CARDINALITY), "INTEGER");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_149 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_150 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.eINSTANCE.getObjectExactCardinality().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_EXACT_CARDINALITY__CARDINALITY), "INTEGER");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_151 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_152 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_153 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_154 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_155 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.eINSTANCE.getDataMinCardinality().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_MIN_CARDINALITY__CARDINALITY), "INTEGER");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_156 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_157 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.eINSTANCE.getDataMaxCardinality().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_MAX_CARDINALITY__CARDINALITY), "INTEGER");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_158 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_159 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.eINSTANCE.getDataExactCardinality().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_EXACT_CARDINALITY__CARDINALITY), "INTEGER");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_160 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_161 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_162 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_163 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_164 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_165 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_166 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_167 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_168 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_169 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_170 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_171 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_172 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_173 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_174 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_175 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_176 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_177 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_178 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_179 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_180 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_181 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_182 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_183 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_184 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_185 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_186 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_187 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_188 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_189 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_190 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_191 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_192 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_193 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_194 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_195 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_196 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_197 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_198 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_199 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_200 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_201 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_202 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_203 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_204 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_205 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_206 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_207 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_208 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_209 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_210 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_211 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("AnnotationProperty");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_212 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("Datatype");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_213 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("ObjectProperty");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_214 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("Class");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_215 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("NamedIndividual");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_216 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("DataProperty");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_217 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	
	public static void wire0() {
		TERMINAL_1.addFollower(TERMINAL_2);
		TERMINAL_1.addFollower(TERMINAL_1);
		TERMINAL_1.addFollower(TERMINAL_3);
		TERMINAL_1.addFollower(TERMINAL_4);
		TERMINAL_1.addFollower(TERMINAL_5);
		TERMINAL_1.addFollower(TERMINAL_6);
		TERMINAL_1.addFollower(TERMINAL_7);
		TERMINAL_1.addFollower(TERMINAL_8);
		TERMINAL_1.addFollower(TERMINAL_9);
		TERMINAL_1.addFollower(TERMINAL_10);
		TERMINAL_1.addFollower(TERMINAL_11);
		TERMINAL_1.addFollower(TERMINAL_12);
		TERMINAL_1.addFollower(TERMINAL_13);
		TERMINAL_1.addFollower(TERMINAL_14);
		TERMINAL_1.addFollower(TERMINAL_15);
		TERMINAL_1.addFollower(TERMINAL_16);
		TERMINAL_1.addFollower(TERMINAL_17);
		TERMINAL_1.addFollower(TERMINAL_18);
		TERMINAL_1.addFollower(TERMINAL_19);
		TERMINAL_1.addFollower(TERMINAL_20);
		TERMINAL_1.addFollower(TERMINAL_21);
		TERMINAL_1.addFollower(TERMINAL_22);
		TERMINAL_1.addFollower(TERMINAL_23);
		TERMINAL_1.addFollower(TERMINAL_24);
		TERMINAL_1.addFollower(TERMINAL_25);
		TERMINAL_1.addFollower(TERMINAL_26);
		TERMINAL_1.addFollower(TERMINAL_27);
		TERMINAL_1.addFollower(TERMINAL_28);
		TERMINAL_1.addFollower(TERMINAL_29);
		TERMINAL_1.addFollower(TERMINAL_30);
		TERMINAL_1.addFollower(TERMINAL_31);
		TERMINAL_1.addFollower(TERMINAL_32);
		TERMINAL_1.addFollower(TERMINAL_33);
		TERMINAL_1.addFollower(TERMINAL_34);
		TERMINAL_1.addFollower(TERMINAL_35);
		TERMINAL_1.addFollower(TERMINAL_36);
		TERMINAL_1.addFollower(TERMINAL_37);
		TERMINAL_1.addFollower(TERMINAL_38);
		TERMINAL_1.addFollower(TERMINAL_39);
		TERMINAL_1.addFollower(TERMINAL_40);
		TERMINAL_1.addFollower(TERMINAL_41);
		TERMINAL_1.addFollower(TERMINAL_42);
		TERMINAL_1.addFollower(TERMINAL_43);
		TERMINAL_1.addFollower(TERMINAL_44);
		TERMINAL_1.addFollower(TERMINAL_45);
		TERMINAL_1.addFollower(TERMINAL_46);
		TERMINAL_1.addFollower(TERMINAL_47);
		TERMINAL_1.addFollower(TERMINAL_48);
		TERMINAL_1.addFollower(TERMINAL_49);
		TERMINAL_1.addFollower(TERMINAL_50);
		TERMINAL_1.addFollower(TERMINAL_51);
		TERMINAL_1.addFollower(TERMINAL_52);
		TERMINAL_1.addFollower(TERMINAL_53);
		TERMINAL_54.addFollower(TERMINAL_55);
		TERMINAL_56.addFollower(TERMINAL_57);
		TERMINAL_57.addFollower(TERMINAL_58);
		TERMINAL_57.addFollower(TERMINAL_59);
		TERMINAL_58.addFollower(TERMINAL_60);
		TERMINAL_60.addFollower(TERMINAL_61);
		TERMINAL_61.addFollower(TERMINAL_58);
		TERMINAL_61.addFollower(TERMINAL_59);
		TERMINAL_0.addFollower(TERMINAL_63);
		TERMINAL_63.addFollower(TERMINAL_64);
		TERMINAL_63.addFollower(TERMINAL_65);
		TERMINAL_64.addFollower(TERMINAL_65);
		TERMINAL_65.addFollower(TERMINAL_54);
		TERMINAL_55.addFollower(TERMINAL_0);
		TERMINAL_55.addFollower(TERMINAL_62);
		TERMINAL_62.addFollower(TERMINAL_66);
		TERMINAL_66.addFollower(TERMINAL_67);
		TERMINAL_67.addFollower(TERMINAL_68);
		TERMINAL_67.addFollower(TERMINAL_69);
		TERMINAL_67.addFollower(TERMINAL_70);
		TERMINAL_67.addFollower(TERMINAL_71);
		TERMINAL_67.addFollower(TERMINAL_72);
		TERMINAL_67.addFollower(TERMINAL_73);
		TERMINAL_67.addFollower(TERMINAL_74);
		TERMINAL_67.addFollower(TERMINAL_75);
		TERMINAL_67.addFollower(TERMINAL_76);
		TERMINAL_67.addFollower(TERMINAL_77);
		TERMINAL_67.addFollower(TERMINAL_78);
		TERMINAL_67.addFollower(TERMINAL_79);
		TERMINAL_67.addFollower(TERMINAL_80);
		TERMINAL_67.addFollower(TERMINAL_81);
		TERMINAL_67.addFollower(TERMINAL_82);
		TERMINAL_67.addFollower(TERMINAL_83);
		TERMINAL_67.addFollower(TERMINAL_84);
		TERMINAL_67.addFollower(TERMINAL_85);
		TERMINAL_67.addFollower(TERMINAL_86);
		TERMINAL_67.addFollower(TERMINAL_87);
		TERMINAL_67.addFollower(TERMINAL_88);
		TERMINAL_67.addFollower(TERMINAL_89);
		TERMINAL_67.addFollower(TERMINAL_90);
		TERMINAL_67.addFollower(TERMINAL_91);
		TERMINAL_67.addFollower(TERMINAL_92);
		TERMINAL_67.addFollower(TERMINAL_93);
		TERMINAL_67.addFollower(TERMINAL_94);
		TERMINAL_67.addFollower(TERMINAL_95);
		TERMINAL_67.addFollower(TERMINAL_96);
		TERMINAL_67.addFollower(TERMINAL_97);
		TERMINAL_67.addFollower(TERMINAL_98);
		TERMINAL_67.addFollower(TERMINAL_99);
		TERMINAL_67.addFollower(TERMINAL_100);
		TERMINAL_67.addFollower(TERMINAL_101);
		TERMINAL_67.addFollower(TERMINAL_102);
		TERMINAL_67.addFollower(TERMINAL_103);
		TERMINAL_67.addFollower(TERMINAL_104);
		TERMINAL_67.addFollower(TERMINAL_105);
		TERMINAL_67.addFollower(TERMINAL_106);
		TERMINAL_68.addFollower(TERMINAL_69);
		TERMINAL_68.addFollower(TERMINAL_70);
		TERMINAL_68.addFollower(TERMINAL_71);
		TERMINAL_68.addFollower(TERMINAL_72);
		TERMINAL_68.addFollower(TERMINAL_73);
		TERMINAL_68.addFollower(TERMINAL_74);
		TERMINAL_68.addFollower(TERMINAL_75);
		TERMINAL_68.addFollower(TERMINAL_76);
		TERMINAL_68.addFollower(TERMINAL_77);
		TERMINAL_68.addFollower(TERMINAL_78);
		TERMINAL_68.addFollower(TERMINAL_79);
		TERMINAL_68.addFollower(TERMINAL_80);
		TERMINAL_68.addFollower(TERMINAL_81);
		TERMINAL_68.addFollower(TERMINAL_82);
		TERMINAL_68.addFollower(TERMINAL_83);
		TERMINAL_68.addFollower(TERMINAL_84);
		TERMINAL_68.addFollower(TERMINAL_85);
		TERMINAL_68.addFollower(TERMINAL_86);
		TERMINAL_68.addFollower(TERMINAL_87);
		TERMINAL_68.addFollower(TERMINAL_88);
		TERMINAL_68.addFollower(TERMINAL_89);
		TERMINAL_68.addFollower(TERMINAL_90);
		TERMINAL_68.addFollower(TERMINAL_91);
		TERMINAL_68.addFollower(TERMINAL_92);
		TERMINAL_68.addFollower(TERMINAL_93);
		TERMINAL_68.addFollower(TERMINAL_94);
		TERMINAL_68.addFollower(TERMINAL_95);
		TERMINAL_68.addFollower(TERMINAL_96);
		TERMINAL_68.addFollower(TERMINAL_97);
		TERMINAL_68.addFollower(TERMINAL_98);
		TERMINAL_68.addFollower(TERMINAL_99);
		TERMINAL_68.addFollower(TERMINAL_100);
		TERMINAL_68.addFollower(TERMINAL_101);
		TERMINAL_68.addFollower(TERMINAL_102);
		TERMINAL_68.addFollower(TERMINAL_103);
		TERMINAL_68.addFollower(TERMINAL_104);
		TERMINAL_68.addFollower(TERMINAL_105);
		TERMINAL_68.addFollower(TERMINAL_106);
		TERMINAL_69.addFollower(TERMINAL_107);
		TERMINAL_107.addFollower(TERMINAL_62);
		TERMINAL_108.addFollower(TERMINAL_69);
		TERMINAL_108.addFollower(TERMINAL_70);
		TERMINAL_108.addFollower(TERMINAL_71);
		TERMINAL_108.addFollower(TERMINAL_72);
		TERMINAL_108.addFollower(TERMINAL_73);
		TERMINAL_108.addFollower(TERMINAL_74);
		TERMINAL_108.addFollower(TERMINAL_75);
		TERMINAL_108.addFollower(TERMINAL_76);
		TERMINAL_108.addFollower(TERMINAL_77);
		TERMINAL_108.addFollower(TERMINAL_78);
		TERMINAL_108.addFollower(TERMINAL_79);
		TERMINAL_108.addFollower(TERMINAL_80);
		TERMINAL_108.addFollower(TERMINAL_81);
		TERMINAL_108.addFollower(TERMINAL_82);
		TERMINAL_108.addFollower(TERMINAL_83);
		TERMINAL_108.addFollower(TERMINAL_84);
		TERMINAL_108.addFollower(TERMINAL_85);
		TERMINAL_108.addFollower(TERMINAL_86);
		TERMINAL_108.addFollower(TERMINAL_87);
		TERMINAL_108.addFollower(TERMINAL_88);
		TERMINAL_108.addFollower(TERMINAL_89);
		TERMINAL_108.addFollower(TERMINAL_90);
		TERMINAL_108.addFollower(TERMINAL_91);
		TERMINAL_108.addFollower(TERMINAL_92);
		TERMINAL_108.addFollower(TERMINAL_93);
		TERMINAL_108.addFollower(TERMINAL_94);
		TERMINAL_108.addFollower(TERMINAL_95);
		TERMINAL_108.addFollower(TERMINAL_96);
		TERMINAL_108.addFollower(TERMINAL_97);
		TERMINAL_108.addFollower(TERMINAL_98);
		TERMINAL_108.addFollower(TERMINAL_99);
		TERMINAL_108.addFollower(TERMINAL_100);
		TERMINAL_108.addFollower(TERMINAL_101);
		TERMINAL_108.addFollower(TERMINAL_102);
		TERMINAL_108.addFollower(TERMINAL_103);
		TERMINAL_108.addFollower(TERMINAL_104);
		TERMINAL_108.addFollower(TERMINAL_105);
		TERMINAL_108.addFollower(TERMINAL_106);
		TERMINAL_106.addFollower(TERMINAL_108);
		TERMINAL_73.addFollower(TERMINAL_109);
		TERMINAL_109.addFollower(TERMINAL_70);
		TERMINAL_109.addFollower(TERMINAL_71);
		TERMINAL_109.addFollower(TERMINAL_72);
		TERMINAL_109.addFollower(TERMINAL_110);
		TERMINAL_109.addFollower(TERMINAL_111);
		TERMINAL_109.addFollower(TERMINAL_112);
		TERMINAL_109.addFollower(TERMINAL_113);
		TERMINAL_109.addFollower(TERMINAL_114);
		TERMINAL_110.addFollower(TERMINAL_115);
		TERMINAL_111.addFollower(TERMINAL_115);
		TERMINAL_112.addFollower(TERMINAL_115);
		TERMINAL_113.addFollower(TERMINAL_115);
		TERMINAL_114.addFollower(TERMINAL_115);
		TERMINAL_115.addFollower(TERMINAL_1);
		TERMINAL_115.addFollower(TERMINAL_43);
		TERMINAL_2.addFollower(TERMINAL_116);
		TERMINAL_116.addFollower(TERMINAL_73);
		TERMINAL_116.addFollower(TERMINAL_74);
		TERMINAL_116.addFollower(TERMINAL_75);
		TERMINAL_116.addFollower(TERMINAL_76);
		TERMINAL_116.addFollower(TERMINAL_77);
		TERMINAL_116.addFollower(TERMINAL_78);
		TERMINAL_116.addFollower(TERMINAL_79);
		TERMINAL_116.addFollower(TERMINAL_80);
		TERMINAL_116.addFollower(TERMINAL_81);
		TERMINAL_116.addFollower(TERMINAL_82);
		TERMINAL_116.addFollower(TERMINAL_83);
		TERMINAL_116.addFollower(TERMINAL_84);
		TERMINAL_116.addFollower(TERMINAL_85);
		TERMINAL_116.addFollower(TERMINAL_86);
		TERMINAL_116.addFollower(TERMINAL_87);
		TERMINAL_116.addFollower(TERMINAL_88);
		TERMINAL_116.addFollower(TERMINAL_89);
		TERMINAL_116.addFollower(TERMINAL_90);
		TERMINAL_116.addFollower(TERMINAL_91);
		TERMINAL_116.addFollower(TERMINAL_92);
		TERMINAL_116.addFollower(TERMINAL_93);
		TERMINAL_116.addFollower(TERMINAL_94);
		TERMINAL_116.addFollower(TERMINAL_95);
		TERMINAL_116.addFollower(TERMINAL_96);
		TERMINAL_116.addFollower(TERMINAL_97);
		TERMINAL_116.addFollower(TERMINAL_98);
		TERMINAL_116.addFollower(TERMINAL_99);
		TERMINAL_116.addFollower(TERMINAL_100);
		TERMINAL_116.addFollower(TERMINAL_101);
		TERMINAL_116.addFollower(TERMINAL_102);
		TERMINAL_116.addFollower(TERMINAL_103);
		TERMINAL_116.addFollower(TERMINAL_104);
		TERMINAL_116.addFollower(TERMINAL_105);
		TERMINAL_116.addFollower(TERMINAL_106);
		TERMINAL_43.addFollower(TERMINAL_2);
		TERMINAL_43.addFollower(TERMINAL_47);
		TERMINAL_43.addFollower(TERMINAL_117);
		TERMINAL_43.addFollower(TERMINAL_118);
		TERMINAL_43.addFollower(TERMINAL_119);
		TERMINAL_43.addFollower(TERMINAL_120);
		TERMINAL_43.addFollower(TERMINAL_121);
		TERMINAL_43.addFollower(TERMINAL_122);
		TERMINAL_43.addFollower(TERMINAL_123);
		TERMINAL_43.addFollower(TERMINAL_124);
		TERMINAL_43.addFollower(TERMINAL_125);
		TERMINAL_43.addFollower(TERMINAL_48);
		TERMINAL_43.addFollower(TERMINAL_49);
		TERMINAL_43.addFollower(TERMINAL_50);
		TERMINAL_43.addFollower(TERMINAL_126);
		TERMINAL_43.addFollower(TERMINAL_31);
		TERMINAL_33.addFollower(TERMINAL_1);
		TERMINAL_33.addFollower(TERMINAL_33);
		TERMINAL_33.addFollower(TERMINAL_52);
		TERMINAL_33.addFollower(TERMINAL_129);
		TERMINAL_33.addFollower(TERMINAL_47);
		TERMINAL_47.addFollower(TERMINAL_130);
		TERMINAL_130.addFollower(TERMINAL_43);
		TERMINAL_35.addFollower(TERMINAL_131);
		TERMINAL_131.addFollower(TERMINAL_1);
		TERMINAL_32.addFollower(TERMINAL_1);
		TERMINAL_32.addFollower(TERMINAL_3);
		TERMINAL_32.addFollower(TERMINAL_4);
		TERMINAL_32.addFollower(TERMINAL_5);
		TERMINAL_32.addFollower(TERMINAL_6);
		TERMINAL_32.addFollower(TERMINAL_7);
		TERMINAL_32.addFollower(TERMINAL_8);
		TERMINAL_32.addFollower(TERMINAL_9);
		TERMINAL_32.addFollower(TERMINAL_10);
		TERMINAL_32.addFollower(TERMINAL_11);
		TERMINAL_32.addFollower(TERMINAL_12);
		TERMINAL_32.addFollower(TERMINAL_13);
		TERMINAL_32.addFollower(TERMINAL_14);
		TERMINAL_32.addFollower(TERMINAL_15);
		TERMINAL_32.addFollower(TERMINAL_16);
		TERMINAL_32.addFollower(TERMINAL_17);
		TERMINAL_32.addFollower(TERMINAL_18);
		TERMINAL_32.addFollower(TERMINAL_19);
		TERMINAL_32.addFollower(TERMINAL_33);
		TERMINAL_32.addFollower(TERMINAL_34);
		TERMINAL_32.addFollower(TERMINAL_23);
		TERMINAL_32.addFollower(TERMINAL_24);
		TERMINAL_32.addFollower(TERMINAL_25);
		TERMINAL_32.addFollower(TERMINAL_35);
		TERMINAL_32.addFollower(TERMINAL_36);
		TERMINAL_32.addFollower(TERMINAL_37);
		TERMINAL_32.addFollower(TERMINAL_38);
		TERMINAL_32.addFollower(TERMINAL_39);
		TERMINAL_32.addFollower(TERMINAL_40);
		TERMINAL_32.addFollower(TERMINAL_41);
		TERMINAL_32.addFollower(TERMINAL_42);
		TERMINAL_32.addFollower(TERMINAL_127);
		TERMINAL_44.addFollower(TERMINAL_132);
		TERMINAL_132.addFollower(TERMINAL_43);
		TERMINAL_132.addFollower(TERMINAL_44);
		TERMINAL_132.addFollower(TERMINAL_45);
		TERMINAL_132.addFollower(TERMINAL_46);
		TERMINAL_123.addFollower(TERMINAL_123);
		TERMINAL_123.addFollower(TERMINAL_124);
		TERMINAL_123.addFollower(TERMINAL_125);
		TERMINAL_123.addFollower(TERMINAL_48);
		TERMINAL_123.addFollower(TERMINAL_49);
		TERMINAL_123.addFollower(TERMINAL_50);
		TERMINAL_123.addFollower(TERMINAL_126);
		TERMINAL_45.addFollower(TERMINAL_133);
		TERMINAL_133.addFollower(TERMINAL_47);
		TERMINAL_117.addFollower(TERMINAL_123);
		TERMINAL_117.addFollower(TERMINAL_124);
		TERMINAL_117.addFollower(TERMINAL_125);
		TERMINAL_117.addFollower(TERMINAL_48);
		TERMINAL_117.addFollower(TERMINAL_49);
		TERMINAL_117.addFollower(TERMINAL_50);
		TERMINAL_117.addFollower(TERMINAL_126);
		TERMINAL_46.addFollower(TERMINAL_134);
		TERMINAL_134.addFollower(TERMINAL_43);
		TERMINAL_119.addFollower(TERMINAL_123);
		TERMINAL_119.addFollower(TERMINAL_124);
		TERMINAL_119.addFollower(TERMINAL_125);
		TERMINAL_119.addFollower(TERMINAL_48);
		TERMINAL_119.addFollower(TERMINAL_49);
		TERMINAL_119.addFollower(TERMINAL_50);
		TERMINAL_119.addFollower(TERMINAL_126);
		TERMINAL_118.addFollower(TERMINAL_47);
		TERMINAL_3.addFollower(TERMINAL_135);
		TERMINAL_135.addFollower(TERMINAL_1);
		TERMINAL_135.addFollower(TERMINAL_3);
		TERMINAL_135.addFollower(TERMINAL_4);
		TERMINAL_135.addFollower(TERMINAL_5);
		TERMINAL_135.addFollower(TERMINAL_6);
		TERMINAL_135.addFollower(TERMINAL_7);
		TERMINAL_135.addFollower(TERMINAL_8);
		TERMINAL_135.addFollower(TERMINAL_9);
		TERMINAL_135.addFollower(TERMINAL_10);
		TERMINAL_135.addFollower(TERMINAL_11);
		TERMINAL_135.addFollower(TERMINAL_12);
		TERMINAL_135.addFollower(TERMINAL_13);
		TERMINAL_135.addFollower(TERMINAL_14);
		TERMINAL_135.addFollower(TERMINAL_15);
		TERMINAL_135.addFollower(TERMINAL_16);
		TERMINAL_135.addFollower(TERMINAL_17);
		TERMINAL_135.addFollower(TERMINAL_18);
		TERMINAL_135.addFollower(TERMINAL_19);
		TERMINAL_136.addFollower(TERMINAL_1);
		TERMINAL_136.addFollower(TERMINAL_3);
		TERMINAL_136.addFollower(TERMINAL_4);
		TERMINAL_136.addFollower(TERMINAL_5);
		TERMINAL_136.addFollower(TERMINAL_6);
		TERMINAL_136.addFollower(TERMINAL_7);
		TERMINAL_136.addFollower(TERMINAL_8);
		TERMINAL_136.addFollower(TERMINAL_9);
		TERMINAL_136.addFollower(TERMINAL_10);
		TERMINAL_136.addFollower(TERMINAL_11);
		TERMINAL_136.addFollower(TERMINAL_12);
		TERMINAL_136.addFollower(TERMINAL_13);
		TERMINAL_136.addFollower(TERMINAL_14);
		TERMINAL_136.addFollower(TERMINAL_15);
		TERMINAL_136.addFollower(TERMINAL_16);
		TERMINAL_136.addFollower(TERMINAL_17);
		TERMINAL_136.addFollower(TERMINAL_18);
		TERMINAL_136.addFollower(TERMINAL_19);
		TERMINAL_136.addFollower(TERMINAL_20);
		TERMINAL_136.addFollower(TERMINAL_21);
		TERMINAL_136.addFollower(TERMINAL_22);
		TERMINAL_136.addFollower(TERMINAL_23);
		TERMINAL_136.addFollower(TERMINAL_24);
		TERMINAL_136.addFollower(TERMINAL_25);
		TERMINAL_136.addFollower(TERMINAL_26);
		TERMINAL_136.addFollower(TERMINAL_27);
		TERMINAL_136.addFollower(TERMINAL_28);
		TERMINAL_136.addFollower(TERMINAL_29);
		TERMINAL_136.addFollower(TERMINAL_30);
		TERMINAL_4.addFollower(TERMINAL_137);
		TERMINAL_137.addFollower(TERMINAL_1);
		TERMINAL_137.addFollower(TERMINAL_3);
		TERMINAL_137.addFollower(TERMINAL_4);
		TERMINAL_137.addFollower(TERMINAL_5);
		TERMINAL_137.addFollower(TERMINAL_6);
		TERMINAL_137.addFollower(TERMINAL_7);
		TERMINAL_137.addFollower(TERMINAL_8);
		TERMINAL_137.addFollower(TERMINAL_9);
		TERMINAL_137.addFollower(TERMINAL_10);
		TERMINAL_137.addFollower(TERMINAL_11);
		TERMINAL_137.addFollower(TERMINAL_12);
		TERMINAL_137.addFollower(TERMINAL_13);
		TERMINAL_137.addFollower(TERMINAL_14);
		TERMINAL_137.addFollower(TERMINAL_15);
		TERMINAL_137.addFollower(TERMINAL_16);
		TERMINAL_137.addFollower(TERMINAL_17);
		TERMINAL_137.addFollower(TERMINAL_18);
		TERMINAL_137.addFollower(TERMINAL_19);
		TERMINAL_138.addFollower(TERMINAL_1);
		TERMINAL_138.addFollower(TERMINAL_3);
		TERMINAL_138.addFollower(TERMINAL_4);
		TERMINAL_138.addFollower(TERMINAL_5);
		TERMINAL_138.addFollower(TERMINAL_6);
		TERMINAL_138.addFollower(TERMINAL_7);
		TERMINAL_138.addFollower(TERMINAL_8);
		TERMINAL_138.addFollower(TERMINAL_9);
		TERMINAL_138.addFollower(TERMINAL_10);
		TERMINAL_138.addFollower(TERMINAL_11);
		TERMINAL_138.addFollower(TERMINAL_12);
		TERMINAL_138.addFollower(TERMINAL_13);
		TERMINAL_138.addFollower(TERMINAL_14);
		TERMINAL_138.addFollower(TERMINAL_15);
		TERMINAL_138.addFollower(TERMINAL_16);
		TERMINAL_138.addFollower(TERMINAL_17);
		TERMINAL_138.addFollower(TERMINAL_18);
		TERMINAL_138.addFollower(TERMINAL_19);
		TERMINAL_138.addFollower(TERMINAL_20);
		TERMINAL_138.addFollower(TERMINAL_21);
		TERMINAL_138.addFollower(TERMINAL_22);
		TERMINAL_138.addFollower(TERMINAL_23);
		TERMINAL_138.addFollower(TERMINAL_24);
		TERMINAL_138.addFollower(TERMINAL_25);
		TERMINAL_138.addFollower(TERMINAL_26);
		TERMINAL_138.addFollower(TERMINAL_27);
		TERMINAL_138.addFollower(TERMINAL_28);
		TERMINAL_138.addFollower(TERMINAL_29);
		TERMINAL_138.addFollower(TERMINAL_30);
		TERMINAL_5.addFollower(TERMINAL_139);
		TERMINAL_139.addFollower(TERMINAL_1);
		TERMINAL_139.addFollower(TERMINAL_3);
		TERMINAL_139.addFollower(TERMINAL_4);
		TERMINAL_139.addFollower(TERMINAL_5);
		TERMINAL_139.addFollower(TERMINAL_6);
		TERMINAL_139.addFollower(TERMINAL_7);
		TERMINAL_139.addFollower(TERMINAL_8);
		TERMINAL_139.addFollower(TERMINAL_9);
		TERMINAL_139.addFollower(TERMINAL_10);
		TERMINAL_139.addFollower(TERMINAL_11);
		TERMINAL_139.addFollower(TERMINAL_12);
		TERMINAL_139.addFollower(TERMINAL_13);
		TERMINAL_139.addFollower(TERMINAL_14);
		TERMINAL_139.addFollower(TERMINAL_15);
		TERMINAL_139.addFollower(TERMINAL_16);
		TERMINAL_139.addFollower(TERMINAL_17);
		TERMINAL_139.addFollower(TERMINAL_18);
		TERMINAL_139.addFollower(TERMINAL_19);
		TERMINAL_20.addFollower(TERMINAL_1);
		TERMINAL_20.addFollower(TERMINAL_3);
		TERMINAL_20.addFollower(TERMINAL_4);
		TERMINAL_20.addFollower(TERMINAL_5);
		TERMINAL_20.addFollower(TERMINAL_6);
		TERMINAL_20.addFollower(TERMINAL_7);
		TERMINAL_20.addFollower(TERMINAL_8);
		TERMINAL_20.addFollower(TERMINAL_9);
		TERMINAL_20.addFollower(TERMINAL_10);
		TERMINAL_20.addFollower(TERMINAL_11);
		TERMINAL_20.addFollower(TERMINAL_12);
		TERMINAL_20.addFollower(TERMINAL_13);
		TERMINAL_20.addFollower(TERMINAL_14);
		TERMINAL_20.addFollower(TERMINAL_15);
		TERMINAL_20.addFollower(TERMINAL_16);
		TERMINAL_20.addFollower(TERMINAL_17);
		TERMINAL_20.addFollower(TERMINAL_18);
		TERMINAL_20.addFollower(TERMINAL_19);
		TERMINAL_20.addFollower(TERMINAL_20);
		TERMINAL_20.addFollower(TERMINAL_21);
		TERMINAL_20.addFollower(TERMINAL_22);
		TERMINAL_20.addFollower(TERMINAL_23);
		TERMINAL_20.addFollower(TERMINAL_24);
		TERMINAL_20.addFollower(TERMINAL_25);
		TERMINAL_20.addFollower(TERMINAL_26);
		TERMINAL_20.addFollower(TERMINAL_27);
		TERMINAL_20.addFollower(TERMINAL_28);
		TERMINAL_20.addFollower(TERMINAL_29);
		TERMINAL_20.addFollower(TERMINAL_30);
		TERMINAL_6.addFollower(TERMINAL_140);
		TERMINAL_140.addFollower(TERMINAL_1);
		TERMINAL_140.addFollower(TERMINAL_33);
		TERMINAL_52.addFollower(TERMINAL_1);
		TERMINAL_52.addFollower(TERMINAL_3);
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
		TERMINAL_52.addFollower(TERMINAL_24);
		TERMINAL_52.addFollower(TERMINAL_25);
		TERMINAL_52.addFollower(TERMINAL_26);
		TERMINAL_52.addFollower(TERMINAL_27);
		TERMINAL_52.addFollower(TERMINAL_28);
		TERMINAL_52.addFollower(TERMINAL_29);
		TERMINAL_52.addFollower(TERMINAL_30);
		TERMINAL_7.addFollower(TERMINAL_141);
		TERMINAL_141.addFollower(TERMINAL_1);
		TERMINAL_141.addFollower(TERMINAL_35);
		TERMINAL_21.addFollower(TERMINAL_1);
		TERMINAL_21.addFollower(TERMINAL_3);
		TERMINAL_21.addFollower(TERMINAL_4);
		TERMINAL_21.addFollower(TERMINAL_5);
		TERMINAL_21.addFollower(TERMINAL_6);
		TERMINAL_21.addFollower(TERMINAL_7);
		TERMINAL_21.addFollower(TERMINAL_8);
		TERMINAL_21.addFollower(TERMINAL_9);
		TERMINAL_21.addFollower(TERMINAL_10);
		TERMINAL_21.addFollower(TERMINAL_11);
		TERMINAL_21.addFollower(TERMINAL_12);
		TERMINAL_21.addFollower(TERMINAL_13);
		TERMINAL_21.addFollower(TERMINAL_14);
		TERMINAL_21.addFollower(TERMINAL_15);
		TERMINAL_21.addFollower(TERMINAL_16);
		TERMINAL_21.addFollower(TERMINAL_17);
		TERMINAL_21.addFollower(TERMINAL_18);
		TERMINAL_21.addFollower(TERMINAL_19);
		TERMINAL_21.addFollower(TERMINAL_20);
		TERMINAL_21.addFollower(TERMINAL_21);
		TERMINAL_21.addFollower(TERMINAL_22);
		TERMINAL_21.addFollower(TERMINAL_23);
		TERMINAL_21.addFollower(TERMINAL_24);
		TERMINAL_21.addFollower(TERMINAL_25);
		TERMINAL_21.addFollower(TERMINAL_26);
		TERMINAL_21.addFollower(TERMINAL_27);
		TERMINAL_21.addFollower(TERMINAL_28);
		TERMINAL_21.addFollower(TERMINAL_29);
		TERMINAL_21.addFollower(TERMINAL_30);
		TERMINAL_8.addFollower(TERMINAL_142);
		TERMINAL_142.addFollower(TERMINAL_1);
		TERMINAL_142.addFollower(TERMINAL_35);
		TERMINAL_22.addFollower(TERMINAL_1);
		TERMINAL_22.addFollower(TERMINAL_3);
		TERMINAL_22.addFollower(TERMINAL_4);
		TERMINAL_22.addFollower(TERMINAL_5);
		TERMINAL_22.addFollower(TERMINAL_6);
		TERMINAL_22.addFollower(TERMINAL_7);
		TERMINAL_22.addFollower(TERMINAL_8);
		TERMINAL_22.addFollower(TERMINAL_9);
		TERMINAL_22.addFollower(TERMINAL_10);
		TERMINAL_22.addFollower(TERMINAL_11);
		TERMINAL_22.addFollower(TERMINAL_12);
		TERMINAL_22.addFollower(TERMINAL_13);
		TERMINAL_22.addFollower(TERMINAL_14);
		TERMINAL_22.addFollower(TERMINAL_15);
		TERMINAL_22.addFollower(TERMINAL_16);
		TERMINAL_22.addFollower(TERMINAL_17);
		TERMINAL_22.addFollower(TERMINAL_18);
		TERMINAL_22.addFollower(TERMINAL_19);
		TERMINAL_22.addFollower(TERMINAL_20);
		TERMINAL_22.addFollower(TERMINAL_21);
		TERMINAL_22.addFollower(TERMINAL_22);
		TERMINAL_22.addFollower(TERMINAL_23);
		TERMINAL_22.addFollower(TERMINAL_24);
		TERMINAL_22.addFollower(TERMINAL_25);
		TERMINAL_22.addFollower(TERMINAL_26);
		TERMINAL_22.addFollower(TERMINAL_27);
		TERMINAL_22.addFollower(TERMINAL_28);
		TERMINAL_22.addFollower(TERMINAL_29);
		TERMINAL_22.addFollower(TERMINAL_30);
		TERMINAL_9.addFollower(TERMINAL_143);
		TERMINAL_143.addFollower(TERMINAL_1);
		TERMINAL_143.addFollower(TERMINAL_35);
		TERMINAL_129.addFollower(TERMINAL_1);
		TERMINAL_129.addFollower(TERMINAL_3);
		TERMINAL_129.addFollower(TERMINAL_4);
		TERMINAL_129.addFollower(TERMINAL_5);
		TERMINAL_129.addFollower(TERMINAL_6);
		TERMINAL_129.addFollower(TERMINAL_7);
		TERMINAL_129.addFollower(TERMINAL_8);
		TERMINAL_129.addFollower(TERMINAL_9);
		TERMINAL_129.addFollower(TERMINAL_10);
		TERMINAL_129.addFollower(TERMINAL_11);
		TERMINAL_129.addFollower(TERMINAL_12);
		TERMINAL_129.addFollower(TERMINAL_13);
		TERMINAL_129.addFollower(TERMINAL_14);
		TERMINAL_129.addFollower(TERMINAL_15);
		TERMINAL_129.addFollower(TERMINAL_16);
		TERMINAL_129.addFollower(TERMINAL_17);
		TERMINAL_129.addFollower(TERMINAL_18);
		TERMINAL_129.addFollower(TERMINAL_19);
		TERMINAL_129.addFollower(TERMINAL_20);
		TERMINAL_129.addFollower(TERMINAL_21);
		TERMINAL_129.addFollower(TERMINAL_22);
		TERMINAL_129.addFollower(TERMINAL_23);
		TERMINAL_129.addFollower(TERMINAL_24);
		TERMINAL_129.addFollower(TERMINAL_25);
		TERMINAL_129.addFollower(TERMINAL_26);
		TERMINAL_129.addFollower(TERMINAL_27);
		TERMINAL_129.addFollower(TERMINAL_28);
		TERMINAL_129.addFollower(TERMINAL_29);
		TERMINAL_129.addFollower(TERMINAL_30);
		TERMINAL_10.addFollower(TERMINAL_144);
		TERMINAL_144.addFollower(TERMINAL_1);
		TERMINAL_144.addFollower(TERMINAL_35);
		TERMINAL_34.addFollower(TERMINAL_1);
		TERMINAL_34.addFollower(TERMINAL_3);
		TERMINAL_34.addFollower(TERMINAL_4);
		TERMINAL_34.addFollower(TERMINAL_5);
		TERMINAL_34.addFollower(TERMINAL_6);
		TERMINAL_34.addFollower(TERMINAL_7);
		TERMINAL_34.addFollower(TERMINAL_8);
		TERMINAL_34.addFollower(TERMINAL_9);
		TERMINAL_34.addFollower(TERMINAL_10);
		TERMINAL_34.addFollower(TERMINAL_11);
		TERMINAL_34.addFollower(TERMINAL_12);
		TERMINAL_34.addFollower(TERMINAL_13);
		TERMINAL_34.addFollower(TERMINAL_14);
		TERMINAL_34.addFollower(TERMINAL_15);
		TERMINAL_34.addFollower(TERMINAL_16);
		TERMINAL_34.addFollower(TERMINAL_17);
		TERMINAL_34.addFollower(TERMINAL_18);
		TERMINAL_34.addFollower(TERMINAL_19);
		TERMINAL_34.addFollower(TERMINAL_20);
		TERMINAL_34.addFollower(TERMINAL_21);
		TERMINAL_34.addFollower(TERMINAL_22);
		TERMINAL_34.addFollower(TERMINAL_23);
		TERMINAL_34.addFollower(TERMINAL_24);
		TERMINAL_34.addFollower(TERMINAL_25);
		TERMINAL_34.addFollower(TERMINAL_26);
		TERMINAL_34.addFollower(TERMINAL_27);
		TERMINAL_34.addFollower(TERMINAL_28);
		TERMINAL_34.addFollower(TERMINAL_29);
		TERMINAL_34.addFollower(TERMINAL_30);
		TERMINAL_11.addFollower(TERMINAL_145);
		TERMINAL_145.addFollower(TERMINAL_146);
		TERMINAL_146.addFollower(TERMINAL_1);
		TERMINAL_146.addFollower(TERMINAL_35);
		TERMINAL_23.addFollower(TERMINAL_1);
		TERMINAL_23.addFollower(TERMINAL_3);
		TERMINAL_23.addFollower(TERMINAL_4);
		TERMINAL_23.addFollower(TERMINAL_5);
		TERMINAL_23.addFollower(TERMINAL_6);
		TERMINAL_23.addFollower(TERMINAL_7);
		TERMINAL_23.addFollower(TERMINAL_8);
		TERMINAL_23.addFollower(TERMINAL_9);
		TERMINAL_23.addFollower(TERMINAL_10);
		TERMINAL_23.addFollower(TERMINAL_11);
		TERMINAL_23.addFollower(TERMINAL_12);
		TERMINAL_23.addFollower(TERMINAL_13);
		TERMINAL_23.addFollower(TERMINAL_14);
		TERMINAL_23.addFollower(TERMINAL_15);
		TERMINAL_23.addFollower(TERMINAL_16);
		TERMINAL_23.addFollower(TERMINAL_17);
		TERMINAL_23.addFollower(TERMINAL_18);
		TERMINAL_23.addFollower(TERMINAL_19);
		TERMINAL_23.addFollower(TERMINAL_20);
		TERMINAL_23.addFollower(TERMINAL_21);
		TERMINAL_23.addFollower(TERMINAL_22);
		TERMINAL_23.addFollower(TERMINAL_23);
		TERMINAL_23.addFollower(TERMINAL_24);
		TERMINAL_23.addFollower(TERMINAL_25);
		TERMINAL_23.addFollower(TERMINAL_26);
		TERMINAL_23.addFollower(TERMINAL_27);
		TERMINAL_23.addFollower(TERMINAL_28);
		TERMINAL_23.addFollower(TERMINAL_29);
		TERMINAL_23.addFollower(TERMINAL_30);
		TERMINAL_12.addFollower(TERMINAL_147);
		TERMINAL_147.addFollower(TERMINAL_148);
		TERMINAL_148.addFollower(TERMINAL_1);
		TERMINAL_148.addFollower(TERMINAL_35);
		TERMINAL_24.addFollower(TERMINAL_1);
		TERMINAL_24.addFollower(TERMINAL_3);
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
		TERMINAL_24.addFollower(TERMINAL_24);
		TERMINAL_24.addFollower(TERMINAL_25);
		TERMINAL_24.addFollower(TERMINAL_26);
		TERMINAL_24.addFollower(TERMINAL_27);
		TERMINAL_24.addFollower(TERMINAL_28);
		TERMINAL_24.addFollower(TERMINAL_29);
		TERMINAL_24.addFollower(TERMINAL_30);
		TERMINAL_13.addFollower(TERMINAL_149);
		TERMINAL_149.addFollower(TERMINAL_150);
		TERMINAL_150.addFollower(TERMINAL_1);
		TERMINAL_150.addFollower(TERMINAL_35);
		TERMINAL_25.addFollower(TERMINAL_1);
		TERMINAL_25.addFollower(TERMINAL_3);
		TERMINAL_25.addFollower(TERMINAL_4);
		TERMINAL_25.addFollower(TERMINAL_5);
		TERMINAL_25.addFollower(TERMINAL_6);
		TERMINAL_25.addFollower(TERMINAL_7);
		TERMINAL_25.addFollower(TERMINAL_8);
		TERMINAL_25.addFollower(TERMINAL_9);
		TERMINAL_25.addFollower(TERMINAL_10);
		TERMINAL_25.addFollower(TERMINAL_11);
		TERMINAL_25.addFollower(TERMINAL_12);
		TERMINAL_25.addFollower(TERMINAL_13);
		TERMINAL_25.addFollower(TERMINAL_14);
		TERMINAL_25.addFollower(TERMINAL_15);
		TERMINAL_25.addFollower(TERMINAL_16);
		TERMINAL_25.addFollower(TERMINAL_17);
		TERMINAL_25.addFollower(TERMINAL_18);
		TERMINAL_25.addFollower(TERMINAL_19);
		TERMINAL_25.addFollower(TERMINAL_20);
		TERMINAL_25.addFollower(TERMINAL_21);
		TERMINAL_25.addFollower(TERMINAL_22);
		TERMINAL_25.addFollower(TERMINAL_23);
		TERMINAL_25.addFollower(TERMINAL_24);
		TERMINAL_25.addFollower(TERMINAL_25);
		TERMINAL_25.addFollower(TERMINAL_26);
		TERMINAL_25.addFollower(TERMINAL_27);
		TERMINAL_25.addFollower(TERMINAL_28);
		TERMINAL_25.addFollower(TERMINAL_29);
		TERMINAL_25.addFollower(TERMINAL_30);
		TERMINAL_14.addFollower(TERMINAL_151);
		TERMINAL_151.addFollower(TERMINAL_1);
		TERMINAL_124.addFollower(TERMINAL_1);
		TERMINAL_124.addFollower(TERMINAL_3);
		TERMINAL_124.addFollower(TERMINAL_4);
		TERMINAL_124.addFollower(TERMINAL_5);
		TERMINAL_124.addFollower(TERMINAL_6);
		TERMINAL_124.addFollower(TERMINAL_7);
		TERMINAL_124.addFollower(TERMINAL_8);
		TERMINAL_124.addFollower(TERMINAL_9);
		TERMINAL_124.addFollower(TERMINAL_10);
		TERMINAL_124.addFollower(TERMINAL_11);
		TERMINAL_124.addFollower(TERMINAL_12);
		TERMINAL_124.addFollower(TERMINAL_13);
		TERMINAL_124.addFollower(TERMINAL_14);
		TERMINAL_124.addFollower(TERMINAL_15);
		TERMINAL_124.addFollower(TERMINAL_16);
		TERMINAL_124.addFollower(TERMINAL_17);
		TERMINAL_124.addFollower(TERMINAL_18);
		TERMINAL_124.addFollower(TERMINAL_19);
		TERMINAL_124.addFollower(TERMINAL_20);
		TERMINAL_124.addFollower(TERMINAL_21);
		TERMINAL_124.addFollower(TERMINAL_22);
		TERMINAL_124.addFollower(TERMINAL_23);
		TERMINAL_124.addFollower(TERMINAL_24);
		TERMINAL_124.addFollower(TERMINAL_25);
		TERMINAL_124.addFollower(TERMINAL_26);
		TERMINAL_124.addFollower(TERMINAL_27);
		TERMINAL_124.addFollower(TERMINAL_28);
		TERMINAL_124.addFollower(TERMINAL_29);
		TERMINAL_124.addFollower(TERMINAL_30);
		TERMINAL_15.addFollower(TERMINAL_152);
		TERMINAL_152.addFollower(TERMINAL_1);
		TERMINAL_125.addFollower(TERMINAL_1);
		TERMINAL_125.addFollower(TERMINAL_3);
		TERMINAL_125.addFollower(TERMINAL_4);
		TERMINAL_125.addFollower(TERMINAL_5);
		TERMINAL_125.addFollower(TERMINAL_6);
		TERMINAL_125.addFollower(TERMINAL_7);
		TERMINAL_125.addFollower(TERMINAL_8);
		TERMINAL_125.addFollower(TERMINAL_9);
		TERMINAL_125.addFollower(TERMINAL_10);
		TERMINAL_125.addFollower(TERMINAL_11);
		TERMINAL_125.addFollower(TERMINAL_12);
		TERMINAL_125.addFollower(TERMINAL_13);
		TERMINAL_125.addFollower(TERMINAL_14);
		TERMINAL_125.addFollower(TERMINAL_15);
		TERMINAL_125.addFollower(TERMINAL_16);
		TERMINAL_125.addFollower(TERMINAL_17);
		TERMINAL_125.addFollower(TERMINAL_18);
		TERMINAL_125.addFollower(TERMINAL_19);
		TERMINAL_125.addFollower(TERMINAL_20);
		TERMINAL_125.addFollower(TERMINAL_21);
		TERMINAL_125.addFollower(TERMINAL_22);
		TERMINAL_125.addFollower(TERMINAL_23);
		TERMINAL_125.addFollower(TERMINAL_24);
		TERMINAL_125.addFollower(TERMINAL_25);
		TERMINAL_125.addFollower(TERMINAL_26);
		TERMINAL_125.addFollower(TERMINAL_27);
		TERMINAL_125.addFollower(TERMINAL_28);
		TERMINAL_125.addFollower(TERMINAL_29);
		TERMINAL_125.addFollower(TERMINAL_30);
		TERMINAL_16.addFollower(TERMINAL_153);
		TERMINAL_153.addFollower(TERMINAL_1);
		TERMINAL_120.addFollower(TERMINAL_1);
		TERMINAL_120.addFollower(TERMINAL_3);
		TERMINAL_120.addFollower(TERMINAL_4);
		TERMINAL_120.addFollower(TERMINAL_5);
		TERMINAL_120.addFollower(TERMINAL_6);
		TERMINAL_120.addFollower(TERMINAL_7);
		TERMINAL_120.addFollower(TERMINAL_8);
		TERMINAL_120.addFollower(TERMINAL_9);
		TERMINAL_120.addFollower(TERMINAL_10);
		TERMINAL_120.addFollower(TERMINAL_11);
		TERMINAL_120.addFollower(TERMINAL_12);
		TERMINAL_120.addFollower(TERMINAL_13);
		TERMINAL_120.addFollower(TERMINAL_14);
		TERMINAL_120.addFollower(TERMINAL_15);
		TERMINAL_120.addFollower(TERMINAL_16);
		TERMINAL_120.addFollower(TERMINAL_17);
		TERMINAL_120.addFollower(TERMINAL_18);
		TERMINAL_120.addFollower(TERMINAL_19);
		TERMINAL_120.addFollower(TERMINAL_20);
		TERMINAL_120.addFollower(TERMINAL_21);
		TERMINAL_120.addFollower(TERMINAL_22);
		TERMINAL_120.addFollower(TERMINAL_23);
		TERMINAL_120.addFollower(TERMINAL_24);
		TERMINAL_120.addFollower(TERMINAL_25);
		TERMINAL_120.addFollower(TERMINAL_26);
		TERMINAL_120.addFollower(TERMINAL_27);
		TERMINAL_120.addFollower(TERMINAL_28);
		TERMINAL_120.addFollower(TERMINAL_29);
		TERMINAL_120.addFollower(TERMINAL_30);
		TERMINAL_17.addFollower(TERMINAL_154);
		TERMINAL_154.addFollower(TERMINAL_155);
		TERMINAL_155.addFollower(TERMINAL_1);
		TERMINAL_48.addFollower(TERMINAL_1);
		TERMINAL_48.addFollower(TERMINAL_3);
		TERMINAL_48.addFollower(TERMINAL_4);
		TERMINAL_48.addFollower(TERMINAL_5);
		TERMINAL_48.addFollower(TERMINAL_6);
		TERMINAL_48.addFollower(TERMINAL_7);
		TERMINAL_48.addFollower(TERMINAL_8);
		TERMINAL_48.addFollower(TERMINAL_9);
		TERMINAL_48.addFollower(TERMINAL_10);
		TERMINAL_48.addFollower(TERMINAL_11);
		TERMINAL_48.addFollower(TERMINAL_12);
		TERMINAL_48.addFollower(TERMINAL_13);
		TERMINAL_48.addFollower(TERMINAL_14);
		TERMINAL_48.addFollower(TERMINAL_15);
		TERMINAL_48.addFollower(TERMINAL_16);
		TERMINAL_48.addFollower(TERMINAL_17);
		TERMINAL_48.addFollower(TERMINAL_18);
		TERMINAL_48.addFollower(TERMINAL_19);
		TERMINAL_48.addFollower(TERMINAL_20);
		TERMINAL_48.addFollower(TERMINAL_21);
		TERMINAL_48.addFollower(TERMINAL_22);
		TERMINAL_48.addFollower(TERMINAL_23);
		TERMINAL_48.addFollower(TERMINAL_24);
		TERMINAL_48.addFollower(TERMINAL_25);
		TERMINAL_48.addFollower(TERMINAL_26);
		TERMINAL_48.addFollower(TERMINAL_27);
		TERMINAL_48.addFollower(TERMINAL_28);
		TERMINAL_48.addFollower(TERMINAL_29);
		TERMINAL_48.addFollower(TERMINAL_30);
		TERMINAL_18.addFollower(TERMINAL_156);
		TERMINAL_156.addFollower(TERMINAL_157);
		TERMINAL_157.addFollower(TERMINAL_1);
	}
	public static void wire1() {
		TERMINAL_49.addFollower(TERMINAL_1);
		TERMINAL_49.addFollower(TERMINAL_3);
		TERMINAL_49.addFollower(TERMINAL_4);
		TERMINAL_49.addFollower(TERMINAL_5);
		TERMINAL_49.addFollower(TERMINAL_6);
		TERMINAL_49.addFollower(TERMINAL_7);
		TERMINAL_49.addFollower(TERMINAL_8);
		TERMINAL_49.addFollower(TERMINAL_9);
		TERMINAL_49.addFollower(TERMINAL_10);
		TERMINAL_49.addFollower(TERMINAL_11);
		TERMINAL_49.addFollower(TERMINAL_12);
		TERMINAL_49.addFollower(TERMINAL_13);
		TERMINAL_49.addFollower(TERMINAL_14);
		TERMINAL_49.addFollower(TERMINAL_15);
		TERMINAL_49.addFollower(TERMINAL_16);
		TERMINAL_49.addFollower(TERMINAL_17);
		TERMINAL_49.addFollower(TERMINAL_18);
		TERMINAL_49.addFollower(TERMINAL_19);
		TERMINAL_49.addFollower(TERMINAL_20);
		TERMINAL_49.addFollower(TERMINAL_21);
		TERMINAL_49.addFollower(TERMINAL_22);
		TERMINAL_49.addFollower(TERMINAL_23);
		TERMINAL_49.addFollower(TERMINAL_24);
		TERMINAL_49.addFollower(TERMINAL_25);
		TERMINAL_49.addFollower(TERMINAL_26);
		TERMINAL_49.addFollower(TERMINAL_27);
		TERMINAL_49.addFollower(TERMINAL_28);
		TERMINAL_49.addFollower(TERMINAL_29);
		TERMINAL_49.addFollower(TERMINAL_30);
		TERMINAL_19.addFollower(TERMINAL_158);
		TERMINAL_158.addFollower(TERMINAL_159);
		TERMINAL_159.addFollower(TERMINAL_1);
		TERMINAL_50.addFollower(TERMINAL_1);
		TERMINAL_50.addFollower(TERMINAL_3);
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
		TERMINAL_50.addFollower(TERMINAL_24);
		TERMINAL_50.addFollower(TERMINAL_25);
		TERMINAL_50.addFollower(TERMINAL_26);
		TERMINAL_50.addFollower(TERMINAL_27);
		TERMINAL_50.addFollower(TERMINAL_28);
		TERMINAL_50.addFollower(TERMINAL_29);
		TERMINAL_50.addFollower(TERMINAL_30);
		TERMINAL_74.addFollower(TERMINAL_160);
		TERMINAL_160.addFollower(TERMINAL_70);
		TERMINAL_160.addFollower(TERMINAL_71);
		TERMINAL_160.addFollower(TERMINAL_72);
		TERMINAL_160.addFollower(TERMINAL_1);
		TERMINAL_160.addFollower(TERMINAL_3);
		TERMINAL_160.addFollower(TERMINAL_4);
		TERMINAL_160.addFollower(TERMINAL_5);
		TERMINAL_160.addFollower(TERMINAL_6);
		TERMINAL_160.addFollower(TERMINAL_7);
		TERMINAL_160.addFollower(TERMINAL_8);
		TERMINAL_160.addFollower(TERMINAL_9);
		TERMINAL_160.addFollower(TERMINAL_10);
		TERMINAL_160.addFollower(TERMINAL_11);
		TERMINAL_160.addFollower(TERMINAL_12);
		TERMINAL_160.addFollower(TERMINAL_13);
		TERMINAL_160.addFollower(TERMINAL_14);
		TERMINAL_160.addFollower(TERMINAL_15);
		TERMINAL_160.addFollower(TERMINAL_16);
		TERMINAL_160.addFollower(TERMINAL_17);
		TERMINAL_160.addFollower(TERMINAL_18);
		TERMINAL_160.addFollower(TERMINAL_19);
		TERMINAL_161.addFollower(TERMINAL_73);
		TERMINAL_161.addFollower(TERMINAL_74);
		TERMINAL_161.addFollower(TERMINAL_75);
		TERMINAL_161.addFollower(TERMINAL_76);
		TERMINAL_161.addFollower(TERMINAL_77);
		TERMINAL_161.addFollower(TERMINAL_78);
		TERMINAL_161.addFollower(TERMINAL_79);
		TERMINAL_161.addFollower(TERMINAL_80);
		TERMINAL_161.addFollower(TERMINAL_81);
		TERMINAL_161.addFollower(TERMINAL_82);
		TERMINAL_161.addFollower(TERMINAL_83);
		TERMINAL_161.addFollower(TERMINAL_84);
		TERMINAL_161.addFollower(TERMINAL_85);
		TERMINAL_161.addFollower(TERMINAL_86);
		TERMINAL_161.addFollower(TERMINAL_87);
		TERMINAL_161.addFollower(TERMINAL_88);
		TERMINAL_161.addFollower(TERMINAL_89);
		TERMINAL_161.addFollower(TERMINAL_90);
		TERMINAL_161.addFollower(TERMINAL_91);
		TERMINAL_161.addFollower(TERMINAL_92);
		TERMINAL_161.addFollower(TERMINAL_93);
		TERMINAL_161.addFollower(TERMINAL_94);
		TERMINAL_161.addFollower(TERMINAL_95);
		TERMINAL_161.addFollower(TERMINAL_96);
		TERMINAL_161.addFollower(TERMINAL_97);
		TERMINAL_161.addFollower(TERMINAL_98);
		TERMINAL_161.addFollower(TERMINAL_99);
		TERMINAL_161.addFollower(TERMINAL_100);
		TERMINAL_161.addFollower(TERMINAL_101);
		TERMINAL_161.addFollower(TERMINAL_102);
		TERMINAL_161.addFollower(TERMINAL_103);
		TERMINAL_161.addFollower(TERMINAL_104);
		TERMINAL_161.addFollower(TERMINAL_105);
		TERMINAL_161.addFollower(TERMINAL_106);
		TERMINAL_75.addFollower(TERMINAL_162);
		TERMINAL_162.addFollower(TERMINAL_70);
		TERMINAL_162.addFollower(TERMINAL_71);
		TERMINAL_162.addFollower(TERMINAL_72);
		TERMINAL_162.addFollower(TERMINAL_1);
		TERMINAL_162.addFollower(TERMINAL_3);
		TERMINAL_162.addFollower(TERMINAL_4);
		TERMINAL_162.addFollower(TERMINAL_5);
		TERMINAL_162.addFollower(TERMINAL_6);
		TERMINAL_162.addFollower(TERMINAL_7);
		TERMINAL_162.addFollower(TERMINAL_8);
		TERMINAL_162.addFollower(TERMINAL_9);
		TERMINAL_162.addFollower(TERMINAL_10);
		TERMINAL_162.addFollower(TERMINAL_11);
		TERMINAL_162.addFollower(TERMINAL_12);
		TERMINAL_162.addFollower(TERMINAL_13);
		TERMINAL_162.addFollower(TERMINAL_14);
		TERMINAL_162.addFollower(TERMINAL_15);
		TERMINAL_162.addFollower(TERMINAL_16);
		TERMINAL_162.addFollower(TERMINAL_17);
		TERMINAL_162.addFollower(TERMINAL_18);
		TERMINAL_162.addFollower(TERMINAL_19);
		TERMINAL_163.addFollower(TERMINAL_73);
		TERMINAL_163.addFollower(TERMINAL_74);
		TERMINAL_163.addFollower(TERMINAL_75);
		TERMINAL_163.addFollower(TERMINAL_76);
		TERMINAL_163.addFollower(TERMINAL_77);
		TERMINAL_163.addFollower(TERMINAL_78);
		TERMINAL_163.addFollower(TERMINAL_79);
		TERMINAL_163.addFollower(TERMINAL_80);
		TERMINAL_163.addFollower(TERMINAL_81);
		TERMINAL_163.addFollower(TERMINAL_82);
		TERMINAL_163.addFollower(TERMINAL_83);
		TERMINAL_163.addFollower(TERMINAL_84);
		TERMINAL_163.addFollower(TERMINAL_85);
		TERMINAL_163.addFollower(TERMINAL_86);
		TERMINAL_163.addFollower(TERMINAL_87);
		TERMINAL_163.addFollower(TERMINAL_88);
		TERMINAL_163.addFollower(TERMINAL_89);
		TERMINAL_163.addFollower(TERMINAL_90);
		TERMINAL_163.addFollower(TERMINAL_91);
		TERMINAL_163.addFollower(TERMINAL_92);
		TERMINAL_163.addFollower(TERMINAL_93);
		TERMINAL_163.addFollower(TERMINAL_94);
		TERMINAL_163.addFollower(TERMINAL_95);
		TERMINAL_163.addFollower(TERMINAL_96);
		TERMINAL_163.addFollower(TERMINAL_97);
		TERMINAL_163.addFollower(TERMINAL_98);
		TERMINAL_163.addFollower(TERMINAL_99);
		TERMINAL_163.addFollower(TERMINAL_100);
		TERMINAL_163.addFollower(TERMINAL_101);
		TERMINAL_163.addFollower(TERMINAL_102);
		TERMINAL_163.addFollower(TERMINAL_103);
		TERMINAL_163.addFollower(TERMINAL_104);
		TERMINAL_163.addFollower(TERMINAL_105);
		TERMINAL_163.addFollower(TERMINAL_106);
		TERMINAL_76.addFollower(TERMINAL_164);
		TERMINAL_164.addFollower(TERMINAL_70);
		TERMINAL_164.addFollower(TERMINAL_71);
		TERMINAL_164.addFollower(TERMINAL_72);
		TERMINAL_164.addFollower(TERMINAL_1);
		TERMINAL_164.addFollower(TERMINAL_3);
		TERMINAL_164.addFollower(TERMINAL_4);
		TERMINAL_164.addFollower(TERMINAL_5);
		TERMINAL_164.addFollower(TERMINAL_6);
		TERMINAL_164.addFollower(TERMINAL_7);
		TERMINAL_164.addFollower(TERMINAL_8);
		TERMINAL_164.addFollower(TERMINAL_9);
		TERMINAL_164.addFollower(TERMINAL_10);
		TERMINAL_164.addFollower(TERMINAL_11);
		TERMINAL_164.addFollower(TERMINAL_12);
		TERMINAL_164.addFollower(TERMINAL_13);
		TERMINAL_164.addFollower(TERMINAL_14);
		TERMINAL_164.addFollower(TERMINAL_15);
		TERMINAL_164.addFollower(TERMINAL_16);
		TERMINAL_164.addFollower(TERMINAL_17);
		TERMINAL_164.addFollower(TERMINAL_18);
		TERMINAL_164.addFollower(TERMINAL_19);
		TERMINAL_165.addFollower(TERMINAL_73);
		TERMINAL_165.addFollower(TERMINAL_74);
		TERMINAL_165.addFollower(TERMINAL_75);
		TERMINAL_165.addFollower(TERMINAL_76);
		TERMINAL_165.addFollower(TERMINAL_77);
		TERMINAL_165.addFollower(TERMINAL_78);
		TERMINAL_165.addFollower(TERMINAL_79);
		TERMINAL_165.addFollower(TERMINAL_80);
		TERMINAL_165.addFollower(TERMINAL_81);
		TERMINAL_165.addFollower(TERMINAL_82);
		TERMINAL_165.addFollower(TERMINAL_83);
		TERMINAL_165.addFollower(TERMINAL_84);
		TERMINAL_165.addFollower(TERMINAL_85);
		TERMINAL_165.addFollower(TERMINAL_86);
		TERMINAL_165.addFollower(TERMINAL_87);
		TERMINAL_165.addFollower(TERMINAL_88);
		TERMINAL_165.addFollower(TERMINAL_89);
		TERMINAL_165.addFollower(TERMINAL_90);
		TERMINAL_165.addFollower(TERMINAL_91);
		TERMINAL_165.addFollower(TERMINAL_92);
		TERMINAL_165.addFollower(TERMINAL_93);
		TERMINAL_165.addFollower(TERMINAL_94);
		TERMINAL_165.addFollower(TERMINAL_95);
		TERMINAL_165.addFollower(TERMINAL_96);
		TERMINAL_165.addFollower(TERMINAL_97);
		TERMINAL_165.addFollower(TERMINAL_98);
		TERMINAL_165.addFollower(TERMINAL_99);
		TERMINAL_165.addFollower(TERMINAL_100);
		TERMINAL_165.addFollower(TERMINAL_101);
		TERMINAL_165.addFollower(TERMINAL_102);
		TERMINAL_165.addFollower(TERMINAL_103);
		TERMINAL_165.addFollower(TERMINAL_104);
		TERMINAL_165.addFollower(TERMINAL_105);
		TERMINAL_165.addFollower(TERMINAL_106);
		TERMINAL_77.addFollower(TERMINAL_166);
		TERMINAL_166.addFollower(TERMINAL_70);
		TERMINAL_166.addFollower(TERMINAL_71);
		TERMINAL_166.addFollower(TERMINAL_72);
		TERMINAL_166.addFollower(TERMINAL_1);
		TERMINAL_167.addFollower(TERMINAL_73);
		TERMINAL_167.addFollower(TERMINAL_74);
		TERMINAL_167.addFollower(TERMINAL_75);
		TERMINAL_167.addFollower(TERMINAL_76);
		TERMINAL_167.addFollower(TERMINAL_77);
		TERMINAL_167.addFollower(TERMINAL_78);
		TERMINAL_167.addFollower(TERMINAL_79);
		TERMINAL_167.addFollower(TERMINAL_80);
		TERMINAL_167.addFollower(TERMINAL_81);
		TERMINAL_167.addFollower(TERMINAL_82);
		TERMINAL_167.addFollower(TERMINAL_83);
		TERMINAL_167.addFollower(TERMINAL_84);
		TERMINAL_167.addFollower(TERMINAL_85);
		TERMINAL_167.addFollower(TERMINAL_86);
		TERMINAL_167.addFollower(TERMINAL_87);
		TERMINAL_167.addFollower(TERMINAL_88);
		TERMINAL_167.addFollower(TERMINAL_89);
		TERMINAL_167.addFollower(TERMINAL_90);
		TERMINAL_167.addFollower(TERMINAL_91);
		TERMINAL_167.addFollower(TERMINAL_92);
		TERMINAL_167.addFollower(TERMINAL_93);
		TERMINAL_167.addFollower(TERMINAL_94);
		TERMINAL_167.addFollower(TERMINAL_95);
		TERMINAL_167.addFollower(TERMINAL_96);
		TERMINAL_167.addFollower(TERMINAL_97);
		TERMINAL_167.addFollower(TERMINAL_98);
		TERMINAL_167.addFollower(TERMINAL_99);
		TERMINAL_167.addFollower(TERMINAL_100);
		TERMINAL_167.addFollower(TERMINAL_101);
		TERMINAL_167.addFollower(TERMINAL_102);
		TERMINAL_167.addFollower(TERMINAL_103);
		TERMINAL_167.addFollower(TERMINAL_104);
		TERMINAL_167.addFollower(TERMINAL_105);
		TERMINAL_167.addFollower(TERMINAL_106);
		TERMINAL_78.addFollower(TERMINAL_168);
		TERMINAL_168.addFollower(TERMINAL_70);
		TERMINAL_168.addFollower(TERMINAL_71);
		TERMINAL_168.addFollower(TERMINAL_72);
		TERMINAL_168.addFollower(TERMINAL_1);
		TERMINAL_168.addFollower(TERMINAL_35);
		TERMINAL_169.addFollower(TERMINAL_73);
		TERMINAL_169.addFollower(TERMINAL_74);
		TERMINAL_169.addFollower(TERMINAL_75);
		TERMINAL_169.addFollower(TERMINAL_76);
		TERMINAL_169.addFollower(TERMINAL_77);
		TERMINAL_169.addFollower(TERMINAL_78);
		TERMINAL_169.addFollower(TERMINAL_79);
		TERMINAL_169.addFollower(TERMINAL_80);
		TERMINAL_169.addFollower(TERMINAL_81);
		TERMINAL_169.addFollower(TERMINAL_82);
		TERMINAL_169.addFollower(TERMINAL_83);
		TERMINAL_169.addFollower(TERMINAL_84);
		TERMINAL_169.addFollower(TERMINAL_85);
		TERMINAL_169.addFollower(TERMINAL_86);
		TERMINAL_169.addFollower(TERMINAL_87);
		TERMINAL_169.addFollower(TERMINAL_88);
		TERMINAL_169.addFollower(TERMINAL_89);
		TERMINAL_169.addFollower(TERMINAL_90);
		TERMINAL_169.addFollower(TERMINAL_91);
		TERMINAL_169.addFollower(TERMINAL_92);
		TERMINAL_169.addFollower(TERMINAL_93);
		TERMINAL_169.addFollower(TERMINAL_94);
		TERMINAL_169.addFollower(TERMINAL_95);
		TERMINAL_169.addFollower(TERMINAL_96);
		TERMINAL_169.addFollower(TERMINAL_97);
		TERMINAL_169.addFollower(TERMINAL_98);
		TERMINAL_169.addFollower(TERMINAL_99);
		TERMINAL_169.addFollower(TERMINAL_100);
		TERMINAL_169.addFollower(TERMINAL_101);
		TERMINAL_169.addFollower(TERMINAL_102);
		TERMINAL_169.addFollower(TERMINAL_103);
		TERMINAL_169.addFollower(TERMINAL_104);
		TERMINAL_169.addFollower(TERMINAL_105);
		TERMINAL_169.addFollower(TERMINAL_106);
		TERMINAL_79.addFollower(TERMINAL_170);
		TERMINAL_170.addFollower(TERMINAL_70);
		TERMINAL_170.addFollower(TERMINAL_71);
		TERMINAL_170.addFollower(TERMINAL_72);
		TERMINAL_170.addFollower(TERMINAL_1);
		TERMINAL_170.addFollower(TERMINAL_35);
		TERMINAL_171.addFollower(TERMINAL_73);
		TERMINAL_171.addFollower(TERMINAL_74);
		TERMINAL_171.addFollower(TERMINAL_75);
		TERMINAL_171.addFollower(TERMINAL_76);
		TERMINAL_171.addFollower(TERMINAL_77);
		TERMINAL_171.addFollower(TERMINAL_78);
		TERMINAL_171.addFollower(TERMINAL_79);
		TERMINAL_171.addFollower(TERMINAL_80);
		TERMINAL_171.addFollower(TERMINAL_81);
		TERMINAL_171.addFollower(TERMINAL_82);
		TERMINAL_171.addFollower(TERMINAL_83);
		TERMINAL_171.addFollower(TERMINAL_84);
		TERMINAL_171.addFollower(TERMINAL_85);
		TERMINAL_171.addFollower(TERMINAL_86);
		TERMINAL_171.addFollower(TERMINAL_87);
		TERMINAL_171.addFollower(TERMINAL_88);
		TERMINAL_171.addFollower(TERMINAL_89);
		TERMINAL_171.addFollower(TERMINAL_90);
		TERMINAL_171.addFollower(TERMINAL_91);
		TERMINAL_171.addFollower(TERMINAL_92);
		TERMINAL_171.addFollower(TERMINAL_93);
		TERMINAL_171.addFollower(TERMINAL_94);
		TERMINAL_171.addFollower(TERMINAL_95);
		TERMINAL_171.addFollower(TERMINAL_96);
		TERMINAL_171.addFollower(TERMINAL_97);
		TERMINAL_171.addFollower(TERMINAL_98);
		TERMINAL_171.addFollower(TERMINAL_99);
		TERMINAL_171.addFollower(TERMINAL_100);
		TERMINAL_171.addFollower(TERMINAL_101);
		TERMINAL_171.addFollower(TERMINAL_102);
		TERMINAL_171.addFollower(TERMINAL_103);
		TERMINAL_171.addFollower(TERMINAL_104);
		TERMINAL_171.addFollower(TERMINAL_105);
		TERMINAL_171.addFollower(TERMINAL_106);
		TERMINAL_80.addFollower(TERMINAL_172);
		TERMINAL_172.addFollower(TERMINAL_70);
		TERMINAL_172.addFollower(TERMINAL_71);
		TERMINAL_172.addFollower(TERMINAL_72);
		TERMINAL_172.addFollower(TERMINAL_1);
		TERMINAL_172.addFollower(TERMINAL_35);
		TERMINAL_173.addFollower(TERMINAL_73);
		TERMINAL_173.addFollower(TERMINAL_74);
		TERMINAL_173.addFollower(TERMINAL_75);
		TERMINAL_173.addFollower(TERMINAL_76);
		TERMINAL_173.addFollower(TERMINAL_77);
		TERMINAL_173.addFollower(TERMINAL_78);
		TERMINAL_173.addFollower(TERMINAL_79);
		TERMINAL_173.addFollower(TERMINAL_80);
		TERMINAL_173.addFollower(TERMINAL_81);
		TERMINAL_173.addFollower(TERMINAL_82);
		TERMINAL_173.addFollower(TERMINAL_83);
		TERMINAL_173.addFollower(TERMINAL_84);
		TERMINAL_173.addFollower(TERMINAL_85);
		TERMINAL_173.addFollower(TERMINAL_86);
		TERMINAL_173.addFollower(TERMINAL_87);
		TERMINAL_173.addFollower(TERMINAL_88);
		TERMINAL_173.addFollower(TERMINAL_89);
		TERMINAL_173.addFollower(TERMINAL_90);
		TERMINAL_173.addFollower(TERMINAL_91);
		TERMINAL_173.addFollower(TERMINAL_92);
		TERMINAL_173.addFollower(TERMINAL_93);
		TERMINAL_173.addFollower(TERMINAL_94);
		TERMINAL_173.addFollower(TERMINAL_95);
		TERMINAL_173.addFollower(TERMINAL_96);
		TERMINAL_173.addFollower(TERMINAL_97);
		TERMINAL_173.addFollower(TERMINAL_98);
		TERMINAL_173.addFollower(TERMINAL_99);
		TERMINAL_173.addFollower(TERMINAL_100);
		TERMINAL_173.addFollower(TERMINAL_101);
		TERMINAL_173.addFollower(TERMINAL_102);
		TERMINAL_173.addFollower(TERMINAL_103);
		TERMINAL_173.addFollower(TERMINAL_104);
		TERMINAL_173.addFollower(TERMINAL_105);
		TERMINAL_173.addFollower(TERMINAL_106);
		TERMINAL_81.addFollower(TERMINAL_174);
		TERMINAL_174.addFollower(TERMINAL_70);
		TERMINAL_174.addFollower(TERMINAL_71);
		TERMINAL_174.addFollower(TERMINAL_72);
		TERMINAL_174.addFollower(TERMINAL_1);
		TERMINAL_174.addFollower(TERMINAL_35);
		TERMINAL_26.addFollower(TERMINAL_73);
		TERMINAL_26.addFollower(TERMINAL_74);
		TERMINAL_26.addFollower(TERMINAL_75);
		TERMINAL_26.addFollower(TERMINAL_76);
		TERMINAL_26.addFollower(TERMINAL_77);
		TERMINAL_26.addFollower(TERMINAL_78);
		TERMINAL_26.addFollower(TERMINAL_79);
		TERMINAL_26.addFollower(TERMINAL_80);
		TERMINAL_26.addFollower(TERMINAL_81);
		TERMINAL_26.addFollower(TERMINAL_82);
		TERMINAL_26.addFollower(TERMINAL_83);
		TERMINAL_26.addFollower(TERMINAL_84);
		TERMINAL_26.addFollower(TERMINAL_85);
		TERMINAL_26.addFollower(TERMINAL_86);
		TERMINAL_26.addFollower(TERMINAL_87);
		TERMINAL_26.addFollower(TERMINAL_88);
		TERMINAL_26.addFollower(TERMINAL_89);
		TERMINAL_26.addFollower(TERMINAL_90);
		TERMINAL_26.addFollower(TERMINAL_91);
		TERMINAL_26.addFollower(TERMINAL_92);
		TERMINAL_26.addFollower(TERMINAL_93);
		TERMINAL_26.addFollower(TERMINAL_94);
		TERMINAL_26.addFollower(TERMINAL_95);
		TERMINAL_26.addFollower(TERMINAL_96);
		TERMINAL_26.addFollower(TERMINAL_97);
		TERMINAL_26.addFollower(TERMINAL_98);
		TERMINAL_26.addFollower(TERMINAL_99);
		TERMINAL_26.addFollower(TERMINAL_100);
		TERMINAL_26.addFollower(TERMINAL_101);
		TERMINAL_26.addFollower(TERMINAL_102);
		TERMINAL_26.addFollower(TERMINAL_103);
		TERMINAL_26.addFollower(TERMINAL_104);
		TERMINAL_26.addFollower(TERMINAL_105);
		TERMINAL_26.addFollower(TERMINAL_106);
		TERMINAL_82.addFollower(TERMINAL_175);
		TERMINAL_175.addFollower(TERMINAL_70);
		TERMINAL_175.addFollower(TERMINAL_71);
		TERMINAL_175.addFollower(TERMINAL_72);
		TERMINAL_175.addFollower(TERMINAL_1);
		TERMINAL_175.addFollower(TERMINAL_35);
		TERMINAL_27.addFollower(TERMINAL_73);
		TERMINAL_27.addFollower(TERMINAL_74);
		TERMINAL_27.addFollower(TERMINAL_75);
		TERMINAL_27.addFollower(TERMINAL_76);
		TERMINAL_27.addFollower(TERMINAL_77);
		TERMINAL_27.addFollower(TERMINAL_78);
		TERMINAL_27.addFollower(TERMINAL_79);
		TERMINAL_27.addFollower(TERMINAL_80);
		TERMINAL_27.addFollower(TERMINAL_81);
		TERMINAL_27.addFollower(TERMINAL_82);
		TERMINAL_27.addFollower(TERMINAL_83);
		TERMINAL_27.addFollower(TERMINAL_84);
		TERMINAL_27.addFollower(TERMINAL_85);
		TERMINAL_27.addFollower(TERMINAL_86);
		TERMINAL_27.addFollower(TERMINAL_87);
		TERMINAL_27.addFollower(TERMINAL_88);
		TERMINAL_27.addFollower(TERMINAL_89);
		TERMINAL_27.addFollower(TERMINAL_90);
		TERMINAL_27.addFollower(TERMINAL_91);
		TERMINAL_27.addFollower(TERMINAL_92);
		TERMINAL_27.addFollower(TERMINAL_93);
		TERMINAL_27.addFollower(TERMINAL_94);
		TERMINAL_27.addFollower(TERMINAL_95);
		TERMINAL_27.addFollower(TERMINAL_96);
		TERMINAL_27.addFollower(TERMINAL_97);
		TERMINAL_27.addFollower(TERMINAL_98);
		TERMINAL_27.addFollower(TERMINAL_99);
		TERMINAL_27.addFollower(TERMINAL_100);
		TERMINAL_27.addFollower(TERMINAL_101);
		TERMINAL_27.addFollower(TERMINAL_102);
		TERMINAL_27.addFollower(TERMINAL_103);
		TERMINAL_27.addFollower(TERMINAL_104);
		TERMINAL_27.addFollower(TERMINAL_105);
		TERMINAL_27.addFollower(TERMINAL_106);
		TERMINAL_83.addFollower(TERMINAL_176);
		TERMINAL_176.addFollower(TERMINAL_70);
		TERMINAL_176.addFollower(TERMINAL_71);
		TERMINAL_176.addFollower(TERMINAL_72);
		TERMINAL_176.addFollower(TERMINAL_1);
		TERMINAL_176.addFollower(TERMINAL_35);
		TERMINAL_177.addFollower(TERMINAL_73);
		TERMINAL_177.addFollower(TERMINAL_74);
		TERMINAL_177.addFollower(TERMINAL_75);
		TERMINAL_177.addFollower(TERMINAL_76);
		TERMINAL_177.addFollower(TERMINAL_77);
		TERMINAL_177.addFollower(TERMINAL_78);
		TERMINAL_177.addFollower(TERMINAL_79);
		TERMINAL_177.addFollower(TERMINAL_80);
		TERMINAL_177.addFollower(TERMINAL_81);
		TERMINAL_177.addFollower(TERMINAL_82);
		TERMINAL_177.addFollower(TERMINAL_83);
		TERMINAL_177.addFollower(TERMINAL_84);
		TERMINAL_177.addFollower(TERMINAL_85);
		TERMINAL_177.addFollower(TERMINAL_86);
		TERMINAL_177.addFollower(TERMINAL_87);
		TERMINAL_177.addFollower(TERMINAL_88);
		TERMINAL_177.addFollower(TERMINAL_89);
		TERMINAL_177.addFollower(TERMINAL_90);
		TERMINAL_177.addFollower(TERMINAL_91);
		TERMINAL_177.addFollower(TERMINAL_92);
		TERMINAL_177.addFollower(TERMINAL_93);
		TERMINAL_177.addFollower(TERMINAL_94);
		TERMINAL_177.addFollower(TERMINAL_95);
		TERMINAL_177.addFollower(TERMINAL_96);
		TERMINAL_177.addFollower(TERMINAL_97);
		TERMINAL_177.addFollower(TERMINAL_98);
		TERMINAL_177.addFollower(TERMINAL_99);
		TERMINAL_177.addFollower(TERMINAL_100);
		TERMINAL_177.addFollower(TERMINAL_101);
		TERMINAL_177.addFollower(TERMINAL_102);
		TERMINAL_177.addFollower(TERMINAL_103);
		TERMINAL_177.addFollower(TERMINAL_104);
		TERMINAL_177.addFollower(TERMINAL_105);
		TERMINAL_177.addFollower(TERMINAL_106);
		TERMINAL_84.addFollower(TERMINAL_178);
		TERMINAL_178.addFollower(TERMINAL_70);
		TERMINAL_178.addFollower(TERMINAL_71);
		TERMINAL_178.addFollower(TERMINAL_72);
		TERMINAL_178.addFollower(TERMINAL_1);
		TERMINAL_178.addFollower(TERMINAL_35);
		TERMINAL_36.addFollower(TERMINAL_73);
		TERMINAL_36.addFollower(TERMINAL_74);
		TERMINAL_36.addFollower(TERMINAL_75);
		TERMINAL_36.addFollower(TERMINAL_76);
		TERMINAL_36.addFollower(TERMINAL_77);
		TERMINAL_36.addFollower(TERMINAL_78);
		TERMINAL_36.addFollower(TERMINAL_79);
		TERMINAL_36.addFollower(TERMINAL_80);
		TERMINAL_36.addFollower(TERMINAL_81);
		TERMINAL_36.addFollower(TERMINAL_82);
		TERMINAL_36.addFollower(TERMINAL_83);
		TERMINAL_36.addFollower(TERMINAL_84);
		TERMINAL_36.addFollower(TERMINAL_85);
		TERMINAL_36.addFollower(TERMINAL_86);
		TERMINAL_36.addFollower(TERMINAL_87);
		TERMINAL_36.addFollower(TERMINAL_88);
		TERMINAL_36.addFollower(TERMINAL_89);
		TERMINAL_36.addFollower(TERMINAL_90);
		TERMINAL_36.addFollower(TERMINAL_91);
		TERMINAL_36.addFollower(TERMINAL_92);
		TERMINAL_36.addFollower(TERMINAL_93);
		TERMINAL_36.addFollower(TERMINAL_94);
		TERMINAL_36.addFollower(TERMINAL_95);
		TERMINAL_36.addFollower(TERMINAL_96);
		TERMINAL_36.addFollower(TERMINAL_97);
		TERMINAL_36.addFollower(TERMINAL_98);
		TERMINAL_36.addFollower(TERMINAL_99);
		TERMINAL_36.addFollower(TERMINAL_100);
		TERMINAL_36.addFollower(TERMINAL_101);
		TERMINAL_36.addFollower(TERMINAL_102);
		TERMINAL_36.addFollower(TERMINAL_103);
		TERMINAL_36.addFollower(TERMINAL_104);
		TERMINAL_36.addFollower(TERMINAL_105);
		TERMINAL_36.addFollower(TERMINAL_106);
		TERMINAL_85.addFollower(TERMINAL_179);
		TERMINAL_179.addFollower(TERMINAL_70);
		TERMINAL_179.addFollower(TERMINAL_71);
		TERMINAL_179.addFollower(TERMINAL_72);
		TERMINAL_179.addFollower(TERMINAL_1);
		TERMINAL_179.addFollower(TERMINAL_35);
		TERMINAL_37.addFollower(TERMINAL_73);
		TERMINAL_37.addFollower(TERMINAL_74);
		TERMINAL_37.addFollower(TERMINAL_75);
		TERMINAL_37.addFollower(TERMINAL_76);
		TERMINAL_37.addFollower(TERMINAL_77);
		TERMINAL_37.addFollower(TERMINAL_78);
		TERMINAL_37.addFollower(TERMINAL_79);
		TERMINAL_37.addFollower(TERMINAL_80);
		TERMINAL_37.addFollower(TERMINAL_81);
		TERMINAL_37.addFollower(TERMINAL_82);
		TERMINAL_37.addFollower(TERMINAL_83);
		TERMINAL_37.addFollower(TERMINAL_84);
		TERMINAL_37.addFollower(TERMINAL_85);
		TERMINAL_37.addFollower(TERMINAL_86);
		TERMINAL_37.addFollower(TERMINAL_87);
		TERMINAL_37.addFollower(TERMINAL_88);
		TERMINAL_37.addFollower(TERMINAL_89);
		TERMINAL_37.addFollower(TERMINAL_90);
		TERMINAL_37.addFollower(TERMINAL_91);
		TERMINAL_37.addFollower(TERMINAL_92);
		TERMINAL_37.addFollower(TERMINAL_93);
		TERMINAL_37.addFollower(TERMINAL_94);
		TERMINAL_37.addFollower(TERMINAL_95);
		TERMINAL_37.addFollower(TERMINAL_96);
		TERMINAL_37.addFollower(TERMINAL_97);
		TERMINAL_37.addFollower(TERMINAL_98);
		TERMINAL_37.addFollower(TERMINAL_99);
		TERMINAL_37.addFollower(TERMINAL_100);
		TERMINAL_37.addFollower(TERMINAL_101);
		TERMINAL_37.addFollower(TERMINAL_102);
		TERMINAL_37.addFollower(TERMINAL_103);
		TERMINAL_37.addFollower(TERMINAL_104);
		TERMINAL_37.addFollower(TERMINAL_105);
		TERMINAL_37.addFollower(TERMINAL_106);
		TERMINAL_86.addFollower(TERMINAL_180);
		TERMINAL_180.addFollower(TERMINAL_70);
		TERMINAL_180.addFollower(TERMINAL_71);
		TERMINAL_180.addFollower(TERMINAL_72);
		TERMINAL_180.addFollower(TERMINAL_1);
		TERMINAL_180.addFollower(TERMINAL_35);
		TERMINAL_38.addFollower(TERMINAL_73);
		TERMINAL_38.addFollower(TERMINAL_74);
		TERMINAL_38.addFollower(TERMINAL_75);
		TERMINAL_38.addFollower(TERMINAL_76);
		TERMINAL_38.addFollower(TERMINAL_77);
		TERMINAL_38.addFollower(TERMINAL_78);
		TERMINAL_38.addFollower(TERMINAL_79);
		TERMINAL_38.addFollower(TERMINAL_80);
		TERMINAL_38.addFollower(TERMINAL_81);
		TERMINAL_38.addFollower(TERMINAL_82);
		TERMINAL_38.addFollower(TERMINAL_83);
		TERMINAL_38.addFollower(TERMINAL_84);
		TERMINAL_38.addFollower(TERMINAL_85);
		TERMINAL_38.addFollower(TERMINAL_86);
		TERMINAL_38.addFollower(TERMINAL_87);
		TERMINAL_38.addFollower(TERMINAL_88);
		TERMINAL_38.addFollower(TERMINAL_89);
		TERMINAL_38.addFollower(TERMINAL_90);
		TERMINAL_38.addFollower(TERMINAL_91);
		TERMINAL_38.addFollower(TERMINAL_92);
		TERMINAL_38.addFollower(TERMINAL_93);
		TERMINAL_38.addFollower(TERMINAL_94);
		TERMINAL_38.addFollower(TERMINAL_95);
		TERMINAL_38.addFollower(TERMINAL_96);
		TERMINAL_38.addFollower(TERMINAL_97);
		TERMINAL_38.addFollower(TERMINAL_98);
		TERMINAL_38.addFollower(TERMINAL_99);
		TERMINAL_38.addFollower(TERMINAL_100);
		TERMINAL_38.addFollower(TERMINAL_101);
		TERMINAL_38.addFollower(TERMINAL_102);
		TERMINAL_38.addFollower(TERMINAL_103);
		TERMINAL_38.addFollower(TERMINAL_104);
		TERMINAL_38.addFollower(TERMINAL_105);
		TERMINAL_38.addFollower(TERMINAL_106);
		TERMINAL_87.addFollower(TERMINAL_181);
		TERMINAL_181.addFollower(TERMINAL_70);
		TERMINAL_181.addFollower(TERMINAL_71);
		TERMINAL_181.addFollower(TERMINAL_72);
		TERMINAL_181.addFollower(TERMINAL_1);
		TERMINAL_181.addFollower(TERMINAL_35);
		TERMINAL_39.addFollower(TERMINAL_73);
		TERMINAL_39.addFollower(TERMINAL_74);
		TERMINAL_39.addFollower(TERMINAL_75);
		TERMINAL_39.addFollower(TERMINAL_76);
		TERMINAL_39.addFollower(TERMINAL_77);
		TERMINAL_39.addFollower(TERMINAL_78);
		TERMINAL_39.addFollower(TERMINAL_79);
		TERMINAL_39.addFollower(TERMINAL_80);
		TERMINAL_39.addFollower(TERMINAL_81);
		TERMINAL_39.addFollower(TERMINAL_82);
		TERMINAL_39.addFollower(TERMINAL_83);
		TERMINAL_39.addFollower(TERMINAL_84);
		TERMINAL_39.addFollower(TERMINAL_85);
		TERMINAL_39.addFollower(TERMINAL_86);
		TERMINAL_39.addFollower(TERMINAL_87);
		TERMINAL_39.addFollower(TERMINAL_88);
		TERMINAL_39.addFollower(TERMINAL_89);
		TERMINAL_39.addFollower(TERMINAL_90);
		TERMINAL_39.addFollower(TERMINAL_91);
		TERMINAL_39.addFollower(TERMINAL_92);
		TERMINAL_39.addFollower(TERMINAL_93);
		TERMINAL_39.addFollower(TERMINAL_94);
		TERMINAL_39.addFollower(TERMINAL_95);
		TERMINAL_39.addFollower(TERMINAL_96);
		TERMINAL_39.addFollower(TERMINAL_97);
		TERMINAL_39.addFollower(TERMINAL_98);
		TERMINAL_39.addFollower(TERMINAL_99);
		TERMINAL_39.addFollower(TERMINAL_100);
		TERMINAL_39.addFollower(TERMINAL_101);
		TERMINAL_39.addFollower(TERMINAL_102);
		TERMINAL_39.addFollower(TERMINAL_103);
		TERMINAL_39.addFollower(TERMINAL_104);
		TERMINAL_39.addFollower(TERMINAL_105);
		TERMINAL_39.addFollower(TERMINAL_106);
		TERMINAL_88.addFollower(TERMINAL_182);
		TERMINAL_182.addFollower(TERMINAL_70);
		TERMINAL_182.addFollower(TERMINAL_71);
		TERMINAL_182.addFollower(TERMINAL_72);
		TERMINAL_182.addFollower(TERMINAL_1);
		TERMINAL_182.addFollower(TERMINAL_35);
		TERMINAL_40.addFollower(TERMINAL_73);
		TERMINAL_40.addFollower(TERMINAL_74);
		TERMINAL_40.addFollower(TERMINAL_75);
		TERMINAL_40.addFollower(TERMINAL_76);
		TERMINAL_40.addFollower(TERMINAL_77);
		TERMINAL_40.addFollower(TERMINAL_78);
		TERMINAL_40.addFollower(TERMINAL_79);
		TERMINAL_40.addFollower(TERMINAL_80);
		TERMINAL_40.addFollower(TERMINAL_81);
		TERMINAL_40.addFollower(TERMINAL_82);
		TERMINAL_40.addFollower(TERMINAL_83);
		TERMINAL_40.addFollower(TERMINAL_84);
		TERMINAL_40.addFollower(TERMINAL_85);
		TERMINAL_40.addFollower(TERMINAL_86);
		TERMINAL_40.addFollower(TERMINAL_87);
		TERMINAL_40.addFollower(TERMINAL_88);
		TERMINAL_40.addFollower(TERMINAL_89);
		TERMINAL_40.addFollower(TERMINAL_90);
		TERMINAL_40.addFollower(TERMINAL_91);
		TERMINAL_40.addFollower(TERMINAL_92);
		TERMINAL_40.addFollower(TERMINAL_93);
		TERMINAL_40.addFollower(TERMINAL_94);
		TERMINAL_40.addFollower(TERMINAL_95);
		TERMINAL_40.addFollower(TERMINAL_96);
		TERMINAL_40.addFollower(TERMINAL_97);
		TERMINAL_40.addFollower(TERMINAL_98);
		TERMINAL_40.addFollower(TERMINAL_99);
		TERMINAL_40.addFollower(TERMINAL_100);
		TERMINAL_40.addFollower(TERMINAL_101);
		TERMINAL_40.addFollower(TERMINAL_102);
		TERMINAL_40.addFollower(TERMINAL_103);
		TERMINAL_40.addFollower(TERMINAL_104);
		TERMINAL_40.addFollower(TERMINAL_105);
		TERMINAL_40.addFollower(TERMINAL_106);
		TERMINAL_89.addFollower(TERMINAL_183);
		TERMINAL_183.addFollower(TERMINAL_70);
		TERMINAL_183.addFollower(TERMINAL_71);
		TERMINAL_183.addFollower(TERMINAL_72);
		TERMINAL_183.addFollower(TERMINAL_1);
		TERMINAL_183.addFollower(TERMINAL_35);
		TERMINAL_41.addFollower(TERMINAL_73);
		TERMINAL_41.addFollower(TERMINAL_74);
		TERMINAL_41.addFollower(TERMINAL_75);
		TERMINAL_41.addFollower(TERMINAL_76);
		TERMINAL_41.addFollower(TERMINAL_77);
		TERMINAL_41.addFollower(TERMINAL_78);
		TERMINAL_41.addFollower(TERMINAL_79);
		TERMINAL_41.addFollower(TERMINAL_80);
		TERMINAL_41.addFollower(TERMINAL_81);
		TERMINAL_41.addFollower(TERMINAL_82);
		TERMINAL_41.addFollower(TERMINAL_83);
		TERMINAL_41.addFollower(TERMINAL_84);
		TERMINAL_41.addFollower(TERMINAL_85);
		TERMINAL_41.addFollower(TERMINAL_86);
		TERMINAL_41.addFollower(TERMINAL_87);
		TERMINAL_41.addFollower(TERMINAL_88);
		TERMINAL_41.addFollower(TERMINAL_89);
		TERMINAL_41.addFollower(TERMINAL_90);
		TERMINAL_41.addFollower(TERMINAL_91);
		TERMINAL_41.addFollower(TERMINAL_92);
		TERMINAL_41.addFollower(TERMINAL_93);
		TERMINAL_41.addFollower(TERMINAL_94);
		TERMINAL_41.addFollower(TERMINAL_95);
		TERMINAL_41.addFollower(TERMINAL_96);
		TERMINAL_41.addFollower(TERMINAL_97);
		TERMINAL_41.addFollower(TERMINAL_98);
		TERMINAL_41.addFollower(TERMINAL_99);
		TERMINAL_41.addFollower(TERMINAL_100);
		TERMINAL_41.addFollower(TERMINAL_101);
		TERMINAL_41.addFollower(TERMINAL_102);
		TERMINAL_41.addFollower(TERMINAL_103);
		TERMINAL_41.addFollower(TERMINAL_104);
		TERMINAL_41.addFollower(TERMINAL_105);
		TERMINAL_41.addFollower(TERMINAL_106);
		TERMINAL_90.addFollower(TERMINAL_184);
		TERMINAL_184.addFollower(TERMINAL_70);
		TERMINAL_184.addFollower(TERMINAL_71);
		TERMINAL_184.addFollower(TERMINAL_72);
		TERMINAL_184.addFollower(TERMINAL_1);
		TERMINAL_184.addFollower(TERMINAL_35);
		TERMINAL_42.addFollower(TERMINAL_73);
		TERMINAL_42.addFollower(TERMINAL_74);
		TERMINAL_42.addFollower(TERMINAL_75);
		TERMINAL_42.addFollower(TERMINAL_76);
		TERMINAL_42.addFollower(TERMINAL_77);
		TERMINAL_42.addFollower(TERMINAL_78);
		TERMINAL_42.addFollower(TERMINAL_79);
		TERMINAL_42.addFollower(TERMINAL_80);
		TERMINAL_42.addFollower(TERMINAL_81);
		TERMINAL_42.addFollower(TERMINAL_82);
		TERMINAL_42.addFollower(TERMINAL_83);
		TERMINAL_42.addFollower(TERMINAL_84);
		TERMINAL_42.addFollower(TERMINAL_85);
		TERMINAL_42.addFollower(TERMINAL_86);
		TERMINAL_42.addFollower(TERMINAL_87);
		TERMINAL_42.addFollower(TERMINAL_88);
		TERMINAL_42.addFollower(TERMINAL_89);
		TERMINAL_42.addFollower(TERMINAL_90);
		TERMINAL_42.addFollower(TERMINAL_91);
		TERMINAL_42.addFollower(TERMINAL_92);
		TERMINAL_42.addFollower(TERMINAL_93);
		TERMINAL_42.addFollower(TERMINAL_94);
		TERMINAL_42.addFollower(TERMINAL_95);
		TERMINAL_42.addFollower(TERMINAL_96);
		TERMINAL_42.addFollower(TERMINAL_97);
		TERMINAL_42.addFollower(TERMINAL_98);
		TERMINAL_42.addFollower(TERMINAL_99);
		TERMINAL_42.addFollower(TERMINAL_100);
		TERMINAL_42.addFollower(TERMINAL_101);
		TERMINAL_42.addFollower(TERMINAL_102);
		TERMINAL_42.addFollower(TERMINAL_103);
		TERMINAL_42.addFollower(TERMINAL_104);
		TERMINAL_42.addFollower(TERMINAL_105);
		TERMINAL_42.addFollower(TERMINAL_106);
		TERMINAL_91.addFollower(TERMINAL_185);
		TERMINAL_185.addFollower(TERMINAL_70);
		TERMINAL_185.addFollower(TERMINAL_71);
		TERMINAL_185.addFollower(TERMINAL_72);
		TERMINAL_185.addFollower(TERMINAL_1);
		TERMINAL_186.addFollower(TERMINAL_73);
		TERMINAL_186.addFollower(TERMINAL_74);
		TERMINAL_186.addFollower(TERMINAL_75);
		TERMINAL_186.addFollower(TERMINAL_76);
		TERMINAL_186.addFollower(TERMINAL_77);
		TERMINAL_186.addFollower(TERMINAL_78);
		TERMINAL_186.addFollower(TERMINAL_79);
		TERMINAL_186.addFollower(TERMINAL_80);
		TERMINAL_186.addFollower(TERMINAL_81);
		TERMINAL_186.addFollower(TERMINAL_82);
		TERMINAL_186.addFollower(TERMINAL_83);
		TERMINAL_186.addFollower(TERMINAL_84);
		TERMINAL_186.addFollower(TERMINAL_85);
		TERMINAL_186.addFollower(TERMINAL_86);
		TERMINAL_186.addFollower(TERMINAL_87);
		TERMINAL_186.addFollower(TERMINAL_88);
		TERMINAL_186.addFollower(TERMINAL_89);
		TERMINAL_186.addFollower(TERMINAL_90);
		TERMINAL_186.addFollower(TERMINAL_91);
		TERMINAL_186.addFollower(TERMINAL_92);
		TERMINAL_186.addFollower(TERMINAL_93);
		TERMINAL_186.addFollower(TERMINAL_94);
		TERMINAL_186.addFollower(TERMINAL_95);
		TERMINAL_186.addFollower(TERMINAL_96);
		TERMINAL_186.addFollower(TERMINAL_97);
		TERMINAL_186.addFollower(TERMINAL_98);
		TERMINAL_186.addFollower(TERMINAL_99);
		TERMINAL_186.addFollower(TERMINAL_100);
		TERMINAL_186.addFollower(TERMINAL_101);
		TERMINAL_186.addFollower(TERMINAL_102);
		TERMINAL_186.addFollower(TERMINAL_103);
		TERMINAL_186.addFollower(TERMINAL_104);
		TERMINAL_186.addFollower(TERMINAL_105);
		TERMINAL_186.addFollower(TERMINAL_106);
		TERMINAL_92.addFollower(TERMINAL_187);
		TERMINAL_187.addFollower(TERMINAL_70);
		TERMINAL_187.addFollower(TERMINAL_71);
		TERMINAL_187.addFollower(TERMINAL_72);
		TERMINAL_187.addFollower(TERMINAL_1);
		TERMINAL_188.addFollower(TERMINAL_73);
		TERMINAL_188.addFollower(TERMINAL_74);
		TERMINAL_188.addFollower(TERMINAL_75);
		TERMINAL_188.addFollower(TERMINAL_76);
		TERMINAL_188.addFollower(TERMINAL_77);
		TERMINAL_188.addFollower(TERMINAL_78);
		TERMINAL_188.addFollower(TERMINAL_79);
		TERMINAL_188.addFollower(TERMINAL_80);
		TERMINAL_188.addFollower(TERMINAL_81);
		TERMINAL_188.addFollower(TERMINAL_82);
		TERMINAL_188.addFollower(TERMINAL_83);
		TERMINAL_188.addFollower(TERMINAL_84);
		TERMINAL_188.addFollower(TERMINAL_85);
		TERMINAL_188.addFollower(TERMINAL_86);
		TERMINAL_188.addFollower(TERMINAL_87);
		TERMINAL_188.addFollower(TERMINAL_88);
		TERMINAL_188.addFollower(TERMINAL_89);
		TERMINAL_188.addFollower(TERMINAL_90);
		TERMINAL_188.addFollower(TERMINAL_91);
		TERMINAL_188.addFollower(TERMINAL_92);
		TERMINAL_188.addFollower(TERMINAL_93);
		TERMINAL_188.addFollower(TERMINAL_94);
		TERMINAL_188.addFollower(TERMINAL_95);
		TERMINAL_188.addFollower(TERMINAL_96);
		TERMINAL_188.addFollower(TERMINAL_97);
		TERMINAL_188.addFollower(TERMINAL_98);
		TERMINAL_188.addFollower(TERMINAL_99);
		TERMINAL_188.addFollower(TERMINAL_100);
		TERMINAL_188.addFollower(TERMINAL_101);
		TERMINAL_188.addFollower(TERMINAL_102);
		TERMINAL_188.addFollower(TERMINAL_103);
		TERMINAL_188.addFollower(TERMINAL_104);
		TERMINAL_188.addFollower(TERMINAL_105);
		TERMINAL_188.addFollower(TERMINAL_106);
		TERMINAL_93.addFollower(TERMINAL_189);
		TERMINAL_189.addFollower(TERMINAL_70);
		TERMINAL_189.addFollower(TERMINAL_71);
		TERMINAL_189.addFollower(TERMINAL_72);
		TERMINAL_189.addFollower(TERMINAL_1);
		TERMINAL_190.addFollower(TERMINAL_73);
		TERMINAL_190.addFollower(TERMINAL_74);
		TERMINAL_190.addFollower(TERMINAL_75);
		TERMINAL_190.addFollower(TERMINAL_76);
		TERMINAL_190.addFollower(TERMINAL_77);
		TERMINAL_190.addFollower(TERMINAL_78);
		TERMINAL_190.addFollower(TERMINAL_79);
		TERMINAL_190.addFollower(TERMINAL_80);
		TERMINAL_190.addFollower(TERMINAL_81);
		TERMINAL_190.addFollower(TERMINAL_82);
		TERMINAL_190.addFollower(TERMINAL_83);
		TERMINAL_190.addFollower(TERMINAL_84);
		TERMINAL_190.addFollower(TERMINAL_85);
		TERMINAL_190.addFollower(TERMINAL_86);
		TERMINAL_190.addFollower(TERMINAL_87);
		TERMINAL_190.addFollower(TERMINAL_88);
		TERMINAL_190.addFollower(TERMINAL_89);
		TERMINAL_190.addFollower(TERMINAL_90);
		TERMINAL_190.addFollower(TERMINAL_91);
		TERMINAL_190.addFollower(TERMINAL_92);
		TERMINAL_190.addFollower(TERMINAL_93);
		TERMINAL_190.addFollower(TERMINAL_94);
		TERMINAL_190.addFollower(TERMINAL_95);
		TERMINAL_190.addFollower(TERMINAL_96);
		TERMINAL_190.addFollower(TERMINAL_97);
		TERMINAL_190.addFollower(TERMINAL_98);
		TERMINAL_190.addFollower(TERMINAL_99);
		TERMINAL_190.addFollower(TERMINAL_100);
		TERMINAL_190.addFollower(TERMINAL_101);
		TERMINAL_190.addFollower(TERMINAL_102);
		TERMINAL_190.addFollower(TERMINAL_103);
		TERMINAL_190.addFollower(TERMINAL_104);
		TERMINAL_190.addFollower(TERMINAL_105);
		TERMINAL_190.addFollower(TERMINAL_106);
		TERMINAL_94.addFollower(TERMINAL_191);
		TERMINAL_191.addFollower(TERMINAL_70);
		TERMINAL_191.addFollower(TERMINAL_71);
		TERMINAL_191.addFollower(TERMINAL_72);
		TERMINAL_191.addFollower(TERMINAL_1);
		TERMINAL_28.addFollower(TERMINAL_73);
		TERMINAL_28.addFollower(TERMINAL_74);
		TERMINAL_28.addFollower(TERMINAL_75);
		TERMINAL_28.addFollower(TERMINAL_76);
		TERMINAL_28.addFollower(TERMINAL_77);
		TERMINAL_28.addFollower(TERMINAL_78);
		TERMINAL_28.addFollower(TERMINAL_79);
		TERMINAL_28.addFollower(TERMINAL_80);
		TERMINAL_28.addFollower(TERMINAL_81);
		TERMINAL_28.addFollower(TERMINAL_82);
		TERMINAL_28.addFollower(TERMINAL_83);
		TERMINAL_28.addFollower(TERMINAL_84);
		TERMINAL_28.addFollower(TERMINAL_85);
		TERMINAL_28.addFollower(TERMINAL_86);
		TERMINAL_28.addFollower(TERMINAL_87);
		TERMINAL_28.addFollower(TERMINAL_88);
		TERMINAL_28.addFollower(TERMINAL_89);
		TERMINAL_28.addFollower(TERMINAL_90);
		TERMINAL_28.addFollower(TERMINAL_91);
		TERMINAL_28.addFollower(TERMINAL_92);
		TERMINAL_28.addFollower(TERMINAL_93);
		TERMINAL_28.addFollower(TERMINAL_94);
		TERMINAL_28.addFollower(TERMINAL_95);
		TERMINAL_28.addFollower(TERMINAL_96);
		TERMINAL_28.addFollower(TERMINAL_97);
		TERMINAL_28.addFollower(TERMINAL_98);
		TERMINAL_28.addFollower(TERMINAL_99);
		TERMINAL_28.addFollower(TERMINAL_100);
		TERMINAL_28.addFollower(TERMINAL_101);
		TERMINAL_28.addFollower(TERMINAL_102);
		TERMINAL_28.addFollower(TERMINAL_103);
		TERMINAL_28.addFollower(TERMINAL_104);
		TERMINAL_28.addFollower(TERMINAL_105);
		TERMINAL_28.addFollower(TERMINAL_106);
		TERMINAL_95.addFollower(TERMINAL_192);
		TERMINAL_192.addFollower(TERMINAL_70);
		TERMINAL_192.addFollower(TERMINAL_71);
		TERMINAL_192.addFollower(TERMINAL_72);
		TERMINAL_192.addFollower(TERMINAL_1);
		TERMINAL_126.addFollower(TERMINAL_73);
		TERMINAL_126.addFollower(TERMINAL_74);
		TERMINAL_126.addFollower(TERMINAL_75);
		TERMINAL_126.addFollower(TERMINAL_76);
		TERMINAL_126.addFollower(TERMINAL_77);
		TERMINAL_126.addFollower(TERMINAL_78);
		TERMINAL_126.addFollower(TERMINAL_79);
		TERMINAL_126.addFollower(TERMINAL_80);
		TERMINAL_126.addFollower(TERMINAL_81);
		TERMINAL_126.addFollower(TERMINAL_82);
		TERMINAL_126.addFollower(TERMINAL_83);
		TERMINAL_126.addFollower(TERMINAL_84);
		TERMINAL_126.addFollower(TERMINAL_85);
		TERMINAL_126.addFollower(TERMINAL_86);
		TERMINAL_126.addFollower(TERMINAL_87);
		TERMINAL_126.addFollower(TERMINAL_88);
		TERMINAL_126.addFollower(TERMINAL_89);
		TERMINAL_126.addFollower(TERMINAL_90);
		TERMINAL_126.addFollower(TERMINAL_91);
		TERMINAL_126.addFollower(TERMINAL_92);
		TERMINAL_126.addFollower(TERMINAL_93);
		TERMINAL_126.addFollower(TERMINAL_94);
		TERMINAL_126.addFollower(TERMINAL_95);
		TERMINAL_126.addFollower(TERMINAL_96);
		TERMINAL_126.addFollower(TERMINAL_97);
		TERMINAL_126.addFollower(TERMINAL_98);
		TERMINAL_126.addFollower(TERMINAL_99);
		TERMINAL_126.addFollower(TERMINAL_100);
		TERMINAL_126.addFollower(TERMINAL_101);
		TERMINAL_126.addFollower(TERMINAL_102);
		TERMINAL_126.addFollower(TERMINAL_103);
		TERMINAL_126.addFollower(TERMINAL_104);
		TERMINAL_126.addFollower(TERMINAL_105);
		TERMINAL_126.addFollower(TERMINAL_106);
		TERMINAL_96.addFollower(TERMINAL_193);
		TERMINAL_193.addFollower(TERMINAL_70);
		TERMINAL_193.addFollower(TERMINAL_71);
		TERMINAL_193.addFollower(TERMINAL_72);
		TERMINAL_193.addFollower(TERMINAL_1);
		TERMINAL_51.addFollower(TERMINAL_73);
		TERMINAL_51.addFollower(TERMINAL_74);
		TERMINAL_51.addFollower(TERMINAL_75);
		TERMINAL_51.addFollower(TERMINAL_76);
		TERMINAL_51.addFollower(TERMINAL_77);
		TERMINAL_51.addFollower(TERMINAL_78);
		TERMINAL_51.addFollower(TERMINAL_79);
		TERMINAL_51.addFollower(TERMINAL_80);
		TERMINAL_51.addFollower(TERMINAL_81);
		TERMINAL_51.addFollower(TERMINAL_82);
		TERMINAL_51.addFollower(TERMINAL_83);
		TERMINAL_51.addFollower(TERMINAL_84);
		TERMINAL_51.addFollower(TERMINAL_85);
		TERMINAL_51.addFollower(TERMINAL_86);
		TERMINAL_51.addFollower(TERMINAL_87);
		TERMINAL_51.addFollower(TERMINAL_88);
		TERMINAL_51.addFollower(TERMINAL_89);
		TERMINAL_51.addFollower(TERMINAL_90);
		TERMINAL_51.addFollower(TERMINAL_91);
		TERMINAL_51.addFollower(TERMINAL_92);
		TERMINAL_51.addFollower(TERMINAL_93);
		TERMINAL_51.addFollower(TERMINAL_94);
		TERMINAL_51.addFollower(TERMINAL_95);
		TERMINAL_51.addFollower(TERMINAL_96);
		TERMINAL_51.addFollower(TERMINAL_97);
		TERMINAL_51.addFollower(TERMINAL_98);
		TERMINAL_51.addFollower(TERMINAL_99);
		TERMINAL_51.addFollower(TERMINAL_100);
		TERMINAL_51.addFollower(TERMINAL_101);
		TERMINAL_51.addFollower(TERMINAL_102);
		TERMINAL_51.addFollower(TERMINAL_103);
		TERMINAL_51.addFollower(TERMINAL_104);
		TERMINAL_51.addFollower(TERMINAL_105);
		TERMINAL_51.addFollower(TERMINAL_106);
		TERMINAL_97.addFollower(TERMINAL_194);
		TERMINAL_194.addFollower(TERMINAL_70);
		TERMINAL_194.addFollower(TERMINAL_71);
		TERMINAL_194.addFollower(TERMINAL_72);
		TERMINAL_194.addFollower(TERMINAL_1);
		TERMINAL_194.addFollower(TERMINAL_3);
		TERMINAL_194.addFollower(TERMINAL_4);
		TERMINAL_194.addFollower(TERMINAL_5);
		TERMINAL_194.addFollower(TERMINAL_6);
		TERMINAL_194.addFollower(TERMINAL_7);
		TERMINAL_194.addFollower(TERMINAL_8);
		TERMINAL_194.addFollower(TERMINAL_9);
		TERMINAL_194.addFollower(TERMINAL_10);
		TERMINAL_194.addFollower(TERMINAL_11);
		TERMINAL_194.addFollower(TERMINAL_12);
		TERMINAL_194.addFollower(TERMINAL_13);
		TERMINAL_194.addFollower(TERMINAL_14);
		TERMINAL_194.addFollower(TERMINAL_15);
		TERMINAL_194.addFollower(TERMINAL_16);
		TERMINAL_194.addFollower(TERMINAL_17);
		TERMINAL_194.addFollower(TERMINAL_18);
		TERMINAL_194.addFollower(TERMINAL_19);
		TERMINAL_29.addFollower(TERMINAL_1);
		TERMINAL_29.addFollower(TERMINAL_35);
		TERMINAL_29.addFollower(TERMINAL_127);
		TERMINAL_127.addFollower(TERMINAL_195);
		TERMINAL_195.addFollower(TERMINAL_1);
		TERMINAL_195.addFollower(TERMINAL_128);
		TERMINAL_128.addFollower(TERMINAL_196);
		TERMINAL_196.addFollower(TERMINAL_73);
		TERMINAL_196.addFollower(TERMINAL_74);
		TERMINAL_196.addFollower(TERMINAL_75);
		TERMINAL_196.addFollower(TERMINAL_76);
		TERMINAL_196.addFollower(TERMINAL_77);
		TERMINAL_196.addFollower(TERMINAL_78);
		TERMINAL_196.addFollower(TERMINAL_79);
		TERMINAL_196.addFollower(TERMINAL_80);
		TERMINAL_196.addFollower(TERMINAL_81);
		TERMINAL_196.addFollower(TERMINAL_82);
		TERMINAL_196.addFollower(TERMINAL_83);
		TERMINAL_196.addFollower(TERMINAL_84);
		TERMINAL_196.addFollower(TERMINAL_85);
		TERMINAL_196.addFollower(TERMINAL_86);
		TERMINAL_196.addFollower(TERMINAL_87);
		TERMINAL_196.addFollower(TERMINAL_88);
		TERMINAL_196.addFollower(TERMINAL_89);
		TERMINAL_196.addFollower(TERMINAL_90);
		TERMINAL_196.addFollower(TERMINAL_91);
		TERMINAL_196.addFollower(TERMINAL_92);
		TERMINAL_196.addFollower(TERMINAL_93);
		TERMINAL_196.addFollower(TERMINAL_94);
		TERMINAL_196.addFollower(TERMINAL_95);
		TERMINAL_196.addFollower(TERMINAL_96);
		TERMINAL_196.addFollower(TERMINAL_97);
		TERMINAL_196.addFollower(TERMINAL_98);
		TERMINAL_196.addFollower(TERMINAL_99);
		TERMINAL_196.addFollower(TERMINAL_100);
		TERMINAL_196.addFollower(TERMINAL_101);
		TERMINAL_196.addFollower(TERMINAL_102);
		TERMINAL_196.addFollower(TERMINAL_103);
		TERMINAL_196.addFollower(TERMINAL_104);
		TERMINAL_196.addFollower(TERMINAL_105);
		TERMINAL_196.addFollower(TERMINAL_106);
		TERMINAL_98.addFollower(TERMINAL_197);
		TERMINAL_197.addFollower(TERMINAL_70);
		TERMINAL_197.addFollower(TERMINAL_71);
		TERMINAL_197.addFollower(TERMINAL_72);
		TERMINAL_197.addFollower(TERMINAL_1);
		TERMINAL_198.addFollower(TERMINAL_73);
		TERMINAL_198.addFollower(TERMINAL_74);
		TERMINAL_198.addFollower(TERMINAL_75);
		TERMINAL_198.addFollower(TERMINAL_76);
		TERMINAL_198.addFollower(TERMINAL_77);
		TERMINAL_198.addFollower(TERMINAL_78);
		TERMINAL_198.addFollower(TERMINAL_79);
		TERMINAL_198.addFollower(TERMINAL_80);
		TERMINAL_198.addFollower(TERMINAL_81);
		TERMINAL_198.addFollower(TERMINAL_82);
		TERMINAL_198.addFollower(TERMINAL_83);
		TERMINAL_198.addFollower(TERMINAL_84);
		TERMINAL_198.addFollower(TERMINAL_85);
		TERMINAL_198.addFollower(TERMINAL_86);
		TERMINAL_198.addFollower(TERMINAL_87);
		TERMINAL_198.addFollower(TERMINAL_88);
		TERMINAL_198.addFollower(TERMINAL_89);
		TERMINAL_198.addFollower(TERMINAL_90);
		TERMINAL_198.addFollower(TERMINAL_91);
		TERMINAL_198.addFollower(TERMINAL_92);
		TERMINAL_198.addFollower(TERMINAL_93);
		TERMINAL_198.addFollower(TERMINAL_94);
		TERMINAL_198.addFollower(TERMINAL_95);
		TERMINAL_198.addFollower(TERMINAL_96);
		TERMINAL_198.addFollower(TERMINAL_97);
		TERMINAL_198.addFollower(TERMINAL_98);
		TERMINAL_198.addFollower(TERMINAL_99);
		TERMINAL_198.addFollower(TERMINAL_100);
		TERMINAL_198.addFollower(TERMINAL_101);
		TERMINAL_198.addFollower(TERMINAL_102);
		TERMINAL_198.addFollower(TERMINAL_103);
		TERMINAL_198.addFollower(TERMINAL_104);
		TERMINAL_198.addFollower(TERMINAL_105);
		TERMINAL_198.addFollower(TERMINAL_106);
		TERMINAL_99.addFollower(TERMINAL_199);
		TERMINAL_199.addFollower(TERMINAL_70);
		TERMINAL_199.addFollower(TERMINAL_71);
		TERMINAL_199.addFollower(TERMINAL_72);
		TERMINAL_199.addFollower(TERMINAL_1);
		TERMINAL_200.addFollower(TERMINAL_73);
		TERMINAL_200.addFollower(TERMINAL_74);
		TERMINAL_200.addFollower(TERMINAL_75);
		TERMINAL_200.addFollower(TERMINAL_76);
		TERMINAL_200.addFollower(TERMINAL_77);
		TERMINAL_200.addFollower(TERMINAL_78);
		TERMINAL_200.addFollower(TERMINAL_79);
		TERMINAL_200.addFollower(TERMINAL_80);
		TERMINAL_200.addFollower(TERMINAL_81);
		TERMINAL_200.addFollower(TERMINAL_82);
		TERMINAL_200.addFollower(TERMINAL_83);
		TERMINAL_200.addFollower(TERMINAL_84);
		TERMINAL_200.addFollower(TERMINAL_85);
		TERMINAL_200.addFollower(TERMINAL_86);
		TERMINAL_200.addFollower(TERMINAL_87);
		TERMINAL_200.addFollower(TERMINAL_88);
		TERMINAL_200.addFollower(TERMINAL_89);
		TERMINAL_200.addFollower(TERMINAL_90);
		TERMINAL_200.addFollower(TERMINAL_91);
		TERMINAL_200.addFollower(TERMINAL_92);
		TERMINAL_200.addFollower(TERMINAL_93);
		TERMINAL_200.addFollower(TERMINAL_94);
		TERMINAL_200.addFollower(TERMINAL_95);
		TERMINAL_200.addFollower(TERMINAL_96);
		TERMINAL_200.addFollower(TERMINAL_97);
		TERMINAL_200.addFollower(TERMINAL_98);
		TERMINAL_200.addFollower(TERMINAL_99);
		TERMINAL_200.addFollower(TERMINAL_100);
		TERMINAL_200.addFollower(TERMINAL_101);
		TERMINAL_200.addFollower(TERMINAL_102);
		TERMINAL_200.addFollower(TERMINAL_103);
		TERMINAL_200.addFollower(TERMINAL_104);
		TERMINAL_200.addFollower(TERMINAL_105);
		TERMINAL_200.addFollower(TERMINAL_106);
		TERMINAL_100.addFollower(TERMINAL_201);
		TERMINAL_201.addFollower(TERMINAL_70);
		TERMINAL_201.addFollower(TERMINAL_71);
		TERMINAL_201.addFollower(TERMINAL_72);
		TERMINAL_201.addFollower(TERMINAL_1);
		TERMINAL_30.addFollower(TERMINAL_73);
		TERMINAL_30.addFollower(TERMINAL_74);
		TERMINAL_30.addFollower(TERMINAL_75);
		TERMINAL_30.addFollower(TERMINAL_76);
		TERMINAL_30.addFollower(TERMINAL_77);
		TERMINAL_30.addFollower(TERMINAL_78);
		TERMINAL_30.addFollower(TERMINAL_79);
		TERMINAL_30.addFollower(TERMINAL_80);
		TERMINAL_30.addFollower(TERMINAL_81);
		TERMINAL_30.addFollower(TERMINAL_82);
		TERMINAL_30.addFollower(TERMINAL_83);
		TERMINAL_30.addFollower(TERMINAL_84);
		TERMINAL_30.addFollower(TERMINAL_85);
		TERMINAL_30.addFollower(TERMINAL_86);
		TERMINAL_30.addFollower(TERMINAL_87);
		TERMINAL_30.addFollower(TERMINAL_88);
		TERMINAL_30.addFollower(TERMINAL_89);
		TERMINAL_30.addFollower(TERMINAL_90);
		TERMINAL_30.addFollower(TERMINAL_91);
		TERMINAL_30.addFollower(TERMINAL_92);
		TERMINAL_30.addFollower(TERMINAL_93);
		TERMINAL_30.addFollower(TERMINAL_94);
		TERMINAL_30.addFollower(TERMINAL_95);
		TERMINAL_30.addFollower(TERMINAL_96);
		TERMINAL_30.addFollower(TERMINAL_97);
		TERMINAL_30.addFollower(TERMINAL_98);
		TERMINAL_30.addFollower(TERMINAL_99);
		TERMINAL_30.addFollower(TERMINAL_100);
		TERMINAL_30.addFollower(TERMINAL_101);
		TERMINAL_30.addFollower(TERMINAL_102);
		TERMINAL_30.addFollower(TERMINAL_103);
		TERMINAL_30.addFollower(TERMINAL_104);
		TERMINAL_30.addFollower(TERMINAL_105);
		TERMINAL_30.addFollower(TERMINAL_106);
		TERMINAL_101.addFollower(TERMINAL_202);
		TERMINAL_202.addFollower(TERMINAL_70);
		TERMINAL_202.addFollower(TERMINAL_71);
		TERMINAL_202.addFollower(TERMINAL_72);
		TERMINAL_202.addFollower(TERMINAL_1);
		TERMINAL_202.addFollower(TERMINAL_35);
		TERMINAL_203.addFollower(TERMINAL_73);
		TERMINAL_203.addFollower(TERMINAL_74);
		TERMINAL_203.addFollower(TERMINAL_75);
		TERMINAL_203.addFollower(TERMINAL_76);
		TERMINAL_203.addFollower(TERMINAL_77);
		TERMINAL_203.addFollower(TERMINAL_78);
		TERMINAL_203.addFollower(TERMINAL_79);
		TERMINAL_203.addFollower(TERMINAL_80);
		TERMINAL_203.addFollower(TERMINAL_81);
		TERMINAL_203.addFollower(TERMINAL_82);
		TERMINAL_203.addFollower(TERMINAL_83);
		TERMINAL_203.addFollower(TERMINAL_84);
		TERMINAL_203.addFollower(TERMINAL_85);
		TERMINAL_203.addFollower(TERMINAL_86);
		TERMINAL_203.addFollower(TERMINAL_87);
		TERMINAL_203.addFollower(TERMINAL_88);
		TERMINAL_203.addFollower(TERMINAL_89);
		TERMINAL_203.addFollower(TERMINAL_90);
		TERMINAL_203.addFollower(TERMINAL_91);
		TERMINAL_203.addFollower(TERMINAL_92);
		TERMINAL_203.addFollower(TERMINAL_93);
		TERMINAL_203.addFollower(TERMINAL_94);
		TERMINAL_203.addFollower(TERMINAL_95);
		TERMINAL_203.addFollower(TERMINAL_96);
		TERMINAL_203.addFollower(TERMINAL_97);
		TERMINAL_203.addFollower(TERMINAL_98);
		TERMINAL_203.addFollower(TERMINAL_99);
		TERMINAL_203.addFollower(TERMINAL_100);
		TERMINAL_203.addFollower(TERMINAL_101);
		TERMINAL_203.addFollower(TERMINAL_102);
		TERMINAL_203.addFollower(TERMINAL_103);
		TERMINAL_203.addFollower(TERMINAL_104);
		TERMINAL_203.addFollower(TERMINAL_105);
		TERMINAL_203.addFollower(TERMINAL_106);
		TERMINAL_102.addFollower(TERMINAL_204);
		TERMINAL_204.addFollower(TERMINAL_70);
		TERMINAL_204.addFollower(TERMINAL_71);
		TERMINAL_204.addFollower(TERMINAL_72);
		TERMINAL_204.addFollower(TERMINAL_1);
		TERMINAL_204.addFollower(TERMINAL_35);
		TERMINAL_205.addFollower(TERMINAL_73);
		TERMINAL_205.addFollower(TERMINAL_74);
		TERMINAL_205.addFollower(TERMINAL_75);
		TERMINAL_205.addFollower(TERMINAL_76);
		TERMINAL_205.addFollower(TERMINAL_77);
		TERMINAL_205.addFollower(TERMINAL_78);
		TERMINAL_205.addFollower(TERMINAL_79);
		TERMINAL_205.addFollower(TERMINAL_80);
		TERMINAL_205.addFollower(TERMINAL_81);
		TERMINAL_205.addFollower(TERMINAL_82);
		TERMINAL_205.addFollower(TERMINAL_83);
		TERMINAL_205.addFollower(TERMINAL_84);
		TERMINAL_205.addFollower(TERMINAL_85);
		TERMINAL_205.addFollower(TERMINAL_86);
		TERMINAL_205.addFollower(TERMINAL_87);
		TERMINAL_205.addFollower(TERMINAL_88);
		TERMINAL_205.addFollower(TERMINAL_89);
		TERMINAL_205.addFollower(TERMINAL_90);
		TERMINAL_205.addFollower(TERMINAL_91);
		TERMINAL_205.addFollower(TERMINAL_92);
		TERMINAL_205.addFollower(TERMINAL_93);
		TERMINAL_205.addFollower(TERMINAL_94);
		TERMINAL_205.addFollower(TERMINAL_95);
		TERMINAL_205.addFollower(TERMINAL_96);
		TERMINAL_205.addFollower(TERMINAL_97);
		TERMINAL_205.addFollower(TERMINAL_98);
		TERMINAL_205.addFollower(TERMINAL_99);
		TERMINAL_205.addFollower(TERMINAL_100);
		TERMINAL_205.addFollower(TERMINAL_101);
		TERMINAL_205.addFollower(TERMINAL_102);
		TERMINAL_205.addFollower(TERMINAL_103);
		TERMINAL_205.addFollower(TERMINAL_104);
		TERMINAL_205.addFollower(TERMINAL_105);
		TERMINAL_205.addFollower(TERMINAL_106);
		TERMINAL_103.addFollower(TERMINAL_206);
		TERMINAL_206.addFollower(TERMINAL_70);
		TERMINAL_206.addFollower(TERMINAL_71);
		TERMINAL_206.addFollower(TERMINAL_72);
		TERMINAL_206.addFollower(TERMINAL_1);
		TERMINAL_121.addFollower(TERMINAL_73);
		TERMINAL_121.addFollower(TERMINAL_74);
		TERMINAL_121.addFollower(TERMINAL_75);
		TERMINAL_121.addFollower(TERMINAL_76);
		TERMINAL_121.addFollower(TERMINAL_77);
		TERMINAL_121.addFollower(TERMINAL_78);
		TERMINAL_121.addFollower(TERMINAL_79);
		TERMINAL_121.addFollower(TERMINAL_80);
		TERMINAL_121.addFollower(TERMINAL_81);
		TERMINAL_121.addFollower(TERMINAL_82);
		TERMINAL_121.addFollower(TERMINAL_83);
		TERMINAL_121.addFollower(TERMINAL_84);
		TERMINAL_121.addFollower(TERMINAL_85);
		TERMINAL_121.addFollower(TERMINAL_86);
		TERMINAL_121.addFollower(TERMINAL_87);
		TERMINAL_121.addFollower(TERMINAL_88);
		TERMINAL_121.addFollower(TERMINAL_89);
		TERMINAL_121.addFollower(TERMINAL_90);
		TERMINAL_121.addFollower(TERMINAL_91);
		TERMINAL_121.addFollower(TERMINAL_92);
		TERMINAL_121.addFollower(TERMINAL_93);
		TERMINAL_121.addFollower(TERMINAL_94);
		TERMINAL_121.addFollower(TERMINAL_95);
		TERMINAL_121.addFollower(TERMINAL_96);
		TERMINAL_121.addFollower(TERMINAL_97);
		TERMINAL_121.addFollower(TERMINAL_98);
		TERMINAL_121.addFollower(TERMINAL_99);
		TERMINAL_121.addFollower(TERMINAL_100);
		TERMINAL_121.addFollower(TERMINAL_101);
		TERMINAL_121.addFollower(TERMINAL_102);
		TERMINAL_121.addFollower(TERMINAL_103);
		TERMINAL_121.addFollower(TERMINAL_104);
		TERMINAL_121.addFollower(TERMINAL_105);
		TERMINAL_121.addFollower(TERMINAL_106);
		TERMINAL_104.addFollower(TERMINAL_207);
	}
	public static void wire2() {
		TERMINAL_207.addFollower(TERMINAL_70);
		TERMINAL_207.addFollower(TERMINAL_71);
		TERMINAL_207.addFollower(TERMINAL_72);
		TERMINAL_207.addFollower(TERMINAL_1);
		TERMINAL_122.addFollower(TERMINAL_73);
		TERMINAL_122.addFollower(TERMINAL_74);
		TERMINAL_122.addFollower(TERMINAL_75);
		TERMINAL_122.addFollower(TERMINAL_76);
		TERMINAL_122.addFollower(TERMINAL_77);
		TERMINAL_122.addFollower(TERMINAL_78);
		TERMINAL_122.addFollower(TERMINAL_79);
		TERMINAL_122.addFollower(TERMINAL_80);
		TERMINAL_122.addFollower(TERMINAL_81);
		TERMINAL_122.addFollower(TERMINAL_82);
		TERMINAL_122.addFollower(TERMINAL_83);
		TERMINAL_122.addFollower(TERMINAL_84);
		TERMINAL_122.addFollower(TERMINAL_85);
		TERMINAL_122.addFollower(TERMINAL_86);
		TERMINAL_122.addFollower(TERMINAL_87);
		TERMINAL_122.addFollower(TERMINAL_88);
		TERMINAL_122.addFollower(TERMINAL_89);
		TERMINAL_122.addFollower(TERMINAL_90);
		TERMINAL_122.addFollower(TERMINAL_91);
		TERMINAL_122.addFollower(TERMINAL_92);
		TERMINAL_122.addFollower(TERMINAL_93);
		TERMINAL_122.addFollower(TERMINAL_94);
		TERMINAL_122.addFollower(TERMINAL_95);
		TERMINAL_122.addFollower(TERMINAL_96);
		TERMINAL_122.addFollower(TERMINAL_97);
		TERMINAL_122.addFollower(TERMINAL_98);
		TERMINAL_122.addFollower(TERMINAL_99);
		TERMINAL_122.addFollower(TERMINAL_100);
		TERMINAL_122.addFollower(TERMINAL_101);
		TERMINAL_122.addFollower(TERMINAL_102);
		TERMINAL_122.addFollower(TERMINAL_103);
		TERMINAL_122.addFollower(TERMINAL_104);
		TERMINAL_122.addFollower(TERMINAL_105);
		TERMINAL_122.addFollower(TERMINAL_106);
		TERMINAL_70.addFollower(TERMINAL_208);
		TERMINAL_71.addFollower(TERMINAL_208);
		TERMINAL_72.addFollower(TERMINAL_208);
		TERMINAL_208.addFollower(TERMINAL_1);
		TERMINAL_53.addFollower(TERMINAL_70);
		TERMINAL_53.addFollower(TERMINAL_71);
		TERMINAL_53.addFollower(TERMINAL_72);
		TERMINAL_53.addFollower(TERMINAL_73);
		TERMINAL_53.addFollower(TERMINAL_74);
		TERMINAL_53.addFollower(TERMINAL_75);
		TERMINAL_53.addFollower(TERMINAL_76);
		TERMINAL_53.addFollower(TERMINAL_77);
		TERMINAL_53.addFollower(TERMINAL_78);
		TERMINAL_53.addFollower(TERMINAL_79);
		TERMINAL_53.addFollower(TERMINAL_80);
		TERMINAL_53.addFollower(TERMINAL_81);
		TERMINAL_53.addFollower(TERMINAL_82);
		TERMINAL_53.addFollower(TERMINAL_83);
		TERMINAL_53.addFollower(TERMINAL_84);
		TERMINAL_53.addFollower(TERMINAL_85);
		TERMINAL_53.addFollower(TERMINAL_86);
		TERMINAL_53.addFollower(TERMINAL_87);
		TERMINAL_53.addFollower(TERMINAL_88);
		TERMINAL_53.addFollower(TERMINAL_89);
		TERMINAL_53.addFollower(TERMINAL_90);
		TERMINAL_53.addFollower(TERMINAL_91);
		TERMINAL_53.addFollower(TERMINAL_92);
		TERMINAL_53.addFollower(TERMINAL_93);
		TERMINAL_53.addFollower(TERMINAL_94);
		TERMINAL_53.addFollower(TERMINAL_95);
		TERMINAL_53.addFollower(TERMINAL_96);
		TERMINAL_53.addFollower(TERMINAL_97);
		TERMINAL_53.addFollower(TERMINAL_98);
		TERMINAL_53.addFollower(TERMINAL_99);
		TERMINAL_53.addFollower(TERMINAL_100);
		TERMINAL_53.addFollower(TERMINAL_101);
		TERMINAL_53.addFollower(TERMINAL_102);
		TERMINAL_53.addFollower(TERMINAL_103);
		TERMINAL_53.addFollower(TERMINAL_104);
		TERMINAL_53.addFollower(TERMINAL_105);
		TERMINAL_53.addFollower(TERMINAL_106);
		TERMINAL_53.addFollower(TERMINAL_110);
		TERMINAL_53.addFollower(TERMINAL_111);
		TERMINAL_53.addFollower(TERMINAL_112);
		TERMINAL_53.addFollower(TERMINAL_113);
		TERMINAL_53.addFollower(TERMINAL_114);
		TERMINAL_53.addFollower(TERMINAL_1);
		TERMINAL_53.addFollower(TERMINAL_3);
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
		TERMINAL_53.addFollower(TERMINAL_35);
		TERMINAL_53.addFollower(TERMINAL_209);
		TERMINAL_105.addFollower(TERMINAL_210);
		TERMINAL_210.addFollower(TERMINAL_211);
		TERMINAL_210.addFollower(TERMINAL_212);
		TERMINAL_210.addFollower(TERMINAL_213);
		TERMINAL_210.addFollower(TERMINAL_214);
		TERMINAL_210.addFollower(TERMINAL_215);
		TERMINAL_210.addFollower(TERMINAL_216);
		TERMINAL_211.addFollower(TERMINAL_217);
		TERMINAL_212.addFollower(TERMINAL_217);
		TERMINAL_213.addFollower(TERMINAL_217);
		TERMINAL_214.addFollower(TERMINAL_217);
		TERMINAL_215.addFollower(TERMINAL_217);
		TERMINAL_216.addFollower(TERMINAL_217);
		TERMINAL_217.addFollower(TERMINAL_1);
		TERMINAL_217.addFollower(TERMINAL_43);
		TERMINAL_31.addFollower(TERMINAL_70);
		TERMINAL_31.addFollower(TERMINAL_71);
		TERMINAL_31.addFollower(TERMINAL_72);
		TERMINAL_209.addFollower(TERMINAL_73);
		TERMINAL_209.addFollower(TERMINAL_74);
		TERMINAL_209.addFollower(TERMINAL_75);
		TERMINAL_209.addFollower(TERMINAL_76);
		TERMINAL_209.addFollower(TERMINAL_77);
		TERMINAL_209.addFollower(TERMINAL_78);
		TERMINAL_209.addFollower(TERMINAL_79);
		TERMINAL_209.addFollower(TERMINAL_80);
		TERMINAL_209.addFollower(TERMINAL_81);
		TERMINAL_209.addFollower(TERMINAL_82);
		TERMINAL_209.addFollower(TERMINAL_83);
		TERMINAL_209.addFollower(TERMINAL_84);
		TERMINAL_209.addFollower(TERMINAL_85);
		TERMINAL_209.addFollower(TERMINAL_86);
		TERMINAL_209.addFollower(TERMINAL_87);
		TERMINAL_209.addFollower(TERMINAL_88);
		TERMINAL_209.addFollower(TERMINAL_89);
		TERMINAL_209.addFollower(TERMINAL_90);
		TERMINAL_209.addFollower(TERMINAL_91);
		TERMINAL_209.addFollower(TERMINAL_92);
		TERMINAL_209.addFollower(TERMINAL_93);
		TERMINAL_209.addFollower(TERMINAL_94);
		TERMINAL_209.addFollower(TERMINAL_95);
		TERMINAL_209.addFollower(TERMINAL_96);
		TERMINAL_209.addFollower(TERMINAL_97);
		TERMINAL_209.addFollower(TERMINAL_98);
		TERMINAL_209.addFollower(TERMINAL_99);
		TERMINAL_209.addFollower(TERMINAL_100);
		TERMINAL_209.addFollower(TERMINAL_101);
		TERMINAL_209.addFollower(TERMINAL_102);
		TERMINAL_209.addFollower(TERMINAL_103);
		TERMINAL_209.addFollower(TERMINAL_104);
		TERMINAL_209.addFollower(TERMINAL_105);
		TERMINAL_209.addFollower(TERMINAL_106);
	}
	// wire the terminals
	static {
		wire0();
		wire1();
		wire2();
	}
}

start returns [ org.eclipse.emf.ecore.EObject element = null]
:
	{
		// follow set for start rule(s)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_0, 0));
		expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
	}
	(
		c0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_OntologyDocument{ element = c0; }
	)
	EOF	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_URI returns [de.uniko.isweb.emftext.owl2fs.owl2fs.URI element = null]
@init{
}
:
	(
		a0 = DIRTYIRI		
		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createURI();
			}
			if (a0 != null) {
				de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("DIRTYIRI");
				tokenResolver.setOptions(getOptions());
				de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.URI__VALUE), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a0).getLine(), ((org.antlr.runtime.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a0).getStartIndex(), ((org.antlr.runtime.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.URI__VALUE), resolved);
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_2, 1));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 1));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 1));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 1));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 1));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 1));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 1));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 1));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 1));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 1));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 1));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 1));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 1));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 1));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 1));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 1));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 1));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 1));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 1));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_20, 1));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_21, 1));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_22, 1));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_23, 1));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_24, 1));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_25, 1));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_26, 1));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_27, 1));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_28, 1));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_29, 1));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_30, 1));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_31, 1));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_32, 1));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_33, 1));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_34, 1));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 1));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_36, 1));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_37, 1));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_38, 1));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_39, 1));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_40, 1));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_41, 1));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_42, 1));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_43, 1));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_44, 1));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_45, 1));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_46, 1));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_47, 1));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_48, 1));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_49, 1));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_50, 1));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_51, 1));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_52, 1));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_53, 1));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_FullURI returns [de.uniko.isweb.emftext.owl2fs.owl2fs.FullURI element = null]
@init{
}
:
	(
		a0 = FULLIRI		
		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createFullURI();
			}
			if (a0 != null) {
				de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("FULLIRI");
				tokenResolver.setOptions(getOptions());
				de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.FULL_URI__IRI), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a0).getLine(), ((org.antlr.runtime.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a0).getStartIndex(), ((org.antlr.runtime.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.FULL_URI__IRI), resolved);
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_55, 2));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_AbbreviatedURI returns [de.uniko.isweb.emftext.owl2fs.owl2fs.AbbreviatedURI element = null]
@init{
}
:
	a0 = 'AbbreviatedURI' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createAbbreviatedURI();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_57, 3));
	}
	
	a1 = '{' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createAbbreviatedURI();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_58, 4));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_59, 4));
	}
	
	(
		(
			a2 = 'localName' {
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createAbbreviatedURI();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_60, 5));
			}
			
			a3 = ':' {
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createAbbreviatedURI();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_61, 6));
			}
			
			(
				a4 = QUOTED_34_34				
				{
					if (terminateParsing) {
						throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
					}
					if (element == null) {
						element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createAbbreviatedURI();
					}
					if (a4 != null) {
						de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("QUOTED_34_34");
						tokenResolver.setOptions(getOptions());
						de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a4.getText(), element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ABBREVIATED_URI__LOCAL_NAME), result);
						java.lang.Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a4).getLine(), ((org.antlr.runtime.CommonToken) a4).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a4).getStartIndex(), ((org.antlr.runtime.CommonToken) a4).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String)resolvedObject;
						if (resolved != null) {
							element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ABBREVIATED_URI__LOCAL_NAME), resolved);
							completedElement(resolved);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos((org.antlr.runtime.CommonToken) a4, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_58, 7));
				addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_59, 7));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_58, 8));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_59, 8));
	}
	
	a5 = '}' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createAbbreviatedURI();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_OntologyDocument returns [de.uniko.isweb.emftext.owl2fs.owl2fs.OntologyDocument element = null]
@init{
}
:
	(
		(
			(
				a0_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_PrefixDefinition				{
					if (terminateParsing) {
						throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
					}
					if (element == null) {
						element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createOntologyDocument();
					}
					if (a0_0 != null) {
						if (a0_0 != null) {
							addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ONTOLOGY_DOCUMENT__PREFIX_DEFINITION, a0_0);
							completedElement(a0_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a0_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_0, 10));
				addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_62, 10));
			}
			
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_0, 11));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_62, 11));
	}
	
	(
		a1_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Ontology		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createOntologyDocument();
			}
			if (a1_0 != null) {
				if (a1_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ONTOLOGY_DOCUMENT__ONTOLOGY), a1_0);
					completedElement(a1_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a1_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_PrefixDefinition returns [de.uniko.isweb.emftext.owl2fs.owl2fs.PrefixDefinition element = null]
@init{
}
:
	a0 = 'Namespace' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createPrefixDefinition();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_63, 13));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createPrefixDefinition();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_64, 14));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_65, 14));
	}
	
	(
		(
			a2 = DIRTYIRI			
			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createPrefixDefinition();
				}
				if (a2 != null) {
					de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("DIRTYIRI");
					tokenResolver.setOptions(getOptions());
					de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.PREFIX_DEFINITION__PREF), result);
					java.lang.Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String)resolvedObject;
					if (resolved != null) {
						element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.PREFIX_DEFINITION__PREF), resolved);
						completedElement(resolved);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
				}
			}
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_65, 15));
	}
	
	a3 = '=' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createPrefixDefinition();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_54, 16));
	}
	
	(
		a4_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_FullURI		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createPrefixDefinition();
			}
			if (a4_0 != null) {
				if (a4_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.PREFIX_DEFINITION__NAMESPACE), a4_0);
					completedElement(a4_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a4_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_55, 17));
	}
	
	a5 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createPrefixDefinition();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_0, 18));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_62, 18));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Ontology returns [de.uniko.isweb.emftext.owl2fs.owl2fs.Ontology element = null]
@init{
}
:
	a0 = 'Ontology' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createOntology();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_66, 19));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createOntology();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_67, 20));
	}
	
	(
		a2 = FULLIRI		
		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createOntology();
			}
			if (a2 != null) {
				de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("FULLIRI");
				tokenResolver.setOptions(getOptions());
				de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ONTOLOGY__ONTOLOGY_URI), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ONTOLOGY__ONTOLOGY_URI), resolved);
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_68, 21));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_69, 21));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 21));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 21));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 21));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 21));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 21));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 21));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 21));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 21));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 21));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 21));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 21));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 21));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 21));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 21));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 21));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 21));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 21));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 21));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 21));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 21));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 21));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 21));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 21));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 21));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 21));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 21));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 21));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 21));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 21));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 21));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 21));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 21));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 21));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 21));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 21));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 21));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 21));
	}
	
	(
		(
			a3 = DIRTYIRI			
			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createOntology();
				}
				if (a3 != null) {
					de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("DIRTYIRI");
					tokenResolver.setOptions(getOptions());
					de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolveResult result = getFreshTokenResolveResult();
					tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ONTOLOGY__VERSION_URI), result);
					java.lang.Object resolvedObject = result.getResolvedToken();
					if (resolvedObject == null) {
						addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a3).getLine(), ((org.antlr.runtime.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a3).getStartIndex(), ((org.antlr.runtime.CommonToken) a3).getStopIndex());
					}
					java.lang.String resolved = (java.lang.String)resolvedObject;
					if (resolved != null) {
						element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ONTOLOGY__VERSION_URI), resolved);
						completedElement(resolved);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos((org.antlr.runtime.CommonToken) a3, element);
				}
			}
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_69, 22));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 22));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 22));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 22));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 22));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 22));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 22));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 22));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 22));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 22));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 22));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 22));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 22));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 22));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 22));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 22));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 22));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 22));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 22));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 22));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 22));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 22));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 22));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 22));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 22));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 22));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 22));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 22));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 22));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 22));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 22));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 22));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 22));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 22));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 22));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 22));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 22));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 22));
	}
	
	(
		(
			a4 = 'Import' {
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createOntology();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_107, 23));
			}
			
			a5 = '(' {
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createOntology();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_62, 24));
			}
			
			(
				a6_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Ontology				{
					if (terminateParsing) {
						throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
					}
					if (element == null) {
						element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createOntology();
					}
					if (a6_0 != null) {
						if (a6_0 != null) {
							addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ONTOLOGY__IMPORTED_ONTOLOGIES, a6_0);
							completedElement(a6_0);
						}
						collectHiddenTokens(element);
						copyLocalizationInfos(a6_0, element); 					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_108, 25));
			}
			
			a7 = ')' {
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createOntology();
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_69, 26));
				addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 26));
				addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 26));
				addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 26));
				addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 26));
				addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 26));
				addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 26));
				addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 26));
				addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 26));
				addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 26));
				addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 26));
				addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 26));
				addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 26));
				addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 26));
				addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 26));
				addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 26));
				addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 26));
				addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 26));
				addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 26));
				addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 26));
				addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 26));
				addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 26));
				addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 26));
				addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 26));
				addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 26));
				addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 26));
				addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 26));
				addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 26));
				addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 26));
				addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 26));
				addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 26));
				addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 26));
				addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 26));
				addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 26));
				addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 26));
				addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 26));
				addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 26));
				addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 26));
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_69, 27));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 27));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 27));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 27));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 27));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 27));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 27));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 27));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 27));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 27));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 27));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 27));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 27));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 27));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 27));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 27));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 27));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 27));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 27));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 27));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 27));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 27));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 27));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 27));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 27));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 27));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 27));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 27));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 27));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 27));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 27));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 27));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 27));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 27));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 27));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 27));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 27));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 27));
	}
	
	(
		(
			a8_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Annotation			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createOntology();
				}
				if (a8_0 != null) {
					if (a8_0 != null) {
						addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ONTOLOGY__ONTOLOGY_ANNOTATIONS, a8_0);
						completedElement(a8_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a8_0, element); 				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 28));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 28));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 28));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 28));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 28));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 28));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 28));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 28));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 28));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 28));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 28));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 28));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 28));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 28));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 28));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 28));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 28));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 28));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 28));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 28));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 28));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 28));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 28));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 28));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 28));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 28));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 28));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 28));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 28));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 28));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 28));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 28));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 28));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 28));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 28));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 28));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 28));
	}
	
	(
		(
			a9_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Axiom			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createOntology();
				}
				if (a9_0 != null) {
					if (a9_0 != null) {
						addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ONTOLOGY__AXIOMS, a9_0);
						completedElement(a9_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a9_0, element); 				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 29));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 29));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 29));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 29));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 29));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 29));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 29));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 29));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 29));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 29));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 29));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 29));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 29));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 29));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 29));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 29));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 29));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 29));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 29));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 29));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 29));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 29));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 29));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 29));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 29));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 29));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 29));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 29));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 29));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 29));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 29));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 29));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 29));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 29));
	}
	
	a10 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createOntology();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a10, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_108, 30));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Declaration returns [de.uniko.isweb.emftext.owl2fs.owl2fs.Declaration element = null]
@init{
}
:
	a0 = 'Declaration' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDeclaration();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_109, 31));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDeclaration();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 32));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 32));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 32));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_110, 32));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_111, 32));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_112, 32));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_113, 32));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_114, 32));
	}
	
	(
		(
			a2_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Annotation			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDeclaration();
				}
				if (a2_0 != null) {
					if (a2_0 != null) {
						addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DECLARATION__AXIOM_ANNOTATIONS, a2_0);
						completedElement(a2_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a2_0, element); 				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 33));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 33));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 33));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_110, 33));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_111, 33));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_112, 33));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_113, 33));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_114, 33));
	}
	
	(
		a3 = 'Class' {
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDeclaration();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_115, 34));
		}
		
		
		|		a4 = 'Datatype' {
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDeclaration();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_115, 35));
		}
		
		
		|		a5 = 'ObjectProperty' {
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDeclaration();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_115, 36));
		}
		
		
		|		a6 = 'DataProperty' {
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDeclaration();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_115, 37));
		}
		
		
		|		a7 = 'Individual' {
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDeclaration();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_115, 38));
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_115, 39));
	}
	
	a8 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDeclaration();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a8, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 40));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_43, 40));
	}
	
	(
		a9_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Entity		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDeclaration();
			}
			if (a9_0 != null) {
				if (a9_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DECLARATION__ENTITY), a9_0);
					completedElement(a9_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a9_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_2, 41));
	}
	
	a10 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDeclaration();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a10, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_116, 42));
	}
	
	a11 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDeclaration();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a11, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 43));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 43));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 43));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 43));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 43));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 43));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 43));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 43));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 43));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 43));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 43));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 43));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 43));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 43));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 43));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 43));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 43));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 43));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 43));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 43));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 43));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 43));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 43));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 43));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 43));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 43));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 43));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 43));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 43));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 43));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 43));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 43));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 43));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 43));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Class returns [de.uniko.isweb.emftext.owl2fs.owl2fs.Class element = null]
@init{
}
:
	(
		a0_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_URI		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createClass();
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.CLASS__ENTITY_URI), a0_0);
					completedElement(a0_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a0_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_2, 44));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 44));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 44));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 44));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 44));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 44));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 44));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 44));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 44));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 44));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 44));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 44));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 44));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 44));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 44));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 44));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 44));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 44));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 44));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_20, 44));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_21, 44));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_22, 44));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_23, 44));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_24, 44));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_25, 44));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_26, 44));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_27, 44));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_28, 44));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_29, 44));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_30, 44));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_31, 44));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Datatype returns [de.uniko.isweb.emftext.owl2fs.owl2fs.Datatype element = null]
@init{
}
:
	(
		a0 = DIRTYIRI		
		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDatatype();
			}
			if (a0 != null) {
				de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("DIRTYIRI");
				tokenResolver.setOptions(getOptions());
				de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATATYPE__DATA_TYPE), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a0).getLine(), ((org.antlr.runtime.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a0).getStartIndex(), ((org.antlr.runtime.CommonToken) a0).getStopIndex());
				}
				de.uniko.isweb.emftext.owl2fs.owl2fs.DataTypeMaps resolved = (de.uniko.isweb.emftext.owl2fs.owl2fs.DataTypeMaps)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATATYPE__DATA_TYPE), resolved);
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_2, 45));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_47, 45));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_117, 45));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_118, 45));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_119, 45));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_120, 45));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_121, 45));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_122, 45));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_123, 45));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_124, 45));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_125, 45));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_48, 45));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_49, 45));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_50, 45));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_126, 45));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_31, 45));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectProperty returns [de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectProperty element = null]
@init{
}
:
	(
		a0_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_URI		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectProperty();
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_PROPERTY__ENTITY_URI), a0_0);
					completedElement(a0_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a0_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_2, 46));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_32, 46));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 46));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 46));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 46));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 46));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 46));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 46));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 46));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 46));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 46));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 46));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 46));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 46));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 46));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 46));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 46));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 46));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 46));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 46));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_33, 46));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_34, 46));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_23, 46));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_24, 46));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_25, 46));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 46));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_36, 46));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_37, 46));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_38, 46));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_39, 46));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_40, 46));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_41, 46));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_42, 46));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_127, 46));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_31, 46));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataProperty returns [de.uniko.isweb.emftext.owl2fs.owl2fs.DataProperty element = null]
@init{
}
:
	(
		a0_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_URI		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataProperty();
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_PROPERTY__ENTITY_URI), a0_0);
					completedElement(a0_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a0_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_2, 47));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_43, 47));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_44, 47));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_45, 47));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_46, 47));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_47, 47));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_48, 47));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_49, 47));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_50, 47));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 47));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 47));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 47));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 47));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 47));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 47));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 47));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 47));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 47));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 47));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 47));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 47));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 47));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 47));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 47));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 47));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 47));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 47));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_51, 47));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_128, 47));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_33, 47));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_31, 47));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_NamedIndividual returns [de.uniko.isweb.emftext.owl2fs.owl2fs.NamedIndividual element = null]
@init{
}
:
	(
		a0_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_URI		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createNamedIndividual();
			}
			if (a0_0 != null) {
				if (a0_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.NAMED_INDIVIDUAL__ENTITY_URI), a0_0);
					completedElement(a0_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a0_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_2, 48));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 48));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_33, 48));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_52, 48));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_129, 48));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 48));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 48));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 48));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 48));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 48));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 48));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 48));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 48));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 48));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 48));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 48));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 48));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 48));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 48));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 48));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 48));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 48));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_47, 48));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_31, 48));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_AnonymousIndividual returns [de.uniko.isweb.emftext.owl2fs.owl2fs.AnonymousIndividual element = null]
@init{
}
:
	(
		a0 = NODE		
		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createAnonymousIndividual();
			}
			if (a0 != null) {
				de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("NODE");
				tokenResolver.setOptions(getOptions());
				de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ANONYMOUS_INDIVIDUAL__NODE_ID), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a0).getLine(), ((org.antlr.runtime.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a0).getStartIndex(), ((org.antlr.runtime.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ANONYMOUS_INDIVIDUAL__NODE_ID), resolved);
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 49));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_33, 49));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_52, 49));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_129, 49));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_47, 49));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Literal returns [de.uniko.isweb.emftext.owl2fs.owl2fs.Literal element = null]
@init{
}
:
	(
		a0 = LITERAL		
		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createLiteral();
			}
			if (a0 != null) {
				de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("LITERAL");
				tokenResolver.setOptions(getOptions());
				de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.LITERAL__LEXICAL_VALUE), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a0).getLine(), ((org.antlr.runtime.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a0).getStartIndex(), ((org.antlr.runtime.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.LITERAL__LEXICAL_VALUE), resolved);
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_130, 50));
	}
	
	a1 = '^^' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createLiteral();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_43, 51));
	}
	
	(
		a2_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Datatype		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createLiteral();
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.LITERAL__DATATYPE), a2_0);
					completedElement(a2_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a2_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_47, 52));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_117, 52));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_118, 52));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_119, 52));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_120, 52));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_121, 52));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_122, 52));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_InverseObjectProperty returns [de.uniko.isweb.emftext.owl2fs.owl2fs.InverseObjectProperty element = null]
@init{
}
:
	a0 = 'ObjectInverseOf' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createInverseObjectProperty();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_131, 53));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createInverseObjectProperty();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 54));
	}
	
	(
		a2_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectProperty		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createInverseObjectProperty();
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.INVERSE_OBJECT_PROPERTY__OBJECT_PROPERTY), a2_0);
					completedElement(a2_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a2_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_32, 55));
	}
	
	a3 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createInverseObjectProperty();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 56));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 56));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 56));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 56));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 56));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 56));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 56));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 56));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 56));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 56));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 56));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 56));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 56));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 56));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 56));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 56));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 56));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 56));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_33, 56));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_34, 56));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_23, 56));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_24, 56));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_25, 56));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 56));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_36, 56));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_37, 56));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_38, 56));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_39, 56));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_40, 56));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_41, 56));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_42, 56));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_127, 56));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataComplementOf returns [de.uniko.isweb.emftext.owl2fs.owl2fs.DataComplementOf element = null]
@init{
}
:
	a0 = 'DataComplementOf' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataComplementOf();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_132, 57));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataComplementOf();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_43, 58));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_44, 58));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_45, 58));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_46, 58));
	}
	
	(
		a2_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataRange		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataComplementOf();
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_COMPLEMENT_OF__DATA_RANGE), a2_0);
					completedElement(a2_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a2_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_123, 59));
	}
	
	a3 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataComplementOf();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_123, 60));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_124, 60));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_125, 60));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_48, 60));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_49, 60));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_50, 60));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_126, 60));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataOneOf returns [de.uniko.isweb.emftext.owl2fs.owl2fs.DataOneOf element = null]
@init{
}
:
	a0 = 'DataOneOf' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataOneOf();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_133, 61));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataOneOf();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_47, 62));
	}
	
	(
		(
			a2_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Literal			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataOneOf();
				}
				if (a2_0 != null) {
					if (a2_0 != null) {
						addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_ONE_OF__CONSTANTS, a2_0);
						completedElement(a2_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a2_0, element); 				}
			}
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_47, 63));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_117, 63));
	}
	
	a3 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataOneOf();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_123, 64));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_124, 64));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_125, 64));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_48, 64));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_49, 64));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_50, 64));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_126, 64));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DatatypeRestriction returns [de.uniko.isweb.emftext.owl2fs.owl2fs.DatatypeRestriction element = null]
@init{
}
:
	a0 = 'DatatypeRestriction' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDatatypeRestriction();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_134, 65));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDatatypeRestriction();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_43, 66));
	}
	
	(
		a2_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Datatype		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDatatypeRestriction();
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATATYPE_RESTRICTION__DATATYPE), a2_0);
					completedElement(a2_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a2_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_118, 67));
	}
	
	(
		(
			a3_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_FacetConstantPair			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDatatypeRestriction();
				}
				if (a3_0 != null) {
					if (a3_0 != null) {
						addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATATYPE_RESTRICTION__RESTRICTIONS, a3_0);
						completedElement(a3_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a3_0, element); 				}
			}
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_118, 68));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_119, 68));
	}
	
	a4 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDatatypeRestriction();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_123, 69));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_124, 69));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_125, 69));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_48, 69));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_49, 69));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_50, 69));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_126, 69));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_FacetConstantPair returns [de.uniko.isweb.emftext.owl2fs.owl2fs.FacetConstantPair element = null]
@init{
}
:
	(
		a0 = DIRTYIRI		
		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createFacetConstantPair();
			}
			if (a0 != null) {
				de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("DIRTYIRI");
				tokenResolver.setOptions(getOptions());
				de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.FACET_CONSTANT_PAIR__FACET), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a0).getLine(), ((org.antlr.runtime.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a0).getStartIndex(), ((org.antlr.runtime.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.FACET_CONSTANT_PAIR__FACET), resolved);
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_47, 70));
	}
	
	(
		a1_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Literal		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createFacetConstantPair();
			}
			if (a1_0 != null) {
				if (a1_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.FACET_CONSTANT_PAIR__CONSTANT), a1_0);
					completedElement(a1_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a1_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_118, 71));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_119, 71));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectIntersectionOf returns [de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectIntersectionOf element = null]
@init{
}
:
	a0 = 'ObjectIntersectionOf' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectIntersectionOf();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_135, 72));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectIntersectionOf();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 73));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 73));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 73));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 73));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 73));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 73));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 73));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 73));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 73));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 73));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 73));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 73));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 73));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 73));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 73));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 73));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 73));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 73));
	}
	
	(
		a2_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ClassExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectIntersectionOf();
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_INTERSECTION_OF__CLASS_EXPRESSIONS, a2_0);
					completedElement(a2_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a2_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 74));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 74));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 74));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 74));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 74));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 74));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 74));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 74));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 74));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 74));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 74));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 74));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 74));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 74));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 74));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 74));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 74));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 74));
	}
	
	(
		(
			a3_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ClassExpression			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectIntersectionOf();
				}
				if (a3_0 != null) {
					if (a3_0 != null) {
						addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_INTERSECTION_OF__CLASS_EXPRESSIONS, a3_0);
						completedElement(a3_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a3_0, element); 				}
			}
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 75));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 75));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 75));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 75));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 75));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 75));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 75));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 75));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 75));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 75));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 75));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 75));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 75));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 75));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 75));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 75));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 75));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 75));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_136, 75));
	}
	
	a4 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectIntersectionOf();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 76));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 76));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 76));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 76));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 76));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 76));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 76));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 76));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 76));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 76));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 76));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 76));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 76));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 76));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 76));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 76));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 76));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 76));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_20, 76));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_21, 76));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_22, 76));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_23, 76));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_24, 76));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_25, 76));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_26, 76));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_27, 76));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_28, 76));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_29, 76));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_30, 76));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectUnionOf returns [de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectUnionOf element = null]
@init{
}
:
	a0 = 'ObjectUnionOf' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectUnionOf();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_137, 77));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectUnionOf();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 78));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 78));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 78));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 78));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 78));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 78));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 78));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 78));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 78));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 78));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 78));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 78));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 78));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 78));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 78));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 78));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 78));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 78));
	}
	
	(
		a2_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ClassExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectUnionOf();
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_UNION_OF__CLASS_EXPRESSIONS, a2_0);
					completedElement(a2_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a2_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 79));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 79));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 79));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 79));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 79));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 79));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 79));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 79));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 79));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 79));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 79));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 79));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 79));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 79));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 79));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 79));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 79));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 79));
	}
	
	(
		(
			a3_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ClassExpression			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectUnionOf();
				}
				if (a3_0 != null) {
					if (a3_0 != null) {
						addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_UNION_OF__CLASS_EXPRESSIONS, a3_0);
						completedElement(a3_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a3_0, element); 				}
			}
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 80));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 80));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 80));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 80));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 80));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 80));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 80));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 80));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 80));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 80));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 80));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 80));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 80));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 80));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 80));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 80));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 80));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 80));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_138, 80));
	}
	
	a4 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectUnionOf();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 81));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 81));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 81));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 81));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 81));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 81));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 81));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 81));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 81));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 81));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 81));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 81));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 81));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 81));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 81));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 81));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 81));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 81));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_20, 81));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_21, 81));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_22, 81));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_23, 81));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_24, 81));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_25, 81));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_26, 81));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_27, 81));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_28, 81));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_29, 81));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_30, 81));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectComplementOf returns [de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectComplementOf element = null]
@init{
}
:
	a0 = 'ObjectComplementOf' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectComplementOf();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_139, 82));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectComplementOf();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 83));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 83));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 83));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 83));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 83));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 83));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 83));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 83));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 83));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 83));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 83));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 83));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 83));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 83));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 83));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 83));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 83));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 83));
	}
	
	(
		a2_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ClassExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectComplementOf();
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_COMPLEMENT_OF__CLASS_EXPRESSION), a2_0);
					completedElement(a2_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a2_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_20, 84));
	}
	
	a3 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectComplementOf();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 85));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 85));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 85));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 85));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 85));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 85));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 85));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 85));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 85));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 85));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 85));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 85));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 85));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 85));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 85));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 85));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 85));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 85));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_20, 85));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_21, 85));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_22, 85));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_23, 85));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_24, 85));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_25, 85));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_26, 85));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_27, 85));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_28, 85));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_29, 85));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_30, 85));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectOneOf returns [de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectOneOf element = null]
@init{
}
:
	a0 = 'ObjectOneOf' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectOneOf();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_140, 86));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectOneOf();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 87));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_33, 87));
	}
	
	(
		(
			a2_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Individual			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectOneOf();
				}
				if (a2_0 != null) {
					if (a2_0 != null) {
						addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_ONE_OF__INDIVIDUALS, a2_0);
						completedElement(a2_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a2_0, element); 				}
			}
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 88));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_33, 88));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_52, 88));
	}
	
	a3 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectOneOf();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 89));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 89));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 89));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 89));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 89));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 89));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 89));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 89));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 89));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 89));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 89));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 89));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 89));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 89));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 89));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 89));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 89));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 89));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_20, 89));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_21, 89));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_22, 89));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_23, 89));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_24, 89));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_25, 89));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_26, 89));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_27, 89));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_28, 89));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_29, 89));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_30, 89));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectSomeValuesFrom returns [de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectSomeValuesFrom element = null]
@init{
}
:
	a0 = 'ObjectSomeValuesFrom' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectSomeValuesFrom();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_141, 90));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectSomeValuesFrom();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 91));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 91));
	}
	
	(
		a2_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectPropertyExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectSomeValuesFrom();
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_SOME_VALUES_FROM__OBJECT_PROPERTY_EXPRESSION), a2_0);
					completedElement(a2_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a2_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 92));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 92));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 92));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 92));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 92));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 92));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 92));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 92));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 92));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 92));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 92));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 92));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 92));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 92));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 92));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 92));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 92));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 92));
	}
	
	(
		a3_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ClassExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectSomeValuesFrom();
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_SOME_VALUES_FROM__CLASS_EXPRESSION), a3_0);
					completedElement(a3_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a3_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_21, 93));
	}
	
	a4 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectSomeValuesFrom();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 94));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 94));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 94));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 94));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 94));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 94));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 94));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 94));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 94));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 94));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 94));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 94));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 94));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 94));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 94));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 94));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 94));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 94));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_20, 94));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_21, 94));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_22, 94));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_23, 94));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_24, 94));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_25, 94));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_26, 94));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_27, 94));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_28, 94));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_29, 94));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_30, 94));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectAllValuesFrom returns [de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectAllValuesFrom element = null]
@init{
}
:
	a0 = 'ObjectAllValuesFrom' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectAllValuesFrom();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_142, 95));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectAllValuesFrom();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 96));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 96));
	}
	
	(
		a2_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectPropertyExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectAllValuesFrom();
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_ALL_VALUES_FROM__OBJECT_PROPERTY_EXPRESSION), a2_0);
					completedElement(a2_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a2_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 97));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 97));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 97));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 97));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 97));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 97));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 97));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 97));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 97));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 97));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 97));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 97));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 97));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 97));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 97));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 97));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 97));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 97));
	}
	
	(
		a3_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ClassExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectAllValuesFrom();
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_ALL_VALUES_FROM__CLASS_EXPRESSION), a3_0);
					completedElement(a3_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a3_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_22, 98));
	}
	
	a4 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectAllValuesFrom();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 99));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 99));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 99));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 99));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 99));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 99));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 99));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 99));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 99));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 99));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 99));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 99));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 99));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 99));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 99));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 99));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 99));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 99));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_20, 99));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_21, 99));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_22, 99));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_23, 99));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_24, 99));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_25, 99));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_26, 99));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_27, 99));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_28, 99));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_29, 99));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_30, 99));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectHasValue returns [de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectHasValue element = null]
@init{
}
:
	a0 = 'ObjectHasValue' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectHasValue();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_143, 100));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectHasValue();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 101));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 101));
	}
	
	(
		a2_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectPropertyExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectHasValue();
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_HAS_VALUE__OBJECT_PROPERTY_EXPRESSION), a2_0);
					completedElement(a2_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a2_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 102));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_33, 102));
	}
	
	(
		a3_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Individual		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectHasValue();
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_HAS_VALUE__INDIVIDUAL), a3_0);
					completedElement(a3_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a3_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_129, 103));
	}
	
	a4 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectHasValue();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 104));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 104));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 104));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 104));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 104));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 104));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 104));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 104));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 104));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 104));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 104));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 104));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 104));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 104));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 104));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 104));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 104));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 104));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_20, 104));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_21, 104));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_22, 104));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_23, 104));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_24, 104));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_25, 104));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_26, 104));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_27, 104));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_28, 104));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_29, 104));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_30, 104));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectExistsSelf returns [de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectExistsSelf element = null]
@init{
}
:
	a0 = 'ObjectExistsSelf' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectExistsSelf();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_144, 105));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectExistsSelf();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 106));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 106));
	}
	
	(
		a2_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectPropertyExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectExistsSelf();
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_EXISTS_SELF__OBJECT_PROPERTY_EXPRESSION), a2_0);
					completedElement(a2_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a2_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_34, 107));
	}
	
	a3 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectExistsSelf();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 108));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 108));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 108));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 108));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 108));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 108));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 108));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 108));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 108));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 108));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 108));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 108));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 108));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 108));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 108));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 108));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 108));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 108));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_20, 108));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_21, 108));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_22, 108));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_23, 108));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_24, 108));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_25, 108));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_26, 108));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_27, 108));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_28, 108));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_29, 108));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_30, 108));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectMinCardinality returns [de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectMinCardinality element = null]
@init{
}
:
	a0 = 'ObjectMinCardinality' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectMinCardinality();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_145, 109));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectMinCardinality();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_146, 110));
	}
	
	(
		a2 = INTEGER		
		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectMinCardinality();
			}
			if (a2 != null) {
				de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
				tokenResolver.setOptions(getOptions());
				de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_MIN_CARDINALITY__CARDINALITY), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
				}
				java.lang.Integer resolved = (java.lang.Integer)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_MIN_CARDINALITY__CARDINALITY), resolved);
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 111));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 111));
	}
	
	(
		a3_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectPropertyExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectMinCardinality();
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_MIN_CARDINALITY__OBJECT_PROPERTY_EXPRESSION), a3_0);
					completedElement(a3_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a3_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 112));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 112));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 112));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 112));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 112));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 112));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 112));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 112));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 112));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 112));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 112));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 112));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 112));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 112));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 112));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 112));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 112));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 112));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_23, 112));
	}
	
	(
		(
			a4_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ClassExpression			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectMinCardinality();
				}
				if (a4_0 != null) {
					if (a4_0 != null) {
						element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_MIN_CARDINALITY__CLASS_EXPRESSION), a4_0);
						completedElement(a4_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a4_0, element); 				}
			}
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_23, 113));
	}
	
	a5 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectMinCardinality();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 114));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 114));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 114));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 114));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 114));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 114));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 114));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 114));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 114));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 114));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 114));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 114));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 114));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 114));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 114));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 114));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 114));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 114));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_20, 114));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_21, 114));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_22, 114));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_23, 114));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_24, 114));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_25, 114));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_26, 114));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_27, 114));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_28, 114));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_29, 114));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_30, 114));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectMaxCardinality returns [de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectMaxCardinality element = null]
@init{
}
:
	a0 = 'ObjectMaxCardinality' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectMaxCardinality();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_147, 115));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectMaxCardinality();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_148, 116));
	}
	
	(
		a2 = INTEGER		
		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectMaxCardinality();
			}
			if (a2 != null) {
				de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
				tokenResolver.setOptions(getOptions());
				de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_MAX_CARDINALITY__CARDINALITY), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
				}
				java.lang.Integer resolved = (java.lang.Integer)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_MAX_CARDINALITY__CARDINALITY), resolved);
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 117));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 117));
	}
	
	(
		a3_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectPropertyExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectMaxCardinality();
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_MAX_CARDINALITY__OBJECT_PROPERTY_EXPRESSION), a3_0);
					completedElement(a3_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a3_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 118));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 118));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 118));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 118));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 118));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 118));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 118));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 118));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 118));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 118));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 118));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 118));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 118));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 118));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 118));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 118));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 118));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 118));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_24, 118));
	}
	
	(
		(
			a4_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ClassExpression			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectMaxCardinality();
				}
				if (a4_0 != null) {
					if (a4_0 != null) {
						element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_MAX_CARDINALITY__CLASS_EXPRESSION), a4_0);
						completedElement(a4_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a4_0, element); 				}
			}
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_24, 119));
	}
	
	a5 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectMaxCardinality();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 120));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 120));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 120));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 120));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 120));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 120));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 120));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 120));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 120));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 120));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 120));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 120));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 120));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 120));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 120));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 120));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 120));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 120));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_20, 120));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_21, 120));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_22, 120));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_23, 120));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_24, 120));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_25, 120));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_26, 120));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_27, 120));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_28, 120));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_29, 120));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_30, 120));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectExactCardinality returns [de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectExactCardinality element = null]
@init{
}
:
	a0 = 'ObjectExactCardinality' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectExactCardinality();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_149, 121));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectExactCardinality();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_150, 122));
	}
	
	(
		a2 = INTEGER		
		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectExactCardinality();
			}
			if (a2 != null) {
				de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
				tokenResolver.setOptions(getOptions());
				de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_EXACT_CARDINALITY__CARDINALITY), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
				}
				java.lang.Integer resolved = (java.lang.Integer)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_EXACT_CARDINALITY__CARDINALITY), resolved);
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 123));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 123));
	}
	
	(
		a3_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectPropertyExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectExactCardinality();
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_EXACT_CARDINALITY__OBJECT_PROPERTY_EXPRESSION), a3_0);
					completedElement(a3_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a3_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 124));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 124));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 124));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 124));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 124));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 124));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 124));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 124));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 124));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 124));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 124));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 124));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 124));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 124));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 124));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 124));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 124));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 124));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_25, 124));
	}
	
	(
		(
			a4_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ClassExpression			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectExactCardinality();
				}
				if (a4_0 != null) {
					if (a4_0 != null) {
						element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_EXACT_CARDINALITY__CLASS_EXPRESSION), a4_0);
						completedElement(a4_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a4_0, element); 				}
			}
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_25, 125));
	}
	
	a5 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectExactCardinality();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 126));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 126));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 126));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 126));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 126));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 126));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 126));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 126));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 126));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 126));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 126));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 126));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 126));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 126));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 126));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 126));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 126));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 126));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_20, 126));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_21, 126));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_22, 126));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_23, 126));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_24, 126));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_25, 126));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_26, 126));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_27, 126));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_28, 126));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_29, 126));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_30, 126));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataSomeValuesFrom returns [de.uniko.isweb.emftext.owl2fs.owl2fs.DataSomeValuesFrom element = null]
@init{
}
:
	a0 = 'DataSomeValuesFrom' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataSomeValuesFrom();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_151, 127));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataSomeValuesFrom();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 128));
	}
	
	(
		a2_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataPropertyExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataSomeValuesFrom();
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_SOME_VALUES_FROM__DATA_PROPERTY_EXPRESSIONS), a2_0);
					completedElement(a2_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a2_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_43, 129));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_44, 129));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_45, 129));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_46, 129));
	}
	
	(
		a3_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataRange		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataSomeValuesFrom();
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_SOME_VALUES_FROM__DATA_RANGE), a3_0);
					completedElement(a3_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a3_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_124, 130));
	}
	
	a4 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataSomeValuesFrom();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 131));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 131));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 131));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 131));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 131));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 131));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 131));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 131));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 131));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 131));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 131));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 131));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 131));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 131));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 131));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 131));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 131));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 131));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_20, 131));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_21, 131));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_22, 131));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_23, 131));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_24, 131));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_25, 131));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_26, 131));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_27, 131));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_28, 131));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_29, 131));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_30, 131));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataAllValuesFrom returns [de.uniko.isweb.emftext.owl2fs.owl2fs.DataAllValuesFrom element = null]
@init{
}
:
	a0 = 'DataAllValuesFrom' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataAllValuesFrom();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_152, 132));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataAllValuesFrom();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 133));
	}
	
	(
		a2_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataPropertyExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataAllValuesFrom();
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_ALL_VALUES_FROM__DATA_PROPERTY_EXPRESSIONS), a2_0);
					completedElement(a2_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a2_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_43, 134));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_44, 134));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_45, 134));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_46, 134));
	}
	
	(
		a3_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataRange		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataAllValuesFrom();
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_ALL_VALUES_FROM__DATA_RANGE), a3_0);
					completedElement(a3_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a3_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_125, 135));
	}
	
	a4 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataAllValuesFrom();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 136));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 136));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 136));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 136));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 136));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 136));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 136));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 136));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 136));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 136));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 136));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 136));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 136));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 136));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 136));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 136));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 136));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 136));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_20, 136));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_21, 136));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_22, 136));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_23, 136));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_24, 136));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_25, 136));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_26, 136));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_27, 136));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_28, 136));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_29, 136));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_30, 136));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataHasValue returns [de.uniko.isweb.emftext.owl2fs.owl2fs.DataHasValue element = null]
@init{
}
:
	a0 = 'DataHasValue' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataHasValue();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_153, 137));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataHasValue();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 138));
	}
	
	(
		a2_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataPropertyExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataHasValue();
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_HAS_VALUE__DATA_PROPERTY_EXPRESSION), a2_0);
					completedElement(a2_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a2_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_47, 139));
	}
	
	(
		a3_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Literal		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataHasValue();
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_HAS_VALUE__CONSTANT), a3_0);
					completedElement(a3_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a3_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_120, 140));
	}
	
	a4 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataHasValue();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 141));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 141));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 141));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 141));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 141));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 141));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 141));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 141));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 141));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 141));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 141));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 141));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 141));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 141));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 141));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 141));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 141));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 141));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_20, 141));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_21, 141));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_22, 141));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_23, 141));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_24, 141));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_25, 141));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_26, 141));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_27, 141));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_28, 141));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_29, 141));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_30, 141));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataMinCardinality returns [de.uniko.isweb.emftext.owl2fs.owl2fs.DataMinCardinality element = null]
@init{
}
:
	a0 = 'DataMinCardinality' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataMinCardinality();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_154, 142));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataMinCardinality();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_155, 143));
	}
	
	(
		a2 = INTEGER		
		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataMinCardinality();
			}
			if (a2 != null) {
				de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
				tokenResolver.setOptions(getOptions());
				de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_MIN_CARDINALITY__CARDINALITY), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
				}
				java.lang.Integer resolved = (java.lang.Integer)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_MIN_CARDINALITY__CARDINALITY), resolved);
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 144));
	}
	
	(
		a3_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataPropertyExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataMinCardinality();
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_MIN_CARDINALITY__DATA_PROPERTY_EXPRESSION), a3_0);
					completedElement(a3_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a3_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_43, 145));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_44, 145));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_45, 145));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_46, 145));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_48, 145));
	}
	
	(
		(
			a4_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataRange			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataMinCardinality();
				}
				if (a4_0 != null) {
					if (a4_0 != null) {
						element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_MIN_CARDINALITY__DATA_RANGE), a4_0);
						completedElement(a4_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a4_0, element); 				}
			}
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_48, 146));
	}
	
	a5 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataMinCardinality();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 147));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 147));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 147));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 147));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 147));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 147));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 147));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 147));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 147));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 147));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 147));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 147));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 147));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 147));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 147));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 147));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 147));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 147));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_20, 147));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_21, 147));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_22, 147));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_23, 147));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_24, 147));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_25, 147));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_26, 147));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_27, 147));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_28, 147));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_29, 147));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_30, 147));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataMaxCardinality returns [de.uniko.isweb.emftext.owl2fs.owl2fs.DataMaxCardinality element = null]
@init{
}
:
	a0 = 'DataMaxCardinality' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataMaxCardinality();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_156, 148));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataMaxCardinality();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_157, 149));
	}
	
	(
		a2 = INTEGER		
		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataMaxCardinality();
			}
			if (a2 != null) {
				de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
				tokenResolver.setOptions(getOptions());
				de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_MAX_CARDINALITY__CARDINALITY), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
				}
				java.lang.Integer resolved = (java.lang.Integer)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_MAX_CARDINALITY__CARDINALITY), resolved);
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 150));
	}
	
	(
		a3_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataPropertyExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataMaxCardinality();
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_MAX_CARDINALITY__DATA_PROPERTY_EXPRESSION), a3_0);
					completedElement(a3_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a3_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_43, 151));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_44, 151));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_45, 151));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_46, 151));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_49, 151));
	}
	
	(
		(
			a4_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataRange			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataMaxCardinality();
				}
				if (a4_0 != null) {
					if (a4_0 != null) {
						element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_MAX_CARDINALITY__DATA_RANGE), a4_0);
						completedElement(a4_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a4_0, element); 				}
			}
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_49, 152));
	}
	
	a5 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataMaxCardinality();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 153));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 153));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 153));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 153));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 153));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 153));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 153));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 153));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 153));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 153));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 153));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 153));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 153));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 153));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 153));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 153));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 153));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 153));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_20, 153));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_21, 153));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_22, 153));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_23, 153));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_24, 153));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_25, 153));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_26, 153));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_27, 153));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_28, 153));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_29, 153));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_30, 153));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataExactCardinality returns [de.uniko.isweb.emftext.owl2fs.owl2fs.DataExactCardinality element = null]
@init{
}
:
	a0 = 'DataExactCardinality' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataExactCardinality();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_158, 154));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataExactCardinality();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_159, 155));
	}
	
	(
		a2 = INTEGER		
		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataExactCardinality();
			}
			if (a2 != null) {
				de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("INTEGER");
				tokenResolver.setOptions(getOptions());
				de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_EXACT_CARDINALITY__CARDINALITY), result);
				java.lang.Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime.CommonToken) a2).getLine(), ((org.antlr.runtime.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime.CommonToken) a2).getStartIndex(), ((org.antlr.runtime.CommonToken) a2).getStopIndex());
				}
				java.lang.Integer resolved = (java.lang.Integer)resolvedObject;
				if (resolved != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_EXACT_CARDINALITY__CARDINALITY), resolved);
					completedElement(resolved);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos((org.antlr.runtime.CommonToken) a2, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 156));
	}
	
	(
		a3_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataPropertyExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataExactCardinality();
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_EXACT_CARDINALITY__DATA_PROPERTY_EXPRESSION), a3_0);
					completedElement(a3_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a3_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_43, 157));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_44, 157));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_45, 157));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_46, 157));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_50, 157));
	}
	
	(
		(
			a4_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataRange			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataExactCardinality();
				}
				if (a4_0 != null) {
					if (a4_0 != null) {
						element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_EXACT_CARDINALITY__DATA_RANGE), a4_0);
						completedElement(a4_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a4_0, element); 				}
			}
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_50, 158));
	}
	
	a5 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataExactCardinality();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 159));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 159));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 159));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 159));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 159));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 159));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 159));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 159));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 159));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 159));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 159));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 159));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 159));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 159));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 159));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 159));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 159));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 159));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_20, 159));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_21, 159));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_22, 159));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_23, 159));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_24, 159));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_25, 159));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_26, 159));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_27, 159));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_28, 159));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_29, 159));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_30, 159));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_SubClassOf returns [de.uniko.isweb.emftext.owl2fs.owl2fs.SubClassOf element = null]
@init{
}
:
	a0 = 'SubClassOf' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createSubClassOf();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_160, 160));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createSubClassOf();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 161));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 161));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 161));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 161));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 161));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 161));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 161));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 161));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 161));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 161));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 161));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 161));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 161));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 161));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 161));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 161));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 161));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 161));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 161));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 161));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 161));
	}
	
	(
		(
			a2_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Annotation			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createSubClassOf();
				}
				if (a2_0 != null) {
					if (a2_0 != null) {
						addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.SUB_CLASS_OF__AXIOM_ANNOTATIONS, a2_0);
						completedElement(a2_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a2_0, element); 				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 162));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 162));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 162));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 162));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 162));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 162));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 162));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 162));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 162));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 162));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 162));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 162));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 162));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 162));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 162));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 162));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 162));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 162));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 162));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 162));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 162));
	}
	
	(
		a3_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ClassExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createSubClassOf();
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.SUB_CLASS_OF__SUB_CLASS_EXPRESSION), a3_0);
					completedElement(a3_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a3_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 163));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 163));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 163));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 163));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 163));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 163));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 163));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 163));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 163));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 163));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 163));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 163));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 163));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 163));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 163));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 163));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 163));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 163));
	}
	
	(
		a4_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ClassExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createSubClassOf();
			}
			if (a4_0 != null) {
				if (a4_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.SUB_CLASS_OF__SUPER_CLASS_EXPRESSION), a4_0);
					completedElement(a4_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a4_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_161, 164));
	}
	
	a5 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createSubClassOf();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 165));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 165));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 165));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 165));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 165));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 165));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 165));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 165));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 165));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 165));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 165));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 165));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 165));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 165));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 165));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 165));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 165));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 165));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 165));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 165));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 165));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 165));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 165));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 165));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 165));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 165));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 165));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 165));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 165));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 165));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 165));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 165));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 165));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 165));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_EquivalentClasses returns [de.uniko.isweb.emftext.owl2fs.owl2fs.EquivalentClasses element = null]
@init{
}
:
	a0 = 'EquivalentClasses' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createEquivalentClasses();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_162, 166));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createEquivalentClasses();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 167));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 167));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 167));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 167));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 167));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 167));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 167));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 167));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 167));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 167));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 167));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 167));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 167));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 167));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 167));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 167));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 167));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 167));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 167));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 167));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 167));
	}
	
	(
		(
			a2_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Annotation			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createEquivalentClasses();
				}
				if (a2_0 != null) {
					if (a2_0 != null) {
						addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.EQUIVALENT_CLASSES__AXIOM_ANNOTATIONS, a2_0);
						completedElement(a2_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a2_0, element); 				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 168));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 168));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 168));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 168));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 168));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 168));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 168));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 168));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 168));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 168));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 168));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 168));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 168));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 168));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 168));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 168));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 168));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 168));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 168));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 168));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 168));
	}
	
	(
		a3_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ClassExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createEquivalentClasses();
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.EQUIVALENT_CLASSES__EQUIVALENT_CLASS_EXPRESSIONS, a3_0);
					completedElement(a3_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a3_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 169));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 169));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 169));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 169));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 169));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 169));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 169));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 169));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 169));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 169));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 169));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 169));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 169));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 169));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 169));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 169));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 169));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 169));
	}
	
	(
		(
			a4_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ClassExpression			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createEquivalentClasses();
				}
				if (a4_0 != null) {
					if (a4_0 != null) {
						addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.EQUIVALENT_CLASSES__EQUIVALENT_CLASS_EXPRESSIONS, a4_0);
						completedElement(a4_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a4_0, element); 				}
			}
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 170));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 170));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 170));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 170));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 170));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 170));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 170));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 170));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 170));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 170));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 170));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 170));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 170));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 170));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 170));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 170));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 170));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 170));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_163, 170));
	}
	
	a5 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createEquivalentClasses();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 171));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 171));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 171));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 171));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 171));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 171));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 171));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 171));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 171));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 171));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 171));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 171));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 171));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 171));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 171));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 171));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 171));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 171));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 171));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 171));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 171));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 171));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 171));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 171));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 171));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 171));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 171));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 171));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 171));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 171));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 171));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 171));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 171));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 171));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DisjointClasses returns [de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointClasses element = null]
@init{
}
:
	a0 = 'DisjointClasses' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDisjointClasses();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_164, 172));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDisjointClasses();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 173));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 173));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 173));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 173));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 173));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 173));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 173));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 173));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 173));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 173));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 173));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 173));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 173));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 173));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 173));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 173));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 173));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 173));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 173));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 173));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 173));
	}
	
	(
		(
			a2_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Annotation			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDisjointClasses();
				}
				if (a2_0 != null) {
					if (a2_0 != null) {
						addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DISJOINT_CLASSES__AXIOM_ANNOTATIONS, a2_0);
						completedElement(a2_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a2_0, element); 				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 174));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 174));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 174));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 174));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 174));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 174));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 174));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 174));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 174));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 174));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 174));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 174));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 174));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 174));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 174));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 174));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 174));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 174));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 174));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 174));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 174));
	}
	
	(
		a3_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ClassExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDisjointClasses();
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DISJOINT_CLASSES__DISJOINT_CLASS_EXPRESSIONS, a3_0);
					completedElement(a3_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a3_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 175));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 175));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 175));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 175));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 175));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 175));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 175));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 175));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 175));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 175));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 175));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 175));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 175));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 175));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 175));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 175));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 175));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 175));
	}
	
	(
		(
			a4_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ClassExpression			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDisjointClasses();
				}
				if (a4_0 != null) {
					if (a4_0 != null) {
						addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DISJOINT_CLASSES__DISJOINT_CLASS_EXPRESSIONS, a4_0);
						completedElement(a4_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a4_0, element); 				}
			}
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 176));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 176));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 176));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 176));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 176));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 176));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 176));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 176));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 176));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 176));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 176));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 176));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 176));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 176));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 176));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 176));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 176));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 176));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_165, 176));
	}
	
	a5 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDisjointClasses();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 177));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 177));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 177));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 177));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 177));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 177));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 177));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 177));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 177));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 177));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 177));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 177));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 177));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 177));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 177));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 177));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 177));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 177));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 177));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 177));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 177));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 177));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 177));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 177));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 177));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 177));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 177));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 177));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 177));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 177));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 177));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 177));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 177));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 177));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DisjointUnion returns [de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointUnion element = null]
@init{
}
:
	a0 = 'DisjointUnion' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDisjointUnion();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_166, 178));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDisjointUnion();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 179));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 179));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 179));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 179));
	}
	
	(
		(
			a2_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Annotation			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDisjointUnion();
				}
				if (a2_0 != null) {
					if (a2_0 != null) {
						addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DISJOINT_UNION__AXIOM_ANNOTATIONS, a2_0);
						completedElement(a2_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a2_0, element); 				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 180));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 180));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 180));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 180));
	}
	
	(
		a3_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Class		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDisjointUnion();
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DISJOINT_UNION__UNION_CLASS), a3_0);
					completedElement(a3_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a3_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 181));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 181));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 181));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 181));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 181));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 181));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 181));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 181));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 181));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 181));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 181));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 181));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 181));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 181));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 181));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 181));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 181));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 181));
	}
	
	(
		a4_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ClassExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDisjointUnion();
			}
			if (a4_0 != null) {
				if (a4_0 != null) {
					addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DISJOINT_UNION__DISJOINT_CLASS_EXPRESSIONS, a4_0);
					completedElement(a4_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a4_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 182));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 182));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 182));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 182));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 182));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 182));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 182));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 182));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 182));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 182));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 182));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 182));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 182));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 182));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 182));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 182));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 182));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 182));
	}
	
	(
		(
			a5_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ClassExpression			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDisjointUnion();
				}
				if (a5_0 != null) {
					if (a5_0 != null) {
						addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DISJOINT_UNION__DISJOINT_CLASS_EXPRESSIONS, a5_0);
						completedElement(a5_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a5_0, element); 				}
			}
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 183));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 183));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 183));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 183));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 183));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 183));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 183));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 183));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 183));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 183));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 183));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 183));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 183));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 183));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 183));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 183));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 183));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 183));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_167, 183));
	}
	
	a6 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDisjointUnion();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 184));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 184));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 184));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 184));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 184));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 184));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 184));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 184));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 184));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 184));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 184));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 184));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 184));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 184));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 184));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 184));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 184));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 184));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 184));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 184));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 184));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 184));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 184));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 184));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 184));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 184));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 184));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 184));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 184));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 184));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 184));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 184));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 184));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 184));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_SubObjectPropertyOf returns [de.uniko.isweb.emftext.owl2fs.owl2fs.SubObjectPropertyOf element = null]
@init{
}
:
	a0 = 'SubObjectPropertyOf' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createSubObjectPropertyOf();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_168, 185));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createSubObjectPropertyOf();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 186));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 186));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 186));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 186));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 186));
	}
	
	(
		(
			a2_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Annotation			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createSubObjectPropertyOf();
				}
				if (a2_0 != null) {
					if (a2_0 != null) {
						addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.SUB_OBJECT_PROPERTY_OF__AXIOM_ANNOTATIONS, a2_0);
						completedElement(a2_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a2_0, element); 				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 187));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 187));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 187));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 187));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 187));
	}
	
	(
		a3_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectPropertyExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createSubObjectPropertyOf();
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.SUB_OBJECT_PROPERTY_OF__SUB_OBJECT_PROPERTY_EXPRESSIONS), a3_0);
					completedElement(a3_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a3_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 188));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 188));
	}
	
	(
		a4_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectPropertyExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createSubObjectPropertyOf();
			}
			if (a4_0 != null) {
				if (a4_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.SUB_OBJECT_PROPERTY_OF__SUPER_OBJECT_PROPERTY_EXPRESSION), a4_0);
					completedElement(a4_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a4_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_169, 189));
	}
	
	a5 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createSubObjectPropertyOf();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 190));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 190));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 190));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 190));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 190));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 190));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 190));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 190));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 190));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 190));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 190));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 190));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 190));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 190));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 190));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 190));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 190));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 190));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 190));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 190));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 190));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 190));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 190));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 190));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 190));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 190));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 190));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 190));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 190));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 190));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 190));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 190));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 190));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 190));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_EquivalentObjectProperties returns [de.uniko.isweb.emftext.owl2fs.owl2fs.EquivalentObjectProperties element = null]
@init{
}
:
	a0 = 'EquivalentObjectProperties' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createEquivalentObjectProperties();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_170, 191));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createEquivalentObjectProperties();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 192));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 192));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 192));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 192));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 192));
	}
	
	(
		(
			a2_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Annotation			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createEquivalentObjectProperties();
				}
				if (a2_0 != null) {
					if (a2_0 != null) {
						addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.EQUIVALENT_OBJECT_PROPERTIES__AXIOM_ANNOTATIONS, a2_0);
						completedElement(a2_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a2_0, element); 				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 193));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 193));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 193));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 193));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 193));
	}
	
	(
		a3_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectPropertyExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createEquivalentObjectProperties();
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.EQUIVALENT_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSIONS, a3_0);
					completedElement(a3_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a3_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 194));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 194));
	}
	
	(
		(
			a4_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectPropertyExpression			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createEquivalentObjectProperties();
				}
				if (a4_0 != null) {
					if (a4_0 != null) {
						addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.EQUIVALENT_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSIONS, a4_0);
						completedElement(a4_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a4_0, element); 				}
			}
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 195));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 195));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_171, 195));
	}
	
	a5 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createEquivalentObjectProperties();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 196));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 196));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 196));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 196));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 196));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 196));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 196));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 196));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 196));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 196));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 196));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 196));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 196));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 196));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 196));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 196));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 196));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 196));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 196));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 196));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 196));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 196));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 196));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 196));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 196));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 196));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 196));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 196));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 196));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 196));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 196));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 196));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 196));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 196));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DisjointObjectProperties returns [de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointObjectProperties element = null]
@init{
}
:
	a0 = 'DisjointObjectProperties' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDisjointObjectProperties();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_172, 197));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDisjointObjectProperties();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 198));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 198));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 198));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 198));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 198));
	}
	
	(
		(
			a2_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Annotation			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDisjointObjectProperties();
				}
				if (a2_0 != null) {
					if (a2_0 != null) {
						addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DISJOINT_OBJECT_PROPERTIES__AXIOM_ANNOTATIONS, a2_0);
						completedElement(a2_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a2_0, element); 				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 199));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 199));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 199));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 199));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 199));
	}
	
	(
		a3_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectPropertyExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDisjointObjectProperties();
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DISJOINT_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSIONS, a3_0);
					completedElement(a3_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a3_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 200));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 200));
	}
	
	(
		(
			a4_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectPropertyExpression			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDisjointObjectProperties();
				}
				if (a4_0 != null) {
					if (a4_0 != null) {
						addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DISJOINT_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSIONS, a4_0);
						completedElement(a4_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a4_0, element); 				}
			}
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 201));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 201));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_173, 201));
	}
	
	a5 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDisjointObjectProperties();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 202));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 202));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 202));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 202));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 202));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 202));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 202));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 202));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 202));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 202));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 202));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 202));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 202));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 202));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 202));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 202));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 202));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 202));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 202));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 202));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 202));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 202));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 202));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 202));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 202));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 202));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 202));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 202));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 202));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 202));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 202));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 202));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 202));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 202));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectPropertyDomain returns [de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyDomain element = null]
@init{
}
:
	a0 = 'ObjectPropertyDomain' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectPropertyDomain();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_174, 203));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectPropertyDomain();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 204));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 204));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 204));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 204));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 204));
	}
	
	(
		(
			a2_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Annotation			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectPropertyDomain();
				}
				if (a2_0 != null) {
					if (a2_0 != null) {
						addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_DOMAIN__AXIOM_ANNOTATIONS, a2_0);
						completedElement(a2_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a2_0, element); 				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 205));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 205));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 205));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 205));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 205));
	}
	
	(
		a3_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectPropertyExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectPropertyDomain();
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_DOMAIN__OBJECT_PROPERTY_EXPRESSION), a3_0);
					completedElement(a3_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a3_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 206));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 206));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 206));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 206));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 206));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 206));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 206));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 206));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 206));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 206));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 206));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 206));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 206));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 206));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 206));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 206));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 206));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 206));
	}
	
	(
		a4_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ClassExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectPropertyDomain();
			}
			if (a4_0 != null) {
				if (a4_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_DOMAIN__DOMAIN), a4_0);
					completedElement(a4_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a4_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_26, 207));
	}
	
	a5 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectPropertyDomain();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 208));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 208));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 208));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 208));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 208));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 208));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 208));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 208));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 208));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 208));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 208));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 208));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 208));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 208));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 208));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 208));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 208));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 208));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 208));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 208));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 208));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 208));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 208));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 208));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 208));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 208));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 208));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 208));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 208));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 208));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 208));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 208));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 208));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 208));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectPropertyRange returns [de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyRange element = null]
@init{
}
:
	a0 = 'ObjectPropertyRange' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectPropertyRange();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_175, 209));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectPropertyRange();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 210));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 210));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 210));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 210));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 210));
	}
	
	(
		(
			a2_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Annotation			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectPropertyRange();
				}
				if (a2_0 != null) {
					if (a2_0 != null) {
						addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_RANGE__AXIOM_ANNOTATIONS, a2_0);
						completedElement(a2_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a2_0, element); 				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 211));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 211));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 211));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 211));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 211));
	}
	
	(
		a3_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectPropertyExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectPropertyRange();
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_RANGE__OBJECT_PROPERTY_EXPRESSION), a3_0);
					completedElement(a3_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a3_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 212));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 212));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 212));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 212));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 212));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 212));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 212));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 212));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 212));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 212));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 212));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 212));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 212));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 212));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 212));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 212));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 212));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 212));
	}
	
	(
		a4_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ClassExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectPropertyRange();
			}
			if (a4_0 != null) {
				if (a4_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_RANGE__RANGE), a4_0);
					completedElement(a4_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a4_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_27, 213));
	}
	
	a5 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectPropertyRange();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 214));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 214));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 214));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 214));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 214));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 214));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 214));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 214));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 214));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 214));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 214));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 214));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 214));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 214));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 214));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 214));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 214));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 214));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 214));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 214));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 214));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 214));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 214));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 214));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 214));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 214));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 214));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 214));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 214));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 214));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 214));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 214));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 214));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 214));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_InverseObjectProperties returns [de.uniko.isweb.emftext.owl2fs.owl2fs.InverseObjectProperties element = null]
@init{
}
:
	a0 = 'InverseObjectProperties' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createInverseObjectProperties();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_176, 215));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createInverseObjectProperties();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 216));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 216));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 216));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 216));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 216));
	}
	
	(
		(
			a2_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Annotation			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createInverseObjectProperties();
				}
				if (a2_0 != null) {
					if (a2_0 != null) {
						addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.INVERSE_OBJECT_PROPERTIES__AXIOM_ANNOTATIONS, a2_0);
						completedElement(a2_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a2_0, element); 				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 217));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 217));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 217));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 217));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 217));
	}
	
	(
		a3_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectPropertyExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createInverseObjectProperties();
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.INVERSE_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSION1), a3_0);
					completedElement(a3_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a3_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 218));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 218));
	}
	
	(
		a4_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectPropertyExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createInverseObjectProperties();
			}
			if (a4_0 != null) {
				if (a4_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.INVERSE_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSION2), a4_0);
					completedElement(a4_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a4_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_177, 219));
	}
	
	a5 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createInverseObjectProperties();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 220));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 220));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 220));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 220));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 220));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 220));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 220));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 220));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 220));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 220));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 220));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 220));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 220));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 220));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 220));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 220));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 220));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 220));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 220));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 220));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 220));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 220));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 220));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 220));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 220));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 220));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 220));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 220));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 220));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 220));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 220));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 220));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 220));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 220));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_FunctionalObjectProperty returns [de.uniko.isweb.emftext.owl2fs.owl2fs.FunctionalObjectProperty element = null]
@init{
}
:
	a0 = 'FunctionalObjectProperty' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createFunctionalObjectProperty();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_178, 221));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createFunctionalObjectProperty();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 222));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 222));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 222));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 222));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 222));
	}
	
	(
		(
			a2_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Annotation			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createFunctionalObjectProperty();
				}
				if (a2_0 != null) {
					if (a2_0 != null) {
						addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.FUNCTIONAL_OBJECT_PROPERTY__AXIOM_ANNOTATIONS, a2_0);
						completedElement(a2_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a2_0, element); 				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 223));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 223));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 223));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 223));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 223));
	}
	
	(
		a3_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectPropertyExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createFunctionalObjectProperty();
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.FUNCTIONAL_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION), a3_0);
					completedElement(a3_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a3_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_36, 224));
	}
	
	a4 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createFunctionalObjectProperty();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 225));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 225));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 225));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 225));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 225));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 225));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 225));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 225));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 225));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 225));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 225));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 225));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 225));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 225));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 225));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 225));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 225));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 225));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 225));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 225));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 225));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 225));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 225));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 225));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 225));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 225));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 225));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 225));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 225));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 225));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 225));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 225));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 225));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 225));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_InverseFunctionalObjectProperty returns [de.uniko.isweb.emftext.owl2fs.owl2fs.InverseFunctionalObjectProperty element = null]
@init{
}
:
	a0 = 'InverseFunctionalObjectProperty' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createInverseFunctionalObjectProperty();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_179, 226));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createInverseFunctionalObjectProperty();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 227));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 227));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 227));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 227));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 227));
	}
	
	(
		(
			a2_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Annotation			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createInverseFunctionalObjectProperty();
				}
				if (a2_0 != null) {
					if (a2_0 != null) {
						addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.INVERSE_FUNCTIONAL_OBJECT_PROPERTY__AXIOM_ANNOTATIONS, a2_0);
						completedElement(a2_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a2_0, element); 				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 228));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 228));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 228));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 228));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 228));
	}
	
	(
		a3_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectPropertyExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createInverseFunctionalObjectProperty();
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.INVERSE_FUNCTIONAL_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION), a3_0);
					completedElement(a3_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a3_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_37, 229));
	}
	
	a4 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createInverseFunctionalObjectProperty();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 230));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 230));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 230));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 230));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 230));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 230));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 230));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 230));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 230));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 230));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 230));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 230));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 230));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 230));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 230));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 230));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 230));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 230));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 230));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 230));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 230));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 230));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 230));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 230));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 230));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 230));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 230));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 230));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 230));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 230));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 230));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 230));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 230));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 230));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ReflexiveObjectProperty returns [de.uniko.isweb.emftext.owl2fs.owl2fs.ReflexiveObjectProperty element = null]
@init{
}
:
	a0 = 'ReflexiveObjectProperty' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createReflexiveObjectProperty();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_180, 231));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createReflexiveObjectProperty();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 232));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 232));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 232));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 232));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 232));
	}
	
	(
		(
			a2_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Annotation			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createReflexiveObjectProperty();
				}
				if (a2_0 != null) {
					if (a2_0 != null) {
						addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.REFLEXIVE_OBJECT_PROPERTY__AXIOM_ANNOTATIONS, a2_0);
						completedElement(a2_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a2_0, element); 				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 233));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 233));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 233));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 233));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 233));
	}
	
	(
		a3_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectPropertyExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createReflexiveObjectProperty();
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.REFLEXIVE_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION), a3_0);
					completedElement(a3_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a3_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_38, 234));
	}
	
	a4 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createReflexiveObjectProperty();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 235));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 235));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 235));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 235));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 235));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 235));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 235));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 235));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 235));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 235));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 235));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 235));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 235));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 235));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 235));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 235));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 235));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 235));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 235));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 235));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 235));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 235));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 235));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 235));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 235));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 235));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 235));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 235));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 235));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 235));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 235));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 235));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 235));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 235));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_IrreflexiveObjectProperty returns [de.uniko.isweb.emftext.owl2fs.owl2fs.IrreflexiveObjectProperty element = null]
@init{
}
:
	a0 = 'IrreflexiveObjectProperty' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createIrreflexiveObjectProperty();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_181, 236));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createIrreflexiveObjectProperty();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 237));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 237));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 237));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 237));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 237));
	}
	
	(
		(
			a2_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Annotation			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createIrreflexiveObjectProperty();
				}
				if (a2_0 != null) {
					if (a2_0 != null) {
						addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.IRREFLEXIVE_OBJECT_PROPERTY__AXIOM_ANNOTATIONS, a2_0);
						completedElement(a2_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a2_0, element); 				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 238));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 238));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 238));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 238));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 238));
	}
	
	(
		a3_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectPropertyExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createIrreflexiveObjectProperty();
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.IRREFLEXIVE_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION), a3_0);
					completedElement(a3_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a3_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_39, 239));
	}
	
	a4 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createIrreflexiveObjectProperty();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 240));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 240));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 240));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 240));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 240));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 240));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 240));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 240));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 240));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 240));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 240));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 240));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 240));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 240));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 240));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 240));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 240));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 240));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 240));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 240));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 240));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 240));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 240));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 240));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 240));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 240));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 240));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 240));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 240));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 240));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 240));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 240));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 240));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 240));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_SymmetricObjectProperty returns [de.uniko.isweb.emftext.owl2fs.owl2fs.SymmetricObjectProperty element = null]
@init{
}
:
	a0 = 'SymmetricObjectProperty' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createSymmetricObjectProperty();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_182, 241));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createSymmetricObjectProperty();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 242));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 242));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 242));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 242));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 242));
	}
	
	(
		(
			a2_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Annotation			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createSymmetricObjectProperty();
				}
				if (a2_0 != null) {
					if (a2_0 != null) {
						addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.SYMMETRIC_OBJECT_PROPERTY__AXIOM_ANNOTATIONS, a2_0);
						completedElement(a2_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a2_0, element); 				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 243));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 243));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 243));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 243));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 243));
	}
	
	(
		a3_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectPropertyExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createSymmetricObjectProperty();
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.SYMMETRIC_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION), a3_0);
					completedElement(a3_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a3_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_40, 244));
	}
	
	a4 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createSymmetricObjectProperty();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 245));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 245));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 245));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 245));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 245));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 245));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 245));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 245));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 245));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 245));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 245));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 245));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 245));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 245));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 245));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 245));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 245));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 245));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 245));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 245));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 245));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 245));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 245));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 245));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 245));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 245));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 245));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 245));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 245));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 245));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 245));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 245));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 245));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 245));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_AsymmetricObjectProperty returns [de.uniko.isweb.emftext.owl2fs.owl2fs.AsymmetricObjectProperty element = null]
@init{
}
:
	a0 = 'AsymmetricObjectProperty' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createAsymmetricObjectProperty();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_183, 246));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createAsymmetricObjectProperty();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 247));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 247));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 247));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 247));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 247));
	}
	
	(
		(
			a2_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Annotation			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createAsymmetricObjectProperty();
				}
				if (a2_0 != null) {
					if (a2_0 != null) {
						addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ASYMMETRIC_OBJECT_PROPERTY__AXIOM_ANNOTATIONS, a2_0);
						completedElement(a2_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a2_0, element); 				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 248));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 248));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 248));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 248));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 248));
	}
	
	(
		a3_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectPropertyExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createAsymmetricObjectProperty();
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ASYMMETRIC_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION), a3_0);
					completedElement(a3_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a3_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_41, 249));
	}
	
	a4 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createAsymmetricObjectProperty();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 250));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 250));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 250));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 250));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 250));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 250));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 250));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 250));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 250));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 250));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 250));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 250));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 250));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 250));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 250));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 250));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 250));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 250));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 250));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 250));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 250));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 250));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 250));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 250));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 250));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 250));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 250));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 250));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 250));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 250));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 250));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 250));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 250));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 250));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_TransitiveObjectProperty returns [de.uniko.isweb.emftext.owl2fs.owl2fs.TransitiveObjectProperty element = null]
@init{
}
:
	a0 = 'TransitiveObjectProperty' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createTransitiveObjectProperty();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_184, 251));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createTransitiveObjectProperty();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 252));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 252));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 252));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 252));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 252));
	}
	
	(
		(
			a2_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Annotation			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createTransitiveObjectProperty();
				}
				if (a2_0 != null) {
					if (a2_0 != null) {
						addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.TRANSITIVE_OBJECT_PROPERTY__AXIOM_ANNOTATIONS, a2_0);
						completedElement(a2_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a2_0, element); 				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 253));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 253));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 253));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 253));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 253));
	}
	
	(
		a3_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectPropertyExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createTransitiveObjectProperty();
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.TRANSITIVE_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION), a3_0);
					completedElement(a3_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a3_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_42, 254));
	}
	
	a4 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createTransitiveObjectProperty();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 255));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 255));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 255));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 255));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 255));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 255));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 255));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 255));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 255));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 255));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 255));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 255));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 255));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 255));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 255));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 255));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 255));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 255));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 255));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 255));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 255));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 255));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 255));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 255));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 255));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 255));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 255));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 255));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 255));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 255));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 255));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 255));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 255));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 255));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_SubDataPropertyOf returns [de.uniko.isweb.emftext.owl2fs.owl2fs.SubDataPropertyOf element = null]
@init{
}
:
	a0 = 'SubDataPropertyOf' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createSubDataPropertyOf();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_185, 256));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createSubDataPropertyOf();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 257));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 257));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 257));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 257));
	}
	
	(
		(
			a2_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Annotation			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createSubDataPropertyOf();
				}
				if (a2_0 != null) {
					if (a2_0 != null) {
						addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.SUB_DATA_PROPERTY_OF__AXIOM_ANNOTATIONS, a2_0);
						completedElement(a2_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a2_0, element); 				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 258));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 258));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 258));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 258));
	}
	
	(
		a3_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataPropertyExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createSubDataPropertyOf();
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.SUB_DATA_PROPERTY_OF__SUB_DATA_PROPERTY_EXPRESSION), a3_0);
					completedElement(a3_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a3_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 259));
	}
	
	(
		a4_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataPropertyExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createSubDataPropertyOf();
			}
			if (a4_0 != null) {
				if (a4_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.SUB_DATA_PROPERTY_OF__SUPER_DATA_PROPERTY_EXPRESSION), a4_0);
					completedElement(a4_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a4_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_186, 260));
	}
	
	a5 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createSubDataPropertyOf();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 261));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 261));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 261));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 261));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 261));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 261));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 261));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 261));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 261));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 261));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 261));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 261));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 261));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 261));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 261));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 261));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 261));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 261));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 261));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 261));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 261));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 261));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 261));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 261));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 261));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 261));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 261));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 261));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 261));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 261));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 261));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 261));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 261));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 261));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_EquivalentDataProperties returns [de.uniko.isweb.emftext.owl2fs.owl2fs.EquivalentDataProperties element = null]
@init{
}
:
	a0 = 'EquivalentDataProperties' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createEquivalentDataProperties();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_187, 262));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createEquivalentDataProperties();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 263));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 263));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 263));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 263));
	}
	
	(
		(
			a2_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Annotation			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createEquivalentDataProperties();
				}
				if (a2_0 != null) {
					if (a2_0 != null) {
						addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.EQUIVALENT_DATA_PROPERTIES__AXIOM_ANNOTATIONS, a2_0);
						completedElement(a2_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a2_0, element); 				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 264));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 264));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 264));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 264));
	}
	
	(
		a3_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataPropertyExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createEquivalentDataProperties();
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.EQUIVALENT_DATA_PROPERTIES__DATA_PROPERTY_EXPRESSIONS, a3_0);
					completedElement(a3_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a3_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 265));
	}
	
	(
		(
			a4_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataPropertyExpression			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createEquivalentDataProperties();
				}
				if (a4_0 != null) {
					if (a4_0 != null) {
						addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.EQUIVALENT_DATA_PROPERTIES__DATA_PROPERTY_EXPRESSIONS, a4_0);
						completedElement(a4_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a4_0, element); 				}
			}
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 266));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_188, 266));
	}
	
	a5 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createEquivalentDataProperties();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 267));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 267));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 267));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 267));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 267));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 267));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 267));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 267));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 267));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 267));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 267));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 267));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 267));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 267));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 267));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 267));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 267));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 267));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 267));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 267));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 267));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 267));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 267));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 267));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 267));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 267));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 267));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 267));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 267));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 267));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 267));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 267));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 267));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 267));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DisjointDataProperties returns [de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointDataProperties element = null]
@init{
}
:
	a0 = 'DisjointDataProperties' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDisjointDataProperties();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_189, 268));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDisjointDataProperties();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 269));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 269));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 269));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 269));
	}
	
	(
		(
			a2_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Annotation			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDisjointDataProperties();
				}
				if (a2_0 != null) {
					if (a2_0 != null) {
						addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DISJOINT_DATA_PROPERTIES__AXIOM_ANNOTATIONS, a2_0);
						completedElement(a2_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a2_0, element); 				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 270));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 270));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 270));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 270));
	}
	
	(
		a3_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataPropertyExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDisjointDataProperties();
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DISJOINT_DATA_PROPERTIES__DATA_PROPERTY_EXPRESSIONS, a3_0);
					completedElement(a3_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a3_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 271));
	}
	
	(
		(
			a4_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataPropertyExpression			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDisjointDataProperties();
				}
				if (a4_0 != null) {
					if (a4_0 != null) {
						addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DISJOINT_DATA_PROPERTIES__DATA_PROPERTY_EXPRESSIONS, a4_0);
						completedElement(a4_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a4_0, element); 				}
			}
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 272));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_190, 272));
	}
	
	a5 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDisjointDataProperties();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 273));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 273));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 273));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 273));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 273));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 273));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 273));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 273));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 273));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 273));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 273));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 273));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 273));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 273));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 273));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 273));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 273));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 273));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 273));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 273));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 273));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 273));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 273));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 273));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 273));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 273));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 273));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 273));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 273));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 273));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 273));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 273));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 273));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 273));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataPropertyDomain returns [de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyDomain element = null]
@init{
}
:
	a0 = 'DataPropertyDomain' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataPropertyDomain();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_191, 274));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataPropertyDomain();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 275));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 275));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 275));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 275));
	}
	
	(
		(
			a2_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Annotation			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataPropertyDomain();
				}
				if (a2_0 != null) {
					if (a2_0 != null) {
						addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_PROPERTY_DOMAIN__AXIOM_ANNOTATIONS, a2_0);
						completedElement(a2_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a2_0, element); 				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 276));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 276));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 276));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 276));
	}
	
	(
		a3_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataPropertyExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataPropertyDomain();
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_PROPERTY_DOMAIN__DATA_PROPERTY_EXPRESSION), a3_0);
					completedElement(a3_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a3_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 277));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 277));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 277));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 277));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 277));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 277));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 277));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 277));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 277));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 277));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 277));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 277));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 277));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 277));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 277));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 277));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 277));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 277));
	}
	
	(
		a4_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ClassExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataPropertyDomain();
			}
			if (a4_0 != null) {
				if (a4_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_PROPERTY_DOMAIN__DOMAIN), a4_0);
					completedElement(a4_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a4_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_28, 278));
	}
	
	a5 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataPropertyDomain();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 279));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 279));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 279));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 279));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 279));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 279));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 279));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 279));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 279));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 279));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 279));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 279));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 279));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 279));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 279));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 279));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 279));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 279));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 279));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 279));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 279));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 279));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 279));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 279));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 279));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 279));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 279));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 279));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 279));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 279));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 279));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 279));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 279));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 279));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataPropertyRange returns [de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyRange element = null]
@init{
}
:
	a0 = 'DataPropertyRange' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataPropertyRange();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_192, 280));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataPropertyRange();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 281));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 281));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 281));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 281));
	}
	
	(
		(
			a2_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Annotation			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataPropertyRange();
				}
				if (a2_0 != null) {
					if (a2_0 != null) {
						addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_PROPERTY_RANGE__AXIOM_ANNOTATIONS, a2_0);
						completedElement(a2_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a2_0, element); 				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 282));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 282));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 282));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 282));
	}
	
	(
		a3_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataPropertyExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataPropertyRange();
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_PROPERTY_RANGE__DATA_PROPERTY_EXPRESSION), a3_0);
					completedElement(a3_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a3_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_43, 283));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_44, 283));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_45, 283));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_46, 283));
	}
	
	(
		a4_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataRange		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataPropertyRange();
			}
			if (a4_0 != null) {
				if (a4_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_PROPERTY_RANGE__RANGE), a4_0);
					completedElement(a4_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a4_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_126, 284));
	}
	
	a5 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataPropertyRange();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 285));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 285));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 285));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 285));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 285));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 285));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 285));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 285));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 285));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 285));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 285));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 285));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 285));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 285));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 285));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 285));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 285));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 285));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 285));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 285));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 285));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 285));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 285));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 285));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 285));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 285));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 285));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 285));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 285));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 285));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 285));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 285));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 285));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 285));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_FunctionalDataProperty returns [de.uniko.isweb.emftext.owl2fs.owl2fs.FunctionalDataProperty element = null]
@init{
}
:
	a0 = 'FunctionalDataProperty' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createFunctionalDataProperty();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_193, 286));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createFunctionalDataProperty();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 287));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 287));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 287));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 287));
	}
	
	(
		(
			a2_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Annotation			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createFunctionalDataProperty();
				}
				if (a2_0 != null) {
					if (a2_0 != null) {
						addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.FUNCTIONAL_DATA_PROPERTY__AXIOM_ANNOTATIONS, a2_0);
						completedElement(a2_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a2_0, element); 				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 288));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 288));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 288));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 288));
	}
	
	(
		a3_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataPropertyExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createFunctionalDataProperty();
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.FUNCTIONAL_DATA_PROPERTY__DATA_PROPERTY_EXPRESSION), a3_0);
					completedElement(a3_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a3_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_51, 289));
	}
	
	a4 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createFunctionalDataProperty();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 290));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 290));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 290));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 290));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 290));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 290));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 290));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 290));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 290));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 290));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 290));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 290));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 290));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 290));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 290));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 290));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 290));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 290));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 290));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 290));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 290));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 290));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 290));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 290));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 290));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 290));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 290));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 290));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 290));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 290));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 290));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 290));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 290));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 290));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_KeyFor returns [de.uniko.isweb.emftext.owl2fs.owl2fs.KeyFor element = null]
@init{
}
:
	a0 = 'KeyFor' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createKeyFor();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_194, 291));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createKeyFor();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 292));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 292));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 292));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 292));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 292));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 292));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 292));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 292));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 292));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 292));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 292));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 292));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 292));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 292));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 292));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 292));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 292));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 292));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 292));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 292));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 292));
	}
	
	(
		(
			a2_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Annotation			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createKeyFor();
				}
				if (a2_0 != null) {
					if (a2_0 != null) {
						addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.KEY_FOR__AXIOM_ANNOTATIONS, a2_0);
						completedElement(a2_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a2_0, element); 				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 293));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 293));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 293));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 293));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 293));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 293));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 293));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 293));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 293));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 293));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 293));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 293));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 293));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 293));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 293));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 293));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 293));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 293));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 293));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 293));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 293));
	}
	
	(
		a3_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ClassExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createKeyFor();
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.KEY_FOR__CLASS_EXPRESSION), a3_0);
					completedElement(a3_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a3_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_29, 294));
	}
	
	a4 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createKeyFor();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 295));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 295));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_127, 295));
	}
	
	(
		(
			a5_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectPropertyExpression			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createKeyFor();
				}
				if (a5_0 != null) {
					if (a5_0 != null) {
						addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.KEY_FOR__OBJECT_PROPERTY_EXPRESSIONS, a5_0);
						completedElement(a5_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a5_0, element); 				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 296));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 296));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_127, 296));
	}
	
	a6 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createKeyFor();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_195, 297));
	}
	
	a7 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createKeyFor();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 298));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_128, 298));
	}
	
	(
		(
			a8_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataPropertyExpression			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createKeyFor();
				}
				if (a8_0 != null) {
					if (a8_0 != null) {
						addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.KEY_FOR__DATA_PROPERTY_EXPRESSIONS, a8_0);
						completedElement(a8_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a8_0, element); 				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 299));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_128, 299));
	}
	
	a9 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createKeyFor();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a9, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_196, 300));
	}
	
	a10 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createKeyFor();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a10, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 301));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 301));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 301));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 301));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 301));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 301));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 301));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 301));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 301));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 301));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 301));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 301));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 301));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 301));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 301));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 301));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 301));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 301));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 301));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 301));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 301));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 301));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 301));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 301));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 301));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 301));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 301));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 301));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 301));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 301));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 301));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 301));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 301));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 301));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_SameIndividual returns [de.uniko.isweb.emftext.owl2fs.owl2fs.SameIndividual element = null]
@init{
}
:
	a0 = 'SameIndividual' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createSameIndividual();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_197, 302));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createSameIndividual();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 303));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 303));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 303));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 303));
	}
	
	(
		(
			a2_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Annotation			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createSameIndividual();
				}
				if (a2_0 != null) {
					if (a2_0 != null) {
						addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.SAME_INDIVIDUAL__AXIOM_ANNOTATIONS, a2_0);
						completedElement(a2_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a2_0, element); 				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 304));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 304));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 304));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 304));
	}
	
	(
		a3_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_NamedIndividual		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createSameIndividual();
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.SAME_INDIVIDUAL__SAME_INDIVIDUALS, a3_0);
					completedElement(a3_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a3_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 305));
	}
	
	(
		(
			a4_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_NamedIndividual			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createSameIndividual();
				}
				if (a4_0 != null) {
					if (a4_0 != null) {
						addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.SAME_INDIVIDUAL__SAME_INDIVIDUALS, a4_0);
						completedElement(a4_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a4_0, element); 				}
			}
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 306));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_198, 306));
	}
	
	a5 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createSameIndividual();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 307));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 307));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 307));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 307));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 307));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 307));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 307));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 307));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 307));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 307));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 307));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 307));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 307));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 307));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 307));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 307));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 307));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 307));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 307));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 307));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 307));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 307));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 307));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 307));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 307));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 307));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 307));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 307));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 307));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 307));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 307));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 307));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 307));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 307));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DifferentIndividuals returns [de.uniko.isweb.emftext.owl2fs.owl2fs.DifferentIndividuals element = null]
@init{
}
:
	a0 = 'DifferentIndividuals' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDifferentIndividuals();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_199, 308));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDifferentIndividuals();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 309));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 309));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 309));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 309));
	}
	
	(
		(
			a2_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Annotation			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDifferentIndividuals();
				}
				if (a2_0 != null) {
					if (a2_0 != null) {
						addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DIFFERENT_INDIVIDUALS__AXIOM_ANNOTATIONS, a2_0);
						completedElement(a2_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a2_0, element); 				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 310));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 310));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 310));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 310));
	}
	
	(
		a3_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_NamedIndividual		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDifferentIndividuals();
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DIFFERENT_INDIVIDUALS__DIFFERENT_INDIVIDUALS, a3_0);
					completedElement(a3_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a3_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 311));
	}
	
	(
		(
			a4_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_NamedIndividual			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDifferentIndividuals();
				}
				if (a4_0 != null) {
					if (a4_0 != null) {
						addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DIFFERENT_INDIVIDUALS__DIFFERENT_INDIVIDUALS, a4_0);
						completedElement(a4_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a4_0, element); 				}
			}
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 312));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_200, 312));
	}
	
	a5 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDifferentIndividuals();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 313));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 313));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 313));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 313));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 313));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 313));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 313));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 313));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 313));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 313));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 313));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 313));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 313));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 313));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 313));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 313));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 313));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 313));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 313));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 313));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 313));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 313));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 313));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 313));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 313));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 313));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 313));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 313));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 313));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 313));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 313));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 313));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 313));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 313));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ClassAssertion returns [de.uniko.isweb.emftext.owl2fs.owl2fs.ClassAssertion element = null]
@init{
}
:
	a0 = 'ClassAssertion' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createClassAssertion();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_201, 314));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createClassAssertion();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 315));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 315));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 315));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 315));
	}
	
	(
		(
			a2_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Annotation			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createClassAssertion();
				}
				if (a2_0 != null) {
					if (a2_0 != null) {
						addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.CLASS_ASSERTION__AXIOM_ANNOTATIONS, a2_0);
						completedElement(a2_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a2_0, element); 				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 316));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 316));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 316));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 316));
	}
	
	(
		a3_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_NamedIndividual		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createClassAssertion();
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.CLASS_ASSERTION__INDIVIDUAL), a3_0);
					completedElement(a3_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a3_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 317));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 317));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 317));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 317));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 317));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 317));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 317));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 317));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 317));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 317));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 317));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 317));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 317));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 317));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 317));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 317));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 317));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 317));
	}
	
	(
		a4_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ClassExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createClassAssertion();
			}
			if (a4_0 != null) {
				if (a4_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.CLASS_ASSERTION__CLASS_EXPRESSION), a4_0);
					completedElement(a4_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a4_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_30, 318));
	}
	
	a5 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createClassAssertion();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 319));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 319));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 319));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 319));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 319));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 319));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 319));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 319));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 319));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 319));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 319));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 319));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 319));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 319));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 319));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 319));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 319));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 319));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 319));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 319));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 319));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 319));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 319));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 319));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 319));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 319));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 319));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 319));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 319));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 319));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 319));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 319));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 319));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 319));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectPropertyAssertion returns [de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyAssertion element = null]
@init{
}
:
	a0 = 'ObjectPropertyAssertion' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectPropertyAssertion();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_202, 320));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectPropertyAssertion();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 321));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 321));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 321));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 321));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 321));
	}
	
	(
		(
			a2_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Annotation			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectPropertyAssertion();
				}
				if (a2_0 != null) {
					if (a2_0 != null) {
						addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_ASSERTION__AXIOM_ANNOTATIONS, a2_0);
						completedElement(a2_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a2_0, element); 				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 322));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 322));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 322));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 322));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 322));
	}
	
	(
		a3_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectPropertyExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectPropertyAssertion();
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION), a3_0);
					completedElement(a3_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a3_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 323));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_33, 323));
	}
	
	(
		a4_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Individual		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectPropertyAssertion();
			}
			if (a4_0 != null) {
				if (a4_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL), a4_0);
					completedElement(a4_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a4_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 324));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_33, 324));
	}
	
	(
		a5_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Individual		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectPropertyAssertion();
			}
			if (a5_0 != null) {
				if (a5_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL), a5_0);
					completedElement(a5_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a5_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_203, 325));
	}
	
	a6 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createObjectPropertyAssertion();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 326));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 326));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 326));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 326));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 326));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 326));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 326));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 326));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 326));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 326));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 326));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 326));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 326));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 326));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 326));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 326));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 326));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 326));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 326));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 326));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 326));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 326));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 326));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 326));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 326));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 326));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 326));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 326));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 326));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 326));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 326));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 326));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 326));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 326));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_NegativeObjectPropertyAssertion returns [de.uniko.isweb.emftext.owl2fs.owl2fs.NegativeObjectPropertyAssertion element = null]
@init{
}
:
	a0 = 'NegativeObjectPropertyAssertion' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createNegativeObjectPropertyAssertion();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_204, 327));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createNegativeObjectPropertyAssertion();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 328));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 328));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 328));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 328));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 328));
	}
	
	(
		(
			a2_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Annotation			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createNegativeObjectPropertyAssertion();
				}
				if (a2_0 != null) {
					if (a2_0 != null) {
						addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__AXIOM_ANNOTATIONS, a2_0);
						completedElement(a2_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a2_0, element); 				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 329));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 329));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 329));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 329));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 329));
	}
	
	(
		a3_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectPropertyExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createNegativeObjectPropertyAssertion();
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION), a3_0);
					completedElement(a3_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a3_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 330));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_33, 330));
	}
	
	(
		a4_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Individual		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createNegativeObjectPropertyAssertion();
			}
			if (a4_0 != null) {
				if (a4_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL), a4_0);
					completedElement(a4_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a4_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 331));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_33, 331));
	}
	
	(
		a5_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Individual		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createNegativeObjectPropertyAssertion();
			}
			if (a5_0 != null) {
				if (a5_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.NEGATIVE_OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL), a5_0);
					completedElement(a5_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a5_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_205, 332));
	}
	
	a6 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createNegativeObjectPropertyAssertion();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 333));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 333));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 333));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 333));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 333));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 333));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 333));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 333));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 333));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 333));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 333));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 333));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 333));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 333));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 333));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 333));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 333));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 333));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 333));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 333));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 333));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 333));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 333));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 333));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 333));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 333));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 333));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 333));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 333));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 333));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 333));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 333));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 333));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 333));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataPropertyAssertion returns [de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyAssertion element = null]
@init{
}
:
	a0 = 'DataPropertyAssertion' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataPropertyAssertion();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_206, 334));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataPropertyAssertion();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 335));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 335));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 335));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 335));
	}
	
	(
		(
			a2_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Annotation			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataPropertyAssertion();
				}
				if (a2_0 != null) {
					if (a2_0 != null) {
						addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_PROPERTY_ASSERTION__AXIOM_ANNOTATIONS, a2_0);
						completedElement(a2_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a2_0, element); 				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 336));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 336));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 336));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 336));
	}
	
	(
		a3_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataPropertyExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataPropertyAssertion();
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION), a3_0);
					completedElement(a3_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a3_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 337));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_33, 337));
	}
	
	(
		a4_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Individual		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataPropertyAssertion();
			}
			if (a4_0 != null) {
				if (a4_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL), a4_0);
					completedElement(a4_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a4_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_47, 338));
	}
	
	(
		a5_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Literal		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataPropertyAssertion();
			}
			if (a5_0 != null) {
				if (a5_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_PROPERTY_ASSERTION__TARGET_VALUE), a5_0);
					completedElement(a5_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a5_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_121, 339));
	}
	
	a6 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDataPropertyAssertion();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 340));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 340));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 340));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 340));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 340));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 340));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 340));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 340));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 340));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 340));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 340));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 340));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 340));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 340));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 340));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 340));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 340));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 340));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 340));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 340));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 340));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 340));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 340));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 340));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 340));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 340));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 340));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 340));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 340));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 340));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 340));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 340));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 340));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 340));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_NegativeDataPropertyAssertion returns [de.uniko.isweb.emftext.owl2fs.owl2fs.NegativeDataPropertyAssertion element = null]
@init{
}
:
	a0 = 'NegativeDataPropertyAssertion' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createNegativeDataPropertyAssertion();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_207, 341));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createNegativeDataPropertyAssertion();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 342));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 342));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 342));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 342));
	}
	
	(
		(
			a2_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Annotation			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createNegativeDataPropertyAssertion();
				}
				if (a2_0 != null) {
					if (a2_0 != null) {
						addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__AXIOM_ANNOTATIONS, a2_0);
						completedElement(a2_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a2_0, element); 				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 343));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 343));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 343));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 343));
	}
	
	(
		a3_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataPropertyExpression		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createNegativeDataPropertyAssertion();
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION), a3_0);
					completedElement(a3_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a3_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 344));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_33, 344));
	}
	
	(
		a4_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Individual		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createNegativeDataPropertyAssertion();
			}
			if (a4_0 != null) {
				if (a4_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL), a4_0);
					completedElement(a4_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a4_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_47, 345));
	}
	
	(
		a5_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Literal		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createNegativeDataPropertyAssertion();
			}
			if (a5_0 != null) {
				if (a5_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.NEGATIVE_DATA_PROPERTY_ASSERTION__TARGET_VALUE), a5_0);
					completedElement(a5_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a5_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_122, 346));
	}
	
	a6 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createNegativeDataPropertyAssertion();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 347));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 347));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 347));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 347));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 347));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 347));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 347));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 347));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 347));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 347));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 347));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 347));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 347));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 347));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 347));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 347));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 347));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 347));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 347));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 347));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 347));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 347));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 347));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 347));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 347));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 347));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 347));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 347));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 347));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 347));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 347));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 347));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 347));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 347));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Annotation returns [de.uniko.isweb.emftext.owl2fs.owl2fs.Annotation element = null]
@init{
}
:
	(
		a0 = 'Annotation' {
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createAnnotation();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_208, 348));
		}
		
		
		|		a1 = 'Comment' {
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createAnnotation();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_208, 349));
		}
		
		
		|		a2 = 'Label' {
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createAnnotation();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_208, 350));
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_208, 351));
	}
	
	a3 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createAnnotation();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 352));
	}
	
	(
		(
			a4_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_AnnotationProperty			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createAnnotation();
				}
				if (a4_0 != null) {
					if (a4_0 != null) {
						element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ANNOTATION__ANNOTATION_PROPERTY), a4_0);
						completedElement(a4_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a4_0, element); 				}
			}
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 353));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_53, 353));
	}
	
	a5 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createAnnotation();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_110, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_111, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_112, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_113, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_114, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 354));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_209, 354));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_AnnotationProperty returns [de.uniko.isweb.emftext.owl2fs.owl2fs.AnnotationProperty element = null]
@init{
}
:
	(
		(
			a0_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_URI			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createAnnotationProperty();
				}
				if (a0_0 != null) {
					if (a0_0 != null) {
						element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ANNOTATION_PROPERTY__ENTITY_URI), a0_0);
						completedElement(a0_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a0_0, element); 				}
			}
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 355));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_2, 355));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_53, 355));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_31, 355));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_EntityAnnotation returns [de.uniko.isweb.emftext.owl2fs.owl2fs.EntityAnnotation element = null]
@init{
}
:
	a0 = 'EntityAnnotation' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createEntityAnnotation();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_210, 356));
	}
	
	a1 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createEntityAnnotation();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_211, 357));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_212, 357));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_213, 357));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_214, 357));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_215, 357));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_216, 357));
	}
	
	(
		a2 = 'AnnotationProperty' {
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createEntityAnnotation();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a2, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_217, 358));
		}
		
		
		|		a3 = 'Datatype' {
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createEntityAnnotation();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a3, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_217, 359));
		}
		
		
		|		a4 = 'ObjectProperty' {
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createEntityAnnotation();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_217, 360));
		}
		
		
		|		a5 = 'Class' {
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createEntityAnnotation();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a5, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_217, 361));
		}
		
		
		|		a6 = 'NamedIndividual' {
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createEntityAnnotation();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a6, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_217, 362));
		}
		
		
		|		a7 = 'DataProperty' {
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createEntityAnnotation();
			}
			collectHiddenTokens(element);
			copyLocalizationInfos((org.antlr.runtime.CommonToken)a7, element);
		}
		{
			// expected elements (follow set)
			addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_217, 363));
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_217, 364));
	}
	
	a8 = '(' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createEntityAnnotation();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a8, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 365));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_43, 365));
	}
	
	(
		a9_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Entity		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createEntityAnnotation();
			}
			if (a9_0 != null) {
				if (a9_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ENTITY_ANNOTATION__ENTITY), a9_0);
					completedElement(a9_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a9_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_31, 366));
	}
	
	a10 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createEntityAnnotation();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a10, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 367));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 367));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 367));
	}
	
	(
		(
			a11_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Annotation			{
				if (terminateParsing) {
					throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
				}
				if (element == null) {
					element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createEntityAnnotation();
				}
				if (a11_0 != null) {
					if (a11_0 != null) {
						addObjectToList(element, de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.ENTITY_ANNOTATION__ENTITY_ANNOTATIONS, a11_0);
						completedElement(a11_0);
					}
					collectHiddenTokens(element);
					copyLocalizationInfos(a11_0, element); 				}
			}
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 368));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 368));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 368));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_209, 368));
	}
	
	a12 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createEntityAnnotation();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a12, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 369));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 369));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 369));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 369));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 369));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 369));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 369));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 369));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 369));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 369));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 369));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 369));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 369));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 369));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 369));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 369));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 369));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 369));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 369));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 369));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 369));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 369));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 369));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 369));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 369));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 369));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 369));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 369));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 369));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 369));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 369));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 369));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 369));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 369));
	}
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Axiom returns [de.uniko.isweb.emftext.owl2fs.owl2fs.Axiom element = null]
:
	c0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Declaration{ element = c0; /* this is a subclass choice */ }
	|	c1 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_SubClassOf{ element = c1; /* this is a subclass choice */ }
	|	c2 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_EquivalentClasses{ element = c2; /* this is a subclass choice */ }
	|	c3 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DisjointClasses{ element = c3; /* this is a subclass choice */ }
	|	c4 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DisjointUnion{ element = c4; /* this is a subclass choice */ }
	|	c5 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_SubObjectPropertyOf{ element = c5; /* this is a subclass choice */ }
	|	c6 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_EquivalentObjectProperties{ element = c6; /* this is a subclass choice */ }
	|	c7 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DisjointObjectProperties{ element = c7; /* this is a subclass choice */ }
	|	c8 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectPropertyDomain{ element = c8; /* this is a subclass choice */ }
	|	c9 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectPropertyRange{ element = c9; /* this is a subclass choice */ }
	|	c10 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_InverseObjectProperties{ element = c10; /* this is a subclass choice */ }
	|	c11 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_FunctionalObjectProperty{ element = c11; /* this is a subclass choice */ }
	|	c12 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_InverseFunctionalObjectProperty{ element = c12; /* this is a subclass choice */ }
	|	c13 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ReflexiveObjectProperty{ element = c13; /* this is a subclass choice */ }
	|	c14 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_IrreflexiveObjectProperty{ element = c14; /* this is a subclass choice */ }
	|	c15 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_SymmetricObjectProperty{ element = c15; /* this is a subclass choice */ }
	|	c16 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_AsymmetricObjectProperty{ element = c16; /* this is a subclass choice */ }
	|	c17 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_TransitiveObjectProperty{ element = c17; /* this is a subclass choice */ }
	|	c18 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_SubDataPropertyOf{ element = c18; /* this is a subclass choice */ }
	|	c19 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_EquivalentDataProperties{ element = c19; /* this is a subclass choice */ }
	|	c20 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DisjointDataProperties{ element = c20; /* this is a subclass choice */ }
	|	c21 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataPropertyDomain{ element = c21; /* this is a subclass choice */ }
	|	c22 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataPropertyRange{ element = c22; /* this is a subclass choice */ }
	|	c23 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_FunctionalDataProperty{ element = c23; /* this is a subclass choice */ }
	|	c24 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_KeyFor{ element = c24; /* this is a subclass choice */ }
	|	c25 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_SameIndividual{ element = c25; /* this is a subclass choice */ }
	|	c26 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DifferentIndividuals{ element = c26; /* this is a subclass choice */ }
	|	c27 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ClassAssertion{ element = c27; /* this is a subclass choice */ }
	|	c28 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectPropertyAssertion{ element = c28; /* this is a subclass choice */ }
	|	c29 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_NegativeObjectPropertyAssertion{ element = c29; /* this is a subclass choice */ }
	|	c30 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataPropertyAssertion{ element = c30; /* this is a subclass choice */ }
	|	c31 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_NegativeDataPropertyAssertion{ element = c31; /* this is a subclass choice */ }
	|	c32 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_EntityAnnotation{ element = c32; /* this is a subclass choice */ }
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Entity returns [de.uniko.isweb.emftext.owl2fs.owl2fs.Entity element = null]
:
	c0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Class{ element = c0; /* this is a subclass choice */ }
	|	c1 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Datatype{ element = c1; /* this is a subclass choice */ }
	|	c2 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectProperty{ element = c2; /* this is a subclass choice */ }
	|	c3 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataProperty{ element = c3; /* this is a subclass choice */ }
	|	c4 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_NamedIndividual{ element = c4; /* this is a subclass choice */ }
	|	c5 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_AnnotationProperty{ element = c5; /* this is a subclass choice */ }
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataRange returns [de.uniko.isweb.emftext.owl2fs.owl2fs.DataRange element = null]
:
	c0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Datatype{ element = c0; /* this is a subclass choice */ }
	|	c1 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataComplementOf{ element = c1; /* this is a subclass choice */ }
	|	c2 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataOneOf{ element = c2; /* this is a subclass choice */ }
	|	c3 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DatatypeRestriction{ element = c3; /* this is a subclass choice */ }
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ClassExpression returns [de.uniko.isweb.emftext.owl2fs.owl2fs.ClassExpression element = null]
:
	c0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Class{ element = c0; /* this is a subclass choice */ }
	|	c1 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectIntersectionOf{ element = c1; /* this is a subclass choice */ }
	|	c2 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectUnionOf{ element = c2; /* this is a subclass choice */ }
	|	c3 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectComplementOf{ element = c3; /* this is a subclass choice */ }
	|	c4 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectOneOf{ element = c4; /* this is a subclass choice */ }
	|	c5 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectSomeValuesFrom{ element = c5; /* this is a subclass choice */ }
	|	c6 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectAllValuesFrom{ element = c6; /* this is a subclass choice */ }
	|	c7 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectHasValue{ element = c7; /* this is a subclass choice */ }
	|	c8 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectExistsSelf{ element = c8; /* this is a subclass choice */ }
	|	c9 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectMinCardinality{ element = c9; /* this is a subclass choice */ }
	|	c10 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectMaxCardinality{ element = c10; /* this is a subclass choice */ }
	|	c11 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectExactCardinality{ element = c11; /* this is a subclass choice */ }
	|	c12 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataSomeValuesFrom{ element = c12; /* this is a subclass choice */ }
	|	c13 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataAllValuesFrom{ element = c13; /* this is a subclass choice */ }
	|	c14 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataHasValue{ element = c14; /* this is a subclass choice */ }
	|	c15 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataMinCardinality{ element = c15; /* this is a subclass choice */ }
	|	c16 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataMaxCardinality{ element = c16; /* this is a subclass choice */ }
	|	c17 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataExactCardinality{ element = c17; /* this is a subclass choice */ }
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Individual returns [de.uniko.isweb.emftext.owl2fs.owl2fs.Individual element = null]
:
	c0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_NamedIndividual{ element = c0; /* this is a subclass choice */ }
	|	c1 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_AnonymousIndividual{ element = c1; /* this is a subclass choice */ }
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectPropertyExpression returns [de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyExpression element = null]
:
	c0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_ObjectProperty{ element = c0; /* this is a subclass choice */ }
	|	c1 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_InverseObjectProperty{ element = c1; /* this is a subclass choice */ }
	
;

parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataPropertyExpression returns [de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyExpression element = null]
:
	c0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_DataProperty{ element = c0; /* this is a subclass choice */ }
	
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
	('-')?(('1'..'9') ('0'..'9')* | '0') '.' ('0'..'9')+ 	{ _channel = 99; }
;
LITERAL:
	('"')('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-')+('"')
;
NODE:
	('_')(':')('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-')+;
DIRTYIRI:
	(('A'..'Z' | 'a'..'z' | '0'..'9' | '-' | '_' | '"' | '^' | '<' | '>' | '@' | ':' | '/' )+ | ('"')('A'..'Z' | 'a'..'z' | '0'..'9' | '-' | '_' | '<' | '>' | '@' | ':' | '/' | ',' | '.' | ' ' | '(' | ')' )+('"'))
;
FULLIRI:
	'<' (~( '^' | '<' | '>' | '"' | '{' | '}' | '`' | '\\' | '\u0000'..'\u0020' ))* '>';
QUOTED_34_34:
	('"')(~('"'))*('"')
;

