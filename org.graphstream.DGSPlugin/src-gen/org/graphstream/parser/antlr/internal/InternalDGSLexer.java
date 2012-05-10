package org.graphstream.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDGSLexer extends Lexer {
    public static final int RULE_ID=7;
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
    public static final int RULE_EOL=5;
    public static final int RULE_COMMENT=4;
    public static final int EOF=-1;
    public static final int RULE_ASSIGN=12;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int RULE_MAGIC=6;
    public static final int RULE_STRING=8;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_CL=10;
    public static final int T__14=14;
    public static final int RULE_INT=9;
    public static final int RULE_DIRECTION=11;
    public static final int RULE_WS=13;

    // delegates
    // delegators

    public InternalDGSLexer() {;} 
    public InternalDGSLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDGSLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:11:7: ( 'an' )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:11:9: 'an'
            {
            match("an"); 


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
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:12:7: ( 'cn' )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:12:9: 'cn'
            {
            match("cn"); 


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
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:13:7: ( 'dn' )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:13:9: 'dn'
            {
            match("dn"); 


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
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:14:7: ( 'ae' )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:14:9: 'ae'
            {
            match("ae"); 


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
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:15:7: ( 'ce' )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:15:9: 'ce'
            {
            match("ce"); 


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
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:16:7: ( 'de' )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:16:9: 'de'
            {
            match("de"); 


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
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:17:7: ( 'cg' )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:17:9: 'cg'
            {
            match("cg"); 


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
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:18:7: ( 'st' )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:18:9: 'st'
            {
            match("st"); 


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
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:19:7: ( '+' )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:19:9: '+'
            {
            match('+'); 

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
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:20:7: ( '-' )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:20:9: '-'
            {
            match('-'); 

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
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:21:7: ( ',' )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:21:9: ','
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
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:22:7: ( '{' )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:22:9: '{'
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
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:23:7: ( '}' )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:23:9: '}'
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
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:24:7: ( '[' )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:24:9: '['
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
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:25:7: ( ']' )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:25:9: ']'
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
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:26:7: ( '.' )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:26:9: '.'
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

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:27:7: ( '0' )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:27:9: '0'
            {
            match('0'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "RULE_MAGIC"
    public final void mRULE_MAGIC() throws RecognitionException {
        try {
            int _type = RULE_MAGIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1643:12: ( ( 'DGS003' | 'DGS004' ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1643:14: ( 'DGS003' | 'DGS004' )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1643:14: ( 'DGS003' | 'DGS004' )
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
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1643:15: 'DGS003'
                    {
                    match("DGS003"); 


                    }
                    break;
                case 2 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1643:24: 'DGS004'
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
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1645:9: ( 'cl' )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1645:11: 'cl'
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

    // $ANTLR start "RULE_DIRECTION"
    public final void mRULE_DIRECTION() throws RecognitionException {
        try {
            int _type = RULE_DIRECTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1647:16: ( ( '<' | '>' ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1647:18: ( '<' | '>' )
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
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1649:13: ( ( '=' | ':' ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1649:15: ( '=' | ':' )
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
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1651:14: ( '#' ( options {greedy=false; } : . )* RULE_EOL )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1651:16: '#' ( options {greedy=false; } : . )* RULE_EOL
            {
            match('#'); 
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1651:20: ( options {greedy=false; } : . )*
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
            	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1651:48: .
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
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1653:10: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1653:12: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1653:12: ( '0' | '1' .. '9' ( '0' .. '9' )* )
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
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1653:13: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1653:17: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1653:26: ( '0' .. '9' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1653:27: '0' .. '9'
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

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1655:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1655:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1655:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\\') ) {
                    alt5=1;
                }
                else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1655:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
            	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1655:65: ~ ( ( '\\\\' | '\"' ) )
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
            	    break loop5;
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

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1657:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+ )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1657:11: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1657:11: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_EOL"
    public final void mRULE_EOL() throws RecognitionException {
        try {
            int _type = RULE_EOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1659:10: ( ( '\\r' )? '\\n' )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1659:12: ( '\\r' )? '\\n'
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1659:12: ( '\\r' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\r') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1659:12: '\\r'
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
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1661:9: ( ( ' ' | '\\t' )+ )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1661:11: ( ' ' | '\\t' )+
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1661:11: ( ' ' | '\\t' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='\t'||LA8_0==' ') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:
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
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
        // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | RULE_MAGIC | RULE_CL | RULE_DIRECTION | RULE_ASSIGN | RULE_COMMENT | RULE_INT | RULE_STRING | RULE_ID | RULE_EOL | RULE_WS )
        int alt9=27;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1:112: RULE_MAGIC
                {
                mRULE_MAGIC(); 

                }
                break;
            case 19 :
                // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1:123: RULE_CL
                {
                mRULE_CL(); 

                }
                break;
            case 20 :
                // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1:131: RULE_DIRECTION
                {
                mRULE_DIRECTION(); 

                }
                break;
            case 21 :
                // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1:146: RULE_ASSIGN
                {
                mRULE_ASSIGN(); 

                }
                break;
            case 22 :
                // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1:158: RULE_COMMENT
                {
                mRULE_COMMENT(); 

                }
                break;
            case 23 :
                // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1:171: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 24 :
                // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1:180: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 25 :
                // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1:192: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 26 :
                // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1:200: RULE_EOL
                {
                mRULE_EOL(); 

                }
                break;
            case 27 :
                // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1:209: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\1\uffff\4\24\10\uffff\1\40\1\24\3\uffff\1\42\4\uffff\1\44\1\45"+
        "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\uffff\1\24\1\uffff\1\42\11"+
        "\uffff\3\24\2\62\1\uffff";
    static final String DFA9_eofS =
        "\63\uffff";
    static final String DFA9_minS =
        "\1\11\3\145\1\164\10\uffff\1\60\1\107\3\uffff\1\60\4\uffff\11\60"+
        "\1\uffff\1\123\1\uffff\1\60\11\uffff\2\60\1\63\2\60\1\uffff";
    static final String DFA9_maxS =
        "\1\175\3\156\1\164\10\uffff\1\172\1\107\3\uffff\1\172\4\uffff\11"+
        "\172\1\uffff\1\123\1\uffff\1\172\11\uffff\2\60\1\64\2\172\1\uffff";
    static final String DFA9_acceptS =
        "\5\uffff\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\2\uffff\1\24\1"+
        "\25\1\26\1\uffff\1\30\1\31\1\32\1\33\11\uffff\1\21\1\uffff\1\27"+
        "\1\uffff\1\1\1\4\1\2\1\5\1\7\1\23\1\3\1\6\1\10\5\uffff\1\22";
    static final String DFA9_specialS =
        "\63\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\26\1\25\2\uffff\1\25\22\uffff\1\26\1\uffff\1\23\1\21\7\uffff"+
            "\1\5\1\7\1\6\1\14\1\uffff\1\15\11\22\1\20\1\uffff\1\17\1\20"+
            "\1\17\2\uffff\3\24\1\16\26\24\1\12\1\uffff\1\13\3\uffff\1\1"+
            "\1\24\1\2\1\3\16\24\1\4\7\24\1\10\1\uffff\1\11",
            "\1\30\10\uffff\1\27",
            "\1\32\1\uffff\1\33\4\uffff\1\34\1\uffff\1\31",
            "\1\36\10\uffff\1\35",
            "\1\37",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\24\7\uffff\32\24\6\uffff\32\24",
            "\1\41",
            "",
            "",
            "",
            "\12\43\7\uffff\32\24\6\uffff\32\24",
            "",
            "",
            "",
            "",
            "\12\24\7\uffff\32\24\6\uffff\32\24",
            "\12\24\7\uffff\32\24\6\uffff\32\24",
            "\12\24\7\uffff\32\24\6\uffff\32\24",
            "\12\24\7\uffff\32\24\6\uffff\32\24",
            "\12\24\7\uffff\32\24\6\uffff\32\24",
            "\12\24\7\uffff\32\24\6\uffff\32\24",
            "\12\24\7\uffff\32\24\6\uffff\32\24",
            "\12\24\7\uffff\32\24\6\uffff\32\24",
            "\12\24\7\uffff\32\24\6\uffff\32\24",
            "",
            "\1\55",
            "",
            "\12\43\7\uffff\32\24\6\uffff\32\24",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\56",
            "\1\57",
            "\1\60\1\61",
            "\12\24\7\uffff\32\24\6\uffff\32\24",
            "\12\24\7\uffff\32\24\6\uffff\32\24",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | RULE_MAGIC | RULE_CL | RULE_DIRECTION | RULE_ASSIGN | RULE_COMMENT | RULE_INT | RULE_STRING | RULE_ID | RULE_EOL | RULE_WS );";
        }
    }
 

}