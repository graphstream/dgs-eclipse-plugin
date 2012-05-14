package org.graphstream.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.graphstream.services.DGSGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDGSParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EOL", "RULE_STRING", "RULE_INT", "RULE_WORD", "RULE_COMMENT", "RULE_MAGIC", "RULE_CL", "RULE_DIRECTION", "RULE_REAL", "RULE_OPERATOR", "RULE_ASSIGN", "RULE_WS", "'an'", "'cn'", "'dn'", "'ae'", "'ce'", "'de'", "'cg'", "'st'", "','", "'{'", "'}'", "'['", "']'", "'.'"
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


        public InternalDGSParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDGSParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDGSParser.tokenNames; }
    public String getGrammarFileName() { return "../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g"; }


     
     	private DGSGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DGSGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleDgs"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:60:1: entryRuleDgs : ruleDgs EOF ;
    public final void entryRuleDgs() throws RecognitionException {
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:61:1: ( ruleDgs EOF )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:62:1: ruleDgs EOF
            {
             before(grammarAccess.getDgsRule()); 
            pushFollow(FOLLOW_ruleDgs_in_entryRuleDgs61);
            ruleDgs();

            state._fsp--;

             after(grammarAccess.getDgsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDgs68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDgs"


    // $ANTLR start "ruleDgs"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:69:1: ruleDgs : ( ( rule__Dgs__Group__0 ) ) ;
    public final void ruleDgs() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:73:2: ( ( ( rule__Dgs__Group__0 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:74:1: ( ( rule__Dgs__Group__0 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:74:1: ( ( rule__Dgs__Group__0 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:75:1: ( rule__Dgs__Group__0 )
            {
             before(grammarAccess.getDgsAccess().getGroup()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:76:1: ( rule__Dgs__Group__0 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:76:2: rule__Dgs__Group__0
            {
            pushFollow(FOLLOW_rule__Dgs__Group__0_in_ruleDgs94);
            rule__Dgs__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDgsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDgs"


    // $ANTLR start "entryRuleHeader"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:88:1: entryRuleHeader : ruleHeader EOF ;
    public final void entryRuleHeader() throws RecognitionException {
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:89:1: ( ruleHeader EOF )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:90:1: ruleHeader EOF
            {
             before(grammarAccess.getHeaderRule()); 
            pushFollow(FOLLOW_ruleHeader_in_entryRuleHeader121);
            ruleHeader();

            state._fsp--;

             after(grammarAccess.getHeaderRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeader128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHeader"


    // $ANTLR start "ruleHeader"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:97:1: ruleHeader : ( ( rule__Header__Group__0 ) ) ;
    public final void ruleHeader() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:101:2: ( ( ( rule__Header__Group__0 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:102:1: ( ( rule__Header__Group__0 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:102:1: ( ( rule__Header__Group__0 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:103:1: ( rule__Header__Group__0 )
            {
             before(grammarAccess.getHeaderAccess().getGroup()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:104:1: ( rule__Header__Group__0 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:104:2: rule__Header__Group__0
            {
            pushFollow(FOLLOW_rule__Header__Group__0_in_ruleHeader154);
            rule__Header__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHeader"


    // $ANTLR start "entryRuleEvent"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:116:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:117:1: ( ruleEvent EOF )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:118:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent181);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:125:1: ruleEvent : ( ( rule__Event__Group__0 ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:129:2: ( ( ( rule__Event__Group__0 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:130:1: ( ( rule__Event__Group__0 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:130:1: ( ( rule__Event__Group__0 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:131:1: ( rule__Event__Group__0 )
            {
             before(grammarAccess.getEventAccess().getGroup()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:132:1: ( rule__Event__Group__0 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:132:2: rule__Event__Group__0
            {
            pushFollow(FOLLOW_rule__Event__Group__0_in_ruleEvent214);
            rule__Event__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleAn"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:144:1: entryRuleAn : ruleAn EOF ;
    public final void entryRuleAn() throws RecognitionException {
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:145:1: ( ruleAn EOF )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:146:1: ruleAn EOF
            {
             before(grammarAccess.getAnRule()); 
            pushFollow(FOLLOW_ruleAn_in_entryRuleAn241);
            ruleAn();

            state._fsp--;

             after(grammarAccess.getAnRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAn248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAn"


    // $ANTLR start "ruleAn"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:153:1: ruleAn : ( ( rule__An__Group__0 ) ) ;
    public final void ruleAn() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:157:2: ( ( ( rule__An__Group__0 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:158:1: ( ( rule__An__Group__0 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:158:1: ( ( rule__An__Group__0 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:159:1: ( rule__An__Group__0 )
            {
             before(grammarAccess.getAnAccess().getGroup()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:160:1: ( rule__An__Group__0 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:160:2: rule__An__Group__0
            {
            pushFollow(FOLLOW_rule__An__Group__0_in_ruleAn274);
            rule__An__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAn"


    // $ANTLR start "entryRuleCn"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:172:1: entryRuleCn : ruleCn EOF ;
    public final void entryRuleCn() throws RecognitionException {
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:173:1: ( ruleCn EOF )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:174:1: ruleCn EOF
            {
             before(grammarAccess.getCnRule()); 
            pushFollow(FOLLOW_ruleCn_in_entryRuleCn301);
            ruleCn();

            state._fsp--;

             after(grammarAccess.getCnRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCn308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCn"


    // $ANTLR start "ruleCn"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:181:1: ruleCn : ( ( rule__Cn__Group__0 ) ) ;
    public final void ruleCn() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:185:2: ( ( ( rule__Cn__Group__0 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:186:1: ( ( rule__Cn__Group__0 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:186:1: ( ( rule__Cn__Group__0 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:187:1: ( rule__Cn__Group__0 )
            {
             before(grammarAccess.getCnAccess().getGroup()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:188:1: ( rule__Cn__Group__0 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:188:2: rule__Cn__Group__0
            {
            pushFollow(FOLLOW_rule__Cn__Group__0_in_ruleCn334);
            rule__Cn__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCn"


    // $ANTLR start "entryRuleDn"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:200:1: entryRuleDn : ruleDn EOF ;
    public final void entryRuleDn() throws RecognitionException {
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:201:1: ( ruleDn EOF )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:202:1: ruleDn EOF
            {
             before(grammarAccess.getDnRule()); 
            pushFollow(FOLLOW_ruleDn_in_entryRuleDn361);
            ruleDn();

            state._fsp--;

             after(grammarAccess.getDnRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDn368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDn"


    // $ANTLR start "ruleDn"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:209:1: ruleDn : ( ( rule__Dn__Group__0 ) ) ;
    public final void ruleDn() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:213:2: ( ( ( rule__Dn__Group__0 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:214:1: ( ( rule__Dn__Group__0 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:214:1: ( ( rule__Dn__Group__0 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:215:1: ( rule__Dn__Group__0 )
            {
             before(grammarAccess.getDnAccess().getGroup()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:216:1: ( rule__Dn__Group__0 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:216:2: rule__Dn__Group__0
            {
            pushFollow(FOLLOW_rule__Dn__Group__0_in_ruleDn394);
            rule__Dn__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDn"


    // $ANTLR start "entryRuleAe"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:228:1: entryRuleAe : ruleAe EOF ;
    public final void entryRuleAe() throws RecognitionException {
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:229:1: ( ruleAe EOF )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:230:1: ruleAe EOF
            {
             before(grammarAccess.getAeRule()); 
            pushFollow(FOLLOW_ruleAe_in_entryRuleAe421);
            ruleAe();

            state._fsp--;

             after(grammarAccess.getAeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAe428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAe"


    // $ANTLR start "ruleAe"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:237:1: ruleAe : ( ( rule__Ae__Group__0 ) ) ;
    public final void ruleAe() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:241:2: ( ( ( rule__Ae__Group__0 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:242:1: ( ( rule__Ae__Group__0 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:242:1: ( ( rule__Ae__Group__0 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:243:1: ( rule__Ae__Group__0 )
            {
             before(grammarAccess.getAeAccess().getGroup()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:244:1: ( rule__Ae__Group__0 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:244:2: rule__Ae__Group__0
            {
            pushFollow(FOLLOW_rule__Ae__Group__0_in_ruleAe454);
            rule__Ae__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAe"


    // $ANTLR start "entryRuleCe"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:256:1: entryRuleCe : ruleCe EOF ;
    public final void entryRuleCe() throws RecognitionException {
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:257:1: ( ruleCe EOF )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:258:1: ruleCe EOF
            {
             before(grammarAccess.getCeRule()); 
            pushFollow(FOLLOW_ruleCe_in_entryRuleCe481);
            ruleCe();

            state._fsp--;

             after(grammarAccess.getCeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCe488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCe"


    // $ANTLR start "ruleCe"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:265:1: ruleCe : ( ( rule__Ce__Group__0 ) ) ;
    public final void ruleCe() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:269:2: ( ( ( rule__Ce__Group__0 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:270:1: ( ( rule__Ce__Group__0 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:270:1: ( ( rule__Ce__Group__0 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:271:1: ( rule__Ce__Group__0 )
            {
             before(grammarAccess.getCeAccess().getGroup()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:272:1: ( rule__Ce__Group__0 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:272:2: rule__Ce__Group__0
            {
            pushFollow(FOLLOW_rule__Ce__Group__0_in_ruleCe514);
            rule__Ce__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCe"


    // $ANTLR start "entryRuleDe"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:284:1: entryRuleDe : ruleDe EOF ;
    public final void entryRuleDe() throws RecognitionException {
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:285:1: ( ruleDe EOF )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:286:1: ruleDe EOF
            {
             before(grammarAccess.getDeRule()); 
            pushFollow(FOLLOW_ruleDe_in_entryRuleDe541);
            ruleDe();

            state._fsp--;

             after(grammarAccess.getDeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDe548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDe"


    // $ANTLR start "ruleDe"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:293:1: ruleDe : ( ( rule__De__Group__0 ) ) ;
    public final void ruleDe() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:297:2: ( ( ( rule__De__Group__0 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:298:1: ( ( rule__De__Group__0 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:298:1: ( ( rule__De__Group__0 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:299:1: ( rule__De__Group__0 )
            {
             before(grammarAccess.getDeAccess().getGroup()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:300:1: ( rule__De__Group__0 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:300:2: rule__De__Group__0
            {
            pushFollow(FOLLOW_rule__De__Group__0_in_ruleDe574);
            rule__De__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDe"


    // $ANTLR start "entryRuleCg"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:312:1: entryRuleCg : ruleCg EOF ;
    public final void entryRuleCg() throws RecognitionException {
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:313:1: ( ruleCg EOF )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:314:1: ruleCg EOF
            {
             before(grammarAccess.getCgRule()); 
            pushFollow(FOLLOW_ruleCg_in_entryRuleCg601);
            ruleCg();

            state._fsp--;

             after(grammarAccess.getCgRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCg608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCg"


    // $ANTLR start "ruleCg"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:321:1: ruleCg : ( ( rule__Cg__Group__0 ) ) ;
    public final void ruleCg() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:325:2: ( ( ( rule__Cg__Group__0 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:326:1: ( ( rule__Cg__Group__0 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:326:1: ( ( rule__Cg__Group__0 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:327:1: ( rule__Cg__Group__0 )
            {
             before(grammarAccess.getCgAccess().getGroup()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:328:1: ( rule__Cg__Group__0 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:328:2: rule__Cg__Group__0
            {
            pushFollow(FOLLOW_rule__Cg__Group__0_in_ruleCg634);
            rule__Cg__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCgAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCg"


    // $ANTLR start "entryRuleSt"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:340:1: entryRuleSt : ruleSt EOF ;
    public final void entryRuleSt() throws RecognitionException {
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:341:1: ( ruleSt EOF )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:342:1: ruleSt EOF
            {
             before(grammarAccess.getStRule()); 
            pushFollow(FOLLOW_ruleSt_in_entryRuleSt661);
            ruleSt();

            state._fsp--;

             after(grammarAccess.getStRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSt668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSt"


    // $ANTLR start "ruleSt"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:349:1: ruleSt : ( ( rule__St__Group__0 ) ) ;
    public final void ruleSt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:353:2: ( ( ( rule__St__Group__0 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:354:1: ( ( rule__St__Group__0 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:354:1: ( ( rule__St__Group__0 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:355:1: ( rule__St__Group__0 )
            {
             before(grammarAccess.getStAccess().getGroup()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:356:1: ( rule__St__Group__0 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:356:2: rule__St__Group__0
            {
            pushFollow(FOLLOW_rule__St__Group__0_in_ruleSt694);
            rule__St__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSt"


    // $ANTLR start "entryRuleAttributes"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:368:1: entryRuleAttributes : ruleAttributes EOF ;
    public final void entryRuleAttributes() throws RecognitionException {
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:369:1: ( ruleAttributes EOF )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:370:1: ruleAttributes EOF
            {
             before(grammarAccess.getAttributesRule()); 
            pushFollow(FOLLOW_ruleAttributes_in_entryRuleAttributes721);
            ruleAttributes();

            state._fsp--;

             after(grammarAccess.getAttributesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributes728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributes"


    // $ANTLR start "ruleAttributes"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:377:1: ruleAttributes : ( ( rule__Attributes__Group__0 ) ) ;
    public final void ruleAttributes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:381:2: ( ( ( rule__Attributes__Group__0 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:382:1: ( ( rule__Attributes__Group__0 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:382:1: ( ( rule__Attributes__Group__0 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:383:1: ( rule__Attributes__Group__0 )
            {
             before(grammarAccess.getAttributesAccess().getGroup()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:384:1: ( rule__Attributes__Group__0 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:384:2: rule__Attributes__Group__0
            {
            pushFollow(FOLLOW_rule__Attributes__Group__0_in_ruleAttributes754);
            rule__Attributes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributes"


    // $ANTLR start "entryRuleAttribute"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:396:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:397:1: ( ruleAttribute EOF )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:398:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute781);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:405:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:409:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:410:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:410:1: ( ( rule__Attribute__Group__0 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:411:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:412:1: ( rule__Attribute__Group__0 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:412:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute814);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleValue"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:424:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:425:1: ( ruleValue EOF )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:426:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue841);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue848); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:433:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:437:2: ( ( ( rule__Value__Alternatives ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:438:1: ( ( rule__Value__Alternatives ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:438:1: ( ( rule__Value__Alternatives ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:439:1: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:440:1: ( rule__Value__Alternatives )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:440:2: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_rule__Value__Alternatives_in_ruleValue874);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleArray"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:452:1: entryRuleArray : ruleArray EOF ;
    public final void entryRuleArray() throws RecognitionException {
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:453:1: ( ruleArray EOF )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:454:1: ruleArray EOF
            {
             before(grammarAccess.getArrayRule()); 
            pushFollow(FOLLOW_ruleArray_in_entryRuleArray901);
            ruleArray();

            state._fsp--;

             after(grammarAccess.getArrayRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArray908); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArray"


    // $ANTLR start "ruleArray"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:461:1: ruleArray : ( ( rule__Array__Group__0 ) ) ;
    public final void ruleArray() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:465:2: ( ( ( rule__Array__Group__0 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:466:1: ( ( rule__Array__Group__0 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:466:1: ( ( rule__Array__Group__0 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:467:1: ( rule__Array__Group__0 )
            {
             before(grammarAccess.getArrayAccess().getGroup()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:468:1: ( rule__Array__Group__0 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:468:2: rule__Array__Group__0
            {
            pushFollow(FOLLOW_rule__Array__Group__0_in_ruleArray934);
            rule__Array__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArrayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArray"


    // $ANTLR start "entryRuleMap"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:480:1: entryRuleMap : ruleMap EOF ;
    public final void entryRuleMap() throws RecognitionException {
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:481:1: ( ruleMap EOF )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:482:1: ruleMap EOF
            {
             before(grammarAccess.getMapRule()); 
            pushFollow(FOLLOW_ruleMap_in_entryRuleMap961);
            ruleMap();

            state._fsp--;

             after(grammarAccess.getMapRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMap968); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMap"


    // $ANTLR start "ruleMap"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:489:1: ruleMap : ( ( rule__Map__Group__0 ) ) ;
    public final void ruleMap() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:493:2: ( ( ( rule__Map__Group__0 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:494:1: ( ( rule__Map__Group__0 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:494:1: ( ( rule__Map__Group__0 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:495:1: ( rule__Map__Group__0 )
            {
             before(grammarAccess.getMapAccess().getGroup()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:496:1: ( rule__Map__Group__0 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:496:2: rule__Map__Group__0
            {
            pushFollow(FOLLOW_rule__Map__Group__0_in_ruleMap994);
            rule__Map__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMapAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMap"


    // $ANTLR start "entryRuleMapping"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:508:1: entryRuleMapping : ruleMapping EOF ;
    public final void entryRuleMapping() throws RecognitionException {
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:509:1: ( ruleMapping EOF )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:510:1: ruleMapping EOF
            {
             before(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_ruleMapping_in_entryRuleMapping1021);
            ruleMapping();

            state._fsp--;

             after(grammarAccess.getMappingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapping1028); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMapping"


    // $ANTLR start "ruleMapping"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:517:1: ruleMapping : ( ( rule__Mapping__Group__0 ) ) ;
    public final void ruleMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:521:2: ( ( ( rule__Mapping__Group__0 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:522:1: ( ( rule__Mapping__Group__0 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:522:1: ( ( rule__Mapping__Group__0 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:523:1: ( rule__Mapping__Group__0 )
            {
             before(grammarAccess.getMappingAccess().getGroup()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:524:1: ( rule__Mapping__Group__0 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:524:2: rule__Mapping__Group__0
            {
            pushFollow(FOLLOW_rule__Mapping__Group__0_in_ruleMapping1054);
            rule__Mapping__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleId"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:536:1: entryRuleId : ruleId EOF ;
    public final void entryRuleId() throws RecognitionException {
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:537:1: ( ruleId EOF )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:538:1: ruleId EOF
            {
             before(grammarAccess.getIdRule()); 
            pushFollow(FOLLOW_ruleId_in_entryRuleId1081);
            ruleId();

            state._fsp--;

             after(grammarAccess.getIdRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleId1088); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleId"


    // $ANTLR start "ruleId"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:545:1: ruleId : ( ( rule__Id__Alternatives ) ) ;
    public final void ruleId() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:549:2: ( ( ( rule__Id__Alternatives ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:550:1: ( ( rule__Id__Alternatives ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:550:1: ( ( rule__Id__Alternatives ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:551:1: ( rule__Id__Alternatives )
            {
             before(grammarAccess.getIdAccess().getAlternatives()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:552:1: ( rule__Id__Alternatives )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:552:2: rule__Id__Alternatives
            {
            pushFollow(FOLLOW_rule__Id__Alternatives_in_ruleId1114);
            rule__Id__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIdAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleId"


    // $ANTLR start "rule__Dgs__Alternatives_1"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:564:1: rule__Dgs__Alternatives_1 : ( ( ( rule__Dgs__EventAssignment_1_0 ) ) | ( ( rule__Dgs__CommentAssignment_1_1 ) ) | ( RULE_EOL ) );
    public final void rule__Dgs__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:568:1: ( ( ( rule__Dgs__EventAssignment_1_0 ) ) | ( ( rule__Dgs__CommentAssignment_1_1 ) ) | ( RULE_EOL ) )
            int alt1=3;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:569:1: ( ( rule__Dgs__EventAssignment_1_0 ) )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:569:1: ( ( rule__Dgs__EventAssignment_1_0 ) )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:570:1: ( rule__Dgs__EventAssignment_1_0 )
                    {
                     before(grammarAccess.getDgsAccess().getEventAssignment_1_0()); 
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:571:1: ( rule__Dgs__EventAssignment_1_0 )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:571:2: rule__Dgs__EventAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__Dgs__EventAssignment_1_0_in_rule__Dgs__Alternatives_11150);
                    rule__Dgs__EventAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDgsAccess().getEventAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:575:6: ( ( rule__Dgs__CommentAssignment_1_1 ) )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:575:6: ( ( rule__Dgs__CommentAssignment_1_1 ) )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:576:1: ( rule__Dgs__CommentAssignment_1_1 )
                    {
                     before(grammarAccess.getDgsAccess().getCommentAssignment_1_1()); 
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:577:1: ( rule__Dgs__CommentAssignment_1_1 )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:577:2: rule__Dgs__CommentAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__Dgs__CommentAssignment_1_1_in_rule__Dgs__Alternatives_11168);
                    rule__Dgs__CommentAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getDgsAccess().getCommentAssignment_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:581:6: ( RULE_EOL )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:581:6: ( RULE_EOL )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:582:1: RULE_EOL
                    {
                     before(grammarAccess.getDgsAccess().getEOLTerminalRuleCall_1_2()); 
                    match(input,RULE_EOL,FOLLOW_RULE_EOL_in_rule__Dgs__Alternatives_11186); 
                     after(grammarAccess.getDgsAccess().getEOLTerminalRuleCall_1_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dgs__Alternatives_1"


    // $ANTLR start "rule__Event__Alternatives_0"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:592:1: rule__Event__Alternatives_0 : ( ( ( rule__Event__AnAssignment_0_0 ) ) | ( ( rule__Event__CnAssignment_0_1 ) ) | ( ( rule__Event__DnAssignment_0_2 ) ) | ( ( rule__Event__AeAssignment_0_3 ) ) | ( ( rule__Event__CeAssignment_0_4 ) ) | ( ( rule__Event__DeAssignment_0_5 ) ) | ( ( rule__Event__CgAssignment_0_6 ) ) | ( ( rule__Event__StAssignment_0_7 ) ) | ( ( rule__Event__ClAssignment_0_8 ) ) );
    public final void rule__Event__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:596:1: ( ( ( rule__Event__AnAssignment_0_0 ) ) | ( ( rule__Event__CnAssignment_0_1 ) ) | ( ( rule__Event__DnAssignment_0_2 ) ) | ( ( rule__Event__AeAssignment_0_3 ) ) | ( ( rule__Event__CeAssignment_0_4 ) ) | ( ( rule__Event__DeAssignment_0_5 ) ) | ( ( rule__Event__CgAssignment_0_6 ) ) | ( ( rule__Event__StAssignment_0_7 ) ) | ( ( rule__Event__ClAssignment_0_8 ) ) )
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
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:597:1: ( ( rule__Event__AnAssignment_0_0 ) )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:597:1: ( ( rule__Event__AnAssignment_0_0 ) )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:598:1: ( rule__Event__AnAssignment_0_0 )
                    {
                     before(grammarAccess.getEventAccess().getAnAssignment_0_0()); 
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:599:1: ( rule__Event__AnAssignment_0_0 )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:599:2: rule__Event__AnAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__Event__AnAssignment_0_0_in_rule__Event__Alternatives_01218);
                    rule__Event__AnAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEventAccess().getAnAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:603:6: ( ( rule__Event__CnAssignment_0_1 ) )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:603:6: ( ( rule__Event__CnAssignment_0_1 ) )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:604:1: ( rule__Event__CnAssignment_0_1 )
                    {
                     before(grammarAccess.getEventAccess().getCnAssignment_0_1()); 
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:605:1: ( rule__Event__CnAssignment_0_1 )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:605:2: rule__Event__CnAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__Event__CnAssignment_0_1_in_rule__Event__Alternatives_01236);
                    rule__Event__CnAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getEventAccess().getCnAssignment_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:609:6: ( ( rule__Event__DnAssignment_0_2 ) )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:609:6: ( ( rule__Event__DnAssignment_0_2 ) )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:610:1: ( rule__Event__DnAssignment_0_2 )
                    {
                     before(grammarAccess.getEventAccess().getDnAssignment_0_2()); 
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:611:1: ( rule__Event__DnAssignment_0_2 )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:611:2: rule__Event__DnAssignment_0_2
                    {
                    pushFollow(FOLLOW_rule__Event__DnAssignment_0_2_in_rule__Event__Alternatives_01254);
                    rule__Event__DnAssignment_0_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getEventAccess().getDnAssignment_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:615:6: ( ( rule__Event__AeAssignment_0_3 ) )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:615:6: ( ( rule__Event__AeAssignment_0_3 ) )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:616:1: ( rule__Event__AeAssignment_0_3 )
                    {
                     before(grammarAccess.getEventAccess().getAeAssignment_0_3()); 
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:617:1: ( rule__Event__AeAssignment_0_3 )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:617:2: rule__Event__AeAssignment_0_3
                    {
                    pushFollow(FOLLOW_rule__Event__AeAssignment_0_3_in_rule__Event__Alternatives_01272);
                    rule__Event__AeAssignment_0_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getEventAccess().getAeAssignment_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:621:6: ( ( rule__Event__CeAssignment_0_4 ) )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:621:6: ( ( rule__Event__CeAssignment_0_4 ) )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:622:1: ( rule__Event__CeAssignment_0_4 )
                    {
                     before(grammarAccess.getEventAccess().getCeAssignment_0_4()); 
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:623:1: ( rule__Event__CeAssignment_0_4 )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:623:2: rule__Event__CeAssignment_0_4
                    {
                    pushFollow(FOLLOW_rule__Event__CeAssignment_0_4_in_rule__Event__Alternatives_01290);
                    rule__Event__CeAssignment_0_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getEventAccess().getCeAssignment_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:627:6: ( ( rule__Event__DeAssignment_0_5 ) )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:627:6: ( ( rule__Event__DeAssignment_0_5 ) )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:628:1: ( rule__Event__DeAssignment_0_5 )
                    {
                     before(grammarAccess.getEventAccess().getDeAssignment_0_5()); 
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:629:1: ( rule__Event__DeAssignment_0_5 )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:629:2: rule__Event__DeAssignment_0_5
                    {
                    pushFollow(FOLLOW_rule__Event__DeAssignment_0_5_in_rule__Event__Alternatives_01308);
                    rule__Event__DeAssignment_0_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getEventAccess().getDeAssignment_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:633:6: ( ( rule__Event__CgAssignment_0_6 ) )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:633:6: ( ( rule__Event__CgAssignment_0_6 ) )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:634:1: ( rule__Event__CgAssignment_0_6 )
                    {
                     before(grammarAccess.getEventAccess().getCgAssignment_0_6()); 
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:635:1: ( rule__Event__CgAssignment_0_6 )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:635:2: rule__Event__CgAssignment_0_6
                    {
                    pushFollow(FOLLOW_rule__Event__CgAssignment_0_6_in_rule__Event__Alternatives_01326);
                    rule__Event__CgAssignment_0_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getEventAccess().getCgAssignment_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:639:6: ( ( rule__Event__StAssignment_0_7 ) )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:639:6: ( ( rule__Event__StAssignment_0_7 ) )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:640:1: ( rule__Event__StAssignment_0_7 )
                    {
                     before(grammarAccess.getEventAccess().getStAssignment_0_7()); 
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:641:1: ( rule__Event__StAssignment_0_7 )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:641:2: rule__Event__StAssignment_0_7
                    {
                    pushFollow(FOLLOW_rule__Event__StAssignment_0_7_in_rule__Event__Alternatives_01344);
                    rule__Event__StAssignment_0_7();

                    state._fsp--;


                    }

                     after(grammarAccess.getEventAccess().getStAssignment_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:645:6: ( ( rule__Event__ClAssignment_0_8 ) )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:645:6: ( ( rule__Event__ClAssignment_0_8 ) )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:646:1: ( rule__Event__ClAssignment_0_8 )
                    {
                     before(grammarAccess.getEventAccess().getClAssignment_0_8()); 
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:647:1: ( rule__Event__ClAssignment_0_8 )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:647:2: rule__Event__ClAssignment_0_8
                    {
                    pushFollow(FOLLOW_rule__Event__ClAssignment_0_8_in_rule__Event__Alternatives_01362);
                    rule__Event__ClAssignment_0_8();

                    state._fsp--;


                    }

                     after(grammarAccess.getEventAccess().getClAssignment_0_8()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Alternatives_0"


    // $ANTLR start "rule__Event__Alternatives_1"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:656:1: rule__Event__Alternatives_1 : ( ( ( rule__Event__CommentAssignment_1_0 ) ) | ( RULE_EOL ) );
    public final void rule__Event__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:660:1: ( ( ( rule__Event__CommentAssignment_1_0 ) ) | ( RULE_EOL ) )
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
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:661:1: ( ( rule__Event__CommentAssignment_1_0 ) )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:661:1: ( ( rule__Event__CommentAssignment_1_0 ) )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:662:1: ( rule__Event__CommentAssignment_1_0 )
                    {
                     before(grammarAccess.getEventAccess().getCommentAssignment_1_0()); 
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:663:1: ( rule__Event__CommentAssignment_1_0 )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:663:2: rule__Event__CommentAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__Event__CommentAssignment_1_0_in_rule__Event__Alternatives_11395);
                    rule__Event__CommentAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEventAccess().getCommentAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:667:6: ( RULE_EOL )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:667:6: ( RULE_EOL )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:668:1: RULE_EOL
                    {
                     before(grammarAccess.getEventAccess().getEOLTerminalRuleCall_1_1()); 
                    match(input,RULE_EOL,FOLLOW_RULE_EOL_in_rule__Event__Alternatives_11413); 
                     after(grammarAccess.getEventAccess().getEOLTerminalRuleCall_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Alternatives_1"


    // $ANTLR start "rule__Value__Alternatives"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:678:1: rule__Value__Alternatives : ( ( ( rule__Value__StringAssignment_0 ) ) | ( ( rule__Value__RealAssignment_1 ) ) | ( ( rule__Value__IntAssignment_2 ) ) | ( ( rule__Value__ArrayAssignment_3 ) ) | ( ( rule__Value__MapAssignment_4 ) ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:682:1: ( ( ( rule__Value__StringAssignment_0 ) ) | ( ( rule__Value__RealAssignment_1 ) ) | ( ( rule__Value__IntAssignment_2 ) ) | ( ( rule__Value__ArrayAssignment_3 ) ) | ( ( rule__Value__MapAssignment_4 ) ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt4=1;
                }
                break;
            case RULE_REAL:
                {
                alt4=2;
                }
                break;
            case RULE_INT:
                {
                alt4=3;
                }
                break;
            case 25:
                {
                alt4=4;
                }
                break;
            case 27:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:683:1: ( ( rule__Value__StringAssignment_0 ) )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:683:1: ( ( rule__Value__StringAssignment_0 ) )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:684:1: ( rule__Value__StringAssignment_0 )
                    {
                     before(grammarAccess.getValueAccess().getStringAssignment_0()); 
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:685:1: ( rule__Value__StringAssignment_0 )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:685:2: rule__Value__StringAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Value__StringAssignment_0_in_rule__Value__Alternatives1445);
                    rule__Value__StringAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getStringAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:689:6: ( ( rule__Value__RealAssignment_1 ) )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:689:6: ( ( rule__Value__RealAssignment_1 ) )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:690:1: ( rule__Value__RealAssignment_1 )
                    {
                     before(grammarAccess.getValueAccess().getRealAssignment_1()); 
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:691:1: ( rule__Value__RealAssignment_1 )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:691:2: rule__Value__RealAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Value__RealAssignment_1_in_rule__Value__Alternatives1463);
                    rule__Value__RealAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getRealAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:695:6: ( ( rule__Value__IntAssignment_2 ) )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:695:6: ( ( rule__Value__IntAssignment_2 ) )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:696:1: ( rule__Value__IntAssignment_2 )
                    {
                     before(grammarAccess.getValueAccess().getIntAssignment_2()); 
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:697:1: ( rule__Value__IntAssignment_2 )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:697:2: rule__Value__IntAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Value__IntAssignment_2_in_rule__Value__Alternatives1481);
                    rule__Value__IntAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getIntAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:701:6: ( ( rule__Value__ArrayAssignment_3 ) )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:701:6: ( ( rule__Value__ArrayAssignment_3 ) )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:702:1: ( rule__Value__ArrayAssignment_3 )
                    {
                     before(grammarAccess.getValueAccess().getArrayAssignment_3()); 
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:703:1: ( rule__Value__ArrayAssignment_3 )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:703:2: rule__Value__ArrayAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Value__ArrayAssignment_3_in_rule__Value__Alternatives1499);
                    rule__Value__ArrayAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getArrayAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:707:6: ( ( rule__Value__MapAssignment_4 ) )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:707:6: ( ( rule__Value__MapAssignment_4 ) )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:708:1: ( rule__Value__MapAssignment_4 )
                    {
                     before(grammarAccess.getValueAccess().getMapAssignment_4()); 
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:709:1: ( rule__Value__MapAssignment_4 )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:709:2: rule__Value__MapAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Value__MapAssignment_4_in_rule__Value__Alternatives1517);
                    rule__Value__MapAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getMapAssignment_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__Id__Alternatives"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:718:1: rule__Id__Alternatives : ( ( RULE_STRING ) | ( RULE_INT ) | ( ( rule__Id__Group_2__0 ) ) );
    public final void rule__Id__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:722:1: ( ( RULE_STRING ) | ( RULE_INT ) | ( ( rule__Id__Group_2__0 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt5=1;
                }
                break;
            case RULE_INT:
                {
                alt5=2;
                }
                break;
            case RULE_WORD:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:723:1: ( RULE_STRING )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:723:1: ( RULE_STRING )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:724:1: RULE_STRING
                    {
                     before(grammarAccess.getIdAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Id__Alternatives1550); 
                     after(grammarAccess.getIdAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:729:6: ( RULE_INT )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:729:6: ( RULE_INT )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:730:1: RULE_INT
                    {
                     before(grammarAccess.getIdAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Id__Alternatives1567); 
                     after(grammarAccess.getIdAccess().getINTTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:735:6: ( ( rule__Id__Group_2__0 ) )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:735:6: ( ( rule__Id__Group_2__0 ) )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:736:1: ( rule__Id__Group_2__0 )
                    {
                     before(grammarAccess.getIdAccess().getGroup_2()); 
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:737:1: ( rule__Id__Group_2__0 )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:737:2: rule__Id__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Id__Group_2__0_in_rule__Id__Alternatives1584);
                    rule__Id__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIdAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Id__Alternatives"


    // $ANTLR start "rule__Dgs__Group__0"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:748:1: rule__Dgs__Group__0 : rule__Dgs__Group__0__Impl rule__Dgs__Group__1 ;
    public final void rule__Dgs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:752:1: ( rule__Dgs__Group__0__Impl rule__Dgs__Group__1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:753:2: rule__Dgs__Group__0__Impl rule__Dgs__Group__1
            {
            pushFollow(FOLLOW_rule__Dgs__Group__0__Impl_in_rule__Dgs__Group__01615);
            rule__Dgs__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Dgs__Group__1_in_rule__Dgs__Group__01618);
            rule__Dgs__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dgs__Group__0"


    // $ANTLR start "rule__Dgs__Group__0__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:760:1: rule__Dgs__Group__0__Impl : ( ( rule__Dgs__HeaderAssignment_0 ) ) ;
    public final void rule__Dgs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:764:1: ( ( ( rule__Dgs__HeaderAssignment_0 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:765:1: ( ( rule__Dgs__HeaderAssignment_0 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:765:1: ( ( rule__Dgs__HeaderAssignment_0 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:766:1: ( rule__Dgs__HeaderAssignment_0 )
            {
             before(grammarAccess.getDgsAccess().getHeaderAssignment_0()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:767:1: ( rule__Dgs__HeaderAssignment_0 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:767:2: rule__Dgs__HeaderAssignment_0
            {
            pushFollow(FOLLOW_rule__Dgs__HeaderAssignment_0_in_rule__Dgs__Group__0__Impl1645);
            rule__Dgs__HeaderAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDgsAccess().getHeaderAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dgs__Group__0__Impl"


    // $ANTLR start "rule__Dgs__Group__1"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:777:1: rule__Dgs__Group__1 : rule__Dgs__Group__1__Impl ;
    public final void rule__Dgs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:781:1: ( rule__Dgs__Group__1__Impl )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:782:2: rule__Dgs__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Dgs__Group__1__Impl_in_rule__Dgs__Group__11675);
            rule__Dgs__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dgs__Group__1"


    // $ANTLR start "rule__Dgs__Group__1__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:788:1: rule__Dgs__Group__1__Impl : ( ( rule__Dgs__Alternatives_1 )* ) ;
    public final void rule__Dgs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:792:1: ( ( ( rule__Dgs__Alternatives_1 )* ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:793:1: ( ( rule__Dgs__Alternatives_1 )* )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:793:1: ( ( rule__Dgs__Alternatives_1 )* )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:794:1: ( rule__Dgs__Alternatives_1 )*
            {
             before(grammarAccess.getDgsAccess().getAlternatives_1()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:795:1: ( rule__Dgs__Alternatives_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_EOL||LA6_0==RULE_COMMENT||LA6_0==RULE_CL||(LA6_0>=16 && LA6_0<=23)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:795:2: rule__Dgs__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__Dgs__Alternatives_1_in_rule__Dgs__Group__1__Impl1702);
            	    rule__Dgs__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getDgsAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dgs__Group__1__Impl"


    // $ANTLR start "rule__Header__Group__0"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:809:1: rule__Header__Group__0 : rule__Header__Group__0__Impl rule__Header__Group__1 ;
    public final void rule__Header__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:813:1: ( rule__Header__Group__0__Impl rule__Header__Group__1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:814:2: rule__Header__Group__0__Impl rule__Header__Group__1
            {
            pushFollow(FOLLOW_rule__Header__Group__0__Impl_in_rule__Header__Group__01737);
            rule__Header__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group__1_in_rule__Header__Group__01740);
            rule__Header__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__0"


    // $ANTLR start "rule__Header__Group__0__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:821:1: rule__Header__Group__0__Impl : ( ( rule__Header__MagicAssignment_0 ) ) ;
    public final void rule__Header__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:825:1: ( ( ( rule__Header__MagicAssignment_0 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:826:1: ( ( rule__Header__MagicAssignment_0 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:826:1: ( ( rule__Header__MagicAssignment_0 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:827:1: ( rule__Header__MagicAssignment_0 )
            {
             before(grammarAccess.getHeaderAccess().getMagicAssignment_0()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:828:1: ( rule__Header__MagicAssignment_0 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:828:2: rule__Header__MagicAssignment_0
            {
            pushFollow(FOLLOW_rule__Header__MagicAssignment_0_in_rule__Header__Group__0__Impl1767);
            rule__Header__MagicAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getMagicAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__0__Impl"


    // $ANTLR start "rule__Header__Group__1"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:838:1: rule__Header__Group__1 : rule__Header__Group__1__Impl rule__Header__Group__2 ;
    public final void rule__Header__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:842:1: ( rule__Header__Group__1__Impl rule__Header__Group__2 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:843:2: rule__Header__Group__1__Impl rule__Header__Group__2
            {
            pushFollow(FOLLOW_rule__Header__Group__1__Impl_in_rule__Header__Group__11797);
            rule__Header__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group__2_in_rule__Header__Group__11800);
            rule__Header__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__1"


    // $ANTLR start "rule__Header__Group__1__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:850:1: rule__Header__Group__1__Impl : ( RULE_EOL ) ;
    public final void rule__Header__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:854:1: ( ( RULE_EOL ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:855:1: ( RULE_EOL )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:855:1: ( RULE_EOL )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:856:1: RULE_EOL
            {
             before(grammarAccess.getHeaderAccess().getEOLTerminalRuleCall_1()); 
            match(input,RULE_EOL,FOLLOW_RULE_EOL_in_rule__Header__Group__1__Impl1827); 
             after(grammarAccess.getHeaderAccess().getEOLTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__1__Impl"


    // $ANTLR start "rule__Header__Group__2"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:867:1: rule__Header__Group__2 : rule__Header__Group__2__Impl rule__Header__Group__3 ;
    public final void rule__Header__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:871:1: ( rule__Header__Group__2__Impl rule__Header__Group__3 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:872:2: rule__Header__Group__2__Impl rule__Header__Group__3
            {
            pushFollow(FOLLOW_rule__Header__Group__2__Impl_in_rule__Header__Group__21856);
            rule__Header__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group__3_in_rule__Header__Group__21859);
            rule__Header__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__2"


    // $ANTLR start "rule__Header__Group__2__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:879:1: rule__Header__Group__2__Impl : ( ( rule__Header__NameAssignment_2 ) ) ;
    public final void rule__Header__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:883:1: ( ( ( rule__Header__NameAssignment_2 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:884:1: ( ( rule__Header__NameAssignment_2 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:884:1: ( ( rule__Header__NameAssignment_2 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:885:1: ( rule__Header__NameAssignment_2 )
            {
             before(grammarAccess.getHeaderAccess().getNameAssignment_2()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:886:1: ( rule__Header__NameAssignment_2 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:886:2: rule__Header__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Header__NameAssignment_2_in_rule__Header__Group__2__Impl1886);
            rule__Header__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__2__Impl"


    // $ANTLR start "rule__Header__Group__3"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:896:1: rule__Header__Group__3 : rule__Header__Group__3__Impl rule__Header__Group__4 ;
    public final void rule__Header__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:900:1: ( rule__Header__Group__3__Impl rule__Header__Group__4 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:901:2: rule__Header__Group__3__Impl rule__Header__Group__4
            {
            pushFollow(FOLLOW_rule__Header__Group__3__Impl_in_rule__Header__Group__31916);
            rule__Header__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group__4_in_rule__Header__Group__31919);
            rule__Header__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__3"


    // $ANTLR start "rule__Header__Group__3__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:908:1: rule__Header__Group__3__Impl : ( ( rule__Header__NumberOfStepsAssignment_3 ) ) ;
    public final void rule__Header__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:912:1: ( ( ( rule__Header__NumberOfStepsAssignment_3 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:913:1: ( ( rule__Header__NumberOfStepsAssignment_3 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:913:1: ( ( rule__Header__NumberOfStepsAssignment_3 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:914:1: ( rule__Header__NumberOfStepsAssignment_3 )
            {
             before(grammarAccess.getHeaderAccess().getNumberOfStepsAssignment_3()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:915:1: ( rule__Header__NumberOfStepsAssignment_3 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:915:2: rule__Header__NumberOfStepsAssignment_3
            {
            pushFollow(FOLLOW_rule__Header__NumberOfStepsAssignment_3_in_rule__Header__Group__3__Impl1946);
            rule__Header__NumberOfStepsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getNumberOfStepsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__3__Impl"


    // $ANTLR start "rule__Header__Group__4"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:925:1: rule__Header__Group__4 : rule__Header__Group__4__Impl rule__Header__Group__5 ;
    public final void rule__Header__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:929:1: ( rule__Header__Group__4__Impl rule__Header__Group__5 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:930:2: rule__Header__Group__4__Impl rule__Header__Group__5
            {
            pushFollow(FOLLOW_rule__Header__Group__4__Impl_in_rule__Header__Group__41976);
            rule__Header__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group__5_in_rule__Header__Group__41979);
            rule__Header__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__4"


    // $ANTLR start "rule__Header__Group__4__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:937:1: rule__Header__Group__4__Impl : ( ( rule__Header__NumberOfEventsAssignment_4 ) ) ;
    public final void rule__Header__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:941:1: ( ( ( rule__Header__NumberOfEventsAssignment_4 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:942:1: ( ( rule__Header__NumberOfEventsAssignment_4 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:942:1: ( ( rule__Header__NumberOfEventsAssignment_4 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:943:1: ( rule__Header__NumberOfEventsAssignment_4 )
            {
             before(grammarAccess.getHeaderAccess().getNumberOfEventsAssignment_4()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:944:1: ( rule__Header__NumberOfEventsAssignment_4 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:944:2: rule__Header__NumberOfEventsAssignment_4
            {
            pushFollow(FOLLOW_rule__Header__NumberOfEventsAssignment_4_in_rule__Header__Group__4__Impl2006);
            rule__Header__NumberOfEventsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getNumberOfEventsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__4__Impl"


    // $ANTLR start "rule__Header__Group__5"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:954:1: rule__Header__Group__5 : rule__Header__Group__5__Impl ;
    public final void rule__Header__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:958:1: ( rule__Header__Group__5__Impl )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:959:2: rule__Header__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Header__Group__5__Impl_in_rule__Header__Group__52036);
            rule__Header__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__5"


    // $ANTLR start "rule__Header__Group__5__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:965:1: rule__Header__Group__5__Impl : ( RULE_EOL ) ;
    public final void rule__Header__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:969:1: ( ( RULE_EOL ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:970:1: ( RULE_EOL )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:970:1: ( RULE_EOL )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:971:1: RULE_EOL
            {
             before(grammarAccess.getHeaderAccess().getEOLTerminalRuleCall_5()); 
            match(input,RULE_EOL,FOLLOW_RULE_EOL_in_rule__Header__Group__5__Impl2063); 
             after(grammarAccess.getHeaderAccess().getEOLTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__Group__5__Impl"


    // $ANTLR start "rule__Event__Group__0"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:994:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:998:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:999:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__02104);
            rule__Event__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group__1_in_rule__Event__Group__02107);
            rule__Event__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0"


    // $ANTLR start "rule__Event__Group__0__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1006:1: rule__Event__Group__0__Impl : ( ( rule__Event__Alternatives_0 ) ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1010:1: ( ( ( rule__Event__Alternatives_0 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1011:1: ( ( rule__Event__Alternatives_0 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1011:1: ( ( rule__Event__Alternatives_0 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1012:1: ( rule__Event__Alternatives_0 )
            {
             before(grammarAccess.getEventAccess().getAlternatives_0()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1013:1: ( rule__Event__Alternatives_0 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1013:2: rule__Event__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Event__Alternatives_0_in_rule__Event__Group__0__Impl2134);
            rule__Event__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0__Impl"


    // $ANTLR start "rule__Event__Group__1"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1023:1: rule__Event__Group__1 : rule__Event__Group__1__Impl ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1027:1: ( rule__Event__Group__1__Impl )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1028:2: rule__Event__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__12164);
            rule__Event__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1"


    // $ANTLR start "rule__Event__Group__1__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1034:1: rule__Event__Group__1__Impl : ( ( rule__Event__Alternatives_1 ) ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1038:1: ( ( ( rule__Event__Alternatives_1 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1039:1: ( ( rule__Event__Alternatives_1 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1039:1: ( ( rule__Event__Alternatives_1 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1040:1: ( rule__Event__Alternatives_1 )
            {
             before(grammarAccess.getEventAccess().getAlternatives_1()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1041:1: ( rule__Event__Alternatives_1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1041:2: rule__Event__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Event__Alternatives_1_in_rule__Event__Group__1__Impl2191);
            rule__Event__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1__Impl"


    // $ANTLR start "rule__An__Group__0"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1055:1: rule__An__Group__0 : rule__An__Group__0__Impl rule__An__Group__1 ;
    public final void rule__An__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1059:1: ( rule__An__Group__0__Impl rule__An__Group__1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1060:2: rule__An__Group__0__Impl rule__An__Group__1
            {
            pushFollow(FOLLOW_rule__An__Group__0__Impl_in_rule__An__Group__02225);
            rule__An__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__An__Group__1_in_rule__An__Group__02228);
            rule__An__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__An__Group__0"


    // $ANTLR start "rule__An__Group__0__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1067:1: rule__An__Group__0__Impl : ( 'an' ) ;
    public final void rule__An__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1071:1: ( ( 'an' ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1072:1: ( 'an' )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1072:1: ( 'an' )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1073:1: 'an'
            {
             before(grammarAccess.getAnAccess().getAnKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__An__Group__0__Impl2256); 
             after(grammarAccess.getAnAccess().getAnKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__An__Group__0__Impl"


    // $ANTLR start "rule__An__Group__1"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1086:1: rule__An__Group__1 : rule__An__Group__1__Impl rule__An__Group__2 ;
    public final void rule__An__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1090:1: ( rule__An__Group__1__Impl rule__An__Group__2 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1091:2: rule__An__Group__1__Impl rule__An__Group__2
            {
            pushFollow(FOLLOW_rule__An__Group__1__Impl_in_rule__An__Group__12287);
            rule__An__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__An__Group__2_in_rule__An__Group__12290);
            rule__An__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__An__Group__1"


    // $ANTLR start "rule__An__Group__1__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1098:1: rule__An__Group__1__Impl : ( ( rule__An__IdNodeAssignment_1 ) ) ;
    public final void rule__An__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1102:1: ( ( ( rule__An__IdNodeAssignment_1 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1103:1: ( ( rule__An__IdNodeAssignment_1 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1103:1: ( ( rule__An__IdNodeAssignment_1 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1104:1: ( rule__An__IdNodeAssignment_1 )
            {
             before(grammarAccess.getAnAccess().getIdNodeAssignment_1()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1105:1: ( rule__An__IdNodeAssignment_1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1105:2: rule__An__IdNodeAssignment_1
            {
            pushFollow(FOLLOW_rule__An__IdNodeAssignment_1_in_rule__An__Group__1__Impl2317);
            rule__An__IdNodeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAnAccess().getIdNodeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__An__Group__1__Impl"


    // $ANTLR start "rule__An__Group__2"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1115:1: rule__An__Group__2 : rule__An__Group__2__Impl ;
    public final void rule__An__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1119:1: ( rule__An__Group__2__Impl )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1120:2: rule__An__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__An__Group__2__Impl_in_rule__An__Group__22347);
            rule__An__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__An__Group__2"


    // $ANTLR start "rule__An__Group__2__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1126:1: rule__An__Group__2__Impl : ( ( rule__An__AttributesAssignment_2 ) ) ;
    public final void rule__An__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1130:1: ( ( ( rule__An__AttributesAssignment_2 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1131:1: ( ( rule__An__AttributesAssignment_2 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1131:1: ( ( rule__An__AttributesAssignment_2 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1132:1: ( rule__An__AttributesAssignment_2 )
            {
             before(grammarAccess.getAnAccess().getAttributesAssignment_2()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1133:1: ( rule__An__AttributesAssignment_2 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1133:2: rule__An__AttributesAssignment_2
            {
            pushFollow(FOLLOW_rule__An__AttributesAssignment_2_in_rule__An__Group__2__Impl2374);
            rule__An__AttributesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAnAccess().getAttributesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__An__Group__2__Impl"


    // $ANTLR start "rule__Cn__Group__0"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1149:1: rule__Cn__Group__0 : rule__Cn__Group__0__Impl rule__Cn__Group__1 ;
    public final void rule__Cn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1153:1: ( rule__Cn__Group__0__Impl rule__Cn__Group__1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1154:2: rule__Cn__Group__0__Impl rule__Cn__Group__1
            {
            pushFollow(FOLLOW_rule__Cn__Group__0__Impl_in_rule__Cn__Group__02410);
            rule__Cn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cn__Group__1_in_rule__Cn__Group__02413);
            rule__Cn__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cn__Group__0"


    // $ANTLR start "rule__Cn__Group__0__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1161:1: rule__Cn__Group__0__Impl : ( 'cn' ) ;
    public final void rule__Cn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1165:1: ( ( 'cn' ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1166:1: ( 'cn' )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1166:1: ( 'cn' )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1167:1: 'cn'
            {
             before(grammarAccess.getCnAccess().getCnKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Cn__Group__0__Impl2441); 
             after(grammarAccess.getCnAccess().getCnKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cn__Group__0__Impl"


    // $ANTLR start "rule__Cn__Group__1"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1180:1: rule__Cn__Group__1 : rule__Cn__Group__1__Impl rule__Cn__Group__2 ;
    public final void rule__Cn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1184:1: ( rule__Cn__Group__1__Impl rule__Cn__Group__2 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1185:2: rule__Cn__Group__1__Impl rule__Cn__Group__2
            {
            pushFollow(FOLLOW_rule__Cn__Group__1__Impl_in_rule__Cn__Group__12472);
            rule__Cn__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cn__Group__2_in_rule__Cn__Group__12475);
            rule__Cn__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cn__Group__1"


    // $ANTLR start "rule__Cn__Group__1__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1192:1: rule__Cn__Group__1__Impl : ( ( rule__Cn__IdNodeAssignment_1 ) ) ;
    public final void rule__Cn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1196:1: ( ( ( rule__Cn__IdNodeAssignment_1 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1197:1: ( ( rule__Cn__IdNodeAssignment_1 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1197:1: ( ( rule__Cn__IdNodeAssignment_1 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1198:1: ( rule__Cn__IdNodeAssignment_1 )
            {
             before(grammarAccess.getCnAccess().getIdNodeAssignment_1()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1199:1: ( rule__Cn__IdNodeAssignment_1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1199:2: rule__Cn__IdNodeAssignment_1
            {
            pushFollow(FOLLOW_rule__Cn__IdNodeAssignment_1_in_rule__Cn__Group__1__Impl2502);
            rule__Cn__IdNodeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCnAccess().getIdNodeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cn__Group__1__Impl"


    // $ANTLR start "rule__Cn__Group__2"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1209:1: rule__Cn__Group__2 : rule__Cn__Group__2__Impl ;
    public final void rule__Cn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1213:1: ( rule__Cn__Group__2__Impl )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1214:2: rule__Cn__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Cn__Group__2__Impl_in_rule__Cn__Group__22532);
            rule__Cn__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cn__Group__2"


    // $ANTLR start "rule__Cn__Group__2__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1220:1: rule__Cn__Group__2__Impl : ( ( rule__Cn__AttributesAssignment_2 ) ) ;
    public final void rule__Cn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1224:1: ( ( ( rule__Cn__AttributesAssignment_2 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1225:1: ( ( rule__Cn__AttributesAssignment_2 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1225:1: ( ( rule__Cn__AttributesAssignment_2 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1226:1: ( rule__Cn__AttributesAssignment_2 )
            {
             before(grammarAccess.getCnAccess().getAttributesAssignment_2()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1227:1: ( rule__Cn__AttributesAssignment_2 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1227:2: rule__Cn__AttributesAssignment_2
            {
            pushFollow(FOLLOW_rule__Cn__AttributesAssignment_2_in_rule__Cn__Group__2__Impl2559);
            rule__Cn__AttributesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCnAccess().getAttributesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cn__Group__2__Impl"


    // $ANTLR start "rule__Dn__Group__0"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1243:1: rule__Dn__Group__0 : rule__Dn__Group__0__Impl rule__Dn__Group__1 ;
    public final void rule__Dn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1247:1: ( rule__Dn__Group__0__Impl rule__Dn__Group__1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1248:2: rule__Dn__Group__0__Impl rule__Dn__Group__1
            {
            pushFollow(FOLLOW_rule__Dn__Group__0__Impl_in_rule__Dn__Group__02595);
            rule__Dn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Dn__Group__1_in_rule__Dn__Group__02598);
            rule__Dn__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dn__Group__0"


    // $ANTLR start "rule__Dn__Group__0__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1255:1: rule__Dn__Group__0__Impl : ( 'dn' ) ;
    public final void rule__Dn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1259:1: ( ( 'dn' ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1260:1: ( 'dn' )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1260:1: ( 'dn' )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1261:1: 'dn'
            {
             before(grammarAccess.getDnAccess().getDnKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Dn__Group__0__Impl2626); 
             after(grammarAccess.getDnAccess().getDnKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dn__Group__0__Impl"


    // $ANTLR start "rule__Dn__Group__1"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1274:1: rule__Dn__Group__1 : rule__Dn__Group__1__Impl ;
    public final void rule__Dn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1278:1: ( rule__Dn__Group__1__Impl )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1279:2: rule__Dn__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Dn__Group__1__Impl_in_rule__Dn__Group__12657);
            rule__Dn__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dn__Group__1"


    // $ANTLR start "rule__Dn__Group__1__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1285:1: rule__Dn__Group__1__Impl : ( ( rule__Dn__IdNodeAssignment_1 ) ) ;
    public final void rule__Dn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1289:1: ( ( ( rule__Dn__IdNodeAssignment_1 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1290:1: ( ( rule__Dn__IdNodeAssignment_1 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1290:1: ( ( rule__Dn__IdNodeAssignment_1 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1291:1: ( rule__Dn__IdNodeAssignment_1 )
            {
             before(grammarAccess.getDnAccess().getIdNodeAssignment_1()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1292:1: ( rule__Dn__IdNodeAssignment_1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1292:2: rule__Dn__IdNodeAssignment_1
            {
            pushFollow(FOLLOW_rule__Dn__IdNodeAssignment_1_in_rule__Dn__Group__1__Impl2684);
            rule__Dn__IdNodeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDnAccess().getIdNodeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dn__Group__1__Impl"


    // $ANTLR start "rule__Ae__Group__0"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1306:1: rule__Ae__Group__0 : rule__Ae__Group__0__Impl rule__Ae__Group__1 ;
    public final void rule__Ae__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1310:1: ( rule__Ae__Group__0__Impl rule__Ae__Group__1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1311:2: rule__Ae__Group__0__Impl rule__Ae__Group__1
            {
            pushFollow(FOLLOW_rule__Ae__Group__0__Impl_in_rule__Ae__Group__02718);
            rule__Ae__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ae__Group__1_in_rule__Ae__Group__02721);
            rule__Ae__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ae__Group__0"


    // $ANTLR start "rule__Ae__Group__0__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1318:1: rule__Ae__Group__0__Impl : ( 'ae' ) ;
    public final void rule__Ae__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1322:1: ( ( 'ae' ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1323:1: ( 'ae' )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1323:1: ( 'ae' )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1324:1: 'ae'
            {
             before(grammarAccess.getAeAccess().getAeKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Ae__Group__0__Impl2749); 
             after(grammarAccess.getAeAccess().getAeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ae__Group__0__Impl"


    // $ANTLR start "rule__Ae__Group__1"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1337:1: rule__Ae__Group__1 : rule__Ae__Group__1__Impl rule__Ae__Group__2 ;
    public final void rule__Ae__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1341:1: ( rule__Ae__Group__1__Impl rule__Ae__Group__2 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1342:2: rule__Ae__Group__1__Impl rule__Ae__Group__2
            {
            pushFollow(FOLLOW_rule__Ae__Group__1__Impl_in_rule__Ae__Group__12780);
            rule__Ae__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ae__Group__2_in_rule__Ae__Group__12783);
            rule__Ae__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ae__Group__1"


    // $ANTLR start "rule__Ae__Group__1__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1349:1: rule__Ae__Group__1__Impl : ( ( rule__Ae__IdEdgeAssignment_1 ) ) ;
    public final void rule__Ae__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1353:1: ( ( ( rule__Ae__IdEdgeAssignment_1 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1354:1: ( ( rule__Ae__IdEdgeAssignment_1 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1354:1: ( ( rule__Ae__IdEdgeAssignment_1 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1355:1: ( rule__Ae__IdEdgeAssignment_1 )
            {
             before(grammarAccess.getAeAccess().getIdEdgeAssignment_1()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1356:1: ( rule__Ae__IdEdgeAssignment_1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1356:2: rule__Ae__IdEdgeAssignment_1
            {
            pushFollow(FOLLOW_rule__Ae__IdEdgeAssignment_1_in_rule__Ae__Group__1__Impl2810);
            rule__Ae__IdEdgeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAeAccess().getIdEdgeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ae__Group__1__Impl"


    // $ANTLR start "rule__Ae__Group__2"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1366:1: rule__Ae__Group__2 : rule__Ae__Group__2__Impl rule__Ae__Group__3 ;
    public final void rule__Ae__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1370:1: ( rule__Ae__Group__2__Impl rule__Ae__Group__3 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1371:2: rule__Ae__Group__2__Impl rule__Ae__Group__3
            {
            pushFollow(FOLLOW_rule__Ae__Group__2__Impl_in_rule__Ae__Group__22840);
            rule__Ae__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ae__Group__3_in_rule__Ae__Group__22843);
            rule__Ae__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ae__Group__2"


    // $ANTLR start "rule__Ae__Group__2__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1378:1: rule__Ae__Group__2__Impl : ( ( rule__Ae__IdNode1Assignment_2 ) ) ;
    public final void rule__Ae__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1382:1: ( ( ( rule__Ae__IdNode1Assignment_2 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1383:1: ( ( rule__Ae__IdNode1Assignment_2 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1383:1: ( ( rule__Ae__IdNode1Assignment_2 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1384:1: ( rule__Ae__IdNode1Assignment_2 )
            {
             before(grammarAccess.getAeAccess().getIdNode1Assignment_2()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1385:1: ( rule__Ae__IdNode1Assignment_2 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1385:2: rule__Ae__IdNode1Assignment_2
            {
            pushFollow(FOLLOW_rule__Ae__IdNode1Assignment_2_in_rule__Ae__Group__2__Impl2870);
            rule__Ae__IdNode1Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAeAccess().getIdNode1Assignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ae__Group__2__Impl"


    // $ANTLR start "rule__Ae__Group__3"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1395:1: rule__Ae__Group__3 : rule__Ae__Group__3__Impl rule__Ae__Group__4 ;
    public final void rule__Ae__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1399:1: ( rule__Ae__Group__3__Impl rule__Ae__Group__4 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1400:2: rule__Ae__Group__3__Impl rule__Ae__Group__4
            {
            pushFollow(FOLLOW_rule__Ae__Group__3__Impl_in_rule__Ae__Group__32900);
            rule__Ae__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ae__Group__4_in_rule__Ae__Group__32903);
            rule__Ae__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ae__Group__3"


    // $ANTLR start "rule__Ae__Group__3__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1407:1: rule__Ae__Group__3__Impl : ( ( rule__Ae__DirectionAssignment_3 )? ) ;
    public final void rule__Ae__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1411:1: ( ( ( rule__Ae__DirectionAssignment_3 )? ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1412:1: ( ( rule__Ae__DirectionAssignment_3 )? )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1412:1: ( ( rule__Ae__DirectionAssignment_3 )? )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1413:1: ( rule__Ae__DirectionAssignment_3 )?
            {
             before(grammarAccess.getAeAccess().getDirectionAssignment_3()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1414:1: ( rule__Ae__DirectionAssignment_3 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_DIRECTION) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1414:2: rule__Ae__DirectionAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Ae__DirectionAssignment_3_in_rule__Ae__Group__3__Impl2930);
                    rule__Ae__DirectionAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAeAccess().getDirectionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ae__Group__3__Impl"


    // $ANTLR start "rule__Ae__Group__4"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1424:1: rule__Ae__Group__4 : rule__Ae__Group__4__Impl rule__Ae__Group__5 ;
    public final void rule__Ae__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1428:1: ( rule__Ae__Group__4__Impl rule__Ae__Group__5 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1429:2: rule__Ae__Group__4__Impl rule__Ae__Group__5
            {
            pushFollow(FOLLOW_rule__Ae__Group__4__Impl_in_rule__Ae__Group__42961);
            rule__Ae__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ae__Group__5_in_rule__Ae__Group__42964);
            rule__Ae__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ae__Group__4"


    // $ANTLR start "rule__Ae__Group__4__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1436:1: rule__Ae__Group__4__Impl : ( ( rule__Ae__IdNode2Assignment_4 ) ) ;
    public final void rule__Ae__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1440:1: ( ( ( rule__Ae__IdNode2Assignment_4 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1441:1: ( ( rule__Ae__IdNode2Assignment_4 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1441:1: ( ( rule__Ae__IdNode2Assignment_4 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1442:1: ( rule__Ae__IdNode2Assignment_4 )
            {
             before(grammarAccess.getAeAccess().getIdNode2Assignment_4()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1443:1: ( rule__Ae__IdNode2Assignment_4 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1443:2: rule__Ae__IdNode2Assignment_4
            {
            pushFollow(FOLLOW_rule__Ae__IdNode2Assignment_4_in_rule__Ae__Group__4__Impl2991);
            rule__Ae__IdNode2Assignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAeAccess().getIdNode2Assignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ae__Group__4__Impl"


    // $ANTLR start "rule__Ae__Group__5"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1453:1: rule__Ae__Group__5 : rule__Ae__Group__5__Impl ;
    public final void rule__Ae__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1457:1: ( rule__Ae__Group__5__Impl )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1458:2: rule__Ae__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Ae__Group__5__Impl_in_rule__Ae__Group__53021);
            rule__Ae__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ae__Group__5"


    // $ANTLR start "rule__Ae__Group__5__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1464:1: rule__Ae__Group__5__Impl : ( ( rule__Ae__AttributesAssignment_5 ) ) ;
    public final void rule__Ae__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1468:1: ( ( ( rule__Ae__AttributesAssignment_5 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1469:1: ( ( rule__Ae__AttributesAssignment_5 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1469:1: ( ( rule__Ae__AttributesAssignment_5 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1470:1: ( rule__Ae__AttributesAssignment_5 )
            {
             before(grammarAccess.getAeAccess().getAttributesAssignment_5()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1471:1: ( rule__Ae__AttributesAssignment_5 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1471:2: rule__Ae__AttributesAssignment_5
            {
            pushFollow(FOLLOW_rule__Ae__AttributesAssignment_5_in_rule__Ae__Group__5__Impl3048);
            rule__Ae__AttributesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAeAccess().getAttributesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ae__Group__5__Impl"


    // $ANTLR start "rule__Ce__Group__0"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1493:1: rule__Ce__Group__0 : rule__Ce__Group__0__Impl rule__Ce__Group__1 ;
    public final void rule__Ce__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1497:1: ( rule__Ce__Group__0__Impl rule__Ce__Group__1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1498:2: rule__Ce__Group__0__Impl rule__Ce__Group__1
            {
            pushFollow(FOLLOW_rule__Ce__Group__0__Impl_in_rule__Ce__Group__03090);
            rule__Ce__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ce__Group__1_in_rule__Ce__Group__03093);
            rule__Ce__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ce__Group__0"


    // $ANTLR start "rule__Ce__Group__0__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1505:1: rule__Ce__Group__0__Impl : ( 'ce' ) ;
    public final void rule__Ce__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1509:1: ( ( 'ce' ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1510:1: ( 'ce' )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1510:1: ( 'ce' )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1511:1: 'ce'
            {
             before(grammarAccess.getCeAccess().getCeKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Ce__Group__0__Impl3121); 
             after(grammarAccess.getCeAccess().getCeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ce__Group__0__Impl"


    // $ANTLR start "rule__Ce__Group__1"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1524:1: rule__Ce__Group__1 : rule__Ce__Group__1__Impl rule__Ce__Group__2 ;
    public final void rule__Ce__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1528:1: ( rule__Ce__Group__1__Impl rule__Ce__Group__2 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1529:2: rule__Ce__Group__1__Impl rule__Ce__Group__2
            {
            pushFollow(FOLLOW_rule__Ce__Group__1__Impl_in_rule__Ce__Group__13152);
            rule__Ce__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ce__Group__2_in_rule__Ce__Group__13155);
            rule__Ce__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ce__Group__1"


    // $ANTLR start "rule__Ce__Group__1__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1536:1: rule__Ce__Group__1__Impl : ( ( rule__Ce__IdEdgeAssignment_1 ) ) ;
    public final void rule__Ce__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1540:1: ( ( ( rule__Ce__IdEdgeAssignment_1 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1541:1: ( ( rule__Ce__IdEdgeAssignment_1 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1541:1: ( ( rule__Ce__IdEdgeAssignment_1 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1542:1: ( rule__Ce__IdEdgeAssignment_1 )
            {
             before(grammarAccess.getCeAccess().getIdEdgeAssignment_1()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1543:1: ( rule__Ce__IdEdgeAssignment_1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1543:2: rule__Ce__IdEdgeAssignment_1
            {
            pushFollow(FOLLOW_rule__Ce__IdEdgeAssignment_1_in_rule__Ce__Group__1__Impl3182);
            rule__Ce__IdEdgeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCeAccess().getIdEdgeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ce__Group__1__Impl"


    // $ANTLR start "rule__Ce__Group__2"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1553:1: rule__Ce__Group__2 : rule__Ce__Group__2__Impl ;
    public final void rule__Ce__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1557:1: ( rule__Ce__Group__2__Impl )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1558:2: rule__Ce__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Ce__Group__2__Impl_in_rule__Ce__Group__23212);
            rule__Ce__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ce__Group__2"


    // $ANTLR start "rule__Ce__Group__2__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1564:1: rule__Ce__Group__2__Impl : ( ( rule__Ce__AttributesAssignment_2 ) ) ;
    public final void rule__Ce__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1568:1: ( ( ( rule__Ce__AttributesAssignment_2 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1569:1: ( ( rule__Ce__AttributesAssignment_2 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1569:1: ( ( rule__Ce__AttributesAssignment_2 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1570:1: ( rule__Ce__AttributesAssignment_2 )
            {
             before(grammarAccess.getCeAccess().getAttributesAssignment_2()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1571:1: ( rule__Ce__AttributesAssignment_2 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1571:2: rule__Ce__AttributesAssignment_2
            {
            pushFollow(FOLLOW_rule__Ce__AttributesAssignment_2_in_rule__Ce__Group__2__Impl3239);
            rule__Ce__AttributesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCeAccess().getAttributesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ce__Group__2__Impl"


    // $ANTLR start "rule__De__Group__0"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1587:1: rule__De__Group__0 : rule__De__Group__0__Impl rule__De__Group__1 ;
    public final void rule__De__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1591:1: ( rule__De__Group__0__Impl rule__De__Group__1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1592:2: rule__De__Group__0__Impl rule__De__Group__1
            {
            pushFollow(FOLLOW_rule__De__Group__0__Impl_in_rule__De__Group__03275);
            rule__De__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__De__Group__1_in_rule__De__Group__03278);
            rule__De__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__De__Group__0"


    // $ANTLR start "rule__De__Group__0__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1599:1: rule__De__Group__0__Impl : ( 'de' ) ;
    public final void rule__De__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1603:1: ( ( 'de' ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1604:1: ( 'de' )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1604:1: ( 'de' )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1605:1: 'de'
            {
             before(grammarAccess.getDeAccess().getDeKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__De__Group__0__Impl3306); 
             after(grammarAccess.getDeAccess().getDeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__De__Group__0__Impl"


    // $ANTLR start "rule__De__Group__1"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1618:1: rule__De__Group__1 : rule__De__Group__1__Impl ;
    public final void rule__De__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1622:1: ( rule__De__Group__1__Impl )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1623:2: rule__De__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__De__Group__1__Impl_in_rule__De__Group__13337);
            rule__De__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__De__Group__1"


    // $ANTLR start "rule__De__Group__1__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1629:1: rule__De__Group__1__Impl : ( ( rule__De__IdEdgeAssignment_1 ) ) ;
    public final void rule__De__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1633:1: ( ( ( rule__De__IdEdgeAssignment_1 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1634:1: ( ( rule__De__IdEdgeAssignment_1 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1634:1: ( ( rule__De__IdEdgeAssignment_1 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1635:1: ( rule__De__IdEdgeAssignment_1 )
            {
             before(grammarAccess.getDeAccess().getIdEdgeAssignment_1()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1636:1: ( rule__De__IdEdgeAssignment_1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1636:2: rule__De__IdEdgeAssignment_1
            {
            pushFollow(FOLLOW_rule__De__IdEdgeAssignment_1_in_rule__De__Group__1__Impl3364);
            rule__De__IdEdgeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDeAccess().getIdEdgeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__De__Group__1__Impl"


    // $ANTLR start "rule__Cg__Group__0"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1650:1: rule__Cg__Group__0 : rule__Cg__Group__0__Impl rule__Cg__Group__1 ;
    public final void rule__Cg__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1654:1: ( rule__Cg__Group__0__Impl rule__Cg__Group__1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1655:2: rule__Cg__Group__0__Impl rule__Cg__Group__1
            {
            pushFollow(FOLLOW_rule__Cg__Group__0__Impl_in_rule__Cg__Group__03398);
            rule__Cg__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cg__Group__1_in_rule__Cg__Group__03401);
            rule__Cg__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cg__Group__0"


    // $ANTLR start "rule__Cg__Group__0__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1662:1: rule__Cg__Group__0__Impl : ( 'cg' ) ;
    public final void rule__Cg__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1666:1: ( ( 'cg' ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1667:1: ( 'cg' )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1667:1: ( 'cg' )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1668:1: 'cg'
            {
             before(grammarAccess.getCgAccess().getCgKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Cg__Group__0__Impl3429); 
             after(grammarAccess.getCgAccess().getCgKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cg__Group__0__Impl"


    // $ANTLR start "rule__Cg__Group__1"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1681:1: rule__Cg__Group__1 : rule__Cg__Group__1__Impl ;
    public final void rule__Cg__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1685:1: ( rule__Cg__Group__1__Impl )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1686:2: rule__Cg__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Cg__Group__1__Impl_in_rule__Cg__Group__13460);
            rule__Cg__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cg__Group__1"


    // $ANTLR start "rule__Cg__Group__1__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1692:1: rule__Cg__Group__1__Impl : ( ( rule__Cg__AttributesAssignment_1 ) ) ;
    public final void rule__Cg__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1696:1: ( ( ( rule__Cg__AttributesAssignment_1 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1697:1: ( ( rule__Cg__AttributesAssignment_1 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1697:1: ( ( rule__Cg__AttributesAssignment_1 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1698:1: ( rule__Cg__AttributesAssignment_1 )
            {
             before(grammarAccess.getCgAccess().getAttributesAssignment_1()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1699:1: ( rule__Cg__AttributesAssignment_1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1699:2: rule__Cg__AttributesAssignment_1
            {
            pushFollow(FOLLOW_rule__Cg__AttributesAssignment_1_in_rule__Cg__Group__1__Impl3487);
            rule__Cg__AttributesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCgAccess().getAttributesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cg__Group__1__Impl"


    // $ANTLR start "rule__St__Group__0"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1713:1: rule__St__Group__0 : rule__St__Group__0__Impl rule__St__Group__1 ;
    public final void rule__St__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1717:1: ( rule__St__Group__0__Impl rule__St__Group__1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1718:2: rule__St__Group__0__Impl rule__St__Group__1
            {
            pushFollow(FOLLOW_rule__St__Group__0__Impl_in_rule__St__Group__03521);
            rule__St__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__St__Group__1_in_rule__St__Group__03524);
            rule__St__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__St__Group__0"


    // $ANTLR start "rule__St__Group__0__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1725:1: rule__St__Group__0__Impl : ( 'st' ) ;
    public final void rule__St__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1729:1: ( ( 'st' ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1730:1: ( 'st' )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1730:1: ( 'st' )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1731:1: 'st'
            {
             before(grammarAccess.getStAccess().getStKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__St__Group__0__Impl3552); 
             after(grammarAccess.getStAccess().getStKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__St__Group__0__Impl"


    // $ANTLR start "rule__St__Group__1"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1744:1: rule__St__Group__1 : rule__St__Group__1__Impl ;
    public final void rule__St__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1748:1: ( rule__St__Group__1__Impl )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1749:2: rule__St__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__St__Group__1__Impl_in_rule__St__Group__13583);
            rule__St__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__St__Group__1"


    // $ANTLR start "rule__St__Group__1__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1755:1: rule__St__Group__1__Impl : ( ( rule__St__RealAssignment_1 ) ) ;
    public final void rule__St__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1759:1: ( ( ( rule__St__RealAssignment_1 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1760:1: ( ( rule__St__RealAssignment_1 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1760:1: ( ( rule__St__RealAssignment_1 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1761:1: ( rule__St__RealAssignment_1 )
            {
             before(grammarAccess.getStAccess().getRealAssignment_1()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1762:1: ( rule__St__RealAssignment_1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1762:2: rule__St__RealAssignment_1
            {
            pushFollow(FOLLOW_rule__St__RealAssignment_1_in_rule__St__Group__1__Impl3610);
            rule__St__RealAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStAccess().getRealAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__St__Group__1__Impl"


    // $ANTLR start "rule__Attributes__Group__0"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1776:1: rule__Attributes__Group__0 : rule__Attributes__Group__0__Impl rule__Attributes__Group__1 ;
    public final void rule__Attributes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1780:1: ( rule__Attributes__Group__0__Impl rule__Attributes__Group__1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1781:2: rule__Attributes__Group__0__Impl rule__Attributes__Group__1
            {
            pushFollow(FOLLOW_rule__Attributes__Group__0__Impl_in_rule__Attributes__Group__03644);
            rule__Attributes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attributes__Group__1_in_rule__Attributes__Group__03647);
            rule__Attributes__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__Group__0"


    // $ANTLR start "rule__Attributes__Group__0__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1788:1: rule__Attributes__Group__0__Impl : ( () ) ;
    public final void rule__Attributes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1792:1: ( ( () ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1793:1: ( () )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1793:1: ( () )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1794:1: ()
            {
             before(grammarAccess.getAttributesAccess().getAttributesAction_0()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1795:1: ()
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1797:1: 
            {
            }

             after(grammarAccess.getAttributesAccess().getAttributesAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__Group__0__Impl"


    // $ANTLR start "rule__Attributes__Group__1"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1807:1: rule__Attributes__Group__1 : rule__Attributes__Group__1__Impl ;
    public final void rule__Attributes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1811:1: ( rule__Attributes__Group__1__Impl )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1812:2: rule__Attributes__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Attributes__Group__1__Impl_in_rule__Attributes__Group__13705);
            rule__Attributes__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__Group__1"


    // $ANTLR start "rule__Attributes__Group__1__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1818:1: rule__Attributes__Group__1__Impl : ( ( rule__Attributes__AttributeAssignment_1 )* ) ;
    public final void rule__Attributes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1822:1: ( ( ( rule__Attributes__AttributeAssignment_1 )* ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1823:1: ( ( rule__Attributes__AttributeAssignment_1 )* )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1823:1: ( ( rule__Attributes__AttributeAssignment_1 )* )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1824:1: ( rule__Attributes__AttributeAssignment_1 )*
            {
             before(grammarAccess.getAttributesAccess().getAttributeAssignment_1()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1825:1: ( rule__Attributes__AttributeAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_WORD)||LA8_0==RULE_OPERATOR) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1825:2: rule__Attributes__AttributeAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Attributes__AttributeAssignment_1_in_rule__Attributes__Group__1__Impl3732);
            	    rule__Attributes__AttributeAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getAttributesAccess().getAttributeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1839:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1843:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1844:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__03767);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__03770);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1851:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__OperatorAssignment_0 )? ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1855:1: ( ( ( rule__Attribute__OperatorAssignment_0 )? ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1856:1: ( ( rule__Attribute__OperatorAssignment_0 )? )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1856:1: ( ( rule__Attribute__OperatorAssignment_0 )? )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1857:1: ( rule__Attribute__OperatorAssignment_0 )?
            {
             before(grammarAccess.getAttributeAccess().getOperatorAssignment_0()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1858:1: ( rule__Attribute__OperatorAssignment_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_OPERATOR) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1858:2: rule__Attribute__OperatorAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Attribute__OperatorAssignment_0_in_rule__Attribute__Group__0__Impl3797);
                    rule__Attribute__OperatorAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getOperatorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1868:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1872:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1873:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__13828);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__13831);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1880:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__IdAttributeAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1884:1: ( ( ( rule__Attribute__IdAttributeAssignment_1 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1885:1: ( ( rule__Attribute__IdAttributeAssignment_1 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1885:1: ( ( rule__Attribute__IdAttributeAssignment_1 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1886:1: ( rule__Attribute__IdAttributeAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getIdAttributeAssignment_1()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1887:1: ( rule__Attribute__IdAttributeAssignment_1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1887:2: rule__Attribute__IdAttributeAssignment_1
            {
            pushFollow(FOLLOW_rule__Attribute__IdAttributeAssignment_1_in_rule__Attribute__Group__1__Impl3858);
            rule__Attribute__IdAttributeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getIdAttributeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1897:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1901:1: ( rule__Attribute__Group__2__Impl )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1902:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__23888);
            rule__Attribute__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1908:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__Group_2__0 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1912:1: ( ( ( rule__Attribute__Group_2__0 )? ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1913:1: ( ( rule__Attribute__Group_2__0 )? )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1913:1: ( ( rule__Attribute__Group_2__0 )? )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1914:1: ( rule__Attribute__Group_2__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_2()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1915:1: ( rule__Attribute__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ASSIGN) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1915:2: rule__Attribute__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Attribute__Group_2__0_in_rule__Attribute__Group__2__Impl3915);
                    rule__Attribute__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group_2__0"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1931:1: rule__Attribute__Group_2__0 : rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1 ;
    public final void rule__Attribute__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1935:1: ( rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1936:2: rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group_2__0__Impl_in_rule__Attribute__Group_2__03952);
            rule__Attribute__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group_2__1_in_rule__Attribute__Group_2__03955);
            rule__Attribute__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2__0"


    // $ANTLR start "rule__Attribute__Group_2__0__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1943:1: rule__Attribute__Group_2__0__Impl : ( ( rule__Attribute__AssignAssignment_2_0 ) ) ;
    public final void rule__Attribute__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1947:1: ( ( ( rule__Attribute__AssignAssignment_2_0 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1948:1: ( ( rule__Attribute__AssignAssignment_2_0 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1948:1: ( ( rule__Attribute__AssignAssignment_2_0 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1949:1: ( rule__Attribute__AssignAssignment_2_0 )
            {
             before(grammarAccess.getAttributeAccess().getAssignAssignment_2_0()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1950:1: ( rule__Attribute__AssignAssignment_2_0 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1950:2: rule__Attribute__AssignAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Attribute__AssignAssignment_2_0_in_rule__Attribute__Group_2__0__Impl3982);
            rule__Attribute__AssignAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAssignAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2__0__Impl"


    // $ANTLR start "rule__Attribute__Group_2__1"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1960:1: rule__Attribute__Group_2__1 : rule__Attribute__Group_2__1__Impl rule__Attribute__Group_2__2 ;
    public final void rule__Attribute__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1964:1: ( rule__Attribute__Group_2__1__Impl rule__Attribute__Group_2__2 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1965:2: rule__Attribute__Group_2__1__Impl rule__Attribute__Group_2__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group_2__1__Impl_in_rule__Attribute__Group_2__14012);
            rule__Attribute__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group_2__2_in_rule__Attribute__Group_2__14015);
            rule__Attribute__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2__1"


    // $ANTLR start "rule__Attribute__Group_2__1__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1972:1: rule__Attribute__Group_2__1__Impl : ( ( rule__Attribute__ValueAssignment_2_1 ) ) ;
    public final void rule__Attribute__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1976:1: ( ( ( rule__Attribute__ValueAssignment_2_1 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1977:1: ( ( rule__Attribute__ValueAssignment_2_1 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1977:1: ( ( rule__Attribute__ValueAssignment_2_1 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1978:1: ( rule__Attribute__ValueAssignment_2_1 )
            {
             before(grammarAccess.getAttributeAccess().getValueAssignment_2_1()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1979:1: ( rule__Attribute__ValueAssignment_2_1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1979:2: rule__Attribute__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Attribute__ValueAssignment_2_1_in_rule__Attribute__Group_2__1__Impl4042);
            rule__Attribute__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getValueAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2__1__Impl"


    // $ANTLR start "rule__Attribute__Group_2__2"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1989:1: rule__Attribute__Group_2__2 : rule__Attribute__Group_2__2__Impl ;
    public final void rule__Attribute__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1993:1: ( rule__Attribute__Group_2__2__Impl )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1994:2: rule__Attribute__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group_2__2__Impl_in_rule__Attribute__Group_2__24072);
            rule__Attribute__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2__2"


    // $ANTLR start "rule__Attribute__Group_2__2__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2000:1: rule__Attribute__Group_2__2__Impl : ( ( rule__Attribute__Group_2_2__0 )* ) ;
    public final void rule__Attribute__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2004:1: ( ( ( rule__Attribute__Group_2_2__0 )* ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2005:1: ( ( rule__Attribute__Group_2_2__0 )* )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2005:1: ( ( rule__Attribute__Group_2_2__0 )* )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2006:1: ( rule__Attribute__Group_2_2__0 )*
            {
             before(grammarAccess.getAttributeAccess().getGroup_2_2()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2007:1: ( rule__Attribute__Group_2_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2007:2: rule__Attribute__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Attribute__Group_2_2__0_in_rule__Attribute__Group_2__2__Impl4099);
            	    rule__Attribute__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getAttributeAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2__2__Impl"


    // $ANTLR start "rule__Attribute__Group_2_2__0"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2023:1: rule__Attribute__Group_2_2__0 : rule__Attribute__Group_2_2__0__Impl rule__Attribute__Group_2_2__1 ;
    public final void rule__Attribute__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2027:1: ( rule__Attribute__Group_2_2__0__Impl rule__Attribute__Group_2_2__1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2028:2: rule__Attribute__Group_2_2__0__Impl rule__Attribute__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group_2_2__0__Impl_in_rule__Attribute__Group_2_2__04136);
            rule__Attribute__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group_2_2__1_in_rule__Attribute__Group_2_2__04139);
            rule__Attribute__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2_2__0"


    // $ANTLR start "rule__Attribute__Group_2_2__0__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2035:1: rule__Attribute__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Attribute__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2039:1: ( ( ',' ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2040:1: ( ',' )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2040:1: ( ',' )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2041:1: ','
            {
             before(grammarAccess.getAttributeAccess().getCommaKeyword_2_2_0()); 
            match(input,24,FOLLOW_24_in_rule__Attribute__Group_2_2__0__Impl4167); 
             after(grammarAccess.getAttributeAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2_2__0__Impl"


    // $ANTLR start "rule__Attribute__Group_2_2__1"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2054:1: rule__Attribute__Group_2_2__1 : rule__Attribute__Group_2_2__1__Impl ;
    public final void rule__Attribute__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2058:1: ( rule__Attribute__Group_2_2__1__Impl )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2059:2: rule__Attribute__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group_2_2__1__Impl_in_rule__Attribute__Group_2_2__14198);
            rule__Attribute__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2_2__1"


    // $ANTLR start "rule__Attribute__Group_2_2__1__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2065:1: rule__Attribute__Group_2_2__1__Impl : ( ( rule__Attribute__OtherValuesAssignment_2_2_1 ) ) ;
    public final void rule__Attribute__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2069:1: ( ( ( rule__Attribute__OtherValuesAssignment_2_2_1 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2070:1: ( ( rule__Attribute__OtherValuesAssignment_2_2_1 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2070:1: ( ( rule__Attribute__OtherValuesAssignment_2_2_1 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2071:1: ( rule__Attribute__OtherValuesAssignment_2_2_1 )
            {
             before(grammarAccess.getAttributeAccess().getOtherValuesAssignment_2_2_1()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2072:1: ( rule__Attribute__OtherValuesAssignment_2_2_1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2072:2: rule__Attribute__OtherValuesAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Attribute__OtherValuesAssignment_2_2_1_in_rule__Attribute__Group_2_2__1__Impl4225);
            rule__Attribute__OtherValuesAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getOtherValuesAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2_2__1__Impl"


    // $ANTLR start "rule__Array__Group__0"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2086:1: rule__Array__Group__0 : rule__Array__Group__0__Impl rule__Array__Group__1 ;
    public final void rule__Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2090:1: ( rule__Array__Group__0__Impl rule__Array__Group__1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2091:2: rule__Array__Group__0__Impl rule__Array__Group__1
            {
            pushFollow(FOLLOW_rule__Array__Group__0__Impl_in_rule__Array__Group__04259);
            rule__Array__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Array__Group__1_in_rule__Array__Group__04262);
            rule__Array__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__0"


    // $ANTLR start "rule__Array__Group__0__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2098:1: rule__Array__Group__0__Impl : ( () ) ;
    public final void rule__Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2102:1: ( ( () ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2103:1: ( () )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2103:1: ( () )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2104:1: ()
            {
             before(grammarAccess.getArrayAccess().getArrayAction_0()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2105:1: ()
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2107:1: 
            {
            }

             after(grammarAccess.getArrayAccess().getArrayAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__0__Impl"


    // $ANTLR start "rule__Array__Group__1"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2117:1: rule__Array__Group__1 : rule__Array__Group__1__Impl rule__Array__Group__2 ;
    public final void rule__Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2121:1: ( rule__Array__Group__1__Impl rule__Array__Group__2 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2122:2: rule__Array__Group__1__Impl rule__Array__Group__2
            {
            pushFollow(FOLLOW_rule__Array__Group__1__Impl_in_rule__Array__Group__14320);
            rule__Array__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Array__Group__2_in_rule__Array__Group__14323);
            rule__Array__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__1"


    // $ANTLR start "rule__Array__Group__1__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2129:1: rule__Array__Group__1__Impl : ( '{' ) ;
    public final void rule__Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2133:1: ( ( '{' ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2134:1: ( '{' )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2134:1: ( '{' )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2135:1: '{'
            {
             before(grammarAccess.getArrayAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__Array__Group__1__Impl4351); 
             after(grammarAccess.getArrayAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__1__Impl"


    // $ANTLR start "rule__Array__Group__2"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2148:1: rule__Array__Group__2 : rule__Array__Group__2__Impl rule__Array__Group__3 ;
    public final void rule__Array__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2152:1: ( rule__Array__Group__2__Impl rule__Array__Group__3 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2153:2: rule__Array__Group__2__Impl rule__Array__Group__3
            {
            pushFollow(FOLLOW_rule__Array__Group__2__Impl_in_rule__Array__Group__24382);
            rule__Array__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Array__Group__3_in_rule__Array__Group__24385);
            rule__Array__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__2"


    // $ANTLR start "rule__Array__Group__2__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2160:1: rule__Array__Group__2__Impl : ( ( rule__Array__Group_2__0 )? ) ;
    public final void rule__Array__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2164:1: ( ( ( rule__Array__Group_2__0 )? ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2165:1: ( ( rule__Array__Group_2__0 )? )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2165:1: ( ( rule__Array__Group_2__0 )? )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2166:1: ( rule__Array__Group_2__0 )?
            {
             before(grammarAccess.getArrayAccess().getGroup_2()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2167:1: ( rule__Array__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_INT)||LA12_0==RULE_REAL||LA12_0==25||LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2167:2: rule__Array__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Array__Group_2__0_in_rule__Array__Group__2__Impl4412);
                    rule__Array__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArrayAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__2__Impl"


    // $ANTLR start "rule__Array__Group__3"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2177:1: rule__Array__Group__3 : rule__Array__Group__3__Impl ;
    public final void rule__Array__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2181:1: ( rule__Array__Group__3__Impl )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2182:2: rule__Array__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Array__Group__3__Impl_in_rule__Array__Group__34443);
            rule__Array__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__3"


    // $ANTLR start "rule__Array__Group__3__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2188:1: rule__Array__Group__3__Impl : ( '}' ) ;
    public final void rule__Array__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2192:1: ( ( '}' ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2193:1: ( '}' )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2193:1: ( '}' )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2194:1: '}'
            {
             before(grammarAccess.getArrayAccess().getRightCurlyBracketKeyword_3()); 
            match(input,26,FOLLOW_26_in_rule__Array__Group__3__Impl4471); 
             after(grammarAccess.getArrayAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__3__Impl"


    // $ANTLR start "rule__Array__Group_2__0"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2215:1: rule__Array__Group_2__0 : rule__Array__Group_2__0__Impl rule__Array__Group_2__1 ;
    public final void rule__Array__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2219:1: ( rule__Array__Group_2__0__Impl rule__Array__Group_2__1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2220:2: rule__Array__Group_2__0__Impl rule__Array__Group_2__1
            {
            pushFollow(FOLLOW_rule__Array__Group_2__0__Impl_in_rule__Array__Group_2__04510);
            rule__Array__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Array__Group_2__1_in_rule__Array__Group_2__04513);
            rule__Array__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group_2__0"


    // $ANTLR start "rule__Array__Group_2__0__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2227:1: rule__Array__Group_2__0__Impl : ( ( rule__Array__ValueAssignment_2_0 ) ) ;
    public final void rule__Array__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2231:1: ( ( ( rule__Array__ValueAssignment_2_0 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2232:1: ( ( rule__Array__ValueAssignment_2_0 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2232:1: ( ( rule__Array__ValueAssignment_2_0 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2233:1: ( rule__Array__ValueAssignment_2_0 )
            {
             before(grammarAccess.getArrayAccess().getValueAssignment_2_0()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2234:1: ( rule__Array__ValueAssignment_2_0 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2234:2: rule__Array__ValueAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Array__ValueAssignment_2_0_in_rule__Array__Group_2__0__Impl4540);
            rule__Array__ValueAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getArrayAccess().getValueAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group_2__0__Impl"


    // $ANTLR start "rule__Array__Group_2__1"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2244:1: rule__Array__Group_2__1 : rule__Array__Group_2__1__Impl ;
    public final void rule__Array__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2248:1: ( rule__Array__Group_2__1__Impl )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2249:2: rule__Array__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Array__Group_2__1__Impl_in_rule__Array__Group_2__14570);
            rule__Array__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group_2__1"


    // $ANTLR start "rule__Array__Group_2__1__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2255:1: rule__Array__Group_2__1__Impl : ( ( rule__Array__Group_2_1__0 )* ) ;
    public final void rule__Array__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2259:1: ( ( ( rule__Array__Group_2_1__0 )* ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2260:1: ( ( rule__Array__Group_2_1__0 )* )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2260:1: ( ( rule__Array__Group_2_1__0 )* )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2261:1: ( rule__Array__Group_2_1__0 )*
            {
             before(grammarAccess.getArrayAccess().getGroup_2_1()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2262:1: ( rule__Array__Group_2_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==24) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2262:2: rule__Array__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Array__Group_2_1__0_in_rule__Array__Group_2__1__Impl4597);
            	    rule__Array__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getArrayAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group_2__1__Impl"


    // $ANTLR start "rule__Array__Group_2_1__0"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2276:1: rule__Array__Group_2_1__0 : rule__Array__Group_2_1__0__Impl rule__Array__Group_2_1__1 ;
    public final void rule__Array__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2280:1: ( rule__Array__Group_2_1__0__Impl rule__Array__Group_2_1__1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2281:2: rule__Array__Group_2_1__0__Impl rule__Array__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__Array__Group_2_1__0__Impl_in_rule__Array__Group_2_1__04632);
            rule__Array__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Array__Group_2_1__1_in_rule__Array__Group_2_1__04635);
            rule__Array__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group_2_1__0"


    // $ANTLR start "rule__Array__Group_2_1__0__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2288:1: rule__Array__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Array__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2292:1: ( ( ',' ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2293:1: ( ',' )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2293:1: ( ',' )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2294:1: ','
            {
             before(grammarAccess.getArrayAccess().getCommaKeyword_2_1_0()); 
            match(input,24,FOLLOW_24_in_rule__Array__Group_2_1__0__Impl4663); 
             after(grammarAccess.getArrayAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group_2_1__0__Impl"


    // $ANTLR start "rule__Array__Group_2_1__1"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2307:1: rule__Array__Group_2_1__1 : rule__Array__Group_2_1__1__Impl ;
    public final void rule__Array__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2311:1: ( rule__Array__Group_2_1__1__Impl )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2312:2: rule__Array__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Array__Group_2_1__1__Impl_in_rule__Array__Group_2_1__14694);
            rule__Array__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group_2_1__1"


    // $ANTLR start "rule__Array__Group_2_1__1__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2318:1: rule__Array__Group_2_1__1__Impl : ( ( rule__Array__OtherValuesAssignment_2_1_1 ) ) ;
    public final void rule__Array__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2322:1: ( ( ( rule__Array__OtherValuesAssignment_2_1_1 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2323:1: ( ( rule__Array__OtherValuesAssignment_2_1_1 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2323:1: ( ( rule__Array__OtherValuesAssignment_2_1_1 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2324:1: ( rule__Array__OtherValuesAssignment_2_1_1 )
            {
             before(grammarAccess.getArrayAccess().getOtherValuesAssignment_2_1_1()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2325:1: ( rule__Array__OtherValuesAssignment_2_1_1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2325:2: rule__Array__OtherValuesAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__Array__OtherValuesAssignment_2_1_1_in_rule__Array__Group_2_1__1__Impl4721);
            rule__Array__OtherValuesAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getArrayAccess().getOtherValuesAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group_2_1__1__Impl"


    // $ANTLR start "rule__Map__Group__0"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2339:1: rule__Map__Group__0 : rule__Map__Group__0__Impl rule__Map__Group__1 ;
    public final void rule__Map__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2343:1: ( rule__Map__Group__0__Impl rule__Map__Group__1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2344:2: rule__Map__Group__0__Impl rule__Map__Group__1
            {
            pushFollow(FOLLOW_rule__Map__Group__0__Impl_in_rule__Map__Group__04755);
            rule__Map__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Map__Group__1_in_rule__Map__Group__04758);
            rule__Map__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Map__Group__0"


    // $ANTLR start "rule__Map__Group__0__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2351:1: rule__Map__Group__0__Impl : ( '[' ) ;
    public final void rule__Map__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2355:1: ( ( '[' ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2356:1: ( '[' )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2356:1: ( '[' )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2357:1: '['
            {
             before(grammarAccess.getMapAccess().getLeftSquareBracketKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__Map__Group__0__Impl4786); 
             after(grammarAccess.getMapAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Map__Group__0__Impl"


    // $ANTLR start "rule__Map__Group__1"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2370:1: rule__Map__Group__1 : rule__Map__Group__1__Impl rule__Map__Group__2 ;
    public final void rule__Map__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2374:1: ( rule__Map__Group__1__Impl rule__Map__Group__2 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2375:2: rule__Map__Group__1__Impl rule__Map__Group__2
            {
            pushFollow(FOLLOW_rule__Map__Group__1__Impl_in_rule__Map__Group__14817);
            rule__Map__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Map__Group__2_in_rule__Map__Group__14820);
            rule__Map__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Map__Group__1"


    // $ANTLR start "rule__Map__Group__1__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2382:1: rule__Map__Group__1__Impl : ( ( rule__Map__MappingAssignment_1 ) ) ;
    public final void rule__Map__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2386:1: ( ( ( rule__Map__MappingAssignment_1 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2387:1: ( ( rule__Map__MappingAssignment_1 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2387:1: ( ( rule__Map__MappingAssignment_1 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2388:1: ( rule__Map__MappingAssignment_1 )
            {
             before(grammarAccess.getMapAccess().getMappingAssignment_1()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2389:1: ( rule__Map__MappingAssignment_1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2389:2: rule__Map__MappingAssignment_1
            {
            pushFollow(FOLLOW_rule__Map__MappingAssignment_1_in_rule__Map__Group__1__Impl4847);
            rule__Map__MappingAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMapAccess().getMappingAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Map__Group__1__Impl"


    // $ANTLR start "rule__Map__Group__2"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2399:1: rule__Map__Group__2 : rule__Map__Group__2__Impl rule__Map__Group__3 ;
    public final void rule__Map__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2403:1: ( rule__Map__Group__2__Impl rule__Map__Group__3 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2404:2: rule__Map__Group__2__Impl rule__Map__Group__3
            {
            pushFollow(FOLLOW_rule__Map__Group__2__Impl_in_rule__Map__Group__24877);
            rule__Map__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Map__Group__3_in_rule__Map__Group__24880);
            rule__Map__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Map__Group__2"


    // $ANTLR start "rule__Map__Group__2__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2411:1: rule__Map__Group__2__Impl : ( ( rule__Map__Group_2__0 )* ) ;
    public final void rule__Map__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2415:1: ( ( ( rule__Map__Group_2__0 )* ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2416:1: ( ( rule__Map__Group_2__0 )* )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2416:1: ( ( rule__Map__Group_2__0 )* )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2417:1: ( rule__Map__Group_2__0 )*
            {
             before(grammarAccess.getMapAccess().getGroup_2()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2418:1: ( rule__Map__Group_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==24) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2418:2: rule__Map__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Map__Group_2__0_in_rule__Map__Group__2__Impl4907);
            	    rule__Map__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getMapAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Map__Group__2__Impl"


    // $ANTLR start "rule__Map__Group__3"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2428:1: rule__Map__Group__3 : rule__Map__Group__3__Impl ;
    public final void rule__Map__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2432:1: ( rule__Map__Group__3__Impl )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2433:2: rule__Map__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Map__Group__3__Impl_in_rule__Map__Group__34938);
            rule__Map__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Map__Group__3"


    // $ANTLR start "rule__Map__Group__3__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2439:1: rule__Map__Group__3__Impl : ( ']' ) ;
    public final void rule__Map__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2443:1: ( ( ']' ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2444:1: ( ']' )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2444:1: ( ']' )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2445:1: ']'
            {
             before(grammarAccess.getMapAccess().getRightSquareBracketKeyword_3()); 
            match(input,28,FOLLOW_28_in_rule__Map__Group__3__Impl4966); 
             after(grammarAccess.getMapAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Map__Group__3__Impl"


    // $ANTLR start "rule__Map__Group_2__0"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2466:1: rule__Map__Group_2__0 : rule__Map__Group_2__0__Impl rule__Map__Group_2__1 ;
    public final void rule__Map__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2470:1: ( rule__Map__Group_2__0__Impl rule__Map__Group_2__1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2471:2: rule__Map__Group_2__0__Impl rule__Map__Group_2__1
            {
            pushFollow(FOLLOW_rule__Map__Group_2__0__Impl_in_rule__Map__Group_2__05005);
            rule__Map__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Map__Group_2__1_in_rule__Map__Group_2__05008);
            rule__Map__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Map__Group_2__0"


    // $ANTLR start "rule__Map__Group_2__0__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2478:1: rule__Map__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Map__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2482:1: ( ( ',' ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2483:1: ( ',' )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2483:1: ( ',' )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2484:1: ','
            {
             before(grammarAccess.getMapAccess().getCommaKeyword_2_0()); 
            match(input,24,FOLLOW_24_in_rule__Map__Group_2__0__Impl5036); 
             after(grammarAccess.getMapAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Map__Group_2__0__Impl"


    // $ANTLR start "rule__Map__Group_2__1"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2497:1: rule__Map__Group_2__1 : rule__Map__Group_2__1__Impl ;
    public final void rule__Map__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2501:1: ( rule__Map__Group_2__1__Impl )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2502:2: rule__Map__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Map__Group_2__1__Impl_in_rule__Map__Group_2__15067);
            rule__Map__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Map__Group_2__1"


    // $ANTLR start "rule__Map__Group_2__1__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2508:1: rule__Map__Group_2__1__Impl : ( ( rule__Map__OtherMappingAssignment_2_1 ) ) ;
    public final void rule__Map__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2512:1: ( ( ( rule__Map__OtherMappingAssignment_2_1 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2513:1: ( ( rule__Map__OtherMappingAssignment_2_1 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2513:1: ( ( rule__Map__OtherMappingAssignment_2_1 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2514:1: ( rule__Map__OtherMappingAssignment_2_1 )
            {
             before(grammarAccess.getMapAccess().getOtherMappingAssignment_2_1()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2515:1: ( rule__Map__OtherMappingAssignment_2_1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2515:2: rule__Map__OtherMappingAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Map__OtherMappingAssignment_2_1_in_rule__Map__Group_2__1__Impl5094);
            rule__Map__OtherMappingAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMapAccess().getOtherMappingAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Map__Group_2__1__Impl"


    // $ANTLR start "rule__Mapping__Group__0"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2529:1: rule__Mapping__Group__0 : rule__Mapping__Group__0__Impl rule__Mapping__Group__1 ;
    public final void rule__Mapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2533:1: ( rule__Mapping__Group__0__Impl rule__Mapping__Group__1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2534:2: rule__Mapping__Group__0__Impl rule__Mapping__Group__1
            {
            pushFollow(FOLLOW_rule__Mapping__Group__0__Impl_in_rule__Mapping__Group__05128);
            rule__Mapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mapping__Group__1_in_rule__Mapping__Group__05131);
            rule__Mapping__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__0"


    // $ANTLR start "rule__Mapping__Group__0__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2541:1: rule__Mapping__Group__0__Impl : ( ( rule__Mapping__IdAssignment_0 ) ) ;
    public final void rule__Mapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2545:1: ( ( ( rule__Mapping__IdAssignment_0 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2546:1: ( ( rule__Mapping__IdAssignment_0 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2546:1: ( ( rule__Mapping__IdAssignment_0 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2547:1: ( rule__Mapping__IdAssignment_0 )
            {
             before(grammarAccess.getMappingAccess().getIdAssignment_0()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2548:1: ( rule__Mapping__IdAssignment_0 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2548:2: rule__Mapping__IdAssignment_0
            {
            pushFollow(FOLLOW_rule__Mapping__IdAssignment_0_in_rule__Mapping__Group__0__Impl5158);
            rule__Mapping__IdAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getIdAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__0__Impl"


    // $ANTLR start "rule__Mapping__Group__1"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2558:1: rule__Mapping__Group__1 : rule__Mapping__Group__1__Impl rule__Mapping__Group__2 ;
    public final void rule__Mapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2562:1: ( rule__Mapping__Group__1__Impl rule__Mapping__Group__2 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2563:2: rule__Mapping__Group__1__Impl rule__Mapping__Group__2
            {
            pushFollow(FOLLOW_rule__Mapping__Group__1__Impl_in_rule__Mapping__Group__15188);
            rule__Mapping__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mapping__Group__2_in_rule__Mapping__Group__15191);
            rule__Mapping__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__1"


    // $ANTLR start "rule__Mapping__Group__1__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2570:1: rule__Mapping__Group__1__Impl : ( ( rule__Mapping__AssignAssignment_1 ) ) ;
    public final void rule__Mapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2574:1: ( ( ( rule__Mapping__AssignAssignment_1 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2575:1: ( ( rule__Mapping__AssignAssignment_1 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2575:1: ( ( rule__Mapping__AssignAssignment_1 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2576:1: ( rule__Mapping__AssignAssignment_1 )
            {
             before(grammarAccess.getMappingAccess().getAssignAssignment_1()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2577:1: ( rule__Mapping__AssignAssignment_1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2577:2: rule__Mapping__AssignAssignment_1
            {
            pushFollow(FOLLOW_rule__Mapping__AssignAssignment_1_in_rule__Mapping__Group__1__Impl5218);
            rule__Mapping__AssignAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getAssignAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__1__Impl"


    // $ANTLR start "rule__Mapping__Group__2"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2587:1: rule__Mapping__Group__2 : rule__Mapping__Group__2__Impl ;
    public final void rule__Mapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2591:1: ( rule__Mapping__Group__2__Impl )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2592:2: rule__Mapping__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Mapping__Group__2__Impl_in_rule__Mapping__Group__25248);
            rule__Mapping__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__2"


    // $ANTLR start "rule__Mapping__Group__2__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2598:1: rule__Mapping__Group__2__Impl : ( ( rule__Mapping__ValueAssignment_2 ) ) ;
    public final void rule__Mapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2602:1: ( ( ( rule__Mapping__ValueAssignment_2 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2603:1: ( ( rule__Mapping__ValueAssignment_2 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2603:1: ( ( rule__Mapping__ValueAssignment_2 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2604:1: ( rule__Mapping__ValueAssignment_2 )
            {
             before(grammarAccess.getMappingAccess().getValueAssignment_2()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2605:1: ( rule__Mapping__ValueAssignment_2 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2605:2: rule__Mapping__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Mapping__ValueAssignment_2_in_rule__Mapping__Group__2__Impl5275);
            rule__Mapping__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__2__Impl"


    // $ANTLR start "rule__Id__Group_2__0"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2621:1: rule__Id__Group_2__0 : rule__Id__Group_2__0__Impl rule__Id__Group_2__1 ;
    public final void rule__Id__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2625:1: ( rule__Id__Group_2__0__Impl rule__Id__Group_2__1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2626:2: rule__Id__Group_2__0__Impl rule__Id__Group_2__1
            {
            pushFollow(FOLLOW_rule__Id__Group_2__0__Impl_in_rule__Id__Group_2__05311);
            rule__Id__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Id__Group_2__1_in_rule__Id__Group_2__05314);
            rule__Id__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Id__Group_2__0"


    // $ANTLR start "rule__Id__Group_2__0__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2633:1: rule__Id__Group_2__0__Impl : ( RULE_WORD ) ;
    public final void rule__Id__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2637:1: ( ( RULE_WORD ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2638:1: ( RULE_WORD )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2638:1: ( RULE_WORD )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2639:1: RULE_WORD
            {
             before(grammarAccess.getIdAccess().getWORDTerminalRuleCall_2_0()); 
            match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rule__Id__Group_2__0__Impl5341); 
             after(grammarAccess.getIdAccess().getWORDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Id__Group_2__0__Impl"


    // $ANTLR start "rule__Id__Group_2__1"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2650:1: rule__Id__Group_2__1 : rule__Id__Group_2__1__Impl ;
    public final void rule__Id__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2654:1: ( rule__Id__Group_2__1__Impl )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2655:2: rule__Id__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Id__Group_2__1__Impl_in_rule__Id__Group_2__15370);
            rule__Id__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Id__Group_2__1"


    // $ANTLR start "rule__Id__Group_2__1__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2661:1: rule__Id__Group_2__1__Impl : ( ( rule__Id__Group_2_1__0 )* ) ;
    public final void rule__Id__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2665:1: ( ( ( rule__Id__Group_2_1__0 )* ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2666:1: ( ( rule__Id__Group_2_1__0 )* )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2666:1: ( ( rule__Id__Group_2_1__0 )* )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2667:1: ( rule__Id__Group_2_1__0 )*
            {
             before(grammarAccess.getIdAccess().getGroup_2_1()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2668:1: ( rule__Id__Group_2_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==29) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2668:2: rule__Id__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Id__Group_2_1__0_in_rule__Id__Group_2__1__Impl5397);
            	    rule__Id__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getIdAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Id__Group_2__1__Impl"


    // $ANTLR start "rule__Id__Group_2_1__0"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2682:1: rule__Id__Group_2_1__0 : rule__Id__Group_2_1__0__Impl rule__Id__Group_2_1__1 ;
    public final void rule__Id__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2686:1: ( rule__Id__Group_2_1__0__Impl rule__Id__Group_2_1__1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2687:2: rule__Id__Group_2_1__0__Impl rule__Id__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__Id__Group_2_1__0__Impl_in_rule__Id__Group_2_1__05432);
            rule__Id__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Id__Group_2_1__1_in_rule__Id__Group_2_1__05435);
            rule__Id__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Id__Group_2_1__0"


    // $ANTLR start "rule__Id__Group_2_1__0__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2694:1: rule__Id__Group_2_1__0__Impl : ( '.' ) ;
    public final void rule__Id__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2698:1: ( ( '.' ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2699:1: ( '.' )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2699:1: ( '.' )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2700:1: '.'
            {
             before(grammarAccess.getIdAccess().getFullStopKeyword_2_1_0()); 
            match(input,29,FOLLOW_29_in_rule__Id__Group_2_1__0__Impl5463); 
             after(grammarAccess.getIdAccess().getFullStopKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Id__Group_2_1__0__Impl"


    // $ANTLR start "rule__Id__Group_2_1__1"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2713:1: rule__Id__Group_2_1__1 : rule__Id__Group_2_1__1__Impl ;
    public final void rule__Id__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2717:1: ( rule__Id__Group_2_1__1__Impl )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2718:2: rule__Id__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Id__Group_2_1__1__Impl_in_rule__Id__Group_2_1__15494);
            rule__Id__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Id__Group_2_1__1"


    // $ANTLR start "rule__Id__Group_2_1__1__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2724:1: rule__Id__Group_2_1__1__Impl : ( RULE_WORD ) ;
    public final void rule__Id__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2728:1: ( ( RULE_WORD ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2729:1: ( RULE_WORD )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2729:1: ( RULE_WORD )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2730:1: RULE_WORD
            {
             before(grammarAccess.getIdAccess().getWORDTerminalRuleCall_2_1_1()); 
            match(input,RULE_WORD,FOLLOW_RULE_WORD_in_rule__Id__Group_2_1__1__Impl5521); 
             after(grammarAccess.getIdAccess().getWORDTerminalRuleCall_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Id__Group_2_1__1__Impl"


    // $ANTLR start "rule__Dgs__HeaderAssignment_0"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2746:1: rule__Dgs__HeaderAssignment_0 : ( ruleHeader ) ;
    public final void rule__Dgs__HeaderAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2750:1: ( ( ruleHeader ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2751:1: ( ruleHeader )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2751:1: ( ruleHeader )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2752:1: ruleHeader
            {
             before(grammarAccess.getDgsAccess().getHeaderHeaderParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleHeader_in_rule__Dgs__HeaderAssignment_05559);
            ruleHeader();

            state._fsp--;

             after(grammarAccess.getDgsAccess().getHeaderHeaderParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dgs__HeaderAssignment_0"


    // $ANTLR start "rule__Dgs__EventAssignment_1_0"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2761:1: rule__Dgs__EventAssignment_1_0 : ( ruleEvent ) ;
    public final void rule__Dgs__EventAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2765:1: ( ( ruleEvent ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2766:1: ( ruleEvent )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2766:1: ( ruleEvent )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2767:1: ruleEvent
            {
             before(grammarAccess.getDgsAccess().getEventEventParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleEvent_in_rule__Dgs__EventAssignment_1_05590);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getDgsAccess().getEventEventParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dgs__EventAssignment_1_0"


    // $ANTLR start "rule__Dgs__CommentAssignment_1_1"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2776:1: rule__Dgs__CommentAssignment_1_1 : ( RULE_COMMENT ) ;
    public final void rule__Dgs__CommentAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2780:1: ( ( RULE_COMMENT ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2781:1: ( RULE_COMMENT )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2781:1: ( RULE_COMMENT )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2782:1: RULE_COMMENT
            {
             before(grammarAccess.getDgsAccess().getCommentCOMMENTTerminalRuleCall_1_1_0()); 
            match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_rule__Dgs__CommentAssignment_1_15621); 
             after(grammarAccess.getDgsAccess().getCommentCOMMENTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dgs__CommentAssignment_1_1"


    // $ANTLR start "rule__Header__MagicAssignment_0"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2791:1: rule__Header__MagicAssignment_0 : ( RULE_MAGIC ) ;
    public final void rule__Header__MagicAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2795:1: ( ( RULE_MAGIC ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2796:1: ( RULE_MAGIC )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2796:1: ( RULE_MAGIC )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2797:1: RULE_MAGIC
            {
             before(grammarAccess.getHeaderAccess().getMagicMAGICTerminalRuleCall_0_0()); 
            match(input,RULE_MAGIC,FOLLOW_RULE_MAGIC_in_rule__Header__MagicAssignment_05652); 
             after(grammarAccess.getHeaderAccess().getMagicMAGICTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__MagicAssignment_0"


    // $ANTLR start "rule__Header__NameAssignment_2"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2806:1: rule__Header__NameAssignment_2 : ( ruleId ) ;
    public final void rule__Header__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2810:1: ( ( ruleId ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2811:1: ( ruleId )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2811:1: ( ruleId )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2812:1: ruleId
            {
             before(grammarAccess.getHeaderAccess().getNameIdParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleId_in_rule__Header__NameAssignment_25683);
            ruleId();

            state._fsp--;

             after(grammarAccess.getHeaderAccess().getNameIdParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__NameAssignment_2"


    // $ANTLR start "rule__Header__NumberOfStepsAssignment_3"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2821:1: rule__Header__NumberOfStepsAssignment_3 : ( RULE_INT ) ;
    public final void rule__Header__NumberOfStepsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2825:1: ( ( RULE_INT ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2826:1: ( RULE_INT )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2826:1: ( RULE_INT )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2827:1: RULE_INT
            {
             before(grammarAccess.getHeaderAccess().getNumberOfStepsINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Header__NumberOfStepsAssignment_35714); 
             after(grammarAccess.getHeaderAccess().getNumberOfStepsINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__NumberOfStepsAssignment_3"


    // $ANTLR start "rule__Header__NumberOfEventsAssignment_4"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2836:1: rule__Header__NumberOfEventsAssignment_4 : ( RULE_INT ) ;
    public final void rule__Header__NumberOfEventsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2840:1: ( ( RULE_INT ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2841:1: ( RULE_INT )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2841:1: ( RULE_INT )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2842:1: RULE_INT
            {
             before(grammarAccess.getHeaderAccess().getNumberOfEventsINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Header__NumberOfEventsAssignment_45745); 
             after(grammarAccess.getHeaderAccess().getNumberOfEventsINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Header__NumberOfEventsAssignment_4"


    // $ANTLR start "rule__Event__AnAssignment_0_0"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2851:1: rule__Event__AnAssignment_0_0 : ( ruleAn ) ;
    public final void rule__Event__AnAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2855:1: ( ( ruleAn ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2856:1: ( ruleAn )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2856:1: ( ruleAn )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2857:1: ruleAn
            {
             before(grammarAccess.getEventAccess().getAnAnParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleAn_in_rule__Event__AnAssignment_0_05776);
            ruleAn();

            state._fsp--;

             after(grammarAccess.getEventAccess().getAnAnParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__AnAssignment_0_0"


    // $ANTLR start "rule__Event__CnAssignment_0_1"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2866:1: rule__Event__CnAssignment_0_1 : ( ruleCn ) ;
    public final void rule__Event__CnAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2870:1: ( ( ruleCn ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2871:1: ( ruleCn )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2871:1: ( ruleCn )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2872:1: ruleCn
            {
             before(grammarAccess.getEventAccess().getCnCnParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleCn_in_rule__Event__CnAssignment_0_15807);
            ruleCn();

            state._fsp--;

             after(grammarAccess.getEventAccess().getCnCnParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__CnAssignment_0_1"


    // $ANTLR start "rule__Event__DnAssignment_0_2"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2881:1: rule__Event__DnAssignment_0_2 : ( ruleDn ) ;
    public final void rule__Event__DnAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2885:1: ( ( ruleDn ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2886:1: ( ruleDn )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2886:1: ( ruleDn )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2887:1: ruleDn
            {
             before(grammarAccess.getEventAccess().getDnDnParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleDn_in_rule__Event__DnAssignment_0_25838);
            ruleDn();

            state._fsp--;

             after(grammarAccess.getEventAccess().getDnDnParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__DnAssignment_0_2"


    // $ANTLR start "rule__Event__AeAssignment_0_3"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2896:1: rule__Event__AeAssignment_0_3 : ( ruleAe ) ;
    public final void rule__Event__AeAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2900:1: ( ( ruleAe ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2901:1: ( ruleAe )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2901:1: ( ruleAe )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2902:1: ruleAe
            {
             before(grammarAccess.getEventAccess().getAeAeParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_ruleAe_in_rule__Event__AeAssignment_0_35869);
            ruleAe();

            state._fsp--;

             after(grammarAccess.getEventAccess().getAeAeParserRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__AeAssignment_0_3"


    // $ANTLR start "rule__Event__CeAssignment_0_4"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2911:1: rule__Event__CeAssignment_0_4 : ( ruleCe ) ;
    public final void rule__Event__CeAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2915:1: ( ( ruleCe ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2916:1: ( ruleCe )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2916:1: ( ruleCe )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2917:1: ruleCe
            {
             before(grammarAccess.getEventAccess().getCeCeParserRuleCall_0_4_0()); 
            pushFollow(FOLLOW_ruleCe_in_rule__Event__CeAssignment_0_45900);
            ruleCe();

            state._fsp--;

             after(grammarAccess.getEventAccess().getCeCeParserRuleCall_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__CeAssignment_0_4"


    // $ANTLR start "rule__Event__DeAssignment_0_5"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2926:1: rule__Event__DeAssignment_0_5 : ( ruleDe ) ;
    public final void rule__Event__DeAssignment_0_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2930:1: ( ( ruleDe ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2931:1: ( ruleDe )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2931:1: ( ruleDe )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2932:1: ruleDe
            {
             before(grammarAccess.getEventAccess().getDeDeParserRuleCall_0_5_0()); 
            pushFollow(FOLLOW_ruleDe_in_rule__Event__DeAssignment_0_55931);
            ruleDe();

            state._fsp--;

             after(grammarAccess.getEventAccess().getDeDeParserRuleCall_0_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__DeAssignment_0_5"


    // $ANTLR start "rule__Event__CgAssignment_0_6"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2941:1: rule__Event__CgAssignment_0_6 : ( ruleCg ) ;
    public final void rule__Event__CgAssignment_0_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2945:1: ( ( ruleCg ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2946:1: ( ruleCg )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2946:1: ( ruleCg )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2947:1: ruleCg
            {
             before(grammarAccess.getEventAccess().getCgCgParserRuleCall_0_6_0()); 
            pushFollow(FOLLOW_ruleCg_in_rule__Event__CgAssignment_0_65962);
            ruleCg();

            state._fsp--;

             after(grammarAccess.getEventAccess().getCgCgParserRuleCall_0_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__CgAssignment_0_6"


    // $ANTLR start "rule__Event__StAssignment_0_7"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2956:1: rule__Event__StAssignment_0_7 : ( ruleSt ) ;
    public final void rule__Event__StAssignment_0_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2960:1: ( ( ruleSt ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2961:1: ( ruleSt )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2961:1: ( ruleSt )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2962:1: ruleSt
            {
             before(grammarAccess.getEventAccess().getStStParserRuleCall_0_7_0()); 
            pushFollow(FOLLOW_ruleSt_in_rule__Event__StAssignment_0_75993);
            ruleSt();

            state._fsp--;

             after(grammarAccess.getEventAccess().getStStParserRuleCall_0_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__StAssignment_0_7"


    // $ANTLR start "rule__Event__ClAssignment_0_8"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2971:1: rule__Event__ClAssignment_0_8 : ( RULE_CL ) ;
    public final void rule__Event__ClAssignment_0_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2975:1: ( ( RULE_CL ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2976:1: ( RULE_CL )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2976:1: ( RULE_CL )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2977:1: RULE_CL
            {
             before(grammarAccess.getEventAccess().getClClTerminalRuleCall_0_8_0()); 
            match(input,RULE_CL,FOLLOW_RULE_CL_in_rule__Event__ClAssignment_0_86024); 
             after(grammarAccess.getEventAccess().getClClTerminalRuleCall_0_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__ClAssignment_0_8"


    // $ANTLR start "rule__Event__CommentAssignment_1_0"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2986:1: rule__Event__CommentAssignment_1_0 : ( RULE_COMMENT ) ;
    public final void rule__Event__CommentAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2990:1: ( ( RULE_COMMENT ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2991:1: ( RULE_COMMENT )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2991:1: ( RULE_COMMENT )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2992:1: RULE_COMMENT
            {
             before(grammarAccess.getEventAccess().getCommentCOMMENTTerminalRuleCall_1_0_0()); 
            match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_rule__Event__CommentAssignment_1_06055); 
             after(grammarAccess.getEventAccess().getCommentCOMMENTTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__CommentAssignment_1_0"


    // $ANTLR start "rule__An__IdNodeAssignment_1"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3001:1: rule__An__IdNodeAssignment_1 : ( ruleId ) ;
    public final void rule__An__IdNodeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3005:1: ( ( ruleId ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3006:1: ( ruleId )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3006:1: ( ruleId )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3007:1: ruleId
            {
             before(grammarAccess.getAnAccess().getIdNodeIdParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleId_in_rule__An__IdNodeAssignment_16086);
            ruleId();

            state._fsp--;

             after(grammarAccess.getAnAccess().getIdNodeIdParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__An__IdNodeAssignment_1"


    // $ANTLR start "rule__An__AttributesAssignment_2"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3016:1: rule__An__AttributesAssignment_2 : ( ruleAttributes ) ;
    public final void rule__An__AttributesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3020:1: ( ( ruleAttributes ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3021:1: ( ruleAttributes )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3021:1: ( ruleAttributes )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3022:1: ruleAttributes
            {
             before(grammarAccess.getAnAccess().getAttributesAttributesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAttributes_in_rule__An__AttributesAssignment_26117);
            ruleAttributes();

            state._fsp--;

             after(grammarAccess.getAnAccess().getAttributesAttributesParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__An__AttributesAssignment_2"


    // $ANTLR start "rule__Cn__IdNodeAssignment_1"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3031:1: rule__Cn__IdNodeAssignment_1 : ( ruleId ) ;
    public final void rule__Cn__IdNodeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3035:1: ( ( ruleId ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3036:1: ( ruleId )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3036:1: ( ruleId )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3037:1: ruleId
            {
             before(grammarAccess.getCnAccess().getIdNodeIdParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleId_in_rule__Cn__IdNodeAssignment_16148);
            ruleId();

            state._fsp--;

             after(grammarAccess.getCnAccess().getIdNodeIdParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cn__IdNodeAssignment_1"


    // $ANTLR start "rule__Cn__AttributesAssignment_2"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3046:1: rule__Cn__AttributesAssignment_2 : ( ruleAttributes ) ;
    public final void rule__Cn__AttributesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3050:1: ( ( ruleAttributes ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3051:1: ( ruleAttributes )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3051:1: ( ruleAttributes )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3052:1: ruleAttributes
            {
             before(grammarAccess.getCnAccess().getAttributesAttributesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAttributes_in_rule__Cn__AttributesAssignment_26179);
            ruleAttributes();

            state._fsp--;

             after(grammarAccess.getCnAccess().getAttributesAttributesParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cn__AttributesAssignment_2"


    // $ANTLR start "rule__Dn__IdNodeAssignment_1"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3061:1: rule__Dn__IdNodeAssignment_1 : ( ruleId ) ;
    public final void rule__Dn__IdNodeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3065:1: ( ( ruleId ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3066:1: ( ruleId )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3066:1: ( ruleId )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3067:1: ruleId
            {
             before(grammarAccess.getDnAccess().getIdNodeIdParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleId_in_rule__Dn__IdNodeAssignment_16210);
            ruleId();

            state._fsp--;

             after(grammarAccess.getDnAccess().getIdNodeIdParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dn__IdNodeAssignment_1"


    // $ANTLR start "rule__Ae__IdEdgeAssignment_1"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3076:1: rule__Ae__IdEdgeAssignment_1 : ( ruleId ) ;
    public final void rule__Ae__IdEdgeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3080:1: ( ( ruleId ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3081:1: ( ruleId )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3081:1: ( ruleId )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3082:1: ruleId
            {
             before(grammarAccess.getAeAccess().getIdEdgeIdParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleId_in_rule__Ae__IdEdgeAssignment_16241);
            ruleId();

            state._fsp--;

             after(grammarAccess.getAeAccess().getIdEdgeIdParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ae__IdEdgeAssignment_1"


    // $ANTLR start "rule__Ae__IdNode1Assignment_2"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3091:1: rule__Ae__IdNode1Assignment_2 : ( ruleId ) ;
    public final void rule__Ae__IdNode1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3095:1: ( ( ruleId ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3096:1: ( ruleId )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3096:1: ( ruleId )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3097:1: ruleId
            {
             before(grammarAccess.getAeAccess().getIdNode1IdParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleId_in_rule__Ae__IdNode1Assignment_26272);
            ruleId();

            state._fsp--;

             after(grammarAccess.getAeAccess().getIdNode1IdParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ae__IdNode1Assignment_2"


    // $ANTLR start "rule__Ae__DirectionAssignment_3"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3106:1: rule__Ae__DirectionAssignment_3 : ( RULE_DIRECTION ) ;
    public final void rule__Ae__DirectionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3110:1: ( ( RULE_DIRECTION ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3111:1: ( RULE_DIRECTION )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3111:1: ( RULE_DIRECTION )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3112:1: RULE_DIRECTION
            {
             before(grammarAccess.getAeAccess().getDirectionDIRECTIONTerminalRuleCall_3_0()); 
            match(input,RULE_DIRECTION,FOLLOW_RULE_DIRECTION_in_rule__Ae__DirectionAssignment_36303); 
             after(grammarAccess.getAeAccess().getDirectionDIRECTIONTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ae__DirectionAssignment_3"


    // $ANTLR start "rule__Ae__IdNode2Assignment_4"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3121:1: rule__Ae__IdNode2Assignment_4 : ( ruleId ) ;
    public final void rule__Ae__IdNode2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3125:1: ( ( ruleId ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3126:1: ( ruleId )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3126:1: ( ruleId )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3127:1: ruleId
            {
             before(grammarAccess.getAeAccess().getIdNode2IdParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleId_in_rule__Ae__IdNode2Assignment_46334);
            ruleId();

            state._fsp--;

             after(grammarAccess.getAeAccess().getIdNode2IdParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ae__IdNode2Assignment_4"


    // $ANTLR start "rule__Ae__AttributesAssignment_5"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3136:1: rule__Ae__AttributesAssignment_5 : ( ruleAttributes ) ;
    public final void rule__Ae__AttributesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3140:1: ( ( ruleAttributes ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3141:1: ( ruleAttributes )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3141:1: ( ruleAttributes )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3142:1: ruleAttributes
            {
             before(grammarAccess.getAeAccess().getAttributesAttributesParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleAttributes_in_rule__Ae__AttributesAssignment_56365);
            ruleAttributes();

            state._fsp--;

             after(grammarAccess.getAeAccess().getAttributesAttributesParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ae__AttributesAssignment_5"


    // $ANTLR start "rule__Ce__IdEdgeAssignment_1"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3151:1: rule__Ce__IdEdgeAssignment_1 : ( ruleId ) ;
    public final void rule__Ce__IdEdgeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3155:1: ( ( ruleId ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3156:1: ( ruleId )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3156:1: ( ruleId )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3157:1: ruleId
            {
             before(grammarAccess.getCeAccess().getIdEdgeIdParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleId_in_rule__Ce__IdEdgeAssignment_16396);
            ruleId();

            state._fsp--;

             after(grammarAccess.getCeAccess().getIdEdgeIdParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ce__IdEdgeAssignment_1"


    // $ANTLR start "rule__Ce__AttributesAssignment_2"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3166:1: rule__Ce__AttributesAssignment_2 : ( ruleAttributes ) ;
    public final void rule__Ce__AttributesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3170:1: ( ( ruleAttributes ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3171:1: ( ruleAttributes )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3171:1: ( ruleAttributes )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3172:1: ruleAttributes
            {
             before(grammarAccess.getCeAccess().getAttributesAttributesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAttributes_in_rule__Ce__AttributesAssignment_26427);
            ruleAttributes();

            state._fsp--;

             after(grammarAccess.getCeAccess().getAttributesAttributesParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ce__AttributesAssignment_2"


    // $ANTLR start "rule__De__IdEdgeAssignment_1"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3181:1: rule__De__IdEdgeAssignment_1 : ( ruleId ) ;
    public final void rule__De__IdEdgeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3185:1: ( ( ruleId ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3186:1: ( ruleId )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3186:1: ( ruleId )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3187:1: ruleId
            {
             before(grammarAccess.getDeAccess().getIdEdgeIdParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleId_in_rule__De__IdEdgeAssignment_16458);
            ruleId();

            state._fsp--;

             after(grammarAccess.getDeAccess().getIdEdgeIdParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__De__IdEdgeAssignment_1"


    // $ANTLR start "rule__Cg__AttributesAssignment_1"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3196:1: rule__Cg__AttributesAssignment_1 : ( ruleAttributes ) ;
    public final void rule__Cg__AttributesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3200:1: ( ( ruleAttributes ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3201:1: ( ruleAttributes )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3201:1: ( ruleAttributes )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3202:1: ruleAttributes
            {
             before(grammarAccess.getCgAccess().getAttributesAttributesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAttributes_in_rule__Cg__AttributesAssignment_16489);
            ruleAttributes();

            state._fsp--;

             after(grammarAccess.getCgAccess().getAttributesAttributesParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cg__AttributesAssignment_1"


    // $ANTLR start "rule__St__RealAssignment_1"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3211:1: rule__St__RealAssignment_1 : ( RULE_REAL ) ;
    public final void rule__St__RealAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3215:1: ( ( RULE_REAL ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3216:1: ( RULE_REAL )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3216:1: ( RULE_REAL )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3217:1: RULE_REAL
            {
             before(grammarAccess.getStAccess().getRealREALTerminalRuleCall_1_0()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__St__RealAssignment_16520); 
             after(grammarAccess.getStAccess().getRealREALTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__St__RealAssignment_1"


    // $ANTLR start "rule__Attributes__AttributeAssignment_1"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3226:1: rule__Attributes__AttributeAssignment_1 : ( ruleAttribute ) ;
    public final void rule__Attributes__AttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3230:1: ( ( ruleAttribute ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3231:1: ( ruleAttribute )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3231:1: ( ruleAttribute )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3232:1: ruleAttribute
            {
             before(grammarAccess.getAttributesAccess().getAttributeAttributeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Attributes__AttributeAssignment_16551);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributesAccess().getAttributeAttributeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attributes__AttributeAssignment_1"


    // $ANTLR start "rule__Attribute__OperatorAssignment_0"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3241:1: rule__Attribute__OperatorAssignment_0 : ( RULE_OPERATOR ) ;
    public final void rule__Attribute__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3245:1: ( ( RULE_OPERATOR ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3246:1: ( RULE_OPERATOR )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3246:1: ( RULE_OPERATOR )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3247:1: RULE_OPERATOR
            {
             before(grammarAccess.getAttributeAccess().getOperatorOPERATORTerminalRuleCall_0_0()); 
            match(input,RULE_OPERATOR,FOLLOW_RULE_OPERATOR_in_rule__Attribute__OperatorAssignment_06582); 
             after(grammarAccess.getAttributeAccess().getOperatorOPERATORTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__OperatorAssignment_0"


    // $ANTLR start "rule__Attribute__IdAttributeAssignment_1"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3256:1: rule__Attribute__IdAttributeAssignment_1 : ( ruleId ) ;
    public final void rule__Attribute__IdAttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3260:1: ( ( ruleId ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3261:1: ( ruleId )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3261:1: ( ruleId )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3262:1: ruleId
            {
             before(grammarAccess.getAttributeAccess().getIdAttributeIdParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleId_in_rule__Attribute__IdAttributeAssignment_16613);
            ruleId();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getIdAttributeIdParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__IdAttributeAssignment_1"


    // $ANTLR start "rule__Attribute__AssignAssignment_2_0"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3271:1: rule__Attribute__AssignAssignment_2_0 : ( RULE_ASSIGN ) ;
    public final void rule__Attribute__AssignAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3275:1: ( ( RULE_ASSIGN ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3276:1: ( RULE_ASSIGN )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3276:1: ( RULE_ASSIGN )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3277:1: RULE_ASSIGN
            {
             before(grammarAccess.getAttributeAccess().getAssignASSIGNTerminalRuleCall_2_0_0()); 
            match(input,RULE_ASSIGN,FOLLOW_RULE_ASSIGN_in_rule__Attribute__AssignAssignment_2_06644); 
             after(grammarAccess.getAttributeAccess().getAssignASSIGNTerminalRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__AssignAssignment_2_0"


    // $ANTLR start "rule__Attribute__ValueAssignment_2_1"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3286:1: rule__Attribute__ValueAssignment_2_1 : ( ruleValue ) ;
    public final void rule__Attribute__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3290:1: ( ( ruleValue ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3291:1: ( ruleValue )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3291:1: ( ruleValue )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3292:1: ruleValue
            {
             before(grammarAccess.getAttributeAccess().getValueValueParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Attribute__ValueAssignment_2_16675);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getValueValueParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__ValueAssignment_2_1"


    // $ANTLR start "rule__Attribute__OtherValuesAssignment_2_2_1"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3301:1: rule__Attribute__OtherValuesAssignment_2_2_1 : ( ruleValue ) ;
    public final void rule__Attribute__OtherValuesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3305:1: ( ( ruleValue ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3306:1: ( ruleValue )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3306:1: ( ruleValue )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3307:1: ruleValue
            {
             before(grammarAccess.getAttributeAccess().getOtherValuesValueParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Attribute__OtherValuesAssignment_2_2_16706);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getOtherValuesValueParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__OtherValuesAssignment_2_2_1"


    // $ANTLR start "rule__Value__StringAssignment_0"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3316:1: rule__Value__StringAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Value__StringAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3320:1: ( ( RULE_STRING ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3321:1: ( RULE_STRING )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3321:1: ( RULE_STRING )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3322:1: RULE_STRING
            {
             before(grammarAccess.getValueAccess().getStringSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Value__StringAssignment_06737); 
             after(grammarAccess.getValueAccess().getStringSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__StringAssignment_0"


    // $ANTLR start "rule__Value__RealAssignment_1"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3331:1: rule__Value__RealAssignment_1 : ( RULE_REAL ) ;
    public final void rule__Value__RealAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3335:1: ( ( RULE_REAL ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3336:1: ( RULE_REAL )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3336:1: ( RULE_REAL )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3337:1: RULE_REAL
            {
             before(grammarAccess.getValueAccess().getRealREALTerminalRuleCall_1_0()); 
            match(input,RULE_REAL,FOLLOW_RULE_REAL_in_rule__Value__RealAssignment_16768); 
             after(grammarAccess.getValueAccess().getRealREALTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__RealAssignment_1"


    // $ANTLR start "rule__Value__IntAssignment_2"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3346:1: rule__Value__IntAssignment_2 : ( RULE_INT ) ;
    public final void rule__Value__IntAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3350:1: ( ( RULE_INT ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3351:1: ( RULE_INT )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3351:1: ( RULE_INT )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3352:1: RULE_INT
            {
             before(grammarAccess.getValueAccess().getIntINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Value__IntAssignment_26799); 
             after(grammarAccess.getValueAccess().getIntINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__IntAssignment_2"


    // $ANTLR start "rule__Value__ArrayAssignment_3"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3361:1: rule__Value__ArrayAssignment_3 : ( ruleArray ) ;
    public final void rule__Value__ArrayAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3365:1: ( ( ruleArray ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3366:1: ( ruleArray )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3366:1: ( ruleArray )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3367:1: ruleArray
            {
             before(grammarAccess.getValueAccess().getArrayArrayParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleArray_in_rule__Value__ArrayAssignment_36830);
            ruleArray();

            state._fsp--;

             after(grammarAccess.getValueAccess().getArrayArrayParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__ArrayAssignment_3"


    // $ANTLR start "rule__Value__MapAssignment_4"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3376:1: rule__Value__MapAssignment_4 : ( ruleMap ) ;
    public final void rule__Value__MapAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3380:1: ( ( ruleMap ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3381:1: ( ruleMap )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3381:1: ( ruleMap )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3382:1: ruleMap
            {
             before(grammarAccess.getValueAccess().getMapMapParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleMap_in_rule__Value__MapAssignment_46861);
            ruleMap();

            state._fsp--;

             after(grammarAccess.getValueAccess().getMapMapParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__MapAssignment_4"


    // $ANTLR start "rule__Array__ValueAssignment_2_0"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3391:1: rule__Array__ValueAssignment_2_0 : ( ruleValue ) ;
    public final void rule__Array__ValueAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3395:1: ( ( ruleValue ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3396:1: ( ruleValue )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3396:1: ( ruleValue )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3397:1: ruleValue
            {
             before(grammarAccess.getArrayAccess().getValueValueParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Array__ValueAssignment_2_06892);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getArrayAccess().getValueValueParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__ValueAssignment_2_0"


    // $ANTLR start "rule__Array__OtherValuesAssignment_2_1_1"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3406:1: rule__Array__OtherValuesAssignment_2_1_1 : ( ruleValue ) ;
    public final void rule__Array__OtherValuesAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3410:1: ( ( ruleValue ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3411:1: ( ruleValue )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3411:1: ( ruleValue )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3412:1: ruleValue
            {
             before(grammarAccess.getArrayAccess().getOtherValuesValueParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Array__OtherValuesAssignment_2_1_16923);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getArrayAccess().getOtherValuesValueParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__OtherValuesAssignment_2_1_1"


    // $ANTLR start "rule__Map__MappingAssignment_1"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3421:1: rule__Map__MappingAssignment_1 : ( ruleMapping ) ;
    public final void rule__Map__MappingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3425:1: ( ( ruleMapping ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3426:1: ( ruleMapping )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3426:1: ( ruleMapping )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3427:1: ruleMapping
            {
             before(grammarAccess.getMapAccess().getMappingMappingParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMapping_in_rule__Map__MappingAssignment_16954);
            ruleMapping();

            state._fsp--;

             after(grammarAccess.getMapAccess().getMappingMappingParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Map__MappingAssignment_1"


    // $ANTLR start "rule__Map__OtherMappingAssignment_2_1"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3436:1: rule__Map__OtherMappingAssignment_2_1 : ( ruleMapping ) ;
    public final void rule__Map__OtherMappingAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3440:1: ( ( ruleMapping ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3441:1: ( ruleMapping )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3441:1: ( ruleMapping )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3442:1: ruleMapping
            {
             before(grammarAccess.getMapAccess().getOtherMappingMappingParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleMapping_in_rule__Map__OtherMappingAssignment_2_16985);
            ruleMapping();

            state._fsp--;

             after(grammarAccess.getMapAccess().getOtherMappingMappingParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Map__OtherMappingAssignment_2_1"


    // $ANTLR start "rule__Mapping__IdAssignment_0"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3451:1: rule__Mapping__IdAssignment_0 : ( ruleId ) ;
    public final void rule__Mapping__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3455:1: ( ( ruleId ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3456:1: ( ruleId )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3456:1: ( ruleId )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3457:1: ruleId
            {
             before(grammarAccess.getMappingAccess().getIdIdParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleId_in_rule__Mapping__IdAssignment_07016);
            ruleId();

            state._fsp--;

             after(grammarAccess.getMappingAccess().getIdIdParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__IdAssignment_0"


    // $ANTLR start "rule__Mapping__AssignAssignment_1"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3466:1: rule__Mapping__AssignAssignment_1 : ( RULE_ASSIGN ) ;
    public final void rule__Mapping__AssignAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3470:1: ( ( RULE_ASSIGN ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3471:1: ( RULE_ASSIGN )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3471:1: ( RULE_ASSIGN )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3472:1: RULE_ASSIGN
            {
             before(grammarAccess.getMappingAccess().getAssignASSIGNTerminalRuleCall_1_0()); 
            match(input,RULE_ASSIGN,FOLLOW_RULE_ASSIGN_in_rule__Mapping__AssignAssignment_17047); 
             after(grammarAccess.getMappingAccess().getAssignASSIGNTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__AssignAssignment_1"


    // $ANTLR start "rule__Mapping__ValueAssignment_2"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3481:1: rule__Mapping__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__Mapping__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3485:1: ( ( ruleValue ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3486:1: ( ruleValue )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3486:1: ( ruleValue )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3487:1: ruleValue
            {
             before(grammarAccess.getMappingAccess().getValueValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Mapping__ValueAssignment_27078);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getMappingAccess().getValueValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__ValueAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleDgs_in_entryRuleDgs61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDgs68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dgs__Group__0_in_ruleDgs94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeader_in_entryRuleHeader121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeader128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group__0_in_ruleHeader154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__0_in_ruleEvent214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAn_in_entryRuleAn241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAn248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__An__Group__0_in_ruleAn274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCn_in_entryRuleCn301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCn308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cn__Group__0_in_ruleCn334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDn_in_entryRuleDn361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDn368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dn__Group__0_in_ruleDn394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAe_in_entryRuleAe421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAe428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ae__Group__0_in_ruleAe454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCe_in_entryRuleCe481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCe488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ce__Group__0_in_ruleCe514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDe_in_entryRuleDe541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDe548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__De__Group__0_in_ruleDe574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCg_in_entryRuleCg601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCg608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cg__Group__0_in_ruleCg634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSt_in_entryRuleSt661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSt668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__St__Group__0_in_ruleSt694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributes_in_entryRuleAttributes721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributes728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attributes__Group__0_in_ruleAttributes754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Alternatives_in_ruleValue874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_entryRuleArray901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArray908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__0_in_ruleArray934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMap_in_entryRuleMap961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMap968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Map__Group__0_in_ruleMap994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_entryRuleMapping1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapping1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__0_in_ruleMapping1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleId_in_entryRuleId1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleId1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Id__Alternatives_in_ruleId1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dgs__EventAssignment_1_0_in_rule__Dgs__Alternatives_11150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dgs__CommentAssignment_1_1_in_rule__Dgs__Alternatives_11168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EOL_in_rule__Dgs__Alternatives_11186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__AnAssignment_0_0_in_rule__Event__Alternatives_01218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__CnAssignment_0_1_in_rule__Event__Alternatives_01236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__DnAssignment_0_2_in_rule__Event__Alternatives_01254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__AeAssignment_0_3_in_rule__Event__Alternatives_01272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__CeAssignment_0_4_in_rule__Event__Alternatives_01290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__DeAssignment_0_5_in_rule__Event__Alternatives_01308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__CgAssignment_0_6_in_rule__Event__Alternatives_01326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__StAssignment_0_7_in_rule__Event__Alternatives_01344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__ClAssignment_0_8_in_rule__Event__Alternatives_01362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__CommentAssignment_1_0_in_rule__Event__Alternatives_11395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EOL_in_rule__Event__Alternatives_11413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__StringAssignment_0_in_rule__Value__Alternatives1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__RealAssignment_1_in_rule__Value__Alternatives1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__IntAssignment_2_in_rule__Value__Alternatives1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__ArrayAssignment_3_in_rule__Value__Alternatives1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__MapAssignment_4_in_rule__Value__Alternatives1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Id__Alternatives1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Id__Alternatives1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Id__Group_2__0_in_rule__Id__Alternatives1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dgs__Group__0__Impl_in_rule__Dgs__Group__01615 = new BitSet(new long[]{0x0000000000FF0510L});
    public static final BitSet FOLLOW_rule__Dgs__Group__1_in_rule__Dgs__Group__01618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dgs__HeaderAssignment_0_in_rule__Dgs__Group__0__Impl1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dgs__Group__1__Impl_in_rule__Dgs__Group__11675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dgs__Alternatives_1_in_rule__Dgs__Group__1__Impl1702 = new BitSet(new long[]{0x0000000000FF0512L});
    public static final BitSet FOLLOW_rule__Header__Group__0__Impl_in_rule__Header__Group__01737 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Header__Group__1_in_rule__Header__Group__01740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__MagicAssignment_0_in_rule__Header__Group__0__Impl1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group__1__Impl_in_rule__Header__Group__11797 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_rule__Header__Group__2_in_rule__Header__Group__11800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EOL_in_rule__Header__Group__1__Impl1827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group__2__Impl_in_rule__Header__Group__21856 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Header__Group__3_in_rule__Header__Group__21859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__NameAssignment_2_in_rule__Header__Group__2__Impl1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group__3__Impl_in_rule__Header__Group__31916 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Header__Group__4_in_rule__Header__Group__31919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__NumberOfStepsAssignment_3_in_rule__Header__Group__3__Impl1946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group__4__Impl_in_rule__Header__Group__41976 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Header__Group__5_in_rule__Header__Group__41979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__NumberOfEventsAssignment_4_in_rule__Header__Group__4__Impl2006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group__5__Impl_in_rule__Header__Group__52036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EOL_in_rule__Header__Group__5__Impl2063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__02104 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_rule__Event__Group__1_in_rule__Event__Group__02107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Alternatives_0_in_rule__Event__Group__0__Impl2134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__12164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Alternatives_1_in_rule__Event__Group__1__Impl2191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__An__Group__0__Impl_in_rule__An__Group__02225 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_rule__An__Group__1_in_rule__An__Group__02228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__An__Group__0__Impl2256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__An__Group__1__Impl_in_rule__An__Group__12287 = new BitSet(new long[]{0x00000000000020E0L});
    public static final BitSet FOLLOW_rule__An__Group__2_in_rule__An__Group__12290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__An__IdNodeAssignment_1_in_rule__An__Group__1__Impl2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__An__Group__2__Impl_in_rule__An__Group__22347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__An__AttributesAssignment_2_in_rule__An__Group__2__Impl2374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cn__Group__0__Impl_in_rule__Cn__Group__02410 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_rule__Cn__Group__1_in_rule__Cn__Group__02413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Cn__Group__0__Impl2441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cn__Group__1__Impl_in_rule__Cn__Group__12472 = new BitSet(new long[]{0x00000000000020E0L});
    public static final BitSet FOLLOW_rule__Cn__Group__2_in_rule__Cn__Group__12475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cn__IdNodeAssignment_1_in_rule__Cn__Group__1__Impl2502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cn__Group__2__Impl_in_rule__Cn__Group__22532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cn__AttributesAssignment_2_in_rule__Cn__Group__2__Impl2559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dn__Group__0__Impl_in_rule__Dn__Group__02595 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_rule__Dn__Group__1_in_rule__Dn__Group__02598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Dn__Group__0__Impl2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dn__Group__1__Impl_in_rule__Dn__Group__12657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dn__IdNodeAssignment_1_in_rule__Dn__Group__1__Impl2684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ae__Group__0__Impl_in_rule__Ae__Group__02718 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_rule__Ae__Group__1_in_rule__Ae__Group__02721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Ae__Group__0__Impl2749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ae__Group__1__Impl_in_rule__Ae__Group__12780 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_rule__Ae__Group__2_in_rule__Ae__Group__12783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ae__IdEdgeAssignment_1_in_rule__Ae__Group__1__Impl2810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ae__Group__2__Impl_in_rule__Ae__Group__22840 = new BitSet(new long[]{0x00000000000008E0L});
    public static final BitSet FOLLOW_rule__Ae__Group__3_in_rule__Ae__Group__22843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ae__IdNode1Assignment_2_in_rule__Ae__Group__2__Impl2870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ae__Group__3__Impl_in_rule__Ae__Group__32900 = new BitSet(new long[]{0x00000000000008E0L});
    public static final BitSet FOLLOW_rule__Ae__Group__4_in_rule__Ae__Group__32903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ae__DirectionAssignment_3_in_rule__Ae__Group__3__Impl2930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ae__Group__4__Impl_in_rule__Ae__Group__42961 = new BitSet(new long[]{0x00000000000020E0L});
    public static final BitSet FOLLOW_rule__Ae__Group__5_in_rule__Ae__Group__42964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ae__IdNode2Assignment_4_in_rule__Ae__Group__4__Impl2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ae__Group__5__Impl_in_rule__Ae__Group__53021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ae__AttributesAssignment_5_in_rule__Ae__Group__5__Impl3048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ce__Group__0__Impl_in_rule__Ce__Group__03090 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_rule__Ce__Group__1_in_rule__Ce__Group__03093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Ce__Group__0__Impl3121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ce__Group__1__Impl_in_rule__Ce__Group__13152 = new BitSet(new long[]{0x00000000000020E0L});
    public static final BitSet FOLLOW_rule__Ce__Group__2_in_rule__Ce__Group__13155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ce__IdEdgeAssignment_1_in_rule__Ce__Group__1__Impl3182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ce__Group__2__Impl_in_rule__Ce__Group__23212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ce__AttributesAssignment_2_in_rule__Ce__Group__2__Impl3239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__De__Group__0__Impl_in_rule__De__Group__03275 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_rule__De__Group__1_in_rule__De__Group__03278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__De__Group__0__Impl3306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__De__Group__1__Impl_in_rule__De__Group__13337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__De__IdEdgeAssignment_1_in_rule__De__Group__1__Impl3364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cg__Group__0__Impl_in_rule__Cg__Group__03398 = new BitSet(new long[]{0x00000000000020E0L});
    public static final BitSet FOLLOW_rule__Cg__Group__1_in_rule__Cg__Group__03401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Cg__Group__0__Impl3429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cg__Group__1__Impl_in_rule__Cg__Group__13460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cg__AttributesAssignment_1_in_rule__Cg__Group__1__Impl3487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__St__Group__0__Impl_in_rule__St__Group__03521 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__St__Group__1_in_rule__St__Group__03524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__St__Group__0__Impl3552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__St__Group__1__Impl_in_rule__St__Group__13583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__St__RealAssignment_1_in_rule__St__Group__1__Impl3610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attributes__Group__0__Impl_in_rule__Attributes__Group__03644 = new BitSet(new long[]{0x00000000000020E0L});
    public static final BitSet FOLLOW_rule__Attributes__Group__1_in_rule__Attributes__Group__03647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attributes__Group__1__Impl_in_rule__Attributes__Group__13705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attributes__AttributeAssignment_1_in_rule__Attributes__Group__1__Impl3732 = new BitSet(new long[]{0x00000000000020E2L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__03767 = new BitSet(new long[]{0x00000000000020E0L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__03770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__OperatorAssignment_0_in_rule__Attribute__Group__0__Impl3797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__13828 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__13831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__IdAttributeAssignment_1_in_rule__Attribute__Group__1__Impl3858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__23888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2__0_in_rule__Attribute__Group__2__Impl3915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2__0__Impl_in_rule__Attribute__Group_2__03952 = new BitSet(new long[]{0x000000000A001060L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2__1_in_rule__Attribute__Group_2__03955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__AssignAssignment_2_0_in_rule__Attribute__Group_2__0__Impl3982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2__1__Impl_in_rule__Attribute__Group_2__14012 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2__2_in_rule__Attribute__Group_2__14015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ValueAssignment_2_1_in_rule__Attribute__Group_2__1__Impl4042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2__2__Impl_in_rule__Attribute__Group_2__24072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2_2__0_in_rule__Attribute__Group_2__2__Impl4099 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2_2__0__Impl_in_rule__Attribute__Group_2_2__04136 = new BitSet(new long[]{0x000000000A001060L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2_2__1_in_rule__Attribute__Group_2_2__04139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Attribute__Group_2_2__0__Impl4167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2_2__1__Impl_in_rule__Attribute__Group_2_2__14198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__OtherValuesAssignment_2_2_1_in_rule__Attribute__Group_2_2__1__Impl4225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__0__Impl_in_rule__Array__Group__04259 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Array__Group__1_in_rule__Array__Group__04262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__1__Impl_in_rule__Array__Group__14320 = new BitSet(new long[]{0x000000000E001060L});
    public static final BitSet FOLLOW_rule__Array__Group__2_in_rule__Array__Group__14323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Array__Group__1__Impl4351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__2__Impl_in_rule__Array__Group__24382 = new BitSet(new long[]{0x000000000E001060L});
    public static final BitSet FOLLOW_rule__Array__Group__3_in_rule__Array__Group__24385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group_2__0_in_rule__Array__Group__2__Impl4412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__3__Impl_in_rule__Array__Group__34443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Array__Group__3__Impl4471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group_2__0__Impl_in_rule__Array__Group_2__04510 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Array__Group_2__1_in_rule__Array__Group_2__04513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__ValueAssignment_2_0_in_rule__Array__Group_2__0__Impl4540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group_2__1__Impl_in_rule__Array__Group_2__14570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group_2_1__0_in_rule__Array__Group_2__1__Impl4597 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Array__Group_2_1__0__Impl_in_rule__Array__Group_2_1__04632 = new BitSet(new long[]{0x000000000A001060L});
    public static final BitSet FOLLOW_rule__Array__Group_2_1__1_in_rule__Array__Group_2_1__04635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Array__Group_2_1__0__Impl4663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group_2_1__1__Impl_in_rule__Array__Group_2_1__14694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__OtherValuesAssignment_2_1_1_in_rule__Array__Group_2_1__1__Impl4721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Map__Group__0__Impl_in_rule__Map__Group__04755 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_rule__Map__Group__1_in_rule__Map__Group__04758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Map__Group__0__Impl4786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Map__Group__1__Impl_in_rule__Map__Group__14817 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_rule__Map__Group__2_in_rule__Map__Group__14820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Map__MappingAssignment_1_in_rule__Map__Group__1__Impl4847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Map__Group__2__Impl_in_rule__Map__Group__24877 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_rule__Map__Group__3_in_rule__Map__Group__24880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Map__Group_2__0_in_rule__Map__Group__2__Impl4907 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Map__Group__3__Impl_in_rule__Map__Group__34938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Map__Group__3__Impl4966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Map__Group_2__0__Impl_in_rule__Map__Group_2__05005 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_rule__Map__Group_2__1_in_rule__Map__Group_2__05008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Map__Group_2__0__Impl5036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Map__Group_2__1__Impl_in_rule__Map__Group_2__15067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Map__OtherMappingAssignment_2_1_in_rule__Map__Group_2__1__Impl5094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__0__Impl_in_rule__Mapping__Group__05128 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Mapping__Group__1_in_rule__Mapping__Group__05131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__IdAssignment_0_in_rule__Mapping__Group__0__Impl5158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__1__Impl_in_rule__Mapping__Group__15188 = new BitSet(new long[]{0x000000000A001060L});
    public static final BitSet FOLLOW_rule__Mapping__Group__2_in_rule__Mapping__Group__15191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__AssignAssignment_1_in_rule__Mapping__Group__1__Impl5218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__2__Impl_in_rule__Mapping__Group__25248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__ValueAssignment_2_in_rule__Mapping__Group__2__Impl5275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Id__Group_2__0__Impl_in_rule__Id__Group_2__05311 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Id__Group_2__1_in_rule__Id__Group_2__05314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_rule__Id__Group_2__0__Impl5341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Id__Group_2__1__Impl_in_rule__Id__Group_2__15370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Id__Group_2_1__0_in_rule__Id__Group_2__1__Impl5397 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__Id__Group_2_1__0__Impl_in_rule__Id__Group_2_1__05432 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Id__Group_2_1__1_in_rule__Id__Group_2_1__05435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Id__Group_2_1__0__Impl5463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Id__Group_2_1__1__Impl_in_rule__Id__Group_2_1__15494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WORD_in_rule__Id__Group_2_1__1__Impl5521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeader_in_rule__Dgs__HeaderAssignment_05559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__Dgs__EventAssignment_1_05590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_rule__Dgs__CommentAssignment_1_15621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MAGIC_in_rule__Header__MagicAssignment_05652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleId_in_rule__Header__NameAssignment_25683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Header__NumberOfStepsAssignment_35714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Header__NumberOfEventsAssignment_45745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAn_in_rule__Event__AnAssignment_0_05776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCn_in_rule__Event__CnAssignment_0_15807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDn_in_rule__Event__DnAssignment_0_25838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAe_in_rule__Event__AeAssignment_0_35869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCe_in_rule__Event__CeAssignment_0_45900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDe_in_rule__Event__DeAssignment_0_55931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCg_in_rule__Event__CgAssignment_0_65962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSt_in_rule__Event__StAssignment_0_75993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CL_in_rule__Event__ClAssignment_0_86024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_rule__Event__CommentAssignment_1_06055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleId_in_rule__An__IdNodeAssignment_16086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributes_in_rule__An__AttributesAssignment_26117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleId_in_rule__Cn__IdNodeAssignment_16148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributes_in_rule__Cn__AttributesAssignment_26179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleId_in_rule__Dn__IdNodeAssignment_16210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleId_in_rule__Ae__IdEdgeAssignment_16241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleId_in_rule__Ae__IdNode1Assignment_26272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DIRECTION_in_rule__Ae__DirectionAssignment_36303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleId_in_rule__Ae__IdNode2Assignment_46334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributes_in_rule__Ae__AttributesAssignment_56365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleId_in_rule__Ce__IdEdgeAssignment_16396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributes_in_rule__Ce__AttributesAssignment_26427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleId_in_rule__De__IdEdgeAssignment_16458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributes_in_rule__Cg__AttributesAssignment_16489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__St__RealAssignment_16520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Attributes__AttributeAssignment_16551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPERATOR_in_rule__Attribute__OperatorAssignment_06582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleId_in_rule__Attribute__IdAttributeAssignment_16613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ASSIGN_in_rule__Attribute__AssignAssignment_2_06644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Attribute__ValueAssignment_2_16675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Attribute__OtherValuesAssignment_2_2_16706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Value__StringAssignment_06737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_rule__Value__RealAssignment_16768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Value__IntAssignment_26799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_rule__Value__ArrayAssignment_36830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMap_in_rule__Value__MapAssignment_46861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Array__ValueAssignment_2_06892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Array__OtherValuesAssignment_2_1_16923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_rule__Map__MappingAssignment_16954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_rule__Map__OtherMappingAssignment_2_16985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleId_in_rule__Mapping__IdAssignment_07016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ASSIGN_in_rule__Mapping__AssignAssignment_17047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Mapping__ValueAssignment_27078 = new BitSet(new long[]{0x0000000000000002L});

}