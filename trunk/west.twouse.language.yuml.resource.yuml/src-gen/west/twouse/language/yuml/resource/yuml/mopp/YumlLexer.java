// $ANTLR ${project.version} ${buildNumber}

	package west.twouse.language.yuml.resource.yuml.mopp;


import org.antlr.runtime3_2_0.*;

public class YumlLexer extends Lexer {
    public static final int VISIBILITY=7;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int WHITESPACE=8;
    public static final int TEXT=5;
    public static final int EOF=-1;
    public static final int LINEBREAKS=9;
    public static final int ALPHANUM=4;
    public static final int CARDINALITY=6;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;

    	public java.util.List<org.antlr.runtime3_2_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_2_0.RecognitionException>();
    	public java.util.List<Integer> lexerExceptionsPosition = new java.util.ArrayList<Integer>();
    	
    	public void reportError(org.antlr.runtime3_2_0.RecognitionException e) {
    		lexerExceptions.add(e);
    		lexerExceptionsPosition.add(((org.antlr.runtime3_2_0.ANTLRStringStream) input).index());
    	}


    // delegates
    // delegators

    public YumlLexer() {;} 
    public YumlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public YumlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "Yuml.g"; }

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Yuml.g:16:7: ( ',' )
            // Yuml.g:16:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Yuml.g:17:7: ( '[' )
            // Yuml.g:17:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Yuml.g:18:7: ( '<<' )
            // Yuml.g:18:9: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Yuml.g:19:7: ( '>>' )
            // Yuml.g:19:9: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Yuml.g:20:7: ( '|' )
            // Yuml.g:20:9: '|'
            {
            match('|'); 

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
            // Yuml.g:21:7: ( ';' )
            // Yuml.g:21:9: ';'
            {
            match(';'); 

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
            // Yuml.g:22:7: ( '{bg:' )
            // Yuml.g:22:9: '{bg:'
            {
            match("{bg:"); 


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
            // Yuml.g:23:7: ( '}' )
            // Yuml.g:23:9: '}'
            {
            match('}'); 

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
            // Yuml.g:24:7: ( ']' )
            // Yuml.g:24:9: ']'
            {
            match(']'); 

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
            // Yuml.g:25:7: ( '<' )
            // Yuml.g:25:9: '<'
            {
            match('<'); 

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
            // Yuml.g:26:7: ( '-' )
            // Yuml.g:26:9: '-'
            {
            match('-'); 

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
            // Yuml.g:27:7: ( '>' )
            // Yuml.g:27:9: '>'
            {
            match('>'); 

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
            // Yuml.g:28:7: ( '^' )
            // Yuml.g:28:9: '^'
            {
            match('^'); 

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
            // Yuml.g:29:7: ( '..' )
            // Yuml.g:29:9: '..'
            {
            match(".."); 


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
            // Yuml.g:30:7: ( ' : ' )
            // Yuml.g:30:9: ' : '
            {
            match(" : "); 


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
            // Yuml.g:31:7: ( '(' )
            // Yuml.g:31:9: '('
            {
            match('('); 

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
            // Yuml.g:32:7: ( ')' )
            // Yuml.g:32:9: ')'
            {
            match(')'); 

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
            // Yuml.g:33:7: ( '[note: ' )
            // Yuml.g:33:9: '[note: '
            {
            match("[note: "); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Yuml.g:2753:11: ( ( ( ' ' | '\\t' | '\\f' ) ) )
            // Yuml.g:2754:2: ( ( ' ' | '\\t' | '\\f' ) )
            {
            // Yuml.g:2754:2: ( ( ' ' | '\\t' | '\\f' ) )
            // Yuml.g:2754:3: ( ' ' | '\\t' | '\\f' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

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
            // Yuml.g:2757:11: ( ( ( '\\r\\n' | '\\r' | '\\n' ) ) )
            // Yuml.g:2758:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            {
            // Yuml.g:2758:2: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            // Yuml.g:2758:3: ( '\\r\\n' | '\\r' | '\\n' )
            {
            // Yuml.g:2758:3: ( '\\r\\n' | '\\r' | '\\n' )
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
                    // Yuml.g:2758:4: '\\r\\n'
                    {
                    match("\r\n"); 


                    }
                    break;
                case 2 :
                    // Yuml.g:2758:11: '\\r'
                    {
                    match('\r'); 

                    }
                    break;
                case 3 :
                    // Yuml.g:2758:16: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }


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

    // $ANTLR start "CARDINALITY"
    public final void mCARDINALITY() throws RecognitionException {
        try {
            int _type = CARDINALITY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Yuml.g:2761:12: ( ( '0' | ( '1' .. '9' ) ( '0' .. '9' )* | '*' ) )
            // Yuml.g:2762:2: ( '0' | ( '1' .. '9' ) ( '0' .. '9' )* | '*' )
            {
            // Yuml.g:2762:2: ( '0' | ( '1' .. '9' ) ( '0' .. '9' )* | '*' )
            int alt3=3;
            switch ( input.LA(1) ) {
            case '0':
                {
                alt3=1;
                }
                break;
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt3=2;
                }
                break;
            case '*':
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // Yuml.g:2762:3: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // Yuml.g:2762:8: ( '1' .. '9' ) ( '0' .. '9' )*
                    {
                    // Yuml.g:2762:8: ( '1' .. '9' )
                    // Yuml.g:2762:9: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }

                    // Yuml.g:2762:18: ( '0' .. '9' )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // Yuml.g:2762:19: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // Yuml.g:2762:31: '*'
                    {
                    match('*'); 

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
    // $ANTLR end "CARDINALITY"

    // $ANTLR start "ALPHANUM"
    public final void mALPHANUM() throws RecognitionException {
        try {
            int _type = ALPHANUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Yuml.g:2764:9: ( ( ( ( 'A' .. 'Z' 'a' .. 'z' ) | ( '0' .. '9' ) )+ ) )
            // Yuml.g:2765:2: ( ( ( 'A' .. 'Z' 'a' .. 'z' ) | ( '0' .. '9' ) )+ )
            {
            // Yuml.g:2765:2: ( ( ( 'A' .. 'Z' 'a' .. 'z' ) | ( '0' .. '9' ) )+ )
            // Yuml.g:2765:3: ( ( 'A' .. 'Z' 'a' .. 'z' ) | ( '0' .. '9' ) )+
            {
            // Yuml.g:2765:3: ( ( 'A' .. 'Z' 'a' .. 'z' ) | ( '0' .. '9' ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='A' && LA4_0<='Z')) ) {
                    alt4=1;
                }
                else if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // Yuml.g:2765:4: ( 'A' .. 'Z' 'a' .. 'z' )
            	    {
            	    // Yuml.g:2765:4: ( 'A' .. 'Z' 'a' .. 'z' )
            	    // Yuml.g:2765:5: 'A' .. 'Z' 'a' .. 'z'
            	    {
            	    matchRange('A','Z'); 
            	    matchRange('a','z'); 

            	    }


            	    }
            	    break;
            	case 2 :
            	    // Yuml.g:2765:25: ( '0' .. '9' )
            	    {
            	    // Yuml.g:2765:25: ( '0' .. '9' )
            	    // Yuml.g:2765:26: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ALPHANUM"

    // $ANTLR start "VISIBILITY"
    public final void mVISIBILITY() throws RecognitionException {
        try {
            int _type = VISIBILITY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Yuml.g:2767:11: ( ( ( '+' | '-' ) ) )
            // Yuml.g:2768:2: ( ( '+' | '-' ) )
            {
            // Yuml.g:2768:2: ( ( '+' | '-' ) )
            // Yuml.g:2768:3: ( '+' | '-' )
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VISIBILITY"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Yuml.g:2770:5: ( ( ( '\\u0000' .. '\\u0029' | '\\u002F' .. '\\u003A' | '\\u003D' | '\\u0040' .. '\\u005A' | '\\u005F' .. '\\u007A' | '\\u007E' .. '\\uFFFF' )+ ) )
            // Yuml.g:2771:2: ( ( '\\u0000' .. '\\u0029' | '\\u002F' .. '\\u003A' | '\\u003D' | '\\u0040' .. '\\u005A' | '\\u005F' .. '\\u007A' | '\\u007E' .. '\\uFFFF' )+ )
            {
            // Yuml.g:2771:2: ( ( '\\u0000' .. '\\u0029' | '\\u002F' .. '\\u003A' | '\\u003D' | '\\u0040' .. '\\u005A' | '\\u005F' .. '\\u007A' | '\\u007E' .. '\\uFFFF' )+ )
            // Yuml.g:2771:3: ( '\\u0000' .. '\\u0029' | '\\u002F' .. '\\u003A' | '\\u003D' | '\\u0040' .. '\\u005A' | '\\u005F' .. '\\u007A' | '\\u007E' .. '\\uFFFF' )+
            {
            // Yuml.g:2771:3: ( '\\u0000' .. '\\u0029' | '\\u002F' .. '\\u003A' | '\\u003D' | '\\u0040' .. '\\u005A' | '\\u005F' .. '\\u007A' | '\\u007E' .. '\\uFFFF' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\u0000' && LA5_0<=')')||(LA5_0>='/' && LA5_0<=':')||LA5_0=='='||(LA5_0>='@' && LA5_0<='Z')||(LA5_0>='_' && LA5_0<='z')||(LA5_0>='~' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Yuml.g:
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='/' && input.LA(1)<=':')||input.LA(1)=='='||(input.LA(1)>='@' && input.LA(1)<='Z')||(input.LA(1)>='_' && input.LA(1)<='z')||(input.LA(1)>='~' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TEXT"

    public void mTokens() throws RecognitionException {
        // Yuml.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | WHITESPACE | LINEBREAKS | CARDINALITY | ALPHANUM | VISIBILITY | TEXT )
        int alt6=24;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // Yuml.g:1:10: T__10
                {
                mT__10(); 

                }
                break;
            case 2 :
                // Yuml.g:1:16: T__11
                {
                mT__11(); 

                }
                break;
            case 3 :
                // Yuml.g:1:22: T__12
                {
                mT__12(); 

                }
                break;
            case 4 :
                // Yuml.g:1:28: T__13
                {
                mT__13(); 

                }
                break;
            case 5 :
                // Yuml.g:1:34: T__14
                {
                mT__14(); 

                }
                break;
            case 6 :
                // Yuml.g:1:40: T__15
                {
                mT__15(); 

                }
                break;
            case 7 :
                // Yuml.g:1:46: T__16
                {
                mT__16(); 

                }
                break;
            case 8 :
                // Yuml.g:1:52: T__17
                {
                mT__17(); 

                }
                break;
            case 9 :
                // Yuml.g:1:58: T__18
                {
                mT__18(); 

                }
                break;
            case 10 :
                // Yuml.g:1:64: T__19
                {
                mT__19(); 

                }
                break;
            case 11 :
                // Yuml.g:1:70: T__20
                {
                mT__20(); 

                }
                break;
            case 12 :
                // Yuml.g:1:76: T__21
                {
                mT__21(); 

                }
                break;
            case 13 :
                // Yuml.g:1:82: T__22
                {
                mT__22(); 

                }
                break;
            case 14 :
                // Yuml.g:1:88: T__23
                {
                mT__23(); 

                }
                break;
            case 15 :
                // Yuml.g:1:94: T__24
                {
                mT__24(); 

                }
                break;
            case 16 :
                // Yuml.g:1:100: T__25
                {
                mT__25(); 

                }
                break;
            case 17 :
                // Yuml.g:1:106: T__26
                {
                mT__26(); 

                }
                break;
            case 18 :
                // Yuml.g:1:112: T__27
                {
                mT__27(); 

                }
                break;
            case 19 :
                // Yuml.g:1:118: WHITESPACE
                {
                mWHITESPACE(); 

                }
                break;
            case 20 :
                // Yuml.g:1:129: LINEBREAKS
                {
                mLINEBREAKS(); 

                }
                break;
            case 21 :
                // Yuml.g:1:140: CARDINALITY
                {
                mCARDINALITY(); 

                }
                break;
            case 22 :
                // Yuml.g:1:152: ALPHANUM
                {
                mALPHANUM(); 

                }
                break;
            case 23 :
                // Yuml.g:1:161: VISIBILITY
                {
                mVISIBILITY(); 

                }
                break;
            case 24 :
                // Yuml.g:1:172: TEXT
                {
                mTEXT(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\2\uffff\1\32\1\34\1\36\10\uffff\1\41\1\42\1\43\1\41\2\45\2\25"+
        "\1\uffff\1\30\11\uffff\1\30\3\uffff\1\45\1\uffff\1\52\1\25\1\52"+
        "\1\53\2\uffff";
    static final String DFA6_eofS =
        "\54\uffff";
    static final String DFA6_minS =
        "\1\0\1\uffff\1\156\1\74\1\76\10\uffff\10\0\1\uffff\1\141\11\uffff"+
        "\1\40\3\uffff\1\0\1\uffff\4\0\2\uffff";
    static final String DFA6_maxS =
        "\1\uffff\1\uffff\1\156\1\74\1\76\10\uffff\10\uffff\1\uffff\1\172"+
        "\11\uffff\1\40\3\uffff\1\uffff\1\uffff\4\uffff\2\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\3\uffff\1\5\1\6\1\7\1\10\1\11\1\13\1\15\1\16\10\uffff"+
        "\1\25\1\uffff\1\27\1\30\1\22\1\2\1\3\1\12\1\4\1\14\1\13\1\uffff"+
        "\1\23\1\20\1\21\1\uffff\1\24\4\uffff\1\26\1\17";
    static final String DFA6_specialS =
        "\1\3\14\uffff\1\11\1\12\1\5\1\13\1\2\1\7\1\6\1\14\17\uffff\1\10"+
        "\1\uffff\1\0\1\4\1\1\1\15\2\uffff}>";
    static final String[] DFA6_transitionS = {
            "\11\30\1\20\1\22\1\30\1\20\1\21\22\30\1\15\7\30\1\16\1\17\1"+
            "\25\1\27\1\1\1\12\1\14\1\30\1\23\11\24\1\30\1\6\1\3\1\30\1\4"+
            "\1\uffff\1\30\32\26\1\2\1\uffff\1\11\1\13\34\30\1\7\1\5\1\10"+
            "\uff82\30",
            "",
            "\1\31",
            "\1\33",
            "\1\35",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\52\30\5\uffff\13\30\1\40\2\uffff\1\30\2\uffff\33\30\4\uffff"+
            "\34\30\3\uffff\uff82\30",
            "\52\30\5\uffff\14\30\2\uffff\1\30\2\uffff\33\30\4\uffff\34"+
            "\30\3\uffff\uff82\30",
            "\52\30\5\uffff\14\30\2\uffff\1\30\2\uffff\33\30\4\uffff\34"+
            "\30\3\uffff\uff82\30",
            "\52\30\5\uffff\14\30\2\uffff\1\30\2\uffff\33\30\4\uffff\34"+
            "\30\3\uffff\uff82\30",
            "\12\30\1\44\37\30\5\uffff\14\30\2\uffff\1\30\2\uffff\33\30"+
            "\4\uffff\34\30\3\uffff\uff82\30",
            "\52\30\5\uffff\14\30\2\uffff\1\30\2\uffff\33\30\4\uffff\34"+
            "\30\3\uffff\uff82\30",
            "\52\30\5\uffff\1\30\12\46\1\30\2\uffff\1\30\2\uffff\1\30\32"+
            "\26\4\uffff\34\30\3\uffff\uff82\30",
            "\52\30\5\uffff\1\30\12\47\1\30\2\uffff\1\30\2\uffff\1\30\32"+
            "\26\4\uffff\34\30\3\uffff\uff82\30",
            "",
            "\32\50",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\51",
            "",
            "",
            "",
            "\52\30\5\uffff\14\30\2\uffff\1\30\2\uffff\33\30\4\uffff\34"+
            "\30\3\uffff\uff82\30",
            "",
            "\52\30\5\uffff\1\30\12\46\1\30\2\uffff\1\30\2\uffff\1\30\32"+
            "\26\4\uffff\34\30\3\uffff\uff82\30",
            "\52\30\5\uffff\1\30\12\47\1\30\2\uffff\1\30\2\uffff\1\30\32"+
            "\26\4\uffff\34\30\3\uffff\uff82\30",
            "\52\30\5\uffff\1\30\12\46\1\30\2\uffff\1\30\2\uffff\1\30\32"+
            "\26\4\uffff\34\30\3\uffff\uff82\30",
            "\52\30\5\uffff\14\30\2\uffff\1\30\2\uffff\33\30\4\uffff\34"+
            "\30\3\uffff\uff82\30",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | WHITESPACE | LINEBREAKS | CARDINALITY | ALPHANUM | VISIBILITY | TEXT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_38 = input.LA(1);

                        s = -1;
                        if ( ((LA6_38>='A' && LA6_38<='Z')) ) {s = 22;}

                        else if ( ((LA6_38>='0' && LA6_38<='9')) ) {s = 38;}

                        else if ( ((LA6_38>='\u0000' && LA6_38<=')')||LA6_38=='/'||LA6_38==':'||LA6_38=='='||LA6_38=='@'||(LA6_38>='_' && LA6_38<='z')||(LA6_38>='~' && LA6_38<='\uFFFF')) ) {s = 24;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA6_40 = input.LA(1);

                        s = -1;
                        if ( ((LA6_40>='A' && LA6_40<='Z')) ) {s = 22;}

                        else if ( ((LA6_40>='0' && LA6_40<='9')) ) {s = 38;}

                        else if ( ((LA6_40>='\u0000' && LA6_40<=')')||LA6_40=='/'||LA6_40==':'||LA6_40=='='||LA6_40=='@'||(LA6_40>='_' && LA6_40<='z')||(LA6_40>='~' && LA6_40<='\uFFFF')) ) {s = 24;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA6_17 = input.LA(1);

                        s = -1;
                        if ( (LA6_17=='\n') ) {s = 36;}

                        else if ( ((LA6_17>='\u0000' && LA6_17<='\t')||(LA6_17>='\u000B' && LA6_17<=')')||(LA6_17>='/' && LA6_17<=':')||LA6_17=='='||(LA6_17>='@' && LA6_17<='Z')||(LA6_17>='_' && LA6_17<='z')||(LA6_17>='~' && LA6_17<='\uFFFF')) ) {s = 24;}

                        else s = 37;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA6_0 = input.LA(1);

                        s = -1;
                        if ( (LA6_0==',') ) {s = 1;}

                        else if ( (LA6_0=='[') ) {s = 2;}

                        else if ( (LA6_0=='<') ) {s = 3;}

                        else if ( (LA6_0=='>') ) {s = 4;}

                        else if ( (LA6_0=='|') ) {s = 5;}

                        else if ( (LA6_0==';') ) {s = 6;}

                        else if ( (LA6_0=='{') ) {s = 7;}

                        else if ( (LA6_0=='}') ) {s = 8;}

                        else if ( (LA6_0==']') ) {s = 9;}

                        else if ( (LA6_0=='-') ) {s = 10;}

                        else if ( (LA6_0=='^') ) {s = 11;}

                        else if ( (LA6_0=='.') ) {s = 12;}

                        else if ( (LA6_0==' ') ) {s = 13;}

                        else if ( (LA6_0=='(') ) {s = 14;}

                        else if ( (LA6_0==')') ) {s = 15;}

                        else if ( (LA6_0=='\t'||LA6_0=='\f') ) {s = 16;}

                        else if ( (LA6_0=='\r') ) {s = 17;}

                        else if ( (LA6_0=='\n') ) {s = 18;}

                        else if ( (LA6_0=='0') ) {s = 19;}

                        else if ( ((LA6_0>='1' && LA6_0<='9')) ) {s = 20;}

                        else if ( (LA6_0=='*') ) {s = 21;}

                        else if ( ((LA6_0>='A' && LA6_0<='Z')) ) {s = 22;}

                        else if ( (LA6_0=='+') ) {s = 23;}

                        else if ( ((LA6_0>='\u0000' && LA6_0<='\b')||LA6_0=='\u000B'||(LA6_0>='\u000E' && LA6_0<='\u001F')||(LA6_0>='!' && LA6_0<='\'')||LA6_0=='/'||LA6_0==':'||LA6_0=='='||LA6_0=='@'||(LA6_0>='_' && LA6_0<='z')||(LA6_0>='~' && LA6_0<='\uFFFF')) ) {s = 24;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA6_39 = input.LA(1);

                        s = -1;
                        if ( ((LA6_39>='A' && LA6_39<='Z')) ) {s = 22;}

                        else if ( ((LA6_39>='0' && LA6_39<='9')) ) {s = 39;}

                        else if ( ((LA6_39>='\u0000' && LA6_39<=')')||LA6_39=='/'||LA6_39==':'||LA6_39=='='||LA6_39=='@'||(LA6_39>='_' && LA6_39<='z')||(LA6_39>='~' && LA6_39<='\uFFFF')) ) {s = 24;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA6_15 = input.LA(1);

                        s = -1;
                        if ( ((LA6_15>='\u0000' && LA6_15<=')')||(LA6_15>='/' && LA6_15<=':')||LA6_15=='='||(LA6_15>='@' && LA6_15<='Z')||(LA6_15>='_' && LA6_15<='z')||(LA6_15>='~' && LA6_15<='\uFFFF')) ) {s = 24;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA6_19 = input.LA(1);

                        s = -1;
                        if ( ((LA6_19>='A' && LA6_19<='Z')) ) {s = 22;}

                        else if ( ((LA6_19>='0' && LA6_19<='9')) ) {s = 38;}

                        else if ( ((LA6_19>='\u0000' && LA6_19<=')')||LA6_19=='/'||LA6_19==':'||LA6_19=='='||LA6_19=='@'||(LA6_19>='_' && LA6_19<='z')||(LA6_19>='~' && LA6_19<='\uFFFF')) ) {s = 24;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA6_18 = input.LA(1);

                        s = -1;
                        if ( ((LA6_18>='\u0000' && LA6_18<=')')||(LA6_18>='/' && LA6_18<=':')||LA6_18=='='||(LA6_18>='@' && LA6_18<='Z')||(LA6_18>='_' && LA6_18<='z')||(LA6_18>='~' && LA6_18<='\uFFFF')) ) {s = 24;}

                        else s = 37;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA6_36 = input.LA(1);

                        s = -1;
                        if ( ((LA6_36>='\u0000' && LA6_36<=')')||(LA6_36>='/' && LA6_36<=':')||LA6_36=='='||(LA6_36>='@' && LA6_36<='Z')||(LA6_36>='_' && LA6_36<='z')||(LA6_36>='~' && LA6_36<='\uFFFF')) ) {s = 24;}

                        else s = 37;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA6_13 = input.LA(1);

                        s = -1;
                        if ( (LA6_13==':') ) {s = 32;}

                        else if ( ((LA6_13>='\u0000' && LA6_13<=')')||(LA6_13>='/' && LA6_13<='9')||LA6_13=='='||(LA6_13>='@' && LA6_13<='Z')||(LA6_13>='_' && LA6_13<='z')||(LA6_13>='~' && LA6_13<='\uFFFF')) ) {s = 24;}

                        else s = 33;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA6_14 = input.LA(1);

                        s = -1;
                        if ( ((LA6_14>='\u0000' && LA6_14<=')')||(LA6_14>='/' && LA6_14<=':')||LA6_14=='='||(LA6_14>='@' && LA6_14<='Z')||(LA6_14>='_' && LA6_14<='z')||(LA6_14>='~' && LA6_14<='\uFFFF')) ) {s = 24;}

                        else s = 34;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA6_16 = input.LA(1);

                        s = -1;
                        if ( ((LA6_16>='\u0000' && LA6_16<=')')||(LA6_16>='/' && LA6_16<=':')||LA6_16=='='||(LA6_16>='@' && LA6_16<='Z')||(LA6_16>='_' && LA6_16<='z')||(LA6_16>='~' && LA6_16<='\uFFFF')) ) {s = 24;}

                        else s = 33;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA6_20 = input.LA(1);

                        s = -1;
                        if ( ((LA6_20>='A' && LA6_20<='Z')) ) {s = 22;}

                        else if ( ((LA6_20>='0' && LA6_20<='9')) ) {s = 39;}

                        else if ( ((LA6_20>='\u0000' && LA6_20<=')')||LA6_20=='/'||LA6_20==':'||LA6_20=='='||LA6_20=='@'||(LA6_20>='_' && LA6_20<='z')||(LA6_20>='~' && LA6_20<='\uFFFF')) ) {s = 24;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA6_41 = input.LA(1);

                        s = -1;
                        if ( ((LA6_41>='\u0000' && LA6_41<=')')||(LA6_41>='/' && LA6_41<=':')||LA6_41=='='||(LA6_41>='@' && LA6_41<='Z')||(LA6_41>='_' && LA6_41<='z')||(LA6_41>='~' && LA6_41<='\uFFFF')) ) {s = 24;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 6, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}