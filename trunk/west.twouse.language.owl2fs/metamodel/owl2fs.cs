SYNTAXDEF owl2fs
FOR <http://west.uni-koblenz.de/owl2fs>
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
	resourcePluginID = "west.twouse.language.owl2fs.resource.owl2fs";
	basePackage = "west.twouse.language.owl2fs.resource.owl2fs";
}

TOKENS {
	DEFINE WHITESPACE $(' '|'\t'|'\f')$;
	DEFINE LINEBREAKS $('\r\n'|'\r'|'\n')$;
	DEFINE COMMENT$'//'(~('\n'|'\r'|'\uffff'))*$;
	DEFINE INTEGER$('-')?('1'..'9')('0'..'9')*|'0'$;
	DEFINE FLOAT$('-')?(('1'..'9') ('0'..'9')* | '0') '.' ('0'..'9')+$;
	
//	DEFINE ALPHANUM$('A'..'Z' | 'a'..'z' | '0'..'9')+$;
	DEFINE LITERAL$ '"' ( ~( '\u0022' | '\u005C' ) | ('\\'('t'|'b'|'n'|'r'|'f'|'\\'|'\"'|'\'')) )* '"' $;
//	DEFINE VARIABLE$ (('?') | ('\u0024')) ('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-')+ $;
	DEFINE NODE$ '_:'('A'..'Z' | 'a'..'z' | '\u00C0'..'\u00D6' | '\u00D8'..'\u00F6' | '\u00F8'..'\u02FF' | '\u0370'..'\u037D' | '\u037F'..'\u1FFF' | '\u200C'..'\u200D' | '\u2070'..'\u218F' | '\u2C00'..'\u2FEF' | '\u3001'..'\uD7FF' | '\uF900'..'\uFDCF' | '\uFDF0'..'\uFFFD' | '_' | '0'..'9' ) (('A'..'Z' | 'a'..'z' | '\u00C0'..'\u00D6'| '\u00D8'..'\u00F6' | '\u00F8'..'\u02FF' | '\u0370'..'\u037D' | '\u037F'..'\u1FFF' | '\u200C'..'\u200D' | '\u2070'..'\u218F' | '\u2C00'..'\u2FEF' | '\u3001'..'\uD7FF' | '\uF900'..'\uFDCF' | '\uFDF0'..'\uFFFD' | '_' | '0'..'9' | '\u00B7' | '\u0300'..'\u036F' | '\u203F'..'\u2040' | '.' )* ('A'..'Z' | 'a'..'z' | '\u00C0'..'\u00D6'| '\u00D8'..'\u00F6' | '\u00F8'..'\u02FF' | '\u0370'..'\u037D' | '\u037F'..'\u1FFF' | '\u200C'..'\u200D' | '\u2070'..'\u218F' | '\u2C00'..'\u2FEF' | '\u3001'..'\uD7FF' | '\uF900'..'\uFDCF' | '\uFDF0'..'\uFFFD' | '_' | '.' | '0'..'9' | '\u00B7' | '\u0300'..'\u036F' | '\u203F'..'\u2040'))? $ ;
	DEFINE FULLIRI$ '<' (~( '^' | '<' | '>' | '"' | '{' | '}' | '`' | '\\' | '\u0000'..'\u0020' ))* '>' $;
	DEFINE ABBRIRI$ (('A'..'Z' | 'a'..'z' | '\u00C0'..'\u00D6' | '\u00D8'..'\u00F6' | '\u00F8'..'\u02FF' | '\u0370'..'\u037D' | '\u037F'..'\u1FFF' | '\u200C'..'\u200D' | '\u2070'..'\u218F' | '\u2C00'..'\u2FEF' | '\u3001'..'\uD7FF' | '\uF900'..'\uFDCF' | '\uFDF0'..'\uFFFD' | '_' | '-' | '0'..'9' )
		('A'..'Z' | 'a'..'z' | '\u00C0'..'\u00D6' | '\u00D8'..'\u00F6' | '\u00F8'..'\u02FF' | '\u0370'..'\u037D' | '\u037F'..'\u1FFF' | '\u200C'..'\u200D' | '\u2070'..'\u218F' | '\u2C00'..'\u2FEF' | '\u3001'..'\uD7FF' | '\uF900'..'\uFDCF' | '\uFDF0'..'\uFFFD' | '_' | '-' | '0'..'9' | '\u00B7' | '\u0300'..'\u036F' | '\u203F'..'\u2040' | '.' )*) $;
	DEFINE LANGTAG$ '@' ( 'A'..'Z' | 'a'..'z' )+ $;
}

TOKENSTYLES {
	"COMMENT" COLOR #32CD32, BOLD;

	"Annotation" COLOR #7F0055, BOLD;
	"Datatype" COLOR #7F0055, BOLD;
	"AntiSymmetricObjectProperty" COLOR #7F0055, BOLD;
	"ObjectProperty" COLOR #7F0055, BOLD;
	"Class" COLOR #7F0055, BOLD;
	"ObjectIntersectionOf" COLOR #7F0055, BOLD;
	"ObjectOneOf" COLOR #7F0055, BOLD;
	"NamedIndividual" COLOR #7F0055, BOLD;
	"ObjectSomeValuesFrom" COLOR #7F0055, BOLD;
	"ObjectAllValuesFrom" COLOR #7F0055, BOLD;
	"ObjectHasSelf" COLOR #7F0055, BOLD;
	"ObjectHasValue" COLOR #7F0055, BOLD;
	"ObjectMinCardinality" COLOR #7F0055, BOLD;
	"ObjectMaxCardinality" COLOR #7F0055, BOLD;
	"DataSomeValuesFrom" COLOR #7F0055, BOLD;
	"DataProperty" COLOR #7F0055, BOLD;
	"DataOneOf" COLOR #7F0055, BOLD;
	"DatatypeRestriction" COLOR #7F0055, BOLD;
	"DataAllValuesFrom" COLOR #7F0055, BOLD;
	"DataHasValue" COLOR #7F0055, BOLD;
	"DataMinCardinality" COLOR #7F0055, BOLD;
	"DataMaxCardinality" COLOR #7F0055, BOLD;
	"DataExactCardinality" COLOR #7F0055, BOLD;
	"NegativeDataPropertyAssertion" COLOR #7F0055, BOLD;
	"DataPropertyDomain" COLOR #7F0055, BOLD;
	"DataPropertyRange" COLOR #7F0055, BOLD;
	"DifferentIndividuals" COLOR #7F0055, BOLD;
	"DisjointClasses" COLOR #7F0055, BOLD;
	"DisjointDataProperties" COLOR #7F0055, BOLD;
	"DisjointObjectProperties" COLOR #7F0055, BOLD;
	"DisjointUnion" COLOR #7F0055, BOLD;
	"EquivalentClasses" COLOR #7F0055, BOLD;
	"EquivalentDataProperties" COLOR #7F0055, BOLD;
	"EquivalentObjectProperties" COLOR #7F0055, BOLD;
	"FunctionalDataProperty" COLOR #7F0055, BOLD;
	"FunctionalObjectProperty" COLOR #7F0055, BOLD;
	"InverseFunctionalObjectProperty" COLOR #7F0055, BOLD;
	"ObjectPropertyAssertion" COLOR #7F0055, BOLD;
	"NegativeObjectPropertyAssertion" COLOR #7F0055, BOLD;
	"ObjectPropertyDomain" COLOR #7F0055, BOLD;
	"SymmetricObjectProperty" COLOR #7F0055, BOLD;
	"ReflexiveObjectProperty" COLOR #7F0055, BOLD;
	"SubDataPropertyOf" COLOR #7F0055, BOLD;
	"SameIndividual" COLOR #7F0055, BOLD;
	"SubObjectPropertyOf" COLOR #7F0055, BOLD;
	"ObjectComplementOf" COLOR #7F0055, BOLD;
	"Ontology" COLOR #7F0055, BOLD;
	"ObjectPropertyRange" COLOR #7F0055, BOLD;
	"DataPropertyAssertion" COLOR #7F0055, BOLD;
	"ClassAssertion" COLOR #7F0055, BOLD;
	"IrreflexiveObjectProperty" COLOR #7F0055, BOLD;
	"ObjectExactCardinality" COLOR #7F0055, BOLD;
	"DataComplementOf" COLOR #7F0055, BOLD;
	"SubClassOf" COLOR #7F0055, BOLD;
	"TransitiveObjectProperty" COLOR #7F0055, BOLD;
	"ObjectUnionOf" COLOR #7F0055, BOLD;
	"InverseObjectProperties" COLOR #7F0055, BOLD;
	"Declaration" COLOR #7F0055, BOLD;
	"HasKey" COLOR #7F0055, BOLD;
}

RULES {
	
	FullIRI::= value[FULLIRI];  
	
	AbbreviatedIRI::= prefix[ABBRIRI]? #0 ":" #0 value[ABBRIRI];  
	
	OntologyDocument::= (prefixDefinition | comment)* ontology;  
	
	PrefixDefinition::= "Prefix" "(" pref[ABBRIRI]? #0 ":=" #0 namespace ")" !0;  
	
	Ontology::= !0 "Ontology" "(" comment* (ontologyIRI comment* versionIRI?)? comment* ( "Import" "(" comment* directlyImportsDocuments comment* ")")* (comment* ontologyAnnotations)* !1 axioms* ")" comment* ;  
	
	//Axiom begin
	
	Comment::= !0 comment[COMMENT] !0;

	ClassDeclaration::= "Declaration" "(" axiomAnnotations* "Class" "(" entity:Class ")" ")" !0;
	
	DatatypeDeclaration::= "Declaration" "(" axiomAnnotations* "Datatype" "(" entity:Datatype ")" ")" !0;
	
	ObjectPropertyDeclaration::= "Declaration" "(" axiomAnnotations* "ObjectProperty" "(" entity:ObjectProperty ")" ")" !0;  
	
	DataPropertyDeclaration::= "Declaration" "(" axiomAnnotations* "DataProperty" "(" entity:DataProperty ")" ")" !0;
	
	AnnotationPropertyDeclaration::= "Declaration" "(" axiomAnnotations* "AnnotationProperty" "(" entity:AnnotationProperty ")" ")" !0;
	
	NamedIndividualDeclaration::= "Declaration" "(" axiomAnnotations* "NamedIndividual" "(" entity:NamedIndividual ")" ")" !0;
	
	//Entities begin
	Class::= entityIRI;  

	Datatype::= entityIRI;

	ObjectProperty::= entityIRI;  

	DataProperty::= entityIRI;
	
	AnnotationProperty::= entityIRI;

	NamedIndividual::= entityIRI;  
	//Entities end
	
	//AnnotationAxiom begin
	AnnotationAssertion::= "AnnotationAssertion" "(" axiomAnnotations* annotationProperty annotationSubject annotationValue ")" !0;
	
	SubAnnotationPropertyOf::= "SubAnnotationPropertyOf" "(" axiomAnnotations* subAnnotationProperty superAnnotationProperty ")" !0;
	
	AnnotationPropertyDomain::= "AnnotationPropertyDomain" "(" axiomAnnotations* annotationProperty iri ")" !0;
	
	AnnotationPropertyRange::= "AnnotationPropertyRange" "(" axiomAnnotations* annotationProperty iri ")" !0;

	Annotation::= "Annotation" "(" annotationAnnotations* annotationProperty annotationValue ")" !0;
	//AnnotationAxiom end
	
	AnonymousIndividual::= nodeID[NODE];
	
	Literal::= lexicalValue[LITERAL] #0 ("^^" #0 datatype | languageTag[LANGTAG])? ;
	
	InverseObjectProperty::= "ObjectInverseOf" "(" objectProperty ")" !0;  
	
	//DataRange begin
	DataComplementOf::= "DataComplementOf" "(" dataRange ")" !0;  
	
	DataOneOf::= "DataOneOf" "(" constants+ ")" !0;  
	
	DatatypeRestriction::= "DatatypeRestriction" "(" datatype restrictions+ ")" !0;  
	
	FacetConstraintPair::= facet constant !0;  
	//DataRange end
	
	//ClassExpression begin
	ObjectIntersectionOf::= "ObjectIntersectionOf" "(" classExpressions classExpressions+ ")";  
	
	ObjectUnionOf::= "ObjectUnionOf" "(" classExpressions classExpressions+ ")";  
	
	ObjectComplementOf::= "ObjectComplementOf" "(" classExpression ")";  
	
	ObjectOneOf::= "ObjectOneOf" "(" individuals+ ")";  
	
	ObjectSomeValuesFrom::= "ObjectSomeValuesFrom" "(" objectPropertyExpression classExpression ")";  
	
	ObjectAllValuesFrom::= "ObjectAllValuesFrom" "(" objectPropertyExpression classExpression ")";  
	
	ObjectHasValue::= "ObjectHasValue" "(" objectPropertyExpression individual ")";  
	
	ObjectHasSelf::= "ObjectHasSelf" "(" objectPropertyExpression ")";  
	
	ObjectMinCardinality::= "ObjectMinCardinality" "(" cardinality[INTEGER] objectPropertyExpression classExpression? ")";  
	
	ObjectMaxCardinality::= "ObjectMaxCardinality" "(" cardinality[INTEGER] objectPropertyExpression classExpression? ")";  
	
	ObjectExactCardinality::= "ObjectExactCardinality" "(" cardinality[INTEGER] objectPropertyExpression classExpression? ")";  
	
	DataSomeValuesFrom::= "DataSomeValuesFrom" "(" dataPropertyExpressions dataRange ")";  
	
	DataAllValuesFrom::= "DataAllValuesFrom" "(" dataPropertyExpressions dataRange ")";  
	
	DataHasValue::= "DataHasValue" "(" dataPropertyExpression constant ")";  
	
	DataMinCardinality::= "DataMinCardinality" "(" cardinality[INTEGER] dataPropertyExpression dataRange? ")";  
	
	DataMaxCardinality::= "DataMaxCardinality" "(" cardinality[INTEGER] dataPropertyExpression dataRange? ")";  
	
	DataExactCardinality::= "DataExactCardinality" "(" cardinality[INTEGER] dataPropertyExpression dataRange? ")";  
	//ClassExpression end
	
	//ClassAxiom begin
	SubClassOf::= "SubClassOf" "(" axiomAnnotations* subClassExpression superClassExpression ")" !0;  
	
	EquivalentClasses::= "EquivalentClasses" "(" axiomAnnotations* equivalentClassExpressions equivalentClassExpressions+ ")" !0;  
	
	DisjointClasses::= "DisjointClasses" "(" axiomAnnotations* disjointClassExpressions disjointClassExpressions+ ")" !0;  
	
	DisjointUnion::= "DisjointUnion" "(" axiomAnnotations* unionClass disjointClassExpressions disjointClassExpressions+ ")" !0;  
	//ClassAxiom end
	
	//ObjectPropertyAxiom begin
	SubObjectPropertyOf::= "SubObjectPropertyOf" "(" axiomAnnotations* subObjectPropertyExpression superObjectPropertyExpression ")" !0;  
	
	ObjectPropertyChain ::= "ObjectPropertyChain" "(" objectPropertyExpressions objectPropertyExpressions+ ")" ;
	
	EquivalentObjectProperties::= "EquivalentObjectProperties" "(" axiomAnnotations* objectPropertyExpressions objectPropertyExpressions+ ")" !0;  
	
	DisjointObjectProperties::= "DisjointObjectProperties" "(" axiomAnnotations* objectPropertyExpressions objectPropertyExpressions+ ")" !0;  
	
	ObjectPropertyDomain::= "ObjectPropertyDomain" "(" axiomAnnotations* objectPropertyExpression domain ")" !0;  
	
	ObjectPropertyRange::= "ObjectPropertyRange" "(" axiomAnnotations* objectPropertyExpression range ")" !0;  
	
	InverseObjectProperties::= "InverseObjectProperties" "(" axiomAnnotations* objectPropertyExpression1 objectPropertyExpression2 ")" !0;  
	
	FunctionalObjectProperty::= "FunctionalObjectProperty" "(" axiomAnnotations* objectPropertyExpression ")" !0;  
	
	InverseFunctionalObjectProperty::= "InverseFunctionalObjectProperty" "(" axiomAnnotations* objectPropertyExpression ")" !0;  
	
	ReflexiveObjectProperty::= "ReflexiveObjectProperty" "(" axiomAnnotations* objectPropertyExpression ")" !0;  
	
	IrreflexiveObjectProperty::= "IrreflexiveObjectProperty" "(" axiomAnnotations* objectPropertyExpression ")" !0;  
	
	SymmetricObjectProperty::= "SymmetricObjectProperty" "(" axiomAnnotations* objectPropertyExpression ")" !0;  
	
	AsymmetricObjectProperty::= "AntiSymmetricObjectProperty" "(" axiomAnnotations* objectPropertyExpression ")" !0;  
	
	TransitiveObjectProperty::= "TransitiveObjectProperty" "(" axiomAnnotations* objectPropertyExpression ")" !0;  
	//ObjectPropertyAxiom end
	
	//DataPropertyAxiom begin
	SubDataPropertyOf::= "SubDataPropertyOf" "(" axiomAnnotations* subDataPropertyExpression superDataPropertyExpression ")" !0;  
	
	EquivalentDataProperties::= "EquivalentDataProperties" "(" axiomAnnotations* dataPropertyExpressions dataPropertyExpressions+ ")" !0;  
	
	DisjointDataProperties::= "DisjointDataProperties" "(" axiomAnnotations* dataPropertyExpressions dataPropertyExpressions+ ")" !0;  
	
	DataPropertyDomain::= "DataPropertyDomain" "(" axiomAnnotations* dataPropertyExpression domain ")" !0;  
	
	DataPropertyRange::= "DataPropertyRange" "(" axiomAnnotations* dataPropertyExpression range ")" !0;  
	
	FunctionalDataProperty::= "FunctionalDataProperty" "(" axiomAnnotations* dataPropertyExpression ")" !0;  
	//DataPropertyAxiom end
	
	DatatypeDefinition ::= "DatatypeDefinition" "(" axiomAnnotations* datatype dataRange ")" !0;	 
	
	HasKey::= "HasKey" "(" classExpression "(" axiomAnnotations* objectPropertyExpressions* ")" "(" dataPropertyExpressions* ")" ")" !0;  
	
	//Assertion begin
	SameIndividual::= "SameIndividual" "(" axiomAnnotations* sameIndividuals sameIndividuals+ ")" !0;  
	
	DifferentIndividuals::= "DifferentIndividuals" "(" axiomAnnotations* differentIndividuals differentIndividuals+ ")" !0;  
	
	ClassAssertion::= "ClassAssertion" "(" axiomAnnotations* classExpression individual ")" !0;  
	
	ObjectPropertyAssertion::= "ObjectPropertyAssertion" "(" axiomAnnotations* objectPropertyExpression sourceIndividual targetIndividual ")" !0;  
	
	NegativeObjectPropertyAssertion::= "NegativeObjectPropertyAssertion" "(" axiomAnnotations* objectPropertyExpression sourceIndividual targetIndividual ")" !0;  
	
	DataPropertyAssertion::= "DataPropertyAssertion" "(" axiomAnnotations* dataPropertyExpression sourceIndividual targetValue ")" !0;  
	
	NegativeDataPropertyAssertion::= "NegativeDataPropertyAssertion" "(" axiomAnnotations* dataPropertyExpression sourceIndividual targetValue ")" !0;  
	//Assertion end
	
	//Rules begin
	DLSafeRule::= "DLSafeRule" "(" annotation* "Body" "(" !1 bodyAtom* !0 ")" !0 "Head" "(" !1 headAtom* !0 ")" ")" !0;
	
	ClassAtom::= "ClassAtom" "(" classExpression iArg ")" !0;
	
	DataRangeAtom::= "DataRangeAtom" "(" dataRange dArg ")" !0;
	
	ObjectPropertyAtom::= "ObjectPropertyAtom" "(" objectPropertyExpression iArg1 iArg2 ")" !0;
	
	DataPropetyAtom::= "DataPropetyAtom" "(" dataProperty iArg dArg ")" !0;
	
	BuiltInAtom::= "BuiltInAtom" "(" iri dArg+ ")" !0;
	
	SameIndividualAtom::= "SameIndividualAtom" "(" iArg1 iArg2 ")" !0;
	
	DifferentIndividualsAtom::= "DifferentIndividualsAtom" "(" iArg1 iArg2 ")" !0;
	
	Variable::= "Variable" "(" iri ")";
	
	DGRule::= "DescriptionGraphRule" "(" annotation* "Body" "(" !1 bodyAtom* !0 ")" !0 "Head" "(" !1 headAtom* !0 ")" ")" !0;
	
	DGAxiom::= "DescriptionGraph" "(" annotation* dgNodes dgEdges mainClasses ")" !0;
	
	DGNodes::= "Nodes" "(" nodeAssertion+ ")" !0;
	
	NodeAssertion::= "NodeAssertion" "(" class dgNode ")" !0;
	
	DGEdges::= "Edges" "(" edgeAssertion+ ")" !0;
	
	EdgeAssertion::= "EdgeAssertion" "(" objectProperty dgNode1 dgNode2 ")" !0;
	
	MainClasses::= "MainClasses" "(" class+ ")" !0;
	//Rules end
	
	//Axiom end
	
	
	// The following will (temporarily) not be used
		
//	Package::= "Package"  "{" ( "ownedTemplateSignature"  ":" ownedTemplateSignature | "templateBinding"  ":" templateBinding | "expressions"  ":" expressions | "axioms"  ":" axioms | "PackageUri"  ":" PackageUri['"','"']  )* "}"   !0;
	
//	TemplateParameter::= "TemplateParameter"  "{" ( "ownedParameteredElement"  ":" ownedParameteredElement | "signature"  ":" signature[]| "parameteredElement"  ":" parameteredElement[] )* "}"   !0;
	
//	ParameterableElement::= "ParameterableElement"  "{" ( "owningTemplateParameter"  ":" owningTemplateParameter[]| "templateParameter"  ":" templateParameter[] )* "}"   !0;
	
//	TemplateSignature::= "TemplateSignature"  "{" ( "parameter"  ":" parameter[]| "ownedParameter"  ":" ownedParameter | "template"  ":" template[] )* "}"   !0;
	
//	TemplateableElement::= "TemplateableElement"  "{" ( "ownedTemplateSignature"  ":" ownedTemplateSignature | "templateBinding"  ":" templateBinding  )* "}"   !0;
	
//	ClassifierTemplateParameter::= "ClassifierTemplateParameter"  "{" ( "ownedParameteredElement"  ":" ownedParameteredElement | "signature"  ":" signature[]| "parameteredElement"  ":" parameteredElement[] )* "}"   !0;
	
//	TemplateParameterSubstitution::= "TemplateParameterSubstitution"  "{" ( "actual"  ":" actual[]| "formal"  ":" formal[]| "templateBinding"  ":" templateBinding[] )* "}"   !0;
	
//	TemplateBinding::= "TemplateBinding"  "{" ( "parameterSubstitution"  ":" parameterSubstitution | "boundElement"  ":" boundElement[]| "signature"  ":" signature[] )* "}"   !0;
}