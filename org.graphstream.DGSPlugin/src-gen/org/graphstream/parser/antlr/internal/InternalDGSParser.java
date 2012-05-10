package org.graphstream.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.graphstream.services.DGSGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDGSParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_COMMENT", "RULE_EOL", "RULE_MAGIC", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_CL", "RULE_DIRECTION", "RULE_ASSIGN", "RULE_WS", "'an'", "'cn'", "'dn'", "'ae'", "'ce'", "'de'", "'cg'", "'st'", "'+'", "'-'", "','", "'{'", "'}'", "'['", "']'", "'.'", "'0'"
    };
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


        public InternalDGSParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDGSParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDGSParser.tokenNames; }
    public String getGrammarFileName() { return "../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g"; }



     	private DGSGrammarAccess grammarAccess;
     	
        public InternalDGSParser(TokenStream input, DGSGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Dgs";	
       	}
       	
       	@Override
       	protected DGSGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDgs"
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:67:1: entryRuleDgs returns [EObject current=null] : iv_ruleDgs= ruleDgs EOF ;
    public final EObject entryRuleDgs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDgs = null;


        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:68:2: (iv_ruleDgs= ruleDgs EOF )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:69:2: iv_ruleDgs= ruleDgs EOF
            {
             newCompositeNode(grammarAccess.getDgsRule()); 
            pushFollow(FOLLOW_ruleDgs_in_entryRuleDgs75);
            iv_ruleDgs=ruleDgs();

            state._fsp--;

             current =iv_ruleDgs; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDgs85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDgs"


    // $ANTLR start "ruleDgs"
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:76:1: ruleDgs returns [EObject current=null] : ( ( (lv_header_0_0= ruleHeader ) ) ( ( (lv_event_1_0= ruleEvent ) ) | ( (lv_comment_2_0= RULE_COMMENT ) ) | this_EOL_3= RULE_EOL )* ) ;
    public final EObject ruleDgs() throws RecognitionException {
        EObject current = null;

        Token lv_comment_2_0=null;
        Token this_EOL_3=null;
        EObject lv_header_0_0 = null;

        EObject lv_event_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:79:28: ( ( ( (lv_header_0_0= ruleHeader ) ) ( ( (lv_event_1_0= ruleEvent ) ) | ( (lv_comment_2_0= RULE_COMMENT ) ) | this_EOL_3= RULE_EOL )* ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:80:1: ( ( (lv_header_0_0= ruleHeader ) ) ( ( (lv_event_1_0= ruleEvent ) ) | ( (lv_comment_2_0= RULE_COMMENT ) ) | this_EOL_3= RULE_EOL )* )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:80:1: ( ( (lv_header_0_0= ruleHeader ) ) ( ( (lv_event_1_0= ruleEvent ) ) | ( (lv_comment_2_0= RULE_COMMENT ) ) | this_EOL_3= RULE_EOL )* )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:80:2: ( (lv_header_0_0= ruleHeader ) ) ( ( (lv_event_1_0= ruleEvent ) ) | ( (lv_comment_2_0= RULE_COMMENT ) ) | this_EOL_3= RULE_EOL )*
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:80:2: ( (lv_header_0_0= ruleHeader ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:81:1: (lv_header_0_0= ruleHeader )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:81:1: (lv_header_0_0= ruleHeader )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:82:3: lv_header_0_0= ruleHeader
            {
             
            	        newCompositeNode(grammarAccess.getDgsAccess().getHeaderHeaderParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleHeader_in_ruleDgs131);
            lv_header_0_0=ruleHeader();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDgsRule());
            	        }
                   		set(
                   			current, 
                   			"header",
                    		lv_header_0_0, 
                    		"Header");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:98:2: ( ( (lv_event_1_0= ruleEvent ) ) | ( (lv_comment_2_0= RULE_COMMENT ) ) | this_EOL_3= RULE_EOL )*
            loop1:
            do {
                int alt1=4;
                switch ( input.LA(1) ) {
                case RULE_CL:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                    {
                    alt1=1;
                    }
                    break;
                case RULE_COMMENT:
                    {
                    alt1=2;
                    }
                    break;
                case RULE_EOL:
                    {
                    alt1=3;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:98:3: ( (lv_event_1_0= ruleEvent ) )
            	    {
            	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:98:3: ( (lv_event_1_0= ruleEvent ) )
            	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:99:1: (lv_event_1_0= ruleEvent )
            	    {
            	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:99:1: (lv_event_1_0= ruleEvent )
            	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:100:3: lv_event_1_0= ruleEvent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDgsAccess().getEventEventParserRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEvent_in_ruleDgs153);
            	    lv_event_1_0=ruleEvent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDgsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"event",
            	            		lv_event_1_0, 
            	            		"Event");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:117:6: ( (lv_comment_2_0= RULE_COMMENT ) )
            	    {
            	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:117:6: ( (lv_comment_2_0= RULE_COMMENT ) )
            	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:118:1: (lv_comment_2_0= RULE_COMMENT )
            	    {
            	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:118:1: (lv_comment_2_0= RULE_COMMENT )
            	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:119:3: lv_comment_2_0= RULE_COMMENT
            	    {
            	    lv_comment_2_0=(Token)match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_ruleDgs176); 

            	    			newLeafNode(lv_comment_2_0, grammarAccess.getDgsAccess().getCommentCOMMENTTerminalRuleCall_1_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDgsRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"comment",
            	            		lv_comment_2_0, 
            	            		"COMMENT");
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:136:6: this_EOL_3= RULE_EOL
            	    {
            	    this_EOL_3=(Token)match(input,RULE_EOL,FOLLOW_RULE_EOL_in_ruleDgs198); 
            	     
            	        newLeafNode(this_EOL_3, grammarAccess.getDgsAccess().getEOLTerminalRuleCall_1_2()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDgs"


    // $ANTLR start "entryRuleHeader"
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:148:1: entryRuleHeader returns [EObject current=null] : iv_ruleHeader= ruleHeader EOF ;
    public final EObject entryRuleHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader = null;


        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:149:2: (iv_ruleHeader= ruleHeader EOF )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:150:2: iv_ruleHeader= ruleHeader EOF
            {
             newCompositeNode(grammarAccess.getHeaderRule()); 
            pushFollow(FOLLOW_ruleHeader_in_entryRuleHeader235);
            iv_ruleHeader=ruleHeader();

            state._fsp--;

             current =iv_ruleHeader; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeader245); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeader"


    // $ANTLR start "ruleHeader"
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:157:1: ruleHeader returns [EObject current=null] : ( ( (lv_magic_0_0= RULE_MAGIC ) ) this_EOL_1= RULE_EOL ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) ( (lv_numberOfSteps_3_0= RULE_INT ) ) ( (lv_numberOfEvents_4_0= RULE_INT ) ) this_EOL_5= RULE_EOL ) ;
    public final EObject ruleHeader() throws RecognitionException {
        EObject current = null;

        Token lv_magic_0_0=null;
        Token this_EOL_1=null;
        Token lv_name_2_1=null;
        Token lv_name_2_2=null;
        Token lv_numberOfSteps_3_0=null;
        Token lv_numberOfEvents_4_0=null;
        Token this_EOL_5=null;

         enterRule(); 
            
        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:160:28: ( ( ( (lv_magic_0_0= RULE_MAGIC ) ) this_EOL_1= RULE_EOL ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) ( (lv_numberOfSteps_3_0= RULE_INT ) ) ( (lv_numberOfEvents_4_0= RULE_INT ) ) this_EOL_5= RULE_EOL ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:161:1: ( ( (lv_magic_0_0= RULE_MAGIC ) ) this_EOL_1= RULE_EOL ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) ( (lv_numberOfSteps_3_0= RULE_INT ) ) ( (lv_numberOfEvents_4_0= RULE_INT ) ) this_EOL_5= RULE_EOL )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:161:1: ( ( (lv_magic_0_0= RULE_MAGIC ) ) this_EOL_1= RULE_EOL ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) ( (lv_numberOfSteps_3_0= RULE_INT ) ) ( (lv_numberOfEvents_4_0= RULE_INT ) ) this_EOL_5= RULE_EOL )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:161:2: ( (lv_magic_0_0= RULE_MAGIC ) ) this_EOL_1= RULE_EOL ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) ) ( (lv_numberOfSteps_3_0= RULE_INT ) ) ( (lv_numberOfEvents_4_0= RULE_INT ) ) this_EOL_5= RULE_EOL
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:161:2: ( (lv_magic_0_0= RULE_MAGIC ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:162:1: (lv_magic_0_0= RULE_MAGIC )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:162:1: (lv_magic_0_0= RULE_MAGIC )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:163:3: lv_magic_0_0= RULE_MAGIC
            {
            lv_magic_0_0=(Token)match(input,RULE_MAGIC,FOLLOW_RULE_MAGIC_in_ruleHeader287); 

            			newLeafNode(lv_magic_0_0, grammarAccess.getHeaderAccess().getMagicMAGICTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHeaderRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"magic",
                    		lv_magic_0_0, 
                    		"MAGIC");
            	    

            }


            }

            this_EOL_1=(Token)match(input,RULE_EOL,FOLLOW_RULE_EOL_in_ruleHeader303); 
             
                newLeafNode(this_EOL_1, grammarAccess.getHeaderAccess().getEOLTerminalRuleCall_1()); 
                
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:183:1: ( ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:184:1: ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:184:1: ( (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:185:1: (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:185:1: (lv_name_2_1= RULE_ID | lv_name_2_2= RULE_STRING )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_STRING) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:186:3: lv_name_2_1= RULE_ID
                    {
                    lv_name_2_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHeader321); 

                    			newLeafNode(lv_name_2_1, grammarAccess.getHeaderAccess().getNameIDTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getHeaderRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_1, 
                            		"ID");
                    	    

                    }
                    break;
                case 2 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:201:8: lv_name_2_2= RULE_STRING
                    {
                    lv_name_2_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHeader341); 

                    			newLeafNode(lv_name_2_2, grammarAccess.getHeaderAccess().getNameSTRINGTerminalRuleCall_2_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getHeaderRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_2, 
                            		"STRING");
                    	    

                    }
                    break;

            }


            }


            }

            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:219:2: ( (lv_numberOfSteps_3_0= RULE_INT ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:220:1: (lv_numberOfSteps_3_0= RULE_INT )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:220:1: (lv_numberOfSteps_3_0= RULE_INT )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:221:3: lv_numberOfSteps_3_0= RULE_INT
            {
            lv_numberOfSteps_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleHeader366); 

            			newLeafNode(lv_numberOfSteps_3_0, grammarAccess.getHeaderAccess().getNumberOfStepsINTTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHeaderRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"numberOfSteps",
                    		lv_numberOfSteps_3_0, 
                    		"INT");
            	    

            }


            }

            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:237:2: ( (lv_numberOfEvents_4_0= RULE_INT ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:238:1: (lv_numberOfEvents_4_0= RULE_INT )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:238:1: (lv_numberOfEvents_4_0= RULE_INT )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:239:3: lv_numberOfEvents_4_0= RULE_INT
            {
            lv_numberOfEvents_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleHeader388); 

            			newLeafNode(lv_numberOfEvents_4_0, grammarAccess.getHeaderAccess().getNumberOfEventsINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHeaderRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"numberOfEvents",
                    		lv_numberOfEvents_4_0, 
                    		"INT");
            	    

            }


            }

            this_EOL_5=(Token)match(input,RULE_EOL,FOLLOW_RULE_EOL_in_ruleHeader404); 
             
                newLeafNode(this_EOL_5, grammarAccess.getHeaderAccess().getEOLTerminalRuleCall_5()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeader"


    // $ANTLR start "entryRuleEvent"
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:267:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:268:2: (iv_ruleEvent= ruleEvent EOF )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:269:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent439);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent449); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:276:1: ruleEvent returns [EObject current=null] : ( ( ( (lv_an_0_0= ruleAn ) ) | ( (lv_cn_1_0= ruleCn ) ) | ( (lv_dn_2_0= ruleDn ) ) | ( (lv_ae_3_0= ruleAe ) ) | ( (lv_ce_4_0= ruleCe ) ) | ( (lv_de_5_0= ruleDe ) ) | ( (lv_cg_6_0= ruleCg ) ) | ( (lv_st_7_0= ruleSt ) ) | ( (lv_cl_8_0= RULE_CL ) ) ) ( ( (lv_comment_9_0= RULE_COMMENT ) ) | this_EOL_10= RULE_EOL ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_cl_8_0=null;
        Token lv_comment_9_0=null;
        Token this_EOL_10=null;
        EObject lv_an_0_0 = null;

        EObject lv_cn_1_0 = null;

        EObject lv_dn_2_0 = null;

        EObject lv_ae_3_0 = null;

        EObject lv_ce_4_0 = null;

        EObject lv_de_5_0 = null;

        EObject lv_cg_6_0 = null;

        EObject lv_st_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:279:28: ( ( ( ( (lv_an_0_0= ruleAn ) ) | ( (lv_cn_1_0= ruleCn ) ) | ( (lv_dn_2_0= ruleDn ) ) | ( (lv_ae_3_0= ruleAe ) ) | ( (lv_ce_4_0= ruleCe ) ) | ( (lv_de_5_0= ruleDe ) ) | ( (lv_cg_6_0= ruleCg ) ) | ( (lv_st_7_0= ruleSt ) ) | ( (lv_cl_8_0= RULE_CL ) ) ) ( ( (lv_comment_9_0= RULE_COMMENT ) ) | this_EOL_10= RULE_EOL ) ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:280:1: ( ( ( (lv_an_0_0= ruleAn ) ) | ( (lv_cn_1_0= ruleCn ) ) | ( (lv_dn_2_0= ruleDn ) ) | ( (lv_ae_3_0= ruleAe ) ) | ( (lv_ce_4_0= ruleCe ) ) | ( (lv_de_5_0= ruleDe ) ) | ( (lv_cg_6_0= ruleCg ) ) | ( (lv_st_7_0= ruleSt ) ) | ( (lv_cl_8_0= RULE_CL ) ) ) ( ( (lv_comment_9_0= RULE_COMMENT ) ) | this_EOL_10= RULE_EOL ) )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:280:1: ( ( ( (lv_an_0_0= ruleAn ) ) | ( (lv_cn_1_0= ruleCn ) ) | ( (lv_dn_2_0= ruleDn ) ) | ( (lv_ae_3_0= ruleAe ) ) | ( (lv_ce_4_0= ruleCe ) ) | ( (lv_de_5_0= ruleDe ) ) | ( (lv_cg_6_0= ruleCg ) ) | ( (lv_st_7_0= ruleSt ) ) | ( (lv_cl_8_0= RULE_CL ) ) ) ( ( (lv_comment_9_0= RULE_COMMENT ) ) | this_EOL_10= RULE_EOL ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:280:2: ( ( (lv_an_0_0= ruleAn ) ) | ( (lv_cn_1_0= ruleCn ) ) | ( (lv_dn_2_0= ruleDn ) ) | ( (lv_ae_3_0= ruleAe ) ) | ( (lv_ce_4_0= ruleCe ) ) | ( (lv_de_5_0= ruleDe ) ) | ( (lv_cg_6_0= ruleCg ) ) | ( (lv_st_7_0= ruleSt ) ) | ( (lv_cl_8_0= RULE_CL ) ) ) ( ( (lv_comment_9_0= RULE_COMMENT ) ) | this_EOL_10= RULE_EOL )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:280:2: ( ( (lv_an_0_0= ruleAn ) ) | ( (lv_cn_1_0= ruleCn ) ) | ( (lv_dn_2_0= ruleDn ) ) | ( (lv_ae_3_0= ruleAe ) ) | ( (lv_ce_4_0= ruleCe ) ) | ( (lv_de_5_0= ruleDe ) ) | ( (lv_cg_6_0= ruleCg ) ) | ( (lv_st_7_0= ruleSt ) ) | ( (lv_cl_8_0= RULE_CL ) ) )
            int alt3=9;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            case 17:
                {
                alt3=4;
                }
                break;
            case 18:
                {
                alt3=5;
                }
                break;
            case 19:
                {
                alt3=6;
                }
                break;
            case 20:
                {
                alt3=7;
                }
                break;
            case 21:
                {
                alt3=8;
                }
                break;
            case RULE_CL:
                {
                alt3=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:280:3: ( (lv_an_0_0= ruleAn ) )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:280:3: ( (lv_an_0_0= ruleAn ) )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:281:1: (lv_an_0_0= ruleAn )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:281:1: (lv_an_0_0= ruleAn )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:282:3: lv_an_0_0= ruleAn
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getAnAnParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAn_in_ruleEvent496);
                    lv_an_0_0=ruleAn();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	        }
                           		set(
                           			current, 
                           			"an",
                            		lv_an_0_0, 
                            		"An");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:299:6: ( (lv_cn_1_0= ruleCn ) )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:299:6: ( (lv_cn_1_0= ruleCn ) )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:300:1: (lv_cn_1_0= ruleCn )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:300:1: (lv_cn_1_0= ruleCn )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:301:3: lv_cn_1_0= ruleCn
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getCnCnParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCn_in_ruleEvent523);
                    lv_cn_1_0=ruleCn();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	        }
                           		set(
                           			current, 
                           			"cn",
                            		lv_cn_1_0, 
                            		"Cn");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:318:6: ( (lv_dn_2_0= ruleDn ) )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:318:6: ( (lv_dn_2_0= ruleDn ) )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:319:1: (lv_dn_2_0= ruleDn )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:319:1: (lv_dn_2_0= ruleDn )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:320:3: lv_dn_2_0= ruleDn
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getDnDnParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDn_in_ruleEvent550);
                    lv_dn_2_0=ruleDn();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	        }
                           		set(
                           			current, 
                           			"dn",
                            		lv_dn_2_0, 
                            		"Dn");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:337:6: ( (lv_ae_3_0= ruleAe ) )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:337:6: ( (lv_ae_3_0= ruleAe ) )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:338:1: (lv_ae_3_0= ruleAe )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:338:1: (lv_ae_3_0= ruleAe )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:339:3: lv_ae_3_0= ruleAe
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getAeAeParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAe_in_ruleEvent577);
                    lv_ae_3_0=ruleAe();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	        }
                           		set(
                           			current, 
                           			"ae",
                            		lv_ae_3_0, 
                            		"Ae");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:356:6: ( (lv_ce_4_0= ruleCe ) )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:356:6: ( (lv_ce_4_0= ruleCe ) )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:357:1: (lv_ce_4_0= ruleCe )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:357:1: (lv_ce_4_0= ruleCe )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:358:3: lv_ce_4_0= ruleCe
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getCeCeParserRuleCall_0_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCe_in_ruleEvent604);
                    lv_ce_4_0=ruleCe();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	        }
                           		set(
                           			current, 
                           			"ce",
                            		lv_ce_4_0, 
                            		"Ce");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:375:6: ( (lv_de_5_0= ruleDe ) )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:375:6: ( (lv_de_5_0= ruleDe ) )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:376:1: (lv_de_5_0= ruleDe )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:376:1: (lv_de_5_0= ruleDe )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:377:3: lv_de_5_0= ruleDe
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getDeDeParserRuleCall_0_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDe_in_ruleEvent631);
                    lv_de_5_0=ruleDe();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	        }
                           		set(
                           			current, 
                           			"de",
                            		lv_de_5_0, 
                            		"De");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:394:6: ( (lv_cg_6_0= ruleCg ) )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:394:6: ( (lv_cg_6_0= ruleCg ) )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:395:1: (lv_cg_6_0= ruleCg )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:395:1: (lv_cg_6_0= ruleCg )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:396:3: lv_cg_6_0= ruleCg
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getCgCgParserRuleCall_0_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCg_in_ruleEvent658);
                    lv_cg_6_0=ruleCg();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	        }
                           		set(
                           			current, 
                           			"cg",
                            		lv_cg_6_0, 
                            		"Cg");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 8 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:413:6: ( (lv_st_7_0= ruleSt ) )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:413:6: ( (lv_st_7_0= ruleSt ) )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:414:1: (lv_st_7_0= ruleSt )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:414:1: (lv_st_7_0= ruleSt )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:415:3: lv_st_7_0= ruleSt
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getStStParserRuleCall_0_7_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSt_in_ruleEvent685);
                    lv_st_7_0=ruleSt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEventRule());
                    	        }
                           		set(
                           			current, 
                           			"st",
                            		lv_st_7_0, 
                            		"St");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 9 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:432:6: ( (lv_cl_8_0= RULE_CL ) )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:432:6: ( (lv_cl_8_0= RULE_CL ) )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:433:1: (lv_cl_8_0= RULE_CL )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:433:1: (lv_cl_8_0= RULE_CL )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:434:3: lv_cl_8_0= RULE_CL
                    {
                    lv_cl_8_0=(Token)match(input,RULE_CL,FOLLOW_RULE_CL_in_ruleEvent708); 

                    			newLeafNode(lv_cl_8_0, grammarAccess.getEventAccess().getClClTerminalRuleCall_0_8_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEventRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"cl",
                            		lv_cl_8_0, 
                            		"Cl");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:450:3: ( ( (lv_comment_9_0= RULE_COMMENT ) ) | this_EOL_10= RULE_EOL )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_COMMENT) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_EOL) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:450:4: ( (lv_comment_9_0= RULE_COMMENT ) )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:450:4: ( (lv_comment_9_0= RULE_COMMENT ) )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:451:1: (lv_comment_9_0= RULE_COMMENT )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:451:1: (lv_comment_9_0= RULE_COMMENT )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:452:3: lv_comment_9_0= RULE_COMMENT
                    {
                    lv_comment_9_0=(Token)match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_ruleEvent732); 

                    			newLeafNode(lv_comment_9_0, grammarAccess.getEventAccess().getCommentCOMMENTTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEventRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"comment",
                            		lv_comment_9_0, 
                            		"COMMENT");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:469:6: this_EOL_10= RULE_EOL
                    {
                    this_EOL_10=(Token)match(input,RULE_EOL,FOLLOW_RULE_EOL_in_ruleEvent754); 
                     
                        newLeafNode(this_EOL_10, grammarAccess.getEventAccess().getEOLTerminalRuleCall_1_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleAn"
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:481:1: entryRuleAn returns [EObject current=null] : iv_ruleAn= ruleAn EOF ;
    public final EObject entryRuleAn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAn = null;


        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:482:2: (iv_ruleAn= ruleAn EOF )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:483:2: iv_ruleAn= ruleAn EOF
            {
             newCompositeNode(grammarAccess.getAnRule()); 
            pushFollow(FOLLOW_ruleAn_in_entryRuleAn790);
            iv_ruleAn=ruleAn();

            state._fsp--;

             current =iv_ruleAn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAn800); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAn"


    // $ANTLR start "ruleAn"
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:490:1: ruleAn returns [EObject current=null] : (otherlv_0= 'an' ( ( (lv_idNode_1_1= RULE_ID | lv_idNode_1_2= RULE_STRING ) ) ) ( (lv_attributes_2_0= ruleAttributes ) ) ) ;
    public final EObject ruleAn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_idNode_1_1=null;
        Token lv_idNode_1_2=null;
        EObject lv_attributes_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:493:28: ( (otherlv_0= 'an' ( ( (lv_idNode_1_1= RULE_ID | lv_idNode_1_2= RULE_STRING ) ) ) ( (lv_attributes_2_0= ruleAttributes ) ) ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:494:1: (otherlv_0= 'an' ( ( (lv_idNode_1_1= RULE_ID | lv_idNode_1_2= RULE_STRING ) ) ) ( (lv_attributes_2_0= ruleAttributes ) ) )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:494:1: (otherlv_0= 'an' ( ( (lv_idNode_1_1= RULE_ID | lv_idNode_1_2= RULE_STRING ) ) ) ( (lv_attributes_2_0= ruleAttributes ) ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:494:3: otherlv_0= 'an' ( ( (lv_idNode_1_1= RULE_ID | lv_idNode_1_2= RULE_STRING ) ) ) ( (lv_attributes_2_0= ruleAttributes ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleAn837); 

                	newLeafNode(otherlv_0, grammarAccess.getAnAccess().getAnKeyword_0());
                
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:498:1: ( ( (lv_idNode_1_1= RULE_ID | lv_idNode_1_2= RULE_STRING ) ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:499:1: ( (lv_idNode_1_1= RULE_ID | lv_idNode_1_2= RULE_STRING ) )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:499:1: ( (lv_idNode_1_1= RULE_ID | lv_idNode_1_2= RULE_STRING ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:500:1: (lv_idNode_1_1= RULE_ID | lv_idNode_1_2= RULE_STRING )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:500:1: (lv_idNode_1_1= RULE_ID | lv_idNode_1_2= RULE_STRING )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_STRING) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:501:3: lv_idNode_1_1= RULE_ID
                    {
                    lv_idNode_1_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAn856); 

                    			newLeafNode(lv_idNode_1_1, grammarAccess.getAnAccess().getIdNodeIDTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAnRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"idNode",
                            		lv_idNode_1_1, 
                            		"ID");
                    	    

                    }
                    break;
                case 2 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:516:8: lv_idNode_1_2= RULE_STRING
                    {
                    lv_idNode_1_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAn876); 

                    			newLeafNode(lv_idNode_1_2, grammarAccess.getAnAccess().getIdNodeSTRINGTerminalRuleCall_1_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAnRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"idNode",
                            		lv_idNode_1_2, 
                            		"STRING");
                    	    

                    }
                    break;

            }


            }


            }

            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:534:2: ( (lv_attributes_2_0= ruleAttributes ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:535:1: (lv_attributes_2_0= ruleAttributes )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:535:1: (lv_attributes_2_0= ruleAttributes )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:536:3: lv_attributes_2_0= ruleAttributes
            {
             
            	        newCompositeNode(grammarAccess.getAnAccess().getAttributesAttributesParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAttributes_in_ruleAn905);
            lv_attributes_2_0=ruleAttributes();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAnRule());
            	        }
                   		set(
                   			current, 
                   			"attributes",
                    		lv_attributes_2_0, 
                    		"Attributes");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAn"


    // $ANTLR start "entryRuleCn"
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:560:1: entryRuleCn returns [EObject current=null] : iv_ruleCn= ruleCn EOF ;
    public final EObject entryRuleCn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCn = null;


        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:561:2: (iv_ruleCn= ruleCn EOF )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:562:2: iv_ruleCn= ruleCn EOF
            {
             newCompositeNode(grammarAccess.getCnRule()); 
            pushFollow(FOLLOW_ruleCn_in_entryRuleCn941);
            iv_ruleCn=ruleCn();

            state._fsp--;

             current =iv_ruleCn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCn951); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCn"


    // $ANTLR start "ruleCn"
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:569:1: ruleCn returns [EObject current=null] : (otherlv_0= 'cn' ( ( (lv_idNode_1_1= RULE_ID | lv_idNode_1_2= RULE_STRING ) ) ) ( (lv_attributes_2_0= ruleAttributes ) ) ) ;
    public final EObject ruleCn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_idNode_1_1=null;
        Token lv_idNode_1_2=null;
        EObject lv_attributes_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:572:28: ( (otherlv_0= 'cn' ( ( (lv_idNode_1_1= RULE_ID | lv_idNode_1_2= RULE_STRING ) ) ) ( (lv_attributes_2_0= ruleAttributes ) ) ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:573:1: (otherlv_0= 'cn' ( ( (lv_idNode_1_1= RULE_ID | lv_idNode_1_2= RULE_STRING ) ) ) ( (lv_attributes_2_0= ruleAttributes ) ) )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:573:1: (otherlv_0= 'cn' ( ( (lv_idNode_1_1= RULE_ID | lv_idNode_1_2= RULE_STRING ) ) ) ( (lv_attributes_2_0= ruleAttributes ) ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:573:3: otherlv_0= 'cn' ( ( (lv_idNode_1_1= RULE_ID | lv_idNode_1_2= RULE_STRING ) ) ) ( (lv_attributes_2_0= ruleAttributes ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleCn988); 

                	newLeafNode(otherlv_0, grammarAccess.getCnAccess().getCnKeyword_0());
                
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:577:1: ( ( (lv_idNode_1_1= RULE_ID | lv_idNode_1_2= RULE_STRING ) ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:578:1: ( (lv_idNode_1_1= RULE_ID | lv_idNode_1_2= RULE_STRING ) )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:578:1: ( (lv_idNode_1_1= RULE_ID | lv_idNode_1_2= RULE_STRING ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:579:1: (lv_idNode_1_1= RULE_ID | lv_idNode_1_2= RULE_STRING )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:579:1: (lv_idNode_1_1= RULE_ID | lv_idNode_1_2= RULE_STRING )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_STRING) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:580:3: lv_idNode_1_1= RULE_ID
                    {
                    lv_idNode_1_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCn1007); 

                    			newLeafNode(lv_idNode_1_1, grammarAccess.getCnAccess().getIdNodeIDTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCnRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"idNode",
                            		lv_idNode_1_1, 
                            		"ID");
                    	    

                    }
                    break;
                case 2 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:595:8: lv_idNode_1_2= RULE_STRING
                    {
                    lv_idNode_1_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCn1027); 

                    			newLeafNode(lv_idNode_1_2, grammarAccess.getCnAccess().getIdNodeSTRINGTerminalRuleCall_1_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCnRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"idNode",
                            		lv_idNode_1_2, 
                            		"STRING");
                    	    

                    }
                    break;

            }


            }


            }

            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:613:2: ( (lv_attributes_2_0= ruleAttributes ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:614:1: (lv_attributes_2_0= ruleAttributes )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:614:1: (lv_attributes_2_0= ruleAttributes )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:615:3: lv_attributes_2_0= ruleAttributes
            {
             
            	        newCompositeNode(grammarAccess.getCnAccess().getAttributesAttributesParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAttributes_in_ruleCn1056);
            lv_attributes_2_0=ruleAttributes();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCnRule());
            	        }
                   		set(
                   			current, 
                   			"attributes",
                    		lv_attributes_2_0, 
                    		"Attributes");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCn"


    // $ANTLR start "entryRuleDn"
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:639:1: entryRuleDn returns [EObject current=null] : iv_ruleDn= ruleDn EOF ;
    public final EObject entryRuleDn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDn = null;


        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:640:2: (iv_ruleDn= ruleDn EOF )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:641:2: iv_ruleDn= ruleDn EOF
            {
             newCompositeNode(grammarAccess.getDnRule()); 
            pushFollow(FOLLOW_ruleDn_in_entryRuleDn1092);
            iv_ruleDn=ruleDn();

            state._fsp--;

             current =iv_ruleDn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDn1102); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDn"


    // $ANTLR start "ruleDn"
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:648:1: ruleDn returns [EObject current=null] : (otherlv_0= 'dn' ( ( (lv_idNode_1_1= RULE_ID | lv_idNode_1_2= RULE_STRING ) ) ) ) ;
    public final EObject ruleDn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_idNode_1_1=null;
        Token lv_idNode_1_2=null;

         enterRule(); 
            
        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:651:28: ( (otherlv_0= 'dn' ( ( (lv_idNode_1_1= RULE_ID | lv_idNode_1_2= RULE_STRING ) ) ) ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:652:1: (otherlv_0= 'dn' ( ( (lv_idNode_1_1= RULE_ID | lv_idNode_1_2= RULE_STRING ) ) ) )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:652:1: (otherlv_0= 'dn' ( ( (lv_idNode_1_1= RULE_ID | lv_idNode_1_2= RULE_STRING ) ) ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:652:3: otherlv_0= 'dn' ( ( (lv_idNode_1_1= RULE_ID | lv_idNode_1_2= RULE_STRING ) ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleDn1139); 

                	newLeafNode(otherlv_0, grammarAccess.getDnAccess().getDnKeyword_0());
                
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:656:1: ( ( (lv_idNode_1_1= RULE_ID | lv_idNode_1_2= RULE_STRING ) ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:657:1: ( (lv_idNode_1_1= RULE_ID | lv_idNode_1_2= RULE_STRING ) )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:657:1: ( (lv_idNode_1_1= RULE_ID | lv_idNode_1_2= RULE_STRING ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:658:1: (lv_idNode_1_1= RULE_ID | lv_idNode_1_2= RULE_STRING )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:658:1: (lv_idNode_1_1= RULE_ID | lv_idNode_1_2= RULE_STRING )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_STRING) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:659:3: lv_idNode_1_1= RULE_ID
                    {
                    lv_idNode_1_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDn1158); 

                    			newLeafNode(lv_idNode_1_1, grammarAccess.getDnAccess().getIdNodeIDTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDnRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"idNode",
                            		lv_idNode_1_1, 
                            		"ID");
                    	    

                    }
                    break;
                case 2 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:674:8: lv_idNode_1_2= RULE_STRING
                    {
                    lv_idNode_1_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDn1178); 

                    			newLeafNode(lv_idNode_1_2, grammarAccess.getDnAccess().getIdNodeSTRINGTerminalRuleCall_1_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDnRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"idNode",
                            		lv_idNode_1_2, 
                            		"STRING");
                    	    

                    }
                    break;

            }


            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDn"


    // $ANTLR start "entryRuleAe"
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:700:1: entryRuleAe returns [EObject current=null] : iv_ruleAe= ruleAe EOF ;
    public final EObject entryRuleAe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAe = null;


        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:701:2: (iv_ruleAe= ruleAe EOF )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:702:2: iv_ruleAe= ruleAe EOF
            {
             newCompositeNode(grammarAccess.getAeRule()); 
            pushFollow(FOLLOW_ruleAe_in_entryRuleAe1222);
            iv_ruleAe=ruleAe();

            state._fsp--;

             current =iv_ruleAe; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAe1232); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAe"


    // $ANTLR start "ruleAe"
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:709:1: ruleAe returns [EObject current=null] : (otherlv_0= 'ae' ( ( (lv_idEdge_1_1= RULE_ID | lv_idEdge_1_2= RULE_STRING ) ) ) ( ( (lv_idNode1_2_1= RULE_ID | lv_idNode1_2_2= RULE_STRING ) ) ) ( (lv_direction_3_0= RULE_DIRECTION ) )? ( ( (lv_idNode2_4_1= RULE_ID | lv_idNode2_4_2= RULE_STRING ) ) ) ( (lv_attributes_5_0= ruleAttributes ) ) ) ;
    public final EObject ruleAe() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_idEdge_1_1=null;
        Token lv_idEdge_1_2=null;
        Token lv_idNode1_2_1=null;
        Token lv_idNode1_2_2=null;
        Token lv_direction_3_0=null;
        Token lv_idNode2_4_1=null;
        Token lv_idNode2_4_2=null;
        EObject lv_attributes_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:712:28: ( (otherlv_0= 'ae' ( ( (lv_idEdge_1_1= RULE_ID | lv_idEdge_1_2= RULE_STRING ) ) ) ( ( (lv_idNode1_2_1= RULE_ID | lv_idNode1_2_2= RULE_STRING ) ) ) ( (lv_direction_3_0= RULE_DIRECTION ) )? ( ( (lv_idNode2_4_1= RULE_ID | lv_idNode2_4_2= RULE_STRING ) ) ) ( (lv_attributes_5_0= ruleAttributes ) ) ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:713:1: (otherlv_0= 'ae' ( ( (lv_idEdge_1_1= RULE_ID | lv_idEdge_1_2= RULE_STRING ) ) ) ( ( (lv_idNode1_2_1= RULE_ID | lv_idNode1_2_2= RULE_STRING ) ) ) ( (lv_direction_3_0= RULE_DIRECTION ) )? ( ( (lv_idNode2_4_1= RULE_ID | lv_idNode2_4_2= RULE_STRING ) ) ) ( (lv_attributes_5_0= ruleAttributes ) ) )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:713:1: (otherlv_0= 'ae' ( ( (lv_idEdge_1_1= RULE_ID | lv_idEdge_1_2= RULE_STRING ) ) ) ( ( (lv_idNode1_2_1= RULE_ID | lv_idNode1_2_2= RULE_STRING ) ) ) ( (lv_direction_3_0= RULE_DIRECTION ) )? ( ( (lv_idNode2_4_1= RULE_ID | lv_idNode2_4_2= RULE_STRING ) ) ) ( (lv_attributes_5_0= ruleAttributes ) ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:713:3: otherlv_0= 'ae' ( ( (lv_idEdge_1_1= RULE_ID | lv_idEdge_1_2= RULE_STRING ) ) ) ( ( (lv_idNode1_2_1= RULE_ID | lv_idNode1_2_2= RULE_STRING ) ) ) ( (lv_direction_3_0= RULE_DIRECTION ) )? ( ( (lv_idNode2_4_1= RULE_ID | lv_idNode2_4_2= RULE_STRING ) ) ) ( (lv_attributes_5_0= ruleAttributes ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleAe1269); 

                	newLeafNode(otherlv_0, grammarAccess.getAeAccess().getAeKeyword_0());
                
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:717:1: ( ( (lv_idEdge_1_1= RULE_ID | lv_idEdge_1_2= RULE_STRING ) ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:718:1: ( (lv_idEdge_1_1= RULE_ID | lv_idEdge_1_2= RULE_STRING ) )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:718:1: ( (lv_idEdge_1_1= RULE_ID | lv_idEdge_1_2= RULE_STRING ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:719:1: (lv_idEdge_1_1= RULE_ID | lv_idEdge_1_2= RULE_STRING )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:719:1: (lv_idEdge_1_1= RULE_ID | lv_idEdge_1_2= RULE_STRING )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_STRING) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:720:3: lv_idEdge_1_1= RULE_ID
                    {
                    lv_idEdge_1_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAe1288); 

                    			newLeafNode(lv_idEdge_1_1, grammarAccess.getAeAccess().getIdEdgeIDTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"idEdge",
                            		lv_idEdge_1_1, 
                            		"ID");
                    	    

                    }
                    break;
                case 2 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:735:8: lv_idEdge_1_2= RULE_STRING
                    {
                    lv_idEdge_1_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAe1308); 

                    			newLeafNode(lv_idEdge_1_2, grammarAccess.getAeAccess().getIdEdgeSTRINGTerminalRuleCall_1_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"idEdge",
                            		lv_idEdge_1_2, 
                            		"STRING");
                    	    

                    }
                    break;

            }


            }


            }

            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:753:2: ( ( (lv_idNode1_2_1= RULE_ID | lv_idNode1_2_2= RULE_STRING ) ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:754:1: ( (lv_idNode1_2_1= RULE_ID | lv_idNode1_2_2= RULE_STRING ) )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:754:1: ( (lv_idNode1_2_1= RULE_ID | lv_idNode1_2_2= RULE_STRING ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:755:1: (lv_idNode1_2_1= RULE_ID | lv_idNode1_2_2= RULE_STRING )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:755:1: (lv_idNode1_2_1= RULE_ID | lv_idNode1_2_2= RULE_STRING )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_STRING) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:756:3: lv_idNode1_2_1= RULE_ID
                    {
                    lv_idNode1_2_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAe1335); 

                    			newLeafNode(lv_idNode1_2_1, grammarAccess.getAeAccess().getIdNode1IDTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"idNode1",
                            		lv_idNode1_2_1, 
                            		"ID");
                    	    

                    }
                    break;
                case 2 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:771:8: lv_idNode1_2_2= RULE_STRING
                    {
                    lv_idNode1_2_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAe1355); 

                    			newLeafNode(lv_idNode1_2_2, grammarAccess.getAeAccess().getIdNode1STRINGTerminalRuleCall_2_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"idNode1",
                            		lv_idNode1_2_2, 
                            		"STRING");
                    	    

                    }
                    break;

            }


            }


            }

            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:789:2: ( (lv_direction_3_0= RULE_DIRECTION ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_DIRECTION) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:790:1: (lv_direction_3_0= RULE_DIRECTION )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:790:1: (lv_direction_3_0= RULE_DIRECTION )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:791:3: lv_direction_3_0= RULE_DIRECTION
                    {
                    lv_direction_3_0=(Token)match(input,RULE_DIRECTION,FOLLOW_RULE_DIRECTION_in_ruleAe1380); 

                    			newLeafNode(lv_direction_3_0, grammarAccess.getAeAccess().getDirectionDIRECTIONTerminalRuleCall_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"direction",
                            		lv_direction_3_0, 
                            		"DIRECTION");
                    	    

                    }


                    }
                    break;

            }

            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:807:3: ( ( (lv_idNode2_4_1= RULE_ID | lv_idNode2_4_2= RULE_STRING ) ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:808:1: ( (lv_idNode2_4_1= RULE_ID | lv_idNode2_4_2= RULE_STRING ) )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:808:1: ( (lv_idNode2_4_1= RULE_ID | lv_idNode2_4_2= RULE_STRING ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:809:1: (lv_idNode2_4_1= RULE_ID | lv_idNode2_4_2= RULE_STRING )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:809:1: (lv_idNode2_4_1= RULE_ID | lv_idNode2_4_2= RULE_STRING )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_STRING) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:810:3: lv_idNode2_4_1= RULE_ID
                    {
                    lv_idNode2_4_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAe1405); 

                    			newLeafNode(lv_idNode2_4_1, grammarAccess.getAeAccess().getIdNode2IDTerminalRuleCall_4_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"idNode2",
                            		lv_idNode2_4_1, 
                            		"ID");
                    	    

                    }
                    break;
                case 2 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:825:8: lv_idNode2_4_2= RULE_STRING
                    {
                    lv_idNode2_4_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAe1425); 

                    			newLeafNode(lv_idNode2_4_2, grammarAccess.getAeAccess().getIdNode2STRINGTerminalRuleCall_4_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"idNode2",
                            		lv_idNode2_4_2, 
                            		"STRING");
                    	    

                    }
                    break;

            }


            }


            }

            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:843:2: ( (lv_attributes_5_0= ruleAttributes ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:844:1: (lv_attributes_5_0= ruleAttributes )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:844:1: (lv_attributes_5_0= ruleAttributes )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:845:3: lv_attributes_5_0= ruleAttributes
            {
             
            	        newCompositeNode(grammarAccess.getAeAccess().getAttributesAttributesParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleAttributes_in_ruleAe1454);
            lv_attributes_5_0=ruleAttributes();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAeRule());
            	        }
                   		set(
                   			current, 
                   			"attributes",
                    		lv_attributes_5_0, 
                    		"Attributes");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAe"


    // $ANTLR start "entryRuleCe"
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:869:1: entryRuleCe returns [EObject current=null] : iv_ruleCe= ruleCe EOF ;
    public final EObject entryRuleCe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCe = null;


        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:870:2: (iv_ruleCe= ruleCe EOF )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:871:2: iv_ruleCe= ruleCe EOF
            {
             newCompositeNode(grammarAccess.getCeRule()); 
            pushFollow(FOLLOW_ruleCe_in_entryRuleCe1490);
            iv_ruleCe=ruleCe();

            state._fsp--;

             current =iv_ruleCe; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCe1500); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCe"


    // $ANTLR start "ruleCe"
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:878:1: ruleCe returns [EObject current=null] : (otherlv_0= 'ce' ( ( (lv_idNode_1_1= RULE_ID | lv_idNode_1_2= RULE_STRING ) ) ) ( (lv_attributes_2_0= ruleAttributes ) ) ) ;
    public final EObject ruleCe() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_idNode_1_1=null;
        Token lv_idNode_1_2=null;
        EObject lv_attributes_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:881:28: ( (otherlv_0= 'ce' ( ( (lv_idNode_1_1= RULE_ID | lv_idNode_1_2= RULE_STRING ) ) ) ( (lv_attributes_2_0= ruleAttributes ) ) ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:882:1: (otherlv_0= 'ce' ( ( (lv_idNode_1_1= RULE_ID | lv_idNode_1_2= RULE_STRING ) ) ) ( (lv_attributes_2_0= ruleAttributes ) ) )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:882:1: (otherlv_0= 'ce' ( ( (lv_idNode_1_1= RULE_ID | lv_idNode_1_2= RULE_STRING ) ) ) ( (lv_attributes_2_0= ruleAttributes ) ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:882:3: otherlv_0= 'ce' ( ( (lv_idNode_1_1= RULE_ID | lv_idNode_1_2= RULE_STRING ) ) ) ( (lv_attributes_2_0= ruleAttributes ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleCe1537); 

                	newLeafNode(otherlv_0, grammarAccess.getCeAccess().getCeKeyword_0());
                
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:886:1: ( ( (lv_idNode_1_1= RULE_ID | lv_idNode_1_2= RULE_STRING ) ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:887:1: ( (lv_idNode_1_1= RULE_ID | lv_idNode_1_2= RULE_STRING ) )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:887:1: ( (lv_idNode_1_1= RULE_ID | lv_idNode_1_2= RULE_STRING ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:888:1: (lv_idNode_1_1= RULE_ID | lv_idNode_1_2= RULE_STRING )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:888:1: (lv_idNode_1_1= RULE_ID | lv_idNode_1_2= RULE_STRING )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_STRING) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:889:3: lv_idNode_1_1= RULE_ID
                    {
                    lv_idNode_1_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCe1556); 

                    			newLeafNode(lv_idNode_1_1, grammarAccess.getCeAccess().getIdNodeIDTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"idNode",
                            		lv_idNode_1_1, 
                            		"ID");
                    	    

                    }
                    break;
                case 2 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:904:8: lv_idNode_1_2= RULE_STRING
                    {
                    lv_idNode_1_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCe1576); 

                    			newLeafNode(lv_idNode_1_2, grammarAccess.getCeAccess().getIdNodeSTRINGTerminalRuleCall_1_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"idNode",
                            		lv_idNode_1_2, 
                            		"STRING");
                    	    

                    }
                    break;

            }


            }


            }

            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:922:2: ( (lv_attributes_2_0= ruleAttributes ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:923:1: (lv_attributes_2_0= ruleAttributes )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:923:1: (lv_attributes_2_0= ruleAttributes )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:924:3: lv_attributes_2_0= ruleAttributes
            {
             
            	        newCompositeNode(grammarAccess.getCeAccess().getAttributesAttributesParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAttributes_in_ruleCe1605);
            lv_attributes_2_0=ruleAttributes();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCeRule());
            	        }
                   		set(
                   			current, 
                   			"attributes",
                    		lv_attributes_2_0, 
                    		"Attributes");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCe"


    // $ANTLR start "entryRuleDe"
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:948:1: entryRuleDe returns [EObject current=null] : iv_ruleDe= ruleDe EOF ;
    public final EObject entryRuleDe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDe = null;


        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:949:2: (iv_ruleDe= ruleDe EOF )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:950:2: iv_ruleDe= ruleDe EOF
            {
             newCompositeNode(grammarAccess.getDeRule()); 
            pushFollow(FOLLOW_ruleDe_in_entryRuleDe1641);
            iv_ruleDe=ruleDe();

            state._fsp--;

             current =iv_ruleDe; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDe1651); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDe"


    // $ANTLR start "ruleDe"
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:957:1: ruleDe returns [EObject current=null] : (otherlv_0= 'de' ( ( (lv_idEdge_1_1= RULE_ID | lv_idEdge_1_2= RULE_STRING ) ) ) ) ;
    public final EObject ruleDe() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_idEdge_1_1=null;
        Token lv_idEdge_1_2=null;

         enterRule(); 
            
        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:960:28: ( (otherlv_0= 'de' ( ( (lv_idEdge_1_1= RULE_ID | lv_idEdge_1_2= RULE_STRING ) ) ) ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:961:1: (otherlv_0= 'de' ( ( (lv_idEdge_1_1= RULE_ID | lv_idEdge_1_2= RULE_STRING ) ) ) )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:961:1: (otherlv_0= 'de' ( ( (lv_idEdge_1_1= RULE_ID | lv_idEdge_1_2= RULE_STRING ) ) ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:961:3: otherlv_0= 'de' ( ( (lv_idEdge_1_1= RULE_ID | lv_idEdge_1_2= RULE_STRING ) ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleDe1688); 

                	newLeafNode(otherlv_0, grammarAccess.getDeAccess().getDeKeyword_0());
                
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:965:1: ( ( (lv_idEdge_1_1= RULE_ID | lv_idEdge_1_2= RULE_STRING ) ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:966:1: ( (lv_idEdge_1_1= RULE_ID | lv_idEdge_1_2= RULE_STRING ) )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:966:1: ( (lv_idEdge_1_1= RULE_ID | lv_idEdge_1_2= RULE_STRING ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:967:1: (lv_idEdge_1_1= RULE_ID | lv_idEdge_1_2= RULE_STRING )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:967:1: (lv_idEdge_1_1= RULE_ID | lv_idEdge_1_2= RULE_STRING )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_STRING) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:968:3: lv_idEdge_1_1= RULE_ID
                    {
                    lv_idEdge_1_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDe1707); 

                    			newLeafNode(lv_idEdge_1_1, grammarAccess.getDeAccess().getIdEdgeIDTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"idEdge",
                            		lv_idEdge_1_1, 
                            		"ID");
                    	    

                    }
                    break;
                case 2 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:983:8: lv_idEdge_1_2= RULE_STRING
                    {
                    lv_idEdge_1_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDe1727); 

                    			newLeafNode(lv_idEdge_1_2, grammarAccess.getDeAccess().getIdEdgeSTRINGTerminalRuleCall_1_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"idEdge",
                            		lv_idEdge_1_2, 
                            		"STRING");
                    	    

                    }
                    break;

            }


            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDe"


    // $ANTLR start "entryRuleCg"
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1009:1: entryRuleCg returns [EObject current=null] : iv_ruleCg= ruleCg EOF ;
    public final EObject entryRuleCg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCg = null;


        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1010:2: (iv_ruleCg= ruleCg EOF )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1011:2: iv_ruleCg= ruleCg EOF
            {
             newCompositeNode(grammarAccess.getCgRule()); 
            pushFollow(FOLLOW_ruleCg_in_entryRuleCg1771);
            iv_ruleCg=ruleCg();

            state._fsp--;

             current =iv_ruleCg; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCg1781); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCg"


    // $ANTLR start "ruleCg"
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1018:1: ruleCg returns [EObject current=null] : (otherlv_0= 'cg' ( (lv_attributes_1_0= ruleAttributes ) ) ) ;
    public final EObject ruleCg() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_attributes_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1021:28: ( (otherlv_0= 'cg' ( (lv_attributes_1_0= ruleAttributes ) ) ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1022:1: (otherlv_0= 'cg' ( (lv_attributes_1_0= ruleAttributes ) ) )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1022:1: (otherlv_0= 'cg' ( (lv_attributes_1_0= ruleAttributes ) ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1022:3: otherlv_0= 'cg' ( (lv_attributes_1_0= ruleAttributes ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleCg1818); 

                	newLeafNode(otherlv_0, grammarAccess.getCgAccess().getCgKeyword_0());
                
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1026:1: ( (lv_attributes_1_0= ruleAttributes ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1027:1: (lv_attributes_1_0= ruleAttributes )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1027:1: (lv_attributes_1_0= ruleAttributes )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1028:3: lv_attributes_1_0= ruleAttributes
            {
             
            	        newCompositeNode(grammarAccess.getCgAccess().getAttributesAttributesParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAttributes_in_ruleCg1839);
            lv_attributes_1_0=ruleAttributes();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCgRule());
            	        }
                   		set(
                   			current, 
                   			"attributes",
                    		lv_attributes_1_0, 
                    		"Attributes");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCg"


    // $ANTLR start "entryRuleSt"
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1052:1: entryRuleSt returns [EObject current=null] : iv_ruleSt= ruleSt EOF ;
    public final EObject entryRuleSt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSt = null;


        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1053:2: (iv_ruleSt= ruleSt EOF )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1054:2: iv_ruleSt= ruleSt EOF
            {
             newCompositeNode(grammarAccess.getStRule()); 
            pushFollow(FOLLOW_ruleSt_in_entryRuleSt1875);
            iv_ruleSt=ruleSt();

            state._fsp--;

             current =iv_ruleSt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSt1885); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSt"


    // $ANTLR start "ruleSt"
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1061:1: ruleSt returns [EObject current=null] : (otherlv_0= 'st' ( (lv_real_1_0= ruleReal ) ) ) ;
    public final EObject ruleSt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_real_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1064:28: ( (otherlv_0= 'st' ( (lv_real_1_0= ruleReal ) ) ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1065:1: (otherlv_0= 'st' ( (lv_real_1_0= ruleReal ) ) )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1065:1: (otherlv_0= 'st' ( (lv_real_1_0= ruleReal ) ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1065:3: otherlv_0= 'st' ( (lv_real_1_0= ruleReal ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleSt1922); 

                	newLeafNode(otherlv_0, grammarAccess.getStAccess().getStKeyword_0());
                
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1069:1: ( (lv_real_1_0= ruleReal ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1070:1: (lv_real_1_0= ruleReal )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1070:1: (lv_real_1_0= ruleReal )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1071:3: lv_real_1_0= ruleReal
            {
             
            	        newCompositeNode(grammarAccess.getStAccess().getRealRealParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleReal_in_ruleSt1943);
            lv_real_1_0=ruleReal();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStRule());
            	        }
                   		set(
                   			current, 
                   			"real",
                    		lv_real_1_0, 
                    		"Real");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSt"


    // $ANTLR start "entryRuleAttributes"
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1095:1: entryRuleAttributes returns [EObject current=null] : iv_ruleAttributes= ruleAttributes EOF ;
    public final EObject entryRuleAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributes = null;


        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1096:2: (iv_ruleAttributes= ruleAttributes EOF )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1097:2: iv_ruleAttributes= ruleAttributes EOF
            {
             newCompositeNode(grammarAccess.getAttributesRule()); 
            pushFollow(FOLLOW_ruleAttributes_in_entryRuleAttributes1979);
            iv_ruleAttributes=ruleAttributes();

            state._fsp--;

             current =iv_ruleAttributes; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributes1989); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributes"


    // $ANTLR start "ruleAttributes"
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1104:1: ruleAttributes returns [EObject current=null] : ( () ( (lv_attribute_1_0= ruleAttribute ) )* ) ;
    public final EObject ruleAttributes() throws RecognitionException {
        EObject current = null;

        EObject lv_attribute_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1107:28: ( ( () ( (lv_attribute_1_0= ruleAttribute ) )* ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1108:1: ( () ( (lv_attribute_1_0= ruleAttribute ) )* )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1108:1: ( () ( (lv_attribute_1_0= ruleAttribute ) )* )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1108:2: () ( (lv_attribute_1_0= ruleAttribute ) )*
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1108:2: ()
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1109:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAttributesAccess().getAttributesAction_0(),
                        current);
                

            }

            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1114:2: ( (lv_attribute_1_0= ruleAttribute ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_STRING)||(LA14_0>=22 && LA14_0<=23)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1115:1: (lv_attribute_1_0= ruleAttribute )
            	    {
            	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1115:1: (lv_attribute_1_0= ruleAttribute )
            	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1116:3: lv_attribute_1_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAttributesAccess().getAttributeAttributeParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleAttributes2044);
            	    lv_attribute_1_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAttributesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attribute",
            	            		lv_attribute_1_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributes"


    // $ANTLR start "entryRuleAttribute"
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1140:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1141:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1142:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute2081);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute2091); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1149:1: ruleAttribute returns [EObject current=null] : ( (otherlv_0= '+' | otherlv_1= '-' )? ( ( (lv_idAttribute_2_1= RULE_ID | lv_idAttribute_2_2= RULE_STRING ) ) ) ( ( (lv_assign_3_0= RULE_ASSIGN ) ) ( (lv_value_4_0= ruleValue ) ) (otherlv_5= ',' ( (lv_otherValues_6_0= ruleValue ) ) )* )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_idAttribute_2_1=null;
        Token lv_idAttribute_2_2=null;
        Token lv_assign_3_0=null;
        Token otherlv_5=null;
        EObject lv_value_4_0 = null;

        EObject lv_otherValues_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1152:28: ( ( (otherlv_0= '+' | otherlv_1= '-' )? ( ( (lv_idAttribute_2_1= RULE_ID | lv_idAttribute_2_2= RULE_STRING ) ) ) ( ( (lv_assign_3_0= RULE_ASSIGN ) ) ( (lv_value_4_0= ruleValue ) ) (otherlv_5= ',' ( (lv_otherValues_6_0= ruleValue ) ) )* )? ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1153:1: ( (otherlv_0= '+' | otherlv_1= '-' )? ( ( (lv_idAttribute_2_1= RULE_ID | lv_idAttribute_2_2= RULE_STRING ) ) ) ( ( (lv_assign_3_0= RULE_ASSIGN ) ) ( (lv_value_4_0= ruleValue ) ) (otherlv_5= ',' ( (lv_otherValues_6_0= ruleValue ) ) )* )? )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1153:1: ( (otherlv_0= '+' | otherlv_1= '-' )? ( ( (lv_idAttribute_2_1= RULE_ID | lv_idAttribute_2_2= RULE_STRING ) ) ) ( ( (lv_assign_3_0= RULE_ASSIGN ) ) ( (lv_value_4_0= ruleValue ) ) (otherlv_5= ',' ( (lv_otherValues_6_0= ruleValue ) ) )* )? )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1153:2: (otherlv_0= '+' | otherlv_1= '-' )? ( ( (lv_idAttribute_2_1= RULE_ID | lv_idAttribute_2_2= RULE_STRING ) ) ) ( ( (lv_assign_3_0= RULE_ASSIGN ) ) ( (lv_value_4_0= ruleValue ) ) (otherlv_5= ',' ( (lv_otherValues_6_0= ruleValue ) ) )* )?
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1153:2: (otherlv_0= '+' | otherlv_1= '-' )?
            int alt15=3;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            else if ( (LA15_0==23) ) {
                alt15=2;
            }
            switch (alt15) {
                case 1 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1153:4: otherlv_0= '+'
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleAttribute2129); 

                        	newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getPlusSignKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1158:7: otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleAttribute2147); 

                        	newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getHyphenMinusKeyword_0_1());
                        

                    }
                    break;

            }

            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1162:3: ( ( (lv_idAttribute_2_1= RULE_ID | lv_idAttribute_2_2= RULE_STRING ) ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1163:1: ( (lv_idAttribute_2_1= RULE_ID | lv_idAttribute_2_2= RULE_STRING ) )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1163:1: ( (lv_idAttribute_2_1= RULE_ID | lv_idAttribute_2_2= RULE_STRING ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1164:1: (lv_idAttribute_2_1= RULE_ID | lv_idAttribute_2_2= RULE_STRING )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1164:1: (lv_idAttribute_2_1= RULE_ID | lv_idAttribute_2_2= RULE_STRING )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_STRING) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1165:3: lv_idAttribute_2_1= RULE_ID
                    {
                    lv_idAttribute_2_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute2168); 

                    			newLeafNode(lv_idAttribute_2_1, grammarAccess.getAttributeAccess().getIdAttributeIDTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"idAttribute",
                            		lv_idAttribute_2_1, 
                            		"ID");
                    	    

                    }
                    break;
                case 2 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1180:8: lv_idAttribute_2_2= RULE_STRING
                    {
                    lv_idAttribute_2_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAttribute2188); 

                    			newLeafNode(lv_idAttribute_2_2, grammarAccess.getAttributeAccess().getIdAttributeSTRINGTerminalRuleCall_1_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"idAttribute",
                            		lv_idAttribute_2_2, 
                            		"STRING");
                    	    

                    }
                    break;

            }


            }


            }

            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1198:2: ( ( (lv_assign_3_0= RULE_ASSIGN ) ) ( (lv_value_4_0= ruleValue ) ) (otherlv_5= ',' ( (lv_otherValues_6_0= ruleValue ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ASSIGN) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1198:3: ( (lv_assign_3_0= RULE_ASSIGN ) ) ( (lv_value_4_0= ruleValue ) ) (otherlv_5= ',' ( (lv_otherValues_6_0= ruleValue ) ) )*
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1198:3: ( (lv_assign_3_0= RULE_ASSIGN ) )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1199:1: (lv_assign_3_0= RULE_ASSIGN )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1199:1: (lv_assign_3_0= RULE_ASSIGN )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1200:3: lv_assign_3_0= RULE_ASSIGN
                    {
                    lv_assign_3_0=(Token)match(input,RULE_ASSIGN,FOLLOW_RULE_ASSIGN_in_ruleAttribute2214); 

                    			newLeafNode(lv_assign_3_0, grammarAccess.getAttributeAccess().getAssignASSIGNTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"assign",
                            		lv_assign_3_0, 
                            		"ASSIGN");
                    	    

                    }


                    }

                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1216:2: ( (lv_value_4_0= ruleValue ) )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1217:1: (lv_value_4_0= ruleValue )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1217:1: (lv_value_4_0= ruleValue )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1218:3: lv_value_4_0= ruleValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeAccess().getValueValueParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValue_in_ruleAttribute2240);
                    lv_value_4_0=ruleValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttributeRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_4_0, 
                            		"Value");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1234:2: (otherlv_5= ',' ( (lv_otherValues_6_0= ruleValue ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==24) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1234:4: otherlv_5= ',' ( (lv_otherValues_6_0= ruleValue ) )
                    	    {
                    	    otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleAttribute2253); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1238:1: ( (lv_otherValues_6_0= ruleValue ) )
                    	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1239:1: (lv_otherValues_6_0= ruleValue )
                    	    {
                    	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1239:1: (lv_otherValues_6_0= ruleValue )
                    	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1240:3: lv_otherValues_6_0= ruleValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAttributeAccess().getOtherValuesValueParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleValue_in_ruleAttribute2274);
                    	    lv_otherValues_6_0=ruleValue();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAttributeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"otherValues",
                    	            		lv_otherValues_6_0, 
                    	            		"Value");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleValue"
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1264:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1265:2: (iv_ruleValue= ruleValue EOF )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1266:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue2314);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue2324); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1273:1: ruleValue returns [EObject current=null] : ( ( (lv_string_0_0= RULE_STRING ) ) | ( (lv_real_1_0= ruleReal ) ) | ( (lv_array_2_0= ruleArray ) ) | ( (lv_map_3_0= ruleMap ) ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token lv_string_0_0=null;
        AntlrDatatypeRuleToken lv_real_1_0 = null;

        EObject lv_array_2_0 = null;

        EObject lv_map_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1276:28: ( ( ( (lv_string_0_0= RULE_STRING ) ) | ( (lv_real_1_0= ruleReal ) ) | ( (lv_array_2_0= ruleArray ) ) | ( (lv_map_3_0= ruleMap ) ) ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1277:1: ( ( (lv_string_0_0= RULE_STRING ) ) | ( (lv_real_1_0= ruleReal ) ) | ( (lv_array_2_0= ruleArray ) ) | ( (lv_map_3_0= ruleMap ) ) )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1277:1: ( ( (lv_string_0_0= RULE_STRING ) ) | ( (lv_real_1_0= ruleReal ) ) | ( (lv_array_2_0= ruleArray ) ) | ( (lv_map_3_0= ruleMap ) ) )
            int alt19=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt19=1;
                }
                break;
            case RULE_INT:
                {
                alt19=2;
                }
                break;
            case 25:
                {
                alt19=3;
                }
                break;
            case 27:
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1277:2: ( (lv_string_0_0= RULE_STRING ) )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1277:2: ( (lv_string_0_0= RULE_STRING ) )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1278:1: (lv_string_0_0= RULE_STRING )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1278:1: (lv_string_0_0= RULE_STRING )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1279:3: lv_string_0_0= RULE_STRING
                    {
                    lv_string_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValue2366); 

                    			newLeafNode(lv_string_0_0, grammarAccess.getValueAccess().getStringSTRINGTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getValueRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"string",
                            		lv_string_0_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1296:6: ( (lv_real_1_0= ruleReal ) )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1296:6: ( (lv_real_1_0= ruleReal ) )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1297:1: (lv_real_1_0= ruleReal )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1297:1: (lv_real_1_0= ruleReal )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1298:3: lv_real_1_0= ruleReal
                    {
                     
                    	        newCompositeNode(grammarAccess.getValueAccess().getRealRealParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleReal_in_ruleValue2398);
                    lv_real_1_0=ruleReal();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getValueRule());
                    	        }
                           		set(
                           			current, 
                           			"real",
                            		lv_real_1_0, 
                            		"Real");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1315:6: ( (lv_array_2_0= ruleArray ) )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1315:6: ( (lv_array_2_0= ruleArray ) )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1316:1: (lv_array_2_0= ruleArray )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1316:1: (lv_array_2_0= ruleArray )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1317:3: lv_array_2_0= ruleArray
                    {
                     
                    	        newCompositeNode(grammarAccess.getValueAccess().getArrayArrayParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArray_in_ruleValue2425);
                    lv_array_2_0=ruleArray();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getValueRule());
                    	        }
                           		set(
                           			current, 
                           			"array",
                            		lv_array_2_0, 
                            		"Array");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1334:6: ( (lv_map_3_0= ruleMap ) )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1334:6: ( (lv_map_3_0= ruleMap ) )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1335:1: (lv_map_3_0= ruleMap )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1335:1: (lv_map_3_0= ruleMap )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1336:3: lv_map_3_0= ruleMap
                    {
                     
                    	        newCompositeNode(grammarAccess.getValueAccess().getMapMapParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMap_in_ruleValue2452);
                    lv_map_3_0=ruleMap();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getValueRule());
                    	        }
                           		set(
                           			current, 
                           			"map",
                            		lv_map_3_0, 
                            		"Map");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleArray"
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1360:1: entryRuleArray returns [EObject current=null] : iv_ruleArray= ruleArray EOF ;
    public final EObject entryRuleArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArray = null;


        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1361:2: (iv_ruleArray= ruleArray EOF )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1362:2: iv_ruleArray= ruleArray EOF
            {
             newCompositeNode(grammarAccess.getArrayRule()); 
            pushFollow(FOLLOW_ruleArray_in_entryRuleArray2488);
            iv_ruleArray=ruleArray();

            state._fsp--;

             current =iv_ruleArray; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArray2498); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArray"


    // $ANTLR start "ruleArray"
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1369:1: ruleArray returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_otherValues_4_0= ruleValue ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_otherValues_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1372:28: ( ( () otherlv_1= '{' ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_otherValues_4_0= ruleValue ) ) )* )? otherlv_5= '}' ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1373:1: ( () otherlv_1= '{' ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_otherValues_4_0= ruleValue ) ) )* )? otherlv_5= '}' )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1373:1: ( () otherlv_1= '{' ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_otherValues_4_0= ruleValue ) ) )* )? otherlv_5= '}' )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1373:2: () otherlv_1= '{' ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_otherValues_4_0= ruleValue ) ) )* )? otherlv_5= '}'
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1373:2: ()
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1374:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getArrayAccess().getArrayAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleArray2544); 

                	newLeafNode(otherlv_1, grammarAccess.getArrayAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1383:1: ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_otherValues_4_0= ruleValue ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_INT)||LA21_0==25||LA21_0==27) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1383:2: ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_otherValues_4_0= ruleValue ) ) )*
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1383:2: ( (lv_value_2_0= ruleValue ) )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1384:1: (lv_value_2_0= ruleValue )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1384:1: (lv_value_2_0= ruleValue )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1385:3: lv_value_2_0= ruleValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getArrayAccess().getValueValueParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValue_in_ruleArray2566);
                    lv_value_2_0=ruleValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArrayRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_2_0, 
                            		"Value");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1401:2: (otherlv_3= ',' ( (lv_otherValues_4_0= ruleValue ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==24) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1401:4: otherlv_3= ',' ( (lv_otherValues_4_0= ruleValue ) )
                    	    {
                    	    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleArray2579); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getArrayAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1405:1: ( (lv_otherValues_4_0= ruleValue ) )
                    	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1406:1: (lv_otherValues_4_0= ruleValue )
                    	    {
                    	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1406:1: (lv_otherValues_4_0= ruleValue )
                    	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1407:3: lv_otherValues_4_0= ruleValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getArrayAccess().getOtherValuesValueParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleValue_in_ruleArray2600);
                    	    lv_otherValues_4_0=ruleValue();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getArrayRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"otherValues",
                    	            		lv_otherValues_4_0, 
                    	            		"Value");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleArray2616); 

                	newLeafNode(otherlv_5, grammarAccess.getArrayAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArray"


    // $ANTLR start "entryRuleMap"
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1435:1: entryRuleMap returns [EObject current=null] : iv_ruleMap= ruleMap EOF ;
    public final EObject entryRuleMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMap = null;


        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1436:2: (iv_ruleMap= ruleMap EOF )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1437:2: iv_ruleMap= ruleMap EOF
            {
             newCompositeNode(grammarAccess.getMapRule()); 
            pushFollow(FOLLOW_ruleMap_in_entryRuleMap2652);
            iv_ruleMap=ruleMap();

            state._fsp--;

             current =iv_ruleMap; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMap2662); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMap"


    // $ANTLR start "ruleMap"
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1444:1: ruleMap returns [EObject current=null] : (otherlv_0= '[' ( (lv_mapping_1_0= ruleMapping ) ) (otherlv_2= ',' ( (lv_otherMapping_3_0= ruleMapping ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleMap() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_mapping_1_0 = null;

        EObject lv_otherMapping_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1447:28: ( (otherlv_0= '[' ( (lv_mapping_1_0= ruleMapping ) ) (otherlv_2= ',' ( (lv_otherMapping_3_0= ruleMapping ) ) )* otherlv_4= ']' ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1448:1: (otherlv_0= '[' ( (lv_mapping_1_0= ruleMapping ) ) (otherlv_2= ',' ( (lv_otherMapping_3_0= ruleMapping ) ) )* otherlv_4= ']' )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1448:1: (otherlv_0= '[' ( (lv_mapping_1_0= ruleMapping ) ) (otherlv_2= ',' ( (lv_otherMapping_3_0= ruleMapping ) ) )* otherlv_4= ']' )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1448:3: otherlv_0= '[' ( (lv_mapping_1_0= ruleMapping ) ) (otherlv_2= ',' ( (lv_otherMapping_3_0= ruleMapping ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleMap2699); 

                	newLeafNode(otherlv_0, grammarAccess.getMapAccess().getLeftSquareBracketKeyword_0());
                
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1452:1: ( (lv_mapping_1_0= ruleMapping ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1453:1: (lv_mapping_1_0= ruleMapping )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1453:1: (lv_mapping_1_0= ruleMapping )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1454:3: lv_mapping_1_0= ruleMapping
            {
             
            	        newCompositeNode(grammarAccess.getMapAccess().getMappingMappingParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleMapping_in_ruleMap2720);
            lv_mapping_1_0=ruleMapping();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMapRule());
            	        }
                   		set(
                   			current, 
                   			"mapping",
                    		lv_mapping_1_0, 
                    		"Mapping");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1470:2: (otherlv_2= ',' ( (lv_otherMapping_3_0= ruleMapping ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==24) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1470:4: otherlv_2= ',' ( (lv_otherMapping_3_0= ruleMapping ) )
            	    {
            	    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleMap2733); 

            	        	newLeafNode(otherlv_2, grammarAccess.getMapAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1474:1: ( (lv_otherMapping_3_0= ruleMapping ) )
            	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1475:1: (lv_otherMapping_3_0= ruleMapping )
            	    {
            	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1475:1: (lv_otherMapping_3_0= ruleMapping )
            	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1476:3: lv_otherMapping_3_0= ruleMapping
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMapAccess().getOtherMappingMappingParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMapping_in_ruleMap2754);
            	    lv_otherMapping_3_0=ruleMapping();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMapRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"otherMapping",
            	            		lv_otherMapping_3_0, 
            	            		"Mapping");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleMap2768); 

                	newLeafNode(otherlv_4, grammarAccess.getMapAccess().getRightSquareBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMap"


    // $ANTLR start "entryRuleMapping"
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1504:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1505:2: (iv_ruleMapping= ruleMapping EOF )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1506:2: iv_ruleMapping= ruleMapping EOF
            {
             newCompositeNode(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_ruleMapping_in_entryRuleMapping2804);
            iv_ruleMapping=ruleMapping();

            state._fsp--;

             current =iv_ruleMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapping2814); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapping"


    // $ANTLR start "ruleMapping"
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1513:1: ruleMapping returns [EObject current=null] : ( ( ( (lv_id_0_1= RULE_ID | lv_id_0_2= RULE_STRING ) ) ) ( (lv_assign_1_0= RULE_ASSIGN ) ) ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_1=null;
        Token lv_id_0_2=null;
        Token lv_assign_1_0=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1516:28: ( ( ( ( (lv_id_0_1= RULE_ID | lv_id_0_2= RULE_STRING ) ) ) ( (lv_assign_1_0= RULE_ASSIGN ) ) ( (lv_value_2_0= ruleValue ) ) ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1517:1: ( ( ( (lv_id_0_1= RULE_ID | lv_id_0_2= RULE_STRING ) ) ) ( (lv_assign_1_0= RULE_ASSIGN ) ) ( (lv_value_2_0= ruleValue ) ) )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1517:1: ( ( ( (lv_id_0_1= RULE_ID | lv_id_0_2= RULE_STRING ) ) ) ( (lv_assign_1_0= RULE_ASSIGN ) ) ( (lv_value_2_0= ruleValue ) ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1517:2: ( ( (lv_id_0_1= RULE_ID | lv_id_0_2= RULE_STRING ) ) ) ( (lv_assign_1_0= RULE_ASSIGN ) ) ( (lv_value_2_0= ruleValue ) )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1517:2: ( ( (lv_id_0_1= RULE_ID | lv_id_0_2= RULE_STRING ) ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1518:1: ( (lv_id_0_1= RULE_ID | lv_id_0_2= RULE_STRING ) )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1518:1: ( (lv_id_0_1= RULE_ID | lv_id_0_2= RULE_STRING ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1519:1: (lv_id_0_1= RULE_ID | lv_id_0_2= RULE_STRING )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1519:1: (lv_id_0_1= RULE_ID | lv_id_0_2= RULE_STRING )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_STRING) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1520:3: lv_id_0_1= RULE_ID
                    {
                    lv_id_0_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMapping2858); 

                    			newLeafNode(lv_id_0_1, grammarAccess.getMappingAccess().getIdIDTerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMappingRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_0_1, 
                            		"ID");
                    	    

                    }
                    break;
                case 2 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1535:8: lv_id_0_2= RULE_STRING
                    {
                    lv_id_0_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMapping2878); 

                    			newLeafNode(lv_id_0_2, grammarAccess.getMappingAccess().getIdSTRINGTerminalRuleCall_0_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMappingRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_0_2, 
                            		"STRING");
                    	    

                    }
                    break;

            }


            }


            }

            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1553:2: ( (lv_assign_1_0= RULE_ASSIGN ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1554:1: (lv_assign_1_0= RULE_ASSIGN )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1554:1: (lv_assign_1_0= RULE_ASSIGN )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1555:3: lv_assign_1_0= RULE_ASSIGN
            {
            lv_assign_1_0=(Token)match(input,RULE_ASSIGN,FOLLOW_RULE_ASSIGN_in_ruleMapping2903); 

            			newLeafNode(lv_assign_1_0, grammarAccess.getMappingAccess().getAssignASSIGNTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMappingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"assign",
                    		lv_assign_1_0, 
                    		"ASSIGN");
            	    

            }


            }

            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1571:2: ( (lv_value_2_0= ruleValue ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1572:1: (lv_value_2_0= ruleValue )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1572:1: (lv_value_2_0= ruleValue )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1573:3: lv_value_2_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getMappingAccess().getValueValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleMapping2929);
            lv_value_2_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMappingRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"Value");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleReal"
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1597:1: entryRuleReal returns [String current=null] : iv_ruleReal= ruleReal EOF ;
    public final String entryRuleReal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReal = null;


        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1598:2: (iv_ruleReal= ruleReal EOF )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1599:2: iv_ruleReal= ruleReal EOF
            {
             newCompositeNode(grammarAccess.getRealRule()); 
            pushFollow(FOLLOW_ruleReal_in_entryRuleReal2966);
            iv_ruleReal=ruleReal();

            state._fsp--;

             current =iv_ruleReal.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReal2977); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReal"


    // $ANTLR start "ruleReal"
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1606:1: ruleReal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' (kw= '0' )* this_INT_3= RULE_INT ) ) ;
    public final AntlrDatatypeRuleToken ruleReal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_3=null;

         enterRule(); 
            
        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1609:28: ( (this_INT_0= RULE_INT (kw= '.' (kw= '0' )* this_INT_3= RULE_INT ) ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1610:1: (this_INT_0= RULE_INT (kw= '.' (kw= '0' )* this_INT_3= RULE_INT ) )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1610:1: (this_INT_0= RULE_INT (kw= '.' (kw= '0' )* this_INT_3= RULE_INT ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1610:6: this_INT_0= RULE_INT (kw= '.' (kw= '0' )* this_INT_3= RULE_INT )
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleReal3017); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getRealAccess().getINTTerminalRuleCall_0()); 
                
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1617:1: (kw= '.' (kw= '0' )* this_INT_3= RULE_INT )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1618:2: kw= '.' (kw= '0' )* this_INT_3= RULE_INT
            {
            kw=(Token)match(input,29,FOLLOW_29_in_ruleReal3036); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getRealAccess().getFullStopKeyword_1_0()); 
                
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1623:1: (kw= '0' )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==30) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1624:2: kw= '0'
            	    {
            	    kw=(Token)match(input,30,FOLLOW_30_in_ruleReal3050); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getRealAccess().getDigitZeroKeyword_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleReal3067); 

            		current.merge(this_INT_3);
                
             
                newLeafNode(this_INT_3, grammarAccess.getRealAccess().getINTTerminalRuleCall_1_2()); 
                

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReal"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDgs_in_entryRuleDgs75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDgs85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeader_in_ruleDgs131 = new BitSet(new long[]{0x00000000003FC432L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleDgs153 = new BitSet(new long[]{0x00000000003FC432L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleDgs176 = new BitSet(new long[]{0x00000000003FC432L});
    public static final BitSet FOLLOW_RULE_EOL_in_ruleDgs198 = new BitSet(new long[]{0x00000000003FC432L});
    public static final BitSet FOLLOW_ruleHeader_in_entryRuleHeader235 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeader245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MAGIC_in_ruleHeader287 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_EOL_in_ruleHeader303 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHeader321 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHeader341 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleHeader366 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleHeader388 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_EOL_in_ruleHeader404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent439 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAn_in_ruleEvent496 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleCn_in_ruleEvent523 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleDn_in_ruleEvent550 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleAe_in_ruleEvent577 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleCe_in_ruleEvent604 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleDe_in_ruleEvent631 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleCg_in_ruleEvent658 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSt_in_ruleEvent685 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_CL_in_ruleEvent708 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleEvent732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EOL_in_ruleEvent754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAn_in_entryRuleAn790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAn800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleAn837 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAn856 = new BitSet(new long[]{0x0000000000C00180L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAn876 = new BitSet(new long[]{0x0000000000C00180L});
    public static final BitSet FOLLOW_ruleAttributes_in_ruleAn905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCn_in_entryRuleCn941 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCn951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleCn988 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCn1007 = new BitSet(new long[]{0x0000000000C00180L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCn1027 = new BitSet(new long[]{0x0000000000C00180L});
    public static final BitSet FOLLOW_ruleAttributes_in_ruleCn1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDn_in_entryRuleDn1092 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDn1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleDn1139 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDn1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDn1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAe_in_entryRuleAe1222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAe1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleAe1269 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAe1288 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAe1308 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAe1335 = new BitSet(new long[]{0x0000000000000980L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAe1355 = new BitSet(new long[]{0x0000000000000980L});
    public static final BitSet FOLLOW_RULE_DIRECTION_in_ruleAe1380 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAe1405 = new BitSet(new long[]{0x0000000000C00180L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAe1425 = new BitSet(new long[]{0x0000000000C00180L});
    public static final BitSet FOLLOW_ruleAttributes_in_ruleAe1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCe_in_entryRuleCe1490 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCe1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleCe1537 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCe1556 = new BitSet(new long[]{0x0000000000C00180L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCe1576 = new BitSet(new long[]{0x0000000000C00180L});
    public static final BitSet FOLLOW_ruleAttributes_in_ruleCe1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDe_in_entryRuleDe1641 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDe1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleDe1688 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDe1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDe1727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCg_in_entryRuleCg1771 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCg1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleCg1818 = new BitSet(new long[]{0x0000000000C00180L});
    public static final BitSet FOLLOW_ruleAttributes_in_ruleCg1839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSt_in_entryRuleSt1875 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSt1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleSt1922 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ruleReal_in_ruleSt1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributes_in_entryRuleAttributes1979 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributes1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleAttributes2044 = new BitSet(new long[]{0x0000000000C00182L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute2081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute2091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleAttribute2129 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_23_in_ruleAttribute2147 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute2168 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAttribute2188 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_RULE_ASSIGN_in_ruleAttribute2214 = new BitSet(new long[]{0x000000000A000300L});
    public static final BitSet FOLLOW_ruleValue_in_ruleAttribute2240 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleAttribute2253 = new BitSet(new long[]{0x000000000A000300L});
    public static final BitSet FOLLOW_ruleValue_in_ruleAttribute2274 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue2314 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue2324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValue2366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReal_in_ruleValue2398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_ruleValue2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMap_in_ruleValue2452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_entryRuleArray2488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArray2498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleArray2544 = new BitSet(new long[]{0x000000000E000300L});
    public static final BitSet FOLLOW_ruleValue_in_ruleArray2566 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_24_in_ruleArray2579 = new BitSet(new long[]{0x000000000A000300L});
    public static final BitSet FOLLOW_ruleValue_in_ruleArray2600 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_26_in_ruleArray2616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMap_in_entryRuleMap2652 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMap2662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleMap2699 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_ruleMapping_in_ruleMap2720 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_24_in_ruleMap2733 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_ruleMapping_in_ruleMap2754 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_28_in_ruleMap2768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_entryRuleMapping2804 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapping2814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMapping2858 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMapping2878 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_ASSIGN_in_ruleMapping2903 = new BitSet(new long[]{0x000000000A000300L});
    public static final BitSet FOLLOW_ruleValue_in_ruleMapping2929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReal_in_entryRuleReal2966 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReal2977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleReal3017 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleReal3036 = new BitSet(new long[]{0x0000000040000200L});
    public static final BitSet FOLLOW_30_in_ruleReal3050 = new BitSet(new long[]{0x0000000040000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleReal3067 = new BitSet(new long[]{0x0000000000000002L});

}