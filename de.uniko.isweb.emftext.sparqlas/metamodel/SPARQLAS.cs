SYNTAXDEF sparqlas
FOR <http://west.uni-koblenz.de/SPARQLAS>
START OntologyDocument

OPTIONS {	
	licenceHeader ="platform:/resource/org.reuseware/licence.txt";
	generateCodeFromGeneratorModel = "true";
	overrideManifest = "false";
	overrideBuildProperties = "false";
	overrideClasspath = "false";
	overrideProjectFile = "false";
	reloadGeneratorModel = "true";
	tokenspace = "1";
	//memoize = "true";
	usePredefinedTokens = "false";
} 

TOKENS {
	DEFINE WHITESPACE $(' '|'\t'|'\f')$;
	DEFINE LINEBREAKS $('\r\n'|'\r'|'\n')$;
	DEFINE COMMENT$'//'(~('\n'|'\r'|'\uffff'))*$;
	DEFINE INTEGER$('-')?('1'..'9')('0'..'9')*|'0'$;
	DEFINE FLOAT$('-')?(('1'..'9') ('0'..'9')* | '0') '.' ('0'..'9')+$;
	DEFINE STRING$('A'..'Z' | 'a'..'z' | '0'..'9' | '-')+$;
	DEFINE LITERAL$('"')('A'..'Z' | 'a'..'z' | '0'..'9' | '-')+('"')$;
	DEFINE NODE$('_')(':')('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-')+$;
	DEFINE VARIABLE$('?')('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-')+$;
	DEFINE ABBRIRI$('A'..'Z' | 'a'..'z' | '0'..'9' | '-')+(':')('A'..'Z' | 'a'..'z' | '0'..'9' |'_' | '-')+$;
	DEFINE FULLIRI $(('<')(~('>')|('\\''>'))*('>'))|(('A'..'Z' | ':' | 'a'..'z' | '0'..'9' | '-' )('A'..'Z' | ':' | 'a'..'z' | '0'..'9' | '_' | '-' )+)$;
}

TOKENSTYLES {
	"NODE" COLOR #7F0055;
	"VARIABLE" COLOR #2a7fff;
	"OntologyDocument" COLOR #7F0055, BOLD;
	"prefixDefinition" COLOR #7F0055, BOLD;
	"query" COLOR #7F0055, BOLD;
	"PrefixDefinition" COLOR #7F0055, BOLD;
	"pref" COLOR #7F0055, BOLD;
	"namespace" COLOR #7F0055, BOLD;
	"Query" COLOR #7F0055, BOLD;
	"queryIRI" COLOR #7F0055, BOLD;
	"atoms" COLOR #7F0055, BOLD;
	"ClassVariable" COLOR #7F0055, BOLD;
	"symbol" COLOR #7F0055, BOLD;
	"ObjectPropertyVariable" COLOR #7F0055, BOLD;
	"DataPropertyVariable" COLOR #7F0055, BOLD;
	"IndividualVariable" COLOR #7F0055, BOLD;
	"Class" COLOR #7F0055, BOLD;
	"constantIRI" COLOR #7F0055, BOLD;
	"Datatype" COLOR #7F0055, BOLD;
	"ObjectProperty" COLOR #7F0055, BOLD;
	"DataProperty" COLOR #7F0055, BOLD;
	"NamedIndividual" COLOR #7F0055, BOLD;
	"AnonymousIndividual" COLOR #7F0055, BOLD;
	"nodeID" COLOR #7F0055, BOLD;
	"Literal" COLOR #7F0055, BOLD;
	"lexicalForm" COLOR #7F0055, BOLD;
	"datatype" COLOR #7F0055, BOLD;
	"EquivalentClasses" COLOR #7F0055, BOLD;
	"classExpressions" COLOR #7F0055, BOLD;
	"SubClassOf" COLOR #7F0055, BOLD;
	"subClassExpression" COLOR #7F0055, BOLD;
	"superClassExpression" COLOR #7F0055, BOLD;
	"DisjointClasses" COLOR #7F0055, BOLD;
	"ObjectPropertyAssertion" COLOR #7F0055, BOLD;
	"sourceIndividual" COLOR #7F0055, BOLD;
	"tagertIndividual" COLOR #7F0055, BOLD;
	"objectPropertyExpression" COLOR #7F0055, BOLD;
	"DataPropertyAssertion" COLOR #7F0055, BOLD;
	"tagertValue" COLOR #7F0055, BOLD;
	"dataPropertyExpression" COLOR #7F0055, BOLD;
	"ClassAssertion" COLOR #7F0055, BOLD;
	"individual" COLOR #7F0055, BOLD;
	"classExpression" COLOR #7F0055, BOLD;
	"SameIndividual" COLOR #7F0055, BOLD;
	"individuals" COLOR #7F0055, BOLD;
	"DifferentIndividuals" COLOR #7F0055, BOLD;
	"EquivalentObjectProperties" COLOR #7F0055, BOLD;
	"SubPropertyOf" COLOR #7F0055, BOLD;
	"subObjectPropertyExpression" COLOR #7F0055, BOLD;
	"superObjectPropertyExpression" COLOR #7F0055, BOLD;
	"InverseObjectProperty" COLOR #7F0055, BOLD;
	"objectProperty" COLOR #7F0055, BOLD;
	"InverseObjectPropertyAtom" COLOR #7F0055, BOLD;
	"objectPropertyExpression1" COLOR #7F0055, BOLD;
	"objectPropertyExpression2" COLOR #7F0055, BOLD;
	"FunctionalObjectProperty" COLOR #7F0055, BOLD;
	"InverseFunctionalObjectProperty" COLOR #7F0055, BOLD;
	"TransitiveObjectProperty" COLOR #7F0055, BOLD;
	"SymmetricObjectProperty" COLOR #7F0055, BOLD;
	"ObjectUnionOf" COLOR #7F0055, BOLD;
	"ObjectComplementOf" COLOR #7F0055, BOLD;
	"ObjectOneOf" COLOR #7F0055, BOLD;
	"ObjectIntersectionOf" COLOR #7F0055, BOLD;
	"ObjectAllValuesFrom" COLOR #7F0055, BOLD;
	"ObjectSomeValuesFrom" COLOR #7F0055, BOLD;
	"ObjectHasValue" COLOR #7F0055, BOLD;
	"ObjectMinCardinality" COLOR #7F0055, BOLD;
	"cardinality" COLOR #7F0055, BOLD;
	"ObjectMaxCardinality" COLOR #7F0055, BOLD;
	"ObjectExactCardinality" COLOR #7F0055, BOLD;
	"DataHasValue" COLOR #7F0055, BOLD;
	"literal" COLOR #7F0055, BOLD;
	"FULLIRI" COLOR #7F0055, BOLD;
	"ABBRIRI" COLOR #7F0055, BOLD;
	"id" COLOR #7F0055, BOLD;
	"AbbreviatedIRI" COLOR #7F0055, BOLD;
	"ObjectPropertyDeclaration" COLOR #7F0055, BOLD;
	"objectPropertyVariable" COLOR #7F0055, BOLD;
	"DatatypePropertyDeclaration" COLOR #7F0055, BOLD;
	"datatypePropertyVariable" COLOR #7F0055, BOLD;
	"IndividualDeclaration" COLOR #7F0055, BOLD;
	"individualVariable" COLOR #7F0055, BOLD;
	"ClassDeclaration" COLOR #7F0055, BOLD;
	"classVariable" COLOR #7F0055, BOLD;
}

RULES {
	
	OntologyDocument::= prefixDefinition* query;  //"OntologyDocument"  "{" ( "prefixDefinition"  ":" prefixDefinition | "query"  ":" query  )* "}"  ;
	
	PrefixDefinition::= "Namespace" "(" pref[STRING]? "=" namespace ")";  // "PrefixDefinition" "{" ( "pref"  ":" pref['"','"'] | "namespace"  ":" namespace  )* "}"  ;
	
	Query::= "Query" "(" queryIRI? atoms* ")"; // "Query"  "{" ( "queryIRI"  ":" queryIRI | "atoms"  ":" atoms  )* "}"  ;
	
	ClassVariable::=  symbol[VARIABLE];  // "ClassVariable"  "{" ( "symbol"  ":" symbol['"','"']  )* "}"  ;
	
	ObjectPropertyVariable::= symbol[VARIABLE];  // "ObjectPropertyVariable"  "{" ( "symbol"  ":" symbol['"','"']  )* "}"  ;
	
	DataPropertyVariable::= symbol[VARIABLE];  // "DataPropertyVariable"  "{" ( "symbol"  ":" symbol['"','"']  )* "}"  ;
	
	IndividualVariable::=  symbol[VARIABLE];  // "IndividualVariable"  "{" ( "symbol"  ":" symbol['"','"']  )* "}"  ;
	
	Class::= constantIRI;  // "Class"  "{" ( "constantIRI"  ":" constantIRI )* "}"  ;
	
	Datatype::= constantIRI;  // "Datatype"  "{" ( "constantIRI"  ":" constantIRI )* "}"  ;
	
	ObjectProperty::= constantIRI;  // "ObjectProperty"  "{" ( "constantIRI"  ":" constantIRI )* "}"  ;
	
	DataProperty::= constantIRI;  // "DataProperty"  "{" ( "constantIRI"  ":" constantIRI )* "}"  ;
	
	NamedIndividual::= constantIRI;  // "NamedIndividual"  "{" ( "constantIRI"  ":" constantIRI )* "}"  ;
	
	AnonymousIndividual::= nodeID[NODE];  // "AnonymousIndividual"  "{" ( "nodeID"  ":" nodeID['"','"']  )* "}"  ;
	
	Literal::= lexicalForm[LITERAL] "^^" datatype;  // "Literal"  "{" ( "lexicalForm"  ":" lexicalForm['"','"'] | "datatype"  ":" datatype )* "}"  ;
	
	EquivalentClasses::= "EquivalentClass" "(" classExpressions classExpressions+ ")";  // "EquivalentClasses" "{" ( "classExpressions"  ":" classExpressions )* "}"  ;
	
	SubClassOf::= "SubClassOf" "(" subClassExpression superClassExpression ")";  // "SubClassOf"  "{" ( "subClassExpression"  ":" subClassExpression| "superClassExpression"  ":" superClassExpression )* "}"  ;
	
	DisjointClasses::= "DisjointWith" "(" classExpressions classExpressions+ ")";  // "DisjointClasses"  "{" ( "classExpressions"  ":" classExpressions )* "}"  ;
	
	ObjectPropertyAssertion::= "PropertyValue" "(" sourceIndividual objectPropertyExpression targetIndividual ")";  // "ObjectPropertyAssertion"  "{" ( "sourceIndividual"  ":" sourceIndividual| "targetIndividual"  ":" targetIndividual| "objectPropertyExpression"  ":" objectPropertyExpression )* "}"  ;
	
	DataPropertyAssertion::= "PropertyValue" "(" sourceIndividual dataPropertyExpression targetValue ")";  // "DataPropertyAssertion"  "{" ( "sourceIndividual"  ":" sourceIndividual| "targetValue"  ":" targetValue| "dataPropertyExpression"  ":" dataPropertyExpression )* "}"  ;
	
	ClassAssertion::= "Type" "(" individual classExpression ")";  // "ClassAssertion"  "{" ( "individual"  ":" individual| "classExpression"  ":" classExpression )* "}"  ;
	
	SameIndividual::= "SameAs" "(" individuals individuals+ ")";  // "SameIndividual"  "{" ( "individuals"  ":" individuals )* "}"  ;
	
	DifferentIndividuals::= "DifferentFrom" "(" individuals individuals+ ")";  // "DifferentIndividuals"  "{" ( "individuals"  ":" individuals )* "}"  ;
	
	EquivalentObjectProperties::= "EquivalentProperty" "(" objectPropertyExpression objectPropertyExpression+ ")";  // "EquivalentObjectProperties"  "{" ( "objectPropertyExpression"  ":" objectPropertyExpression )* "}"  ;
	
	SubPropertyOf::= "SubPropertyOf" "(" subObjectPropertyExpression superObjectPropertyExpression ")";  // "SubPropertyOf"  "{" ( "subObjectPropertyExpression"  ":" subObjectPropertyExpression| "superObjectPropertyExpression"  ":" superObjectPropertyExpression )* "}"  ;
	
	InverseObjectProperty::= "InverseOf" "(" objectProperty ")";  //"InverseObjectProperty"  "{" ( "objectProperty"  ":" objectProperty )* "}"  ;
	
	InverseObjectPropertyAtom::= "InverseOf" "(" objectPropertyExpression1 objectPropertyExpression2 ")";  // "InverseObjectPropertyAtom"  "{" ( "objectPropertyExpression1"  ":" objectPropertyExpression1| "objectPropertyExpression2"  ":" objectPropertyExpression2 )* "}"  ;
	
	FunctionalObjectProperty::= "Functional" "(" objectPropertyExpression ")";  // "FunctionalObjectProperty"  "{" ( "objectPropertyExpression"  ":" objectPropertyExpression )* "}"  ;
	
	InverseFunctionalObjectProperty::= "InverseFunctional" "(" objectPropertyExpression ")";  // "InverseFunctionalObjectProperty"  "{" ( "objectPropertyExpression"  ":" objectPropertyExpression )* "}"  ;
	
	TransitiveObjectProperty::= "Transitive" "(" objectPropertyExpression ")";  // "TransitiveObjectProperty"  "{" ( "objectPropertyExpression"  ":" objectPropertyExpression )* "}"  ;
	
	SymmetricObjectProperty::= "Symmetric" "(" objectPropertyExpression ")";  // "SymmetricObjectProperty"  "{" ( "objectPropertyExpression"  ":" objectPropertyExpression )* "}"  ;
	
	ObjectUnionOf::= "UnionOf" "(" classExpressions classExpressions+ ")";  // "ObjectUnionOf"  "{" ( "classExpressions"  ":" classExpressions )* "}"  ;
	
	ObjectComplementOf::= "ComplementOf" "(" classExpression ")";  // "ObjectComplementOf"  "{" ( "classExpression"  ":" classExpression )* "}"  ;
	
	ObjectOneOf::= "OneOf" "(" individuals+ ")";  // "ObjectOneOf"  "{" ( "individuals"  ":" individuals )* "}"  ;
	
	ObjectIntersectionOf::= "IntersectionOf" "(" classExpressions classExpressions+")";  // "ObjectIntersectionOf"  "{" ( "classExpression"  ":" classExpression )* "}"  ;
	
	ObjectAllValuesFrom::= "All" "(" objectPropertyExpression classExpression ")";  // "ObjectAllValuesFrom"  "{" ( "classExpression"  ":" classExpression| "objectPropertyExpression"  ":" objectPropertyExpression )* "}"  ;
	
	ObjectSomeValuesFrom::= "Some" "(" objectPropertyExpression classExpression ")";  // "ObjectSomeValuesFrom"  "{" ( "classExpression"  ":" classExpression| "objectPropertyExpression"  ":" objectPropertyExpression )* "}"  ;
	
	ObjectHasValue::= "Has" "(" objectPropertyExpression individual ")";  // "ObjectHasValue"  "{" ( "individual"  ":" individual| "objectPropertyExpression"  ":" objectPropertyExpression )* "}"  ;
	
	ObjectMinCardinality::= "Min" "(" cardinality[INTEGER] objectPropertyExpression classExpression? ")";  // "ObjectMinCardinality"  "{" ( "cardinality"  ":" cardinality[INTEGER]| "classExpression"  ":" classExpression| "objectPropertyExpression"  ":" objectPropertyExpression )* "}"  ;
	
	ObjectMaxCardinality::= "Max" "(" cardinality[INTEGER] objectPropertyExpression classExpression? ")";  // "ObjectMaxCardinality"  "{" ( "cardinality"  ":" cardinality[INTEGER]| "classExpression"  ":" classExpression| "objectPropertyExpression"  ":" objectPropertyExpression )* "}"  ;
	
	ObjectExactCardinality::= "Exact" "(" cardinality[INTEGER] objectPropertyExpression classExpression?  ")";  // "ObjectExactCardinality"  "{" ( "cardinality"  ":" cardinality[INTEGER]| "classExpression"  ":" classExpression| "objectPropertyExpression"  ":" objectPropertyExpression )* "}"  ;
	
	DataHasValue::= "Has" "(" dataPropertyExpression literal ")";  // "DataHasValue"  "{" ( "literal"  ":" literal| "dataPropertyExpression" ":" dataPropertyExpression)* "}"  ;
	
	FullIRI::= id[FULLIRI];  // "FullIRI"  "{" ( "id"  ":" id['"','"']  )* "}"  ;
	
	AbbreviatedIRI::= id[ABBRIRI];  // "AbbreviatedIRI"  "{" ( "id"  ":" id['"','"']  )* "}"  ;
	
	ObjectPropertyDeclaration::= "ObjectProperty" "(" objectPropertyVariable ")";  // "ObjectPropertyDeclaration"  "{" ( "objectPropertyVariable"  ":" objectPropertyVariable )* "}"  ;
	
	DatatypePropertyDeclaration::= "DatatypeProperty" "(" datatypePropertyVariable ")";  // "DatatypePropertyDeclaration"  "{" ( "datatypePropertyVariable"  ":" datatypePropertyVariable )* "}"  ;
	
	IndividualDeclaration::= "Individual" "(" individualVariable ")";  // "IndividualDeclaration"  "{" ( "individualVariable"  ":" individualVariable )* "}"  ;
	
	ClassDeclaration::= "Class" "(" classVariable ")";  // "ClassDeclaration"  "{" ( "classVariable"  ":" classVariable )* "}"  ;
	
}