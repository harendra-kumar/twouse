// $ANTLR ${project.version} ${buildNumber}

	package west.twouse.language.owl2fs.resource.owl2fs.mopp;


import org.antlr.runtime3_2_0.*;

public class Owl2fsLexer extends Lexer {
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__19=19;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__16=16;
    public static final int T__90=90;
    public static final int T__15=15;
    public static final int ABBRIRI=5;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int COMMENT=6;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int NODE=7;
    public static final int T__83=83;
    public static final int WHITESPACE=11;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int FLOAT=13;
    public static final int T__61=61;
    public static final int LINEBREAKS=12;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__103=103;
    public static final int T__59=59;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__50=50;
    public static final int INTEGER=10;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int LITERAL=8;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int FULLIRI=4;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int LANGTAG=9;

    	public java.util.List<org.antlr.runtime3_2_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_2_0.RecognitionException>();
    	public java.util.List<java.lang.Integer> lexerExceptionsPosition = new java.util.ArrayList<java.lang.Integer>();
    	
    	public void reportError(org.antlr.runtime3_2_0.RecognitionException e) {
    		lexerExceptions.add(e);
    		lexerExceptionsPosition.add(((org.antlr.runtime3_2_0.ANTLRStringStream) input).index());
    	}


    // delegates
    // delegators

    public Owl2fsLexer() {;} 
    public Owl2fsLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public Owl2fsLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "Owl2fs.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:16:7: ( ':' )
            // Owl2fs.g:16:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:17:7: ( 'Prefix' )
            // Owl2fs.g:17:9: 'Prefix'
            {
            match("Prefix"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:18:7: ( '(' )
            // Owl2fs.g:18:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:19:7: ( ':=' )
            // Owl2fs.g:19:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:20:7: ( ')' )
            // Owl2fs.g:20:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:21:7: ( 'Ontology' )
            // Owl2fs.g:21:9: 'Ontology'
            {
            match("Ontology"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:22:7: ( 'Import' )
            // Owl2fs.g:22:9: 'Import'
            {
            match("Import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:23:7: ( 'Declaration' )
            // Owl2fs.g:23:9: 'Declaration'
            {
            match("Declaration"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:24:7: ( 'Class' )
            // Owl2fs.g:24:9: 'Class'
            {
            match("Class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:25:7: ( 'Datatype' )
            // Owl2fs.g:25:9: 'Datatype'
            {
            match("Datatype"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:26:7: ( 'ObjectProperty' )
            // Owl2fs.g:26:9: 'ObjectProperty'
            {
            match("ObjectProperty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:27:7: ( 'DataProperty' )
            // Owl2fs.g:27:9: 'DataProperty'
            {
            match("DataProperty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:28:7: ( 'AnnotationProperty' )
            // Owl2fs.g:28:9: 'AnnotationProperty'
            {
            match("AnnotationProperty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:29:7: ( 'NamedIndividual' )
            // Owl2fs.g:29:9: 'NamedIndividual'
            {
            match("NamedIndividual"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:30:7: ( 'AnnotationAssertion' )
            // Owl2fs.g:30:9: 'AnnotationAssertion'
            {
            match("AnnotationAssertion"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:31:7: ( 'SubAnnotationPropertyOf' )
            // Owl2fs.g:31:9: 'SubAnnotationPropertyOf'
            {
            match("SubAnnotationPropertyOf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:32:7: ( 'AnnotationPropertyDomain' )
            // Owl2fs.g:32:9: 'AnnotationPropertyDomain'
            {
            match("AnnotationPropertyDomain"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:33:7: ( 'AnnotationPropertyRange' )
            // Owl2fs.g:33:9: 'AnnotationPropertyRange'
            {
            match("AnnotationPropertyRange"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:34:7: ( 'Annotation' )
            // Owl2fs.g:34:9: 'Annotation'
            {
            match("Annotation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:35:7: ( '^^' )
            // Owl2fs.g:35:9: '^^'
            {
            match("^^"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:36:7: ( 'ObjectInverseOf' )
            // Owl2fs.g:36:9: 'ObjectInverseOf'
            {
            match("ObjectInverseOf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:37:7: ( 'DataComplementOf' )
            // Owl2fs.g:37:9: 'DataComplementOf'
            {
            match("DataComplementOf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:38:7: ( 'DataOneOf' )
            // Owl2fs.g:38:9: 'DataOneOf'
            {
            match("DataOneOf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:39:7: ( 'DatatypeRestriction' )
            // Owl2fs.g:39:9: 'DatatypeRestriction'
            {
            match("DatatypeRestriction"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:40:7: ( 'ObjectIntersectionOf' )
            // Owl2fs.g:40:9: 'ObjectIntersectionOf'
            {
            match("ObjectIntersectionOf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:41:7: ( 'ObjectUnionOf' )
            // Owl2fs.g:41:9: 'ObjectUnionOf'
            {
            match("ObjectUnionOf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:42:7: ( 'ObjectComplementOf' )
            // Owl2fs.g:42:9: 'ObjectComplementOf'
            {
            match("ObjectComplementOf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:43:7: ( 'ObjectOneOf' )
            // Owl2fs.g:43:9: 'ObjectOneOf'
            {
            match("ObjectOneOf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:44:7: ( 'ObjectSomeValuesFrom' )
            // Owl2fs.g:44:9: 'ObjectSomeValuesFrom'
            {
            match("ObjectSomeValuesFrom"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:45:7: ( 'ObjectAllValuesFrom' )
            // Owl2fs.g:45:9: 'ObjectAllValuesFrom'
            {
            match("ObjectAllValuesFrom"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:46:7: ( 'ObjectHasValue' )
            // Owl2fs.g:46:9: 'ObjectHasValue'
            {
            match("ObjectHasValue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:47:7: ( 'ObjectHasSelf' )
            // Owl2fs.g:47:9: 'ObjectHasSelf'
            {
            match("ObjectHasSelf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:48:7: ( 'ObjectMinCardinality' )
            // Owl2fs.g:48:9: 'ObjectMinCardinality'
            {
            match("ObjectMinCardinality"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:49:7: ( 'ObjectMaxCardinality' )
            // Owl2fs.g:49:9: 'ObjectMaxCardinality'
            {
            match("ObjectMaxCardinality"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:50:7: ( 'ObjectExactCardinality' )
            // Owl2fs.g:50:9: 'ObjectExactCardinality'
            {
            match("ObjectExactCardinality"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:51:7: ( 'DataSomeValuesFrom' )
            // Owl2fs.g:51:9: 'DataSomeValuesFrom'
            {
            match("DataSomeValuesFrom"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:52:7: ( 'DataAllValuesFrom' )
            // Owl2fs.g:52:9: 'DataAllValuesFrom'
            {
            match("DataAllValuesFrom"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:53:7: ( 'DataHasValue' )
            // Owl2fs.g:53:9: 'DataHasValue'
            {
            match("DataHasValue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:54:7: ( 'DataMinCardinality' )
            // Owl2fs.g:54:9: 'DataMinCardinality'
            {
            match("DataMinCardinality"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:55:7: ( 'DataMaxCardinality' )
            // Owl2fs.g:55:9: 'DataMaxCardinality'
            {
            match("DataMaxCardinality"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:56:7: ( 'DataExactCardinality' )
            // Owl2fs.g:56:9: 'DataExactCardinality'
            {
            match("DataExactCardinality"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:57:7: ( 'SubClassOf' )
            // Owl2fs.g:57:9: 'SubClassOf'
            {
            match("SubClassOf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:58:7: ( 'EquivalentClasses' )
            // Owl2fs.g:58:9: 'EquivalentClasses'
            {
            match("EquivalentClasses"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:59:7: ( 'DisjointClasses' )
            // Owl2fs.g:59:9: 'DisjointClasses'
            {
            match("DisjointClasses"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:60:7: ( 'DisjointUnion' )
            // Owl2fs.g:60:9: 'DisjointUnion'
            {
            match("DisjointUnion"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:61:7: ( 'SubObjectPropertyOf' )
            // Owl2fs.g:61:9: 'SubObjectPropertyOf'
            {
            match("SubObjectPropertyOf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:62:7: ( 'ObjectPropertyChain' )
            // Owl2fs.g:62:9: 'ObjectPropertyChain'
            {
            match("ObjectPropertyChain"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:63:7: ( 'EquivalentObjectProperties' )
            // Owl2fs.g:63:9: 'EquivalentObjectProperties'
            {
            match("EquivalentObjectProperties"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:64:7: ( 'DisjointObjectProperties' )
            // Owl2fs.g:64:9: 'DisjointObjectProperties'
            {
            match("DisjointObjectProperties"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:65:7: ( 'ObjectPropertyDomain' )
            // Owl2fs.g:65:9: 'ObjectPropertyDomain'
            {
            match("ObjectPropertyDomain"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:66:7: ( 'ObjectPropertyRange' )
            // Owl2fs.g:66:9: 'ObjectPropertyRange'
            {
            match("ObjectPropertyRange"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:67:7: ( 'InverseObjectProperties' )
            // Owl2fs.g:67:9: 'InverseObjectProperties'
            {
            match("InverseObjectProperties"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:68:7: ( 'FunctionalObjectProperty' )
            // Owl2fs.g:68:9: 'FunctionalObjectProperty'
            {
            match("FunctionalObjectProperty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:69:7: ( 'InverseFunctionalObjectProperty' )
            // Owl2fs.g:69:9: 'InverseFunctionalObjectProperty'
            {
            match("InverseFunctionalObjectProperty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:70:7: ( 'ReflexiveObjectProperty' )
            // Owl2fs.g:70:9: 'ReflexiveObjectProperty'
            {
            match("ReflexiveObjectProperty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:71:7: ( 'IrreflexiveObjectProperty' )
            // Owl2fs.g:71:9: 'IrreflexiveObjectProperty'
            {
            match("IrreflexiveObjectProperty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:72:7: ( 'SymmetricObjectProperty' )
            // Owl2fs.g:72:9: 'SymmetricObjectProperty'
            {
            match("SymmetricObjectProperty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:73:7: ( 'AntiSymmetricObjectProperty' )
            // Owl2fs.g:73:9: 'AntiSymmetricObjectProperty'
            {
            match("AntiSymmetricObjectProperty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:74:7: ( 'TransitiveObjectProperty' )
            // Owl2fs.g:74:9: 'TransitiveObjectProperty'
            {
            match("TransitiveObjectProperty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:75:7: ( 'SubDataPropertyOf' )
            // Owl2fs.g:75:9: 'SubDataPropertyOf'
            {
            match("SubDataPropertyOf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:76:7: ( 'EquivalentDataProperties' )
            // Owl2fs.g:76:9: 'EquivalentDataProperties'
            {
            match("EquivalentDataProperties"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:77:7: ( 'DisjointDataProperties' )
            // Owl2fs.g:77:9: 'DisjointDataProperties'
            {
            match("DisjointDataProperties"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:78:7: ( 'DataPropertyDomain' )
            // Owl2fs.g:78:9: 'DataPropertyDomain'
            {
            match("DataPropertyDomain"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:79:7: ( 'DataPropertyRange' )
            // Owl2fs.g:79:9: 'DataPropertyRange'
            {
            match("DataPropertyRange"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:80:7: ( 'FunctionalDataProperty' )
            // Owl2fs.g:80:9: 'FunctionalDataProperty'
            {
            match("FunctionalDataProperty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:81:7: ( 'DatatypeDefinition' )
            // Owl2fs.g:81:9: 'DatatypeDefinition'
            {
            match("DatatypeDefinition"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:82:7: ( 'HasKey' )
            // Owl2fs.g:82:9: 'HasKey'
            {
            match("HasKey"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:83:7: ( 'SameIndividual' )
            // Owl2fs.g:83:9: 'SameIndividual'
            {
            match("SameIndividual"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:84:7: ( 'DifferentIndividuals' )
            // Owl2fs.g:84:9: 'DifferentIndividuals'
            {
            match("DifferentIndividuals"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:85:7: ( 'ClassAssertion' )
            // Owl2fs.g:85:9: 'ClassAssertion'
            {
            match("ClassAssertion"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:86:7: ( 'ObjectPropertyAssertion' )
            // Owl2fs.g:86:9: 'ObjectPropertyAssertion'
            {
            match("ObjectPropertyAssertion"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:87:7: ( 'NegativeObjectPropertyAssertion' )
            // Owl2fs.g:87:9: 'NegativeObjectPropertyAssertion'
            {
            match("NegativeObjectPropertyAssertion"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:88:7: ( 'DataPropertyAssertion' )
            // Owl2fs.g:88:9: 'DataPropertyAssertion'
            {
            match("DataPropertyAssertion"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:89:7: ( 'NegativeDataPropertyAssertion' )
            // Owl2fs.g:89:9: 'NegativeDataPropertyAssertion'
            {
            match("NegativeDataPropertyAssertion"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:90:7: ( 'DLSafeRule' )
            // Owl2fs.g:90:9: 'DLSafeRule'
            {
            match("DLSafeRule"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:91:7: ( 'Body' )
            // Owl2fs.g:91:9: 'Body'
            {
            match("Body"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:92:7: ( 'Head' )
            // Owl2fs.g:92:9: 'Head'
            {
            match("Head"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:93:7: ( 'ClassAtom' )
            // Owl2fs.g:93:9: 'ClassAtom'
            {
            match("ClassAtom"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:94:7: ( 'DataRangeAtom' )
            // Owl2fs.g:94:9: 'DataRangeAtom'
            {
            match("DataRangeAtom"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:95:7: ( 'ObjectPropertyAtom' )
            // Owl2fs.g:95:9: 'ObjectPropertyAtom'
            {
            match("ObjectPropertyAtom"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:96:7: ( 'DataPropetyAtom' )
            // Owl2fs.g:96:9: 'DataPropetyAtom'
            {
            match("DataPropetyAtom"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:97:7: ( 'BuiltInAtom' )
            // Owl2fs.g:97:9: 'BuiltInAtom'
            {
            match("BuiltInAtom"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:98:7: ( 'SameIndividualAtom' )
            // Owl2fs.g:98:9: 'SameIndividualAtom'
            {
            match("SameIndividualAtom"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:99:7: ( 'DifferentIndividualsAtom' )
            // Owl2fs.g:99:9: 'DifferentIndividualsAtom'
            {
            match("DifferentIndividualsAtom"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:100:7: ( 'Variable' )
            // Owl2fs.g:100:9: 'Variable'
            {
            match("Variable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:101:7: ( 'DescriptionGraphRule' )
            // Owl2fs.g:101:9: 'DescriptionGraphRule'
            {
            match("DescriptionGraphRule"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:102:8: ( 'DescriptionGraph' )
            // Owl2fs.g:102:10: 'DescriptionGraph'
            {
            match("DescriptionGraph"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:103:8: ( 'Nodes' )
            // Owl2fs.g:103:10: 'Nodes'
            {
            match("Nodes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:104:8: ( 'NodeAssertion' )
            // Owl2fs.g:104:10: 'NodeAssertion'
            {
            match("NodeAssertion"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:105:8: ( 'Edges' )
            // Owl2fs.g:105:10: 'Edges'
            {
            match("Edges"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:106:8: ( 'EdgeAssertion' )
            // Owl2fs.g:106:10: 'EdgeAssertion'
            {
            match("EdgeAssertion"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:107:8: ( 'MainClasses' )
            // Owl2fs.g:107:10: 'MainClasses'
            {
            match("MainClasses"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:16824:11: ( ( ' ' | '\\t' | '\\f' ) )
            // Owl2fs.g:16825:2: ( ' ' | '\\t' | '\\f' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "LINEBREAKS"
    public final void mLINEBREAKS() throws RecognitionException {
        try {
            int _type = LINEBREAKS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:16828:11: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            // Owl2fs.g:16829:2: ( '\\r\\n' | '\\r' | '\\n' )
            {
            // Owl2fs.g:16829:2: ( '\\r\\n' | '\\r' | '\\n' )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\r') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='\n') ) {
                    alt1=1;
                }
                else {
                    alt1=2;}
            }
            else if ( (LA1_0=='\n') ) {
                alt1=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // Owl2fs.g:16829:3: '\\r\\n'
                    {
                    match("\r\n"); 


                    }
                    break;
                case 2 :
                    // Owl2fs.g:16829:10: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // Owl2fs.g:16829:15: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }

             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LINEBREAKS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:16832:8: ( '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            // Owl2fs.g:16833:2: '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            {
            match("//"); 

            // Owl2fs.g:16833:6: (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='\uFFFE')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Owl2fs.g:16833:7: ~ ( '\\n' | '\\r' | '\\uffff' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:16835:8: ( ( '-' )? ( '1' .. '9' ) ( '0' .. '9' )* | '0' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='-'||(LA5_0>='1' && LA5_0<='9')) ) {
                alt5=1;
            }
            else if ( (LA5_0=='0') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // Owl2fs.g:16836:2: ( '-' )? ( '1' .. '9' ) ( '0' .. '9' )*
                    {
                    // Owl2fs.g:16836:2: ( '-' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='-') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // Owl2fs.g:16836:3: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    // Owl2fs.g:16836:8: ( '1' .. '9' )
                    // Owl2fs.g:16836:9: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }

                    // Owl2fs.g:16836:18: ( '0' .. '9' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // Owl2fs.g:16836:19: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // Owl2fs.g:16836:30: '0'
                    {
                    match('0'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:16837:6: ( ( '-' )? ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) '.' ( '0' .. '9' )+ )
            // Owl2fs.g:16838:2: ( '-' )? ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) '.' ( '0' .. '9' )+
            {
            // Owl2fs.g:16838:2: ( '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='-') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // Owl2fs.g:16838:3: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // Owl2fs.g:16838:8: ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>='1' && LA8_0<='9')) ) {
                alt8=1;
            }
            else if ( (LA8_0=='0') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // Owl2fs.g:16838:9: ( '1' .. '9' ) ( '0' .. '9' )*
                    {
                    // Owl2fs.g:16838:9: ( '1' .. '9' )
                    // Owl2fs.g:16838:10: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }

                    // Owl2fs.g:16838:20: ( '0' .. '9' )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // Owl2fs.g:16838:21: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // Owl2fs.g:16838:34: '0'
                    {
                    match('0'); 

                    }
                    break;

            }

            match('.'); 
            // Owl2fs.g:16838:43: ( '0' .. '9' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // Owl2fs.g:16838:44: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "LITERAL"
    public final void mLITERAL() throws RecognitionException {
        try {
            int _type = LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:16840:8: ( '\"' (~ ( '\\u0022' | '\\u005C' ) | ( '\\\\' ( 't' | 'b' | 'n' | 'r' | 'f' | '\\\\' | '\\\"' | '\\'' ) ) )* '\"' )
            // Owl2fs.g:16841:3: '\"' (~ ( '\\u0022' | '\\u005C' ) | ( '\\\\' ( 't' | 'b' | 'n' | 'r' | 'f' | '\\\\' | '\\\"' | '\\'' ) ) )* '\"'
            {
            match('\"'); 
            // Owl2fs.g:16841:7: (~ ( '\\u0022' | '\\u005C' ) | ( '\\\\' ( 't' | 'b' | 'n' | 'r' | 'f' | '\\\\' | '\\\"' | '\\'' ) ) )*
            loop10:
            do {
                int alt10=3;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='!')||(LA10_0>='#' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }
                else if ( (LA10_0=='\\') ) {
                    alt10=2;
                }


                switch (alt10) {
            	case 1 :
            	    // Owl2fs.g:16841:9: ~ ( '\\u0022' | '\\u005C' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // Owl2fs.g:16841:36: ( '\\\\' ( 't' | 'b' | 'n' | 'r' | 'f' | '\\\\' | '\\\"' | '\\'' ) )
            	    {
            	    // Owl2fs.g:16841:36: ( '\\\\' ( 't' | 'b' | 'n' | 'r' | 'f' | '\\\\' | '\\\"' | '\\'' ) )
            	    // Owl2fs.g:16841:37: '\\\\' ( 't' | 'b' | 'n' | 'r' | 'f' | '\\\\' | '\\\"' | '\\'' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LITERAL"

    // $ANTLR start "NODE"
    public final void mNODE() throws RecognitionException {
        try {
            int _type = NODE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:16842:5: ( '_:' ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '0' .. '9' ) ( ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' | '.' )* ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '.' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' ) )? )
            // Owl2fs.g:16843:3: '_:' ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '0' .. '9' ) ( ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' | '.' )* ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '.' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' ) )?
            {
            match("_:"); 

            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u02FF')||(input.LA(1)>='\u0370' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFDCF')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFFFD') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // Owl2fs.g:16843:278: ( ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' | '.' )* ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '.' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='.'||(LA12_0>='0' && LA12_0<='9')||(LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')||LA12_0=='\u00B7'||(LA12_0>='\u00C0' && LA12_0<='\u00D6')||(LA12_0>='\u00D8' && LA12_0<='\u00F6')||(LA12_0>='\u00F8' && LA12_0<='\u037D')||(LA12_0>='\u037F' && LA12_0<='\u1FFF')||(LA12_0>='\u200C' && LA12_0<='\u200D')||(LA12_0>='\u203F' && LA12_0<='\u2040')||(LA12_0>='\u2070' && LA12_0<='\u218F')||(LA12_0>='\u2C00' && LA12_0<='\u2FEF')||(LA12_0>='\u3001' && LA12_0<='\uD7FF')||(LA12_0>='\uF900' && LA12_0<='\uFDCF')||(LA12_0>='\uFDF0' && LA12_0<='\uFFFD')) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // Owl2fs.g:16843:279: ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' | '.' )* ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '.' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' )
                    {
                    // Owl2fs.g:16843:279: ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' | '.' )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='.'||(LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')||LA11_0=='\u00B7'||(LA11_0>='\u00C0' && LA11_0<='\u00D6')||(LA11_0>='\u00D8' && LA11_0<='\u00F6')||(LA11_0>='\u00F8' && LA11_0<='\u037D')||(LA11_0>='\u037F' && LA11_0<='\u1FFF')||(LA11_0>='\u200C' && LA11_0<='\u200D')||(LA11_0>='\u203F' && LA11_0<='\u2040')||(LA11_0>='\u2070' && LA11_0<='\u218F')||(LA11_0>='\u2C00' && LA11_0<='\u2FEF')||(LA11_0>='\u3001' && LA11_0<='\uD7FF')||(LA11_0>='\uF900' && LA11_0<='\uFDCF')||(LA11_0>='\uFDF0' && LA11_0<='\uFFFD')) ) {
                            int LA11_1 = input.LA(2);

                            if ( (LA11_1=='.'||(LA11_1>='0' && LA11_1<='9')||(LA11_1>='A' && LA11_1<='Z')||LA11_1=='_'||(LA11_1>='a' && LA11_1<='z')||LA11_1=='\u00B7'||(LA11_1>='\u00C0' && LA11_1<='\u00D6')||(LA11_1>='\u00D8' && LA11_1<='\u00F6')||(LA11_1>='\u00F8' && LA11_1<='\u037D')||(LA11_1>='\u037F' && LA11_1<='\u1FFF')||(LA11_1>='\u200C' && LA11_1<='\u200D')||(LA11_1>='\u203F' && LA11_1<='\u2040')||(LA11_1>='\u2070' && LA11_1<='\u218F')||(LA11_1>='\u2C00' && LA11_1<='\u2FEF')||(LA11_1>='\u3001' && LA11_1<='\uD7FF')||(LA11_1>='\uF900' && LA11_1<='\uFDCF')||(LA11_1>='\uFDF0' && LA11_1<='\uFFFD')) ) {
                                alt11=1;
                            }


                        }


                        switch (alt11) {
                    	case 1 :
                    	    // Owl2fs.g:
                    	    {
                    	    if ( input.LA(1)=='.'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00B7'||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u203F' && input.LA(1)<='\u2040')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFDCF')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFFFD') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    if ( input.LA(1)=='.'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00B7'||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u203F' && input.LA(1)<='\u2040')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFDCF')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFFFD') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NODE"

    // $ANTLR start "FULLIRI"
    public final void mFULLIRI() throws RecognitionException {
        try {
            int _type = FULLIRI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:16844:8: ( '<' (~ ( '^' | '<' | '>' | '\"' | '{' | '}' | '`' | '\\\\' | '\\u0000' .. '\\u0020' ) )* '>' )
            // Owl2fs.g:16845:3: '<' (~ ( '^' | '<' | '>' | '\"' | '{' | '}' | '`' | '\\\\' | '\\u0000' .. '\\u0020' ) )* '>'
            {
            match('<'); 
            // Owl2fs.g:16845:7: (~ ( '^' | '<' | '>' | '\"' | '{' | '}' | '`' | '\\\\' | '\\u0000' .. '\\u0020' ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='!'||(LA13_0>='#' && LA13_0<=';')||LA13_0=='='||(LA13_0>='?' && LA13_0<='[')||LA13_0==']'||LA13_0=='_'||(LA13_0>='a' && LA13_0<='z')||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // Owl2fs.g:16845:8: ~ ( '^' | '<' | '>' | '\"' | '{' | '}' | '`' | '\\\\' | '\\u0000' .. '\\u0020' )
            	    {
            	    if ( input.LA(1)=='!'||(input.LA(1)>='#' && input.LA(1)<=';')||input.LA(1)=='='||(input.LA(1)>='?' && input.LA(1)<='[')||input.LA(1)==']'||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='|'||(input.LA(1)>='~' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FULLIRI"

    // $ANTLR start "ABBRIRI"
    public final void mABBRIRI() throws RecognitionException {
        try {
            int _type = ABBRIRI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:16846:8: ( ( ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '-' | '0' .. '9' ) ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '-' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' | '.' )* ) )
            // Owl2fs.g:16847:3: ( ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '-' | '0' .. '9' ) ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '-' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' | '.' )* )
            {
            // Owl2fs.g:16847:3: ( ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '-' | '0' .. '9' ) ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '-' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' | '.' )* )
            // Owl2fs.g:16847:4: ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '-' | '0' .. '9' ) ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '-' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' | '.' )*
            {
            if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u02FF')||(input.LA(1)>='\u0370' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFDCF')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFFFD') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // Owl2fs.g:16848:3: ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '-' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' | '.' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='-' && LA14_0<='.')||(LA14_0>='0' && LA14_0<='9')||(LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='z')||LA14_0=='\u00B7'||(LA14_0>='\u00C0' && LA14_0<='\u00D6')||(LA14_0>='\u00D8' && LA14_0<='\u00F6')||(LA14_0>='\u00F8' && LA14_0<='\u037D')||(LA14_0>='\u037F' && LA14_0<='\u1FFF')||(LA14_0>='\u200C' && LA14_0<='\u200D')||(LA14_0>='\u203F' && LA14_0<='\u2040')||(LA14_0>='\u2070' && LA14_0<='\u218F')||(LA14_0>='\u2C00' && LA14_0<='\u2FEF')||(LA14_0>='\u3001' && LA14_0<='\uD7FF')||(LA14_0>='\uF900' && LA14_0<='\uFDCF')||(LA14_0>='\uFDF0' && LA14_0<='\uFFFD')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // Owl2fs.g:
            	    {
            	    if ( (input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00B7'||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u203F' && input.LA(1)<='\u2040')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFDCF')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFFFD') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ABBRIRI"

    // $ANTLR start "LANGTAG"
    public final void mLANGTAG() throws RecognitionException {
        try {
            int _type = LANGTAG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Owl2fs.g:16849:8: ( '@' ( 'A' .. 'Z' | 'a' .. 'z' )+ )
            // Owl2fs.g:16850:3: '@' ( 'A' .. 'Z' | 'a' .. 'z' )+
            {
            match('@'); 
            // Owl2fs.g:16850:7: ( 'A' .. 'Z' | 'a' .. 'z' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='A' && LA15_0<='Z')||(LA15_0>='a' && LA15_0<='z')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // Owl2fs.g:
            	    {
            	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LANGTAG"

    public void mTokens() throws RecognitionException {
        // Owl2fs.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | WHITESPACE | LINEBREAKS | COMMENT | INTEGER | FLOAT | LITERAL | NODE | FULLIRI | ABBRIRI | LANGTAG )
        int alt16=102;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // Owl2fs.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // Owl2fs.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // Owl2fs.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // Owl2fs.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // Owl2fs.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // Owl2fs.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // Owl2fs.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // Owl2fs.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // Owl2fs.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // Owl2fs.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // Owl2fs.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // Owl2fs.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // Owl2fs.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // Owl2fs.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // Owl2fs.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // Owl2fs.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // Owl2fs.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // Owl2fs.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // Owl2fs.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // Owl2fs.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // Owl2fs.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // Owl2fs.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // Owl2fs.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // Owl2fs.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // Owl2fs.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // Owl2fs.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // Owl2fs.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // Owl2fs.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // Owl2fs.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // Owl2fs.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // Owl2fs.g:1:190: T__44
                {
                mT__44(); 

                }
                break;
            case 32 :
                // Owl2fs.g:1:196: T__45
                {
                mT__45(); 

                }
                break;
            case 33 :
                // Owl2fs.g:1:202: T__46
                {
                mT__46(); 

                }
                break;
            case 34 :
                // Owl2fs.g:1:208: T__47
                {
                mT__47(); 

                }
                break;
            case 35 :
                // Owl2fs.g:1:214: T__48
                {
                mT__48(); 

                }
                break;
            case 36 :
                // Owl2fs.g:1:220: T__49
                {
                mT__49(); 

                }
                break;
            case 37 :
                // Owl2fs.g:1:226: T__50
                {
                mT__50(); 

                }
                break;
            case 38 :
                // Owl2fs.g:1:232: T__51
                {
                mT__51(); 

                }
                break;
            case 39 :
                // Owl2fs.g:1:238: T__52
                {
                mT__52(); 

                }
                break;
            case 40 :
                // Owl2fs.g:1:244: T__53
                {
                mT__53(); 

                }
                break;
            case 41 :
                // Owl2fs.g:1:250: T__54
                {
                mT__54(); 

                }
                break;
            case 42 :
                // Owl2fs.g:1:256: T__55
                {
                mT__55(); 

                }
                break;
            case 43 :
                // Owl2fs.g:1:262: T__56
                {
                mT__56(); 

                }
                break;
            case 44 :
                // Owl2fs.g:1:268: T__57
                {
                mT__57(); 

                }
                break;
            case 45 :
                // Owl2fs.g:1:274: T__58
                {
                mT__58(); 

                }
                break;
            case 46 :
                // Owl2fs.g:1:280: T__59
                {
                mT__59(); 

                }
                break;
            case 47 :
                // Owl2fs.g:1:286: T__60
                {
                mT__60(); 

                }
                break;
            case 48 :
                // Owl2fs.g:1:292: T__61
                {
                mT__61(); 

                }
                break;
            case 49 :
                // Owl2fs.g:1:298: T__62
                {
                mT__62(); 

                }
                break;
            case 50 :
                // Owl2fs.g:1:304: T__63
                {
                mT__63(); 

                }
                break;
            case 51 :
                // Owl2fs.g:1:310: T__64
                {
                mT__64(); 

                }
                break;
            case 52 :
                // Owl2fs.g:1:316: T__65
                {
                mT__65(); 

                }
                break;
            case 53 :
                // Owl2fs.g:1:322: T__66
                {
                mT__66(); 

                }
                break;
            case 54 :
                // Owl2fs.g:1:328: T__67
                {
                mT__67(); 

                }
                break;
            case 55 :
                // Owl2fs.g:1:334: T__68
                {
                mT__68(); 

                }
                break;
            case 56 :
                // Owl2fs.g:1:340: T__69
                {
                mT__69(); 

                }
                break;
            case 57 :
                // Owl2fs.g:1:346: T__70
                {
                mT__70(); 

                }
                break;
            case 58 :
                // Owl2fs.g:1:352: T__71
                {
                mT__71(); 

                }
                break;
            case 59 :
                // Owl2fs.g:1:358: T__72
                {
                mT__72(); 

                }
                break;
            case 60 :
                // Owl2fs.g:1:364: T__73
                {
                mT__73(); 

                }
                break;
            case 61 :
                // Owl2fs.g:1:370: T__74
                {
                mT__74(); 

                }
                break;
            case 62 :
                // Owl2fs.g:1:376: T__75
                {
                mT__75(); 

                }
                break;
            case 63 :
                // Owl2fs.g:1:382: T__76
                {
                mT__76(); 

                }
                break;
            case 64 :
                // Owl2fs.g:1:388: T__77
                {
                mT__77(); 

                }
                break;
            case 65 :
                // Owl2fs.g:1:394: T__78
                {
                mT__78(); 

                }
                break;
            case 66 :
                // Owl2fs.g:1:400: T__79
                {
                mT__79(); 

                }
                break;
            case 67 :
                // Owl2fs.g:1:406: T__80
                {
                mT__80(); 

                }
                break;
            case 68 :
                // Owl2fs.g:1:412: T__81
                {
                mT__81(); 

                }
                break;
            case 69 :
                // Owl2fs.g:1:418: T__82
                {
                mT__82(); 

                }
                break;
            case 70 :
                // Owl2fs.g:1:424: T__83
                {
                mT__83(); 

                }
                break;
            case 71 :
                // Owl2fs.g:1:430: T__84
                {
                mT__84(); 

                }
                break;
            case 72 :
                // Owl2fs.g:1:436: T__85
                {
                mT__85(); 

                }
                break;
            case 73 :
                // Owl2fs.g:1:442: T__86
                {
                mT__86(); 

                }
                break;
            case 74 :
                // Owl2fs.g:1:448: T__87
                {
                mT__87(); 

                }
                break;
            case 75 :
                // Owl2fs.g:1:454: T__88
                {
                mT__88(); 

                }
                break;
            case 76 :
                // Owl2fs.g:1:460: T__89
                {
                mT__89(); 

                }
                break;
            case 77 :
                // Owl2fs.g:1:466: T__90
                {
                mT__90(); 

                }
                break;
            case 78 :
                // Owl2fs.g:1:472: T__91
                {
                mT__91(); 

                }
                break;
            case 79 :
                // Owl2fs.g:1:478: T__92
                {
                mT__92(); 

                }
                break;
            case 80 :
                // Owl2fs.g:1:484: T__93
                {
                mT__93(); 

                }
                break;
            case 81 :
                // Owl2fs.g:1:490: T__94
                {
                mT__94(); 

                }
                break;
            case 82 :
                // Owl2fs.g:1:496: T__95
                {
                mT__95(); 

                }
                break;
            case 83 :
                // Owl2fs.g:1:502: T__96
                {
                mT__96(); 

                }
                break;
            case 84 :
                // Owl2fs.g:1:508: T__97
                {
                mT__97(); 

                }
                break;
            case 85 :
                // Owl2fs.g:1:514: T__98
                {
                mT__98(); 

                }
                break;
            case 86 :
                // Owl2fs.g:1:520: T__99
                {
                mT__99(); 

                }
                break;
            case 87 :
                // Owl2fs.g:1:526: T__100
                {
                mT__100(); 

                }
                break;
            case 88 :
                // Owl2fs.g:1:533: T__101
                {
                mT__101(); 

                }
                break;
            case 89 :
                // Owl2fs.g:1:540: T__102
                {
                mT__102(); 

                }
                break;
            case 90 :
                // Owl2fs.g:1:547: T__103
                {
                mT__103(); 

                }
                break;
            case 91 :
                // Owl2fs.g:1:554: T__104
                {
                mT__104(); 

                }
                break;
            case 92 :
                // Owl2fs.g:1:561: T__105
                {
                mT__105(); 

                }
                break;
            case 93 :
                // Owl2fs.g:1:568: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;
            case 94 :
                // Owl2fs.g:1:579: LINEBREAKS
                {
                mLINEBREAKS(); 

                }
                break;
            case 95 :
                // Owl2fs.g:1:590: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 96 :
                // Owl2fs.g:1:598: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 97 :
                // Owl2fs.g:1:606: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 98 :
                // Owl2fs.g:1:612: LITERAL
                {
                mLITERAL(); 

                }
                break;
            case 99 :
                // Owl2fs.g:1:620: NODE
                {
                mNODE(); 

                }
                break;
            case 100 :
                // Owl2fs.g:1:625: FULLIRI
                {
                mFULLIRI(); 

                }
                break;
            case 101 :
                // Owl2fs.g:1:633: ABBRIRI
                {
                mABBRIRI(); 

                }
                break;
            case 102 :
                // Owl2fs.g:1:641: LANGTAG
                {
                mLANGTAG(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\1\uffff\1\41\1\36\2\uffff\7\36\1\uffff\10\36\3\uffff\1\36\2\102"+
        "\1\uffff\1\36\5\uffff\35\36\1\102\1\36\1\102\1\uffff\1\36\1\uffff"+
        "\40\36\1\u0089\36\36\1\u00b3\1\u00b4\3\36\1\uffff\25\36\1\u00cf"+
        "\4\36\1\u00d4\10\36\1\u00dd\5\36\2\uffff\3\36\1\u00e6\2\36\1\u00f2"+
        "\23\36\1\uffff\4\36\1\uffff\10\36\1\uffff\4\36\1\u0117\3\36\1\uffff"+
        "\13\36\1\uffff\44\36\1\uffff\3\36\1\u014f\20\36\1\u0163\40\36\1"+
        "\u0188\1\36\1\uffff\23\36\1\uffff\2\36\1\u01a1\16\36\1\u01b0\22"+
        "\36\1\uffff\30\36\1\uffff\14\36\1\u01e7\1\36\1\uffff\1\u01eb\6\36"+
        "\1\u01f2\20\36\1\u0206\12\36\1\u0211\22\36\1\uffff\3\36\1\uffff"+
        "\6\36\1\uffff\14\36\1\u0239\1\u023a\5\36\1\uffff\12\36\1\uffff\3"+
        "\36\1\u0250\4\36\1\u0255\36\36\2\uffff\3\36\1\u0277\4\36\1\u027c"+
        "\14\36\1\uffff\4\36\1\uffff\3\36\1\u0290\1\36\1\u0292\12\36\1\u029d"+
        "\10\36\1\u02a6\4\36\1\u02af\2\36\1\uffff\3\36\1\u02b5\1\uffff\23"+
        "\36\1\uffff\1\36\1\uffff\3\36\1\u02cd\6\36\1\uffff\4\36\1\u02d9"+
        "\3\36\1\uffff\10\36\1\uffff\1\u02e6\4\36\1\uffff\14\36\1\u02f7\6"+
        "\36\1\u02fe\3\36\1\uffff\3\36\1\u0305\7\36\1\uffff\14\36\1\uffff"+
        "\12\36\1\u0324\5\36\1\uffff\1\u032a\5\36\1\uffff\6\36\1\uffff\36"+
        "\36\1\uffff\3\36\1\u0357\1\36\1\uffff\1\36\1\u035a\15\36\1\u0368"+
        "\2\36\1\u036b\12\36\1\u0376\1\36\1\u0378\12\36\1\u0383\1\u0384\1"+
        "\uffff\1\36\1\u0386\1\uffff\1\u0387\1\u0388\4\36\1\u038f\6\36\1"+
        "\uffff\1\36\1\u0397\1\uffff\6\36\1\u039e\1\36\1\u03a0\1\36\1\uffff"+
        "\1\36\1\uffff\1\36\1\u03a4\7\36\1\u03ac\2\uffff\1\36\3\uffff\6\36"+
        "\1\uffff\1\u03b4\4\36\1\u03b9\1\36\1\uffff\6\36\1\uffff\1\u03c1"+
        "\1\uffff\1\36\1\u03c3\1\u03c4\1\uffff\1\u03c5\1\u03c6\4\36\1\u03cb"+
        "\1\uffff\1\36\1\u03cd\2\36\1\u03d1\2\36\1\uffff\4\36\1\uffff\7\36"+
        "\1\uffff\1\36\4\uffff\4\36\1\uffff\1\u03e4\1\uffff\3\36\1\uffff"+
        "\16\36\1\u03f6\3\36\1\uffff\1\36\1\u03fb\13\36\1\u0407\2\36\1\u040a"+
        "\1\uffff\1\u040b\3\36\1\uffff\2\36\1\u0411\3\36\1\u0415\1\u0416"+
        "\3\36\1\uffff\1\u041a\1\36\2\uffff\2\36\1\u041e\1\u041f\1\u0420"+
        "\1\uffff\3\36\2\uffff\1\36\1\u0425\1\u0426\1\uffff\1\u0427\1\36"+
        "\1\u0429\3\uffff\4\36\3\uffff\1\36\1\uffff\3\36\1\u0432\1\36\1\u0434"+
        "\2\36\1\uffff\1\36\1\uffff\4\36\1\u043c\2\36\1\uffff\1\u043f\1\u0440"+
        "\2\uffff";
    static final String DFA16_eofS =
        "\u0441\uffff";
    static final String DFA16_minS =
        "\1\11\1\75\1\162\2\uffff\1\142\1\155\1\114\1\154\1\156\2\141\1"+
        "\uffff\1\144\1\165\1\145\1\162\1\141\1\157\2\141\3\uffff\1\60\2"+
        "\55\1\uffff\1\72\5\uffff\1\145\1\164\1\152\1\160\1\166\1\162\1\143"+
        "\1\164\1\146\1\123\1\141\1\156\1\155\1\147\1\144\1\142\2\155\1\165"+
        "\1\147\1\156\1\146\1\141\1\163\1\141\1\144\1\151\1\162\1\151\1\55"+
        "\1\56\1\55\1\uffff\1\60\1\uffff\1\146\1\157\1\145\1\157\2\145\1"+
        "\154\1\143\1\141\1\152\1\146\1\141\1\163\1\157\1\151\1\145\1\141"+
        "\1\145\1\101\1\155\1\145\1\151\1\145\1\143\1\154\1\156\1\113\1\144"+
        "\1\171\1\154\1\151\1\156\1\55\1\151\1\154\1\143\2\162\1\146\1\141"+
        "\1\162\1\101\1\157\1\145\1\146\1\163\1\164\1\123\1\144\1\164\1\101"+
        "\1\156\1\154\1\142\1\141\1\145\1\111\1\166\1\101\1\164\1\145\1\163"+
        "\1\145\2\55\1\164\1\141\1\103\1\uffff\1\170\1\157\2\164\1\163\1"+
        "\154\1\162\1\151\1\171\1\162\1\157\1\156\1\157\1\154\2\141\1\170"+
        "\1\141\1\151\1\162\1\145\1\55\1\141\1\171\1\111\1\151\1\55\1\163"+
        "\1\156\1\141\1\152\2\164\1\156\1\141\1\55\1\163\1\151\1\170\1\151"+
        "\1\171\2\uffff\1\111\1\142\1\154\1\55\1\147\1\101\1\55\2\145\1\141"+
        "\2\160\1\157\1\155\1\145\1\155\1\154\1\163\1\156\1\170\1\141\2\156"+
        "\1\145\1\122\1\163\1\uffff\1\164\1\155\1\156\1\166\1\uffff\1\163"+
        "\1\157\1\163\1\145\1\141\1\162\1\144\1\154\1\uffff\1\163\1\157\1"+
        "\151\1\164\1\55\1\156\1\154\1\141\1\uffff\1\171\1\162\2\156\1\157"+
        "\1\156\1\157\1\154\2\141\1\170\1\uffff\1\106\1\170\2\164\1\145\2"+
        "\160\1\117\1\145\2\126\2\103\1\143\1\147\1\164\1\156\1\165\1\163"+
        "\1\157\1\151\1\155\1\144\2\145\1\164\1\163\1\143\1\120\2\151\2\145"+
        "\1\156\1\166\1\151\1\uffff\1\101\1\145\1\163\1\55\1\157\1\164\1"+
        "\151\1\155\1\145\1\155\1\154\1\163\1\156\1\170\1\141\1\142\1\165"+
        "\3\151\1\55\1\145\1\154\1\146\1\126\4\141\1\164\1\145\1\103\1\164"+
        "\1\154\1\145\1\155\1\157\1\145\1\151\1\104\1\162\1\141\1\117\1\164"+
        "\1\162\1\143\1\166\1\156\1\162\1\141\1\145\1\166\1\164\1\55\1\163"+
        "\1\uffff\1\160\2\145\1\157\1\160\1\117\1\145\1\126\1\123\2\103\1"+
        "\143\1\152\1\156\1\166\2\157\2\145\1\uffff\1\162\1\145\1\55\1\141"+
        "\2\154\2\162\1\103\1\101\1\154\1\156\1\142\1\141\1\111\1\145\1\162"+
        "\1\55\1\156\1\164\1\166\1\142\1\141\2\164\1\146\1\120\1\157\1\117"+
        "\1\151\2\164\1\154\1\117\1\145\1\157\1\uffff\2\145\2\162\1\156\1"+
        "\154\1\146\1\126\2\141\1\145\2\141\1\164\1\145\1\143\1\145\2\156"+
        "\1\163\1\146\1\164\1\171\1\155\1\uffff\1\154\2\165\2\144\1\141\1"+
        "\164\1\141\1\151\1\152\1\164\1\156\1\55\1\164\1\uffff\1\55\1\162"+
        "\1\151\1\152\1\164\2\151\1\55\1\162\1\160\1\142\1\144\1\103\1\151"+
        "\1\104\1\142\1\117\1\155\1\163\1\162\2\163\1\117\1\145\1\55\1\141"+
        "\3\154\2\162\1\103\1\143\1\164\1\117\1\55\1\107\1\164\1\151\1\171"+
        "\1\101\1\145\1\165\2\145\2\151\1\162\1\157\1\163\1\157\1\145\1\141"+
        "\1\144\1\uffff\1\151\1\162\1\163\1\uffff\1\151\1\144\1\145\1\141"+
        "\2\157\1\uffff\1\157\1\145\1\152\1\165\1\154\1\142\1\141\1\157\1"+
        "\142\1\141\1\152\1\142\2\55\1\164\2\145\1\146\1\155\1\uffff\1\154"+
        "\2\165\1\146\2\144\1\141\1\164\1\151\1\142\1\uffff\2\162\1\156\1"+
        "\55\1\164\1\156\1\145\1\163\1\55\2\156\1\144\1\155\1\163\1\156\1"+
        "\143\1\120\1\151\2\157\1\163\1\143\1\165\1\143\1\120\2\156\1\160"+
        "\1\162\1\145\2\141\1\152\1\164\1\156\1\152\1\164\1\145\1\152\2\uffff"+
        "\1\171\1\117\1\143\1\55\1\145\1\165\2\145\1\55\2\151\1\162\1\120"+
        "\1\157\1\152\1\141\2\151\1\157\1\141\1\163\1\uffff\1\157\1\164\1"+
        "\163\1\106\1\uffff\2\141\1\151\1\55\1\145\1\55\1\164\1\162\1\166"+
        "\1\156\1\160\1\145\1\117\1\141\1\164\1\162\1\55\1\120\1\145\1\164"+
        "\1\143\1\154\1\163\1\145\1\141\1\55\1\145\1\141\1\143\1\145\1\55"+
        "\1\146\1\164\1\uffff\1\156\1\145\1\163\1\55\1\uffff\2\156\1\144"+
        "\1\162\1\156\1\145\1\160\1\143\1\164\1\155\1\156\1\163\1\155\1\117"+
        "\1\106\1\162\2\154\1\156\1\uffff\1\163\1\uffff\1\120\1\157\1\151"+
        "\1\55\1\145\1\162\1\142\1\154\1\120\1\157\1\uffff\2\162\1\171\1"+
        "\164\1\55\1\163\1\143\1\120\1\uffff\1\143\1\120\1\164\1\143\1\150"+
        "\1\157\1\141\1\163\1\uffff\1\55\1\151\1\164\1\163\1\106\1\uffff"+
        "\2\141\1\151\1\157\1\141\1\143\1\150\1\164\1\151\1\141\1\147\1\145"+
        "\1\55\1\146\1\162\1\157\2\151\1\141\1\55\1\162\1\160\1\144\1\uffff"+
        "\1\162\1\164\1\152\1\55\1\162\1\160\1\157\1\164\1\117\1\120\1\164"+
        "\1\uffff\1\145\1\164\1\162\1\164\1\162\1\120\1\164\1\141\1\155\1"+
        "\156\1\163\1\157\1\uffff\1\157\1\117\1\106\1\162\2\154\1\156\1\160"+
        "\1\154\1\164\1\55\1\151\1\157\1\151\1\145\1\162\1\uffff\1\55\1\157"+
        "\1\155\2\164\1\154\1\uffff\1\157\1\145\1\165\1\164\1\151\1\145\1"+
        "\uffff\1\157\1\145\1\160\1\171\1\146\1\162\1\157\1\163\1\120\1\157"+
        "\1\120\1\157\1\162\1\120\1\151\1\141\1\147\1\145\1\155\1\156\1\146"+
        "\1\162\1\157\2\151\1\141\1\145\1\117\1\120\1\165\1\uffff\1\157\2"+
        "\156\1\55\1\164\1\uffff\1\155\1\55\2\171\1\151\1\160\1\162\1\141"+
        "\1\171\1\157\1\143\1\160\1\162\1\145\1\117\1\55\1\157\1\155\1\55"+
        "\1\162\1\160\1\162\1\160\1\157\1\162\1\156\1\151\1\145\1\162\1\55"+
        "\1\117\1\55\1\157\1\155\2\164\1\154\1\162\1\142\1\162\1\154\1\156"+
        "\2\55\1\uffff\1\151\1\55\1\uffff\2\55\1\164\1\145\1\164\1\154\1"+
        "\55\1\156\1\164\1\145\1\164\1\162\1\146\1\uffff\1\160\1\55\1\uffff"+
        "\1\157\1\145\1\157\1\145\1\160\1\157\1\55\1\156\1\55\1\164\1\uffff"+
        "\1\146\1\uffff\1\155\1\55\2\171\1\151\1\164\1\152\1\157\1\145\1"+
        "\55\2\uffff\1\157\3\uffff\1\171\1\162\1\151\1\163\1\157\1\141\1"+
        "\uffff\1\55\1\120\1\162\1\171\1\164\1\55\1\145\1\uffff\1\160\1\162"+
        "\1\160\1\162\1\145\1\160\1\uffff\1\55\1\uffff\1\151\2\55\1\uffff"+
        "\2\55\1\164\1\151\1\145\1\160\1\55\1\uffff\1\156\1\55\1\164\1\145"+
        "\1\55\1\155\1\156\1\uffff\1\162\1\164\1\101\1\171\1\uffff\1\162"+
        "\1\145\1\164\1\145\1\164\1\162\1\145\1\uffff\1\157\4\uffff\1\171"+
        "\1\145\1\143\1\145\1\uffff\1\55\1\uffff\1\151\1\163\1\164\1\uffff"+
        "\1\141\1\147\1\157\1\171\1\163\1\117\1\164\1\162\1\151\1\162\1\171"+
        "\1\164\1\162\1\156\1\55\1\163\1\164\1\162\1\uffff\1\145\1\55\1\157"+
        "\1\151\1\145\1\160\1\101\1\163\1\146\1\171\1\164\1\145\1\164\1\55"+
        "\1\171\1\164\1\55\1\uffff\1\55\1\120\1\164\1\163\1\uffff\1\155\1"+
        "\156\1\55\1\145\1\163\1\145\2\55\1\151\1\163\1\171\1\uffff\1\55"+
        "\1\171\2\uffff\1\162\1\171\3\55\1\uffff\1\162\1\163\1\162\2\uffff"+
        "\1\145\2\55\1\uffff\1\55\1\157\1\55\3\uffff\1\164\1\145\1\164\1"+
        "\163\3\uffff\1\160\1\uffff\1\171\1\162\1\151\1\55\1\145\1\55\1\164"+
        "\1\157\1\uffff\1\162\1\uffff\1\151\1\156\1\164\1\157\1\55\1\171"+
        "\1\156\1\uffff\2\55\2\uffff";
    static final String DFA16_maxS =
        "\1\ufffd\1\75\1\162\2\uffff\1\156\1\162\1\151\1\154\1\156\1\157"+
        "\1\171\1\uffff\1\161\1\165\1\145\1\162\1\145\1\165\2\141\3\uffff"+
        "\1\71\2\ufffd\1\uffff\1\72\5\uffff\1\145\1\164\1\152\1\160\1\166"+
        "\1\162\1\163\1\164\1\163\1\123\1\141\1\164\1\155\1\147\1\144\1\142"+
        "\2\155\1\165\1\147\1\156\1\146\1\141\1\163\1\141\1\144\1\151\1\162"+
        "\1\151\1\ufffd\1\56\1\ufffd\1\uffff\1\71\1\uffff\1\146\1\157\1\145"+
        "\1\157\2\145\1\154\1\143\1\141\1\152\1\146\1\141\1\163\1\157\1\151"+
        "\1\145\1\141\1\145\1\117\1\155\1\145\1\151\1\145\1\143\1\154\1\156"+
        "\1\113\1\144\1\171\1\154\1\151\1\156\1\ufffd\1\151\1\154\1\143\2"+
        "\162\1\146\1\141\1\162\1\164\1\157\1\145\1\146\1\163\1\164\1\123"+
        "\1\144\1\164\1\163\1\156\1\154\1\142\1\141\1\145\1\111\1\166\1\163"+
        "\1\164\1\145\1\163\1\145\2\ufffd\1\164\1\141\1\103\1\uffff\1\170"+
        "\1\157\2\164\1\163\1\154\1\162\1\151\1\171\1\162\1\157\1\156\1\157"+
        "\1\154\1\141\1\151\1\170\1\141\1\151\1\162\1\145\1\ufffd\1\141\1"+
        "\171\1\111\1\151\1\ufffd\1\163\1\156\1\141\1\152\2\164\1\156\1\141"+
        "\1\ufffd\1\163\1\151\1\170\1\151\1\171\2\uffff\1\111\1\142\1\154"+
        "\1\ufffd\1\147\1\125\1\ufffd\2\145\1\141\2\160\1\157\1\155\1\145"+
        "\1\155\1\154\1\163\1\156\1\170\1\141\2\156\1\145\1\122\1\164\1\uffff"+
        "\1\164\1\155\1\156\1\166\1\uffff\1\163\1\157\1\163\1\145\1\141\1"+
        "\162\1\144\1\154\1\uffff\1\163\1\157\1\151\1\164\1\ufffd\1\156\1"+
        "\154\1\141\1\uffff\1\171\1\162\2\156\1\157\1\156\1\157\1\154\1\141"+
        "\1\151\1\170\1\uffff\1\117\1\170\2\164\1\145\2\160\1\117\1\145\2"+
        "\126\2\103\1\143\1\147\1\164\1\156\1\165\1\163\1\157\1\151\1\155"+
        "\1\144\2\145\1\164\1\163\1\143\1\120\2\151\2\145\1\156\1\166\1\151"+
        "\1\uffff\1\101\1\145\1\163\1\ufffd\1\157\1\166\1\151\1\155\1\145"+
        "\1\155\1\154\1\163\1\156\1\170\1\141\1\142\1\165\3\151\1\ufffd\1"+
        "\145\1\154\1\146\1\126\4\141\1\164\1\145\1\125\1\164\1\154\1\145"+
        "\1\155\1\157\1\145\1\151\1\117\1\162\1\141\1\117\1\164\1\162\1\143"+
        "\1\166\1\156\1\162\1\141\1\145\1\166\1\164\1\ufffd\1\163\1\uffff"+
        "\1\160\2\145\1\157\1\160\1\117\1\145\2\126\2\103\1\143\1\152\1\156"+
        "\1\166\2\157\2\145\1\uffff\1\164\1\145\1\ufffd\1\141\2\154\2\162"+
        "\1\103\1\101\1\154\1\156\1\142\1\141\1\111\1\145\1\162\1\ufffd\1"+
        "\156\1\164\1\166\1\142\1\141\2\164\1\146\1\120\1\157\1\117\1\151"+
        "\2\164\1\154\1\117\1\145\1\157\1\uffff\2\145\2\162\1\156\1\154\1"+
        "\146\1\126\2\141\1\145\2\141\1\164\1\145\1\143\1\145\2\156\1\163"+
        "\1\146\1\164\1\171\1\155\1\uffff\1\154\2\165\2\144\1\141\1\164\1"+
        "\141\1\151\1\152\1\164\1\156\1\ufffd\1\164\1\uffff\1\ufffd\1\162"+
        "\1\151\1\152\1\164\2\151\1\ufffd\1\162\1\160\1\142\1\144\1\117\1"+
        "\151\1\117\1\142\1\117\1\155\1\163\1\162\2\163\1\117\1\145\1\ufffd"+
        "\1\141\3\154\2\162\1\103\1\143\1\164\1\117\1\ufffd\1\107\1\164\1"+
        "\151\1\171\1\101\1\145\1\165\2\145\2\151\1\162\1\157\1\163\1\157"+
        "\1\145\1\141\1\144\1\uffff\1\151\1\162\1\163\1\uffff\1\151\1\144"+
        "\1\145\1\141\2\157\1\uffff\1\157\1\145\1\152\1\165\1\154\1\142\1"+
        "\141\1\157\1\142\1\141\1\152\1\142\2\ufffd\1\164\2\145\1\146\1\155"+
        "\1\uffff\1\154\2\165\1\146\2\144\1\141\1\164\1\151\1\142\1\uffff"+
        "\2\162\1\156\1\ufffd\1\164\1\156\1\145\1\163\1\ufffd\2\156\1\144"+
        "\1\155\1\163\1\156\1\143\1\120\1\151\2\157\1\163\1\143\1\165\1\143"+
        "\1\120\2\156\1\160\1\162\1\145\2\141\1\152\1\164\1\156\1\152\1\164"+
        "\1\145\1\152\2\uffff\1\171\1\117\1\143\1\ufffd\1\145\1\165\2\145"+
        "\1\ufffd\2\151\1\162\1\120\1\157\1\152\1\141\2\151\1\157\1\141\1"+
        "\163\1\uffff\1\157\1\164\1\163\1\106\1\uffff\2\141\1\151\1\ufffd"+
        "\1\145\1\ufffd\1\164\1\162\1\166\1\156\1\160\1\145\1\117\1\141\1"+
        "\164\1\162\1\ufffd\1\120\1\145\1\164\1\143\1\154\1\163\1\145\1\141"+
        "\1\ufffd\1\145\1\141\1\143\1\145\1\ufffd\1\146\1\164\1\uffff\1\156"+
        "\1\145\1\163\1\ufffd\1\uffff\2\156\1\144\1\162\1\156\1\145\1\160"+
        "\1\143\1\164\1\155\1\156\1\163\1\155\1\117\1\106\1\162\2\154\1\156"+
        "\1\uffff\1\163\1\uffff\1\120\1\157\1\151\1\ufffd\1\145\1\162\1\142"+
        "\1\154\1\120\1\157\1\uffff\2\162\1\171\1\164\1\ufffd\1\163\1\143"+
        "\1\120\1\uffff\1\143\1\120\1\164\1\143\1\150\1\157\1\141\1\164\1"+
        "\uffff\1\ufffd\1\151\1\164\1\163\1\106\1\uffff\2\141\1\151\1\157"+
        "\1\141\1\143\1\150\1\164\1\151\1\141\1\147\1\145\1\ufffd\1\146\1"+
        "\162\1\157\2\151\1\141\1\ufffd\1\162\1\160\1\144\1\uffff\1\162\1"+
        "\164\1\152\1\ufffd\1\162\1\160\1\157\1\164\1\117\1\120\1\164\1\uffff"+
        "\1\145\1\164\1\162\1\164\1\162\1\120\1\164\1\141\1\155\1\156\1\163"+
        "\1\157\1\uffff\1\157\1\117\1\106\1\162\2\154\1\156\1\160\1\154\1"+
        "\164\1\ufffd\1\151\1\157\1\151\1\145\1\162\1\uffff\1\ufffd\1\157"+
        "\1\155\2\164\1\154\1\uffff\1\157\1\145\1\165\1\164\1\151\1\145\1"+
        "\uffff\1\157\1\145\1\160\1\171\1\146\1\162\1\157\1\163\1\120\1\157"+
        "\1\120\1\157\1\162\1\120\1\151\1\141\1\147\1\145\1\155\1\156\1\146"+
        "\1\162\1\157\2\151\1\141\1\145\1\117\1\120\1\165\1\uffff\1\157\2"+
        "\156\1\ufffd\1\164\1\uffff\1\155\1\ufffd\2\171\1\151\1\160\1\162"+
        "\1\141\1\171\1\157\1\143\1\160\1\162\1\145\1\117\1\ufffd\1\157\1"+
        "\155\1\ufffd\1\162\1\160\1\162\1\160\1\157\1\162\1\156\1\151\1\145"+
        "\1\162\1\ufffd\1\117\1\ufffd\1\157\1\155\2\164\1\154\1\162\1\142"+
        "\1\162\1\154\1\156\2\ufffd\1\uffff\1\151\1\ufffd\1\uffff\2\ufffd"+
        "\1\164\1\145\1\164\1\154\1\ufffd\1\156\1\164\1\145\1\164\1\162\1"+
        "\146\1\uffff\1\160\1\ufffd\1\uffff\1\157\1\145\1\157\1\145\1\160"+
        "\1\157\1\ufffd\1\156\1\ufffd\1\164\1\uffff\1\146\1\uffff\1\155\1"+
        "\ufffd\2\171\1\151\1\164\1\152\1\157\1\145\1\ufffd\2\uffff\1\157"+
        "\3\uffff\1\171\1\162\1\151\1\163\1\157\1\141\1\uffff\1\ufffd\1\120"+
        "\1\162\1\171\1\164\1\ufffd\1\145\1\uffff\1\160\1\162\1\160\1\162"+
        "\1\145\1\160\1\uffff\1\ufffd\1\uffff\1\151\2\ufffd\1\uffff\2\ufffd"+
        "\1\164\1\151\1\145\1\160\1\ufffd\1\uffff\1\156\1\ufffd\1\164\1\145"+
        "\1\ufffd\1\155\1\156\1\uffff\1\162\1\164\1\101\1\171\1\uffff\1\162"+
        "\1\145\1\164\1\145\1\164\1\162\1\145\1\uffff\1\157\4\uffff\1\171"+
        "\1\145\1\143\1\145\1\uffff\1\ufffd\1\uffff\1\151\1\163\1\164\1\uffff"+
        "\1\141\1\147\1\157\1\171\1\163\1\117\1\164\1\162\1\151\1\162\1\171"+
        "\1\164\1\162\1\156\1\ufffd\1\163\1\164\1\162\1\uffff\1\145\1\ufffd"+
        "\1\157\1\151\1\145\1\160\1\101\1\163\1\146\1\171\1\164\1\145\1\164"+
        "\1\ufffd\1\171\1\164\1\ufffd\1\uffff\1\ufffd\1\120\1\164\1\163\1"+
        "\uffff\1\155\1\156\1\ufffd\1\145\1\163\1\145\2\ufffd\1\151\1\163"+
        "\1\171\1\uffff\1\ufffd\1\171\2\uffff\1\162\1\171\3\ufffd\1\uffff"+
        "\1\162\1\163\1\162\2\uffff\1\145\2\ufffd\1\uffff\1\ufffd\1\157\1"+
        "\ufffd\3\uffff\1\164\1\145\1\164\1\163\3\uffff\1\160\1\uffff\1\171"+
        "\1\162\1\151\1\ufffd\1\145\1\ufffd\1\164\1\157\1\uffff\1\162\1\uffff"+
        "\1\151\1\156\1\164\1\157\1\ufffd\1\171\1\156\1\uffff\2\ufffd\2\uffff";
    static final String DFA16_acceptS =
        "\3\uffff\1\3\1\5\7\uffff\1\24\10\uffff\1\135\1\136\1\137\3\uffff"+
        "\1\142\1\uffff\1\144\1\145\1\146\1\4\1\1\40\uffff\1\140\1\uffff"+
        "\1\143\104\uffff\1\141\51\uffff\1\115\1\114\32\uffff\1\11\4\uffff"+
        "\1\130\10\uffff\1\132\10\uffff\1\2\13\uffff\1\7\44\uffff\1\103\67"+
        "\uffff\1\6\23\uffff\1\12\44\uffff\1\125\30\uffff\1\27\16\uffff\1"+
        "\116\66\uffff\1\113\3\uffff\1\23\6\uffff\1\52\23\uffff\1\34\12\uffff"+
        "\1\10\47\uffff\1\122\1\134\25\uffff\1\14\4\uffff\1\46\41\uffff\1"+
        "\32\4\uffff\1\40\23\uffff\1\117\1\uffff\1\55\12\uffff\1\131\10\uffff"+
        "\1\133\10\uffff\1\13\5\uffff\1\37\27\uffff\1\106\13\uffff\1\104"+
        "\14\uffff\1\25\20\uffff\1\121\6\uffff\1\54\6\uffff\1\16\36\uffff"+
        "\1\127\5\uffff\1\26\54\uffff\1\100\2\uffff\1\45\15\uffff\1\74\2"+
        "\uffff\1\53\12\uffff\1\120\1\uffff\1\33\12\uffff\1\102\1\77\1\uffff"+
        "\1\44\1\47\1\50\6\uffff\1\15\7\uffff\1\123\6\uffff\1\57\1\uffff"+
        "\1\63\3\uffff\1\36\7\uffff\1\30\7\uffff\1\17\4\uffff\1\56\7\uffff"+
        "\1\62\1\uffff\1\31\1\35\1\41\1\42\4\uffff\1\126\1\uffff\1\51\3\uffff"+
        "\1\105\22\uffff\1\111\21\uffff\1\43\4\uffff\1\76\13\uffff\1\101"+
        "\2\uffff\1\107\1\64\5\uffff\1\22\3\uffff\1\20\1\71\3\uffff\1\67"+
        "\3\uffff\1\61\1\124\1\21\4\uffff\1\75\1\65\1\73\1\uffff\1\70\10"+
        "\uffff\1\60\1\uffff\1\72\7\uffff\1\112\2\uffff\1\66\1\110";
    static final String DFA16_specialS =
        "\u0441\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\25\1\26\1\uffff\1\25\1\26\22\uffff\1\25\1\uffff\1\33\5\uffff"+
            "\1\3\1\4\3\uffff\1\30\1\uffff\1\27\1\32\11\31\1\1\1\uffff\1"+
            "\35\3\uffff\1\37\1\11\1\22\1\10\1\7\1\15\1\16\1\36\1\21\1\6"+
            "\3\36\1\24\1\12\1\5\1\2\1\36\1\17\1\13\1\20\1\36\1\23\4\36\3"+
            "\uffff\1\14\1\34\1\uffff\32\36\105\uffff\27\36\1\uffff\37\36"+
            "\1\uffff\u0208\36\160\uffff\16\36\1\uffff\u1c81\36\14\uffff"+
            "\2\36\142\uffff\u0120\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff"+
            "\36\u2100\uffff\u04d0\36\40\uffff\u020e\36",
            "\1\40",
            "\1\42",
            "",
            "",
            "\1\44\13\uffff\1\43",
            "\1\45\1\46\3\uffff\1\47",
            "\1\53\24\uffff\1\51\3\uffff\1\50\3\uffff\1\52",
            "\1\54",
            "\1\55",
            "\1\56\3\uffff\1\57\11\uffff\1\60",
            "\1\63\23\uffff\1\61\3\uffff\1\62",
            "",
            "\1\65\14\uffff\1\64",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71\3\uffff\1\72",
            "\1\73\5\uffff\1\74",
            "\1\75",
            "\1\76",
            "",
            "",
            "",
            "\1\100\11\77",
            "\1\36\1\103\1\uffff\12\101\7\uffff\32\36\4\uffff\1\36\1\uffff"+
            "\32\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\36\1\103\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff"+
            "\32\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "",
            "\1\104",
            "",
            "",
            "",
            "",
            "",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113\17\uffff\1\114",
            "\1\115",
            "\1\117\14\uffff\1\116",
            "\1\120",
            "\1\121",
            "\1\122\5\uffff\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\36\1\103\1\uffff\12\101\7\uffff\32\36\4\uffff\1\36\1\uffff"+
            "\32\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\103",
            "\1\36\1\103\1\uffff\12\101\7\uffff\32\36\4\uffff\1\36\1\uffff"+
            "\32\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "",
            "\12\145",
            "",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170\1\uffff\1\171\1\173\12\uffff\1\172",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\2\36\1\uffff\12\145\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0097\1\uffff\1\u0094\1\uffff\1\u009a\2\uffff\1\u0098\4"+
            "\uffff\1\u0099\1\uffff\1\u0095\1\u0093\1\uffff\1\u009b\1\u0096"+
            "\40\uffff\1\u0092",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a5\61\uffff\1\u00a4",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ae\61\uffff\1\u00ad",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c8\7\uffff\1\u00c7",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\2\36\1\uffff\12\36\7\uffff\1\u00ce\31\36\4\uffff\1\36\1\uffff"+
            "\32\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "",
            "",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u00e7",
            "\1\u00ee\1\uffff\1\u00eb\1\uffff\1\u00f1\2\uffff\1\u00ef\1"+
            "\u00e9\3\uffff\1\u00f0\1\uffff\1\u00ec\1\u00e8\2\uffff\1\u00ed"+
            "\1\uffff\1\u00ea",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105\1\u0106",
            "",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0125\7\uffff\1\u0124",
            "\1\u0126",
            "",
            "\1\u0128\10\uffff\1\u0127",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u0150",
            "\1\u0152\1\uffff\1\u0151",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\2\36\1\uffff\12\36\7\uffff\3\36\1\u0162\15\36\1\u0161\10"+
            "\36\4\uffff\1\36\1\uffff\32\36\74\uffff\1\36\10\uffff\27\36"+
            "\1\uffff\37\36\1\uffff\u0286\36\1\uffff\u1c81\36\14\uffff\2"+
            "\36\61\uffff\2\36\57\uffff\u0120\36\u0a70\uffff\u03f0\36\21"+
            "\uffff\ua7ff\36\u2100\uffff\u04d0\36\40\uffff\u020e\36",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e\1\u0171\12\uffff\1\u0170\5\uffff\1\u016f",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\1\u017a\12\uffff\1\u0179",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u0189",
            "",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\u0193\2\uffff\1\u0192",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "\1\u0197",
            "\1\u0198",
            "\1\u0199",
            "\1\u019a",
            "\1\u019b",
            "\1\u019c",
            "\1\u019d",
            "",
            "\1\u019e\1\uffff\1\u019f",
            "\1\u01a0",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u01a2",
            "\1\u01a3",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "\1\u01a7",
            "\1\u01a8",
            "\1\u01a9",
            "\1\u01aa",
            "\1\u01ab",
            "\1\u01ac",
            "\1\u01ad",
            "\1\u01ae",
            "\1\u01af",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u01b1",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "\1\u01b5",
            "\1\u01b6",
            "\1\u01b7",
            "\1\u01b8",
            "\1\u01b9",
            "\1\u01ba",
            "\1\u01bb",
            "\1\u01bc",
            "\1\u01bd",
            "\1\u01be",
            "\1\u01bf",
            "\1\u01c0",
            "\1\u01c1",
            "\1\u01c2",
            "",
            "\1\u01c3",
            "\1\u01c4",
            "\1\u01c5",
            "\1\u01c6",
            "\1\u01c7",
            "\1\u01c8",
            "\1\u01c9",
            "\1\u01ca",
            "\1\u01cb",
            "\1\u01cc",
            "\1\u01cd",
            "\1\u01ce",
            "\1\u01cf",
            "\1\u01d0",
            "\1\u01d1",
            "\1\u01d2",
            "\1\u01d3",
            "\1\u01d4",
            "\1\u01d5",
            "\1\u01d6",
            "\1\u01d7",
            "\1\u01d8",
            "\1\u01d9",
            "\1\u01da",
            "",
            "\1\u01db",
            "\1\u01dc",
            "\1\u01dd",
            "\1\u01de",
            "\1\u01df",
            "\1\u01e0",
            "\1\u01e1",
            "\1\u01e2",
            "\1\u01e3",
            "\1\u01e4",
            "\1\u01e5",
            "\1\u01e6",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u01e8",
            "",
            "\2\36\1\uffff\12\36\7\uffff\1\u01ea\16\36\1\u01e9\12\36\4"+
            "\uffff\1\36\1\uffff\32\36\74\uffff\1\36\10\uffff\27\36\1\uffff"+
            "\37\36\1\uffff\u0286\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff"+
            "\2\36\57\uffff\u0120\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff"+
            "\36\u2100\uffff\u04d0\36\40\uffff\u020e\36",
            "\1\u01ec",
            "\1\u01ed",
            "\1\u01ee",
            "\1\u01ef",
            "\1\u01f0",
            "\1\u01f1",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u01f3",
            "\1\u01f4",
            "\1\u01f5",
            "\1\u01f6",
            "\1\u01f7\1\u01f9\12\uffff\1\u01f8",
            "\1\u01fa",
            "\1\u01fc\12\uffff\1\u01fb",
            "\1\u01fd",
            "\1\u01fe",
            "\1\u01ff",
            "\1\u0200",
            "\1\u0201",
            "\1\u0202",
            "\1\u0203",
            "\1\u0204",
            "\1\u0205",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u0207",
            "\1\u0208",
            "\1\u0209",
            "\1\u020a",
            "\1\u020b",
            "\1\u020c",
            "\1\u020d",
            "\1\u020e",
            "\1\u020f",
            "\1\u0210",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u0212",
            "\1\u0213",
            "\1\u0214",
            "\1\u0215",
            "\1\u0216",
            "\1\u0217",
            "\1\u0218",
            "\1\u0219",
            "\1\u021a",
            "\1\u021b",
            "\1\u021c",
            "\1\u021d",
            "\1\u021e",
            "\1\u021f",
            "\1\u0220",
            "\1\u0221",
            "\1\u0222",
            "\1\u0223",
            "",
            "\1\u0224",
            "\1\u0225",
            "\1\u0226",
            "",
            "\1\u0227",
            "\1\u0228",
            "\1\u0229",
            "\1\u022a",
            "\1\u022b",
            "\1\u022c",
            "",
            "\1\u022d",
            "\1\u022e",
            "\1\u022f",
            "\1\u0230",
            "\1\u0231",
            "\1\u0232",
            "\1\u0233",
            "\1\u0234",
            "\1\u0235",
            "\1\u0236",
            "\1\u0237",
            "\1\u0238",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u023b",
            "\1\u023c",
            "\1\u023d",
            "\1\u023e",
            "\1\u023f",
            "",
            "\1\u0240",
            "\1\u0241",
            "\1\u0242",
            "\1\u0243",
            "\1\u0244",
            "\1\u0245",
            "\1\u0246",
            "\1\u0247",
            "\1\u0248",
            "\1\u0249",
            "",
            "\1\u024a",
            "\1\u024b",
            "\1\u024c",
            "\2\36\1\uffff\12\36\7\uffff\1\u024f\2\36\1\u024d\15\36\1\u024e"+
            "\10\36\4\uffff\1\36\1\uffff\32\36\74\uffff\1\36\10\uffff\27"+
            "\36\1\uffff\37\36\1\uffff\u0286\36\1\uffff\u1c81\36\14\uffff"+
            "\2\36\61\uffff\2\36\57\uffff\u0120\36\u0a70\uffff\u03f0\36\21"+
            "\uffff\ua7ff\36\u2100\uffff\u04d0\36\40\uffff\u020e\36",
            "\1\u0251",
            "\1\u0252",
            "\1\u0253",
            "\1\u0254",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u0256",
            "\1\u0257",
            "\1\u0258",
            "\1\u0259",
            "\1\u025a",
            "\1\u025b",
            "\1\u025c",
            "\1\u025d",
            "\1\u025e",
            "\1\u025f",
            "\1\u0260",
            "\1\u0261",
            "\1\u0262",
            "\1\u0263",
            "\1\u0264",
            "\1\u0265",
            "\1\u0266",
            "\1\u0267",
            "\1\u0268",
            "\1\u0269",
            "\1\u026a",
            "\1\u026b",
            "\1\u026c",
            "\1\u026d",
            "\1\u026e",
            "\1\u026f",
            "\1\u0270",
            "\1\u0271",
            "\1\u0272",
            "\1\u0273",
            "",
            "",
            "\1\u0274",
            "\1\u0275",
            "\1\u0276",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u0278",
            "\1\u0279",
            "\1\u027a",
            "\1\u027b",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u027d",
            "\1\u027e",
            "\1\u027f",
            "\1\u0280",
            "\1\u0281",
            "\1\u0282",
            "\1\u0283",
            "\1\u0284",
            "\1\u0285",
            "\1\u0286",
            "\1\u0287",
            "\1\u0288",
            "",
            "\1\u0289",
            "\1\u028a",
            "\1\u028b",
            "\1\u028c",
            "",
            "\1\u028d",
            "\1\u028e",
            "\1\u028f",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u0291",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u0293",
            "\1\u0294",
            "\1\u0295",
            "\1\u0296",
            "\1\u0297",
            "\1\u0298",
            "\1\u0299",
            "\1\u029a",
            "\1\u029b",
            "\1\u029c",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u029e",
            "\1\u029f",
            "\1\u02a0",
            "\1\u02a1",
            "\1\u02a2",
            "\1\u02a3",
            "\1\u02a4",
            "\1\u02a5",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u02a7",
            "\1\u02a8",
            "\1\u02a9",
            "\1\u02aa",
            "\2\36\1\uffff\12\36\7\uffff\1\u02ae\1\36\1\u02ab\1\u02ac\15"+
            "\36\1\u02ad\10\36\4\uffff\1\36\1\uffff\32\36\74\uffff\1\36\10"+
            "\uffff\27\36\1\uffff\37\36\1\uffff\u0286\36\1\uffff\u1c81\36"+
            "\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120\36\u0a70\uffff\u03f0"+
            "\36\21\uffff\ua7ff\36\u2100\uffff\u04d0\36\40\uffff\u020e\36",
            "\1\u02b0",
            "\1\u02b1",
            "",
            "\1\u02b2",
            "\1\u02b3",
            "\1\u02b4",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "",
            "\1\u02b6",
            "\1\u02b7",
            "\1\u02b8",
            "\1\u02b9",
            "\1\u02ba",
            "\1\u02bb",
            "\1\u02bc",
            "\1\u02bd",
            "\1\u02be",
            "\1\u02bf",
            "\1\u02c0",
            "\1\u02c1",
            "\1\u02c2",
            "\1\u02c3",
            "\1\u02c4",
            "\1\u02c5",
            "\1\u02c6",
            "\1\u02c7",
            "\1\u02c8",
            "",
            "\1\u02c9",
            "",
            "\1\u02ca",
            "\1\u02cb",
            "\1\u02cc",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u02ce",
            "\1\u02cf",
            "\1\u02d0",
            "\1\u02d1",
            "\1\u02d2",
            "\1\u02d3",
            "",
            "\1\u02d4",
            "\1\u02d5",
            "\1\u02d6",
            "\1\u02d7",
            "\2\36\1\uffff\12\36\7\uffff\1\u02d8\31\36\4\uffff\1\36\1\uffff"+
            "\32\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u02da",
            "\1\u02db",
            "\1\u02dc",
            "",
            "\1\u02dd",
            "\1\u02de",
            "\1\u02df",
            "\1\u02e0",
            "\1\u02e1",
            "\1\u02e2",
            "\1\u02e3",
            "\1\u02e4\1\u02e5",
            "",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u02e7",
            "\1\u02e8",
            "\1\u02e9",
            "\1\u02ea",
            "",
            "\1\u02eb",
            "\1\u02ec",
            "\1\u02ed",
            "\1\u02ee",
            "\1\u02ef",
            "\1\u02f0",
            "\1\u02f1",
            "\1\u02f2",
            "\1\u02f3",
            "\1\u02f4",
            "\1\u02f5",
            "\1\u02f6",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u02f8",
            "\1\u02f9",
            "\1\u02fa",
            "\1\u02fb",
            "\1\u02fc",
            "\1\u02fd",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u02ff",
            "\1\u0300",
            "\1\u0301",
            "",
            "\1\u0302",
            "\1\u0303",
            "\1\u0304",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u0306",
            "\1\u0307",
            "\1\u0308",
            "\1\u0309",
            "\1\u030a",
            "\1\u030b",
            "\1\u030c",
            "",
            "\1\u030d",
            "\1\u030e",
            "\1\u030f",
            "\1\u0310",
            "\1\u0311",
            "\1\u0312",
            "\1\u0313",
            "\1\u0314",
            "\1\u0315",
            "\1\u0316",
            "\1\u0317",
            "\1\u0318",
            "",
            "\1\u0319",
            "\1\u031a",
            "\1\u031b",
            "\1\u031c",
            "\1\u031d",
            "\1\u031e",
            "\1\u031f",
            "\1\u0320",
            "\1\u0321",
            "\1\u0322",
            "\2\36\1\uffff\12\36\7\uffff\21\36\1\u0323\10\36\4\uffff\1"+
            "\36\1\uffff\32\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36"+
            "\1\uffff\u0286\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2"+
            "\36\57\uffff\u0120\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36"+
            "\u2100\uffff\u04d0\36\40\uffff\u020e\36",
            "\1\u0325",
            "\1\u0326",
            "\1\u0327",
            "\1\u0328",
            "\1\u0329",
            "",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u032b",
            "\1\u032c",
            "\1\u032d",
            "\1\u032e",
            "\1\u032f",
            "",
            "\1\u0330",
            "\1\u0331",
            "\1\u0332",
            "\1\u0333",
            "\1\u0334",
            "\1\u0335",
            "",
            "\1\u0336",
            "\1\u0337",
            "\1\u0338",
            "\1\u0339",
            "\1\u033a",
            "\1\u033b",
            "\1\u033c",
            "\1\u033d",
            "\1\u033e",
            "\1\u033f",
            "\1\u0340",
            "\1\u0341",
            "\1\u0342",
            "\1\u0343",
            "\1\u0344",
            "\1\u0345",
            "\1\u0346",
            "\1\u0347",
            "\1\u0348",
            "\1\u0349",
            "\1\u034a",
            "\1\u034b",
            "\1\u034c",
            "\1\u034d",
            "\1\u034e",
            "\1\u034f",
            "\1\u0350",
            "\1\u0351",
            "\1\u0352",
            "\1\u0353",
            "",
            "\1\u0354",
            "\1\u0355",
            "\1\u0356",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u0358",
            "",
            "\1\u0359",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u035b",
            "\1\u035c",
            "\1\u035d",
            "\1\u035e",
            "\1\u035f",
            "\1\u0360",
            "\1\u0361",
            "\1\u0362",
            "\1\u0363",
            "\1\u0364",
            "\1\u0365",
            "\1\u0366",
            "\1\u0367",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u0369",
            "\1\u036a",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u036c",
            "\1\u036d",
            "\1\u036e",
            "\1\u036f",
            "\1\u0370",
            "\1\u0371",
            "\1\u0372",
            "\1\u0373",
            "\1\u0374",
            "\1\u0375",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u0377",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u0379",
            "\1\u037a",
            "\1\u037b",
            "\1\u037c",
            "\1\u037d",
            "\1\u037e",
            "\1\u037f",
            "\1\u0380",
            "\1\u0381",
            "\1\u0382",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "",
            "\1\u0385",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u0389",
            "\1\u038a",
            "\1\u038b",
            "\1\u038c",
            "\2\36\1\uffff\12\36\7\uffff\3\36\1\u038d\15\36\1\u038e\10"+
            "\36\4\uffff\1\36\1\uffff\32\36\74\uffff\1\36\10\uffff\27\36"+
            "\1\uffff\37\36\1\uffff\u0286\36\1\uffff\u1c81\36\14\uffff\2"+
            "\36\61\uffff\2\36\57\uffff\u0120\36\u0a70\uffff\u03f0\36\21"+
            "\uffff\ua7ff\36\u2100\uffff\u04d0\36\40\uffff\u020e\36",
            "\1\u0390",
            "\1\u0391",
            "\1\u0392",
            "\1\u0393",
            "\1\u0394",
            "\1\u0395",
            "",
            "\1\u0396",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "",
            "\1\u0398",
            "\1\u0399",
            "\1\u039a",
            "\1\u039b",
            "\1\u039c",
            "\1\u039d",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u039f",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u03a1",
            "",
            "\1\u03a2",
            "",
            "\1\u03a3",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u03a5",
            "\1\u03a6",
            "\1\u03a7",
            "\1\u03a8",
            "\1\u03a9",
            "\1\u03aa",
            "\1\u03ab",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "",
            "",
            "\1\u03ad",
            "",
            "",
            "",
            "\1\u03ae",
            "\1\u03af",
            "\1\u03b0",
            "\1\u03b1",
            "\1\u03b2",
            "\1\u03b3",
            "",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u03b5",
            "\1\u03b6",
            "\1\u03b7",
            "\1\u03b8",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u03ba",
            "",
            "\1\u03bb",
            "\1\u03bc",
            "\1\u03bd",
            "\1\u03be",
            "\1\u03bf",
            "\1\u03c0",
            "",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "",
            "\1\u03c2",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u03c7",
            "\1\u03c8",
            "\1\u03c9",
            "\1\u03ca",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "",
            "\1\u03cc",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u03ce",
            "\1\u03cf",
            "\2\36\1\uffff\12\36\7\uffff\1\u03d0\31\36\4\uffff\1\36\1\uffff"+
            "\32\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u03d2",
            "\1\u03d3",
            "",
            "\1\u03d4",
            "\1\u03d5",
            "\1\u03d6",
            "\1\u03d7",
            "",
            "\1\u03d8",
            "\1\u03d9",
            "\1\u03da",
            "\1\u03db",
            "\1\u03dc",
            "\1\u03dd",
            "\1\u03de",
            "",
            "\1\u03df",
            "",
            "",
            "",
            "",
            "\1\u03e0",
            "\1\u03e1",
            "\1\u03e2",
            "\1\u03e3",
            "",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "",
            "\1\u03e5",
            "\1\u03e6",
            "\1\u03e7",
            "",
            "\1\u03e8",
            "\1\u03e9",
            "\1\u03ea",
            "\1\u03eb",
            "\1\u03ec",
            "\1\u03ed",
            "\1\u03ee",
            "\1\u03ef",
            "\1\u03f0",
            "\1\u03f1",
            "\1\u03f2",
            "\1\u03f3",
            "\1\u03f4",
            "\1\u03f5",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u03f7",
            "\1\u03f8",
            "\1\u03f9",
            "",
            "\1\u03fa",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u03fc",
            "\1\u03fd",
            "\1\u03fe",
            "\1\u03ff",
            "\1\u0400",
            "\1\u0401",
            "\1\u0402",
            "\1\u0403",
            "\1\u0404",
            "\1\u0405",
            "\1\u0406",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u0408",
            "\1\u0409",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u040c",
            "\1\u040d",
            "\1\u040e",
            "",
            "\1\u040f",
            "\1\u0410",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u0412",
            "\1\u0413",
            "\1\u0414",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u0417",
            "\1\u0418",
            "\1\u0419",
            "",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u041b",
            "",
            "",
            "\1\u041c",
            "\1\u041d",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "",
            "\1\u0421",
            "\1\u0422",
            "\1\u0423",
            "",
            "",
            "\1\u0424",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u0428",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "",
            "",
            "",
            "\1\u042a",
            "\1\u042b",
            "\1\u042c",
            "\1\u042d",
            "",
            "",
            "",
            "\1\u042e",
            "",
            "\1\u042f",
            "\1\u0430",
            "\1\u0431",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u0433",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u0435",
            "\1\u0436",
            "",
            "\1\u0437",
            "",
            "\1\u0438",
            "\1\u0439",
            "\1\u043a",
            "\1\u043b",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\1\u043d",
            "\1\u043e",
            "",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "\2\36\1\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32"+
            "\36\74\uffff\1\36\10\uffff\27\36\1\uffff\37\36\1\uffff\u0286"+
            "\36\1\uffff\u1c81\36\14\uffff\2\36\61\uffff\2\36\57\uffff\u0120"+
            "\36\u0a70\uffff\u03f0\36\21\uffff\ua7ff\36\u2100\uffff\u04d0"+
            "\36\40\uffff\u020e\36",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | WHITESPACE | LINEBREAKS | COMMENT | INTEGER | FLOAT | LITERAL | NODE | FULLIRI | ABBRIRI | LANGTAG );";
        }
    }
 

}