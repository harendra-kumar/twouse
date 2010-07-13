SYNTAXDEF sparqlas
FOR <http://west.uni-koblenz.de/sparqlas>
START OntologyDocument

OPTIONS {	
	licenceHeader ="platform:/resource/org.reuseware/licence.txt";
	generateCodeFromGeneratorModel = "true";
	reloadGeneratorModel = "true";
	tokenspace = "1";
	//memoize = "true";
	usePredefinedTokens = "false";
	overridePluginXML = "false";
	overrideManifest = "false";
	overrideBuildProperties = "true";
	overrideClasspath = "true";
	overrideProjectFile = "false";
	resourcePluginID = "west.twouse.language.sparqlas.resource.sparqlas";
	basePackage = "west.twouse.language.sparqlas.resource.sparqlas";
} 

TOKENS {
	DEFINE WHITESPACE $(' '|'\t'|'\f')$;
	DEFINE LINEBREAKS $('\r\n'|'\r'|'\n')$;
	DEFINE COMMENT$'//'(~('\n'|'\r'|'\uffff'))*$;
	DEFINE INTEGER$('-')?('1'..'9')('0'..'9')*|'0'$;
	DEFINE FLOAT$('-')?(('1'..'9') ('0'..'9')* | '0') '.' ('0'..'9')+$;
	
	DEFINE LITERAL$ '"' ( ~( '\u0022' | '\u005C' ) | ('\\'('t'|'b'|'n'|'r'|'f'|'\\'|'\"'|'\'')) )* '"' $;
	DEFINE VARIABLE$ (('?') | ('\u0024')) ('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-')+ $;
	DEFINE NODE$ '_:'('A'..'Z' | 'a'..'z' | '\u00C0'..'\u00D6' | '\u00D8'..'\u00F6' | '\u00F8'..'\u02FF' | '\u0370'..'\u037D' | '\u037F'..'\u1FFF' | '\u200C'..'\u200D' | '\u2070'..'\u218F' | '\u2C00'..'\u2FEF' | '\u3001'..'\uD7FF' | '\uF900'..'\uFDCF' | '\uFDF0'..'\uFFFD' | '_' | '0'..'9' ) (('A'..'Z' | 'a'..'z' | '\u00C0'..'\u00D6'| '\u00D8'..'\u00F6' | '\u00F8'..'\u02FF' | '\u0370'..'\u037D' | '\u037F'..'\u1FFF' | '\u200C'..'\u200D' | '\u2070'..'\u218F' | '\u2C00'..'\u2FEF' | '\u3001'..'\uD7FF' | '\uF900'..'\uFDCF' | '\uFDF0'..'\uFFFD' | '_' | '0'..'9' | '\u00B7' | '\u0300'..'\u036F' | '\u203F'..'\u2040' | '.' )* ('A'..'Z' | 'a'..'z' | '\u00C0'..'\u00D6'| '\u00D8'..'\u00F6' | '\u00F8'..'\u02FF' | '\u0370'..'\u037D' | '\u037F'..'\u1FFF' | '\u200C'..'\u200D' | '\u2070'..'\u218F' | '\u2C00'..'\u2FEF' | '\u3001'..'\uD7FF' | '\uF900'..'\uFDCF' | '\uFDF0'..'\uFFFD' | '_' | '.' | '0'..'9' | '\u00B7' | '\u0300'..'\u036F' | '\u203F'..'\u2040'))? $ ;
	DEFINE FULLIRI$ '<' (~( '^' | '<' | '>' | '"' | '{' | '}' | '`' | '\\' | '\u0000'..'\u0020' ))* '>' $;
	DEFINE ABBRIRI$ ((('A'..'Z' | 'a'..'z' | '\u00C0'..'\u00D6' | '\u00D8'..'\u00F6' | '\u00F8'..'\u02FF' | '\u0370'..'\u037D' | '\u037F'..'\u1FFF' | '\u200C'..'\u200D' | '\u2070'..'\u218F' | '\u2C00'..'\u2FEF' | '\u3001'..'\uD7FF' | '\uF900'..'\uFDCF' | '\uFDF0'..'\uFFFD' | '_' | '-' | '0'..'9' ) ('A'..'Z' | 'a'..'z' | '\u00C0'..'\u00D6' | '\u00D8'..'\u00F6' | '\u00F8'..'\u02FF' | '\u0370'..'\u037D' | '\u037F'..'\u1FFF' | '\u200C'..'\u200D' | '\u2070'..'\u218F' | '\u2C00'..'\u2FEF' | '\u3001'..'\uD7FF' | '\uF900'..'\uFDCF' | '\uFDF0'..'\uFFFD' | '_' | '-' | '0'..'9' | '\u00B7' | '\u0300'..'\u036F' | '\u203F'..'\u2040' | '.' )*) |
	((('A'..'Z' | 'a'..'z' | '\u00C0'..'\u00D6' | '\u00D8'..'\u00F6' | '\u00F8'..'\u02FF' | '\u0370'..'\u037D' | '\u037F'..'\u1FFF' | '\u200C'..'\u200D' | '\u2070'..'\u218F' | '\u2C00'..'\u2FEF' | '\u3001'..'\uD7FF' | '\uF900'..'\uFDCF' | '\uFDF0'..'\uFFFD') ('A'..'Z' | 'a'..'z' | '\u00C0'..'\u00D6' | '\u00D8'..'\u00F6' | '\u00F8'..'\u02FF' | '\u0370'..'\u037D' | '\u037F'..'\u1FFF' | '\u200C'..'\u200D' | '\u2070'..'\u218F' | '\u2C00'..'\u2FEF' | '\u3001'..'\uD7FF' | '\uF900'..'\uFDCF' | '\uFDF0'..'\uFFFD' | '_' | '-' | '0'..'9' | '\u00B7' | '\u0300'..'\u036F' | '\u203F'..'\u2040' | '.')*) ':'
	('A'..'Z' | 'a'..'z' | '\u00C0'..'\u00D6' | '\u00D8'..'\u00F6' | '\u00F8'..'\u02FF' | '\u0370'..'\u037D' | '\u037F'..'\u1FFF' | '\u200C'..'\u200D' | '\u2070'..'\u218F' | '\u2C00'..'\u2FEF' | '\u3001'..'\uD7FF' | '\uF900'..'\uFDCF' | '\uFDF0'..'\uFFFD' | '_' | '-' | '0'..'9' ) ('A'..'Z' | 'a'..'z' | '\u00C0'..'\u00D6' | '\u00D8'..'\u00F6' | '\u00F8'..'\u02FF' | '\u0370'..'\u037D' | '\u037F'..'\u1FFF' | '\u200C'..'\u200D' | '\u2070'..'\u218F' | '\u2C00'..'\u2FEF' | '\u3001'..'\uD7FF' | '\uF900'..'\uFDCF' | '\uFDF0'..'\uFFFD' | '_' | '-' | '0'..'9' | '\u00B7' | '\u0300'..'\u036F' | '\u203F'..'\u2040' | '.' )*))$;
}

TOKENSTYLES {
	// Tokens
	"NODE" COLOR #7F0055;
	"VARIABLE" COLOR #2a7fff;
	"ABBRIRI" COLOR #000000;
	"FULLIRI" COLOR #7F0055, BOLD;
	
	// SPARQLAS
	"Import" COLOR #7F0055, BOLD;
	"Namespace" COLOR #7F0055, BOLD;
	"Select" COLOR #7F0055, BOLD;
	"Construct" COLOR #7F0055, BOLD;
	"Ask" COLOR #7F0055, BOLD;
	"Describe" COLOR #7F0055, BOLD;
	"Where" COLOR #7F0055, BOLD;
		
	// OWL Functional Syntax
	"ObjectPropertyAssertion" COLOR #7F0055, BOLD;
	"DataPropertyAssertion" COLOR #7F0055, BOLD;
	"ClassAssertion" COLOR #7F0055, BOLD;
	"NegativeObjectPropertyAssertion" COLOR #7F0055, BOLD;
	"NegativeDataPropertyAssertion" COLOR #7F0055, BOLD;
	"SameIndividual" COLOR #7F0055, BOLD;
	"DifferentIndividuals" COLOR #7F0055, BOLD;
	"EquivalentClasses" COLOR #7F0055, BOLD;
	"SubClassOf" COLOR #7F0055, BOLD;
	"DisjointClasses" COLOR #7F0055, BOLD;
	"DisjointUnion" COLOR #7F0055, BOLD;
	"ObjectUnionOf" COLOR #7F0055, BOLD;
	"ObjectComplementOf" COLOR #7F0055, BOLD;
	"ObjectOneOf" COLOR #7F0055, BOLD;
	"ObjectIntersectionOf" COLOR #7F0055, BOLD;
	"ObjectAllValuesFrom" COLOR #7F0055, BOLD;
	"ObjectSomeValuesFrom" COLOR #7F0055, BOLD;
	"ObjectHasValue" COLOR #7F0055, BOLD;
	"ObjectMinCardinality" COLOR #7F0055, BOLD;
	"ObjectMaxCardinality" COLOR #7F0055, BOLD;
	"ObjectExactCardinality" COLOR #7F0055, BOLD;
	"DataAllValuesFrom" COLOR #7F0055, BOLD;
	"DataSomeValuesFrom" COLOR #7F0055, BOLD;
	"DataHasValue" COLOR #7F0055, BOLD;
	"DataMinCardinality" COLOR #7F0055, BOLD;
	"DataMaxCardinality" COLOR #7F0055, BOLD;
	"DataExactCardinality" COLOR #7F0055, BOLD;	
	"DataUnionOf" COLOR #7F0055, BOLD;
	"DataComplementOf" COLOR #7F0055, BOLD;
	"DataOneOf" COLOR #7F0055, BOLD;
	"DataIntersectionOf" COLOR #7F0055, BOLD;
	"DatatypeRestriction" COLOR #7F0055, BOLD;
	"EquivalentObjectProperties" COLOR #7F0055, BOLD;
	"DisjointObjectProperties" COLOR #7F0055, BOLD;
	"SubObjectPropertyOf" COLOR #7F0055, BOLD;
	"ObjectPropertyDomain" COLOR #7F0055, BOLD;
	"ObjectPropertyRange" COLOR #7F0055, BOLD;
	"InverseObjectProperties" COLOR #7F0055, BOLD;
	"FunctionalObjectProperty" COLOR #7F0055, BOLD;
	"InverseFunctionalObjectProperty" COLOR #7F0055, BOLD;
	"TransitiveObjectProperty" COLOR #7F0055, BOLD;
	"SymmetricObjectProperty" COLOR #7F0055, BOLD;
	"AsymmetricObjectProperty" COLOR #7F0055, BOLD;
	"ReflexiveObjectProperty" COLOR #7F0055, BOLD;
	"IrreflexiveObjectProperty" COLOR #7F0055, BOLD;
	"EquivalentDataProperties" COLOR #7F0055, BOLD;
	"DisjointDataProperties" COLOR #7F0055, BOLD;
	"SubDataPropertyOf" COLOR #7F0055, BOLD;
	"DataPropertyDomain" COLOR #7F0055, BOLD;
	"DataPropertyRange" COLOR #7F0055, BOLD;
	"FunctionalDataProperty" COLOR #7F0055, BOLD;
	"ObjectInverseOf" COLOR #7F0055, BOLD;
	"ObjectProperty" COLOR #7F0055, BOLD;
	"DataProperty" COLOR #7F0055, BOLD;
	"NamedIndividual" COLOR #7F0055, BOLD;
	"Class" COLOR #7F0055, BOLD;
	
	// Edited Manchester Syntax
	"PropertyValue" COLOR #7F0055, BOLD;
	"Type" COLOR #7F0055, BOLD;
	"NegativePropertyValue" COLOR #7F0055, BOLD;
	"SameAs" COLOR #7F0055, BOLD;
	"DifferentFrom" COLOR #7F0055, BOLD;
	"EquivalentTo" COLOR #7F0055, BOLD;
	"DisjointWith" COLOR #7F0055, BOLD;
	"Or" COLOR #7F0055, BOLD;
	"Not" COLOR #7F0055, BOLD;
	"One" COLOR #7F0055, BOLD;
	"And" COLOR #7F0055, BOLD;
	"All" COLOR #7F0055, BOLD;
	"Some" COLOR #7F0055, BOLD;
	"Has" COLOR #7F0055, BOLD;
	"Min" COLOR #7F0055, BOLD;
	"Max" COLOR #7F0055, BOLD;
	"Exact" COLOR #7F0055, BOLD;
	"EquivalentProperty" COLOR #7F0055, BOLD;
	"DisjointProperty" COLOR #7F0055, BOLD;
	"SubPropertyOf" COLOR #7F0055, BOLD;
	"Domain" COLOR #7F0055, BOLD;
	"Range" COLOR #7F0055, BOLD;
	"InverseOf" COLOR #7F0055, BOLD;
	"InverseFunctional" COLOR #7F0055, BOLD;
	"Transitive" COLOR #7F0055, BOLD;
	"Symmetric" COLOR #7F0055, BOLD;
	"Asymmetric" COLOR #7F0055, BOLD;
	"Reflexive" COLOR #7F0055, BOLD;
	"Irreflexive" COLOR #7F0055, BOLD;
	
	// Templates
    "Parameter" COLOR #7F00BB, BOLD;
    "Bind" COLOR #7F00BB, BOLD;
    
    // SPARQL-DL
	"DirectType" COLOR #7F0055, BOLD;
	"DirectSubClassOf" COLOR #7F0055, BOLD;
	"StrictSubClassOf" COLOR #7F0055, BOLD;
}

RULES {
	
	// IRI
	FullIRI::= id[FULLIRI];
	AbbreviatedIRI::= id[ABBRIRI];
	
	// OntologyDocument
	OntologyDocument::= ("IRI" "(" queryIRI ")" !0)? (import !0)* (prefixDefinition !0)* query;
	Import::= "Import" "(" importIRI ")";
	PrefixDefinition::= "Namespace" "(" pref[ABBRIRI]? "=" namespace ")";
	
	// Query
	SelectQuery::= "Select" (variables+ | "*")? !0 "Where" "(" ownedTemplateSignature? templateBinding* atoms* ")";
	ConstructQuery::= "Construct" "(" ownedTemplateSignature? templateBinding* constructAtoms* ")" !0 "Where" "(" whereAtoms* ")";
	AskQuery::= "Ask" !0 "Where" "(" ownedTemplateSignature? templateBinding* atoms* ")";
	DescribeQuery::= "Describe" (describeIRI | (!0 "Where" "(" ownedTemplateSignature? templateBinding* atoms* ")"));
	
	// Variables
	Variable::= symbol[VARIABLE];
	LiteralVariable::= symbol[VARIABLE];
	ClassVariable::= symbol[VARIABLE];
	ObjectPropertyVariable::= symbol[VARIABLE];
	DataPropertyVariable::= symbol[VARIABLE];
	IndividualVariable::= symbol[VARIABLE];
	
	// Constants
	Class::= constantIRI;
	Datatype::= constantIRI;
	ObjectProperty::= constantIRI;
	DataProperty::= constantIRI;
	NamedIndividual::= constantIRI;
	
	// AnonymousIndividual
	AnonymousIndividual::= nodeID[NODE];
	
	// Literal
	Literal::= lexicalForm[LITERAL] "^^" datatype;
	
	// Assertion
	ClassAssertion::= ( "ClassAssertion" | "Type" ) "(" classExpression individual ")";
	ObjectPropertyAssertion::= ( "ObjectPropertyAssertion" | "PropertyValue" ) "(" sourceIndividual objectPropertyExpression targetIndividual ")";
	DataPropertyAssertion::= ( "DataPropertyAssertion" | "PropertyValue" ) "(" sourceIndividual dataPropertyExpression targetValue ")";
	NegativeObjectPropertyAssertion::= ( "NegativeObjectPropertyAssertion" | "NegativePropertyValue" ) "(" sourceIndividual objectPropertyExpression targetIndividual ")";
	NegativeDataPropertyAssertion::= ( "NegativeDataPropertyAssertion" | "NegativePropertyValue" ) "(" sourceIndividual dataPropertyExpression targetValue ")";
	SameIndividual::= ( "SameIndividual" | "SameAs" ) "(" individuals individuals+ ")";
	DifferentIndividuals::= ( "DifferentIndividuals" | "DifferentFrom" ) "(" individuals individuals+ ")";
	
	// ClassAtom
	SubClassOf::= "SubClassOf" "(" subClassExpression superClassExpression ")";
	EquivalentClasses::= ( "EquivalentClasses" | "EquivalentTo" ) "(" classExpressions classExpressions+ ")";
	DisjointClasses::= ( "DisjointClasses" | "DisjointWith" ) "(" classExpressions classExpressions+ ")";
	DisjointUnion::= "DisjointUnion" "(" ( class | classVariable ) disjointClassExpressions disjointClassExpressions+ ")";
	
	// ClassExpression
	ObjectUnionOf::= ( "ObjectUnionOf" | "Or" ) "(" classExpressions classExpressions+ ")";
	ObjectComplementOf::= ( "ObjectComplementOf" | "Not" ) "(" classExpression ")";
	ObjectOneOf::= ( "ObjectOneOf" | "One" ) "(" individuals+ ")";
	ObjectIntersectionOf::= ( "ObjectIntersectionOf" | "And" ) "(" classExpressions classExpressions+")";
	ObjectAllValuesFrom::= ( "ObjectAllValuesFrom" | "All" ) "(" objectPropertyExpression classExpression ")";
	ObjectSomeValuesFrom::= ( "ObjectSomeValuesFrom" | "Some" ) "(" objectPropertyExpression classExpression ")";
	ObjectHasValue::= ( "ObjectHasValue" | "Has" ) "(" objectPropertyExpression individual ")";
	ObjectMinCardinality::= ( "ObjectMinCardinality" | "Min" ) "(" cardinality[INTEGER] objectPropertyExpression classExpression? ")";
	ObjectMaxCardinality::= ( "ObjectMaxCardinality" | "Max" ) "(" cardinality[INTEGER] objectPropertyExpression classExpression? ")";
	ObjectExactCardinality::= ( "ObjectExactCardinality" | "Exact" ) "(" cardinality[INTEGER] objectPropertyExpression classExpression?  ")";
	
	DataAllValuesFrom::= ( "DataAllValuesFrom" | "All" ) "(" dataPropertyExpressions dataRange ")";
	DataSomeValuesFrom::= ( "DataSomeValuesFrom" | "Some" ) "(" dataPropertyExpressions dataRange ")";
	DataHasValue::= ( "DataHasValue" | "Has" ) "(" dataPropertyExpression literal ")";
	DataMinCardinality::= ( "DataMinCardinality" | "Min" ) "(" cardinality[INTEGER] dataPropertyExpression dataRange? ")";
	DataMaxCardinality::= ( "DataMaxCardinality" | "Max" ) "(" cardinality[INTEGER] dataPropertyExpression dataRange? ")";
	DataExactCardinality::= ( "DataExactCardinality" | "Exact" ) "(" cardinality[INTEGER] dataPropertyExpression dataRange?  ")";

	//DataRange
	DataUnionOf::= ( "DataUnionOf" | "Or" ) "(" dataRanges dataRanges+ ")";
	DataComplementOf::= ( "DataComplementOf" | "Not" ) "(" dataRange ")";
	DataOneOf::= ( "DataOneOf" | "One" ) "(" literals+ ")";
	DataIntersectionOf::= ( "DataIntersectionOf" | "And" ) "(" dataRanges dataRanges+ ")";
	DatatypeRestriction ::= "DatatypeRestriction" "(" datatype restrictions+ ")";
	
	//FacetRestriction
	FacetRestriction ::= constrainingFacet restrictionValue;
	
	// ObjectPropertyAtom
	SubObjectPropertyOf::= ( "SubObjectPropertyOf" | "SubPropertyOf" ) "(" ( subObjectPropertyExpression | subObjectPropertyChain ) superObjectPropertyExpression ")";
	EquivalentObjectProperties::= ( "EquivalentObjectProperties" | "EquivalentProperty" ) "(" objectPropertyExpression objectPropertyExpression+ ")";
	DisjointObjectProperties::= ( "DisjointObjectProperties" | "DisjointProperty" ) "(" objectPropertyExpression objectPropertyExpression+ ")";
	ObjectPropertyDomain::= ( "ObjectPropertyDomain" | "Domain" ) "(" objectPropertyExpression domain ")";
	ObjectPropertyRange::= ( "ObjectPropertyRange" | "Range" ) "(" objectPropertyExpression range ")";
	InverseObjectPropertyAtom::= ( "InverseObjectProperties" | "InverseOf" ) "(" objectPropertyExpression1 objectPropertyExpression2 ")";
	FunctionalObjectProperty::= "FunctionalObjectProperty" "(" objectPropertyExpression ")";
	InverseFunctionalObjectProperty::= ( "InverseFunctionalObjectProperty" | "InverseFunctional" ) "(" objectPropertyExpression ")";
	ReflexiveObjectProperty::= ( "ReflexiveObjectProperty" | "Reflexive" ) "(" objectPropertyExpression ")";
	IrreflexiveObjectProperty::= ( "IrreflexiveObjectProperty" | "Irreflexive" ) "(" objectPropertyExpression ")";
	SymmetricObjectProperty::= ( "SymmetricObjectProperty" | "Symmetric" ) "(" objectPropertyExpression ")";
	AsymmetricObjectProperty::= ( "AsymmetricObjectProperty" | "Asymmetric" ) "(" objectPropertyExpression ")";
	TransitiveObjectProperty::= ( "TransitiveObjectProperty" | "Transitive" ) "(" objectPropertyExpression ")";
	
	// DataPropertyAtom
	SubDataPropertyOf::= ( "SubDataPropertyOf" | "SubPropertyOf" ) "(" subDataPropertyExpression superDataPropertyExpression ")";
	EquivalentDataProperties::= ( "EquivalentDataProperties" | "EquivalentProperty" ) "(" dataPropertyExpression dataPropertyExpression+ ")";
	DisjointDataProperties::= ( "DisjointDataProperties" | "DisjointProperty" ) "(" dataPropertyExpression dataPropertyExpression+ ")";
	DataPropertyDomain::= ( "DataPropertyDomain" | "Domain" ) "(" dataPropertyExpression domain ")";
	DataPropertyRange::= ( "DataPropertyRange" | "Range" ) "(" dataPropertyExpression range ")";
	FunctionalDataProperty::= "FunctionalDataProperty" "(" dataPropertyExpression ")";
	
	// ObjectPropertyExpression
	InverseObjectProperty::= ( "ObjectInverseOf" | "InverseOf" ) "(" objectProperty ")";
	
	// ObjectPropertyChain
	ObjectPropertyChain::= ( "ObjectPropertyChain" | "Chain" ) "(" objectPropertyExpression objectPropertyExpression+ ")";
	
	// HasKey
	HasKey::= "HasKey" "(" classExpression "(" objectPropertyExpression* ")" "(" dataPropertyExpression* ")" ")";
	
	// Declaration
	ClassDeclaration::= "Class" "(" ( class | classVariable ) ")";
	ObjectPropertyDeclaration::= "ObjectProperty" "(" ( objectProperty | objectPropertyVariable ) ")";
	DatatypePropertyDeclaration::= "DataProperty" "(" ( datatypeProperty | datatypePropertyVariable )")";
	IndividualDeclaration::= "NamedIndividual" "(" ( individual | individualVariable ) ")";
	
    // Templates
    TemplateSignature ::= ownedParameter ownedParameter*; 
    TemplateParameter ::= "Parameter" "(" parameteredElement ")";
    
    TemplateBinding::= "Bind" "(" parameterSubstitution parameterSubstitution* ")";
    TemplateParameterSubstitution::= "(" formal actual ")";      
	
	//SPARQL-DL	
	DirectClassAssertion::= "DirectType" "(" classExpression individual ")";
	DirectSubClassOf::= "DirectSubClassOf" "(" subClassExpression superClassExpression ")";
	StrictSubClassOf::= "StrictSubClassOf" "(" subClassExpression superClassExpression ")";
}