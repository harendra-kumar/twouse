// $ANTLR 3.1.1

	package west.twouse.language.sparqlas.resource.sparqlas.mopp;


import org.antlr.runtime.*;

public class SparqlasLexer extends Lexer {
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
    public static final int COMMENT=12;
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
    public static final int WHITESPACE=10;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int VARIABLE=6;
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
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int FLOAT=13;
    public static final int T__61=61;
    public static final int LINEBREAKS=11;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__103=103;
    public static final int T__59=59;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int T__112=112;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int INTEGER=9;
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

    	public java.util.List<org.antlr.runtime.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime.RecognitionException>();
    	public java.util.List<java.lang.Integer> lexerExceptionsPosition = new java.util.ArrayList<java.lang.Integer>();
    	
    	public void reportError(org.antlr.runtime.RecognitionException e) {
    		lexerExceptions.add(e);
    		lexerExceptionsPosition.add(((org.antlr.runtime.ANTLRStringStream) input).index());
    	}


    // delegates
    // delegators

    public SparqlasLexer() {;} 
    public SparqlasLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SparqlasLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:16:7: ( 'IRI' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:16:9: 'IRI'
            {
            match("IRI"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:17:7: ( '(' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:17:9: '('
            {
            match('('); 

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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:18:7: ( ')' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:18:9: ')'
            {
            match(')'); 

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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:19:7: ( 'Import' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:19:9: 'Import'
            {
            match("Import"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:20:7: ( 'Namespace' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:20:9: 'Namespace'
            {
            match("Namespace"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:21:7: ( '=' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:21:9: '='
            {
            match('='); 

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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22:7: ( 'Select' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22:9: 'Select'
            {
            match("Select"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:23:7: ( '*' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:23:9: '*'
            {
            match('*'); 

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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:24:7: ( 'Where' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:24:9: 'Where'
            {
            match("Where"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:25:7: ( 'Construct' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:25:9: 'Construct'
            {
            match("Construct"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:26:7: ( 'Ask' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:26:9: 'Ask'
            {
            match("Ask"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:27:7: ( 'Describe' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:27:9: 'Describe'
            {
            match("Describe"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:28:7: ( '^^' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:28:9: '^^'
            {
            match("^^"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:29:7: ( 'ClassAssertion' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:29:9: 'ClassAssertion'
            {
            match("ClassAssertion"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:30:7: ( 'Type' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:30:9: 'Type'
            {
            match("Type"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:31:7: ( 'ObjectPropertyAssertion' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:31:9: 'ObjectPropertyAssertion'
            {
            match("ObjectPropertyAssertion"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:32:7: ( 'PropertyValue' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:32:9: 'PropertyValue'
            {
            match("PropertyValue"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:33:7: ( 'DataPropertyAssertion' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:33:9: 'DataPropertyAssertion'
            {
            match("DataPropertyAssertion"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:34:7: ( 'NegativeObjectPropertyAssertion' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:34:9: 'NegativeObjectPropertyAssertion'
            {
            match("NegativeObjectPropertyAssertion"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:35:7: ( 'NegativePropertyValue' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:35:9: 'NegativePropertyValue'
            {
            match("NegativePropertyValue"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:36:7: ( 'NegativeDataPropertyAssertion' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:36:9: 'NegativeDataPropertyAssertion'
            {
            match("NegativeDataPropertyAssertion"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:37:7: ( 'SameIndividual' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:37:9: 'SameIndividual'
            {
            match("SameIndividual"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:38:7: ( 'SameAs' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:38:9: 'SameAs'
            {
            match("SameAs"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:39:7: ( 'DifferentIndividuals' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:39:9: 'DifferentIndividuals'
            {
            match("DifferentIndividuals"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:40:7: ( 'DifferentFrom' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:40:9: 'DifferentFrom'
            {
            match("DifferentFrom"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:41:7: ( 'SubClassOf' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:41:9: 'SubClassOf'
            {
            match("SubClassOf"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:42:7: ( 'EquivalentClasses' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:42:9: 'EquivalentClasses'
            {
            match("EquivalentClasses"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:43:7: ( 'EquivalentTo' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:43:9: 'EquivalentTo'
            {
            match("EquivalentTo"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:44:7: ( 'DisjointClasses' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:44:9: 'DisjointClasses'
            {
            match("DisjointClasses"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:45:7: ( 'DisjointWith' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:45:9: 'DisjointWith'
            {
            match("DisjointWith"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:46:7: ( 'DisjointUnion' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:46:9: 'DisjointUnion'
            {
            match("DisjointUnion"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:47:7: ( 'ObjectUnionOf' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:47:9: 'ObjectUnionOf'
            {
            match("ObjectUnionOf"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:48:7: ( 'Or' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:48:9: 'Or'
            {
            match("Or"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:49:7: ( 'ObjectComplementOf' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:49:9: 'ObjectComplementOf'
            {
            match("ObjectComplementOf"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:50:7: ( 'Not' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:50:9: 'Not'
            {
            match("Not"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:51:7: ( 'ObjectOneOf' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:51:9: 'ObjectOneOf'
            {
            match("ObjectOneOf"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:52:7: ( 'One' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:52:9: 'One'
            {
            match("One"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:53:7: ( 'ObjectIntersectionOf' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:53:9: 'ObjectIntersectionOf'
            {
            match("ObjectIntersectionOf"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:54:7: ( 'And' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:54:9: 'And'
            {
            match("And"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:55:7: ( 'ObjectAllValuesFrom' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:55:9: 'ObjectAllValuesFrom'
            {
            match("ObjectAllValuesFrom"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:56:7: ( 'All' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:56:9: 'All'
            {
            match("All"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:57:7: ( 'ObjectSomeValuesFrom' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:57:9: 'ObjectSomeValuesFrom'
            {
            match("ObjectSomeValuesFrom"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:58:7: ( 'Some' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:58:9: 'Some'
            {
            match("Some"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:59:7: ( 'ObjectHasValue' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:59:9: 'ObjectHasValue'
            {
            match("ObjectHasValue"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:60:7: ( 'Has' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:60:9: 'Has'
            {
            match("Has"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:61:7: ( 'ObjectMinCardinality' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:61:9: 'ObjectMinCardinality'
            {
            match("ObjectMinCardinality"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:62:7: ( 'Min' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:62:9: 'Min'
            {
            match("Min"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:63:7: ( 'ObjectMaxCardinality' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:63:9: 'ObjectMaxCardinality'
            {
            match("ObjectMaxCardinality"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:64:7: ( 'Max' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:64:9: 'Max'
            {
            match("Max"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:65:7: ( 'ObjectExactCardinality' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:65:9: 'ObjectExactCardinality'
            {
            match("ObjectExactCardinality"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:66:7: ( 'Exact' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:66:9: 'Exact'
            {
            match("Exact"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:67:7: ( 'DataAllValuesFrom' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:67:9: 'DataAllValuesFrom'
            {
            match("DataAllValuesFrom"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:68:7: ( 'DataSomeValuesFrom' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:68:9: 'DataSomeValuesFrom'
            {
            match("DataSomeValuesFrom"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:69:7: ( 'DataHasValue' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:69:9: 'DataHasValue'
            {
            match("DataHasValue"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:70:7: ( 'DataMinCardinality' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:70:9: 'DataMinCardinality'
            {
            match("DataMinCardinality"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:71:7: ( 'DataMaxCardinality' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:71:9: 'DataMaxCardinality'
            {
            match("DataMaxCardinality"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:72:7: ( 'DataExactCardinality' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:72:9: 'DataExactCardinality'
            {
            match("DataExactCardinality"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:73:7: ( 'DataUnionOf' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:73:9: 'DataUnionOf'
            {
            match("DataUnionOf"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:74:7: ( 'DataComplementOf' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:74:9: 'DataComplementOf'
            {
            match("DataComplementOf"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:75:7: ( 'DataOneOf' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:75:9: 'DataOneOf'
            {
            match("DataOneOf"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:76:7: ( 'DataIntersectionOf' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:76:9: 'DataIntersectionOf'
            {
            match("DataIntersectionOf"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:77:7: ( 'DatatypeRestriction' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:77:9: 'DatatypeRestriction'
            {
            match("DatatypeRestriction"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:78:7: ( 'SubObjectPropertyOf' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:78:9: 'SubObjectPropertyOf'
            {
            match("SubObjectPropertyOf"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:79:7: ( 'SubPropertyOf' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:79:9: 'SubPropertyOf'
            {
            match("SubPropertyOf"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:80:7: ( 'EquivalentObjectProperties' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:80:9: 'EquivalentObjectProperties'
            {
            match("EquivalentObjectProperties"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:81:7: ( 'EquivalentProperty' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:81:9: 'EquivalentProperty'
            {
            match("EquivalentProperty"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:82:7: ( 'DisjointObjectProperties' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:82:9: 'DisjointObjectProperties'
            {
            match("DisjointObjectProperties"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:83:7: ( 'DisjointProperty' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:83:9: 'DisjointProperty'
            {
            match("DisjointProperty"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:84:7: ( 'ObjectPropertyDomain' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:84:9: 'ObjectPropertyDomain'
            {
            match("ObjectPropertyDomain"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:85:7: ( 'Domain' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:85:9: 'Domain'
            {
            match("Domain"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:86:7: ( 'ObjectPropertyRange' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:86:9: 'ObjectPropertyRange'
            {
            match("ObjectPropertyRange"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:87:7: ( 'Range' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:87:9: 'Range'
            {
            match("Range"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:88:7: ( 'InverseObjectProperties' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:88:9: 'InverseObjectProperties'
            {
            match("InverseObjectProperties"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:89:7: ( 'InverseOf' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:89:9: 'InverseOf'
            {
            match("InverseOf"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:90:7: ( 'FunctionalObjectProperty' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:90:9: 'FunctionalObjectProperty'
            {
            match("FunctionalObjectProperty"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:91:7: ( 'InverseFunctionalObjectProperty' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:91:9: 'InverseFunctionalObjectProperty'
            {
            match("InverseFunctionalObjectProperty"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:92:7: ( 'InverseFunctional' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:92:9: 'InverseFunctional'
            {
            match("InverseFunctional"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:93:7: ( 'ReflexiveObjectProperty' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:93:9: 'ReflexiveObjectProperty'
            {
            match("ReflexiveObjectProperty"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:94:7: ( 'Reflexive' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:94:9: 'Reflexive'
            {
            match("Reflexive"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:95:7: ( 'IrreflexiveObjectProperty' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:95:9: 'IrreflexiveObjectProperty'
            {
            match("IrreflexiveObjectProperty"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:96:7: ( 'Irreflexive' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:96:9: 'Irreflexive'
            {
            match("Irreflexive"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:97:7: ( 'SymmetricObjectProperty' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:97:9: 'SymmetricObjectProperty'
            {
            match("SymmetricObjectProperty"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:98:7: ( 'Symmetric' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:98:9: 'Symmetric'
            {
            match("Symmetric"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:99:7: ( 'AsymmetricObjectProperty' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:99:9: 'AsymmetricObjectProperty'
            {
            match("AsymmetricObjectProperty"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:100:7: ( 'Asymmetric' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:100:9: 'Asymmetric'
            {
            match("Asymmetric"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:101:7: ( 'TransitiveObjectProperty' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:101:9: 'TransitiveObjectProperty'
            {
            match("TransitiveObjectProperty"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:102:8: ( 'Transitive' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:102:10: 'Transitive'
            {
            match("Transitive"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:103:8: ( 'SubDataPropertyOf' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:103:10: 'SubDataPropertyOf'
            {
            match("SubDataPropertyOf"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:104:8: ( 'EquivalentDataProperties' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:104:10: 'EquivalentDataProperties'
            {
            match("EquivalentDataProperties"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:105:8: ( 'DisjointDataProperties' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:105:10: 'DisjointDataProperties'
            {
            match("DisjointDataProperties"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:106:8: ( 'DataPropertyDomain' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:106:10: 'DataPropertyDomain'
            {
            match("DataPropertyDomain"); 


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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:107:8: ( 'DataPropertyRange' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:107:10: 'DataPropertyRange'
            {
            match("DataPropertyRange"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:108:8: ( 'FunctionalDataProperty' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:108:10: 'FunctionalDataProperty'
            {
            match("FunctionalDataProperty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:109:8: ( 'ObjectInverseOf' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:109:10: 'ObjectInverseOf'
            {
            match("ObjectInverseOf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:110:8: ( 'ObjectPropertyChain' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:110:10: 'ObjectPropertyChain'
            {
            match("ObjectPropertyChain"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:111:8: ( 'Chain' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:111:10: 'Chain'
            {
            match("Chain"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:112:8: ( 'HasKey' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:112:10: 'HasKey'
            {
            match("HasKey"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:113:8: ( 'Class' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:113:10: 'Class'
            {
            match("Class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:114:8: ( 'ObjectProperty' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:114:10: 'ObjectProperty'
            {
            match("ObjectProperty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:115:8: ( 'DataProperty' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:115:10: 'DataProperty'
            {
            match("DataProperty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:116:8: ( 'NamedIndividual' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:116:10: 'NamedIndividual'
            {
            match("NamedIndividual"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:117:8: ( 'Parameter' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:117:10: 'Parameter'
            {
            match("Parameter"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:118:8: ( 'Bind' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:118:10: 'Bind'
            {
            match("Bind"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:119:8: ( 'DirectType' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:119:10: 'DirectType'
            {
            match("DirectType"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:120:8: ( 'DirectSubClassOf' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:120:10: 'DirectSubClassOf'
            {
            match("DirectSubClassOf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:121:8: ( 'StrictSubClassOf' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:121:10: 'StrictSubClassOf'
            {
            match("StrictSubClassOf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22121:11: ( ( ' ' | '\\t' | '\\f' ) )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22122:2: ( ' ' | '\\t' | '\\f' )
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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22125:11: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22126:2: ( '\\r\\n' | '\\r' | '\\n' )
            {
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22126:2: ( '\\r\\n' | '\\r' | '\\n' )
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
                    // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22126:3: '\\r\\n'
                    {
                    match("\r\n"); 


                    }
                    break;
                case 2 :
                    // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22126:10: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22126:15: '\\n'
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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22129:8: ( '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22130:2: '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            {
            match("//"); 

            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22130:6: (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='\uFFFE')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22130:7: ~ ( '\\n' | '\\r' | '\\uffff' )
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

             _channel = 99; 

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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22133:8: ( ( '-' )? ( '1' .. '9' ) ( '0' .. '9' )* | '0' )
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
                    // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22134:2: ( '-' )? ( '1' .. '9' ) ( '0' .. '9' )*
                    {
                    // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22134:2: ( '-' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='-') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22134:3: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22134:8: ( '1' .. '9' )
                    // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22134:9: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }

                    // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22134:18: ( '0' .. '9' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22134:19: '0' .. '9'
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
                    // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22134:30: '0'
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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22135:6: ( ( '-' )? ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) '.' ( '0' .. '9' )+ )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22136:2: ( '-' )? ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' ) '.' ( '0' .. '9' )+
            {
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22136:2: ( '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='-') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22136:3: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22136:8: ( ( '1' .. '9' ) ( '0' .. '9' )* | '0' )
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
                    // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22136:9: ( '1' .. '9' ) ( '0' .. '9' )*
                    {
                    // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22136:9: ( '1' .. '9' )
                    // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22136:10: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }

                    // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22136:20: ( '0' .. '9' )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22136:21: '0' .. '9'
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
                    // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22136:34: '0'
                    {
                    match('0'); 

                    }
                    break;

            }

            match('.'); 
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22136:43: ( '0' .. '9' )+
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
            	    // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22136:44: '0' .. '9'
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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22138:8: ( '\"' (~ ( '\\u0022' | '\\u005C' ) | ( '\\\\' ( 't' | 'b' | 'n' | 'r' | 'f' | '\\\\' | '\\\"' | '\\'' ) ) )* '\"' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22139:3: '\"' (~ ( '\\u0022' | '\\u005C' ) | ( '\\\\' ( 't' | 'b' | 'n' | 'r' | 'f' | '\\\\' | '\\\"' | '\\'' ) ) )* '\"'
            {
            match('\"'); 
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22139:7: (~ ( '\\u0022' | '\\u005C' ) | ( '\\\\' ( 't' | 'b' | 'n' | 'r' | 'f' | '\\\\' | '\\\"' | '\\'' ) ) )*
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
            	    // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22139:9: ~ ( '\\u0022' | '\\u005C' )
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
            	    // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22139:36: ( '\\\\' ( 't' | 'b' | 'n' | 'r' | 'f' | '\\\\' | '\\\"' | '\\'' ) )
            	    {
            	    // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22139:36: ( '\\\\' ( 't' | 'b' | 'n' | 'r' | 'f' | '\\\\' | '\\\"' | '\\'' ) )
            	    // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22139:37: '\\\\' ( 't' | 'b' | 'n' | 'r' | 'f' | '\\\\' | '\\\"' | '\\'' )
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

    // $ANTLR start "VARIABLE"
    public final void mVARIABLE() throws RecognitionException {
        try {
            int _type = VARIABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22140:9: ( ( ( '?' ) | ( '\\u0024' ) ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+ )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22141:3: ( ( '?' ) | ( '\\u0024' ) ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            {
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22141:3: ( ( '?' ) | ( '\\u0024' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='?') ) {
                alt11=1;
            }
            else if ( (LA11_0=='$') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22141:4: ( '?' )
                    {
                    // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22141:4: ( '?' )
                    // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22141:5: '?'
                    {
                    match('?'); 

                    }


                    }
                    break;
                case 2 :
                    // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22141:12: ( '\\u0024' )
                    {
                    // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22141:12: ( '\\u0024' )
                    // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22141:13: '\\u0024'
                    {
                    match('$'); 

                    }


                    }
                    break;

            }

            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22141:24: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '-' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='-'||(LA12_0>='0' && LA12_0<='9')||(LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VARIABLE"

    // $ANTLR start "NODE"
    public final void mNODE() throws RecognitionException {
        try {
            int _type = NODE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22142:5: ( '_:' ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '0' .. '9' ) ( ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' | '.' )* ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '.' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' ) )? )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22143:3: '_:' ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '0' .. '9' ) ( ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' | '.' )* ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '.' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' ) )?
            {
            match("_:"); 

            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u02FF')||(input.LA(1)>='\u0370' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFDCF')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFFFD') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22143:278: ( ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' | '.' )* ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '.' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='.'||(LA14_0>='0' && LA14_0<='9')||(LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='z')||LA14_0=='\u00B7'||(LA14_0>='\u00C0' && LA14_0<='\u00D6')||(LA14_0>='\u00D8' && LA14_0<='\u00F6')||(LA14_0>='\u00F8' && LA14_0<='\u037D')||(LA14_0>='\u037F' && LA14_0<='\u1FFF')||(LA14_0>='\u200C' && LA14_0<='\u200D')||(LA14_0>='\u203F' && LA14_0<='\u2040')||(LA14_0>='\u2070' && LA14_0<='\u218F')||(LA14_0>='\u2C00' && LA14_0<='\u2FEF')||(LA14_0>='\u3001' && LA14_0<='\uD7FF')||(LA14_0>='\uF900' && LA14_0<='\uFDCF')||(LA14_0>='\uFDF0' && LA14_0<='\uFFFD')) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22143:279: ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' | '.' )* ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '.' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' )
                    {
                    // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22143:279: ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' | '.' )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='.'||(LA13_0>='0' && LA13_0<='9')||(LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='z')||LA13_0=='\u00B7'||(LA13_0>='\u00C0' && LA13_0<='\u00D6')||(LA13_0>='\u00D8' && LA13_0<='\u00F6')||(LA13_0>='\u00F8' && LA13_0<='\u037D')||(LA13_0>='\u037F' && LA13_0<='\u1FFF')||(LA13_0>='\u200C' && LA13_0<='\u200D')||(LA13_0>='\u203F' && LA13_0<='\u2040')||(LA13_0>='\u2070' && LA13_0<='\u218F')||(LA13_0>='\u2C00' && LA13_0<='\u2FEF')||(LA13_0>='\u3001' && LA13_0<='\uD7FF')||(LA13_0>='\uF900' && LA13_0<='\uFDCF')||(LA13_0>='\uFDF0' && LA13_0<='\uFFFD')) ) {
                            int LA13_1 = input.LA(2);

                            if ( (LA13_1=='.'||(LA13_1>='0' && LA13_1<='9')||(LA13_1>='A' && LA13_1<='Z')||LA13_1=='_'||(LA13_1>='a' && LA13_1<='z')||LA13_1=='\u00B7'||(LA13_1>='\u00C0' && LA13_1<='\u00D6')||(LA13_1>='\u00D8' && LA13_1<='\u00F6')||(LA13_1>='\u00F8' && LA13_1<='\u037D')||(LA13_1>='\u037F' && LA13_1<='\u1FFF')||(LA13_1>='\u200C' && LA13_1<='\u200D')||(LA13_1>='\u203F' && LA13_1<='\u2040')||(LA13_1>='\u2070' && LA13_1<='\u218F')||(LA13_1>='\u2C00' && LA13_1<='\u2FEF')||(LA13_1>='\u3001' && LA13_1<='\uD7FF')||(LA13_1>='\uF900' && LA13_1<='\uFDCF')||(LA13_1>='\uFDF0' && LA13_1<='\uFFFD')) ) {
                                alt13=1;
                            }


                        }


                        switch (alt13) {
                    	case 1 :
                    	    // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:
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
                    	    break loop13;
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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22144:8: ( '<' (~ ( '^' | '<' | '>' | '\"' | '{' | '}' | '`' | '\\\\' | '\\u0000' .. '\\u0020' ) )* '>' )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22145:3: '<' (~ ( '^' | '<' | '>' | '\"' | '{' | '}' | '`' | '\\\\' | '\\u0000' .. '\\u0020' ) )* '>'
            {
            match('<'); 
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22145:7: (~ ( '^' | '<' | '>' | '\"' | '{' | '}' | '`' | '\\\\' | '\\u0000' .. '\\u0020' ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='!'||(LA15_0>='#' && LA15_0<=';')||LA15_0=='='||(LA15_0>='?' && LA15_0<='[')||LA15_0==']'||LA15_0=='_'||(LA15_0>='a' && LA15_0<='z')||LA15_0=='|'||(LA15_0>='~' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22145:8: ~ ( '^' | '<' | '>' | '\"' | '{' | '}' | '`' | '\\\\' | '\\u0000' .. '\\u0020' )
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
            	    break loop15;
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
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22146:8: ( ( ( ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '-' | '0' .. '9' ) ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '-' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' | '.' )* ) | ( ( ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' ) ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '-' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' | '.' )* ) ':' ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '-' | '0' .. '9' ) ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '-' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' | '.' )* ) ) )
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22147:3: ( ( ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '-' | '0' .. '9' ) ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '-' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' | '.' )* ) | ( ( ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' ) ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '-' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' | '.' )* ) ':' ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '-' | '0' .. '9' ) ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '-' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' | '.' )* ) )
            {
            // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22147:3: ( ( ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '-' | '0' .. '9' ) ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '-' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' | '.' )* ) | ( ( ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' ) ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '-' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' | '.' )* ) ':' ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '-' | '0' .. '9' ) ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '-' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' | '.' )* ) )
            int alt19=2;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22147:4: ( ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '-' | '0' .. '9' ) ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '-' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' | '.' )* )
                    {
                    // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22147:4: ( ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '-' | '0' .. '9' ) ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '-' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' | '.' )* )
                    // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22147:5: ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '-' | '0' .. '9' ) ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '-' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' | '.' )*
                    {
                    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u02FF')||(input.LA(1)>='\u0370' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFDCF')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFFFD') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22147:282: ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '-' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' | '.' )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0>='-' && LA16_0<='.')||(LA16_0>='0' && LA16_0<='9')||(LA16_0>='A' && LA16_0<='Z')||LA16_0=='_'||(LA16_0>='a' && LA16_0<='z')||LA16_0=='\u00B7'||(LA16_0>='\u00C0' && LA16_0<='\u00D6')||(LA16_0>='\u00D8' && LA16_0<='\u00F6')||(LA16_0>='\u00F8' && LA16_0<='\u037D')||(LA16_0>='\u037F' && LA16_0<='\u1FFF')||(LA16_0>='\u200C' && LA16_0<='\u200D')||(LA16_0>='\u203F' && LA16_0<='\u2040')||(LA16_0>='\u2070' && LA16_0<='\u218F')||(LA16_0>='\u2C00' && LA16_0<='\u2FEF')||(LA16_0>='\u3001' && LA16_0<='\uD7FF')||(LA16_0>='\uF900' && LA16_0<='\uFDCF')||(LA16_0>='\uFDF0' && LA16_0<='\uFFFD')) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:
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
                    	    break loop16;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22148:2: ( ( ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' ) ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '-' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' | '.' )* ) ':' ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '-' | '0' .. '9' ) ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '-' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' | '.' )* )
                    {
                    // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22148:2: ( ( ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' ) ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '-' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' | '.' )* ) ':' ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '-' | '0' .. '9' ) ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '-' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' | '.' )* )
                    // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22148:3: ( ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' ) ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '-' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' | '.' )* ) ':' ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '-' | '0' .. '9' ) ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '-' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' | '.' )*
                    {
                    // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22148:3: ( ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' ) ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '-' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' | '.' )* )
                    // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22148:4: ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' ) ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '-' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' | '.' )*
                    {
                    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u02FF')||(input.LA(1)>='\u0370' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFDCF')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFFFD') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22148:257: ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '-' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' | '.' )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( ((LA17_0>='-' && LA17_0<='.')||(LA17_0>='0' && LA17_0<='9')||(LA17_0>='A' && LA17_0<='Z')||LA17_0=='_'||(LA17_0>='a' && LA17_0<='z')||LA17_0=='\u00B7'||(LA17_0>='\u00C0' && LA17_0<='\u00D6')||(LA17_0>='\u00D8' && LA17_0<='\u00F6')||(LA17_0>='\u00F8' && LA17_0<='\u037D')||(LA17_0>='\u037F' && LA17_0<='\u1FFF')||(LA17_0>='\u200C' && LA17_0<='\u200D')||(LA17_0>='\u203F' && LA17_0<='\u2040')||(LA17_0>='\u2070' && LA17_0<='\u218F')||(LA17_0>='\u2C00' && LA17_0<='\u2FEF')||(LA17_0>='\u3001' && LA17_0<='\uD7FF')||(LA17_0>='\uF900' && LA17_0<='\uFDCF')||(LA17_0>='\uFDF0' && LA17_0<='\uFFFD')) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:
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
                    	    break loop17;
                        }
                    } while (true);


                    }

                    match(':'); 
                    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u02FF')||(input.LA(1)>='\u0370' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFDCF')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFFFD') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:22149:279: ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '-' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' | '.' )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( ((LA18_0>='-' && LA18_0<='.')||(LA18_0>='0' && LA18_0<='9')||(LA18_0>='A' && LA18_0<='Z')||LA18_0=='_'||(LA18_0>='a' && LA18_0<='z')||LA18_0=='\u00B7'||(LA18_0>='\u00C0' && LA18_0<='\u00D6')||(LA18_0>='\u00D8' && LA18_0<='\u00F6')||(LA18_0>='\u00F8' && LA18_0<='\u037D')||(LA18_0>='\u037F' && LA18_0<='\u1FFF')||(LA18_0>='\u200C' && LA18_0<='\u200D')||(LA18_0>='\u203F' && LA18_0<='\u2040')||(LA18_0>='\u2070' && LA18_0<='\u218F')||(LA18_0>='\u2C00' && LA18_0<='\u2FEF')||(LA18_0>='\u3001' && LA18_0<='\uD7FF')||(LA18_0>='\uF900' && LA18_0<='\uFDCF')||(LA18_0>='\uFDF0' && LA18_0<='\uFFFD')) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:
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
                    	    break loop18;
                        }
                    } while (true);


                    }


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
    // $ANTLR end "ABBRIRI"

    public void mTokens() throws RecognitionException {
        // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | WHITESPACE | LINEBREAKS | COMMENT | INTEGER | FLOAT | LITERAL | VARIABLE | NODE | FULLIRI | ABBRIRI )
        int alt20=116;
        alt20 = dfa20.predict(input);
        switch (alt20) {
            case 1 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:190: T__44
                {
                mT__44(); 

                }
                break;
            case 32 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:196: T__45
                {
                mT__45(); 

                }
                break;
            case 33 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:202: T__46
                {
                mT__46(); 

                }
                break;
            case 34 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:208: T__47
                {
                mT__47(); 

                }
                break;
            case 35 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:214: T__48
                {
                mT__48(); 

                }
                break;
            case 36 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:220: T__49
                {
                mT__49(); 

                }
                break;
            case 37 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:226: T__50
                {
                mT__50(); 

                }
                break;
            case 38 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:232: T__51
                {
                mT__51(); 

                }
                break;
            case 39 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:238: T__52
                {
                mT__52(); 

                }
                break;
            case 40 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:244: T__53
                {
                mT__53(); 

                }
                break;
            case 41 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:250: T__54
                {
                mT__54(); 

                }
                break;
            case 42 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:256: T__55
                {
                mT__55(); 

                }
                break;
            case 43 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:262: T__56
                {
                mT__56(); 

                }
                break;
            case 44 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:268: T__57
                {
                mT__57(); 

                }
                break;
            case 45 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:274: T__58
                {
                mT__58(); 

                }
                break;
            case 46 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:280: T__59
                {
                mT__59(); 

                }
                break;
            case 47 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:286: T__60
                {
                mT__60(); 

                }
                break;
            case 48 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:292: T__61
                {
                mT__61(); 

                }
                break;
            case 49 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:298: T__62
                {
                mT__62(); 

                }
                break;
            case 50 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:304: T__63
                {
                mT__63(); 

                }
                break;
            case 51 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:310: T__64
                {
                mT__64(); 

                }
                break;
            case 52 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:316: T__65
                {
                mT__65(); 

                }
                break;
            case 53 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:322: T__66
                {
                mT__66(); 

                }
                break;
            case 54 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:328: T__67
                {
                mT__67(); 

                }
                break;
            case 55 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:334: T__68
                {
                mT__68(); 

                }
                break;
            case 56 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:340: T__69
                {
                mT__69(); 

                }
                break;
            case 57 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:346: T__70
                {
                mT__70(); 

                }
                break;
            case 58 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:352: T__71
                {
                mT__71(); 

                }
                break;
            case 59 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:358: T__72
                {
                mT__72(); 

                }
                break;
            case 60 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:364: T__73
                {
                mT__73(); 

                }
                break;
            case 61 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:370: T__74
                {
                mT__74(); 

                }
                break;
            case 62 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:376: T__75
                {
                mT__75(); 

                }
                break;
            case 63 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:382: T__76
                {
                mT__76(); 

                }
                break;
            case 64 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:388: T__77
                {
                mT__77(); 

                }
                break;
            case 65 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:394: T__78
                {
                mT__78(); 

                }
                break;
            case 66 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:400: T__79
                {
                mT__79(); 

                }
                break;
            case 67 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:406: T__80
                {
                mT__80(); 

                }
                break;
            case 68 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:412: T__81
                {
                mT__81(); 

                }
                break;
            case 69 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:418: T__82
                {
                mT__82(); 

                }
                break;
            case 70 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:424: T__83
                {
                mT__83(); 

                }
                break;
            case 71 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:430: T__84
                {
                mT__84(); 

                }
                break;
            case 72 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:436: T__85
                {
                mT__85(); 

                }
                break;
            case 73 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:442: T__86
                {
                mT__86(); 

                }
                break;
            case 74 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:448: T__87
                {
                mT__87(); 

                }
                break;
            case 75 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:454: T__88
                {
                mT__88(); 

                }
                break;
            case 76 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:460: T__89
                {
                mT__89(); 

                }
                break;
            case 77 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:466: T__90
                {
                mT__90(); 

                }
                break;
            case 78 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:472: T__91
                {
                mT__91(); 

                }
                break;
            case 79 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:478: T__92
                {
                mT__92(); 

                }
                break;
            case 80 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:484: T__93
                {
                mT__93(); 

                }
                break;
            case 81 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:490: T__94
                {
                mT__94(); 

                }
                break;
            case 82 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:496: T__95
                {
                mT__95(); 

                }
                break;
            case 83 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:502: T__96
                {
                mT__96(); 

                }
                break;
            case 84 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:508: T__97
                {
                mT__97(); 

                }
                break;
            case 85 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:514: T__98
                {
                mT__98(); 

                }
                break;
            case 86 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:520: T__99
                {
                mT__99(); 

                }
                break;
            case 87 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:526: T__100
                {
                mT__100(); 

                }
                break;
            case 88 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:533: T__101
                {
                mT__101(); 

                }
                break;
            case 89 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:540: T__102
                {
                mT__102(); 

                }
                break;
            case 90 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:547: T__103
                {
                mT__103(); 

                }
                break;
            case 91 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:554: T__104
                {
                mT__104(); 

                }
                break;
            case 92 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:561: T__105
                {
                mT__105(); 

                }
                break;
            case 93 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:568: T__106
                {
                mT__106(); 

                }
                break;
            case 94 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:575: T__107
                {
                mT__107(); 

                }
                break;
            case 95 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:582: T__108
                {
                mT__108(); 

                }
                break;
            case 96 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:589: T__109
                {
                mT__109(); 

                }
                break;
            case 97 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:596: T__110
                {
                mT__110(); 

                }
                break;
            case 98 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:603: T__111
                {
                mT__111(); 

                }
                break;
            case 99 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:610: T__112
                {
                mT__112(); 

                }
                break;
            case 100 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:617: T__113
                {
                mT__113(); 

                }
                break;
            case 101 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:624: T__114
                {
                mT__114(); 

                }
                break;
            case 102 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:631: T__115
                {
                mT__115(); 

                }
                break;
            case 103 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:638: T__116
                {
                mT__116(); 

                }
                break;
            case 104 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:645: T__117
                {
                mT__117(); 

                }
                break;
            case 105 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:652: T__118
                {
                mT__118(); 

                }
                break;
            case 106 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:659: T__119
                {
                mT__119(); 

                }
                break;
            case 107 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:666: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;
            case 108 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:677: LINEBREAKS
                {
                mLINEBREAKS(); 

                }
                break;
            case 109 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:688: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 110 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:696: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 111 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:704: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 112 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:710: LITERAL
                {
                mLITERAL(); 

                }
                break;
            case 113 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:718: VARIABLE
                {
                mVARIABLE(); 

                }
                break;
            case 114 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:727: NODE
                {
                mNODE(); 

                }
                break;
            case 115 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:732: FULLIRI
                {
                mFULLIRI(); 

                }
                break;
            case 116 :
                // D:\\Uni\\HiWi\\MOST\\SVN\\source\\plugins\\west.twouse.language.sparqlas.resource.sparqlas\\src-gen\\west\\twouse\\language\\sparqlas\\resource\\sparqlas\\mopp\\Sparqlas.g:1:740: ABBRIRI
                {
                mABBRIRI(); 

                }
                break;

        }

    }


    protected DFA19 dfa19 = new DFA19(this);
    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA19_eotS =
        "\1\uffff\1\2\1\uffff\1\2\1\uffff";
    static final String DFA19_eofS =
        "\5\uffff";
    static final String DFA19_minS =
        "\2\55\1\uffff\1\55\1\uffff";
    static final String DFA19_maxS =
        "\2\ufffd\1\uffff\1\ufffd\1\uffff";
    static final String DFA19_acceptS =
        "\2\uffff\1\1\1\uffff\1\2";
    static final String DFA19_specialS =
        "\5\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\2\2\uffff\12\2\7\uffff\32\1\4\uffff\1\2\1\uffff\32\1\105"+
            "\uffff\27\1\1\uffff\37\1\1\uffff\u0208\1\160\uffff\16\1\1\uffff"+
            "\u1c81\1\14\uffff\2\1\142\uffff\u0120\1\u0a70\uffff\u03f0\1"+
            "\21\uffff\ua7ff\1\u2100\uffff\u04d0\1\40\uffff\u020e\1",
            "\2\3\1\uffff\12\3\1\4\6\uffff\32\3\4\uffff\1\3\1\uffff\32"+
            "\3\74\uffff\1\3\10\uffff\27\3\1\uffff\37\3\1\uffff\u0286\3\1"+
            "\uffff\u1c81\3\14\uffff\2\3\61\uffff\2\3\57\uffff\u0120\3\u0a70"+
            "\uffff\u03f0\3\21\uffff\ua7ff\3\u2100\uffff\u04d0\3\40\uffff"+
            "\u020e\3",
            "",
            "\2\3\1\uffff\12\3\1\4\6\uffff\32\3\4\uffff\1\3\1\uffff\32"+
            "\3\74\uffff\1\3\10\uffff\27\3\1\uffff\37\3\1\uffff\u0286\3\1"+
            "\uffff\u1c81\3\14\uffff\2\3\61\uffff\2\3\57\uffff\u0120\3\u0a70"+
            "\uffff\u03f0\3\21\uffff\ua7ff\3\u2100\uffff\u04d0\3\40\uffff"+
            "\u020e\3",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "22147:3: ( ( ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '-' | '0' .. '9' ) ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '-' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' | '.' )* ) | ( ( ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' ) ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '-' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' | '.' )* ) ':' ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '-' | '0' .. '9' ) ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | '_' | '-' | '0' .. '9' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' | '.' )* ) )";
        }
    }
    static final String DFA20_eotS =
        "\1\uffff\1\40\2\uffff\1\40\1\uffff\1\40\1\uffff\4\40\1\uffff\11"+
        "\40\3\uffff\1\40\2\114\2\uffff\1\40\2\uffff\33\40\1\155\14\40\1"+
        "\114\1\40\1\114\1\uffff\1\40\1\uffff\1\173\5\40\1\u0081\12\40\1"+
        "\u008f\1\40\1\u0091\1\u0092\11\40\1\uffff\1\u009c\4\40\1\u00a2\1"+
        "\u00a3\1\u00a4\4\40\1\u00a9\1\uffff\5\40\1\uffff\6\40\1\u00b7\6"+
        "\40\1\uffff\1\40\2\uffff\6\40\1\u00cf\2\40\1\uffff\5\40\3\uffff"+
        "\3\40\1\u00da\1\uffff\15\40\1\uffff\2\40\1\u00ea\1\40\1\u00ed\1"+
        "\u00ee\21\40\1\uffff\5\40\1\u0106\1\40\1\u0108\2\40\1\uffff\1\u010b"+
        "\5\40\1\u0111\1\40\1\u0113\6\40\1\uffff\2\40\2\uffff\21\40\1\u012e"+
        "\5\40\1\uffff\1\u013d\1\uffff\2\40\1\uffff\5\40\1\uffff\1\40\1\uffff"+
        "\32\40\1\uffff\16\40\1\uffff\22\40\1\u0185\42\40\1\u01ae\2\40\1"+
        "\u01b1\11\40\1\u01bc\1\40\1\u01be\2\40\1\uffff\11\40\1\u01ca\31"+
        "\40\1\u01e5\1\40\1\u01e8\2\40\1\uffff\2\40\1\uffff\5\40\1\u01f2"+
        "\4\40\1\uffff\1\40\1\uffff\1\40\1\u01fa\11\40\1\uffff\12\40\1\u020e"+
        "\1\40\1\u0211\15\40\1\uffff\2\40\1\uffff\3\40\1\u022a\5\40\1\uffff"+
        "\7\40\1\uffff\7\40\1\u023e\13\40\1\uffff\2\40\1\uffff\3\40\1\u024f"+
        "\24\40\1\uffff\14\40\1\u0273\2\40\1\u0276\3\40\1\uffff\6\40\1\u0280"+
        "\11\40\1\uffff\12\40\1\u0294\17\40\1\u02a4\10\40\1\uffff\2\40\1"+
        "\uffff\7\40\1\u02b6\1\40\1\uffff\1\u02b8\6\40\1\u02bf\11\40\1\u02c9"+
        "\1\40\1\uffff\15\40\1\u02d8\1\40\1\uffff\3\40\1\u02dd\15\40\1\uffff"+
        "\1\40\1\uffff\5\40\1\u02f5\1\uffff\5\40\1\u02fb\3\40\1\uffff\12"+
        "\40\1\u0309\3\40\1\uffff\4\40\1\uffff\15\40\1\u031e\11\40\1\uffff"+
        "\2\40\1\u032a\2\40\1\uffff\15\40\1\uffff\6\40\1\u0340\11\40\1\u034a"+
        "\3\40\1\uffff\1\40\1\u034f\1\40\1\u0351\7\40\1\uffff\15\40\1\u0367"+
        "\5\40\1\u036d\1\40\1\uffff\3\40\1\u0372\1\u0373\4\40\1\uffff\4\40"+
        "\1\uffff\1\40\1\uffff\14\40\1\u0389\10\40\1\uffff\5\40\1\uffff\3"+
        "\40\1\u039a\2\uffff\1\u039b\1\u039c\1\u039d\1\40\1\u039f\11\40\1"+
        "\u03a9\6\40\1\uffff\1\40\1\u03b1\12\40\1\u03bc\3\40\4\uffff\1\40"+
        "\1\uffff\1\u03c1\6\40\1\u03c8\1\u03c9\1\uffff\1\40\1\u03cb\5\40"+
        "\1\uffff\12\40\1\uffff\3\40\1\u03de\1\uffff\1\u03df\4\40\1\u03e4"+
        "\2\uffff\1\u03e5\1\uffff\1\u03e6\1\u03e7\1\u03e8\12\40\1\u03f3\3"+
        "\40\1\u03f7\2\uffff\4\40\5\uffff\12\40\1\uffff\3\40\1\uffff\1\40"+
        "\1\u040a\2\40\1\u040d\4\40\1\u0412\1\u0413\4\40\1\u0418\2\40\1\uffff"+
        "\1\40\1\u041c\1\uffff\2\40\1\u041f\1\40\2\uffff\4\40\1\uffff\1\u0425"+
        "\1\u0426\1\u0427\1\uffff\1\40\1\u0429\1\uffff\1\u042a\1\40\1\u042c"+
        "\2\40\3\uffff\1\40\2\uffff\1\40\1\uffff\2\40\1\u0433\3\40\1\uffff"+
        "\5\40\1\u043c\2\40\1\uffff\1\u043f\1\u0440\2\uffff";
    static final String DFA20_eofS =
        "\u0441\uffff";
    static final String DFA20_minS =
        "\1\11\1\122\2\uffff\1\141\1\uffff\1\141\1\uffff\2\150\1\154\1\141"+
        "\1\uffff\1\162\1\142\1\141\1\161\3\141\1\165\1\151\3\uffff\1\60"+
        "\2\55\2\uffff\1\72\2\uffff\1\111\1\160\1\166\1\162\1\155\1\147\1"+
        "\164\1\154\1\155\1\142\2\155\1\162\1\145\1\156\2\141\1\153\1\144"+
        "\1\154\1\163\1\164\1\146\1\155\1\160\1\141\1\152\1\55\1\145\1\157"+
        "\1\162\1\165\1\141\1\163\1\156\1\170\1\156\1\146\2\156\1\55\1\56"+
        "\1\55\1\uffff\1\60\1\uffff\1\55\1\157\3\145\1\141\1\55\2\145\1\103"+
        "\1\145\1\155\1\151\1\162\2\163\1\151\1\55\1\155\2\55\1\143\1\141"+
        "\1\146\1\152\1\145\1\141\1\145\1\156\1\145\1\uffff\1\55\1\160\1"+
        "\141\1\151\1\143\3\55\1\147\1\154\1\143\1\144\1\55\1\uffff\2\162"+
        "\1\146\1\144\1\164\1\uffff\1\143\1\101\1\154\1\142\1\162\1\141\1"+
        "\55\1\145\1\143\1\145\1\164\1\163\1\156\1\uffff\1\155\2\uffff\1"+
        "\162\1\101\1\145\1\157\1\143\1\151\1\55\1\163\1\143\1\uffff\1\145"+
        "\1\155\1\166\1\164\1\145\3\uffff\2\145\1\164\1\55\1\uffff\1\164"+
        "\1\163\1\154\1\160\1\111\1\151\1\164\1\156\1\163\1\141\1\152\1\157"+
        "\1\164\1\uffff\2\164\1\55\1\162\2\55\1\145\1\151\1\162\1\154\1\157"+
        "\2\141\1\170\1\156\1\157\2\156\1\171\1\162\1\151\1\164\1\156\1\uffff"+
        "\1\151\1\164\1\162\1\145\1\141\1\55\1\171\1\55\1\170\1\151\1\uffff"+
        "\1\55\2\145\1\141\1\156\1\166\1\55\1\144\1\55\1\163\1\145\1\160"+
        "\1\141\1\162\1\123\1\uffff\1\165\1\163\2\uffff\1\164\1\142\1\157"+
        "\1\154\1\155\1\163\1\156\1\170\1\141\1\151\1\155\1\145\1\164\1\160"+
        "\1\145\1\156\1\123\1\55\1\164\1\101\2\164\1\154\1\uffff\1\55\1\uffff"+
        "\1\151\1\157\1\uffff\1\106\1\170\1\143\1\144\1\145\1\uffff\1\151"+
        "\1\uffff\1\163\1\143\1\145\1\120\1\151\1\165\1\143\1\163\1\162\1"+
        "\145\1\160\1\126\1\145\1\126\2\103\1\143\1\157\1\160\1\117\2\145"+
        "\1\156\1\164\1\171\1\165\1\uffff\1\151\1\162\1\156\1\157\2\156\1"+
        "\154\1\157\2\141\1\170\1\171\2\145\1\uffff\1\166\1\156\1\142\1\165"+
        "\1\151\1\145\1\151\1\104\1\166\1\117\1\164\2\162\1\143\1\142\1\164"+
        "\1\145\1\151\1\55\1\145\1\141\1\126\3\141\1\164\1\156\1\154\1\146"+
        "\1\162\1\122\1\164\1\103\1\160\1\142\1\166\1\157\1\151\1\155\1\145"+
        "\1\164\1\154\1\155\1\163\1\156\1\170\1\141\1\126\1\162\1\156\1\145"+
        "\1\141\1\152\1\55\1\156\1\166\1\55\1\166\1\142\1\162\1\141\1\151"+
        "\1\146\1\120\1\164\1\157\1\55\1\103\1\55\1\162\1\143\1\uffff\1\162"+
        "\1\154\1\141\1\154\2\162\1\103\1\117\1\145\1\55\1\163\1\145\1\106"+
        "\1\154\1\151\1\156\1\142\1\162\1\141\1\145\1\103\1\145\1\160\1\157"+
        "\1\160\1\117\2\145\1\126\1\145\1\126\2\103\1\143\1\141\1\55\1\164"+
        "\1\55\1\154\1\145\1\uffff\1\143\1\145\1\uffff\1\151\1\152\1\157"+
        "\1\164\1\144\1\55\1\162\1\171\1\160\1\142\1\uffff\1\154\1\uffff"+
        "\1\164\1\55\1\164\1\165\1\154\1\165\2\144\1\141\1\146\1\155\1\uffff"+
        "\1\145\1\163\1\156\1\162\1\141\1\164\1\151\1\152\1\157\1\164\1\55"+
        "\1\154\1\55\1\145\1\156\1\154\1\146\2\162\1\141\1\126\3\141\1\164"+
        "\1\154\1\uffff\1\103\1\142\1\uffff\1\104\1\143\1\164\1\55\1\144"+
        "\1\145\1\160\1\141\1\165\1\uffff\1\157\1\117\1\145\1\152\1\141\1"+
        "\151\1\142\1\uffff\1\171\1\145\1\165\1\145\2\151\1\162\1\55\1\145"+
        "\1\143\1\164\1\144\1\157\1\163\1\150\1\157\1\145\1\160\1\141\1\uffff"+
        "\1\141\1\142\1\uffff\1\162\1\117\1\145\1\55\2\163\1\154\1\141\1"+
        "\154\2\162\1\103\1\165\1\154\1\157\1\142\1\162\1\141\1\152\1\142"+
        "\1\141\1\164\1\151\1\142\1\uffff\1\165\1\143\1\145\1\120\1\141\1"+
        "\160\1\146\1\162\1\145\1\163\1\157\1\152\1\55\1\163\1\145\1\55\2"+
        "\156\1\144\1\uffff\1\156\1\164\1\162\1\151\1\155\1\163\1\55\1\156"+
        "\1\143\1\145\1\120\1\163\1\152\1\164\1\146\1\155\1\uffff\2\145\1"+
        "\165\1\154\1\165\2\144\1\141\1\145\1\141\1\55\1\152\1\157\1\164"+
        "\1\145\1\152\1\164\1\120\1\157\1\152\1\141\1\164\2\162\1\154\1\145"+
        "\1\55\1\164\1\143\1\163\1\156\1\145\1\163\1\157\1\141\1\uffff\1"+
        "\106\1\163\1\uffff\2\141\1\151\1\164\2\151\1\166\1\55\1\145\1\uffff"+
        "\1\55\1\164\2\162\1\163\1\145\1\171\1\55\1\145\1\143\1\117\1\145"+
        "\1\165\1\145\2\151\1\162\1\55\1\163\1\uffff\1\145\1\160\1\141\1"+
        "\143\1\145\1\141\1\162\1\156\1\145\1\154\1\120\1\164\1\157\1\55"+
        "\1\162\1\uffff\1\171\1\164\1\117\1\55\1\143\1\163\1\155\1\156\1"+
        "\162\1\106\2\154\1\156\1\117\1\157\1\143\1\151\1\uffff\1\163\1\uffff"+
        "\1\120\1\164\1\157\1\117\1\143\1\55\1\uffff\1\156\1\164\1\146\1"+
        "\163\1\145\1\55\2\156\1\144\1\uffff\1\163\1\143\1\145\1\120\1\164"+
        "\1\143\1\120\1\157\1\141\1\143\1\55\1\162\1\171\1\160\1\uffff\1"+
        "\164\1\117\1\120\1\146\1\uffff\1\164\1\145\1\141\1\147\1\157\1\162"+
        "\2\151\1\141\1\146\1\156\1\164\1\144\1\55\1\162\1\171\1\160\1\146"+
        "\1\164\1\163\1\157\1\141\1\150\1\uffff\1\164\1\151\1\55\1\106\1"+
        "\163\1\uffff\2\141\1\151\1\145\1\164\2\162\1\120\1\164\1\162\1\160"+
        "\1\154\1\164\1\uffff\1\157\1\126\1\145\1\171\1\146\1\162\1\55\1"+
        "\120\1\162\1\151\1\145\1\155\1\157\2\164\1\154\1\55\1\117\1\151"+
        "\1\165\1\uffff\1\157\1\55\1\145\1\55\1\120\1\163\1\155\1\156\1\141"+
        "\1\117\1\157\1\uffff\1\162\1\106\2\154\1\156\1\163\1\120\1\164\1"+
        "\157\1\162\1\120\1\157\1\145\1\55\1\120\1\160\1\141\1\162\1\117"+
        "\1\55\1\157\1\uffff\1\162\1\164\1\156\2\55\1\155\2\171\1\151\1\uffff"+
        "\1\146\1\157\1\141\1\160\1\uffff\1\162\1\uffff\1\162\1\145\1\141"+
        "\1\147\1\151\1\146\1\156\1\157\1\162\2\151\1\141\1\55\1\162\1\171"+
        "\1\160\1\157\1\162\1\160\1\162\1\142\1\uffff\1\162\1\145\1\154\1"+
        "\164\1\146\1\uffff\1\160\1\157\1\151\1\55\2\uffff\3\55\1\164\1\55"+
        "\1\156\1\154\1\145\1\164\1\157\1\162\1\151\1\145\1\156\1\55\1\117"+
        "\1\155\1\157\2\164\1\154\1\uffff\1\157\1\55\1\145\1\160\1\157\1"+
        "\145\1\164\1\152\1\157\1\162\1\165\1\171\1\55\1\145\1\160\1\157"+
        "\4\uffff\1\171\1\uffff\1\55\1\163\1\162\1\151\1\160\1\164\1\156"+
        "\2\55\1\uffff\1\146\1\55\1\155\2\171\1\151\1\160\1\uffff\1\162\1"+
        "\145\1\160\1\162\1\151\1\145\1\160\1\164\1\145\1\101\1\uffff\1\162"+
        "\1\145\1\156\1\55\1\uffff\1\55\1\164\2\145\1\151\1\55\2\uffff\1"+
        "\55\1\uffff\3\55\1\164\1\145\1\164\1\162\1\145\1\164\1\145\1\143"+
        "\1\145\1\171\1\55\1\163\1\164\1\162\1\55\2\uffff\1\151\1\163\1\162"+
        "\1\157\5\uffff\1\171\1\162\1\151\1\164\1\162\1\171\1\163\1\164\1"+
        "\162\1\101\1\uffff\1\163\1\171\1\164\1\uffff\1\145\1\55\1\164\1"+
        "\156\1\55\1\164\1\145\1\171\1\164\2\55\1\120\1\164\1\163\1\145\1"+
        "\55\1\171\1\163\1\uffff\1\171\1\55\1\uffff\1\151\1\163\1\55\1\171"+
        "\2\uffff\1\162\1\171\1\163\1\162\1\uffff\3\55\1\uffff\1\145\1\55"+
        "\1\uffff\1\55\1\157\1\55\1\145\1\164\3\uffff\1\163\2\uffff\1\160"+
        "\1\uffff\1\162\1\151\1\55\1\145\1\164\1\157\1\uffff\1\162\1\151"+
        "\1\156\1\164\1\157\1\55\1\171\1\156\1\uffff\2\55\2\uffff";
    static final String DFA20_maxS =
        "\1\ufffd\1\162\2\uffff\1\157\1\uffff\1\171\1\uffff\1\150\1\157"+
        "\1\163\1\157\1\uffff\1\171\2\162\1\170\1\141\1\151\1\145\1\165\1"+
        "\151\3\uffff\1\71\2\ufffd\2\uffff\1\72\2\uffff\1\111\1\160\1\166"+
        "\1\162\1\155\1\147\1\164\1\154\1\155\1\142\2\155\1\162\1\145\1\156"+
        "\2\141\1\171\1\144\1\154\1\163\1\164\1\163\1\155\1\160\1\141\1\152"+
        "\1\ufffd\1\145\1\157\1\162\1\165\1\141\1\163\1\156\1\170\1\156\1"+
        "\146\2\156\1\ufffd\1\56\1\ufffd\1\uffff\1\71\1\uffff\1\ufffd\1\157"+
        "\3\145\1\141\1\ufffd\2\145\1\120\1\145\1\155\1\151\1\162\2\163\1"+
        "\151\1\ufffd\1\155\2\ufffd\1\143\1\141\1\146\1\152\1\145\1\141\1"+
        "\145\1\156\1\145\1\uffff\1\ufffd\1\160\1\141\1\151\1\143\3\ufffd"+
        "\1\147\1\154\1\143\1\144\1\ufffd\1\uffff\2\162\1\146\1\163\1\164"+
        "\1\uffff\1\143\1\111\1\154\1\142\1\162\1\141\1\ufffd\1\145\1\143"+
        "\1\145\1\164\1\163\1\156\1\uffff\1\155\2\uffff\1\162\1\164\1\145"+
        "\1\157\1\143\1\151\1\ufffd\1\163\1\143\1\uffff\1\145\1\155\1\166"+
        "\1\164\1\145\3\uffff\2\145\1\164\1\ufffd\1\uffff\1\164\1\163\1\154"+
        "\1\160\1\111\1\151\1\164\1\156\1\163\1\141\1\152\1\157\1\164\1\uffff"+
        "\2\164\1\ufffd\1\162\2\ufffd\1\145\1\151\1\162\1\154\1\157\1\141"+
        "\1\151\1\170\1\156\1\157\2\156\1\171\1\162\1\151\1\164\1\156\1\uffff"+
        "\1\151\1\164\1\162\1\145\1\141\1\ufffd\1\171\1\ufffd\1\170\1\151"+
        "\1\uffff\1\ufffd\2\145\1\141\1\156\1\166\1\ufffd\1\144\1\ufffd\1"+
        "\163\1\145\1\160\1\141\1\162\1\123\1\uffff\1\165\1\163\2\uffff\1"+
        "\164\1\142\1\157\1\154\1\155\1\163\1\156\1\170\1\141\1\151\1\155"+
        "\1\145\1\164\1\160\1\145\1\156\1\124\1\ufffd\1\164\1\125\2\164\1"+
        "\154\1\uffff\1\ufffd\1\uffff\1\151\1\157\1\uffff\1\117\1\170\1\143"+
        "\1\144\1\145\1\uffff\1\151\1\uffff\1\163\1\143\1\145\1\120\1\151"+
        "\1\165\1\143\1\163\1\162\1\145\1\160\1\126\1\145\1\126\2\103\1\143"+
        "\1\157\1\160\1\117\2\145\1\156\1\164\1\171\1\165\1\uffff\1\151\1"+
        "\162\1\156\1\157\2\156\1\154\1\157\1\141\1\151\1\170\1\171\2\145"+
        "\1\uffff\1\166\1\156\1\146\1\165\1\151\1\145\1\151\1\120\1\166\1"+
        "\117\1\164\2\162\1\143\1\142\1\164\1\145\1\151\1\ufffd\1\145\1\141"+
        "\1\126\3\141\1\164\1\156\1\154\1\146\1\162\1\122\1\164\1\127\1\160"+
        "\1\142\1\166\1\157\1\151\1\155\1\145\1\166\1\154\1\155\1\163\1\156"+
        "\1\170\1\141\1\126\1\162\1\156\1\145\1\141\1\152\1\ufffd\1\156\1"+
        "\166\1\ufffd\1\166\1\142\1\162\1\141\1\151\1\146\1\120\1\164\1\157"+
        "\1\ufffd\1\103\1\ufffd\1\162\1\143\1\uffff\1\162\1\154\1\141\1\154"+
        "\2\162\1\103\1\117\1\145\1\ufffd\1\163\1\145\1\111\1\154\1\151\1"+
        "\156\1\142\1\162\1\141\1\145\1\103\1\145\1\160\1\157\1\160\1\117"+
        "\2\145\1\126\1\145\1\126\2\103\1\143\1\141\1\ufffd\1\164\1\ufffd"+
        "\1\154\1\145\1\uffff\1\143\1\145\1\uffff\1\151\1\152\1\157\1\164"+
        "\1\144\1\ufffd\1\162\1\171\1\160\1\142\1\uffff\1\154\1\uffff\1\164"+
        "\1\ufffd\1\164\1\165\1\154\1\165\2\144\1\141\1\146\1\155\1\uffff"+
        "\1\145\1\163\1\156\1\162\1\141\1\164\1\151\1\152\1\157\1\164\1\ufffd"+
        "\1\154\1\ufffd\1\145\1\156\1\154\1\146\2\162\1\141\1\126\3\141\1"+
        "\164\1\154\1\uffff\1\124\1\142\1\uffff\1\117\1\143\1\164\1\ufffd"+
        "\1\144\1\145\1\160\1\141\1\165\1\uffff\1\157\1\117\1\145\1\152\1"+
        "\141\1\151\1\142\1\uffff\1\171\1\145\1\165\1\145\2\151\1\162\1\ufffd"+
        "\1\145\1\143\1\164\1\144\1\157\1\163\1\150\1\157\1\145\1\160\1\141"+
        "\1\uffff\1\141\1\142\1\uffff\1\162\1\117\1\145\1\ufffd\2\163\1\154"+
        "\1\141\1\154\2\162\1\103\1\165\1\154\1\157\1\142\1\162\1\141\1\152"+
        "\1\142\1\141\1\164\1\151\1\142\1\uffff\1\165\1\143\1\145\1\120\1"+
        "\141\1\160\1\146\1\162\1\145\1\163\1\157\1\152\1\ufffd\1\163\1\145"+
        "\1\ufffd\2\156\1\144\1\uffff\1\156\1\164\1\162\1\151\1\155\1\163"+
        "\1\ufffd\1\156\1\143\1\145\1\120\1\163\1\152\1\164\1\146\1\155\1"+
        "\uffff\2\145\1\165\1\154\1\165\2\144\1\141\1\145\1\141\1\ufffd\1"+
        "\152\1\157\1\164\1\145\1\152\1\164\1\120\1\157\1\152\1\141\1\164"+
        "\2\162\1\154\1\145\1\ufffd\1\164\1\143\1\163\1\156\1\145\1\163\1"+
        "\157\1\141\1\uffff\1\106\1\163\1\uffff\2\141\1\151\1\164\2\151\1"+
        "\166\1\ufffd\1\145\1\uffff\1\ufffd\1\164\2\162\1\163\1\145\1\171"+
        "\1\ufffd\1\145\1\143\1\117\1\145\1\165\1\145\2\151\1\162\1\ufffd"+
        "\1\163\1\uffff\1\145\1\160\1\141\1\143\1\145\1\141\1\162\1\156\1"+
        "\145\1\154\1\120\1\164\1\157\1\ufffd\1\162\1\uffff\1\171\1\164\1"+
        "\117\1\ufffd\1\143\1\163\1\155\1\156\1\162\1\106\2\154\1\156\1\117"+
        "\1\157\1\143\1\151\1\uffff\1\163\1\uffff\1\120\1\164\1\157\1\117"+
        "\1\143\1\ufffd\1\uffff\1\156\1\164\1\146\1\163\1\145\1\ufffd\2\156"+
        "\1\144\1\uffff\1\163\1\143\1\145\1\120\1\164\1\143\1\120\1\157\1"+
        "\141\1\143\1\ufffd\1\162\1\171\1\160\1\uffff\1\164\1\117\1\120\1"+
        "\146\1\uffff\1\164\1\145\1\141\1\147\1\157\1\162\2\151\1\141\1\146"+
        "\1\156\1\164\1\144\1\ufffd\1\162\1\171\1\160\1\146\1\164\1\163\1"+
        "\157\1\141\1\150\1\uffff\1\164\1\151\1\ufffd\1\106\1\163\1\uffff"+
        "\2\141\1\151\1\145\1\164\2\162\1\120\1\164\1\162\1\160\1\154\1\164"+
        "\1\uffff\1\157\1\126\1\145\1\171\1\146\1\162\1\ufffd\1\120\1\162"+
        "\1\151\1\145\1\155\1\157\2\164\1\154\1\ufffd\1\117\1\151\1\165\1"+
        "\uffff\1\157\1\ufffd\1\145\1\ufffd\1\120\1\163\1\155\1\156\1\141"+
        "\1\117\1\157\1\uffff\1\162\1\106\2\154\1\156\1\163\1\120\1\164\1"+
        "\157\1\162\1\120\1\157\1\145\1\ufffd\1\120\1\160\1\141\1\162\1\117"+
        "\1\ufffd\1\157\1\uffff\1\162\1\164\1\156\2\ufffd\1\155\2\171\1\151"+
        "\1\uffff\1\146\1\157\1\141\1\160\1\uffff\1\162\1\uffff\1\162\1\145"+
        "\1\141\1\147\1\151\1\146\1\156\1\157\1\162\2\151\1\141\1\ufffd\1"+
        "\162\1\171\1\160\1\157\1\162\1\160\1\162\1\142\1\uffff\1\162\1\145"+
        "\1\154\1\164\1\146\1\uffff\1\160\1\157\1\151\1\ufffd\2\uffff\3\ufffd"+
        "\1\164\1\ufffd\1\156\1\154\1\145\1\164\1\157\1\162\1\151\1\145\1"+
        "\156\1\ufffd\1\117\1\155\1\157\2\164\1\154\1\uffff\1\157\1\ufffd"+
        "\1\145\1\160\1\157\1\145\1\164\1\152\1\157\1\162\1\165\1\171\1\ufffd"+
        "\1\145\1\160\1\157\4\uffff\1\171\1\uffff\1\ufffd\1\163\1\162\1\151"+
        "\1\160\1\164\1\156\2\ufffd\1\uffff\1\146\1\ufffd\1\155\2\171\1\151"+
        "\1\160\1\uffff\1\162\1\145\1\160\1\162\1\151\1\145\1\160\1\164\1"+
        "\145\1\101\1\uffff\1\162\1\145\1\156\1\ufffd\1\uffff\1\ufffd\1\164"+
        "\2\145\1\151\1\ufffd\2\uffff\1\ufffd\1\uffff\3\ufffd\1\164\1\145"+
        "\1\164\1\162\1\145\1\164\1\145\1\143\1\145\1\171\1\ufffd\1\163\1"+
        "\164\1\162\1\ufffd\2\uffff\1\151\1\163\1\162\1\157\5\uffff\1\171"+
        "\1\162\1\151\1\164\1\162\1\171\1\163\1\164\1\162\1\101\1\uffff\1"+
        "\163\1\171\1\164\1\uffff\1\145\1\ufffd\1\164\1\156\1\ufffd\1\164"+
        "\1\145\1\171\1\164\2\ufffd\1\120\1\164\1\163\1\145\1\ufffd\1\171"+
        "\1\163\1\uffff\1\171\1\ufffd\1\uffff\1\151\1\163\1\ufffd\1\171\2"+
        "\uffff\1\162\1\171\1\163\1\162\1\uffff\3\ufffd\1\uffff\1\145\1\ufffd"+
        "\1\uffff\1\ufffd\1\157\1\ufffd\1\145\1\164\3\uffff\1\163\2\uffff"+
        "\1\160\1\uffff\1\162\1\151\1\ufffd\1\145\1\164\1\157\1\uffff\1\162"+
        "\1\151\1\156\1\164\1\157\1\ufffd\1\171\1\156\1\uffff\2\ufffd\2\uffff";
    static final String DFA20_acceptS =
        "\2\uffff\1\2\1\3\1\uffff\1\6\1\uffff\1\10\4\uffff\1\15\11\uffff"+
        "\1\153\1\154\1\155\3\uffff\1\160\1\161\1\uffff\1\163\1\164\53\uffff"+
        "\1\156\1\uffff\1\162\36\uffff\1\41\15\uffff\1\1\5\uffff\1\43\15"+
        "\uffff\1\13\1\uffff\1\47\1\51\11\uffff\1\45\5\uffff\1\55\1\57\1"+
        "\61\4\uffff\1\157\15\uffff\1\53\27\uffff\1\17\12\uffff\1\147\17"+
        "\uffff\1\11\2\uffff\1\142\1\140\27\uffff\1\63\1\uffff\1\110\2\uffff"+
        "\1\4\5\uffff\1\7\1\uffff\1\27\32\uffff\1\106\16\uffff\1\141\107"+
        "\uffff\1\14\50\uffff\1\112\2\uffff\1\5\12\uffff\1\123\1\uffff\1"+
        "\12\13\uffff\1\74\32\uffff\1\146\2\uffff\1\117\11\uffff\1\32\7\uffff"+
        "\1\125\23\uffff\1\150\2\uffff\1\127\30\uffff\1\121\23\uffff\1\72"+
        "\20\uffff\1\44\43\uffff\1\144\2\uffff\1\66\11\uffff\1\36\23\uffff"+
        "\1\34\17\uffff\1\100\21\uffff\1\31\1\uffff\1\37\6\uffff\1\40\11"+
        "\uffff\1\21\16\uffff\1\26\4\uffff\1\16\27\uffff\1\143\5\uffff\1"+
        "\54\15\uffff\1\145\24\uffff\1\35\13\uffff\1\136\25\uffff\1\152\11"+
        "\uffff\1\73\4\uffff\1\104\1\uffff\1\151\25\uffff\1\115\5\uffff\1"+
        "\130\4\uffff\1\134\1\64\25\uffff\1\33\20\uffff\1\133\1\65\1\67\1"+
        "\70\1\uffff\1\75\11\uffff\1\42\7\uffff\1\102\12\uffff\1\77\4\uffff"+
        "\1\76\6\uffff\1\107\1\137\1\uffff\1\50\22\uffff\1\71\1\30\4\uffff"+
        "\1\105\1\46\1\52\1\56\1\60\12\uffff\1\24\3\uffff\1\22\22\uffff\1"+
        "\132\2\uffff\1\62\4\uffff\1\135\1\111\4\uffff\1\122\3\uffff\1\20"+
        "\2\uffff\1\116\5\uffff\1\124\1\103\1\126\1\uffff\1\131\1\113\1\uffff"+
        "\1\120\6\uffff\1\101\10\uffff\1\25\2\uffff\1\114\1\23";
    static final String DFA20_specialS =
        "\u0441\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\26\1\27\1\uffff\1\26\1\27\22\uffff\1\26\1\uffff\1\34\1\uffff"+
            "\1\35\3\uffff\1\2\1\3\1\7\2\uffff\1\31\1\uffff\1\30\1\33\11"+
            "\32\2\uffff\1\37\1\5\1\uffff\1\35\1\uffff\1\12\1\25\1\11\1\13"+
            "\1\20\1\24\1\40\1\21\1\1\3\40\1\22\1\4\1\16\1\17\1\40\1\23\1"+
            "\6\1\15\2\40\1\10\3\40\3\uffff\1\14\1\36\1\uffff\32\40\105\uffff"+
            "\27\40\1\uffff\37\40\1\uffff\u0208\40\160\uffff\16\40\1\uffff"+
            "\u1c81\40\14\uffff\2\40\142\uffff\u0120\40\u0a70\uffff\u03f0"+
            "\40\21\uffff\ua7ff\40\u2100\uffff\u04d0\40\40\uffff\u020e\40",
            "\1\41\32\uffff\1\42\1\43\3\uffff\1\44",
            "",
            "",
            "\1\45\3\uffff\1\46\11\uffff\1\47",
            "",
            "\1\51\3\uffff\1\50\11\uffff\1\53\4\uffff\1\55\1\52\3\uffff"+
            "\1\54",
            "",
            "\1\56",
            "\1\61\3\uffff\1\60\2\uffff\1\57",
            "\1\64\1\uffff\1\63\4\uffff\1\62",
            "\1\66\3\uffff\1\65\3\uffff\1\67\5\uffff\1\70",
            "",
            "\1\72\6\uffff\1\71",
            "\1\73\13\uffff\1\75\3\uffff\1\74",
            "\1\77\20\uffff\1\76",
            "\1\100\6\uffff\1\101",
            "\1\102",
            "\1\104\7\uffff\1\103",
            "\1\105\3\uffff\1\106",
            "\1\107",
            "\1\110",
            "",
            "",
            "",
            "\1\112\11\111",
            "\1\40\1\115\1\uffff\12\113\7\uffff\32\40\4\uffff\1\40\1\uffff"+
            "\32\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\40\1\115\1\uffff\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff"+
            "\32\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "",
            "",
            "\1\116",
            "",
            "",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
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
            "\1\140\15\uffff\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146\13\uffff\1\150\1\147",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
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
            "\1\170",
            "\1\171",
            "\1\40\1\115\1\uffff\12\113\7\uffff\32\40\4\uffff\1\40\1\uffff"+
            "\32\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\115",
            "\1\40\1\115\1\uffff\12\113\7\uffff\32\40\4\uffff\1\40\1\uffff"+
            "\32\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "",
            "\12\172",
            "",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084\1\u0087\12\uffff\1\u0085\1\u0086",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u0090",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\2\40\1\uffff\13\40\6\uffff\12\40\1\u00a1\17\40\4\uffff\1"+
            "\40\1\uffff\32\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40"+
            "\1\uffff\u0286\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2"+
            "\40\57\uffff\u0120\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40"+
            "\u2100\uffff\u04d0\40\40\uffff\u020e\40",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\2\40\1\uffff\12\172\7\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ae\16\uffff\1\u00ad",
            "\1\u00af",
            "",
            "\1\u00b0",
            "\1\u00b2\7\uffff\1\u00b1",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "",
            "\1\u00be",
            "",
            "",
            "\1\u00bf",
            "\1\u00c1\1\uffff\1\u00c7\1\uffff\1\u00c5\2\uffff\1\u00c3\1"+
            "\u00c9\3\uffff\1\u00c4\1\uffff\1\u00c8\1\u00c0\2\uffff\1\u00c2"+
            "\1\uffff\1\u00c6\36\uffff\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u00d0",
            "\1\u00d1",
            "",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "",
            "",
            "",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "",
            "\1\u00e8",
            "\1\u00e9",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u00eb",
            "\2\40\1\uffff\13\40\6\uffff\1\u00ec\31\40\4\uffff\1\40\1\uffff"+
            "\32\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f6\7\uffff\1\u00f5",
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
            "",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u0107",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u0109",
            "\1\u010a",
            "",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u0112",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "",
            "\1\u011a",
            "\1\u011b",
            "",
            "",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012d\1\u012c",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u012f",
            "\1\u0135\1\uffff\1\u0132\1\uffff\1\u0139\2\uffff\1\u0137\1"+
            "\u0134\3\uffff\1\u0138\1\uffff\1\u0133\1\u0130\2\uffff\1\u0136"+
            "\1\uffff\1\u0131",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "",
            "\1\u013e",
            "\1\u013f",
            "",
            "\1\u0141\10\uffff\1\u0140",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "",
            "\1\u0146",
            "",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
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
            "",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016b\7\uffff\1\u016a",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172\3\uffff\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\1\u017a\12\uffff\1\u0178\1\u0179",
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
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192",
            "\1\u0193\1\u0198\12\uffff\1\u0196\1\u0197\4\uffff\1\u0195"+
            "\1\uffff\1\u0194",
            "\1\u0199",
            "\1\u019a",
            "\1\u019b",
            "\1\u019c",
            "\1\u019d",
            "\1\u019e",
            "\1\u019f",
            "\1\u01a0\1\uffff\1\u01a1",
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
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u01af",
            "\1\u01b0",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "\1\u01b5",
            "\1\u01b6",
            "\1\u01b7",
            "\1\u01b8",
            "\1\u01b9",
            "\1\u01ba",
            "\2\40\1\uffff\13\40\6\uffff\16\40\1\u01bb\13\40\4\uffff\1"+
            "\40\1\uffff\32\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40"+
            "\1\uffff\u0286\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2"+
            "\40\57\uffff\u0120\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40"+
            "\u2100\uffff\u04d0\40\40\uffff\u020e\40",
            "\1\u01bd",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u01bf",
            "\1\u01c0",
            "",
            "\1\u01c1",
            "\1\u01c2",
            "\1\u01c3",
            "\1\u01c4",
            "\1\u01c5",
            "\1\u01c6",
            "\1\u01c7",
            "\1\u01c8",
            "\1\u01c9",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u01cb",
            "\1\u01cc",
            "\1\u01ce\2\uffff\1\u01cd",
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
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u01e6",
            "\2\40\1\uffff\13\40\6\uffff\16\40\1\u01e7\13\40\4\uffff\1"+
            "\40\1\uffff\32\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40"+
            "\1\uffff\u0286\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2"+
            "\40\57\uffff\u0120\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40"+
            "\u2100\uffff\u04d0\40\40\uffff\u020e\40",
            "\1\u01e9",
            "\1\u01ea",
            "",
            "\1\u01eb",
            "\1\u01ec",
            "",
            "\1\u01ed",
            "\1\u01ee",
            "\1\u01ef",
            "\1\u01f0",
            "\1\u01f1",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u01f3",
            "\1\u01f4",
            "\1\u01f5",
            "\1\u01f6",
            "",
            "\1\u01f7",
            "",
            "\1\u01f8",
            "\2\40\1\uffff\13\40\6\uffff\16\40\1\u01f9\13\40\4\uffff\1"+
            "\40\1\uffff\32\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40"+
            "\1\uffff\u0286\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2"+
            "\40\57\uffff\u0120\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40"+
            "\u2100\uffff\u04d0\40\40\uffff\u020e\40",
            "\1\u01fb",
            "\1\u01fc",
            "\1\u01fd",
            "\1\u01fe",
            "\1\u01ff",
            "\1\u0200",
            "\1\u0201",
            "\1\u0202",
            "\1\u0203",
            "",
            "\1\u0204",
            "\1\u0205",
            "\1\u0206",
            "\1\u0207",
            "\1\u0208",
            "\1\u0209",
            "\1\u020a",
            "\1\u020b",
            "\1\u020c",
            "\1\u020d",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u020f",
            "\2\40\1\uffff\13\40\6\uffff\16\40\1\u0210\13\40\4\uffff\1"+
            "\40\1\uffff\32\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40"+
            "\1\uffff\u0286\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2"+
            "\40\57\uffff\u0120\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40"+
            "\u2100\uffff\u04d0\40\40\uffff\u020e\40",
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
            "",
            "\1\u021f\1\u0223\12\uffff\1\u0221\1\u0222\3\uffff\1\u0220",
            "\1\u0224",
            "",
            "\1\u0226\12\uffff\1\u0225",
            "\1\u0227",
            "\1\u0228",
            "\2\40\1\uffff\13\40\6\uffff\16\40\1\u0229\13\40\4\uffff\1"+
            "\40\1\uffff\32\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40"+
            "\1\uffff\u0286\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2"+
            "\40\57\uffff\u0120\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40"+
            "\u2100\uffff\u04d0\40\40\uffff\u020e\40",
            "\1\u022b",
            "\1\u022c",
            "\1\u022d",
            "\1\u022e",
            "\1\u022f",
            "",
            "\1\u0230",
            "\1\u0231",
            "\1\u0232",
            "\1\u0233",
            "\1\u0234",
            "\1\u0235",
            "\1\u0236",
            "",
            "\1\u0237",
            "\1\u0238",
            "\1\u0239",
            "\1\u023a",
            "\1\u023b",
            "\1\u023c",
            "\1\u023d",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u023f",
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
            "",
            "\1\u024c",
            "\1\u024d",
            "\1\u024e",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u0250",
            "\1\u0251",
            "\1\u0252",
            "\1\u0253",
            "\1\u0254",
            "\1\u0255",
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
            "",
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
            "\2\40\1\uffff\13\40\6\uffff\1\u0270\2\40\1\u0271\15\40\1\u0272"+
            "\10\40\4\uffff\1\40\1\uffff\32\40\74\uffff\1\40\10\uffff\27"+
            "\40\1\uffff\37\40\1\uffff\u0286\40\1\uffff\u1c81\40\14\uffff"+
            "\2\40\61\uffff\2\40\57\uffff\u0120\40\u0a70\uffff\u03f0\40\21"+
            "\uffff\ua7ff\40\u2100\uffff\u04d0\40\40\uffff\u020e\40",
            "\1\u0274",
            "\1\u0275",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u0277",
            "\1\u0278",
            "\1\u0279",
            "",
            "\1\u027a",
            "\1\u027b",
            "\1\u027c",
            "\1\u027d",
            "\1\u027e",
            "\1\u027f",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u0281",
            "\1\u0282",
            "\1\u0283",
            "\1\u0284",
            "\1\u0285",
            "\1\u0286",
            "\1\u0287",
            "\1\u0288",
            "\1\u0289",
            "",
            "\1\u028a",
            "\1\u028b",
            "\1\u028c",
            "\1\u028d",
            "\1\u028e",
            "\1\u028f",
            "\1\u0290",
            "\1\u0291",
            "\1\u0292",
            "\1\u0293",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u0295",
            "\1\u0296",
            "\1\u0297",
            "\1\u0298",
            "\1\u0299",
            "\1\u029a",
            "\1\u029b",
            "\1\u029c",
            "\1\u029d",
            "\1\u029e",
            "\1\u029f",
            "\1\u02a0",
            "\1\u02a1",
            "\1\u02a2",
            "\1\u02a3",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u02a5",
            "\1\u02a6",
            "\1\u02a7",
            "\1\u02a8",
            "\1\u02a9",
            "\1\u02aa",
            "\1\u02ab",
            "\1\u02ac",
            "",
            "\1\u02ad",
            "\1\u02ae",
            "",
            "\1\u02af",
            "\1\u02b0",
            "\1\u02b1",
            "\1\u02b2",
            "\1\u02b3",
            "\1\u02b4",
            "\1\u02b5",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u02b7",
            "",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u02b9",
            "\1\u02ba",
            "\1\u02bb",
            "\1\u02bc",
            "\1\u02bd",
            "\1\u02be",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u02c0",
            "\1\u02c1",
            "\1\u02c2",
            "\1\u02c3",
            "\1\u02c4",
            "\1\u02c5",
            "\1\u02c6",
            "\1\u02c7",
            "\1\u02c8",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u02ca",
            "",
            "\1\u02cb",
            "\1\u02cc",
            "\1\u02cd",
            "\1\u02ce",
            "\1\u02cf",
            "\1\u02d0",
            "\1\u02d1",
            "\1\u02d2",
            "\1\u02d3",
            "\1\u02d4",
            "\1\u02d5",
            "\1\u02d6",
            "\1\u02d7",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u02d9",
            "",
            "\1\u02da",
            "\1\u02db",
            "\1\u02dc",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u02de",
            "\1\u02df",
            "\1\u02e0",
            "\1\u02e1",
            "\1\u02e2",
            "\1\u02e3",
            "\1\u02e4",
            "\1\u02e5",
            "\1\u02e6",
            "\1\u02e7",
            "\1\u02e8",
            "\1\u02e9",
            "\1\u02ea",
            "",
            "\1\u02eb",
            "",
            "\1\u02ec",
            "\1\u02ed",
            "\1\u02ee",
            "\1\u02ef",
            "\1\u02f0",
            "\2\40\1\uffff\13\40\6\uffff\1\u02f1\1\40\1\u02f4\1\u02f2\15"+
            "\40\1\u02f3\10\40\4\uffff\1\40\1\uffff\32\40\74\uffff\1\40\10"+
            "\uffff\27\40\1\uffff\37\40\1\uffff\u0286\40\1\uffff\u1c81\40"+
            "\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120\40\u0a70\uffff\u03f0"+
            "\40\21\uffff\ua7ff\40\u2100\uffff\u04d0\40\40\uffff\u020e\40",
            "",
            "\1\u02f6",
            "\1\u02f7",
            "\1\u02f8",
            "\1\u02f9",
            "\1\u02fa",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u02fc",
            "\1\u02fd",
            "\1\u02fe",
            "",
            "\1\u02ff",
            "\1\u0300",
            "\1\u0301",
            "\1\u0302",
            "\1\u0303",
            "\1\u0304",
            "\1\u0305",
            "\1\u0306",
            "\1\u0307",
            "\1\u0308",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u030a",
            "\1\u030b",
            "\1\u030c",
            "",
            "\1\u030d",
            "\1\u030e",
            "\1\u030f",
            "\1\u0310",
            "",
            "\1\u0311",
            "\1\u0312",
            "\1\u0313",
            "\1\u0314",
            "\1\u0315",
            "\1\u0316",
            "\1\u0317",
            "\1\u0318",
            "\1\u0319",
            "\1\u031a",
            "\1\u031b",
            "\1\u031c",
            "\1\u031d",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u031f",
            "\1\u0320",
            "\1\u0321",
            "\1\u0322",
            "\1\u0323",
            "\1\u0324",
            "\1\u0325",
            "\1\u0326",
            "\1\u0327",
            "",
            "\1\u0328",
            "\1\u0329",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u032b",
            "\1\u032c",
            "",
            "\1\u032d",
            "\1\u032e",
            "\1\u032f",
            "\1\u0330",
            "\1\u0331",
            "\1\u0332",
            "\1\u0333",
            "\1\u0334",
            "\1\u0335",
            "\1\u0336",
            "\1\u0337",
            "\1\u0338",
            "\1\u0339",
            "",
            "\1\u033a",
            "\1\u033b",
            "\1\u033c",
            "\1\u033d",
            "\1\u033e",
            "\1\u033f",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u0341",
            "\1\u0342",
            "\1\u0343",
            "\1\u0344",
            "\1\u0345",
            "\1\u0346",
            "\1\u0347",
            "\1\u0348",
            "\1\u0349",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u034b",
            "\1\u034c",
            "\1\u034d",
            "",
            "\1\u034e",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u0350",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u0352",
            "\1\u0353",
            "\1\u0354",
            "\1\u0355",
            "\1\u0356",
            "\1\u0357",
            "\1\u0358",
            "",
            "\1\u0359",
            "\1\u035a",
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
            "\2\40\1\uffff\13\40\6\uffff\16\40\1\u0366\13\40\4\uffff\1"+
            "\40\1\uffff\32\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40"+
            "\1\uffff\u0286\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2"+
            "\40\57\uffff\u0120\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40"+
            "\u2100\uffff\u04d0\40\40\uffff\u020e\40",
            "\1\u0368",
            "\1\u0369",
            "\1\u036a",
            "\1\u036b",
            "\1\u036c",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u036e",
            "",
            "\1\u036f",
            "\1\u0370",
            "\1\u0371",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u0374",
            "\1\u0375",
            "\1\u0376",
            "\1\u0377",
            "",
            "\1\u0378",
            "\1\u0379",
            "\1\u037a",
            "\1\u037b",
            "",
            "\1\u037c",
            "",
            "\1\u037d",
            "\1\u037e",
            "\1\u037f",
            "\1\u0380",
            "\1\u0381",
            "\1\u0382",
            "\1\u0383",
            "\1\u0384",
            "\1\u0385",
            "\1\u0386",
            "\1\u0387",
            "\1\u0388",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u038a",
            "\1\u038b",
            "\1\u038c",
            "\1\u038d",
            "\1\u038e",
            "\1\u038f",
            "\1\u0390",
            "\1\u0391",
            "",
            "\1\u0392",
            "\1\u0393",
            "\1\u0394",
            "\1\u0395",
            "\1\u0396",
            "",
            "\1\u0397",
            "\1\u0398",
            "\1\u0399",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "",
            "",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u039e",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u03a0",
            "\1\u03a1",
            "\1\u03a2",
            "\1\u03a3",
            "\1\u03a4",
            "\1\u03a5",
            "\1\u03a6",
            "\1\u03a7",
            "\1\u03a8",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u03aa",
            "\1\u03ab",
            "\1\u03ac",
            "\1\u03ad",
            "\1\u03ae",
            "\1\u03af",
            "",
            "\1\u03b0",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u03b2",
            "\1\u03b3",
            "\1\u03b4",
            "\1\u03b5",
            "\1\u03b6",
            "\1\u03b7",
            "\1\u03b8",
            "\1\u03b9",
            "\1\u03ba",
            "\1\u03bb",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u03bd",
            "\1\u03be",
            "\1\u03bf",
            "",
            "",
            "",
            "",
            "\1\u03c0",
            "",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u03c2",
            "\1\u03c3",
            "\1\u03c4",
            "\1\u03c5",
            "\1\u03c6",
            "\1\u03c7",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "",
            "\1\u03ca",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u03cc",
            "\1\u03cd",
            "\1\u03ce",
            "\1\u03cf",
            "\1\u03d0",
            "",
            "\1\u03d1",
            "\1\u03d2",
            "\1\u03d3",
            "\1\u03d4",
            "\1\u03d5",
            "\1\u03d6",
            "\1\u03d7",
            "\1\u03d8",
            "\1\u03d9",
            "\1\u03da",
            "",
            "\1\u03db",
            "\1\u03dc",
            "\1\u03dd",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u03e0",
            "\1\u03e1",
            "\1\u03e2",
            "\1\u03e3",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "",
            "",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
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
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u03f4",
            "\1\u03f5",
            "\1\u03f6",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "",
            "",
            "\1\u03f8",
            "\1\u03f9",
            "\1\u03fa",
            "\1\u03fb",
            "",
            "",
            "",
            "",
            "",
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
            "",
            "\1\u0406",
            "\1\u0407",
            "\1\u0408",
            "",
            "\1\u0409",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u040b",
            "\1\u040c",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u040e",
            "\1\u040f",
            "\1\u0410",
            "\1\u0411",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u0414",
            "\1\u0415",
            "\1\u0416",
            "\1\u0417",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u0419",
            "\1\u041a",
            "",
            "\1\u041b",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "",
            "\1\u041d",
            "\1\u041e",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u0420",
            "",
            "",
            "\1\u0421",
            "\1\u0422",
            "\1\u0423",
            "\1\u0424",
            "",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "",
            "\1\u0428",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u042b",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u042d",
            "\1\u042e",
            "",
            "",
            "",
            "\1\u042f",
            "",
            "",
            "\1\u0430",
            "",
            "\1\u0431",
            "\1\u0432",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u0434",
            "\1\u0435",
            "\1\u0436",
            "",
            "\1\u0437",
            "\1\u0438",
            "\1\u0439",
            "\1\u043a",
            "\1\u043b",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\1\u043d",
            "\1\u043e",
            "",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "\2\40\1\uffff\13\40\6\uffff\32\40\4\uffff\1\40\1\uffff\32"+
            "\40\74\uffff\1\40\10\uffff\27\40\1\uffff\37\40\1\uffff\u0286"+
            "\40\1\uffff\u1c81\40\14\uffff\2\40\61\uffff\2\40\57\uffff\u0120"+
            "\40\u0a70\uffff\u03f0\40\21\uffff\ua7ff\40\u2100\uffff\u04d0"+
            "\40\40\uffff\u020e\40",
            "",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | WHITESPACE | LINEBREAKS | COMMENT | INTEGER | FLOAT | LITERAL | VARIABLE | NODE | FULLIRI | ABBRIRI );";
        }
    }
 

}