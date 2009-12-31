SYNTAXDEF owl2fs
FOR <http://west.uni-koblenz.de/OWL2FS>
START OntologyDocument

OPTIONS {	
	licenceHeader ="platform:/resource/org.reuseware/licence.txt";
	generateCodeFromGeneratorModel = "true";
	overrideManifest = "true";
	overrideBuildProperties = "true";
	overrideClasspath = "true";
	overrideProjectFile = "true";
	reloadGeneratorModel = "true";
	tokenspace = "1";
//	memoize = "true";
	usePredefinedTokens = "false";
}

TOKENS {
	DEFINE WHITESPACE $(' '|'\t'|'\f')$;
	DEFINE LINEBREAKS $('\r\n'|'\r'|'\n')$;
	DEFINE COMMENT$'//'(~('\n'|'\r'|'\uffff'))*$;
	DEFINE INTEGER$('-')?('1'..'9')('0'..'9')*|'0'$;
	DEFINE FLOAT$('-')?(('1'..'9') ('0'..'9')* | '0') '.' ('0'..'9')+ $;
	
	DEFINE LITERAL$('"')('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-')+('"')$;
	DEFINE NODE$('_')(':')('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-')+$;
	DEFINE DIRTYIRI$(('A'..'Z' | 'a'..'z' | '0'..'9' | '-' | '_' | '"' | '^' | '<' | '>' | '@' | ':' | '/' )+ | ('"')('A'..'Z' | 'a'..'z' | '0'..'9' | '-' | '_' | '<' | '>' | '@' | ':' | '/' | ',' | '.' | ' ' | '(' | ')' )+('"'))$;
	//DEFINE ABBRIRI$(('A'..'Z' | 'a'..'z' | '0'..'9' | '-' )+  | ('A'..'Z' | 'a'..'z' | '0'..'9' | '-')+(':')('A'..'Z' | 'a'..'z' | '0'..'9' |'_' | '-')+)$;
	DEFINE FULLIRI$'<' (~( '^' | '<' | '>' | '"' | '{' | '}' | '`' | '\\' | '\u0000'..'\u0020' ))* '>'$;
}

TOKENSTYLES {
	"Annotation" COLOR #7F0055, BOLD;
	"annotationProperty" COLOR #7F0055, BOLD;
	"AnnotationProperty" COLOR #7F0055, BOLD;
	"entityURI" COLOR #7F0055, BOLD;
	"URI" COLOR #7F0055, BOLD;
	"value" COLOR #7F0055, BOLD;
	"Literal" COLOR #7F0055, BOLD;
	"lexicalValue" COLOR #7F0055, BOLD;
	"datatype" COLOR #7F0055, BOLD;
	"Datatype" COLOR #7F0055, BOLD;
	"arity" COLOR #7F0055, BOLD;
	"dataType" COLOR #7F0055, BOLD;
	"AsymmetricObjectProperty" COLOR #7F0055, BOLD;
	"axiomAnnotations" COLOR #7F0055, BOLD;
	"objectPropertyExpression" COLOR #7F0055, BOLD;
	"ObjectProperty" COLOR #7F0055, BOLD;
	"owningTemplateParameter" COLOR #7F0055, BOLD;
	"templateParameter" COLOR #7F0055, BOLD;
	"InverseObjectProperty" COLOR #7F0055, BOLD;
	"objectProperty" COLOR #7F0055, BOLD;
	"Class" COLOR #7F0055, BOLD;
	"ObjectIntersectionOf" COLOR #7F0055, BOLD;
	"classExpressions" COLOR #7F0055, BOLD;
	"ObjectOneOf" COLOR #7F0055, BOLD;
	"individuals" COLOR #7F0055, BOLD;
	"NamedIndividual" COLOR #7F0055, BOLD;
	"ObjectSomeValuesFrom" COLOR #7F0055, BOLD;
	"classExpression" COLOR #7F0055, BOLD;
	"ObjectAllValuesFrom" COLOR #7F0055, BOLD;
	"ObjectExistsSelf" COLOR #7F0055, BOLD;
	"ObjectHasValue" COLOR #7F0055, BOLD;
	"individual" COLOR #7F0055, BOLD;
	"ObjectMinCardinality" COLOR #7F0055, BOLD;
	"cardinality" COLOR #7F0055, BOLD;
	"ObjectMaxCardinality" COLOR #7F0055, BOLD;
	"DataSomeValuesFrom" COLOR #7F0055, BOLD;
	"dataRange" COLOR #7F0055, BOLD;
	"dataPropertyExpressions" COLOR #7F0055, BOLD;
	"DataProperty" COLOR #7F0055, BOLD;
	"DataOneOf" COLOR #7F0055, BOLD;
	"constants" COLOR #7F0055, BOLD;
	"DatatypeRestriction" COLOR #7F0055, BOLD;
	"restrictions" COLOR #7F0055, BOLD;
	"FacetConstantPair" COLOR #7F0055, BOLD;
	"constant" COLOR #7F0055, BOLD;
	"facet" COLOR #7F0055, BOLD;
	"DataAllValuesFrom" COLOR #7F0055, BOLD;
	"DataHasValue" COLOR #7F0055, BOLD;
	"dataPropertyExpression" COLOR #7F0055, BOLD;
	"DataMinCardinality" COLOR #7F0055, BOLD;
	"DataMaxCardinality" COLOR #7F0055, BOLD;
	"DataExactCardinality" COLOR #7F0055, BOLD;
	"NegativeDataPropertyAssertion" COLOR #7F0055, BOLD;
	"targetValue" COLOR #7F0055, BOLD;
	"sourceIndividual" COLOR #7F0055, BOLD;
	"DataPropertyDomain" COLOR #7F0055, BOLD;
	"domain" COLOR #7F0055, BOLD;
	"DataPropertyRange" COLOR #7F0055, BOLD;
	"range" COLOR #7F0055, BOLD;
	"DifferentIndividuals" COLOR #7F0055, BOLD;
	"differentIndividuals" COLOR #7F0055, BOLD;
	"DisjointClasses" COLOR #7F0055, BOLD;
	"disjointClassExpressions" COLOR #7F0055, BOLD;
	"DisjointDataProperties" COLOR #7F0055, BOLD;
	"DisjointObjectProperties" COLOR #7F0055, BOLD;
	"objectPropertyExpressions" COLOR #7F0055, BOLD;
	"DisjointUnion" COLOR #7F0055, BOLD;
	"unionClass" COLOR #7F0055, BOLD;
	"EquivalentClasses" COLOR #7F0055, BOLD;
	"equivalentClassExpressions" COLOR #7F0055, BOLD;
	"EquivalentDataProperties" COLOR #7F0055, BOLD;
	"EquivalentObjectProperties" COLOR #7F0055, BOLD;
	"FunctionalDataProperty" COLOR #7F0055, BOLD;
	"FunctionalObjectProperty" COLOR #7F0055, BOLD;
	"InverseFunctionalObjectProperty" COLOR #7F0055, BOLD;
	"ObjectPropertyAssertion" COLOR #7F0055, BOLD;
	"targetIndividual" COLOR #7F0055, BOLD;
	"NegativeObjectPropertyAssertion" COLOR #7F0055, BOLD;
	"ObjectPropertyDomain" COLOR #7F0055, BOLD;
	"SymmetricObjectProperty" COLOR #7F0055, BOLD;
	"ReflexiveObjectProperty" COLOR #7F0055, BOLD;
	"SubDataPropertyOf" COLOR #7F0055, BOLD;
	"superDataPropertyExpression" COLOR #7F0055, BOLD;
	"subDataPropertyExpression" COLOR #7F0055, BOLD;
	"SameIndividual" COLOR #7F0055, BOLD;
	"sameIndividuals" COLOR #7F0055, BOLD;
	"SubObjectPropertyOf" COLOR #7F0055, BOLD;
	"superObjectPropertyExpression" COLOR #7F0055, BOLD;
	"subObjectPropertyExpressions" COLOR #7F0055, BOLD;
	"ObjectComplementOf" COLOR #7F0055, BOLD;
	"Ontology" COLOR #7F0055, BOLD;
	"ontologyAnnotations" COLOR #7F0055, BOLD;
	"axioms" COLOR #7F0055, BOLD;
	"importedOntologies" COLOR #7F0055, BOLD;
	"expressions" COLOR #7F0055, BOLD;
	"ontologyURI" COLOR #7F0055, BOLD;
	"versionURI" COLOR #7F0055, BOLD;
	"packages" COLOR #7F0055, BOLD;
	"ObjectPropertyRange" COLOR #7F0055, BOLD;
	"DataPropertyAssertion" COLOR #7F0055, BOLD;
	"ClassAssertion" COLOR #7F0055, BOLD;
	"IrreflexiveObjectProperty" COLOR #7F0055, BOLD;
	"ObjectExactCardinality" COLOR #7F0055, BOLD;
	"DataComplementOf" COLOR #7F0055, BOLD;
	"SubClassOf" COLOR #7F0055, BOLD;
	"subClassExpression" COLOR #7F0055, BOLD;
	"superClassExpression" COLOR #7F0055, BOLD;
	"SubObjectProperty" COLOR #7F0055, BOLD;
	"TransitiveObjectProperty" COLOR #7F0055, BOLD;
	"EntityAnnotation" COLOR #7F0055, BOLD;
	"entity" COLOR #7F0055, BOLD;
	"entityAnnotations" COLOR #7F0055, BOLD;
	"FullURI" COLOR #7F0055, BOLD;
	"iri" COLOR #7F0055, BOLD;
	"AbbreviatedURI" COLOR #7F0055, BOLD;
	"localName" COLOR #7F0055, BOLD;
	"ObjectUnionOf" COLOR #7F0055, BOLD;
	"InverseObjectProperties" COLOR #7F0055, BOLD;
	"ObjectPropertyExpression1" COLOR #7F0055, BOLD;
	"ObjectPropertyExpression2" COLOR #7F0055, BOLD;
	"AnnotationByConstant" COLOR #7F0055, BOLD;
	"annotationValue" COLOR #7F0055, BOLD;
	"AnnotationByEntity" COLOR #7F0055, BOLD;
	"AnnotationByAnonymousIndividual" COLOR #7F0055, BOLD;
	"AnonymousIndividual" COLOR #7F0055, BOLD;
	"nodeID" COLOR #7F0055, BOLD;
	"Declaration" COLOR #7F0055, BOLD;
	"KeyFor" COLOR #7F0055, BOLD;
	"AnonymousIndividualAnnotation" COLOR #7F0055, BOLD;
	"anonymousIndividual" COLOR #7F0055, BOLD;
	"anonymousIndiviudalAnnotations" COLOR #7F0055, BOLD;
	"OntologyDocument" COLOR #7F0055, BOLD;
	"ontology" COLOR #7F0055, BOLD;
	"PrefixDefinition" COLOR #7F0055, BOLD;
	"pref" COLOR #7F0055, BOLD;
	"namespace" COLOR #7F0055, BOLD;
	"TemplateParameter" COLOR #7F0055, BOLD;
	"ownedParameteredElement" COLOR #7F0055, BOLD;
	"signature" COLOR #7F0055, BOLD;
	"parameteredElement" COLOR #7F0055, BOLD;
	"ParameterableElement" COLOR #7F0055, BOLD;
	"TemplateSignature" COLOR #7F0055, BOLD;
	"parameter" COLOR #7F0055, BOLD;
	"ownedParameter" COLOR #7F0055, BOLD;
	"template" COLOR #7F0055, BOLD;
	"TemplateableElement" COLOR #7F0055, BOLD;
	"ownedTemplateSignature" COLOR #7F0055, BOLD;
	"templateBinding" COLOR #7F0055, BOLD;
	"Package" COLOR #7F0055, BOLD;
	"PackageUri" COLOR #7F0055, BOLD;
	"ClassifierTemplateParameter" COLOR #7F0055, BOLD;
	"TemplateParameterSubstitution" COLOR #7F0055, BOLD;
	"actual" COLOR #7F0055, BOLD;
	"formal" COLOR #7F0055, BOLD;
	"TemplateBinding" COLOR #7F0055, BOLD;
	"parameterSubstitution" COLOR #7F0055, BOLD;
	"boundElement" COLOR #7F0055, BOLD;
	"Rule" COLOR #7F0055, BOLD;
	"hasAntecedent" COLOR #7F0055, BOLD;
	"hasConsequent" COLOR #7F0055, BOLD;
	"swrlVariables" COLOR #7F0055, BOLD;
	"name" COLOR #7F0055, BOLD;
	"Antecedent" COLOR #7F0055, BOLD;
	"containsAtoms" COLOR #7F0055, BOLD;
	"Consequent" COLOR #7F0055, BOLD;
	"DataRangeAtom" COLOR #7F0055, BOLD;
	"isInConsequent" COLOR #7F0055, BOLD;
	"isInAntecedent" COLOR #7F0055, BOLD;
	"hasPredicateSymbol" COLOR #7F0055, BOLD;
	"hasTerm" COLOR #7F0055, BOLD;
	"ClassAtom" COLOR #7F0055, BOLD;
	"IndividualPropetyAtom" COLOR #7F0055, BOLD;
	"atomTarget" COLOR #7F0055, BOLD;
	"atomSource" COLOR #7F0055, BOLD;
	"DatavaluedPropertyAtom" COLOR #7F0055, BOLD;
	"DataVariable" COLOR #7F0055, BOLD;
	"IndividualVariable" COLOR #7F0055, BOLD;
	"BuiltInAtom" COLOR #7F0055, BOLD;
	"hasTerms" COLOR #7F0055, BOLD;
}

RULES {
	
	URI::= value[DIRTYIRI];  // "URI"  "{" ( "value"  ":" value['"','"']  )* "}"  ;
	
	FullURI::= iri[FULLIRI];  // "FullURI"  "{" ( "iri"  ":" iri['"','"']  )* "}"  ;
	
	AbbreviatedURI::= "AbbreviatedURI"  "{" ( "localName"  ":" localName['"','"']  )* "}"  ;
	
	OntologyDocument::= (PrefixDefinition)+ ontology;  // "OntologyDocument"  "{" ( "ontology"  ":" ontology | "PrefixDefinition"  ":" PrefixDefinition  )* "}"  ;
	
	PrefixDefinition::= "Namespace" "(" pref[DIRTYIRI]? "=" namespace ")";  // "PrefixDefinition"  "{" ( "pref"  ":" pref['"','"'] | "namespace"  ":" namespace  )* "}"  ;
	
	Ontology::= "Ontology" "(" ontologyURI[FULLIRI] versionURI[DIRTYIRI]? ( "Import" "(" importedOntologies ")" )* ontologyAnnotations* axioms* ")";  // "Ontology"  "{" ( "ontologyAnnotations"  ":" ontologyAnnotations | "axioms"  ":" axioms | "importedOntologies"  ":" importedOntologies | "expressions"  ":" expressions | "ontologyURI"  ":" ontologyURI | "versionURI"  ":" versionURI['"','"'] | "packages"  ":" packages  )* "}"  ;
	
	//Axiom begin
	Declaration::= "Declaration" "(" axiomAnnotations* entity ")";  // isFunctional[]?isReflexive[]?isInverseFunctional[]?isIrreflexive[]?isSymmetric[]?isTransitive[]?isAsysmmetric[]? "Declaration"  "{" ( "axiomAnnotations"  ":" axiomAnnotations | "entity"  ":" entity  )* "}"  ;
	
	//Entities begin
	Class::= entityURI;  // "Class"  "{" ( "entityURI"  ":" entityURI | "owningTemplateParameter"  ":" owningTemplateParameter[]| "templateParameter"  ":" templateParameter[] )* "}"  ;

	Datatype::= dataType[DIRTYIRI];  // "Datatype"  "{" ( "arity"  ":" arity[]| "entityURI"  ":" entityURI | "dataType"  ":" dataType[] )* "}"  ;

	ObjectProperty::= entityURI;  // isFunctional[]?isReflexive[]?isInverseFunctional[]?isIrreflexive[]?isSymmetric[]?isTransitive[]?isAsysmmetric[]? "ObjectProperty"  "{" ( "entityURI"  ":" entityURI | "owningTemplateParameter"  ":" owningTemplateParameter[]| "templateParameter"  ":" templateParameter[] )* "}"  ;

	DataProperty::= entityURI;  // "DataProperty"  "{" ( "entityURI"  ":" entityURI | "owningTemplateParameter"  ":" owningTemplateParameter[]| "templateParameter"  ":" templateParameter[] )* "}"  ;

	NamedIndividual::= entityURI;  // "NamedIndividual"  "{" ( "entityURI"  ":" entityURI | "owningTemplateParameter"  ":" owningTemplateParameter[]| "templateParameter"  ":" templateParameter[] )* "}"  ;
	//Entities end
	
	//AnnotationAxiom begin
	
	//AnnotationAxiom end
	
	AnonymousIndividual::= nodeID[NODE];  // "AnonymousIndividual"  "{" ( "nodeID"  ":" nodeID['"','"']  )* "}"  ;
	
	Literal::= lexicalValue[LITERAL] "^^" datatype;  // "Literal"  "{" ( "lexicalValue"  ":" lexicalValue['"','"'] | "datatype"  ":" datatype  )* "}"  ;
	
	InverseObjectProperty::= "ObjectInverseOf" "(" objectProperty ")";  // isFunctional[]?isReflexive[]?isInverseFunctional[]?isIrreflexive[]?isSymmetric[]?isTransitive[]?isAsysmmetric[]? "InverseObjectProperty"  "{" ( "objectProperty"  ":" objectProperty  )* "}"  ;
	
	//DataRange begin
	DataComplementOf::= "DataComplementOf" "(" dataRange ")";  // "DataComplementOf"  "{" ( "arity"  ":" arity[]| "dataRange"  ":" dataRange  )* "}"  ;
	
	DataOneOf::= "DataOneOf" "(" constants+ ")";  // "DataOneOf"  "{" ( "arity"  ":" arity[]| "constants"  ":" constants  )* "}"  ;
	
	DatatypeRestriction::= "DatatypeRestriction" "(" datatype restrictions+ ")";  // "DatatypeRestriction"  "{" ( "arity"  ":" arity[]| "datatype"  ":" datatype | "restrictions"  ":" restrictions  )* "}"  ;
	
	FacetConstantPair::= facet[DIRTYIRI] constant;  // "FacetConstantPair"  "{" ( "constant"  ":" constant | "facet"  ":" facet['"','"']  )* "}"  ;
	//DataRange end
	
	//ClassExpression begin
	ObjectIntersectionOf::= "ObjectIntersectionOf" "(" classExpressions classExpressions+ ")";  // "ObjectIntersectionOf"  "{" ( "classExpressions"  ":" classExpressions  )* "}"  ;
	
	ObjectUnionOf::= "ObjectUnionOf" "(" classExpressions classExpressions+ ")";  // "ObjectUnionOf"  "{" ( "classExpressions"  ":" classExpressions  )* "}"  ;
	
	ObjectComplementOf::= "ObjectComplementOf" "(" classExpression ")";  // "ObjectComplementOf"  "{" ( "classExpression"  ":" classExpression  )* "}"  ;
	
	ObjectOneOf::= "ObjectOneOf" "(" individuals+ ")";  // "ObjectOneOf"  "{" ( "individuals"  ":" individuals  )* "}"  ;
	
	ObjectSomeValuesFrom::= "ObjectSomeValuesFrom" "(" objectPropertyExpression classExpression ")";  // "ObjectSomeValuesFrom"  "{" ( "classExpression"  ":" classExpression | "objectPropertyExpression"  ":" objectPropertyExpression  )* "}"  ;
	
	ObjectAllValuesFrom::= "ObjectAllValuesFrom" "(" objectPropertyExpression classExpression ")";  // "ObjectAllValuesFrom"  "{" ( "classExpression"  ":" classExpression | "objectPropertyExpression"  ":" objectPropertyExpression  )* "}"  ;
	
	ObjectHasValue::= "ObjectHasValue" "(" objectPropertyExpression individual ")";  // "ObjectHasValue"  "{" ( "objectPropertyExpression"  ":" objectPropertyExpression | "individual"  ":" individual  )* "}"  ;
	
	ObjectExistsSelf::= "ObjectExistsSelf" "(" objectPropertyExpression ")";  // "ObjectExistsSelf"  "{" ( "objectPropertyExpression"  ":" objectPropertyExpression  )* "}"  ;
	
	ObjectMinCardinality::= "ObjectMinCardinality" "(" cardinality[INTEGER] objectPropertyExpression classExpression? ")";  // "ObjectMinCardinality"  "{" ( "cardinality"  ":" cardinality[]| "classExpression"  ":" classExpression | "objectPropertyExpression"  ":" objectPropertyExpression  )* "}"  ;
	
	ObjectMaxCardinality::= "ObjectMaxCardinality" "(" cardinality[INTEGER] objectPropertyExpression classExpression? ")";  // "ObjectMaxCardinality"  "{" ( "cardinality"  ":" cardinality[]| "classExpression"  ":" classExpression | "objectPropertyExpression"  ":" objectPropertyExpression  )* "}"  ;
	
	ObjectExactCardinality::= "ObjectExactCardinality" "(" cardinality[INTEGER] objectPropertyExpression classExpression? ")";  // "ObjectExactCardinality"  "{" ( "cardinality"  ":" cardinality[]| "classExpression"  ":" classExpression | "objectPropertyExpression"  ":" objectPropertyExpression  )* "}"  ;
	
	DataSomeValuesFrom::= "DataSomeValuesFrom" "(" dataPropertyExpressions dataRange ")";  // "DataSomeValuesFrom"  "{" ( "dataRange"  ":" dataRange | "dataPropertyExpressions"  ":" dataPropertyExpressions  )* "}"  ;
	
	DataAllValuesFrom::= "DataAllValuesFrom" "(" dataPropertyExpressions dataRange ")";  // "DataAllValuesFrom"  "{" ( "dataRange"  ":" dataRange | "dataPropertyExpressions"  ":" dataPropertyExpressions  )* "}"  ;
	
	DataHasValue::= "DataHasValue" "(" dataPropertyExpression constant ")";  // "DataHasValue"  "{" ( "constant"  ":" constant | "dataPropertyExpression"  ":" dataPropertyExpression  )* "}"  ;
	
	DataMinCardinality::= "DataMinCardinality" "(" cardinality[INTEGER] dataPropertyExpression dataRange? ")";  // "DataMinCardinality"  "{" ( "cardinality"  ":" cardinality[]| "dataRange"  ":" dataRange | "dataPropertyExpression"  ":" dataPropertyExpression  )* "}"  ;
	
	DataMaxCardinality::= "DataMaxCardinality" "(" cardinality[INTEGER] dataPropertyExpression dataRange? ")";  // "DataMaxCardinality"  "{" ( "cardinality"  ":" cardinality[]| "dataRange"  ":" dataRange | "dataPropertyExpression"  ":" dataPropertyExpression  )* "}"  ;
	
	DataExactCardinality::= "DataExactCardinality" "(" cardinality[INTEGER] dataPropertyExpression dataRange? ")";  // "DataExactCardinality"  "{" ( "cardinality"  ":" cardinality[]| "dataRange"  ":" dataRange | "dataPropertyExpression"  ":" dataPropertyExpression  )* "}"  ;
	//ClassExpression end
	
	//ClassAxiom begin
	SubClassOf::= "SubClassOf" "(" axiomAnnotations* subClassExpression superClassExpression ")";  // "SubClassOf"  "{" ( "axiomAnnotations"  ":" axiomAnnotations | "subClassExpression"  ":" subClassExpression | "superClassExpression"  ":" superClassExpression  )* "}"  ;
	
	EquivalentClasses::= "EquivalentClasses" "(" axiomAnnotations* equivalentClassExpressions equivalentClassExpressions+ ")";  // "EquivalentClasses"  "{" ( "axiomAnnotations"  ":" axiomAnnotations | "equivalentClassExpressions"  ":" equivalentClassExpressions  )* "}"  ;
	
	DisjointClasses::= "DisjointClasses" "(" axiomAnnotations* disjointClassExpressions disjointClassExpressions+ ")";  // "DisjointClasses"  "{" ( "axiomAnnotations"  ":" axiomAnnotations | "disjointClassExpressions"  ":" disjointClassExpressions  )* "}"  ;
	
	DisjointUnion::= "DisjointUnion" "(" axiomAnnotations* unionClass disjointClassExpressions disjointClassExpressions+ ")";  // "DisjointUnion"  "{" ( "axiomAnnotations"  ":" axiomAnnotations | "unionClass"  ":" unionClass | "disjointClassExpressions"  ":" disjointClassExpressions  )* "}"  ;
	//ClassAxiom end
	
	//ObjectPropertyAxiom begin
	SubObjectPropertyOf::= "SubObjectPropertyOf" "(" axiomAnnotations* subObjectPropertyExpressions superObjectPropertyExpression ")";  // "SubObjectPropertyOf"  "{" ( "axiomAnnotations"  ":" axiomAnnotations | "superObjectPropertyExpression"  ":" superObjectPropertyExpression | "subObjectPropertyExpressions"  ":" subObjectPropertyExpressions  )* "}"  ;
	
	EquivalentObjectProperties::= "EquivalentObjectProperties" "(" axiomAnnotations* objectPropertyExpressions objectPropertyExpressions+ ")";  // "EquivalentObjectProperties"  "{" ( "axiomAnnotations"  ":" axiomAnnotations | "objectPropertyExpressions"  ":" objectPropertyExpressions  )* "}"  ;
	
	DisjointObjectProperties::= "DisjointObjectProperties" "(" axiomAnnotations* objectPropertyExpressions objectPropertyExpressions+ ")";  // "DisjointObjectProperties"  "{" ( "axiomAnnotations"  ":" axiomAnnotations | "objectPropertyExpressions"  ":" objectPropertyExpressions  )* "}"  ;
	
	ObjectPropertyDomain::= "ObjectPropertyDomain" "(" axiomAnnotations* objectPropertyExpression domain ")";  // "ObjectPropertyDomain"  "{" ( "axiomAnnotations"  ":" axiomAnnotations | "domain"  ":" domain | "objectPropertyExpression"  ":" objectPropertyExpression  )* "}"  ;
	
	ObjectPropertyRange::= "ObjectPropertyRange" "(" axiomAnnotations* objectPropertyExpression range ")";  // "ObjectPropertyRange"  "{" ( "axiomAnnotations"  ":" axiomAnnotations | "range"  ":" range | "objectPropertyExpression"  ":" objectPropertyExpression  )* "}"  ;
	
	InverseObjectProperties::= "InverseObjectProperties" "(" axiomAnnotations* ObjectPropertyExpression1 ObjectPropertyExpression2 ")";  // "InverseObjectProperties"  "{" ( "axiomAnnotations"  ":" axiomAnnotations | "ObjectPropertyExpression1"  ":" ObjectPropertyExpression1 | "ObjectPropertyExpression2"  ":" ObjectPropertyExpression2  )* "}"  ;
	
	FunctionalObjectProperty::= "FunctionalObjectProperty" "(" axiomAnnotations* objectPropertyExpression ")";  // "FunctionalObjectProperty"  "{" ( "axiomAnnotations"  ":" axiomAnnotations | "objectPropertyExpression"  ":" objectPropertyExpression  )* "}"  ;
	
	InverseFunctionalObjectProperty::= "InverseFunctionalObjectProperty" "(" axiomAnnotations* objectPropertyExpression ")";  // "InverseFunctionalObjectProperty"  "{" ( "axiomAnnotations"  ":" axiomAnnotations | "objectPropertyExpression"  ":" objectPropertyExpression  )* "}"  ;
	
	ReflexiveObjectProperty::= "ReflexiveObjectProperty" "(" axiomAnnotations* objectPropertyExpression ")";  // "ReflexiveObjectProperty"  "{" ( "axiomAnnotations"  ":" axiomAnnotations | "objectPropertyExpression"  ":" objectPropertyExpression  )* "}"  ;
	
	IrreflexiveObjectProperty::= "IrreflexiveObjectProperty" "(" axiomAnnotations* objectPropertyExpression ")";  // "IrreflexiveObjectProperty"  "{" ( "axiomAnnotations"  ":" axiomAnnotations | "objectPropertyExpression"  ":" objectPropertyExpression  )* "}"  ;
	
	SymmetricObjectProperty::= "SymmetricObjectProperty" "(" axiomAnnotations* objectPropertyExpression ")";  // "SymmetricObjectProperty"  "{" ( "axiomAnnotations"  ":" axiomAnnotations | "objectPropertyExpression"  ":" objectPropertyExpression  )* "}"  ;
	
	AsymmetricObjectProperty::= "AsymmetricObjectProperty" "(" axiomAnnotations* objectPropertyExpression ")";  // "AsymmetricObjectProperty"  "{" ( "axiomAnnotations"  ":" axiomAnnotations | "objectPropertyExpression"  ":" objectPropertyExpression  )* "}"  ;
	
	TransitiveObjectProperty::= "TransitiveObjectProperty" "(" axiomAnnotations* objectPropertyExpression ")";  // "TransitiveObjectProperty" "{" ( "axiomAnnotations"  ":" axiomAnnotations | "objectPropertyExpression"  ":" objectPropertyExpression  )* "}"  ;
	//ObjectPropertyAxiom end
	
	//DataPropertyAxiom begin
	SubDataPropertyOf::= "SubDataPropertyOf" "(" axiomAnnotations* subDataPropertyExpression superDataPropertyExpression ")";  // "SubDataPropertyOf"  "{" ( "axiomAnnotations"  ":" axiomAnnotations | "superDataPropertyExpression"  ":" superDataPropertyExpression | "subDataPropertyExpression"  ":" subDataPropertyExpression  )* "}"  ;
	
	EquivalentDataProperties::= "EquivalentDataProperties" "(" axiomAnnotations* dataPropertyExpressions dataPropertyExpressions+ ")";  // "EquivalentDataProperties"  "{" ( "axiomAnnotations"  ":" axiomAnnotations | "dataPropertyExpressions"  ":" dataPropertyExpressions  )* "}"  ;
	
	DisjointDataProperties::= "DisjointDataProperties" "(" axiomAnnotations* dataPropertyExpressions dataPropertyExpressions+ ")";  // "DisjointDataProperties"  "{" ( "axiomAnnotations"  ":" axiomAnnotations | "dataPropertyExpressions"  ":" dataPropertyExpressions  )* "}"  ;
	
	DataPropertyDomain::= "DataPropertyDomain" "(" axiomAnnotations* dataPropertyExpression domain ")";  // "DataPropertyDomain"  "{" ( "axiomAnnotations"  ":" axiomAnnotations | "domain"  ":" domain | "dataPropertyExpression"  ":" dataPropertyExpression  )* "}"  ;
	
	DataPropertyRange::= "DataPropertyRange" "(" axiomAnnotations* dataPropertyExpression range ")";  // "DataPropertyRange"  "{" ( "axiomAnnotations"  ":" axiomAnnotations | "range"  ":" range | "dataPropertyExpression"  ":" dataPropertyExpression  )* "}"  ;
	
	FunctionalDataProperty::= "FunctionalDataProperty" "(" axiomAnnotations* dataPropertyExpression ")";  // "FunctionalDataProperty"  "{" ( "axiomAnnotations"  ":" axiomAnnotations | "dataPropertyExpression"  ":" dataPropertyExpression  )* "}"  ;
	//DataPropertyAxiom end
	
	KeyFor::= "KeyFor" "(" axiomAnnotations* classExpression "(" objectPropertyExpressions* ")" "(" dataPropertyExpressions* ")" ")";  // "KeyFor"  "{" ( "axiomAnnotations"  ":" axiomAnnotations | "classExpression"  ":" classExpression | "dataPropertyExpressions"  ":" dataPropertyExpressions | "objectPropertyExpressions"  ":" objectPropertyExpressions  )* "}"  ;
	
	//Assertion begin
	SameIndividual::= "SameIndividual" "(" axiomAnnotations* sameIndividuals sameIndividuals+ ")";  // "SameIndividual"  "{" ( "axiomAnnotations"  ":" axiomAnnotations | "sameIndividuals"  ":" sameIndividuals  )* "}"  ;
	
	DifferentIndividuals::= "DifferentIndividuals" "(" axiomAnnotations* differentIndividuals differentIndividuals+ ")";  // "DifferentIndividuals"  "{" ( "axiomAnnotations"  ":" axiomAnnotations | "differentIndividuals"  ":" differentIndividuals  )* "}"  ;
	
	ClassAssertion::= "ClassAssertion" "(" axiomAnnotations* individual classExpression ")";  // "ClassAssertion"  "{" ( "axiomAnnotations"  ":" axiomAnnotations | "individual"  ":" individual | "classExpression"  ":" classExpression  )* "}"  ;
	
	ObjectPropertyAssertion::= "ObjectPropertyAssertion" "(" axiomAnnotations* objectPropertyExpression sourceIndividual targetIndividual ")";  // "ObjectPropertyAssertion"  "{" ( "axiomAnnotations"  ":" axiomAnnotations | "objectPropertyExpression"  ":" objectPropertyExpression | "sourceIndividual"  ":" sourceIndividual | "targetIndividual"  ":" targetIndividual  )* "}"  ;
	
	NegativeObjectPropertyAssertion::= "NegativeObjectPropertyAssertion" "(" axiomAnnotations* objectPropertyExpression sourceIndividual targetIndividual ")";  // "NegativeObjectPropertyAssertion"  "{" ( "axiomAnnotations"  ":" axiomAnnotations | "objectPropertyExpression"  ":" objectPropertyExpression | "sourceIndividual"  ":" sourceIndividual | "targetIndividual"  ":" targetIndividual  )* "}"  ;
	
	DataPropertyAssertion::= "DataPropertyAssertion" "(" axiomAnnotations* dataPropertyExpression sourceIndividual targetValue ")";  // "DataPropertyAssertion"  "{" ( "axiomAnnotations"  ":" axiomAnnotations | "dataPropertyExpression"  ":" dataPropertyExpression | "targetValue"  ":" targetValue | "sourceIndividual"  ":" sourceIndividual  )* "}"  ;
	
	NegativeDataPropertyAssertion::= "NegativeDataPropertyAssertion" "(" axiomAnnotations* dataPropertyExpression sourceIndividual targetValue ")";  // "NegativeDataPropertyAssertion"  "{" ( "axiomAnnotations"  ":" axiomAnnotations | "dataPropertyExpression"  ":" dataPropertyExpression | "targetValue"  ":" targetValue | "sourceIndividual"  ":" sourceIndividual  )* "}"  ;
	//Assertion end
	
	//Axiom end
	
	// Annotation yet to be done
	
	Annotation::= ("Annotation" | "Comment" | "Label") "(" annotationProperty+ ")";  // "Annotation"  "{" ( "annotationProperty"  ":" annotationProperty  )* "}"  ;
	
	AnnotationProperty::= entityURI+ ;  // "AnnotationProperty"  "{" ( "entityURI"  ":" entityURI  )* "}"  ;
	
	EntityAnnotation::= "EntityAnnotation" "(" ("AnnotationProperty" | "Datatype" | "ObjectProperty" | "Class" | "NamedIndividual" | "DataProperty") "(" entity ")" entityAnnotations+ ")";  // "EntityAnnotation"  "{" ( "axiomAnnotations"  ":" axiomAnnotations | "entity"  ":" entity | "entityAnnotations"  ":" entityAnnotations  )* "}"  ;
	
//	AnnotationByConstant::= "AnnotationByConstant"  "{" ( "annotationProperty"  ":" annotationProperty | "annotationValue"  ":" annotationValue  )* "}"  ;
	
//	AnnotationByEntity::= "AnnotationByEntity"  "{" ( "annotationProperty"  ":" annotationProperty | "annotationValue"  ":" annotationValue  )* "}"  ;
	
//	AnnotationByAnonymousIndividual::= "AnnotationByAnonymousIndividual"  "{" ( "annotationProperty"  ":" annotationProperty | "annotationValue"  ":" annotationValue  )* "}"  ;
		
//	AnonymousIndividualAnnotation::= "AnonymousIndividualAnnotation"  "{" ( "axiomAnnotations"  ":" axiomAnnotations | "anonymousIndividual"  ":" anonymousIndividual | "anonymousIndiviudalAnnotations"  ":" anonymousIndiviudalAnnotations  )* "}"  ;



// The following will (temporarily) not be used

//	SubObjectProperty::= "SubObjectProperty"  "{"  "}"  ;
		
//	Package::= "Package"  "{" ( "ownedTemplateSignature"  ":" ownedTemplateSignature | "templateBinding"  ":" templateBinding | "expressions"  ":" expressions | "axioms"  ":" axioms | "PackageUri"  ":" PackageUri['"','"']  )* "}"  ;
	
//	TemplateParameter::= "TemplateParameter"  "{" ( "ownedParameteredElement"  ":" ownedParameteredElement | "signature"  ":" signature[]| "parameteredElement"  ":" parameteredElement[] )* "}"  ;
	
//	ParameterableElement::= "ParameterableElement"  "{" ( "owningTemplateParameter"  ":" owningTemplateParameter[]| "templateParameter"  ":" templateParameter[] )* "}"  ;
	
//	TemplateSignature::= "TemplateSignature"  "{" ( "parameter"  ":" parameter[]| "ownedParameter"  ":" ownedParameter | "template"  ":" template[] )* "}"  ;
	
//	TemplateableElement::= "TemplateableElement"  "{" ( "ownedTemplateSignature"  ":" ownedTemplateSignature | "templateBinding"  ":" templateBinding  )* "}"  ;
	
//	ClassifierTemplateParameter::= "ClassifierTemplateParameter"  "{" ( "ownedParameteredElement"  ":" ownedParameteredElement | "signature"  ":" signature[]| "parameteredElement"  ":" parameteredElement[] )* "}"  ;
	
//	TemplateParameterSubstitution::= "TemplateParameterSubstitution"  "{" ( "actual"  ":" actual[]| "formal"  ":" formal[]| "templateBinding"  ":" templateBinding[] )* "}"  ;
	
//	TemplateBinding::= "TemplateBinding"  "{" ( "parameterSubstitution"  ":" parameterSubstitution | "boundElement"  ":" boundElement[]| "signature"  ":" signature[] )* "}"  ;
	
//	Rule::= "Rule"  "{" ( "axiomAnnotations"  ":" axiomAnnotations | "hasAntecedent"  ":" hasAntecedent | "hasConsequent"  ":" hasConsequent | "swrlVariables"  ":" swrlVariables | "name"  ":" name['"','"']  )* "}"  ;
	
//	Antecedent::= "Antecedent"  "{" ( "containsAtoms"  ":" containsAtoms | "name"  ":" name['"','"']  )* "}"  ;
	
//	Consequent::= "Consequent"  "{" ( "containsAtoms"  ":" containsAtoms | "name"  ":" name['"','"']  )* "}"  ;
	
//	DataRangeAtom::= "DataRangeAtom"  "{" ( "isInConsequent"  ":" isInConsequent[]| "isInAntecedent"  ":" isInAntecedent[]| "hasPredicateSymbol"  ":" hasPredicateSymbol | "hasTerm"  ":" hasTerm  )* "}"  ;
	
//	ClassAtom::= "ClassAtom"  "{" ( "isInConsequent"  ":" isInConsequent[]| "isInAntecedent"  ":" isInAntecedent[]| "hasPredicateSymbol"  ":" hasPredicateSymbol | "hasTerm"  ":" hasTerm  )* "}"  ;
	
//	IndividualPropetyAtom::= "IndividualPropetyAtom"  "{" ( "isInConsequent"  ":" isInConsequent[]| "isInAntecedent"  ":" isInAntecedent[]| "hasPredicateSymbol"  ":" hasPredicateSymbol | "atomTarget"  ":" atomTarget | "atomSource"  ":" atomSource  )* "}"  ;
	
//	DatavaluedPropertyAtom::= "DatavaluedPropertyAtom"  "{" ( "isInConsequent"  ":" isInConsequent[]| "isInAntecedent"  ":" isInAntecedent[]| "hasPredicateSymbol"  ":" hasPredicateSymbol | "atomTarget"  ":" atomTarget | "atomSource"  ":" atomSource  )* "}"  ;
	
//	DataVariable::= "DataVariable"  "{" ( "name"  ":" name['"','"']  )* "}"  ;
	
//	IndividualVariable::= "IndividualVariable"  "{" ( "name"  ":" name['"','"']  )* "}"  ;
	
//	BuiltInAtom::= "BuiltInAtom"  "{" ( "isInConsequent"  ":" isInConsequent[]| "isInAntecedent"  ":" isInAntecedent[]| "hasPredicateSymbol"  ":" hasPredicateSymbol[]| "hasTerms"  ":" hasTerms  )* "}"  ;
	
}