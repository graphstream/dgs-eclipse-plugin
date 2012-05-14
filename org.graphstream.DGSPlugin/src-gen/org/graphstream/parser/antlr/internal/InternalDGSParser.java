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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_COMMENT", "RULE_EOL", "RULE_MAGIC", "RULE_INT", "RULE_CL", "RULE_DIRECTION", "RULE_REAL", "RULE_OPERATOR", "RULE_ASSIGN", "RULE_STRING", "RULE_WORD", "RULE_WS", "'an'", "'cn'", "'dn'", "'ae'", "'ce'", "'de'", "'cg'", "'st'", "','", "'{'", "'}'", "'['", "']'", "'.'"
    };
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
    public static final int T__19=19;
    public static final int RULE_MAGIC=6;
    public static final int RULE_STRING=13;
    public static final int T__16=16;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_CL=8;
    public static final int RULE_INT=7;
    public static final int RULE_REAL=10;
    public static final int RULE_DIRECTION=9;
    public static final int RULE_OPERATOR=11;
    public static final int RULE_WS=15;
    public static final int RULE_WORD=14;

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
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
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
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:157:1: ruleHeader returns [EObject current=null] : ( ( (lv_magic_0_0= RULE_MAGIC ) ) this_EOL_1= RULE_EOL ( (lv_name_2_0= ruleId ) ) ( (lv_numberOfSteps_3_0= RULE_INT ) ) ( (lv_numberOfEvents_4_0= RULE_INT ) ) this_EOL_5= RULE_EOL ) ;
    public final EObject ruleHeader() throws RecognitionException {
        EObject current = null;

        Token lv_magic_0_0=null;
        Token this_EOL_1=null;
        Token lv_numberOfSteps_3_0=null;
        Token lv_numberOfEvents_4_0=null;
        Token this_EOL_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:160:28: ( ( ( (lv_magic_0_0= RULE_MAGIC ) ) this_EOL_1= RULE_EOL ( (lv_name_2_0= ruleId ) ) ( (lv_numberOfSteps_3_0= RULE_INT ) ) ( (lv_numberOfEvents_4_0= RULE_INT ) ) this_EOL_5= RULE_EOL ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:161:1: ( ( (lv_magic_0_0= RULE_MAGIC ) ) this_EOL_1= RULE_EOL ( (lv_name_2_0= ruleId ) ) ( (lv_numberOfSteps_3_0= RULE_INT ) ) ( (lv_numberOfEvents_4_0= RULE_INT ) ) this_EOL_5= RULE_EOL )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:161:1: ( ( (lv_magic_0_0= RULE_MAGIC ) ) this_EOL_1= RULE_EOL ( (lv_name_2_0= ruleId ) ) ( (lv_numberOfSteps_3_0= RULE_INT ) ) ( (lv_numberOfEvents_4_0= RULE_INT ) ) this_EOL_5= RULE_EOL )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:161:2: ( (lv_magic_0_0= RULE_MAGIC ) ) this_EOL_1= RULE_EOL ( (lv_name_2_0= ruleId ) ) ( (lv_numberOfSteps_3_0= RULE_INT ) ) ( (lv_numberOfEvents_4_0= RULE_INT ) ) this_EOL_5= RULE_EOL
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
                
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:183:1: ( (lv_name_2_0= ruleId ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:184:1: (lv_name_2_0= ruleId )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:184:1: (lv_name_2_0= ruleId )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:185:3: lv_name_2_0= ruleId
            {
             
            	        newCompositeNode(grammarAccess.getHeaderAccess().getNameIdParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleId_in_ruleHeader323);
            lv_name_2_0=ruleId();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getHeaderRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"Id");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:201:2: ( (lv_numberOfSteps_3_0= RULE_INT ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:202:1: (lv_numberOfSteps_3_0= RULE_INT )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:202:1: (lv_numberOfSteps_3_0= RULE_INT )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:203:3: lv_numberOfSteps_3_0= RULE_INT
            {
            lv_numberOfSteps_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleHeader340); 

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

            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:219:2: ( (lv_numberOfEvents_4_0= RULE_INT ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:220:1: (lv_numberOfEvents_4_0= RULE_INT )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:220:1: (lv_numberOfEvents_4_0= RULE_INT )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:221:3: lv_numberOfEvents_4_0= RULE_INT
            {
            lv_numberOfEvents_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleHeader362); 

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

            this_EOL_5=(Token)match(input,RULE_EOL,FOLLOW_RULE_EOL_in_ruleHeader378); 
             
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
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:249:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:250:2: (iv_ruleEvent= ruleEvent EOF )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:251:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent413);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent423); 

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
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:258:1: ruleEvent returns [EObject current=null] : ( ( ( (lv_an_0_0= ruleAn ) ) | ( (lv_cn_1_0= ruleCn ) ) | ( (lv_dn_2_0= ruleDn ) ) | ( (lv_ae_3_0= ruleAe ) ) | ( (lv_ce_4_0= ruleCe ) ) | ( (lv_de_5_0= ruleDe ) ) | ( (lv_cg_6_0= ruleCg ) ) | ( (lv_st_7_0= ruleSt ) ) | ( (lv_cl_8_0= RULE_CL ) ) ) ( ( (lv_comment_9_0= RULE_COMMENT ) ) | this_EOL_10= RULE_EOL ) ) ;
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
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:261:28: ( ( ( ( (lv_an_0_0= ruleAn ) ) | ( (lv_cn_1_0= ruleCn ) ) | ( (lv_dn_2_0= ruleDn ) ) | ( (lv_ae_3_0= ruleAe ) ) | ( (lv_ce_4_0= ruleCe ) ) | ( (lv_de_5_0= ruleDe ) ) | ( (lv_cg_6_0= ruleCg ) ) | ( (lv_st_7_0= ruleSt ) ) | ( (lv_cl_8_0= RULE_CL ) ) ) ( ( (lv_comment_9_0= RULE_COMMENT ) ) | this_EOL_10= RULE_EOL ) ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:262:1: ( ( ( (lv_an_0_0= ruleAn ) ) | ( (lv_cn_1_0= ruleCn ) ) | ( (lv_dn_2_0= ruleDn ) ) | ( (lv_ae_3_0= ruleAe ) ) | ( (lv_ce_4_0= ruleCe ) ) | ( (lv_de_5_0= ruleDe ) ) | ( (lv_cg_6_0= ruleCg ) ) | ( (lv_st_7_0= ruleSt ) ) | ( (lv_cl_8_0= RULE_CL ) ) ) ( ( (lv_comment_9_0= RULE_COMMENT ) ) | this_EOL_10= RULE_EOL ) )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:262:1: ( ( ( (lv_an_0_0= ruleAn ) ) | ( (lv_cn_1_0= ruleCn ) ) | ( (lv_dn_2_0= ruleDn ) ) | ( (lv_ae_3_0= ruleAe ) ) | ( (lv_ce_4_0= ruleCe ) ) | ( (lv_de_5_0= ruleDe ) ) | ( (lv_cg_6_0= ruleCg ) ) | ( (lv_st_7_0= ruleSt ) ) | ( (lv_cl_8_0= RULE_CL ) ) ) ( ( (lv_comment_9_0= RULE_COMMENT ) ) | this_EOL_10= RULE_EOL ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:262:2: ( ( (lv_an_0_0= ruleAn ) ) | ( (lv_cn_1_0= ruleCn ) ) | ( (lv_dn_2_0= ruleDn ) ) | ( (lv_ae_3_0= ruleAe ) ) | ( (lv_ce_4_0= ruleCe ) ) | ( (lv_de_5_0= ruleDe ) ) | ( (lv_cg_6_0= ruleCg ) ) | ( (lv_st_7_0= ruleSt ) ) | ( (lv_cl_8_0= RULE_CL ) ) ) ( ( (lv_comment_9_0= RULE_COMMENT ) ) | this_EOL_10= RULE_EOL )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:262:2: ( ( (lv_an_0_0= ruleAn ) ) | ( (lv_cn_1_0= ruleCn ) ) | ( (lv_dn_2_0= ruleDn ) ) | ( (lv_ae_3_0= ruleAe ) ) | ( (lv_ce_4_0= ruleCe ) ) | ( (lv_de_5_0= ruleDe ) ) | ( (lv_cg_6_0= ruleCg ) ) | ( (lv_st_7_0= ruleSt ) ) | ( (lv_cl_8_0= RULE_CL ) ) )
            int alt2=9;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt2=1;
                }
                break;
            case 17:
                {
                alt2=2;
                }
                break;
            case 18:
                {
                alt2=3;
                }
                break;
            case 19:
                {
                alt2=4;
                }
                break;
            case 20:
                {
                alt2=5;
                }
                break;
            case 21:
                {
                alt2=6;
                }
                break;
            case 22:
                {
                alt2=7;
                }
                break;
            case 23:
                {
                alt2=8;
                }
                break;
            case RULE_CL:
                {
                alt2=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:262:3: ( (lv_an_0_0= ruleAn ) )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:262:3: ( (lv_an_0_0= ruleAn ) )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:263:1: (lv_an_0_0= ruleAn )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:263:1: (lv_an_0_0= ruleAn )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:264:3: lv_an_0_0= ruleAn
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getAnAnParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAn_in_ruleEvent470);
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
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:281:6: ( (lv_cn_1_0= ruleCn ) )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:281:6: ( (lv_cn_1_0= ruleCn ) )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:282:1: (lv_cn_1_0= ruleCn )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:282:1: (lv_cn_1_0= ruleCn )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:283:3: lv_cn_1_0= ruleCn
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getCnCnParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCn_in_ruleEvent497);
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
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:300:6: ( (lv_dn_2_0= ruleDn ) )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:300:6: ( (lv_dn_2_0= ruleDn ) )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:301:1: (lv_dn_2_0= ruleDn )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:301:1: (lv_dn_2_0= ruleDn )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:302:3: lv_dn_2_0= ruleDn
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getDnDnParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDn_in_ruleEvent524);
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
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:319:6: ( (lv_ae_3_0= ruleAe ) )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:319:6: ( (lv_ae_3_0= ruleAe ) )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:320:1: (lv_ae_3_0= ruleAe )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:320:1: (lv_ae_3_0= ruleAe )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:321:3: lv_ae_3_0= ruleAe
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getAeAeParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAe_in_ruleEvent551);
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
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:338:6: ( (lv_ce_4_0= ruleCe ) )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:338:6: ( (lv_ce_4_0= ruleCe ) )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:339:1: (lv_ce_4_0= ruleCe )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:339:1: (lv_ce_4_0= ruleCe )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:340:3: lv_ce_4_0= ruleCe
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getCeCeParserRuleCall_0_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCe_in_ruleEvent578);
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
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:357:6: ( (lv_de_5_0= ruleDe ) )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:357:6: ( (lv_de_5_0= ruleDe ) )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:358:1: (lv_de_5_0= ruleDe )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:358:1: (lv_de_5_0= ruleDe )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:359:3: lv_de_5_0= ruleDe
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getDeDeParserRuleCall_0_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDe_in_ruleEvent605);
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
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:376:6: ( (lv_cg_6_0= ruleCg ) )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:376:6: ( (lv_cg_6_0= ruleCg ) )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:377:1: (lv_cg_6_0= ruleCg )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:377:1: (lv_cg_6_0= ruleCg )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:378:3: lv_cg_6_0= ruleCg
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getCgCgParserRuleCall_0_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCg_in_ruleEvent632);
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
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:395:6: ( (lv_st_7_0= ruleSt ) )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:395:6: ( (lv_st_7_0= ruleSt ) )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:396:1: (lv_st_7_0= ruleSt )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:396:1: (lv_st_7_0= ruleSt )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:397:3: lv_st_7_0= ruleSt
                    {
                     
                    	        newCompositeNode(grammarAccess.getEventAccess().getStStParserRuleCall_0_7_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSt_in_ruleEvent659);
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
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:414:6: ( (lv_cl_8_0= RULE_CL ) )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:414:6: ( (lv_cl_8_0= RULE_CL ) )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:415:1: (lv_cl_8_0= RULE_CL )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:415:1: (lv_cl_8_0= RULE_CL )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:416:3: lv_cl_8_0= RULE_CL
                    {
                    lv_cl_8_0=(Token)match(input,RULE_CL,FOLLOW_RULE_CL_in_ruleEvent682); 

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

            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:432:3: ( ( (lv_comment_9_0= RULE_COMMENT ) ) | this_EOL_10= RULE_EOL )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_COMMENT) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_EOL) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:432:4: ( (lv_comment_9_0= RULE_COMMENT ) )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:432:4: ( (lv_comment_9_0= RULE_COMMENT ) )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:433:1: (lv_comment_9_0= RULE_COMMENT )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:433:1: (lv_comment_9_0= RULE_COMMENT )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:434:3: lv_comment_9_0= RULE_COMMENT
                    {
                    lv_comment_9_0=(Token)match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_ruleEvent706); 

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
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:451:6: this_EOL_10= RULE_EOL
                    {
                    this_EOL_10=(Token)match(input,RULE_EOL,FOLLOW_RULE_EOL_in_ruleEvent728); 
                     
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
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:463:1: entryRuleAn returns [EObject current=null] : iv_ruleAn= ruleAn EOF ;
    public final EObject entryRuleAn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAn = null;


        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:464:2: (iv_ruleAn= ruleAn EOF )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:465:2: iv_ruleAn= ruleAn EOF
            {
             newCompositeNode(grammarAccess.getAnRule()); 
            pushFollow(FOLLOW_ruleAn_in_entryRuleAn764);
            iv_ruleAn=ruleAn();

            state._fsp--;

             current =iv_ruleAn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAn774); 

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
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:472:1: ruleAn returns [EObject current=null] : (otherlv_0= 'an' ( (lv_idNode_1_0= ruleId ) ) ( (lv_attributes_2_0= ruleAttributes ) ) ) ;
    public final EObject ruleAn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_idNode_1_0 = null;

        EObject lv_attributes_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:475:28: ( (otherlv_0= 'an' ( (lv_idNode_1_0= ruleId ) ) ( (lv_attributes_2_0= ruleAttributes ) ) ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:476:1: (otherlv_0= 'an' ( (lv_idNode_1_0= ruleId ) ) ( (lv_attributes_2_0= ruleAttributes ) ) )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:476:1: (otherlv_0= 'an' ( (lv_idNode_1_0= ruleId ) ) ( (lv_attributes_2_0= ruleAttributes ) ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:476:3: otherlv_0= 'an' ( (lv_idNode_1_0= ruleId ) ) ( (lv_attributes_2_0= ruleAttributes ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleAn811); 

                	newLeafNode(otherlv_0, grammarAccess.getAnAccess().getAnKeyword_0());
                
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:480:1: ( (lv_idNode_1_0= ruleId ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:481:1: (lv_idNode_1_0= ruleId )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:481:1: (lv_idNode_1_0= ruleId )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:482:3: lv_idNode_1_0= ruleId
            {
             
            	        newCompositeNode(grammarAccess.getAnAccess().getIdNodeIdParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleId_in_ruleAn832);
            lv_idNode_1_0=ruleId();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAnRule());
            	        }
                   		set(
                   			current, 
                   			"idNode",
                    		lv_idNode_1_0, 
                    		"Id");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:498:2: ( (lv_attributes_2_0= ruleAttributes ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:499:1: (lv_attributes_2_0= ruleAttributes )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:499:1: (lv_attributes_2_0= ruleAttributes )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:500:3: lv_attributes_2_0= ruleAttributes
            {
             
            	        newCompositeNode(grammarAccess.getAnAccess().getAttributesAttributesParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAttributes_in_ruleAn853);
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
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:524:1: entryRuleCn returns [EObject current=null] : iv_ruleCn= ruleCn EOF ;
    public final EObject entryRuleCn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCn = null;


        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:525:2: (iv_ruleCn= ruleCn EOF )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:526:2: iv_ruleCn= ruleCn EOF
            {
             newCompositeNode(grammarAccess.getCnRule()); 
            pushFollow(FOLLOW_ruleCn_in_entryRuleCn889);
            iv_ruleCn=ruleCn();

            state._fsp--;

             current =iv_ruleCn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCn899); 

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
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:533:1: ruleCn returns [EObject current=null] : (otherlv_0= 'cn' ( (lv_idNode_1_0= ruleId ) ) ( (lv_attributes_2_0= ruleAttributes ) ) ) ;
    public final EObject ruleCn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_idNode_1_0 = null;

        EObject lv_attributes_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:536:28: ( (otherlv_0= 'cn' ( (lv_idNode_1_0= ruleId ) ) ( (lv_attributes_2_0= ruleAttributes ) ) ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:537:1: (otherlv_0= 'cn' ( (lv_idNode_1_0= ruleId ) ) ( (lv_attributes_2_0= ruleAttributes ) ) )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:537:1: (otherlv_0= 'cn' ( (lv_idNode_1_0= ruleId ) ) ( (lv_attributes_2_0= ruleAttributes ) ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:537:3: otherlv_0= 'cn' ( (lv_idNode_1_0= ruleId ) ) ( (lv_attributes_2_0= ruleAttributes ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleCn936); 

                	newLeafNode(otherlv_0, grammarAccess.getCnAccess().getCnKeyword_0());
                
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:541:1: ( (lv_idNode_1_0= ruleId ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:542:1: (lv_idNode_1_0= ruleId )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:542:1: (lv_idNode_1_0= ruleId )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:543:3: lv_idNode_1_0= ruleId
            {
             
            	        newCompositeNode(grammarAccess.getCnAccess().getIdNodeIdParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleId_in_ruleCn957);
            lv_idNode_1_0=ruleId();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCnRule());
            	        }
                   		set(
                   			current, 
                   			"idNode",
                    		lv_idNode_1_0, 
                    		"Id");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:559:2: ( (lv_attributes_2_0= ruleAttributes ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:560:1: (lv_attributes_2_0= ruleAttributes )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:560:1: (lv_attributes_2_0= ruleAttributes )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:561:3: lv_attributes_2_0= ruleAttributes
            {
             
            	        newCompositeNode(grammarAccess.getCnAccess().getAttributesAttributesParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAttributes_in_ruleCn978);
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
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:585:1: entryRuleDn returns [EObject current=null] : iv_ruleDn= ruleDn EOF ;
    public final EObject entryRuleDn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDn = null;


        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:586:2: (iv_ruleDn= ruleDn EOF )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:587:2: iv_ruleDn= ruleDn EOF
            {
             newCompositeNode(grammarAccess.getDnRule()); 
            pushFollow(FOLLOW_ruleDn_in_entryRuleDn1014);
            iv_ruleDn=ruleDn();

            state._fsp--;

             current =iv_ruleDn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDn1024); 

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
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:594:1: ruleDn returns [EObject current=null] : (otherlv_0= 'dn' ( (lv_idNode_1_0= ruleId ) ) ) ;
    public final EObject ruleDn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_idNode_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:597:28: ( (otherlv_0= 'dn' ( (lv_idNode_1_0= ruleId ) ) ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:598:1: (otherlv_0= 'dn' ( (lv_idNode_1_0= ruleId ) ) )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:598:1: (otherlv_0= 'dn' ( (lv_idNode_1_0= ruleId ) ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:598:3: otherlv_0= 'dn' ( (lv_idNode_1_0= ruleId ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleDn1061); 

                	newLeafNode(otherlv_0, grammarAccess.getDnAccess().getDnKeyword_0());
                
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:602:1: ( (lv_idNode_1_0= ruleId ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:603:1: (lv_idNode_1_0= ruleId )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:603:1: (lv_idNode_1_0= ruleId )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:604:3: lv_idNode_1_0= ruleId
            {
             
            	        newCompositeNode(grammarAccess.getDnAccess().getIdNodeIdParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleId_in_ruleDn1082);
            lv_idNode_1_0=ruleId();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDnRule());
            	        }
                   		set(
                   			current, 
                   			"idNode",
                    		lv_idNode_1_0, 
                    		"Id");
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
    // $ANTLR end "ruleDn"


    // $ANTLR start "entryRuleAe"
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:628:1: entryRuleAe returns [EObject current=null] : iv_ruleAe= ruleAe EOF ;
    public final EObject entryRuleAe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAe = null;


        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:629:2: (iv_ruleAe= ruleAe EOF )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:630:2: iv_ruleAe= ruleAe EOF
            {
             newCompositeNode(grammarAccess.getAeRule()); 
            pushFollow(FOLLOW_ruleAe_in_entryRuleAe1118);
            iv_ruleAe=ruleAe();

            state._fsp--;

             current =iv_ruleAe; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAe1128); 

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
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:637:1: ruleAe returns [EObject current=null] : (otherlv_0= 'ae' ( (lv_idEdge_1_0= ruleId ) ) ( (lv_idNode1_2_0= ruleId ) ) ( (lv_direction_3_0= RULE_DIRECTION ) )? ( (lv_idNode2_4_0= ruleId ) ) ( (lv_attributes_5_0= ruleAttributes ) ) ) ;
    public final EObject ruleAe() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_direction_3_0=null;
        AntlrDatatypeRuleToken lv_idEdge_1_0 = null;

        AntlrDatatypeRuleToken lv_idNode1_2_0 = null;

        AntlrDatatypeRuleToken lv_idNode2_4_0 = null;

        EObject lv_attributes_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:640:28: ( (otherlv_0= 'ae' ( (lv_idEdge_1_0= ruleId ) ) ( (lv_idNode1_2_0= ruleId ) ) ( (lv_direction_3_0= RULE_DIRECTION ) )? ( (lv_idNode2_4_0= ruleId ) ) ( (lv_attributes_5_0= ruleAttributes ) ) ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:641:1: (otherlv_0= 'ae' ( (lv_idEdge_1_0= ruleId ) ) ( (lv_idNode1_2_0= ruleId ) ) ( (lv_direction_3_0= RULE_DIRECTION ) )? ( (lv_idNode2_4_0= ruleId ) ) ( (lv_attributes_5_0= ruleAttributes ) ) )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:641:1: (otherlv_0= 'ae' ( (lv_idEdge_1_0= ruleId ) ) ( (lv_idNode1_2_0= ruleId ) ) ( (lv_direction_3_0= RULE_DIRECTION ) )? ( (lv_idNode2_4_0= ruleId ) ) ( (lv_attributes_5_0= ruleAttributes ) ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:641:3: otherlv_0= 'ae' ( (lv_idEdge_1_0= ruleId ) ) ( (lv_idNode1_2_0= ruleId ) ) ( (lv_direction_3_0= RULE_DIRECTION ) )? ( (lv_idNode2_4_0= ruleId ) ) ( (lv_attributes_5_0= ruleAttributes ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleAe1165); 

                	newLeafNode(otherlv_0, grammarAccess.getAeAccess().getAeKeyword_0());
                
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:645:1: ( (lv_idEdge_1_0= ruleId ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:646:1: (lv_idEdge_1_0= ruleId )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:646:1: (lv_idEdge_1_0= ruleId )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:647:3: lv_idEdge_1_0= ruleId
            {
             
            	        newCompositeNode(grammarAccess.getAeAccess().getIdEdgeIdParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleId_in_ruleAe1186);
            lv_idEdge_1_0=ruleId();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAeRule());
            	        }
                   		set(
                   			current, 
                   			"idEdge",
                    		lv_idEdge_1_0, 
                    		"Id");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:663:2: ( (lv_idNode1_2_0= ruleId ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:664:1: (lv_idNode1_2_0= ruleId )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:664:1: (lv_idNode1_2_0= ruleId )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:665:3: lv_idNode1_2_0= ruleId
            {
             
            	        newCompositeNode(grammarAccess.getAeAccess().getIdNode1IdParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleId_in_ruleAe1207);
            lv_idNode1_2_0=ruleId();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAeRule());
            	        }
                   		set(
                   			current, 
                   			"idNode1",
                    		lv_idNode1_2_0, 
                    		"Id");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:681:2: ( (lv_direction_3_0= RULE_DIRECTION ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_DIRECTION) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:682:1: (lv_direction_3_0= RULE_DIRECTION )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:682:1: (lv_direction_3_0= RULE_DIRECTION )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:683:3: lv_direction_3_0= RULE_DIRECTION
                    {
                    lv_direction_3_0=(Token)match(input,RULE_DIRECTION,FOLLOW_RULE_DIRECTION_in_ruleAe1224); 

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

            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:699:3: ( (lv_idNode2_4_0= ruleId ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:700:1: (lv_idNode2_4_0= ruleId )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:700:1: (lv_idNode2_4_0= ruleId )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:701:3: lv_idNode2_4_0= ruleId
            {
             
            	        newCompositeNode(grammarAccess.getAeAccess().getIdNode2IdParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleId_in_ruleAe1251);
            lv_idNode2_4_0=ruleId();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAeRule());
            	        }
                   		set(
                   			current, 
                   			"idNode2",
                    		lv_idNode2_4_0, 
                    		"Id");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:717:2: ( (lv_attributes_5_0= ruleAttributes ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:718:1: (lv_attributes_5_0= ruleAttributes )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:718:1: (lv_attributes_5_0= ruleAttributes )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:719:3: lv_attributes_5_0= ruleAttributes
            {
             
            	        newCompositeNode(grammarAccess.getAeAccess().getAttributesAttributesParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleAttributes_in_ruleAe1272);
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
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:743:1: entryRuleCe returns [EObject current=null] : iv_ruleCe= ruleCe EOF ;
    public final EObject entryRuleCe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCe = null;


        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:744:2: (iv_ruleCe= ruleCe EOF )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:745:2: iv_ruleCe= ruleCe EOF
            {
             newCompositeNode(grammarAccess.getCeRule()); 
            pushFollow(FOLLOW_ruleCe_in_entryRuleCe1308);
            iv_ruleCe=ruleCe();

            state._fsp--;

             current =iv_ruleCe; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCe1318); 

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
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:752:1: ruleCe returns [EObject current=null] : (otherlv_0= 'ce' ( (lv_idEdge_1_0= ruleId ) ) ( (lv_attributes_2_0= ruleAttributes ) ) ) ;
    public final EObject ruleCe() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_idEdge_1_0 = null;

        EObject lv_attributes_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:755:28: ( (otherlv_0= 'ce' ( (lv_idEdge_1_0= ruleId ) ) ( (lv_attributes_2_0= ruleAttributes ) ) ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:756:1: (otherlv_0= 'ce' ( (lv_idEdge_1_0= ruleId ) ) ( (lv_attributes_2_0= ruleAttributes ) ) )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:756:1: (otherlv_0= 'ce' ( (lv_idEdge_1_0= ruleId ) ) ( (lv_attributes_2_0= ruleAttributes ) ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:756:3: otherlv_0= 'ce' ( (lv_idEdge_1_0= ruleId ) ) ( (lv_attributes_2_0= ruleAttributes ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleCe1355); 

                	newLeafNode(otherlv_0, grammarAccess.getCeAccess().getCeKeyword_0());
                
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:760:1: ( (lv_idEdge_1_0= ruleId ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:761:1: (lv_idEdge_1_0= ruleId )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:761:1: (lv_idEdge_1_0= ruleId )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:762:3: lv_idEdge_1_0= ruleId
            {
             
            	        newCompositeNode(grammarAccess.getCeAccess().getIdEdgeIdParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleId_in_ruleCe1376);
            lv_idEdge_1_0=ruleId();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCeRule());
            	        }
                   		set(
                   			current, 
                   			"idEdge",
                    		lv_idEdge_1_0, 
                    		"Id");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:778:2: ( (lv_attributes_2_0= ruleAttributes ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:779:1: (lv_attributes_2_0= ruleAttributes )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:779:1: (lv_attributes_2_0= ruleAttributes )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:780:3: lv_attributes_2_0= ruleAttributes
            {
             
            	        newCompositeNode(grammarAccess.getCeAccess().getAttributesAttributesParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAttributes_in_ruleCe1397);
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
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:804:1: entryRuleDe returns [EObject current=null] : iv_ruleDe= ruleDe EOF ;
    public final EObject entryRuleDe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDe = null;


        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:805:2: (iv_ruleDe= ruleDe EOF )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:806:2: iv_ruleDe= ruleDe EOF
            {
             newCompositeNode(grammarAccess.getDeRule()); 
            pushFollow(FOLLOW_ruleDe_in_entryRuleDe1433);
            iv_ruleDe=ruleDe();

            state._fsp--;

             current =iv_ruleDe; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDe1443); 

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
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:813:1: ruleDe returns [EObject current=null] : (otherlv_0= 'de' ( (lv_idEdge_1_0= ruleId ) ) ) ;
    public final EObject ruleDe() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_idEdge_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:816:28: ( (otherlv_0= 'de' ( (lv_idEdge_1_0= ruleId ) ) ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:817:1: (otherlv_0= 'de' ( (lv_idEdge_1_0= ruleId ) ) )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:817:1: (otherlv_0= 'de' ( (lv_idEdge_1_0= ruleId ) ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:817:3: otherlv_0= 'de' ( (lv_idEdge_1_0= ruleId ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleDe1480); 

                	newLeafNode(otherlv_0, grammarAccess.getDeAccess().getDeKeyword_0());
                
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:821:1: ( (lv_idEdge_1_0= ruleId ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:822:1: (lv_idEdge_1_0= ruleId )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:822:1: (lv_idEdge_1_0= ruleId )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:823:3: lv_idEdge_1_0= ruleId
            {
             
            	        newCompositeNode(grammarAccess.getDeAccess().getIdEdgeIdParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleId_in_ruleDe1501);
            lv_idEdge_1_0=ruleId();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDeRule());
            	        }
                   		set(
                   			current, 
                   			"idEdge",
                    		lv_idEdge_1_0, 
                    		"Id");
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
    // $ANTLR end "ruleDe"


    // $ANTLR start "entryRuleCg"
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:847:1: entryRuleCg returns [EObject current=null] : iv_ruleCg= ruleCg EOF ;
    public final EObject entryRuleCg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCg = null;


        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:848:2: (iv_ruleCg= ruleCg EOF )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:849:2: iv_ruleCg= ruleCg EOF
            {
             newCompositeNode(grammarAccess.getCgRule()); 
            pushFollow(FOLLOW_ruleCg_in_entryRuleCg1537);
            iv_ruleCg=ruleCg();

            state._fsp--;

             current =iv_ruleCg; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCg1547); 

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
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:856:1: ruleCg returns [EObject current=null] : (otherlv_0= 'cg' ( (lv_attributes_1_0= ruleAttributes ) ) ) ;
    public final EObject ruleCg() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_attributes_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:859:28: ( (otherlv_0= 'cg' ( (lv_attributes_1_0= ruleAttributes ) ) ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:860:1: (otherlv_0= 'cg' ( (lv_attributes_1_0= ruleAttributes ) ) )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:860:1: (otherlv_0= 'cg' ( (lv_attributes_1_0= ruleAttributes ) ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:860:3: otherlv_0= 'cg' ( (lv_attributes_1_0= ruleAttributes ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleCg1584); 

                	newLeafNode(otherlv_0, grammarAccess.getCgAccess().getCgKeyword_0());
                
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:864:1: ( (lv_attributes_1_0= ruleAttributes ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:865:1: (lv_attributes_1_0= ruleAttributes )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:865:1: (lv_attributes_1_0= ruleAttributes )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:866:3: lv_attributes_1_0= ruleAttributes
            {
             
            	        newCompositeNode(grammarAccess.getCgAccess().getAttributesAttributesParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAttributes_in_ruleCg1605);
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
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:890:1: entryRuleSt returns [EObject current=null] : iv_ruleSt= ruleSt EOF ;
    public final EObject entryRuleSt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSt = null;


        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:891:2: (iv_ruleSt= ruleSt EOF )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:892:2: iv_ruleSt= ruleSt EOF
            {
             newCompositeNode(grammarAccess.getStRule()); 
            pushFollow(FOLLOW_ruleSt_in_entryRuleSt1641);
            iv_ruleSt=ruleSt();

            state._fsp--;

             current =iv_ruleSt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSt1651); 

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
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:899:1: ruleSt returns [EObject current=null] : (otherlv_0= 'st' ( (lv_real_1_0= RULE_REAL ) ) ) ;
    public final EObject ruleSt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_real_1_0=null;

         enterRule(); 
            
        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:902:28: ( (otherlv_0= 'st' ( (lv_real_1_0= RULE_REAL ) ) ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:903:1: (otherlv_0= 'st' ( (lv_real_1_0= RULE_REAL ) ) )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:903:1: (otherlv_0= 'st' ( (lv_real_1_0= RULE_REAL ) ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:903:3: otherlv_0= 'st' ( (lv_real_1_0= RULE_REAL ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleSt1688); 

                	newLeafNode(otherlv_0, grammarAccess.getStAccess().getStKeyword_0());
                
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:907:1: ( (lv_real_1_0= RULE_REAL ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:908:1: (lv_real_1_0= RULE_REAL )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:908:1: (lv_real_1_0= RULE_REAL )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:909:3: lv_real_1_0= RULE_REAL
            {
            lv_real_1_0=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleSt1705); 

            			newLeafNode(lv_real_1_0, grammarAccess.getStAccess().getRealREALTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"real",
                    		lv_real_1_0, 
                    		"REAL");
            	    

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
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:933:1: entryRuleAttributes returns [EObject current=null] : iv_ruleAttributes= ruleAttributes EOF ;
    public final EObject entryRuleAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributes = null;


        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:934:2: (iv_ruleAttributes= ruleAttributes EOF )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:935:2: iv_ruleAttributes= ruleAttributes EOF
            {
             newCompositeNode(grammarAccess.getAttributesRule()); 
            pushFollow(FOLLOW_ruleAttributes_in_entryRuleAttributes1746);
            iv_ruleAttributes=ruleAttributes();

            state._fsp--;

             current =iv_ruleAttributes; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributes1756); 

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
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:942:1: ruleAttributes returns [EObject current=null] : ( () ( (lv_attribute_1_0= ruleAttribute ) )* ) ;
    public final EObject ruleAttributes() throws RecognitionException {
        EObject current = null;

        EObject lv_attribute_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:945:28: ( ( () ( (lv_attribute_1_0= ruleAttribute ) )* ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:946:1: ( () ( (lv_attribute_1_0= ruleAttribute ) )* )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:946:1: ( () ( (lv_attribute_1_0= ruleAttribute ) )* )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:946:2: () ( (lv_attribute_1_0= ruleAttribute ) )*
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:946:2: ()
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:947:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAttributesAccess().getAttributesAction_0(),
                        current);
                

            }

            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:952:2: ( (lv_attribute_1_0= ruleAttribute ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_INT||LA5_0==RULE_OPERATOR||(LA5_0>=RULE_STRING && LA5_0<=RULE_WORD)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:953:1: (lv_attribute_1_0= ruleAttribute )
            	    {
            	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:953:1: (lv_attribute_1_0= ruleAttribute )
            	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:954:3: lv_attribute_1_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAttributesAccess().getAttributeAttributeParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleAttributes1811);
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
            	    break loop5;
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
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:978:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:979:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:980:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1848);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1858); 

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
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:987:1: ruleAttribute returns [EObject current=null] : ( ( (lv_operator_0_0= RULE_OPERATOR ) )? ( (lv_idAttribute_1_0= ruleId ) ) ( ( (lv_assign_2_0= RULE_ASSIGN ) ) ( (lv_value_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_otherValues_5_0= ruleValue ) ) )* )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_operator_0_0=null;
        Token lv_assign_2_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_idAttribute_1_0 = null;

        EObject lv_value_3_0 = null;

        EObject lv_otherValues_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:990:28: ( ( ( (lv_operator_0_0= RULE_OPERATOR ) )? ( (lv_idAttribute_1_0= ruleId ) ) ( ( (lv_assign_2_0= RULE_ASSIGN ) ) ( (lv_value_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_otherValues_5_0= ruleValue ) ) )* )? ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:991:1: ( ( (lv_operator_0_0= RULE_OPERATOR ) )? ( (lv_idAttribute_1_0= ruleId ) ) ( ( (lv_assign_2_0= RULE_ASSIGN ) ) ( (lv_value_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_otherValues_5_0= ruleValue ) ) )* )? )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:991:1: ( ( (lv_operator_0_0= RULE_OPERATOR ) )? ( (lv_idAttribute_1_0= ruleId ) ) ( ( (lv_assign_2_0= RULE_ASSIGN ) ) ( (lv_value_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_otherValues_5_0= ruleValue ) ) )* )? )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:991:2: ( (lv_operator_0_0= RULE_OPERATOR ) )? ( (lv_idAttribute_1_0= ruleId ) ) ( ( (lv_assign_2_0= RULE_ASSIGN ) ) ( (lv_value_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_otherValues_5_0= ruleValue ) ) )* )?
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:991:2: ( (lv_operator_0_0= RULE_OPERATOR ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_OPERATOR) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:992:1: (lv_operator_0_0= RULE_OPERATOR )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:992:1: (lv_operator_0_0= RULE_OPERATOR )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:993:3: lv_operator_0_0= RULE_OPERATOR
                    {
                    lv_operator_0_0=(Token)match(input,RULE_OPERATOR,FOLLOW_RULE_OPERATOR_in_ruleAttribute1900); 

                    			newLeafNode(lv_operator_0_0, grammarAccess.getAttributeAccess().getOperatorOPERATORTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"operator",
                            		lv_operator_0_0, 
                            		"OPERATOR");
                    	    

                    }


                    }
                    break;

            }

            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1009:3: ( (lv_idAttribute_1_0= ruleId ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1010:1: (lv_idAttribute_1_0= ruleId )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1010:1: (lv_idAttribute_1_0= ruleId )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1011:3: lv_idAttribute_1_0= ruleId
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getIdAttributeIdParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleId_in_ruleAttribute1927);
            lv_idAttribute_1_0=ruleId();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"idAttribute",
                    		lv_idAttribute_1_0, 
                    		"Id");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1027:2: ( ( (lv_assign_2_0= RULE_ASSIGN ) ) ( (lv_value_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_otherValues_5_0= ruleValue ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ASSIGN) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1027:3: ( (lv_assign_2_0= RULE_ASSIGN ) ) ( (lv_value_3_0= ruleValue ) ) (otherlv_4= ',' ( (lv_otherValues_5_0= ruleValue ) ) )*
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1027:3: ( (lv_assign_2_0= RULE_ASSIGN ) )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1028:1: (lv_assign_2_0= RULE_ASSIGN )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1028:1: (lv_assign_2_0= RULE_ASSIGN )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1029:3: lv_assign_2_0= RULE_ASSIGN
                    {
                    lv_assign_2_0=(Token)match(input,RULE_ASSIGN,FOLLOW_RULE_ASSIGN_in_ruleAttribute1945); 

                    			newLeafNode(lv_assign_2_0, grammarAccess.getAttributeAccess().getAssignASSIGNTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"assign",
                            		lv_assign_2_0, 
                            		"ASSIGN");
                    	    

                    }


                    }

                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1045:2: ( (lv_value_3_0= ruleValue ) )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1046:1: (lv_value_3_0= ruleValue )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1046:1: (lv_value_3_0= ruleValue )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1047:3: lv_value_3_0= ruleValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeAccess().getValueValueParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValue_in_ruleAttribute1971);
                    lv_value_3_0=ruleValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttributeRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_3_0, 
                            		"Value");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1063:2: (otherlv_4= ',' ( (lv_otherValues_5_0= ruleValue ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==24) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1063:4: otherlv_4= ',' ( (lv_otherValues_5_0= ruleValue ) )
                    	    {
                    	    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleAttribute1984); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1067:1: ( (lv_otherValues_5_0= ruleValue ) )
                    	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1068:1: (lv_otherValues_5_0= ruleValue )
                    	    {
                    	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1068:1: (lv_otherValues_5_0= ruleValue )
                    	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1069:3: lv_otherValues_5_0= ruleValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAttributeAccess().getOtherValuesValueParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleValue_in_ruleAttribute2005);
                    	    lv_otherValues_5_0=ruleValue();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAttributeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"otherValues",
                    	            		lv_otherValues_5_0, 
                    	            		"Value");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
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
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1093:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1094:2: (iv_ruleValue= ruleValue EOF )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1095:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue2045);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue2055); 

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
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1102:1: ruleValue returns [EObject current=null] : ( ( (lv_string_0_0= RULE_STRING ) ) | ( (lv_real_1_0= RULE_REAL ) ) | ( (lv_int_2_0= RULE_INT ) ) | ( (lv_array_3_0= ruleArray ) ) | ( (lv_map_4_0= ruleMap ) ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token lv_string_0_0=null;
        Token lv_real_1_0=null;
        Token lv_int_2_0=null;
        EObject lv_array_3_0 = null;

        EObject lv_map_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1105:28: ( ( ( (lv_string_0_0= RULE_STRING ) ) | ( (lv_real_1_0= RULE_REAL ) ) | ( (lv_int_2_0= RULE_INT ) ) | ( (lv_array_3_0= ruleArray ) ) | ( (lv_map_4_0= ruleMap ) ) ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1106:1: ( ( (lv_string_0_0= RULE_STRING ) ) | ( (lv_real_1_0= RULE_REAL ) ) | ( (lv_int_2_0= RULE_INT ) ) | ( (lv_array_3_0= ruleArray ) ) | ( (lv_map_4_0= ruleMap ) ) )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1106:1: ( ( (lv_string_0_0= RULE_STRING ) ) | ( (lv_real_1_0= RULE_REAL ) ) | ( (lv_int_2_0= RULE_INT ) ) | ( (lv_array_3_0= ruleArray ) ) | ( (lv_map_4_0= ruleMap ) ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt9=1;
                }
                break;
            case RULE_REAL:
                {
                alt9=2;
                }
                break;
            case RULE_INT:
                {
                alt9=3;
                }
                break;
            case 25:
                {
                alt9=4;
                }
                break;
            case 27:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1106:2: ( (lv_string_0_0= RULE_STRING ) )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1106:2: ( (lv_string_0_0= RULE_STRING ) )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1107:1: (lv_string_0_0= RULE_STRING )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1107:1: (lv_string_0_0= RULE_STRING )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1108:3: lv_string_0_0= RULE_STRING
                    {
                    lv_string_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValue2097); 

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
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1125:6: ( (lv_real_1_0= RULE_REAL ) )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1125:6: ( (lv_real_1_0= RULE_REAL ) )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1126:1: (lv_real_1_0= RULE_REAL )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1126:1: (lv_real_1_0= RULE_REAL )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1127:3: lv_real_1_0= RULE_REAL
                    {
                    lv_real_1_0=(Token)match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleValue2125); 

                    			newLeafNode(lv_real_1_0, grammarAccess.getValueAccess().getRealREALTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getValueRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"real",
                            		lv_real_1_0, 
                            		"REAL");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1144:6: ( (lv_int_2_0= RULE_INT ) )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1144:6: ( (lv_int_2_0= RULE_INT ) )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1145:1: (lv_int_2_0= RULE_INT )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1145:1: (lv_int_2_0= RULE_INT )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1146:3: lv_int_2_0= RULE_INT
                    {
                    lv_int_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleValue2153); 

                    			newLeafNode(lv_int_2_0, grammarAccess.getValueAccess().getIntINTTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getValueRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"int",
                            		lv_int_2_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1163:6: ( (lv_array_3_0= ruleArray ) )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1163:6: ( (lv_array_3_0= ruleArray ) )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1164:1: (lv_array_3_0= ruleArray )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1164:1: (lv_array_3_0= ruleArray )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1165:3: lv_array_3_0= ruleArray
                    {
                     
                    	        newCompositeNode(grammarAccess.getValueAccess().getArrayArrayParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArray_in_ruleValue2185);
                    lv_array_3_0=ruleArray();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getValueRule());
                    	        }
                           		set(
                           			current, 
                           			"array",
                            		lv_array_3_0, 
                            		"Array");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1182:6: ( (lv_map_4_0= ruleMap ) )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1182:6: ( (lv_map_4_0= ruleMap ) )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1183:1: (lv_map_4_0= ruleMap )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1183:1: (lv_map_4_0= ruleMap )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1184:3: lv_map_4_0= ruleMap
                    {
                     
                    	        newCompositeNode(grammarAccess.getValueAccess().getMapMapParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMap_in_ruleValue2212);
                    lv_map_4_0=ruleMap();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getValueRule());
                    	        }
                           		set(
                           			current, 
                           			"map",
                            		lv_map_4_0, 
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
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1208:1: entryRuleArray returns [EObject current=null] : iv_ruleArray= ruleArray EOF ;
    public final EObject entryRuleArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArray = null;


        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1209:2: (iv_ruleArray= ruleArray EOF )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1210:2: iv_ruleArray= ruleArray EOF
            {
             newCompositeNode(grammarAccess.getArrayRule()); 
            pushFollow(FOLLOW_ruleArray_in_entryRuleArray2248);
            iv_ruleArray=ruleArray();

            state._fsp--;

             current =iv_ruleArray; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArray2258); 

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
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1217:1: ruleArray returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_otherValues_4_0= ruleValue ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_otherValues_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1220:28: ( ( () otherlv_1= '{' ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_otherValues_4_0= ruleValue ) ) )* )? otherlv_5= '}' ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1221:1: ( () otherlv_1= '{' ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_otherValues_4_0= ruleValue ) ) )* )? otherlv_5= '}' )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1221:1: ( () otherlv_1= '{' ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_otherValues_4_0= ruleValue ) ) )* )? otherlv_5= '}' )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1221:2: () otherlv_1= '{' ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_otherValues_4_0= ruleValue ) ) )* )? otherlv_5= '}'
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1221:2: ()
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1222:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getArrayAccess().getArrayAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleArray2304); 

                	newLeafNode(otherlv_1, grammarAccess.getArrayAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1231:1: ( ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_otherValues_4_0= ruleValue ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT||LA11_0==RULE_REAL||LA11_0==RULE_STRING||LA11_0==25||LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1231:2: ( (lv_value_2_0= ruleValue ) ) (otherlv_3= ',' ( (lv_otherValues_4_0= ruleValue ) ) )*
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1231:2: ( (lv_value_2_0= ruleValue ) )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1232:1: (lv_value_2_0= ruleValue )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1232:1: (lv_value_2_0= ruleValue )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1233:3: lv_value_2_0= ruleValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getArrayAccess().getValueValueParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValue_in_ruleArray2326);
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

                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1249:2: (otherlv_3= ',' ( (lv_otherValues_4_0= ruleValue ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==24) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1249:4: otherlv_3= ',' ( (lv_otherValues_4_0= ruleValue ) )
                    	    {
                    	    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleArray2339); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getArrayAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1253:1: ( (lv_otherValues_4_0= ruleValue ) )
                    	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1254:1: (lv_otherValues_4_0= ruleValue )
                    	    {
                    	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1254:1: (lv_otherValues_4_0= ruleValue )
                    	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1255:3: lv_otherValues_4_0= ruleValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getArrayAccess().getOtherValuesValueParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleValue_in_ruleArray2360);
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
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleArray2376); 

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
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1283:1: entryRuleMap returns [EObject current=null] : iv_ruleMap= ruleMap EOF ;
    public final EObject entryRuleMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMap = null;


        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1284:2: (iv_ruleMap= ruleMap EOF )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1285:2: iv_ruleMap= ruleMap EOF
            {
             newCompositeNode(grammarAccess.getMapRule()); 
            pushFollow(FOLLOW_ruleMap_in_entryRuleMap2412);
            iv_ruleMap=ruleMap();

            state._fsp--;

             current =iv_ruleMap; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMap2422); 

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
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1292:1: ruleMap returns [EObject current=null] : (otherlv_0= '[' ( (lv_mapping_1_0= ruleMapping ) ) (otherlv_2= ',' ( (lv_otherMapping_3_0= ruleMapping ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleMap() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_mapping_1_0 = null;

        EObject lv_otherMapping_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1295:28: ( (otherlv_0= '[' ( (lv_mapping_1_0= ruleMapping ) ) (otherlv_2= ',' ( (lv_otherMapping_3_0= ruleMapping ) ) )* otherlv_4= ']' ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1296:1: (otherlv_0= '[' ( (lv_mapping_1_0= ruleMapping ) ) (otherlv_2= ',' ( (lv_otherMapping_3_0= ruleMapping ) ) )* otherlv_4= ']' )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1296:1: (otherlv_0= '[' ( (lv_mapping_1_0= ruleMapping ) ) (otherlv_2= ',' ( (lv_otherMapping_3_0= ruleMapping ) ) )* otherlv_4= ']' )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1296:3: otherlv_0= '[' ( (lv_mapping_1_0= ruleMapping ) ) (otherlv_2= ',' ( (lv_otherMapping_3_0= ruleMapping ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleMap2459); 

                	newLeafNode(otherlv_0, grammarAccess.getMapAccess().getLeftSquareBracketKeyword_0());
                
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1300:1: ( (lv_mapping_1_0= ruleMapping ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1301:1: (lv_mapping_1_0= ruleMapping )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1301:1: (lv_mapping_1_0= ruleMapping )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1302:3: lv_mapping_1_0= ruleMapping
            {
             
            	        newCompositeNode(grammarAccess.getMapAccess().getMappingMappingParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleMapping_in_ruleMap2480);
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

            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1318:2: (otherlv_2= ',' ( (lv_otherMapping_3_0= ruleMapping ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==24) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1318:4: otherlv_2= ',' ( (lv_otherMapping_3_0= ruleMapping ) )
            	    {
            	    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleMap2493); 

            	        	newLeafNode(otherlv_2, grammarAccess.getMapAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1322:1: ( (lv_otherMapping_3_0= ruleMapping ) )
            	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1323:1: (lv_otherMapping_3_0= ruleMapping )
            	    {
            	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1323:1: (lv_otherMapping_3_0= ruleMapping )
            	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1324:3: lv_otherMapping_3_0= ruleMapping
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMapAccess().getOtherMappingMappingParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMapping_in_ruleMap2514);
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
            	    break loop12;
                }
            } while (true);

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleMap2528); 

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
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1352:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1353:2: (iv_ruleMapping= ruleMapping EOF )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1354:2: iv_ruleMapping= ruleMapping EOF
            {
             newCompositeNode(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_ruleMapping_in_entryRuleMapping2564);
            iv_ruleMapping=ruleMapping();

            state._fsp--;

             current =iv_ruleMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapping2574); 

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
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1361:1: ruleMapping returns [EObject current=null] : ( ( (lv_id_0_0= ruleId ) ) ( (lv_assign_1_0= RULE_ASSIGN ) ) ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        Token lv_assign_1_0=null;
        AntlrDatatypeRuleToken lv_id_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1364:28: ( ( ( (lv_id_0_0= ruleId ) ) ( (lv_assign_1_0= RULE_ASSIGN ) ) ( (lv_value_2_0= ruleValue ) ) ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1365:1: ( ( (lv_id_0_0= ruleId ) ) ( (lv_assign_1_0= RULE_ASSIGN ) ) ( (lv_value_2_0= ruleValue ) ) )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1365:1: ( ( (lv_id_0_0= ruleId ) ) ( (lv_assign_1_0= RULE_ASSIGN ) ) ( (lv_value_2_0= ruleValue ) ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1365:2: ( (lv_id_0_0= ruleId ) ) ( (lv_assign_1_0= RULE_ASSIGN ) ) ( (lv_value_2_0= ruleValue ) )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1365:2: ( (lv_id_0_0= ruleId ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1366:1: (lv_id_0_0= ruleId )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1366:1: (lv_id_0_0= ruleId )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1367:3: lv_id_0_0= ruleId
            {
             
            	        newCompositeNode(grammarAccess.getMappingAccess().getIdIdParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleId_in_ruleMapping2620);
            lv_id_0_0=ruleId();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMappingRule());
            	        }
                   		set(
                   			current, 
                   			"id",
                    		lv_id_0_0, 
                    		"Id");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1383:2: ( (lv_assign_1_0= RULE_ASSIGN ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1384:1: (lv_assign_1_0= RULE_ASSIGN )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1384:1: (lv_assign_1_0= RULE_ASSIGN )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1385:3: lv_assign_1_0= RULE_ASSIGN
            {
            lv_assign_1_0=(Token)match(input,RULE_ASSIGN,FOLLOW_RULE_ASSIGN_in_ruleMapping2637); 

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

            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1401:2: ( (lv_value_2_0= ruleValue ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1402:1: (lv_value_2_0= ruleValue )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1402:1: (lv_value_2_0= ruleValue )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1403:3: lv_value_2_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getMappingAccess().getValueValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleMapping2663);
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


    // $ANTLR start "entryRuleId"
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1427:1: entryRuleId returns [String current=null] : iv_ruleId= ruleId EOF ;
    public final String entryRuleId() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleId = null;


        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1428:2: (iv_ruleId= ruleId EOF )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1429:2: iv_ruleId= ruleId EOF
            {
             newCompositeNode(grammarAccess.getIdRule()); 
            pushFollow(FOLLOW_ruleId_in_entryRuleId2700);
            iv_ruleId=ruleId();

            state._fsp--;

             current =iv_ruleId.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleId2711); 

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
    // $ANTLR end "entryRuleId"


    // $ANTLR start "ruleId"
    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1436:1: ruleId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT | (this_WORD_2= RULE_WORD (kw= '.' this_WORD_4= RULE_WORD )* ) ) ;
    public final AntlrDatatypeRuleToken ruleId() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_INT_1=null;
        Token this_WORD_2=null;
        Token kw=null;
        Token this_WORD_4=null;

         enterRule(); 
            
        try {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1439:28: ( (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT | (this_WORD_2= RULE_WORD (kw= '.' this_WORD_4= RULE_WORD )* ) ) )
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1440:1: (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT | (this_WORD_2= RULE_WORD (kw= '.' this_WORD_4= RULE_WORD )* ) )
            {
            // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1440:1: (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT | (this_WORD_2= RULE_WORD (kw= '.' this_WORD_4= RULE_WORD )* ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt14=1;
                }
                break;
            case RULE_INT:
                {
                alt14=2;
                }
                break;
            case RULE_WORD:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1440:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleId2751); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getIdAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1448:10: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleId2777); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getIdAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1456:6: (this_WORD_2= RULE_WORD (kw= '.' this_WORD_4= RULE_WORD )* )
                    {
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1456:6: (this_WORD_2= RULE_WORD (kw= '.' this_WORD_4= RULE_WORD )* )
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1456:11: this_WORD_2= RULE_WORD (kw= '.' this_WORD_4= RULE_WORD )*
                    {
                    this_WORD_2=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleId2804); 

                    		current.merge(this_WORD_2);
                        
                     
                        newLeafNode(this_WORD_2, grammarAccess.getIdAccess().getWORDTerminalRuleCall_2_0()); 
                        
                    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1463:1: (kw= '.' this_WORD_4= RULE_WORD )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==29) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../org.graphstream.DGSPlugin/src-gen/org/graphstream/parser/antlr/internal/InternalDGS.g:1464:2: kw= '.' this_WORD_4= RULE_WORD
                    	    {
                    	    kw=(Token)match(input,29,FOLLOW_29_in_ruleId2823); 

                    	            current.merge(kw);
                    	            newLeafNode(kw, grammarAccess.getIdAccess().getFullStopKeyword_2_1_0()); 
                    	        
                    	    this_WORD_4=(Token)match(input,RULE_WORD,FOLLOW_RULE_WORD_in_ruleId2838); 

                    	    		current.merge(this_WORD_4);
                    	        
                    	     
                    	        newLeafNode(this_WORD_4, grammarAccess.getIdAccess().getWORDTerminalRuleCall_2_1_1()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


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
    // $ANTLR end "ruleId"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDgs_in_entryRuleDgs75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDgs85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeader_in_ruleDgs131 = new BitSet(new long[]{0x0000000000FF0132L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleDgs153 = new BitSet(new long[]{0x0000000000FF0132L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleDgs176 = new BitSet(new long[]{0x0000000000FF0132L});
    public static final BitSet FOLLOW_RULE_EOL_in_ruleDgs198 = new BitSet(new long[]{0x0000000000FF0132L});
    public static final BitSet FOLLOW_ruleHeader_in_entryRuleHeader235 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeader245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MAGIC_in_ruleHeader287 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_EOL_in_ruleHeader303 = new BitSet(new long[]{0x0000000000006080L});
    public static final BitSet FOLLOW_ruleId_in_ruleHeader323 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleHeader340 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleHeader362 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_EOL_in_ruleHeader378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent413 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAn_in_ruleEvent470 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleCn_in_ruleEvent497 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleDn_in_ruleEvent524 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleAe_in_ruleEvent551 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleCe_in_ruleEvent578 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleDe_in_ruleEvent605 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleCg_in_ruleEvent632 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleSt_in_ruleEvent659 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_CL_in_ruleEvent682 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_ruleEvent706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EOL_in_ruleEvent728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAn_in_entryRuleAn764 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAn774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleAn811 = new BitSet(new long[]{0x0000000000006080L});
    public static final BitSet FOLLOW_ruleId_in_ruleAn832 = new BitSet(new long[]{0x0000000000006880L});
    public static final BitSet FOLLOW_ruleAttributes_in_ruleAn853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCn_in_entryRuleCn889 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCn899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleCn936 = new BitSet(new long[]{0x0000000000006080L});
    public static final BitSet FOLLOW_ruleId_in_ruleCn957 = new BitSet(new long[]{0x0000000000006880L});
    public static final BitSet FOLLOW_ruleAttributes_in_ruleCn978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDn_in_entryRuleDn1014 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDn1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleDn1061 = new BitSet(new long[]{0x0000000000006080L});
    public static final BitSet FOLLOW_ruleId_in_ruleDn1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAe_in_entryRuleAe1118 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAe1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleAe1165 = new BitSet(new long[]{0x0000000000006080L});
    public static final BitSet FOLLOW_ruleId_in_ruleAe1186 = new BitSet(new long[]{0x0000000000006080L});
    public static final BitSet FOLLOW_ruleId_in_ruleAe1207 = new BitSet(new long[]{0x0000000000006280L});
    public static final BitSet FOLLOW_RULE_DIRECTION_in_ruleAe1224 = new BitSet(new long[]{0x0000000000006080L});
    public static final BitSet FOLLOW_ruleId_in_ruleAe1251 = new BitSet(new long[]{0x0000000000006880L});
    public static final BitSet FOLLOW_ruleAttributes_in_ruleAe1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCe_in_entryRuleCe1308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCe1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleCe1355 = new BitSet(new long[]{0x0000000000006080L});
    public static final BitSet FOLLOW_ruleId_in_ruleCe1376 = new BitSet(new long[]{0x0000000000006880L});
    public static final BitSet FOLLOW_ruleAttributes_in_ruleCe1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDe_in_entryRuleDe1433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDe1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleDe1480 = new BitSet(new long[]{0x0000000000006080L});
    public static final BitSet FOLLOW_ruleId_in_ruleDe1501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCg_in_entryRuleCg1537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCg1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleCg1584 = new BitSet(new long[]{0x0000000000006880L});
    public static final BitSet FOLLOW_ruleAttributes_in_ruleCg1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSt_in_entryRuleSt1641 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSt1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleSt1688 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleSt1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributes_in_entryRuleAttributes1746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributes1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleAttributes1811 = new BitSet(new long[]{0x0000000000006882L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPERATOR_in_ruleAttribute1900 = new BitSet(new long[]{0x0000000000006080L});
    public static final BitSet FOLLOW_ruleId_in_ruleAttribute1927 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_RULE_ASSIGN_in_ruleAttribute1945 = new BitSet(new long[]{0x000000000A002480L});
    public static final BitSet FOLLOW_ruleValue_in_ruleAttribute1971 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleAttribute1984 = new BitSet(new long[]{0x000000000A002480L});
    public static final BitSet FOLLOW_ruleValue_in_ruleAttribute2005 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue2045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValue2097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleValue2125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleValue2153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_ruleValue2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMap_in_ruleValue2212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_entryRuleArray2248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArray2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleArray2304 = new BitSet(new long[]{0x000000000E002480L});
    public static final BitSet FOLLOW_ruleValue_in_ruleArray2326 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_24_in_ruleArray2339 = new BitSet(new long[]{0x000000000A002480L});
    public static final BitSet FOLLOW_ruleValue_in_ruleArray2360 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_26_in_ruleArray2376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMap_in_entryRuleMap2412 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMap2422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleMap2459 = new BitSet(new long[]{0x0000000000006080L});
    public static final BitSet FOLLOW_ruleMapping_in_ruleMap2480 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_24_in_ruleMap2493 = new BitSet(new long[]{0x0000000000006080L});
    public static final BitSet FOLLOW_ruleMapping_in_ruleMap2514 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_28_in_ruleMap2528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_entryRuleMapping2564 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapping2574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleId_in_ruleMapping2620 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_ASSIGN_in_ruleMapping2637 = new BitSet(new long[]{0x000000000A002480L});
    public static final BitSet FOLLOW_ruleValue_in_ruleMapping2663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleId_in_entryRuleId2700 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleId2711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleId2751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleId2777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleId2804 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleId2823 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_WORD_in_ruleId2838 = new BitSet(new long[]{0x0000000020000002L});

}