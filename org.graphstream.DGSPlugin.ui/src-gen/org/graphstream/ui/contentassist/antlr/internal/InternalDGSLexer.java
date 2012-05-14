package org.graphstream.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDGSLexer extends Lexer {
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
    public static final int RULE_EOL=4;
    public static final int RULE_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ASSIGN=14;
    public static final int T__19=19;
    public static final int RULE_MAGIC=9;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_CL=10;
    public static final int RULE_INT=6;
    public static final int RULE_REAL=12;
    public static final int RULE_DIRECTION=11;
    public static final int RULE_OPERATOR=13;
    public static final int RULE_WS=15;
    public static final int RULE_WORD=7;

    // delegates
    // delegators

    public InternalDGSLexer() {;} 
    public InternalDGSLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDGSLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g"; }

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:11:7: ( 'an' )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:11:9: 'an'
            {
            match("an"); 


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
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:12:7: ( 'cn' )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:12:9: 'cn'
            {
            match("cn"); 


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
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:13:7: ( 'dn' )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:13:9: 'dn'
            {
            match("dn"); 


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
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:14:7: ( 'ae' )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:14:9: 'ae'
            {
            match("ae"); 


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
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:15:7: ( 'ce' )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:15:9: 'ce'
            {
            match("ce"); 


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
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:16:7: ( 'de' )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:16:9: 'de'
            {
            match("de"); 


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
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:17:7: ( 'cg' )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:17:9: 'cg'
            {
            match("cg"); 


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
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:18:7: ( 'st' )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:18:9: 'st'
            {
            match("st"); 


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
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:19:7: ( ',' )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:19:9: ','
            {
            match(','); 

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
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:20:7: ( '{' )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:20:9: '{'
            {
            match('{'); 

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
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:21:7: ( '}' )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:21:9: '}'
            {
            match('}'); 

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
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:22:7: ( '[' )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:22:9: '['
            {
            match('['); 

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
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:23:7: ( ']' )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:23:9: ']'
            {
            match(']'); 

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
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:24:7: ( '.' )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:24:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "RULE_MAGIC"
    public final void mRULE_MAGIC() throws RecognitionException {
        try {
            int _type = RULE_MAGIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3497:12: ( ( 'DGS003' | 'DGS004' ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3497:14: ( 'DGS003' | 'DGS004' )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3497:14: ( 'DGS003' | 'DGS004' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='D') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='G') ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2=='S') ) {
                        int LA1_3 = input.LA(4);

                        if ( (LA1_3=='0') ) {
                            int LA1_4 = input.LA(5);

                            if ( (LA1_4=='0') ) {
                                int LA1_5 = input.LA(6);

                                if ( (LA1_5=='3') ) {
                                    alt1=1;
                                }
                                else if ( (LA1_5=='4') ) {
                                    alt1=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 1, 5, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 1, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3497:15: 'DGS003'
                    {
                    match("DGS003"); 


                    }
                    break;
                case 2 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3497:24: 'DGS004'
                    {
                    match("DGS004"); 


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
    // $ANTLR end "RULE_MAGIC"

    // $ANTLR start "RULE_CL"
    public final void mRULE_CL() throws RecognitionException {
        try {
            int _type = RULE_CL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3499:9: ( 'cl' )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3499:11: 'cl'
            {
            match("cl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CL"

    // $ANTLR start "RULE_OPERATOR"
    public final void mRULE_OPERATOR() throws RecognitionException {
        try {
            int _type = RULE_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3501:15: ( ( '+' | '-' ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3501:17: ( '+' | '-' )
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OPERATOR"

    // $ANTLR start "RULE_DIRECTION"
    public final void mRULE_DIRECTION() throws RecognitionException {
        try {
            int _type = RULE_DIRECTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3503:16: ( ( '<' | '>' ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3503:18: ( '<' | '>' )
            {
            if ( input.LA(1)=='<'||input.LA(1)=='>' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIRECTION"

    // $ANTLR start "RULE_ASSIGN"
    public final void mRULE_ASSIGN() throws RecognitionException {
        try {
            int _type = RULE_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3505:13: ( ( '=' | ':' ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3505:15: ( '=' | ':' )
            {
            if ( input.LA(1)==':'||input.LA(1)=='=' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ASSIGN"

    // $ANTLR start "RULE_COMMENT"
    public final void mRULE_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3507:14: ( '#' ( options {greedy=false; } : . )* RULE_EOL )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3507:16: '#' ( options {greedy=false; } : . )* RULE_EOL
            {
            match('#'); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3507:20: ( options {greedy=false; } : . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\r') ) {
                    alt2=2;
                }
                else if ( (LA2_0=='\n') ) {
                    alt2=2;
                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3507:48: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            mRULE_EOL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMENT"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3509:10: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3509:12: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3509:12: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='0') ) {
                alt4=1;
            }
            else if ( ((LA4_0>='1' && LA4_0<='9')) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3509:13: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3509:17: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3509:26: ( '0' .. '9' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3509:27: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


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
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_REAL"
    public final void mRULE_REAL() throws RecognitionException {
        try {
            int _type = RULE_REAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3511:11: ( RULE_INT ( '.' ( '0' )* RULE_INT )? )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3511:13: RULE_INT ( '.' ( '0' )* RULE_INT )?
            {
            mRULE_INT(); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3511:22: ( '.' ( '0' )* RULE_INT )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='.') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3511:23: '.' ( '0' )* RULE_INT
                    {
                    match('.'); 
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3511:27: ( '0' )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='0') ) {
                            int LA5_1 = input.LA(2);

                            if ( ((LA5_1>='0' && LA5_1<='9')) ) {
                                alt5=1;
                            }


                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3511:27: '0'
                    	    {
                    	    match('0'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    mRULE_INT(); 

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
    // $ANTLR end "RULE_REAL"

    // $ANTLR start "RULE_WORD"
    public final void mRULE_WORD() throws RecognitionException {
        try {
            int _type = RULE_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3513:11: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '_' )* )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3513:13: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3513:33: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '_' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='-'||(LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:
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
            	    break loop7;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WORD"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3515:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3515:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3515:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='\\') ) {
                    alt8=1;
                }
                else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3515:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3515:65: ~ ( ( '\\\\' | '\"' ) )
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

            	default :
            	    break loop8;
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
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_EOL"
    public final void mRULE_EOL() throws RecognitionException {
        try {
            int _type = RULE_EOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3517:10: ( ( '\\r' )? '\\n' )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3517:12: ( '\\r' )? '\\n'
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3517:12: ( '\\r' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3517:12: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EOL"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3519:9: ( ( ' ' | '\\t' )+ )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3519:11: ( ' ' | '\\t' )+
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3519:11: ( ' ' | '\\t' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\t'||LA10_0==' ') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    public void mTokens() throws RecognitionException {
        // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | RULE_MAGIC | RULE_CL | RULE_OPERATOR | RULE_DIRECTION | RULE_ASSIGN | RULE_COMMENT | RULE_INT | RULE_REAL | RULE_WORD | RULE_STRING | RULE_EOL | RULE_WS )
        int alt11=26;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1:70: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1:76: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1:82: T__28
                {
                mT__28(); 

                }
                break;
            case 14 :
                // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1:88: T__29
                {
                mT__29(); 

                }
                break;
            case 15 :
                // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1:94: RULE_MAGIC
                {
                mRULE_MAGIC(); 

                }
                break;
            case 16 :
                // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1:105: RULE_CL
                {
                mRULE_CL(); 

                }
                break;
            case 17 :
                // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1:113: RULE_OPERATOR
                {
                mRULE_OPERATOR(); 

                }
                break;
            case 18 :
                // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1:127: RULE_DIRECTION
                {
                mRULE_DIRECTION(); 

                }
                break;
            case 19 :
                // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1:142: RULE_ASSIGN
                {
                mRULE_ASSIGN(); 

                }
                break;
            case 20 :
                // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1:154: RULE_COMMENT
                {
                mRULE_COMMENT(); 

                }
                break;
            case 21 :
                // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1:167: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 22 :
                // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1:176: RULE_REAL
                {
                mRULE_REAL(); 

                }
                break;
            case 23 :
                // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1:186: RULE_WORD
                {
                mRULE_WORD(); 

                }
                break;
            case 24 :
                // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1:196: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 25 :
                // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1:208: RULE_EOL
                {
                mRULE_EOL(); 

                }
                break;
            case 26 :
                // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1:217: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\1\uffff\4\22\6\uffff\1\22\4\uffff\2\40\4\uffff\1\43\1\44\1\45"+
        "\1\46\1\47\1\50\1\51\1\52\1\53\1\22\2\uffff\1\40\11\uffff\3\22\2"+
        "\61\1\uffff";
    static final String DFA11_eofS =
        "\62\uffff";
    static final String DFA11_minS =
        "\1\11\3\145\1\164\6\uffff\1\107\4\uffff\2\56\4\uffff\11\55\1\123"+
        "\2\uffff\1\56\11\uffff\2\60\1\63\2\55\1\uffff";
    static final String DFA11_maxS =
        "\1\175\3\156\1\164\6\uffff\1\107\4\uffff\1\56\1\71\4\uffff\11\172"+
        "\1\123\2\uffff\1\71\11\uffff\2\60\1\64\2\172\1\uffff";
    static final String DFA11_acceptS =
        "\5\uffff\1\11\1\12\1\13\1\14\1\15\1\16\1\uffff\1\21\1\22\1\23\1"+
        "\24\2\uffff\1\27\1\30\1\31\1\32\12\uffff\1\25\1\26\1\uffff\1\1\1"+
        "\4\1\2\1\5\1\7\1\20\1\3\1\6\1\10\5\uffff\1\17";
    static final String DFA11_specialS =
        "\62\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\25\1\24\2\uffff\1\24\22\uffff\1\25\1\uffff\1\23\1\17\7\uffff"+
            "\1\14\1\5\1\14\1\12\1\uffff\1\20\11\21\1\16\1\uffff\1\15\1\16"+
            "\1\15\2\uffff\3\22\1\13\26\22\1\10\1\uffff\1\11\3\uffff\1\1"+
            "\1\22\1\2\1\3\16\22\1\4\7\22\1\6\1\uffff\1\7",
            "\1\27\10\uffff\1\26",
            "\1\31\1\uffff\1\32\4\uffff\1\33\1\uffff\1\30",
            "\1\35\10\uffff\1\34",
            "\1\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\37",
            "",
            "",
            "",
            "",
            "\1\41",
            "\1\41\1\uffff\12\42",
            "",
            "",
            "",
            "",
            "\1\22\2\uffff\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32"+
            "\22",
            "\1\22\2\uffff\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32"+
            "\22",
            "\1\22\2\uffff\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32"+
            "\22",
            "\1\22\2\uffff\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32"+
            "\22",
            "\1\22\2\uffff\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32"+
            "\22",
            "\1\22\2\uffff\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32"+
            "\22",
            "\1\22\2\uffff\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32"+
            "\22",
            "\1\22\2\uffff\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32"+
            "\22",
            "\1\22\2\uffff\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32"+
            "\22",
            "\1\54",
            "",
            "",
            "\1\41\1\uffff\12\42",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\55",
            "\1\56",
            "\1\57\1\60",
            "\1\22\2\uffff\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32"+
            "\22",
            "\1\22\2\uffff\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32"+
            "\22",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | RULE_MAGIC | RULE_CL | RULE_OPERATOR | RULE_DIRECTION | RULE_ASSIGN | RULE_COMMENT | RULE_INT | RULE_REAL | RULE_WORD | RULE_STRING | RULE_EOL | RULE_WS );";
        }
    }
 

}