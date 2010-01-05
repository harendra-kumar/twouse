SYNTAXDEF sparqlas
FOR <http://west.uni-koblenz.de/SPARQLAS>
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
	overrideProjectFile = "true";
	resourcePluginID = "de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas";
	basePackage = "de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas";
} 

TOKENS {
	DEFINE WHITESPACE $(' '|'\t'|'\f')$;
	DEFINE LINEBREAKS $('\r\n'|'\r'|'\n')$;
	DEFINE COMMENT$'//'(~('\n'|'\r'|'\uffff'))*$;
	DEFINE INTEGER$('-')?('1'..'9')('0'..'9')*|'0'$;
	DEFINE FLOAT$('-')?(('1'..'9') ('0'..'9')* | '0') '.' ('0'..'9')+$;
	
	DEFINE LITERAL$('"')('A'..'Z' | 'a'..'z' | '0'..'9' | '-')+('"')$;
	DEFINE NODE$('_')(':')('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-')+$;
	DEFINE VARIABLE$('?')('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-')+$;
	DEFINE ABBRIRI$(('A'..'Z' | 'a'..'z' | '0'..'9' | '-')+ | ('A'..'Z' | 'a'..'z' | '0'..'9' | '-')+(':')('A'..'Z' | 'a'..'z' | '0'..'9' |'_' | '-')+)$;
	DEFINE FULLIRI$'<' (~( '^' | '<' | '>' | '"' | '{' | '}' | '`' | '\\' | '\u0000'..'\u0020' ))* '>'$;
}

TOKENSTYLES {
	"NODE" COLOR #7F0055;
	"VARIABLE" COLOR #2a7fff;
	"ABBRIRI" COLOR #000000;
	"FULLIRI" COLOR #7F0055, BOLD;
	
	"Namespace" COLOR #7F0055, BOLD;
	"Query" COLOR #7F0055, BOLD;
	"PropertyValue" COLOR #7F0055, BOLD;
	"Type" COLOR #7F0055, BOLD;
	"SameAs" COLOR #7F0055, BOLD;
	"DifferentFrom" COLOR #7F0055, BOLD;
	"EquivalentTo" COLOR #7F0055, BOLD;
	"SubClassOf" COLOR #7F0055, BOLD;
	"DisjointWith" COLOR #7F0055, BOLD;
	"Or" COLOR #7F0055, BOLD;
	"Not" COLOR #7F0055, BOLD;
	"OneOf" COLOR #7F0055, BOLD;
	"And" COLOR #7F0055, BOLD;
	"All" COLOR #7F0055, BOLD;
	"Some" COLOR #7F0055, BOLD;
	"Has" COLOR #7F0055, BOLD;
	"Min" COLOR #7F0055, BOLD;
	"Max" COLOR #7F0055, BOLD;
	"Exact" COLOR #7F0055, BOLD;
	"EquivalentProperty" COLOR #7F0055, BOLD;
	"SubPropertyOf" COLOR #7F0055, BOLD;
	"InverseOf" COLOR #7F0055, BOLD;
	"Functional" COLOR #7F0055, BOLD;
	"InverseFunctional" COLOR #7F0055, BOLD;
	"Transitive" COLOR #7F0055, BOLD;
	"Symmetric" COLOR #7F0055, BOLD;
	"ObjectProperty" COLOR #7F0055, BOLD;
	"DatatypeProperty" COLOR #7F0055, BOLD;
	"Individual" COLOR #7F0055, BOLD;
	"Class" COLOR #7F0055, BOLD;
}

RULES {
	
	// IRI
	FullIRI::= id[FULLIRI];
	AbbreviatedIRI::= id[ABBRIRI];
	
	// OntologyDocument
	OntologyDocument::= prefixDefinition* query;
	PrefixDefinition::= "Namespace" "(" pref[ABBRIRI]? "=" namespace ")";
	
	// Query
	Query::= "Query" "(" queryIRI? atoms* ")";
	
	// Variables
	ClassVariable::=  symbol[VARIABLE];
	ObjectPropertyVariable::= symbol[VARIABLE];
	DataPropertyVariable::= symbol[VARIABLE];
	IndividualVariable::=  symbol[VARIABLE];
	
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
	ObjectPropertyAssertion::= "PropertyValue" "(" sourceIndividual objectPropertyExpression targetIndividual ")";
	DataPropertyAssertion::= "PropertyValue" "(" sourceIndividual dataPropertyExpression targetValue ")";
	ClassAssertion::= "Type" "(" individual classExpression ")";
	SameIndividual::= "SameAs" "(" individuals individuals+ ")";
	DifferentIndividuals::= "DifferentFrom" "(" individuals individuals+ ")";
	
	// ClassAtom
	EquivalentClasses::= "EquivalentTo" "(" classExpressions classExpressions+ ")";
	SubClassOf::= "SubClassOf" "(" subClassExpression superClassExpression ")";
	DisjointClasses::= "DisjointWith" "(" classExpressions classExpressions+ ")";
	
	// ClassExpression
	ObjectUnionOf::= "Or" "(" classExpressions classExpressions+ ")";
	ObjectComplementOf::= "Not" "(" classExpression ")";
	ObjectOneOf::= "OneOf" "(" individuals+ ")";
	ObjectIntersectionOf::= "And" "(" classExpressions classExpressions+")";
	ObjectAllValuesFrom::= "All" "(" objectPropertyExpression classExpression ")";
	ObjectSomeValuesFrom::= "Some" "(" objectPropertyExpression classExpression ")";
	ObjectHasValue::= "Has" "(" objectPropertyExpression individual ")";
	ObjectMinCardinality::= "Min" "(" cardinality[INTEGER] objectPropertyExpression classExpression? ")";
	ObjectMaxCardinality::= "Max" "(" cardinality[INTEGER] objectPropertyExpression classExpression? ")";
	ObjectExactCardinality::= "Exact" "(" cardinality[INTEGER] objectPropertyExpression classExpression?  ")";
	DataHasValue::= "Has" "(" dataPropertyExpression literal ")";
	
	// ObjectPropertyAtom
	EquivalentObjectProperties::= "EquivalentProperty" "(" objectPropertyExpression objectPropertyExpression+ ")";
	SubPropertyOf::= "SubPropertyOf" "(" subObjectPropertyExpression superObjectPropertyExpression ")";
	InverseObjectPropertyAtom::= "InverseOf" "(" objectPropertyExpression1 objectPropertyExpression2 ")";
	FunctionalObjectProperty::= "Functional" "(" objectPropertyExpression ")";
	InverseFunctionalObjectProperty::= "InverseFunctional" "(" objectPropertyExpression ")";
	TransitiveObjectProperty::= "Transitive" "(" objectPropertyExpression ")";
	SymmetricObjectProperty::= "Symmetric" "(" objectPropertyExpression ")";
	
	// ObjectPropertyExpression
	InverseObjectProperty::= "InverseOf" "(" objectProperty ")";
	
	// Declaration
	ObjectPropertyDeclaration::= "ObjectProperty" "(" objectPropertyVariable ")";
	DatatypePropertyDeclaration::= "DatatypeProperty" "(" datatypePropertyVariable ")";
	IndividualDeclaration::= "Individual" "(" individualVariable ")";
	ClassDeclaration::= "Class" "(" classVariable ")";
	
}