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
		int followSetID = 362;
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
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_110 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_111 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.eINSTANCE.getFacetConstantPair().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.FACET_CONSTANT_PAIR__FACET), "DIRTYIRI");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_112 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_113 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_114 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_115 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_116 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_117 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_118 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_119 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_120 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_121 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_122 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_123 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("^^");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_124 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_125 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_126 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_127 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_128 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_129 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_130 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_131 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_132 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_133 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_134 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_135 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_136 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_137 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_138 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_139 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.eINSTANCE.getObjectMinCardinality().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_MIN_CARDINALITY__CARDINALITY), "INTEGER");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_140 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_141 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.eINSTANCE.getObjectMaxCardinality().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_MAX_CARDINALITY__CARDINALITY), "INTEGER");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_142 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_143 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.eINSTANCE.getObjectExactCardinality().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.OBJECT_EXACT_CARDINALITY__CARDINALITY), "INTEGER");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_144 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_145 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_146 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_147 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_148 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.eINSTANCE.getDataMinCardinality().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_MIN_CARDINALITY__CARDINALITY), "INTEGER");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_149 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_150 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.eINSTANCE.getDataMaxCardinality().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_MAX_CARDINALITY__CARDINALITY), "INTEGER");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_151 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_152 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.eINSTANCE.getDataExactCardinality().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DATA_EXACT_CARDINALITY__CARDINALITY), "INTEGER");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_153 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_154 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_155 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_156 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_157 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_158 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_159 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_160 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_161 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_162 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_163 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_164 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_165 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_166 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_167 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_168 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_169 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_170 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_171 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_172 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_173 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_174 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_175 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_176 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_177 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_178 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_179 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_180 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_181 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_182 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_183 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_184 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_185 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_186 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_187 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_188 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_189 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_190 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_191 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_192 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_193 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_194 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_195 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_196 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_197 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_198 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_199 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_200 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_201 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_202 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString(")");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_203 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_204 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("AnnotationProperty");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_205 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("Datatype");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_206 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("ObjectProperty");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_207 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("Class");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_208 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("NamedIndividual");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_209 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("DataProperty");
	private final static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsExpectedElement TERMINAL_210 = new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedCsString("(");
	
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
		TERMINAL_109.addFollower(TERMINAL_1);
		TERMINAL_109.addFollower(TERMINAL_43);
		TERMINAL_2.addFollower(TERMINAL_73);
		TERMINAL_2.addFollower(TERMINAL_74);
		TERMINAL_2.addFollower(TERMINAL_75);
		TERMINAL_2.addFollower(TERMINAL_76);
		TERMINAL_2.addFollower(TERMINAL_77);
		TERMINAL_2.addFollower(TERMINAL_78);
		TERMINAL_2.addFollower(TERMINAL_79);
		TERMINAL_2.addFollower(TERMINAL_80);
		TERMINAL_2.addFollower(TERMINAL_81);
		TERMINAL_2.addFollower(TERMINAL_82);
		TERMINAL_2.addFollower(TERMINAL_83);
		TERMINAL_2.addFollower(TERMINAL_84);
		TERMINAL_2.addFollower(TERMINAL_85);
		TERMINAL_2.addFollower(TERMINAL_86);
		TERMINAL_2.addFollower(TERMINAL_87);
		TERMINAL_2.addFollower(TERMINAL_88);
		TERMINAL_2.addFollower(TERMINAL_89);
		TERMINAL_2.addFollower(TERMINAL_90);
		TERMINAL_2.addFollower(TERMINAL_91);
		TERMINAL_2.addFollower(TERMINAL_92);
		TERMINAL_2.addFollower(TERMINAL_93);
		TERMINAL_2.addFollower(TERMINAL_94);
		TERMINAL_2.addFollower(TERMINAL_95);
		TERMINAL_2.addFollower(TERMINAL_96);
		TERMINAL_2.addFollower(TERMINAL_97);
		TERMINAL_2.addFollower(TERMINAL_98);
		TERMINAL_2.addFollower(TERMINAL_99);
		TERMINAL_2.addFollower(TERMINAL_100);
		TERMINAL_2.addFollower(TERMINAL_101);
		TERMINAL_2.addFollower(TERMINAL_102);
		TERMINAL_2.addFollower(TERMINAL_103);
		TERMINAL_2.addFollower(TERMINAL_104);
		TERMINAL_2.addFollower(TERMINAL_105);
		TERMINAL_2.addFollower(TERMINAL_106);
		TERMINAL_43.addFollower(TERMINAL_2);
		TERMINAL_43.addFollower(TERMINAL_47);
		TERMINAL_43.addFollower(TERMINAL_110);
		TERMINAL_43.addFollower(TERMINAL_111);
		TERMINAL_43.addFollower(TERMINAL_112);
		TERMINAL_43.addFollower(TERMINAL_113);
		TERMINAL_43.addFollower(TERMINAL_114);
		TERMINAL_43.addFollower(TERMINAL_115);
		TERMINAL_43.addFollower(TERMINAL_116);
		TERMINAL_43.addFollower(TERMINAL_117);
		TERMINAL_43.addFollower(TERMINAL_118);
		TERMINAL_43.addFollower(TERMINAL_48);
		TERMINAL_43.addFollower(TERMINAL_49);
		TERMINAL_43.addFollower(TERMINAL_50);
		TERMINAL_43.addFollower(TERMINAL_119);
		TERMINAL_43.addFollower(TERMINAL_31);
		TERMINAL_33.addFollower(TERMINAL_1);
		TERMINAL_33.addFollower(TERMINAL_33);
		TERMINAL_33.addFollower(TERMINAL_52);
		TERMINAL_33.addFollower(TERMINAL_122);
		TERMINAL_33.addFollower(TERMINAL_47);
		TERMINAL_47.addFollower(TERMINAL_123);
		TERMINAL_123.addFollower(TERMINAL_43);
		TERMINAL_35.addFollower(TERMINAL_124);
		TERMINAL_124.addFollower(TERMINAL_1);
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
		TERMINAL_32.addFollower(TERMINAL_120);
		TERMINAL_44.addFollower(TERMINAL_125);
		TERMINAL_125.addFollower(TERMINAL_43);
		TERMINAL_125.addFollower(TERMINAL_44);
		TERMINAL_125.addFollower(TERMINAL_45);
		TERMINAL_125.addFollower(TERMINAL_46);
		TERMINAL_116.addFollower(TERMINAL_116);
		TERMINAL_116.addFollower(TERMINAL_117);
		TERMINAL_116.addFollower(TERMINAL_118);
		TERMINAL_116.addFollower(TERMINAL_48);
		TERMINAL_116.addFollower(TERMINAL_49);
		TERMINAL_116.addFollower(TERMINAL_50);
		TERMINAL_116.addFollower(TERMINAL_119);
		TERMINAL_45.addFollower(TERMINAL_126);
		TERMINAL_126.addFollower(TERMINAL_47);
		TERMINAL_110.addFollower(TERMINAL_116);
		TERMINAL_110.addFollower(TERMINAL_117);
		TERMINAL_110.addFollower(TERMINAL_118);
		TERMINAL_110.addFollower(TERMINAL_48);
		TERMINAL_110.addFollower(TERMINAL_49);
		TERMINAL_110.addFollower(TERMINAL_50);
		TERMINAL_110.addFollower(TERMINAL_119);
		TERMINAL_46.addFollower(TERMINAL_127);
		TERMINAL_127.addFollower(TERMINAL_43);
		TERMINAL_112.addFollower(TERMINAL_116);
		TERMINAL_112.addFollower(TERMINAL_117);
		TERMINAL_112.addFollower(TERMINAL_118);
		TERMINAL_112.addFollower(TERMINAL_48);
		TERMINAL_112.addFollower(TERMINAL_49);
		TERMINAL_112.addFollower(TERMINAL_50);
		TERMINAL_112.addFollower(TERMINAL_119);
		TERMINAL_111.addFollower(TERMINAL_47);
		TERMINAL_3.addFollower(TERMINAL_128);
		TERMINAL_128.addFollower(TERMINAL_1);
		TERMINAL_128.addFollower(TERMINAL_3);
		TERMINAL_128.addFollower(TERMINAL_4);
		TERMINAL_128.addFollower(TERMINAL_5);
		TERMINAL_128.addFollower(TERMINAL_6);
		TERMINAL_128.addFollower(TERMINAL_7);
		TERMINAL_128.addFollower(TERMINAL_8);
		TERMINAL_128.addFollower(TERMINAL_9);
		TERMINAL_128.addFollower(TERMINAL_10);
		TERMINAL_128.addFollower(TERMINAL_11);
		TERMINAL_128.addFollower(TERMINAL_12);
		TERMINAL_128.addFollower(TERMINAL_13);
		TERMINAL_128.addFollower(TERMINAL_14);
		TERMINAL_128.addFollower(TERMINAL_15);
		TERMINAL_128.addFollower(TERMINAL_16);
		TERMINAL_128.addFollower(TERMINAL_17);
		TERMINAL_128.addFollower(TERMINAL_18);
		TERMINAL_128.addFollower(TERMINAL_19);
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
		TERMINAL_4.addFollower(TERMINAL_130);
		TERMINAL_130.addFollower(TERMINAL_1);
		TERMINAL_130.addFollower(TERMINAL_3);
		TERMINAL_130.addFollower(TERMINAL_4);
		TERMINAL_130.addFollower(TERMINAL_5);
		TERMINAL_130.addFollower(TERMINAL_6);
		TERMINAL_130.addFollower(TERMINAL_7);
		TERMINAL_130.addFollower(TERMINAL_8);
		TERMINAL_130.addFollower(TERMINAL_9);
		TERMINAL_130.addFollower(TERMINAL_10);
		TERMINAL_130.addFollower(TERMINAL_11);
		TERMINAL_130.addFollower(TERMINAL_12);
		TERMINAL_130.addFollower(TERMINAL_13);
		TERMINAL_130.addFollower(TERMINAL_14);
		TERMINAL_130.addFollower(TERMINAL_15);
		TERMINAL_130.addFollower(TERMINAL_16);
		TERMINAL_130.addFollower(TERMINAL_17);
		TERMINAL_130.addFollower(TERMINAL_18);
		TERMINAL_130.addFollower(TERMINAL_19);
		TERMINAL_131.addFollower(TERMINAL_1);
		TERMINAL_131.addFollower(TERMINAL_3);
		TERMINAL_131.addFollower(TERMINAL_4);
		TERMINAL_131.addFollower(TERMINAL_5);
		TERMINAL_131.addFollower(TERMINAL_6);
		TERMINAL_131.addFollower(TERMINAL_7);
		TERMINAL_131.addFollower(TERMINAL_8);
		TERMINAL_131.addFollower(TERMINAL_9);
		TERMINAL_131.addFollower(TERMINAL_10);
		TERMINAL_131.addFollower(TERMINAL_11);
		TERMINAL_131.addFollower(TERMINAL_12);
		TERMINAL_131.addFollower(TERMINAL_13);
		TERMINAL_131.addFollower(TERMINAL_14);
		TERMINAL_131.addFollower(TERMINAL_15);
		TERMINAL_131.addFollower(TERMINAL_16);
		TERMINAL_131.addFollower(TERMINAL_17);
		TERMINAL_131.addFollower(TERMINAL_18);
		TERMINAL_131.addFollower(TERMINAL_19);
		TERMINAL_131.addFollower(TERMINAL_20);
		TERMINAL_131.addFollower(TERMINAL_21);
		TERMINAL_131.addFollower(TERMINAL_22);
		TERMINAL_131.addFollower(TERMINAL_23);
		TERMINAL_131.addFollower(TERMINAL_24);
		TERMINAL_131.addFollower(TERMINAL_25);
		TERMINAL_131.addFollower(TERMINAL_26);
		TERMINAL_131.addFollower(TERMINAL_27);
		TERMINAL_131.addFollower(TERMINAL_28);
		TERMINAL_131.addFollower(TERMINAL_29);
		TERMINAL_131.addFollower(TERMINAL_30);
		TERMINAL_5.addFollower(TERMINAL_132);
		TERMINAL_132.addFollower(TERMINAL_1);
		TERMINAL_132.addFollower(TERMINAL_3);
		TERMINAL_132.addFollower(TERMINAL_4);
		TERMINAL_132.addFollower(TERMINAL_5);
		TERMINAL_132.addFollower(TERMINAL_6);
		TERMINAL_132.addFollower(TERMINAL_7);
		TERMINAL_132.addFollower(TERMINAL_8);
		TERMINAL_132.addFollower(TERMINAL_9);
		TERMINAL_132.addFollower(TERMINAL_10);
		TERMINAL_132.addFollower(TERMINAL_11);
		TERMINAL_132.addFollower(TERMINAL_12);
		TERMINAL_132.addFollower(TERMINAL_13);
		TERMINAL_132.addFollower(TERMINAL_14);
		TERMINAL_132.addFollower(TERMINAL_15);
		TERMINAL_132.addFollower(TERMINAL_16);
		TERMINAL_132.addFollower(TERMINAL_17);
		TERMINAL_132.addFollower(TERMINAL_18);
		TERMINAL_132.addFollower(TERMINAL_19);
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
		TERMINAL_6.addFollower(TERMINAL_133);
		TERMINAL_133.addFollower(TERMINAL_1);
		TERMINAL_133.addFollower(TERMINAL_33);
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
		TERMINAL_7.addFollower(TERMINAL_134);
		TERMINAL_134.addFollower(TERMINAL_1);
		TERMINAL_134.addFollower(TERMINAL_35);
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
		TERMINAL_8.addFollower(TERMINAL_135);
		TERMINAL_135.addFollower(TERMINAL_1);
		TERMINAL_135.addFollower(TERMINAL_35);
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
		TERMINAL_9.addFollower(TERMINAL_136);
		TERMINAL_136.addFollower(TERMINAL_1);
		TERMINAL_136.addFollower(TERMINAL_35);
		TERMINAL_122.addFollower(TERMINAL_1);
		TERMINAL_122.addFollower(TERMINAL_3);
		TERMINAL_122.addFollower(TERMINAL_4);
		TERMINAL_122.addFollower(TERMINAL_5);
		TERMINAL_122.addFollower(TERMINAL_6);
		TERMINAL_122.addFollower(TERMINAL_7);
		TERMINAL_122.addFollower(TERMINAL_8);
		TERMINAL_122.addFollower(TERMINAL_9);
		TERMINAL_122.addFollower(TERMINAL_10);
		TERMINAL_122.addFollower(TERMINAL_11);
		TERMINAL_122.addFollower(TERMINAL_12);
		TERMINAL_122.addFollower(TERMINAL_13);
		TERMINAL_122.addFollower(TERMINAL_14);
		TERMINAL_122.addFollower(TERMINAL_15);
		TERMINAL_122.addFollower(TERMINAL_16);
		TERMINAL_122.addFollower(TERMINAL_17);
		TERMINAL_122.addFollower(TERMINAL_18);
		TERMINAL_122.addFollower(TERMINAL_19);
		TERMINAL_122.addFollower(TERMINAL_20);
		TERMINAL_122.addFollower(TERMINAL_21);
		TERMINAL_122.addFollower(TERMINAL_22);
		TERMINAL_122.addFollower(TERMINAL_23);
		TERMINAL_122.addFollower(TERMINAL_24);
		TERMINAL_122.addFollower(TERMINAL_25);
		TERMINAL_122.addFollower(TERMINAL_26);
		TERMINAL_122.addFollower(TERMINAL_27);
		TERMINAL_122.addFollower(TERMINAL_28);
		TERMINAL_122.addFollower(TERMINAL_29);
		TERMINAL_122.addFollower(TERMINAL_30);
		TERMINAL_10.addFollower(TERMINAL_137);
		TERMINAL_137.addFollower(TERMINAL_1);
		TERMINAL_137.addFollower(TERMINAL_35);
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
		TERMINAL_11.addFollower(TERMINAL_138);
		TERMINAL_138.addFollower(TERMINAL_139);
		TERMINAL_139.addFollower(TERMINAL_1);
		TERMINAL_139.addFollower(TERMINAL_35);
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
		TERMINAL_12.addFollower(TERMINAL_140);
		TERMINAL_140.addFollower(TERMINAL_141);
		TERMINAL_141.addFollower(TERMINAL_1);
		TERMINAL_141.addFollower(TERMINAL_35);
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
		TERMINAL_13.addFollower(TERMINAL_142);
		TERMINAL_142.addFollower(TERMINAL_143);
		TERMINAL_143.addFollower(TERMINAL_1);
		TERMINAL_143.addFollower(TERMINAL_35);
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
		TERMINAL_14.addFollower(TERMINAL_144);
		TERMINAL_144.addFollower(TERMINAL_1);
		TERMINAL_117.addFollower(TERMINAL_1);
		TERMINAL_117.addFollower(TERMINAL_3);
		TERMINAL_117.addFollower(TERMINAL_4);
		TERMINAL_117.addFollower(TERMINAL_5);
		TERMINAL_117.addFollower(TERMINAL_6);
		TERMINAL_117.addFollower(TERMINAL_7);
		TERMINAL_117.addFollower(TERMINAL_8);
		TERMINAL_117.addFollower(TERMINAL_9);
		TERMINAL_117.addFollower(TERMINAL_10);
		TERMINAL_117.addFollower(TERMINAL_11);
		TERMINAL_117.addFollower(TERMINAL_12);
		TERMINAL_117.addFollower(TERMINAL_13);
		TERMINAL_117.addFollower(TERMINAL_14);
		TERMINAL_117.addFollower(TERMINAL_15);
		TERMINAL_117.addFollower(TERMINAL_16);
		TERMINAL_117.addFollower(TERMINAL_17);
		TERMINAL_117.addFollower(TERMINAL_18);
		TERMINAL_117.addFollower(TERMINAL_19);
		TERMINAL_117.addFollower(TERMINAL_20);
		TERMINAL_117.addFollower(TERMINAL_21);
		TERMINAL_117.addFollower(TERMINAL_22);
		TERMINAL_117.addFollower(TERMINAL_23);
		TERMINAL_117.addFollower(TERMINAL_24);
		TERMINAL_117.addFollower(TERMINAL_25);
		TERMINAL_117.addFollower(TERMINAL_26);
		TERMINAL_117.addFollower(TERMINAL_27);
		TERMINAL_117.addFollower(TERMINAL_28);
		TERMINAL_117.addFollower(TERMINAL_29);
		TERMINAL_117.addFollower(TERMINAL_30);
		TERMINAL_15.addFollower(TERMINAL_145);
		TERMINAL_145.addFollower(TERMINAL_1);
		TERMINAL_118.addFollower(TERMINAL_1);
		TERMINAL_118.addFollower(TERMINAL_3);
		TERMINAL_118.addFollower(TERMINAL_4);
		TERMINAL_118.addFollower(TERMINAL_5);
		TERMINAL_118.addFollower(TERMINAL_6);
		TERMINAL_118.addFollower(TERMINAL_7);
		TERMINAL_118.addFollower(TERMINAL_8);
		TERMINAL_118.addFollower(TERMINAL_9);
		TERMINAL_118.addFollower(TERMINAL_10);
		TERMINAL_118.addFollower(TERMINAL_11);
		TERMINAL_118.addFollower(TERMINAL_12);
		TERMINAL_118.addFollower(TERMINAL_13);
		TERMINAL_118.addFollower(TERMINAL_14);
		TERMINAL_118.addFollower(TERMINAL_15);
		TERMINAL_118.addFollower(TERMINAL_16);
		TERMINAL_118.addFollower(TERMINAL_17);
		TERMINAL_118.addFollower(TERMINAL_18);
		TERMINAL_118.addFollower(TERMINAL_19);
		TERMINAL_118.addFollower(TERMINAL_20);
		TERMINAL_118.addFollower(TERMINAL_21);
		TERMINAL_118.addFollower(TERMINAL_22);
		TERMINAL_118.addFollower(TERMINAL_23);
		TERMINAL_118.addFollower(TERMINAL_24);
		TERMINAL_118.addFollower(TERMINAL_25);
		TERMINAL_118.addFollower(TERMINAL_26);
		TERMINAL_118.addFollower(TERMINAL_27);
		TERMINAL_118.addFollower(TERMINAL_28);
		TERMINAL_118.addFollower(TERMINAL_29);
		TERMINAL_118.addFollower(TERMINAL_30);
		TERMINAL_16.addFollower(TERMINAL_146);
		TERMINAL_146.addFollower(TERMINAL_1);
		TERMINAL_113.addFollower(TERMINAL_1);
		TERMINAL_113.addFollower(TERMINAL_3);
		TERMINAL_113.addFollower(TERMINAL_4);
		TERMINAL_113.addFollower(TERMINAL_5);
		TERMINAL_113.addFollower(TERMINAL_6);
		TERMINAL_113.addFollower(TERMINAL_7);
		TERMINAL_113.addFollower(TERMINAL_8);
		TERMINAL_113.addFollower(TERMINAL_9);
		TERMINAL_113.addFollower(TERMINAL_10);
		TERMINAL_113.addFollower(TERMINAL_11);
		TERMINAL_113.addFollower(TERMINAL_12);
		TERMINAL_113.addFollower(TERMINAL_13);
		TERMINAL_113.addFollower(TERMINAL_14);
		TERMINAL_113.addFollower(TERMINAL_15);
		TERMINAL_113.addFollower(TERMINAL_16);
		TERMINAL_113.addFollower(TERMINAL_17);
		TERMINAL_113.addFollower(TERMINAL_18);
		TERMINAL_113.addFollower(TERMINAL_19);
		TERMINAL_113.addFollower(TERMINAL_20);
		TERMINAL_113.addFollower(TERMINAL_21);
		TERMINAL_113.addFollower(TERMINAL_22);
		TERMINAL_113.addFollower(TERMINAL_23);
		TERMINAL_113.addFollower(TERMINAL_24);
		TERMINAL_113.addFollower(TERMINAL_25);
		TERMINAL_113.addFollower(TERMINAL_26);
		TERMINAL_113.addFollower(TERMINAL_27);
		TERMINAL_113.addFollower(TERMINAL_28);
		TERMINAL_113.addFollower(TERMINAL_29);
		TERMINAL_113.addFollower(TERMINAL_30);
		TERMINAL_17.addFollower(TERMINAL_147);
		TERMINAL_147.addFollower(TERMINAL_148);
		TERMINAL_148.addFollower(TERMINAL_1);
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
		TERMINAL_18.addFollower(TERMINAL_149);
		TERMINAL_149.addFollower(TERMINAL_150);
		TERMINAL_150.addFollower(TERMINAL_1);
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
		TERMINAL_19.addFollower(TERMINAL_151);
		TERMINAL_151.addFollower(TERMINAL_152);
		TERMINAL_152.addFollower(TERMINAL_1);
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
		TERMINAL_74.addFollower(TERMINAL_153);
		TERMINAL_153.addFollower(TERMINAL_70);
		TERMINAL_153.addFollower(TERMINAL_71);
		TERMINAL_153.addFollower(TERMINAL_72);
		TERMINAL_153.addFollower(TERMINAL_1);
		TERMINAL_153.addFollower(TERMINAL_3);
		TERMINAL_153.addFollower(TERMINAL_4);
		TERMINAL_153.addFollower(TERMINAL_5);
		TERMINAL_153.addFollower(TERMINAL_6);
		TERMINAL_153.addFollower(TERMINAL_7);
		TERMINAL_153.addFollower(TERMINAL_8);
		TERMINAL_153.addFollower(TERMINAL_9);
		TERMINAL_153.addFollower(TERMINAL_10);
		TERMINAL_153.addFollower(TERMINAL_11);
		TERMINAL_153.addFollower(TERMINAL_12);
		TERMINAL_153.addFollower(TERMINAL_13);
		TERMINAL_153.addFollower(TERMINAL_14);
		TERMINAL_153.addFollower(TERMINAL_15);
		TERMINAL_153.addFollower(TERMINAL_16);
		TERMINAL_153.addFollower(TERMINAL_17);
		TERMINAL_153.addFollower(TERMINAL_18);
		TERMINAL_153.addFollower(TERMINAL_19);
	}
	public static void wire1() {
		TERMINAL_154.addFollower(TERMINAL_73);
		TERMINAL_154.addFollower(TERMINAL_74);
		TERMINAL_154.addFollower(TERMINAL_75);
		TERMINAL_154.addFollower(TERMINAL_76);
		TERMINAL_154.addFollower(TERMINAL_77);
		TERMINAL_154.addFollower(TERMINAL_78);
		TERMINAL_154.addFollower(TERMINAL_79);
		TERMINAL_154.addFollower(TERMINAL_80);
		TERMINAL_154.addFollower(TERMINAL_81);
		TERMINAL_154.addFollower(TERMINAL_82);
		TERMINAL_154.addFollower(TERMINAL_83);
		TERMINAL_154.addFollower(TERMINAL_84);
		TERMINAL_154.addFollower(TERMINAL_85);
		TERMINAL_154.addFollower(TERMINAL_86);
		TERMINAL_154.addFollower(TERMINAL_87);
		TERMINAL_154.addFollower(TERMINAL_88);
		TERMINAL_154.addFollower(TERMINAL_89);
		TERMINAL_154.addFollower(TERMINAL_90);
		TERMINAL_154.addFollower(TERMINAL_91);
		TERMINAL_154.addFollower(TERMINAL_92);
		TERMINAL_154.addFollower(TERMINAL_93);
		TERMINAL_154.addFollower(TERMINAL_94);
		TERMINAL_154.addFollower(TERMINAL_95);
		TERMINAL_154.addFollower(TERMINAL_96);
		TERMINAL_154.addFollower(TERMINAL_97);
		TERMINAL_154.addFollower(TERMINAL_98);
		TERMINAL_154.addFollower(TERMINAL_99);
		TERMINAL_154.addFollower(TERMINAL_100);
		TERMINAL_154.addFollower(TERMINAL_101);
		TERMINAL_154.addFollower(TERMINAL_102);
		TERMINAL_154.addFollower(TERMINAL_103);
		TERMINAL_154.addFollower(TERMINAL_104);
		TERMINAL_154.addFollower(TERMINAL_105);
		TERMINAL_154.addFollower(TERMINAL_106);
		TERMINAL_75.addFollower(TERMINAL_155);
		TERMINAL_155.addFollower(TERMINAL_70);
		TERMINAL_155.addFollower(TERMINAL_71);
		TERMINAL_155.addFollower(TERMINAL_72);
		TERMINAL_155.addFollower(TERMINAL_1);
		TERMINAL_155.addFollower(TERMINAL_3);
		TERMINAL_155.addFollower(TERMINAL_4);
		TERMINAL_155.addFollower(TERMINAL_5);
		TERMINAL_155.addFollower(TERMINAL_6);
		TERMINAL_155.addFollower(TERMINAL_7);
		TERMINAL_155.addFollower(TERMINAL_8);
		TERMINAL_155.addFollower(TERMINAL_9);
		TERMINAL_155.addFollower(TERMINAL_10);
		TERMINAL_155.addFollower(TERMINAL_11);
		TERMINAL_155.addFollower(TERMINAL_12);
		TERMINAL_155.addFollower(TERMINAL_13);
		TERMINAL_155.addFollower(TERMINAL_14);
		TERMINAL_155.addFollower(TERMINAL_15);
		TERMINAL_155.addFollower(TERMINAL_16);
		TERMINAL_155.addFollower(TERMINAL_17);
		TERMINAL_155.addFollower(TERMINAL_18);
		TERMINAL_155.addFollower(TERMINAL_19);
		TERMINAL_156.addFollower(TERMINAL_73);
		TERMINAL_156.addFollower(TERMINAL_74);
		TERMINAL_156.addFollower(TERMINAL_75);
		TERMINAL_156.addFollower(TERMINAL_76);
		TERMINAL_156.addFollower(TERMINAL_77);
		TERMINAL_156.addFollower(TERMINAL_78);
		TERMINAL_156.addFollower(TERMINAL_79);
		TERMINAL_156.addFollower(TERMINAL_80);
		TERMINAL_156.addFollower(TERMINAL_81);
		TERMINAL_156.addFollower(TERMINAL_82);
		TERMINAL_156.addFollower(TERMINAL_83);
		TERMINAL_156.addFollower(TERMINAL_84);
		TERMINAL_156.addFollower(TERMINAL_85);
		TERMINAL_156.addFollower(TERMINAL_86);
		TERMINAL_156.addFollower(TERMINAL_87);
		TERMINAL_156.addFollower(TERMINAL_88);
		TERMINAL_156.addFollower(TERMINAL_89);
		TERMINAL_156.addFollower(TERMINAL_90);
		TERMINAL_156.addFollower(TERMINAL_91);
		TERMINAL_156.addFollower(TERMINAL_92);
		TERMINAL_156.addFollower(TERMINAL_93);
		TERMINAL_156.addFollower(TERMINAL_94);
		TERMINAL_156.addFollower(TERMINAL_95);
		TERMINAL_156.addFollower(TERMINAL_96);
		TERMINAL_156.addFollower(TERMINAL_97);
		TERMINAL_156.addFollower(TERMINAL_98);
		TERMINAL_156.addFollower(TERMINAL_99);
		TERMINAL_156.addFollower(TERMINAL_100);
		TERMINAL_156.addFollower(TERMINAL_101);
		TERMINAL_156.addFollower(TERMINAL_102);
		TERMINAL_156.addFollower(TERMINAL_103);
		TERMINAL_156.addFollower(TERMINAL_104);
		TERMINAL_156.addFollower(TERMINAL_105);
		TERMINAL_156.addFollower(TERMINAL_106);
		TERMINAL_76.addFollower(TERMINAL_157);
		TERMINAL_157.addFollower(TERMINAL_70);
		TERMINAL_157.addFollower(TERMINAL_71);
		TERMINAL_157.addFollower(TERMINAL_72);
		TERMINAL_157.addFollower(TERMINAL_1);
		TERMINAL_157.addFollower(TERMINAL_3);
		TERMINAL_157.addFollower(TERMINAL_4);
		TERMINAL_157.addFollower(TERMINAL_5);
		TERMINAL_157.addFollower(TERMINAL_6);
		TERMINAL_157.addFollower(TERMINAL_7);
		TERMINAL_157.addFollower(TERMINAL_8);
		TERMINAL_157.addFollower(TERMINAL_9);
		TERMINAL_157.addFollower(TERMINAL_10);
		TERMINAL_157.addFollower(TERMINAL_11);
		TERMINAL_157.addFollower(TERMINAL_12);
		TERMINAL_157.addFollower(TERMINAL_13);
		TERMINAL_157.addFollower(TERMINAL_14);
		TERMINAL_157.addFollower(TERMINAL_15);
		TERMINAL_157.addFollower(TERMINAL_16);
		TERMINAL_157.addFollower(TERMINAL_17);
		TERMINAL_157.addFollower(TERMINAL_18);
		TERMINAL_157.addFollower(TERMINAL_19);
		TERMINAL_158.addFollower(TERMINAL_73);
		TERMINAL_158.addFollower(TERMINAL_74);
		TERMINAL_158.addFollower(TERMINAL_75);
		TERMINAL_158.addFollower(TERMINAL_76);
		TERMINAL_158.addFollower(TERMINAL_77);
		TERMINAL_158.addFollower(TERMINAL_78);
		TERMINAL_158.addFollower(TERMINAL_79);
		TERMINAL_158.addFollower(TERMINAL_80);
		TERMINAL_158.addFollower(TERMINAL_81);
		TERMINAL_158.addFollower(TERMINAL_82);
		TERMINAL_158.addFollower(TERMINAL_83);
		TERMINAL_158.addFollower(TERMINAL_84);
		TERMINAL_158.addFollower(TERMINAL_85);
		TERMINAL_158.addFollower(TERMINAL_86);
		TERMINAL_158.addFollower(TERMINAL_87);
		TERMINAL_158.addFollower(TERMINAL_88);
		TERMINAL_158.addFollower(TERMINAL_89);
		TERMINAL_158.addFollower(TERMINAL_90);
		TERMINAL_158.addFollower(TERMINAL_91);
		TERMINAL_158.addFollower(TERMINAL_92);
		TERMINAL_158.addFollower(TERMINAL_93);
		TERMINAL_158.addFollower(TERMINAL_94);
		TERMINAL_158.addFollower(TERMINAL_95);
		TERMINAL_158.addFollower(TERMINAL_96);
		TERMINAL_158.addFollower(TERMINAL_97);
		TERMINAL_158.addFollower(TERMINAL_98);
		TERMINAL_158.addFollower(TERMINAL_99);
		TERMINAL_158.addFollower(TERMINAL_100);
		TERMINAL_158.addFollower(TERMINAL_101);
		TERMINAL_158.addFollower(TERMINAL_102);
		TERMINAL_158.addFollower(TERMINAL_103);
		TERMINAL_158.addFollower(TERMINAL_104);
		TERMINAL_158.addFollower(TERMINAL_105);
		TERMINAL_158.addFollower(TERMINAL_106);
		TERMINAL_77.addFollower(TERMINAL_159);
		TERMINAL_159.addFollower(TERMINAL_70);
		TERMINAL_159.addFollower(TERMINAL_71);
		TERMINAL_159.addFollower(TERMINAL_72);
		TERMINAL_159.addFollower(TERMINAL_1);
		TERMINAL_160.addFollower(TERMINAL_73);
		TERMINAL_160.addFollower(TERMINAL_74);
		TERMINAL_160.addFollower(TERMINAL_75);
		TERMINAL_160.addFollower(TERMINAL_76);
		TERMINAL_160.addFollower(TERMINAL_77);
		TERMINAL_160.addFollower(TERMINAL_78);
		TERMINAL_160.addFollower(TERMINAL_79);
		TERMINAL_160.addFollower(TERMINAL_80);
		TERMINAL_160.addFollower(TERMINAL_81);
		TERMINAL_160.addFollower(TERMINAL_82);
		TERMINAL_160.addFollower(TERMINAL_83);
		TERMINAL_160.addFollower(TERMINAL_84);
		TERMINAL_160.addFollower(TERMINAL_85);
		TERMINAL_160.addFollower(TERMINAL_86);
		TERMINAL_160.addFollower(TERMINAL_87);
		TERMINAL_160.addFollower(TERMINAL_88);
		TERMINAL_160.addFollower(TERMINAL_89);
		TERMINAL_160.addFollower(TERMINAL_90);
		TERMINAL_160.addFollower(TERMINAL_91);
		TERMINAL_160.addFollower(TERMINAL_92);
		TERMINAL_160.addFollower(TERMINAL_93);
		TERMINAL_160.addFollower(TERMINAL_94);
		TERMINAL_160.addFollower(TERMINAL_95);
		TERMINAL_160.addFollower(TERMINAL_96);
		TERMINAL_160.addFollower(TERMINAL_97);
		TERMINAL_160.addFollower(TERMINAL_98);
		TERMINAL_160.addFollower(TERMINAL_99);
		TERMINAL_160.addFollower(TERMINAL_100);
		TERMINAL_160.addFollower(TERMINAL_101);
		TERMINAL_160.addFollower(TERMINAL_102);
		TERMINAL_160.addFollower(TERMINAL_103);
		TERMINAL_160.addFollower(TERMINAL_104);
		TERMINAL_160.addFollower(TERMINAL_105);
		TERMINAL_160.addFollower(TERMINAL_106);
		TERMINAL_78.addFollower(TERMINAL_161);
		TERMINAL_161.addFollower(TERMINAL_70);
		TERMINAL_161.addFollower(TERMINAL_71);
		TERMINAL_161.addFollower(TERMINAL_72);
		TERMINAL_161.addFollower(TERMINAL_1);
		TERMINAL_161.addFollower(TERMINAL_35);
		TERMINAL_162.addFollower(TERMINAL_73);
		TERMINAL_162.addFollower(TERMINAL_74);
		TERMINAL_162.addFollower(TERMINAL_75);
		TERMINAL_162.addFollower(TERMINAL_76);
		TERMINAL_162.addFollower(TERMINAL_77);
		TERMINAL_162.addFollower(TERMINAL_78);
		TERMINAL_162.addFollower(TERMINAL_79);
		TERMINAL_162.addFollower(TERMINAL_80);
		TERMINAL_162.addFollower(TERMINAL_81);
		TERMINAL_162.addFollower(TERMINAL_82);
		TERMINAL_162.addFollower(TERMINAL_83);
		TERMINAL_162.addFollower(TERMINAL_84);
		TERMINAL_162.addFollower(TERMINAL_85);
		TERMINAL_162.addFollower(TERMINAL_86);
		TERMINAL_162.addFollower(TERMINAL_87);
		TERMINAL_162.addFollower(TERMINAL_88);
		TERMINAL_162.addFollower(TERMINAL_89);
		TERMINAL_162.addFollower(TERMINAL_90);
		TERMINAL_162.addFollower(TERMINAL_91);
		TERMINAL_162.addFollower(TERMINAL_92);
		TERMINAL_162.addFollower(TERMINAL_93);
		TERMINAL_162.addFollower(TERMINAL_94);
		TERMINAL_162.addFollower(TERMINAL_95);
		TERMINAL_162.addFollower(TERMINAL_96);
		TERMINAL_162.addFollower(TERMINAL_97);
		TERMINAL_162.addFollower(TERMINAL_98);
		TERMINAL_162.addFollower(TERMINAL_99);
		TERMINAL_162.addFollower(TERMINAL_100);
		TERMINAL_162.addFollower(TERMINAL_101);
		TERMINAL_162.addFollower(TERMINAL_102);
		TERMINAL_162.addFollower(TERMINAL_103);
		TERMINAL_162.addFollower(TERMINAL_104);
		TERMINAL_162.addFollower(TERMINAL_105);
		TERMINAL_162.addFollower(TERMINAL_106);
		TERMINAL_79.addFollower(TERMINAL_163);
		TERMINAL_163.addFollower(TERMINAL_70);
		TERMINAL_163.addFollower(TERMINAL_71);
		TERMINAL_163.addFollower(TERMINAL_72);
		TERMINAL_163.addFollower(TERMINAL_1);
		TERMINAL_163.addFollower(TERMINAL_35);
		TERMINAL_164.addFollower(TERMINAL_73);
		TERMINAL_164.addFollower(TERMINAL_74);
		TERMINAL_164.addFollower(TERMINAL_75);
		TERMINAL_164.addFollower(TERMINAL_76);
		TERMINAL_164.addFollower(TERMINAL_77);
		TERMINAL_164.addFollower(TERMINAL_78);
		TERMINAL_164.addFollower(TERMINAL_79);
		TERMINAL_164.addFollower(TERMINAL_80);
		TERMINAL_164.addFollower(TERMINAL_81);
		TERMINAL_164.addFollower(TERMINAL_82);
		TERMINAL_164.addFollower(TERMINAL_83);
		TERMINAL_164.addFollower(TERMINAL_84);
		TERMINAL_164.addFollower(TERMINAL_85);
		TERMINAL_164.addFollower(TERMINAL_86);
		TERMINAL_164.addFollower(TERMINAL_87);
		TERMINAL_164.addFollower(TERMINAL_88);
		TERMINAL_164.addFollower(TERMINAL_89);
		TERMINAL_164.addFollower(TERMINAL_90);
		TERMINAL_164.addFollower(TERMINAL_91);
		TERMINAL_164.addFollower(TERMINAL_92);
		TERMINAL_164.addFollower(TERMINAL_93);
		TERMINAL_164.addFollower(TERMINAL_94);
		TERMINAL_164.addFollower(TERMINAL_95);
		TERMINAL_164.addFollower(TERMINAL_96);
		TERMINAL_164.addFollower(TERMINAL_97);
		TERMINAL_164.addFollower(TERMINAL_98);
		TERMINAL_164.addFollower(TERMINAL_99);
		TERMINAL_164.addFollower(TERMINAL_100);
		TERMINAL_164.addFollower(TERMINAL_101);
		TERMINAL_164.addFollower(TERMINAL_102);
		TERMINAL_164.addFollower(TERMINAL_103);
		TERMINAL_164.addFollower(TERMINAL_104);
		TERMINAL_164.addFollower(TERMINAL_105);
		TERMINAL_164.addFollower(TERMINAL_106);
		TERMINAL_80.addFollower(TERMINAL_165);
		TERMINAL_165.addFollower(TERMINAL_70);
		TERMINAL_165.addFollower(TERMINAL_71);
		TERMINAL_165.addFollower(TERMINAL_72);
		TERMINAL_165.addFollower(TERMINAL_1);
		TERMINAL_165.addFollower(TERMINAL_35);
		TERMINAL_166.addFollower(TERMINAL_73);
		TERMINAL_166.addFollower(TERMINAL_74);
		TERMINAL_166.addFollower(TERMINAL_75);
		TERMINAL_166.addFollower(TERMINAL_76);
		TERMINAL_166.addFollower(TERMINAL_77);
		TERMINAL_166.addFollower(TERMINAL_78);
		TERMINAL_166.addFollower(TERMINAL_79);
		TERMINAL_166.addFollower(TERMINAL_80);
		TERMINAL_166.addFollower(TERMINAL_81);
		TERMINAL_166.addFollower(TERMINAL_82);
		TERMINAL_166.addFollower(TERMINAL_83);
		TERMINAL_166.addFollower(TERMINAL_84);
		TERMINAL_166.addFollower(TERMINAL_85);
		TERMINAL_166.addFollower(TERMINAL_86);
		TERMINAL_166.addFollower(TERMINAL_87);
		TERMINAL_166.addFollower(TERMINAL_88);
		TERMINAL_166.addFollower(TERMINAL_89);
		TERMINAL_166.addFollower(TERMINAL_90);
		TERMINAL_166.addFollower(TERMINAL_91);
		TERMINAL_166.addFollower(TERMINAL_92);
		TERMINAL_166.addFollower(TERMINAL_93);
		TERMINAL_166.addFollower(TERMINAL_94);
		TERMINAL_166.addFollower(TERMINAL_95);
		TERMINAL_166.addFollower(TERMINAL_96);
		TERMINAL_166.addFollower(TERMINAL_97);
		TERMINAL_166.addFollower(TERMINAL_98);
		TERMINAL_166.addFollower(TERMINAL_99);
		TERMINAL_166.addFollower(TERMINAL_100);
		TERMINAL_166.addFollower(TERMINAL_101);
		TERMINAL_166.addFollower(TERMINAL_102);
		TERMINAL_166.addFollower(TERMINAL_103);
		TERMINAL_166.addFollower(TERMINAL_104);
		TERMINAL_166.addFollower(TERMINAL_105);
		TERMINAL_166.addFollower(TERMINAL_106);
		TERMINAL_81.addFollower(TERMINAL_167);
		TERMINAL_167.addFollower(TERMINAL_70);
		TERMINAL_167.addFollower(TERMINAL_71);
		TERMINAL_167.addFollower(TERMINAL_72);
		TERMINAL_167.addFollower(TERMINAL_1);
		TERMINAL_167.addFollower(TERMINAL_35);
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
		TERMINAL_82.addFollower(TERMINAL_168);
		TERMINAL_168.addFollower(TERMINAL_70);
		TERMINAL_168.addFollower(TERMINAL_71);
		TERMINAL_168.addFollower(TERMINAL_72);
		TERMINAL_168.addFollower(TERMINAL_1);
		TERMINAL_168.addFollower(TERMINAL_35);
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
		TERMINAL_83.addFollower(TERMINAL_169);
		TERMINAL_169.addFollower(TERMINAL_70);
		TERMINAL_169.addFollower(TERMINAL_71);
		TERMINAL_169.addFollower(TERMINAL_72);
		TERMINAL_169.addFollower(TERMINAL_1);
		TERMINAL_169.addFollower(TERMINAL_35);
		TERMINAL_170.addFollower(TERMINAL_73);
		TERMINAL_170.addFollower(TERMINAL_74);
		TERMINAL_170.addFollower(TERMINAL_75);
		TERMINAL_170.addFollower(TERMINAL_76);
		TERMINAL_170.addFollower(TERMINAL_77);
		TERMINAL_170.addFollower(TERMINAL_78);
		TERMINAL_170.addFollower(TERMINAL_79);
		TERMINAL_170.addFollower(TERMINAL_80);
		TERMINAL_170.addFollower(TERMINAL_81);
		TERMINAL_170.addFollower(TERMINAL_82);
		TERMINAL_170.addFollower(TERMINAL_83);
		TERMINAL_170.addFollower(TERMINAL_84);
		TERMINAL_170.addFollower(TERMINAL_85);
		TERMINAL_170.addFollower(TERMINAL_86);
		TERMINAL_170.addFollower(TERMINAL_87);
		TERMINAL_170.addFollower(TERMINAL_88);
		TERMINAL_170.addFollower(TERMINAL_89);
		TERMINAL_170.addFollower(TERMINAL_90);
		TERMINAL_170.addFollower(TERMINAL_91);
		TERMINAL_170.addFollower(TERMINAL_92);
		TERMINAL_170.addFollower(TERMINAL_93);
		TERMINAL_170.addFollower(TERMINAL_94);
		TERMINAL_170.addFollower(TERMINAL_95);
		TERMINAL_170.addFollower(TERMINAL_96);
		TERMINAL_170.addFollower(TERMINAL_97);
		TERMINAL_170.addFollower(TERMINAL_98);
		TERMINAL_170.addFollower(TERMINAL_99);
		TERMINAL_170.addFollower(TERMINAL_100);
		TERMINAL_170.addFollower(TERMINAL_101);
		TERMINAL_170.addFollower(TERMINAL_102);
		TERMINAL_170.addFollower(TERMINAL_103);
		TERMINAL_170.addFollower(TERMINAL_104);
		TERMINAL_170.addFollower(TERMINAL_105);
		TERMINAL_170.addFollower(TERMINAL_106);
		TERMINAL_84.addFollower(TERMINAL_171);
		TERMINAL_171.addFollower(TERMINAL_70);
		TERMINAL_171.addFollower(TERMINAL_71);
		TERMINAL_171.addFollower(TERMINAL_72);
		TERMINAL_171.addFollower(TERMINAL_1);
		TERMINAL_171.addFollower(TERMINAL_35);
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
		TERMINAL_85.addFollower(TERMINAL_172);
		TERMINAL_172.addFollower(TERMINAL_70);
		TERMINAL_172.addFollower(TERMINAL_71);
		TERMINAL_172.addFollower(TERMINAL_72);
		TERMINAL_172.addFollower(TERMINAL_1);
		TERMINAL_172.addFollower(TERMINAL_35);
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
		TERMINAL_86.addFollower(TERMINAL_173);
		TERMINAL_173.addFollower(TERMINAL_70);
		TERMINAL_173.addFollower(TERMINAL_71);
		TERMINAL_173.addFollower(TERMINAL_72);
		TERMINAL_173.addFollower(TERMINAL_1);
		TERMINAL_173.addFollower(TERMINAL_35);
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
		TERMINAL_87.addFollower(TERMINAL_174);
		TERMINAL_174.addFollower(TERMINAL_70);
		TERMINAL_174.addFollower(TERMINAL_71);
		TERMINAL_174.addFollower(TERMINAL_72);
		TERMINAL_174.addFollower(TERMINAL_1);
		TERMINAL_174.addFollower(TERMINAL_35);
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
		TERMINAL_88.addFollower(TERMINAL_175);
		TERMINAL_175.addFollower(TERMINAL_70);
		TERMINAL_175.addFollower(TERMINAL_71);
		TERMINAL_175.addFollower(TERMINAL_72);
		TERMINAL_175.addFollower(TERMINAL_1);
		TERMINAL_175.addFollower(TERMINAL_35);
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
		TERMINAL_89.addFollower(TERMINAL_176);
		TERMINAL_176.addFollower(TERMINAL_70);
		TERMINAL_176.addFollower(TERMINAL_71);
		TERMINAL_176.addFollower(TERMINAL_72);
		TERMINAL_176.addFollower(TERMINAL_1);
		TERMINAL_176.addFollower(TERMINAL_35);
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
		TERMINAL_90.addFollower(TERMINAL_177);
		TERMINAL_177.addFollower(TERMINAL_70);
		TERMINAL_177.addFollower(TERMINAL_71);
		TERMINAL_177.addFollower(TERMINAL_72);
		TERMINAL_177.addFollower(TERMINAL_1);
		TERMINAL_177.addFollower(TERMINAL_35);
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
		TERMINAL_91.addFollower(TERMINAL_178);
		TERMINAL_178.addFollower(TERMINAL_70);
		TERMINAL_178.addFollower(TERMINAL_71);
		TERMINAL_178.addFollower(TERMINAL_72);
		TERMINAL_178.addFollower(TERMINAL_1);
		TERMINAL_179.addFollower(TERMINAL_73);
		TERMINAL_179.addFollower(TERMINAL_74);
		TERMINAL_179.addFollower(TERMINAL_75);
		TERMINAL_179.addFollower(TERMINAL_76);
		TERMINAL_179.addFollower(TERMINAL_77);
		TERMINAL_179.addFollower(TERMINAL_78);
		TERMINAL_179.addFollower(TERMINAL_79);
		TERMINAL_179.addFollower(TERMINAL_80);
		TERMINAL_179.addFollower(TERMINAL_81);
		TERMINAL_179.addFollower(TERMINAL_82);
		TERMINAL_179.addFollower(TERMINAL_83);
		TERMINAL_179.addFollower(TERMINAL_84);
		TERMINAL_179.addFollower(TERMINAL_85);
		TERMINAL_179.addFollower(TERMINAL_86);
		TERMINAL_179.addFollower(TERMINAL_87);
		TERMINAL_179.addFollower(TERMINAL_88);
		TERMINAL_179.addFollower(TERMINAL_89);
		TERMINAL_179.addFollower(TERMINAL_90);
		TERMINAL_179.addFollower(TERMINAL_91);
		TERMINAL_179.addFollower(TERMINAL_92);
		TERMINAL_179.addFollower(TERMINAL_93);
		TERMINAL_179.addFollower(TERMINAL_94);
		TERMINAL_179.addFollower(TERMINAL_95);
		TERMINAL_179.addFollower(TERMINAL_96);
		TERMINAL_179.addFollower(TERMINAL_97);
		TERMINAL_179.addFollower(TERMINAL_98);
		TERMINAL_179.addFollower(TERMINAL_99);
		TERMINAL_179.addFollower(TERMINAL_100);
		TERMINAL_179.addFollower(TERMINAL_101);
		TERMINAL_179.addFollower(TERMINAL_102);
		TERMINAL_179.addFollower(TERMINAL_103);
		TERMINAL_179.addFollower(TERMINAL_104);
		TERMINAL_179.addFollower(TERMINAL_105);
		TERMINAL_179.addFollower(TERMINAL_106);
		TERMINAL_92.addFollower(TERMINAL_180);
		TERMINAL_180.addFollower(TERMINAL_70);
		TERMINAL_180.addFollower(TERMINAL_71);
		TERMINAL_180.addFollower(TERMINAL_72);
		TERMINAL_180.addFollower(TERMINAL_1);
		TERMINAL_181.addFollower(TERMINAL_73);
		TERMINAL_181.addFollower(TERMINAL_74);
		TERMINAL_181.addFollower(TERMINAL_75);
		TERMINAL_181.addFollower(TERMINAL_76);
		TERMINAL_181.addFollower(TERMINAL_77);
		TERMINAL_181.addFollower(TERMINAL_78);
		TERMINAL_181.addFollower(TERMINAL_79);
		TERMINAL_181.addFollower(TERMINAL_80);
		TERMINAL_181.addFollower(TERMINAL_81);
		TERMINAL_181.addFollower(TERMINAL_82);
		TERMINAL_181.addFollower(TERMINAL_83);
		TERMINAL_181.addFollower(TERMINAL_84);
		TERMINAL_181.addFollower(TERMINAL_85);
		TERMINAL_181.addFollower(TERMINAL_86);
		TERMINAL_181.addFollower(TERMINAL_87);
		TERMINAL_181.addFollower(TERMINAL_88);
		TERMINAL_181.addFollower(TERMINAL_89);
		TERMINAL_181.addFollower(TERMINAL_90);
		TERMINAL_181.addFollower(TERMINAL_91);
		TERMINAL_181.addFollower(TERMINAL_92);
		TERMINAL_181.addFollower(TERMINAL_93);
		TERMINAL_181.addFollower(TERMINAL_94);
		TERMINAL_181.addFollower(TERMINAL_95);
		TERMINAL_181.addFollower(TERMINAL_96);
		TERMINAL_181.addFollower(TERMINAL_97);
		TERMINAL_181.addFollower(TERMINAL_98);
		TERMINAL_181.addFollower(TERMINAL_99);
		TERMINAL_181.addFollower(TERMINAL_100);
		TERMINAL_181.addFollower(TERMINAL_101);
		TERMINAL_181.addFollower(TERMINAL_102);
		TERMINAL_181.addFollower(TERMINAL_103);
		TERMINAL_181.addFollower(TERMINAL_104);
		TERMINAL_181.addFollower(TERMINAL_105);
		TERMINAL_181.addFollower(TERMINAL_106);
		TERMINAL_93.addFollower(TERMINAL_182);
		TERMINAL_182.addFollower(TERMINAL_70);
		TERMINAL_182.addFollower(TERMINAL_71);
		TERMINAL_182.addFollower(TERMINAL_72);
		TERMINAL_182.addFollower(TERMINAL_1);
		TERMINAL_183.addFollower(TERMINAL_73);
		TERMINAL_183.addFollower(TERMINAL_74);
		TERMINAL_183.addFollower(TERMINAL_75);
		TERMINAL_183.addFollower(TERMINAL_76);
		TERMINAL_183.addFollower(TERMINAL_77);
		TERMINAL_183.addFollower(TERMINAL_78);
		TERMINAL_183.addFollower(TERMINAL_79);
		TERMINAL_183.addFollower(TERMINAL_80);
		TERMINAL_183.addFollower(TERMINAL_81);
		TERMINAL_183.addFollower(TERMINAL_82);
		TERMINAL_183.addFollower(TERMINAL_83);
		TERMINAL_183.addFollower(TERMINAL_84);
		TERMINAL_183.addFollower(TERMINAL_85);
		TERMINAL_183.addFollower(TERMINAL_86);
		TERMINAL_183.addFollower(TERMINAL_87);
		TERMINAL_183.addFollower(TERMINAL_88);
		TERMINAL_183.addFollower(TERMINAL_89);
		TERMINAL_183.addFollower(TERMINAL_90);
		TERMINAL_183.addFollower(TERMINAL_91);
		TERMINAL_183.addFollower(TERMINAL_92);
		TERMINAL_183.addFollower(TERMINAL_93);
		TERMINAL_183.addFollower(TERMINAL_94);
		TERMINAL_183.addFollower(TERMINAL_95);
		TERMINAL_183.addFollower(TERMINAL_96);
		TERMINAL_183.addFollower(TERMINAL_97);
		TERMINAL_183.addFollower(TERMINAL_98);
		TERMINAL_183.addFollower(TERMINAL_99);
		TERMINAL_183.addFollower(TERMINAL_100);
		TERMINAL_183.addFollower(TERMINAL_101);
		TERMINAL_183.addFollower(TERMINAL_102);
		TERMINAL_183.addFollower(TERMINAL_103);
		TERMINAL_183.addFollower(TERMINAL_104);
		TERMINAL_183.addFollower(TERMINAL_105);
		TERMINAL_183.addFollower(TERMINAL_106);
		TERMINAL_94.addFollower(TERMINAL_184);
		TERMINAL_184.addFollower(TERMINAL_70);
		TERMINAL_184.addFollower(TERMINAL_71);
		TERMINAL_184.addFollower(TERMINAL_72);
		TERMINAL_184.addFollower(TERMINAL_1);
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
		TERMINAL_95.addFollower(TERMINAL_185);
		TERMINAL_185.addFollower(TERMINAL_70);
		TERMINAL_185.addFollower(TERMINAL_71);
		TERMINAL_185.addFollower(TERMINAL_72);
		TERMINAL_185.addFollower(TERMINAL_1);
		TERMINAL_119.addFollower(TERMINAL_73);
		TERMINAL_119.addFollower(TERMINAL_74);
		TERMINAL_119.addFollower(TERMINAL_75);
		TERMINAL_119.addFollower(TERMINAL_76);
		TERMINAL_119.addFollower(TERMINAL_77);
		TERMINAL_119.addFollower(TERMINAL_78);
		TERMINAL_119.addFollower(TERMINAL_79);
		TERMINAL_119.addFollower(TERMINAL_80);
		TERMINAL_119.addFollower(TERMINAL_81);
		TERMINAL_119.addFollower(TERMINAL_82);
		TERMINAL_119.addFollower(TERMINAL_83);
		TERMINAL_119.addFollower(TERMINAL_84);
		TERMINAL_119.addFollower(TERMINAL_85);
		TERMINAL_119.addFollower(TERMINAL_86);
		TERMINAL_119.addFollower(TERMINAL_87);
		TERMINAL_119.addFollower(TERMINAL_88);
		TERMINAL_119.addFollower(TERMINAL_89);
		TERMINAL_119.addFollower(TERMINAL_90);
		TERMINAL_119.addFollower(TERMINAL_91);
		TERMINAL_119.addFollower(TERMINAL_92);
		TERMINAL_119.addFollower(TERMINAL_93);
		TERMINAL_119.addFollower(TERMINAL_94);
		TERMINAL_119.addFollower(TERMINAL_95);
		TERMINAL_119.addFollower(TERMINAL_96);
		TERMINAL_119.addFollower(TERMINAL_97);
		TERMINAL_119.addFollower(TERMINAL_98);
		TERMINAL_119.addFollower(TERMINAL_99);
		TERMINAL_119.addFollower(TERMINAL_100);
		TERMINAL_119.addFollower(TERMINAL_101);
		TERMINAL_119.addFollower(TERMINAL_102);
		TERMINAL_119.addFollower(TERMINAL_103);
		TERMINAL_119.addFollower(TERMINAL_104);
		TERMINAL_119.addFollower(TERMINAL_105);
		TERMINAL_119.addFollower(TERMINAL_106);
		TERMINAL_96.addFollower(TERMINAL_186);
		TERMINAL_186.addFollower(TERMINAL_70);
		TERMINAL_186.addFollower(TERMINAL_71);
		TERMINAL_186.addFollower(TERMINAL_72);
		TERMINAL_186.addFollower(TERMINAL_1);
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
		TERMINAL_97.addFollower(TERMINAL_187);
		TERMINAL_187.addFollower(TERMINAL_70);
		TERMINAL_187.addFollower(TERMINAL_71);
		TERMINAL_187.addFollower(TERMINAL_72);
		TERMINAL_187.addFollower(TERMINAL_1);
		TERMINAL_187.addFollower(TERMINAL_3);
		TERMINAL_187.addFollower(TERMINAL_4);
		TERMINAL_187.addFollower(TERMINAL_5);
		TERMINAL_187.addFollower(TERMINAL_6);
		TERMINAL_187.addFollower(TERMINAL_7);
		TERMINAL_187.addFollower(TERMINAL_8);
		TERMINAL_187.addFollower(TERMINAL_9);
		TERMINAL_187.addFollower(TERMINAL_10);
		TERMINAL_187.addFollower(TERMINAL_11);
		TERMINAL_187.addFollower(TERMINAL_12);
		TERMINAL_187.addFollower(TERMINAL_13);
		TERMINAL_187.addFollower(TERMINAL_14);
		TERMINAL_187.addFollower(TERMINAL_15);
		TERMINAL_187.addFollower(TERMINAL_16);
		TERMINAL_187.addFollower(TERMINAL_17);
		TERMINAL_187.addFollower(TERMINAL_18);
		TERMINAL_187.addFollower(TERMINAL_19);
		TERMINAL_29.addFollower(TERMINAL_1);
		TERMINAL_29.addFollower(TERMINAL_35);
		TERMINAL_29.addFollower(TERMINAL_120);
		TERMINAL_120.addFollower(TERMINAL_188);
		TERMINAL_188.addFollower(TERMINAL_1);
		TERMINAL_188.addFollower(TERMINAL_121);
		TERMINAL_121.addFollower(TERMINAL_189);
		TERMINAL_189.addFollower(TERMINAL_73);
		TERMINAL_189.addFollower(TERMINAL_74);
		TERMINAL_189.addFollower(TERMINAL_75);
		TERMINAL_189.addFollower(TERMINAL_76);
		TERMINAL_189.addFollower(TERMINAL_77);
		TERMINAL_189.addFollower(TERMINAL_78);
		TERMINAL_189.addFollower(TERMINAL_79);
		TERMINAL_189.addFollower(TERMINAL_80);
		TERMINAL_189.addFollower(TERMINAL_81);
		TERMINAL_189.addFollower(TERMINAL_82);
		TERMINAL_189.addFollower(TERMINAL_83);
		TERMINAL_189.addFollower(TERMINAL_84);
		TERMINAL_189.addFollower(TERMINAL_85);
		TERMINAL_189.addFollower(TERMINAL_86);
		TERMINAL_189.addFollower(TERMINAL_87);
		TERMINAL_189.addFollower(TERMINAL_88);
		TERMINAL_189.addFollower(TERMINAL_89);
		TERMINAL_189.addFollower(TERMINAL_90);
		TERMINAL_189.addFollower(TERMINAL_91);
		TERMINAL_189.addFollower(TERMINAL_92);
		TERMINAL_189.addFollower(TERMINAL_93);
		TERMINAL_189.addFollower(TERMINAL_94);
		TERMINAL_189.addFollower(TERMINAL_95);
		TERMINAL_189.addFollower(TERMINAL_96);
		TERMINAL_189.addFollower(TERMINAL_97);
		TERMINAL_189.addFollower(TERMINAL_98);
		TERMINAL_189.addFollower(TERMINAL_99);
		TERMINAL_189.addFollower(TERMINAL_100);
		TERMINAL_189.addFollower(TERMINAL_101);
		TERMINAL_189.addFollower(TERMINAL_102);
		TERMINAL_189.addFollower(TERMINAL_103);
		TERMINAL_189.addFollower(TERMINAL_104);
		TERMINAL_189.addFollower(TERMINAL_105);
		TERMINAL_189.addFollower(TERMINAL_106);
		TERMINAL_98.addFollower(TERMINAL_190);
		TERMINAL_190.addFollower(TERMINAL_70);
		TERMINAL_190.addFollower(TERMINAL_71);
		TERMINAL_190.addFollower(TERMINAL_72);
		TERMINAL_190.addFollower(TERMINAL_1);
		TERMINAL_191.addFollower(TERMINAL_73);
		TERMINAL_191.addFollower(TERMINAL_74);
		TERMINAL_191.addFollower(TERMINAL_75);
		TERMINAL_191.addFollower(TERMINAL_76);
		TERMINAL_191.addFollower(TERMINAL_77);
		TERMINAL_191.addFollower(TERMINAL_78);
		TERMINAL_191.addFollower(TERMINAL_79);
		TERMINAL_191.addFollower(TERMINAL_80);
		TERMINAL_191.addFollower(TERMINAL_81);
		TERMINAL_191.addFollower(TERMINAL_82);
		TERMINAL_191.addFollower(TERMINAL_83);
		TERMINAL_191.addFollower(TERMINAL_84);
		TERMINAL_191.addFollower(TERMINAL_85);
		TERMINAL_191.addFollower(TERMINAL_86);
		TERMINAL_191.addFollower(TERMINAL_87);
		TERMINAL_191.addFollower(TERMINAL_88);
		TERMINAL_191.addFollower(TERMINAL_89);
		TERMINAL_191.addFollower(TERMINAL_90);
		TERMINAL_191.addFollower(TERMINAL_91);
		TERMINAL_191.addFollower(TERMINAL_92);
		TERMINAL_191.addFollower(TERMINAL_93);
		TERMINAL_191.addFollower(TERMINAL_94);
		TERMINAL_191.addFollower(TERMINAL_95);
		TERMINAL_191.addFollower(TERMINAL_96);
		TERMINAL_191.addFollower(TERMINAL_97);
		TERMINAL_191.addFollower(TERMINAL_98);
		TERMINAL_191.addFollower(TERMINAL_99);
		TERMINAL_191.addFollower(TERMINAL_100);
		TERMINAL_191.addFollower(TERMINAL_101);
		TERMINAL_191.addFollower(TERMINAL_102);
		TERMINAL_191.addFollower(TERMINAL_103);
		TERMINAL_191.addFollower(TERMINAL_104);
		TERMINAL_191.addFollower(TERMINAL_105);
		TERMINAL_191.addFollower(TERMINAL_106);
		TERMINAL_99.addFollower(TERMINAL_192);
		TERMINAL_192.addFollower(TERMINAL_70);
		TERMINAL_192.addFollower(TERMINAL_71);
		TERMINAL_192.addFollower(TERMINAL_72);
		TERMINAL_192.addFollower(TERMINAL_1);
		TERMINAL_193.addFollower(TERMINAL_73);
		TERMINAL_193.addFollower(TERMINAL_74);
		TERMINAL_193.addFollower(TERMINAL_75);
		TERMINAL_193.addFollower(TERMINAL_76);
		TERMINAL_193.addFollower(TERMINAL_77);
		TERMINAL_193.addFollower(TERMINAL_78);
		TERMINAL_193.addFollower(TERMINAL_79);
		TERMINAL_193.addFollower(TERMINAL_80);
		TERMINAL_193.addFollower(TERMINAL_81);
		TERMINAL_193.addFollower(TERMINAL_82);
		TERMINAL_193.addFollower(TERMINAL_83);
		TERMINAL_193.addFollower(TERMINAL_84);
		TERMINAL_193.addFollower(TERMINAL_85);
		TERMINAL_193.addFollower(TERMINAL_86);
		TERMINAL_193.addFollower(TERMINAL_87);
		TERMINAL_193.addFollower(TERMINAL_88);
		TERMINAL_193.addFollower(TERMINAL_89);
		TERMINAL_193.addFollower(TERMINAL_90);
		TERMINAL_193.addFollower(TERMINAL_91);
		TERMINAL_193.addFollower(TERMINAL_92);
		TERMINAL_193.addFollower(TERMINAL_93);
		TERMINAL_193.addFollower(TERMINAL_94);
		TERMINAL_193.addFollower(TERMINAL_95);
		TERMINAL_193.addFollower(TERMINAL_96);
		TERMINAL_193.addFollower(TERMINAL_97);
		TERMINAL_193.addFollower(TERMINAL_98);
		TERMINAL_193.addFollower(TERMINAL_99);
		TERMINAL_193.addFollower(TERMINAL_100);
		TERMINAL_193.addFollower(TERMINAL_101);
		TERMINAL_193.addFollower(TERMINAL_102);
		TERMINAL_193.addFollower(TERMINAL_103);
		TERMINAL_193.addFollower(TERMINAL_104);
		TERMINAL_193.addFollower(TERMINAL_105);
		TERMINAL_193.addFollower(TERMINAL_106);
		TERMINAL_100.addFollower(TERMINAL_194);
		TERMINAL_194.addFollower(TERMINAL_70);
		TERMINAL_194.addFollower(TERMINAL_71);
		TERMINAL_194.addFollower(TERMINAL_72);
		TERMINAL_194.addFollower(TERMINAL_1);
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
		TERMINAL_101.addFollower(TERMINAL_195);
		TERMINAL_195.addFollower(TERMINAL_70);
		TERMINAL_195.addFollower(TERMINAL_71);
		TERMINAL_195.addFollower(TERMINAL_72);
		TERMINAL_195.addFollower(TERMINAL_1);
		TERMINAL_195.addFollower(TERMINAL_35);
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
		TERMINAL_102.addFollower(TERMINAL_197);
		TERMINAL_197.addFollower(TERMINAL_70);
		TERMINAL_197.addFollower(TERMINAL_71);
		TERMINAL_197.addFollower(TERMINAL_72);
		TERMINAL_197.addFollower(TERMINAL_1);
		TERMINAL_197.addFollower(TERMINAL_35);
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
		TERMINAL_103.addFollower(TERMINAL_199);
		TERMINAL_199.addFollower(TERMINAL_70);
		TERMINAL_199.addFollower(TERMINAL_71);
		TERMINAL_199.addFollower(TERMINAL_72);
		TERMINAL_199.addFollower(TERMINAL_1);
		TERMINAL_114.addFollower(TERMINAL_73);
		TERMINAL_114.addFollower(TERMINAL_74);
		TERMINAL_114.addFollower(TERMINAL_75);
		TERMINAL_114.addFollower(TERMINAL_76);
		TERMINAL_114.addFollower(TERMINAL_77);
		TERMINAL_114.addFollower(TERMINAL_78);
		TERMINAL_114.addFollower(TERMINAL_79);
		TERMINAL_114.addFollower(TERMINAL_80);
		TERMINAL_114.addFollower(TERMINAL_81);
		TERMINAL_114.addFollower(TERMINAL_82);
		TERMINAL_114.addFollower(TERMINAL_83);
		TERMINAL_114.addFollower(TERMINAL_84);
		TERMINAL_114.addFollower(TERMINAL_85);
		TERMINAL_114.addFollower(TERMINAL_86);
		TERMINAL_114.addFollower(TERMINAL_87);
		TERMINAL_114.addFollower(TERMINAL_88);
		TERMINAL_114.addFollower(TERMINAL_89);
		TERMINAL_114.addFollower(TERMINAL_90);
		TERMINAL_114.addFollower(TERMINAL_91);
		TERMINAL_114.addFollower(TERMINAL_92);
		TERMINAL_114.addFollower(TERMINAL_93);
		TERMINAL_114.addFollower(TERMINAL_94);
		TERMINAL_114.addFollower(TERMINAL_95);
		TERMINAL_114.addFollower(TERMINAL_96);
		TERMINAL_114.addFollower(TERMINAL_97);
		TERMINAL_114.addFollower(TERMINAL_98);
		TERMINAL_114.addFollower(TERMINAL_99);
		TERMINAL_114.addFollower(TERMINAL_100);
		TERMINAL_114.addFollower(TERMINAL_101);
		TERMINAL_114.addFollower(TERMINAL_102);
		TERMINAL_114.addFollower(TERMINAL_103);
		TERMINAL_114.addFollower(TERMINAL_104);
		TERMINAL_114.addFollower(TERMINAL_105);
		TERMINAL_114.addFollower(TERMINAL_106);
		TERMINAL_104.addFollower(TERMINAL_200);
		TERMINAL_200.addFollower(TERMINAL_70);
		TERMINAL_200.addFollower(TERMINAL_71);
		TERMINAL_200.addFollower(TERMINAL_72);
		TERMINAL_200.addFollower(TERMINAL_1);
		TERMINAL_115.addFollower(TERMINAL_73);
		TERMINAL_115.addFollower(TERMINAL_74);
		TERMINAL_115.addFollower(TERMINAL_75);
		TERMINAL_115.addFollower(TERMINAL_76);
		TERMINAL_115.addFollower(TERMINAL_77);
		TERMINAL_115.addFollower(TERMINAL_78);
		TERMINAL_115.addFollower(TERMINAL_79);
		TERMINAL_115.addFollower(TERMINAL_80);
		TERMINAL_115.addFollower(TERMINAL_81);
		TERMINAL_115.addFollower(TERMINAL_82);
		TERMINAL_115.addFollower(TERMINAL_83);
		TERMINAL_115.addFollower(TERMINAL_84);
		TERMINAL_115.addFollower(TERMINAL_85);
		TERMINAL_115.addFollower(TERMINAL_86);
		TERMINAL_115.addFollower(TERMINAL_87);
		TERMINAL_115.addFollower(TERMINAL_88);
		TERMINAL_115.addFollower(TERMINAL_89);
		TERMINAL_115.addFollower(TERMINAL_90);
		TERMINAL_115.addFollower(TERMINAL_91);
		TERMINAL_115.addFollower(TERMINAL_92);
		TERMINAL_115.addFollower(TERMINAL_93);
		TERMINAL_115.addFollower(TERMINAL_94);
		TERMINAL_115.addFollower(TERMINAL_95);
		TERMINAL_115.addFollower(TERMINAL_96);
		TERMINAL_115.addFollower(TERMINAL_97);
		TERMINAL_115.addFollower(TERMINAL_98);
		TERMINAL_115.addFollower(TERMINAL_99);
		TERMINAL_115.addFollower(TERMINAL_100);
		TERMINAL_115.addFollower(TERMINAL_101);
		TERMINAL_115.addFollower(TERMINAL_102);
		TERMINAL_115.addFollower(TERMINAL_103);
		TERMINAL_115.addFollower(TERMINAL_104);
		TERMINAL_115.addFollower(TERMINAL_105);
		TERMINAL_115.addFollower(TERMINAL_106);
		TERMINAL_70.addFollower(TERMINAL_201);
		TERMINAL_71.addFollower(TERMINAL_201);
		TERMINAL_72.addFollower(TERMINAL_201);
		TERMINAL_201.addFollower(TERMINAL_1);
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
		TERMINAL_53.addFollower(TERMINAL_1);
		TERMINAL_53.addFollower(TERMINAL_43);
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
		TERMINAL_53.addFollower(TERMINAL_202);
	}
	public static void wire2() {
		TERMINAL_105.addFollower(TERMINAL_203);
		TERMINAL_203.addFollower(TERMINAL_204);
		TERMINAL_203.addFollower(TERMINAL_205);
		TERMINAL_203.addFollower(TERMINAL_206);
		TERMINAL_203.addFollower(TERMINAL_207);
		TERMINAL_203.addFollower(TERMINAL_208);
		TERMINAL_203.addFollower(TERMINAL_209);
		TERMINAL_204.addFollower(TERMINAL_210);
		TERMINAL_205.addFollower(TERMINAL_210);
		TERMINAL_206.addFollower(TERMINAL_210);
		TERMINAL_207.addFollower(TERMINAL_210);
		TERMINAL_208.addFollower(TERMINAL_210);
		TERMINAL_209.addFollower(TERMINAL_210);
		TERMINAL_210.addFollower(TERMINAL_1);
		TERMINAL_210.addFollower(TERMINAL_43);
		TERMINAL_31.addFollower(TERMINAL_70);
		TERMINAL_31.addFollower(TERMINAL_71);
		TERMINAL_31.addFollower(TERMINAL_72);
		TERMINAL_202.addFollower(TERMINAL_73);
		TERMINAL_202.addFollower(TERMINAL_74);
		TERMINAL_202.addFollower(TERMINAL_75);
		TERMINAL_202.addFollower(TERMINAL_76);
		TERMINAL_202.addFollower(TERMINAL_77);
		TERMINAL_202.addFollower(TERMINAL_78);
		TERMINAL_202.addFollower(TERMINAL_79);
		TERMINAL_202.addFollower(TERMINAL_80);
		TERMINAL_202.addFollower(TERMINAL_81);
		TERMINAL_202.addFollower(TERMINAL_82);
		TERMINAL_202.addFollower(TERMINAL_83);
		TERMINAL_202.addFollower(TERMINAL_84);
		TERMINAL_202.addFollower(TERMINAL_85);
		TERMINAL_202.addFollower(TERMINAL_86);
		TERMINAL_202.addFollower(TERMINAL_87);
		TERMINAL_202.addFollower(TERMINAL_88);
		TERMINAL_202.addFollower(TERMINAL_89);
		TERMINAL_202.addFollower(TERMINAL_90);
		TERMINAL_202.addFollower(TERMINAL_91);
		TERMINAL_202.addFollower(TERMINAL_92);
		TERMINAL_202.addFollower(TERMINAL_93);
		TERMINAL_202.addFollower(TERMINAL_94);
		TERMINAL_202.addFollower(TERMINAL_95);
		TERMINAL_202.addFollower(TERMINAL_96);
		TERMINAL_202.addFollower(TERMINAL_97);
		TERMINAL_202.addFollower(TERMINAL_98);
		TERMINAL_202.addFollower(TERMINAL_99);
		TERMINAL_202.addFollower(TERMINAL_100);
		TERMINAL_202.addFollower(TERMINAL_101);
		TERMINAL_202.addFollower(TERMINAL_102);
		TERMINAL_202.addFollower(TERMINAL_103);
		TERMINAL_202.addFollower(TERMINAL_104);
		TERMINAL_202.addFollower(TERMINAL_105);
		TERMINAL_202.addFollower(TERMINAL_106);
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 32));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_43, 32));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 33));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_43, 33));
	}
	
	(
		a3_0 = parse_de_uniko_isweb_emftext_owl2fs_owl2fs_Entity		{
			if (terminateParsing) {
				throw new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsTerminateParsingException();
			}
			if (element == null) {
				element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDeclaration();
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					element.eSet(element.eClass().getEStructuralFeature(de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage.DECLARATION__ENTITY), a3_0);
					completedElement(a3_0);
				}
				collectHiddenTokens(element);
				copyLocalizationInfos(a3_0, element); 			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_2, 34));
	}
	
	a4 = ')' {
		if (element == null) {
			element = de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory.eINSTANCE.createDeclaration();
		}
		collectHiddenTokens(element);
		copyLocalizationInfos((org.antlr.runtime.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 35));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 35));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 35));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 35));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 35));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 35));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 35));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 35));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 35));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 35));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 35));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 35));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 35));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 35));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 35));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 35));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 35));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 35));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 35));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 35));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 35));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 35));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 35));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 35));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 35));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 35));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 35));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 35));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 35));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 35));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 35));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 35));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 35));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 35));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_2, 36));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 36));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 36));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 36));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 36));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 36));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 36));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 36));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 36));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 36));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 36));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 36));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 36));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 36));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 36));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 36));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 36));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 36));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 36));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_20, 36));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_21, 36));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_22, 36));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_23, 36));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_24, 36));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_25, 36));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_26, 36));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_27, 36));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_28, 36));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_29, 36));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_30, 36));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_31, 36));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_2, 37));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_47, 37));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_110, 37));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_111, 37));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_112, 37));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_113, 37));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_114, 37));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_115, 37));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_116, 37));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_117, 37));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_118, 37));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_48, 37));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_49, 37));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_50, 37));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_119, 37));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_31, 37));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_2, 38));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_32, 38));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 38));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 38));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 38));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 38));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 38));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 38));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 38));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 38));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 38));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 38));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 38));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 38));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 38));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 38));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 38));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 38));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 38));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 38));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_33, 38));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_34, 38));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_23, 38));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_24, 38));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_25, 38));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 38));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_36, 38));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_37, 38));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_38, 38));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_39, 38));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_40, 38));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_41, 38));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_42, 38));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_120, 38));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_31, 38));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_2, 39));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_43, 39));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_44, 39));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_45, 39));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_46, 39));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_47, 39));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_48, 39));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_49, 39));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_50, 39));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 39));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 39));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 39));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 39));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 39));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 39));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 39));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 39));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 39));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 39));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 39));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 39));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 39));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 39));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 39));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 39));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 39));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 39));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_51, 39));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_121, 39));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_33, 39));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_31, 39));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_2, 40));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 40));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_33, 40));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_52, 40));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_122, 40));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 40));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 40));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 40));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 40));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 40));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 40));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 40));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 40));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 40));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 40));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 40));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 40));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 40));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 40));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 40));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 40));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 40));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_47, 40));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_31, 40));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 41));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_33, 41));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_52, 41));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_122, 41));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_47, 41));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_123, 42));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_43, 43));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_47, 44));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_110, 44));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_111, 44));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_112, 44));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_113, 44));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_114, 44));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_115, 44));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_124, 45));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 46));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_32, 47));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 48));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_33, 48));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_34, 48));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_23, 48));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_24, 48));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_25, 48));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 48));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_36, 48));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_37, 48));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_38, 48));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_39, 48));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_40, 48));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_41, 48));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_42, 48));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_120, 48));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_125, 49));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_43, 50));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_44, 50));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_45, 50));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_46, 50));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_116, 51));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_116, 52));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_117, 52));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_118, 52));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_48, 52));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_49, 52));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_50, 52));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_119, 52));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_126, 53));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_47, 54));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_47, 55));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_110, 55));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_116, 56));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_117, 56));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_118, 56));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_48, 56));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_49, 56));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_50, 56));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_119, 56));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_127, 57));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_43, 58));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_111, 59));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_111, 60));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_112, 60));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_116, 61));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_117, 61));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_118, 61));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_48, 61));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_49, 61));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_50, 61));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_119, 61));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_47, 62));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_111, 63));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_112, 63));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_128, 64));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 65));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 65));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 65));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 65));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 65));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 65));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 65));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 65));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 65));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 65));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 65));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 65));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 65));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 65));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 65));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 65));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 65));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 65));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 66));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 66));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 66));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 66));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 66));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 66));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 66));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 66));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 66));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 66));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 66));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 66));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 66));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 66));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 66));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 66));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 66));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 66));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 67));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 67));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 67));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 67));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 67));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 67));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 67));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 67));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 67));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 67));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 67));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 67));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 67));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 67));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 67));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 67));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 67));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 67));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_129, 67));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 68));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 68));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 68));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 68));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 68));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 68));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 68));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 68));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 68));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 68));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 68));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 68));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 68));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 68));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 68));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 68));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 68));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 68));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_20, 68));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_21, 68));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_22, 68));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_23, 68));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_24, 68));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_25, 68));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_26, 68));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_27, 68));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_28, 68));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_29, 68));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_30, 68));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_130, 69));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 70));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 70));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 70));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 70));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 70));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 70));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 70));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 70));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 70));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 70));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 70));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 70));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 70));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 70));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 70));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 70));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 70));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 70));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 71));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 71));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 71));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 71));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 71));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 71));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 71));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 71));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 71));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 71));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 71));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 71));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 71));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 71));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 71));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 71));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 71));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 71));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 72));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 72));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 72));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 72));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 72));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 72));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 72));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 72));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 72));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 72));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 72));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 72));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 72));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 72));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 72));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 72));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 72));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 72));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_131, 72));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_20, 73));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_21, 73));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_22, 73));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_23, 73));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_24, 73));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_25, 73));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_26, 73));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_27, 73));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_28, 73));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_29, 73));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_30, 73));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_132, 74));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_20, 76));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 77));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 77));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 77));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 77));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 77));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 77));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 77));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 77));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 77));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 77));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 77));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 77));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 77));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 77));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 77));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 77));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 77));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 77));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_20, 77));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_21, 77));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_22, 77));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_23, 77));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_24, 77));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_25, 77));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_26, 77));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_27, 77));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_28, 77));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_29, 77));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_30, 77));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_133, 78));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 79));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_33, 79));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 80));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_33, 80));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_52, 80));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_134, 82));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 83));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 83));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 84));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 84));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 84));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 84));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 84));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 84));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 84));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 84));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 84));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 84));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 84));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 84));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 84));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 84));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 84));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 84));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 84));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 84));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_21, 85));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 86));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 86));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 86));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 86));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 86));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 86));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 86));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 86));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 86));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 86));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 86));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 86));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 86));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 86));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 86));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 86));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 86));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 86));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_20, 86));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_21, 86));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_22, 86));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_23, 86));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_24, 86));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_25, 86));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_26, 86));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_27, 86));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_28, 86));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_29, 86));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_30, 86));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_135, 87));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 88));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 88));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_22, 90));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 91));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 91));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 91));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 91));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 91));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 91));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 91));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 91));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 91));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 91));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 91));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 91));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 91));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 91));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 91));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 91));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 91));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 91));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_20, 91));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_21, 91));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_22, 91));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_23, 91));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_24, 91));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_25, 91));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_26, 91));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_27, 91));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_28, 91));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_29, 91));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_30, 91));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_136, 92));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 93));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 93));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 94));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_33, 94));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_122, 95));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 96));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 96));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 96));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 96));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 96));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 96));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 96));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 96));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 96));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 96));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 96));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 96));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 96));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 96));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 96));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 96));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 96));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 96));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_20, 96));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_21, 96));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_22, 96));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_23, 96));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_24, 96));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_25, 96));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_26, 96));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_27, 96));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_28, 96));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_29, 96));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_30, 96));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_137, 97));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 98));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 98));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_34, 99));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 100));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 100));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 100));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 100));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 100));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 100));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 100));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 100));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 100));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 100));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 100));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 100));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 100));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 100));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 100));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 100));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 100));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 100));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_20, 100));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_21, 100));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_22, 100));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_23, 100));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_24, 100));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_25, 100));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_26, 100));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_27, 100));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_28, 100));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_29, 100));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_30, 100));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_138, 101));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_139, 102));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 103));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 103));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_23, 104));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_23, 105));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 106));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 106));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 106));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 106));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 106));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 106));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 106));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 106));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 106));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 106));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 106));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 106));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 106));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 106));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 106));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 106));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 106));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 106));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_20, 106));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_21, 106));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_22, 106));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_23, 106));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_24, 106));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_25, 106));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_26, 106));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_27, 106));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_28, 106));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_29, 106));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_30, 106));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_140, 107));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_141, 108));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 109));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 109));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 110));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 110));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 110));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 110));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 110));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 110));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 110));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 110));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 110));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 110));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 110));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 110));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 110));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 110));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 110));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 110));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 110));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 110));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_24, 110));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_24, 111));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_20, 112));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_21, 112));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_22, 112));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_23, 112));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_24, 112));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_25, 112));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_26, 112));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_27, 112));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_28, 112));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_29, 112));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_30, 112));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_142, 113));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_143, 114));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 115));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 115));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 116));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 116));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 116));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 116));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 116));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 116));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 116));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 116));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 116));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 116));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 116));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 116));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 116));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 116));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 116));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 116));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 116));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 116));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_25, 116));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_25, 117));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_20, 118));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_21, 118));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_22, 118));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_23, 118));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_24, 118));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_25, 118));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_26, 118));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_27, 118));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_28, 118));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_29, 118));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_30, 118));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_144, 119));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 120));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_43, 121));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_44, 121));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_45, 121));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_46, 121));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_117, 122));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 123));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 123));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 123));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 123));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 123));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 123));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 123));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 123));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 123));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 123));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 123));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 123));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 123));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 123));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 123));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 123));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 123));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 123));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_20, 123));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_21, 123));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_22, 123));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_23, 123));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_24, 123));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_25, 123));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_26, 123));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_27, 123));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_28, 123));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_29, 123));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_30, 123));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_145, 124));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 125));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_43, 126));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_44, 126));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_45, 126));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_46, 126));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_118, 127));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 128));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 128));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 128));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 128));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 128));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 128));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 128));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 128));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 128));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 128));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 128));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 128));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 128));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 128));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 128));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 128));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 128));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 128));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_20, 128));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_21, 128));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_22, 128));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_23, 128));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_24, 128));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_25, 128));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_26, 128));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_27, 128));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_28, 128));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_29, 128));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_30, 128));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_146, 129));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 130));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_47, 131));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_113, 132));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 133));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 133));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 133));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 133));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 133));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 133));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 133));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 133));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 133));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 133));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 133));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 133));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 133));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 133));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 133));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 133));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 133));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 133));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_20, 133));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_21, 133));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_22, 133));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_23, 133));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_24, 133));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_25, 133));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_26, 133));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_27, 133));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_28, 133));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_29, 133));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_30, 133));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_147, 134));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_148, 135));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 136));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_43, 137));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_44, 137));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_45, 137));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_46, 137));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_48, 137));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_48, 138));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 139));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 139));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 139));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 139));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 139));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 139));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 139));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 139));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 139));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 139));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 139));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 139));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 139));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 139));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 139));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 139));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 139));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 139));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_20, 139));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_21, 139));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_22, 139));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_23, 139));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_24, 139));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_25, 139));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_26, 139));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_27, 139));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_28, 139));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_29, 139));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_30, 139));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_149, 140));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_150, 141));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 142));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_43, 143));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_44, 143));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_45, 143));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_46, 143));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_49, 143));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_49, 144));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 145));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 145));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 145));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 145));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 145));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 145));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 145));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 145));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 145));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 145));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 145));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 145));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 145));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 145));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 145));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 145));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 145));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 145));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_20, 145));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_21, 145));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_22, 145));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_23, 145));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_24, 145));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_25, 145));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_26, 145));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_27, 145));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_28, 145));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_29, 145));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_30, 145));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_151, 146));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_152, 147));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 148));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_43, 149));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_44, 149));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_45, 149));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_46, 149));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_50, 149));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_50, 150));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 151));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 151));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 151));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 151));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 151));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 151));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 151));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 151));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 151));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 151));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 151));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 151));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 151));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 151));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 151));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 151));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 151));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 151));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_20, 151));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_21, 151));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_22, 151));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_23, 151));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_24, 151));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_25, 151));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_26, 151));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_27, 151));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_28, 151));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_29, 151));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_30, 151));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_153, 152));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 153));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 153));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 153));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 154));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 154));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 154));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 154));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 154));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 154));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 154));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 154));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 154));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 154));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 154));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 154));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 154));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 154));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 154));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 154));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 154));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 154));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 154));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 154));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 154));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 155));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 155));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 155));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 155));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 155));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 155));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 155));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 155));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 155));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 155));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 155));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 155));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 155));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 155));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 155));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 155));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 155));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 155));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_154, 156));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 157));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 157));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 157));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 157));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 157));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 157));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 157));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 157));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 157));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 157));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 157));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 157));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 157));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 157));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 157));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 157));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 157));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 157));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 157));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 157));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 157));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 157));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 157));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 157));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 157));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 157));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 157));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 157));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 157));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 157));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 157));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 157));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 157));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 157));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_155, 158));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 159));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 159));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 159));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 160));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 160));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 160));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 160));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 160));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 160));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 160));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 160));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 160));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 160));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 160));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 160));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 160));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 160));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 160));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 160));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 160));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 160));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 160));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 160));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 160));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_156, 162));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 163));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 163));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 163));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 163));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 163));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 163));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 163));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 163));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 163));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 163));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 163));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 163));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 163));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 163));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 163));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 163));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 163));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 163));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 163));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 163));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 163));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 163));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 163));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 163));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 163));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 163));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 163));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 163));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 163));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 163));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 163));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 163));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 163));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 163));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_157, 164));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 165));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 165));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 165));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 165));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 165));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 165));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 165));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 165));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 165));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 165));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 165));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 165));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 165));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 165));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 165));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 165));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 165));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 165));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 165));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 165));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 165));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 166));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 166));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 166));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 166));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 166));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 166));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 166));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 166));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 166));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 166));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 166));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 166));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 166));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 166));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 166));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 166));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 166));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 166));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 166));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 166));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 166));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_158, 168));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 169));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 169));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 169));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 169));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 169));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 169));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 169));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 169));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 169));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 169));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 169));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 169));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 169));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 169));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 169));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 169));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 169));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 169));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 169));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 169));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 169));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 169));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 169));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 169));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 169));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 169));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 169));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 169));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 169));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 169));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 169));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 169));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 169));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 169));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_159, 170));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 171));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 171));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 171));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 171));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 172));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 172));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 172));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 172));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_160, 175));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 176));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 176));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 176));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 176));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 176));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 176));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 176));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 176));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 176));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 176));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 176));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 176));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 176));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 176));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 176));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 176));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 176));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 176));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 176));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 176));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 176));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 176));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 176));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 176));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 176));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 176));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 176));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 176));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 176));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 176));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 176));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 176));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 176));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 176));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_161, 177));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 178));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 178));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 178));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 178));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 178));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 179));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 179));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 179));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 179));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 179));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 180));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 180));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_162, 181));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 182));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 182));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 182));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 182));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 182));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 182));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 182));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 182));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 182));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 182));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 182));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 182));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 182));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 182));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 182));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 182));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 182));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 182));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 182));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 182));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 182));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 182));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 182));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 182));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 182));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 182));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 182));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 182));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 182));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 182));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 182));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 182));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 182));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 182));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_163, 183));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 184));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 184));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 184));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 184));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 184));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 185));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 185));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 185));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 185));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 185));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 186));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 186));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 187));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 187));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_164, 187));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 188));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 188));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 188));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 188));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 188));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 188));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 188));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 188));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 188));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 188));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 188));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 188));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 188));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 188));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 188));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 188));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 188));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 188));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 188));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 188));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 188));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 188));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 188));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 188));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 188));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 188));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 188));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 188));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 188));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 188));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 188));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 188));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 188));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 188));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_165, 189));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 190));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 190));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 190));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 190));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 190));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 191));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 191));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 191));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 191));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 191));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 192));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 192));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 193));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 193));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_166, 193));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 194));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 194));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 194));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 194));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 194));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 194));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 194));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 194));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 194));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 194));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 194));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 194));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 194));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 194));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 194));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 194));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 194));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 194));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 194));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 194));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 194));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 194));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 194));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 194));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 194));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 194));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 194));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 194));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 194));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 194));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 194));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 194));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 194));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 194));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_167, 195));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 196));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 196));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 196));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 196));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 196));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 197));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 197));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 197));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 197));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 197));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 198));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 198));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 198));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 198));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 198));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 198));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 198));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 198));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 198));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 198));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 198));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 198));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 198));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 198));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 198));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 198));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 198));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 198));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_26, 199));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 200));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 200));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 200));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 200));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 200));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 200));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 200));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 200));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 200));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 200));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 200));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 200));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 200));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 200));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 200));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 200));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 200));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 200));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 200));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 200));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 200));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 200));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 200));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 200));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 200));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 200));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 200));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 200));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 200));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 200));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 200));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 200));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 200));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 200));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_168, 201));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 202));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 202));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 202));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 202));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 202));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 203));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 203));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 203));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 203));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 203));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 204));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 204));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 204));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 204));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 204));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 204));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 204));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 204));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 204));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 204));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 204));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 204));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 204));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 204));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 204));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 204));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 204));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 204));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_27, 205));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 206));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 206));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 206));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 206));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 206));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 206));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 206));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 206));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 206));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 206));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 206));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 206));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 206));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 206));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 206));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 206));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 206));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 206));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 206));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 206));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 206));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 206));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 206));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 206));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 206));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 206));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 206));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 206));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 206));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 206));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 206));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 206));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 206));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 206));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_169, 207));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 208));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 208));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 208));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 208));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 208));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 209));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 209));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 209));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 209));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 209));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 210));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 210));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_170, 211));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 212));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 212));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 212));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 212));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 212));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 212));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 212));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 212));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 212));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 212));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 212));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 212));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 212));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 212));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 212));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 212));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 212));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 212));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 212));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 212));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 212));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 212));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 212));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 212));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 212));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 212));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 212));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 212));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 212));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 212));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 212));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 212));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 212));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 212));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_171, 213));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 214));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 214));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 214));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 214));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 214));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 215));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 215));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 215));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 215));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 215));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_36, 216));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 217));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 217));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 217));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 217));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 217));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 217));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 217));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 217));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 217));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 217));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 217));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 217));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 217));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 217));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 217));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 217));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 217));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 217));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 217));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 217));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 217));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 217));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 217));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 217));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 217));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 217));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 217));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 217));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 217));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 217));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 217));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 217));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 217));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 217));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_172, 218));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 219));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 219));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 219));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 219));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 219));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 220));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 220));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 220));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 220));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 220));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_37, 221));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 222));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 222));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 222));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 222));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 222));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 222));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 222));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 222));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 222));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 222));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 222));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 222));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 222));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 222));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 222));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 222));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 222));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 222));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 222));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 222));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 222));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 222));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 222));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 222));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 222));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 222));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 222));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 222));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 222));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 222));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 222));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 222));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 222));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 222));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_173, 223));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 224));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 224));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 224));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 224));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 224));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 225));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 225));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 225));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 225));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 225));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_38, 226));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 227));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 227));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 227));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 227));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 227));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 227));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 227));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 227));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 227));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 227));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 227));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 227));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 227));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 227));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 227));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 227));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 227));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 227));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 227));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 227));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 227));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 227));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 227));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 227));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 227));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 227));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 227));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 227));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 227));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 227));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 227));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 227));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 227));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 227));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_174, 228));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 229));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 229));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 229));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 229));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 229));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 230));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 230));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 230));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 230));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 230));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_39, 231));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 232));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 232));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 232));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 232));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 232));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 232));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 232));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 232));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 232));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 232));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 232));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 232));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 232));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 232));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 232));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 232));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 232));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 232));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 232));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 232));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 232));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 232));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 232));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 232));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 232));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 232));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 232));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 232));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 232));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 232));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 232));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 232));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 232));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 232));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_175, 233));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 234));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 234));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 234));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 234));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 234));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 235));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 235));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 235));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 235));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 235));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_40, 236));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 237));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 237));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 237));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 237));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 237));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 237));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 237));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 237));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 237));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 237));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 237));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 237));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 237));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 237));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 237));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 237));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 237));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 237));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 237));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 237));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 237));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 237));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 237));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 237));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 237));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 237));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 237));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 237));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 237));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 237));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 237));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 237));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 237));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 237));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_176, 238));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 239));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 239));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 239));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 239));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 239));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 240));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 240));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 240));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 240));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 240));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_41, 241));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 242));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 242));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 242));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 242));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 242));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 242));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 242));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 242));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 242));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 242));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 242));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 242));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 242));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 242));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 242));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 242));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 242));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 242));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 242));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 242));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 242));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 242));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 242));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 242));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 242));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 242));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 242));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 242));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 242));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 242));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 242));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 242));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 242));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 242));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_177, 243));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 244));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 244));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 244));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 244));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 244));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 245));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 245));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 245));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 245));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 245));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_42, 246));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 247));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 247));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 247));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 247));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 247));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 247));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 247));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 247));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 247));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 247));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 247));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 247));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 247));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 247));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 247));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 247));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 247));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 247));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 247));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 247));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 247));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 247));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 247));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 247));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 247));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 247));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 247));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 247));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 247));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 247));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 247));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 247));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 247));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 247));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_178, 248));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 249));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 249));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 249));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 249));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 250));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 250));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 250));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 250));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 251));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_179, 252));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 253));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 253));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 253));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 253));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 253));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 253));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 253));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 253));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 253));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 253));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 253));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 253));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 253));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 253));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 253));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 253));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 253));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 253));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 253));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 253));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 253));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 253));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 253));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 253));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 253));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 253));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 253));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 253));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 253));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 253));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 253));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 253));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 253));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 253));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_180, 254));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 255));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 255));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 255));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 255));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 256));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 256));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 256));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 256));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 257));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 258));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_181, 258));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 259));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 259));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 259));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 259));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 259));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 259));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 259));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 259));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 259));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 259));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 259));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 259));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 259));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 259));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 259));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 259));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 259));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 259));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 259));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 259));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 259));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 259));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 259));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 259));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 259));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 259));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 259));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 259));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 259));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 259));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 259));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 259));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 259));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 259));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_182, 260));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 261));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 261));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 261));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 261));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 262));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 262));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 262));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 262));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 263));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 264));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_183, 264));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 265));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 265));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 265));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 265));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 265));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 265));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 265));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 265));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 265));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 265));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 265));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 265));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 265));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 265));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 265));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 265));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 265));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 265));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 265));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 265));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 265));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 265));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 265));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 265));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 265));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 265));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 265));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 265));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 265));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 265));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 265));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 265));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 265));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 265));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_184, 266));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 267));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 267));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 267));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 267));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 268));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 268));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 268));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 268));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 269));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 269));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 269));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 269));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 269));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 269));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 269));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 269));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 269));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 269));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 269));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 269));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 269));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 269));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 269));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 269));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 269));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 269));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_28, 270));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 271));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 271));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 271));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 271));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 271));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 271));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 271));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 271));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 271));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 271));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 271));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 271));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 271));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 271));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 271));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 271));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 271));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 271));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 271));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 271));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 271));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 271));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 271));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 271));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 271));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 271));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 271));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 271));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 271));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 271));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 271));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 271));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 271));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 271));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_185, 272));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 273));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 273));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 273));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 273));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 274));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 274));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 274));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 274));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_43, 275));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_44, 275));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_45, 275));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_46, 275));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_119, 276));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 277));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 277));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 277));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 277));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 277));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 277));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 277));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 277));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 277));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 277));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 277));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 277));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 277));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 277));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 277));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 277));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 277));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 277));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 277));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 277));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 277));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 277));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 277));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 277));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 277));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 277));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 277));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 277));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 277));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 277));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 277));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 277));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 277));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 277));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_186, 278));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 279));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 279));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 279));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 279));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 280));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 280));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 280));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 280));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_51, 281));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 282));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 282));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 282));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 282));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 282));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 282));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 282));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 282));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 282));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 282));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 282));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 282));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 282));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 282));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 282));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 282));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 282));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 282));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 282));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 282));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 282));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 282));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 282));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 282));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 282));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 282));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 282));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 282));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 282));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 282));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 282));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 282));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 282));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 282));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_187, 283));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 284));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 284));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 284));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 284));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 284));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 284));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 284));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 284));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 284));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 284));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 284));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 284));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 284));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 284));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 284));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 284));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 284));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 284));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 284));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 284));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 284));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 285));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 285));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 285));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 285));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 285));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 285));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 285));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 285));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 285));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 285));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 285));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 285));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 285));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 285));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 285));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 285));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 285));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 285));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 285));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 285));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 285));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_29, 286));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 287));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 287));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_120, 287));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 288));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 288));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_120, 288));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_188, 289));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 290));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_121, 290));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 291));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_121, 291));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_189, 292));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 293));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 293));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 293));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 293));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 293));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 293));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 293));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 293));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 293));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 293));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 293));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 293));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 293));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 293));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 293));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 293));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 293));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 293));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 293));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 293));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 293));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 293));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 293));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 293));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 293));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 293));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 293));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 293));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 293));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 293));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 293));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 293));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 293));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 293));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_190, 294));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 295));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 295));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 295));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 295));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 296));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 296));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 296));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 296));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 297));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 298));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_191, 298));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 299));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 299));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 299));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 299));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 299));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 299));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 299));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 299));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 299));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 299));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 299));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 299));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 299));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 299));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 299));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 299));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 299));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 299));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 299));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 299));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 299));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 299));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 299));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 299));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 299));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 299));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 299));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 299));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 299));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 299));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 299));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 299));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 299));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 299));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_192, 300));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 301));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 301));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 301));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 301));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 302));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 302));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 302));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 302));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 303));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 304));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_193, 304));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 305));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 305));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 305));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 305));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 305));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 305));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 305));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 305));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 305));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 305));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 305));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 305));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 305));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 305));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 305));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 305));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 305));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 305));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 305));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 305));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 305));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 305));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 305));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 305));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 305));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 305));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 305));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 305));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 305));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 305));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 305));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 305));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 305));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 305));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_194, 306));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 307));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 307));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 307));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 307));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 308));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 308));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 308));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 308));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 309));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 309));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 309));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 309));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 309));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 309));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 309));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 309));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 309));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 309));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 309));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 309));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 309));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 309));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 309));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 309));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 309));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 309));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_30, 310));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 311));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 311));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 311));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 311));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 311));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 311));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 311));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 311));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 311));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 311));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 311));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 311));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 311));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 311));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 311));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 311));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 311));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 311));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 311));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 311));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 311));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 311));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 311));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 311));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 311));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 311));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 311));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 311));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 311));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 311));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 311));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 311));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 311));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 311));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_195, 312));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 313));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 313));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 313));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 313));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 313));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 314));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 314));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 314));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 314));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 314));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 315));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_33, 315));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 316));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_33, 316));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_196, 317));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 318));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 318));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 318));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 318));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 318));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 318));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 318));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 318));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 318));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 318));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 318));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 318));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 318));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 318));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 318));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 318));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 318));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 318));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 318));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 318));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 318));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 318));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 318));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 318));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 318));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 318));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 318));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 318));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 318));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 318));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 318));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 318));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 318));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 318));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_197, 319));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 320));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 320));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 320));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 320));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 320));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 321));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 321));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 321));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 321));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 321));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 322));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_33, 322));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 323));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_33, 323));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_198, 324));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 325));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 325));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 325));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 325));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 325));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 325));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 325));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 325));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 325));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 325));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 325));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 325));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 325));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 325));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 325));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 325));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 325));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 325));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 325));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 325));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 325));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 325));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 325));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 325));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 325));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 325));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 325));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 325));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 325));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 325));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 325));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 325));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 325));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 325));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_199, 326));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 327));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 327));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 327));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 327));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 328));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 328));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 328));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 328));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 329));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_33, 329));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_47, 330));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_114, 331));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 332));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 332));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 332));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 332));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 332));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 332));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 332));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 332));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 332));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 332));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 332));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 332));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 332));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 332));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 332));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 332));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 332));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 332));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 332));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 332));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 332));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 332));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 332));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 332));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 332));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 332));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 332));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 332));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 332));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 332));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 332));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 332));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 332));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 332));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_200, 333));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 334));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 334));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 334));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 334));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 335));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 335));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 335));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 335));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 336));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_33, 336));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_47, 337));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_115, 338));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 339));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 339));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 339));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 339));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 339));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 339));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 339));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 339));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 339));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 339));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 339));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 339));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 339));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 339));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 339));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 339));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 339));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 339));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 339));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 339));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 339));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 339));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 339));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 339));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 339));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 339));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 339));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 339));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 339));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 339));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 339));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 339));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 339));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 339));
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
			addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_201, 340));
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
			addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_201, 341));
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
			addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_201, 342));
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_201, 343));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 344));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 345));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_53, 345));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_43, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_3, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_4, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_5, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_6, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_7, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_8, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_9, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_10, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_11, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_12, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_13, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_14, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_15, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_16, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_17, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_18, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_19, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_35, 346));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_202, 346));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 347));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_2, 347));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_53, 347));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_31, 347));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_203, 348));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_204, 349));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_205, 349));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_206, 349));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_207, 349));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_208, 349));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_209, 349));
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
			addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_210, 350));
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
			addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_210, 351));
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
			addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_210, 352));
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
			addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_210, 353));
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
			addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_210, 354));
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
			addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_210, 355));
		}
		
	)
	{
		// expected elements (follow set)
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_210, 356));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_1, 357));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_43, 357));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_31, 358));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 359));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 359));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 359));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_70, 360));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_71, 360));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_72, 360));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_202, 360));
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
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_73, 361));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_74, 361));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_75, 361));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_76, 361));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_77, 361));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_78, 361));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_79, 361));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_80, 361));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_81, 361));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_82, 361));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_83, 361));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_84, 361));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_85, 361));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_86, 361));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_87, 361));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_88, 361));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_89, 361));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_90, 361));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_91, 361));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_92, 361));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_93, 361));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_94, 361));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_95, 361));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_96, 361));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_97, 361));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_98, 361));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_99, 361));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_100, 361));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_101, 361));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_102, 361));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_103, 361));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_104, 361));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_105, 361));
		addExpectedElement(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsExpectedTerminal(TERMINAL_106, 361));
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

