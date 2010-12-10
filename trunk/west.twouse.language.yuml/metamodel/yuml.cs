SYNTAXDEF yuml
FOR <http://west.uni-koblenz.de/softwareweb/yuml>
START Model

OPTIONS {	
	generateCodeFromGeneratorModel = "true";
	reloadGeneratorModel = "true";
	tokenspace = "0";
	usePredefinedTokens = "false";
	overridePluginXML = "false";
	overrideUIPluginXML = "false";
	overrideManifest = "false";
	overrideUIManifest = "false";
	overrideBuildProperties = "false";
	overrideUIBuildProperties = "false";
	overrideClasspath = "false";
	overrideUIDotClasspath = "false";
	overrideProjectFile = "false";
	overrideUIDotProject = "false";
	overridePrinter2 = "false"; // edited due to UTF-8 usage
	saveChangedResourcesOnly = "true";
	resourcePluginID = "west.twouse.language.yuml.resource.yuml";
	resourceUIPluginID = "west.twouse.language.yuml.resource.yuml.ui";
	basePackage = "west.twouse.language.yuml.resource.yuml";
	uiBasePackage = "west.twouse.language.yuml.resource.yuml.ui";
}

TOKENS {	
	DEFINE WHITESPACE $(' '|'\t'|'\f')$;
	DEFINE LINEBREAKS $('\r\n'|'\r'|'\n')$;
	
	DEFINE FRAGMENT DIGIT $('0'..'9')$;
	DEFINE FRAGMENT DIGITS $('1'..'9')$ + DIGIT + $*$;
	
	DEFINE CARDINALITY $'0' |$ + DIGITS + $| '*'$;
	
	DEFINE ALPHANUM $(('A'..'Z''a'..'z') | $ + DIGIT + $)+$;
	
	DEFINE VISIBILITY $('+' | '-')$;
	
	// following character are not allowed as text
	
	// * -> \u002A
	// + -> \u002B
	// , -> \u002C
	// - -> \u002D
	// . -> \u002E
	
	// ; -> \u003B
	// < -> \u003C
	
	// > -> \u003E
	// ? -> \u003F
	
	// [ -> \u005B
	// \ -> \u005C
	// ] -> \u005D
	// ^ -> \u005E
	
	// { -> \u007B
	// | -> \u007C
	// } -> \u007D
	
	
	DEFINE TEXT $('\u0000'..'\u0029' | '\u002F'..'\u003A' | '\u003D' | '\u0040'..'\u005A' | '\u005F'..'\u007A' | '\u007E'..'\uFFFF')+$;
	
// original
//	DEFINE TEXT $(~('\u005C' | '[' | ']' | '<' | '>' | '|' | '.' | ';' | '-' | '^' | '*' | ',' | '+' | '?')| '\\')+$;
	
}
			
			
TOKENSTYLES {
	"Model" COLOR #7F0055, BOLD;
	"elements" COLOR #7F0055, BOLD;
	"Class" COLOR #7F0055, BOLD;
	"color" COLOR #7F0055, BOLD;
	"stereotype" COLOR #7F0055, BOLD;
	"name" COLOR #7F0055, BOLD;
	"attributes" COLOR #7F0055, BOLD;
	"methods" COLOR #7F0055, BOLD;
	"Association" COLOR #7F0055, BOLD;
	"source" COLOR #7F0055, BOLD;
	"target" COLOR #7F0055, BOLD;
	"type" COLOR #7F0055, BOLD;
	"sourceCardinality" COLOR #7F0055, BOLD;
	"sourceLabel" COLOR #7F0055, BOLD;
	"sourceVisibility" COLOR #7F0055, BOLD;
	"targetCardinality" COLOR #7F0055, BOLD;
	"targetLabel" COLOR #7F0055, BOLD;
	"targetVisibility" COLOR #7F0055, BOLD;
	"Inheritance" COLOR #7F0055, BOLD;
	"Cardinality" COLOR #7F0055, BOLD;
	"lowerBound" COLOR #7F0055, BOLD;
	"upperBound" COLOR #7F0055, BOLD;
	"Attribute" COLOR #7F0055, BOLD;
	"visibility" COLOR #7F0055, BOLD;
	"Method" COLOR #7F0055, BOLD;
	"arguments" COLOR #7F0055, BOLD;
	"Note" COLOR #7F0055, BOLD;
	"text" COLOR #7F0055, BOLD;
	"NoteAssociation" COLOR #7F0055, BOLD;
	"note" COLOR #7F0055, BOLD;
	"Equivalence" COLOR #7F0055, BOLD;
}
			
			
RULES {
	Model ::= (elements ("," !0 elements)* )?;	
	Class ::= "[" ("<<" stereotype[ALPHANUM] ">>")? name[TEXT] ( "|" attributes (";" attributes)*)? ( "|" methods (";" methods)*)? ("{bg:" color[TEXT] "}")? "]";	
	Association ::= source navigableSource["<" : ""]? sourceLabel[TEXT]? sourceCardinality? "-" targetLabel[TEXT]? targetCardinality? navigableTarget[">" : ""]? target;  // sourceVisibility[]? targetVisibility[]? type[];	
	Inheritance ::= (source "^" target) | (source "-" targetLabel[TEXT]? "^" target) | (target "^" targetLabel[TEXT]? "-" source);
	Cardinality ::= lowerBound[CARDINALITY] (".." upperBound[CARDINALITY])?;
	Attribute ::= visibility[VISIBILITY]? ("<<" stereotype[ALPHANUM] ">>")? name[TEXT] (" : " type[TEXT])?;  // visibility[]	
	Method ::= name[TEXT] "(" (arguments[TEXT] ("," arguments[TEXT])*)? ")";  // visibility[]
	Note ::= "[note: " text[TEXT] ("{bg:" color[TEXT] "}")? "]";
	//NoteAssociation ::= "NoteAssociation"  "{" ( "source"  ":" source | "target"  ":" target | "note"  ":" note  )* "}"  ;
	Equivalence ::= source "^" sourceLabel[TEXT]? "-" targetLabel[TEXT]? "^" target;
}