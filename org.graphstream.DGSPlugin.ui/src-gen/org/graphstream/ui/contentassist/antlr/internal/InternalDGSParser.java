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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_EOL", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_COMMENT", "RULE_MAGIC", "RULE_CL", "RULE_DIRECTION", "RULE_ASSIGN", "RULE_WS", "'+'", "'-'", "'an'", "'cn'", "'dn'", "'ae'", "'ce'", "'de'", "'cg'", "'st'", "','", "'{'", "'}'", "'['", "']'", "'.'", "'0'"
    };
    public static final int RULE_ID=5;
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
    public static final int RULE_ASSIGN=12;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int RULE_MAGIC=9;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_CL=10;
    public static final int T__14=14;
    public static final int RULE_INT=7;
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


    // $ANTLR start "entryRuleReal"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:536:1: entryRuleReal : ruleReal EOF ;
    public final void entryRuleReal() throws RecognitionException {
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:537:1: ( ruleReal EOF )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:538:1: ruleReal EOF
            {
             before(grammarAccess.getRealRule()); 
            pushFollow(FOLLOW_ruleReal_in_entryRuleReal1081);
            ruleReal();

            state._fsp--;

             after(grammarAccess.getRealRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReal1088); 

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
    // $ANTLR end "entryRuleReal"


    // $ANTLR start "ruleReal"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:545:1: ruleReal : ( ( rule__Real__Group__0 ) ) ;
    public final void ruleReal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:549:2: ( ( ( rule__Real__Group__0 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:550:1: ( ( rule__Real__Group__0 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:550:1: ( ( rule__Real__Group__0 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:551:1: ( rule__Real__Group__0 )
            {
             before(grammarAccess.getRealAccess().getGroup()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:552:1: ( rule__Real__Group__0 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:552:2: rule__Real__Group__0
            {
            pushFollow(FOLLOW_rule__Real__Group__0_in_ruleReal1114);
            rule__Real__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRealAccess().getGroup()); 

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
    // $ANTLR end "ruleReal"


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


    // $ANTLR start "rule__Header__NameAlternatives_2_0"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:592:1: rule__Header__NameAlternatives_2_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__Header__NameAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:596:1: ( ( RULE_ID ) | ( RULE_STRING ) )
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
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:597:1: ( RULE_ID )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:597:1: ( RULE_ID )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:598:1: RULE_ID
                    {
                     before(grammarAccess.getHeaderAccess().getNameIDTerminalRuleCall_2_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Header__NameAlternatives_2_01218); 
                     after(grammarAccess.getHeaderAccess().getNameIDTerminalRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:603:6: ( RULE_STRING )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:603:6: ( RULE_STRING )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:604:1: RULE_STRING
                    {
                     before(grammarAccess.getHeaderAccess().getNameSTRINGTerminalRuleCall_2_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Header__NameAlternatives_2_01235); 
                     after(grammarAccess.getHeaderAccess().getNameSTRINGTerminalRuleCall_2_0_1()); 

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
    // $ANTLR end "rule__Header__NameAlternatives_2_0"


    // $ANTLR start "rule__Event__Alternatives_0"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:614:1: rule__Event__Alternatives_0 : ( ( ( rule__Event__AnAssignment_0_0 ) ) | ( ( rule__Event__CnAssignment_0_1 ) ) | ( ( rule__Event__DnAssignment_0_2 ) ) | ( ( rule__Event__AeAssignment_0_3 ) ) | ( ( rule__Event__CeAssignment_0_4 ) ) | ( ( rule__Event__DeAssignment_0_5 ) ) | ( ( rule__Event__CgAssignment_0_6 ) ) | ( ( rule__Event__StAssignment_0_7 ) ) | ( ( rule__Event__ClAssignment_0_8 ) ) );
    public final void rule__Event__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:618:1: ( ( ( rule__Event__AnAssignment_0_0 ) ) | ( ( rule__Event__CnAssignment_0_1 ) ) | ( ( rule__Event__DnAssignment_0_2 ) ) | ( ( rule__Event__AeAssignment_0_3 ) ) | ( ( rule__Event__CeAssignment_0_4 ) ) | ( ( rule__Event__DeAssignment_0_5 ) ) | ( ( rule__Event__CgAssignment_0_6 ) ) | ( ( rule__Event__StAssignment_0_7 ) ) | ( ( rule__Event__ClAssignment_0_8 ) ) )
            int alt3=9;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 18:
                {
                alt3=3;
                }
                break;
            case 19:
                {
                alt3=4;
                }
                break;
            case 20:
                {
                alt3=5;
                }
                break;
            case 21:
                {
                alt3=6;
                }
                break;
            case 22:
                {
                alt3=7;
                }
                break;
            case 23:
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
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:619:1: ( ( rule__Event__AnAssignment_0_0 ) )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:619:1: ( ( rule__Event__AnAssignment_0_0 ) )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:620:1: ( rule__Event__AnAssignment_0_0 )
                    {
                     before(grammarAccess.getEventAccess().getAnAssignment_0_0()); 
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:621:1: ( rule__Event__AnAssignment_0_0 )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:621:2: rule__Event__AnAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__Event__AnAssignment_0_0_in_rule__Event__Alternatives_01267);
                    rule__Event__AnAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEventAccess().getAnAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:625:6: ( ( rule__Event__CnAssignment_0_1 ) )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:625:6: ( ( rule__Event__CnAssignment_0_1 ) )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:626:1: ( rule__Event__CnAssignment_0_1 )
                    {
                     before(grammarAccess.getEventAccess().getCnAssignment_0_1()); 
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:627:1: ( rule__Event__CnAssignment_0_1 )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:627:2: rule__Event__CnAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__Event__CnAssignment_0_1_in_rule__Event__Alternatives_01285);
                    rule__Event__CnAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getEventAccess().getCnAssignment_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:631:6: ( ( rule__Event__DnAssignment_0_2 ) )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:631:6: ( ( rule__Event__DnAssignment_0_2 ) )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:632:1: ( rule__Event__DnAssignment_0_2 )
                    {
                     before(grammarAccess.getEventAccess().getDnAssignment_0_2()); 
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:633:1: ( rule__Event__DnAssignment_0_2 )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:633:2: rule__Event__DnAssignment_0_2
                    {
                    pushFollow(FOLLOW_rule__Event__DnAssignment_0_2_in_rule__Event__Alternatives_01303);
                    rule__Event__DnAssignment_0_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getEventAccess().getDnAssignment_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:637:6: ( ( rule__Event__AeAssignment_0_3 ) )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:637:6: ( ( rule__Event__AeAssignment_0_3 ) )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:638:1: ( rule__Event__AeAssignment_0_3 )
                    {
                     before(grammarAccess.getEventAccess().getAeAssignment_0_3()); 
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:639:1: ( rule__Event__AeAssignment_0_3 )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:639:2: rule__Event__AeAssignment_0_3
                    {
                    pushFollow(FOLLOW_rule__Event__AeAssignment_0_3_in_rule__Event__Alternatives_01321);
                    rule__Event__AeAssignment_0_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getEventAccess().getAeAssignment_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:643:6: ( ( rule__Event__CeAssignment_0_4 ) )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:643:6: ( ( rule__Event__CeAssignment_0_4 ) )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:644:1: ( rule__Event__CeAssignment_0_4 )
                    {
                     before(grammarAccess.getEventAccess().getCeAssignment_0_4()); 
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:645:1: ( rule__Event__CeAssignment_0_4 )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:645:2: rule__Event__CeAssignment_0_4
                    {
                    pushFollow(FOLLOW_rule__Event__CeAssignment_0_4_in_rule__Event__Alternatives_01339);
                    rule__Event__CeAssignment_0_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getEventAccess().getCeAssignment_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:649:6: ( ( rule__Event__DeAssignment_0_5 ) )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:649:6: ( ( rule__Event__DeAssignment_0_5 ) )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:650:1: ( rule__Event__DeAssignment_0_5 )
                    {
                     before(grammarAccess.getEventAccess().getDeAssignment_0_5()); 
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:651:1: ( rule__Event__DeAssignment_0_5 )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:651:2: rule__Event__DeAssignment_0_5
                    {
                    pushFollow(FOLLOW_rule__Event__DeAssignment_0_5_in_rule__Event__Alternatives_01357);
                    rule__Event__DeAssignment_0_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getEventAccess().getDeAssignment_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:655:6: ( ( rule__Event__CgAssignment_0_6 ) )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:655:6: ( ( rule__Event__CgAssignment_0_6 ) )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:656:1: ( rule__Event__CgAssignment_0_6 )
                    {
                     before(grammarAccess.getEventAccess().getCgAssignment_0_6()); 
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:657:1: ( rule__Event__CgAssignment_0_6 )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:657:2: rule__Event__CgAssignment_0_6
                    {
                    pushFollow(FOLLOW_rule__Event__CgAssignment_0_6_in_rule__Event__Alternatives_01375);
                    rule__Event__CgAssignment_0_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getEventAccess().getCgAssignment_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:661:6: ( ( rule__Event__StAssignment_0_7 ) )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:661:6: ( ( rule__Event__StAssignment_0_7 ) )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:662:1: ( rule__Event__StAssignment_0_7 )
                    {
                     before(grammarAccess.getEventAccess().getStAssignment_0_7()); 
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:663:1: ( rule__Event__StAssignment_0_7 )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:663:2: rule__Event__StAssignment_0_7
                    {
                    pushFollow(FOLLOW_rule__Event__StAssignment_0_7_in_rule__Event__Alternatives_01393);
                    rule__Event__StAssignment_0_7();

                    state._fsp--;


                    }

                     after(grammarAccess.getEventAccess().getStAssignment_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:667:6: ( ( rule__Event__ClAssignment_0_8 ) )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:667:6: ( ( rule__Event__ClAssignment_0_8 ) )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:668:1: ( rule__Event__ClAssignment_0_8 )
                    {
                     before(grammarAccess.getEventAccess().getClAssignment_0_8()); 
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:669:1: ( rule__Event__ClAssignment_0_8 )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:669:2: rule__Event__ClAssignment_0_8
                    {
                    pushFollow(FOLLOW_rule__Event__ClAssignment_0_8_in_rule__Event__Alternatives_01411);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:678:1: rule__Event__Alternatives_1 : ( ( ( rule__Event__CommentAssignment_1_0 ) ) | ( RULE_EOL ) );
    public final void rule__Event__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:682:1: ( ( ( rule__Event__CommentAssignment_1_0 ) ) | ( RULE_EOL ) )
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
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:683:1: ( ( rule__Event__CommentAssignment_1_0 ) )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:683:1: ( ( rule__Event__CommentAssignment_1_0 ) )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:684:1: ( rule__Event__CommentAssignment_1_0 )
                    {
                     before(grammarAccess.getEventAccess().getCommentAssignment_1_0()); 
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:685:1: ( rule__Event__CommentAssignment_1_0 )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:685:2: rule__Event__CommentAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__Event__CommentAssignment_1_0_in_rule__Event__Alternatives_11444);
                    rule__Event__CommentAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEventAccess().getCommentAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:689:6: ( RULE_EOL )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:689:6: ( RULE_EOL )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:690:1: RULE_EOL
                    {
                     before(grammarAccess.getEventAccess().getEOLTerminalRuleCall_1_1()); 
                    match(input,RULE_EOL,FOLLOW_RULE_EOL_in_rule__Event__Alternatives_11462); 
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


    // $ANTLR start "rule__An__IdNodeAlternatives_1_0"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:700:1: rule__An__IdNodeAlternatives_1_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__An__IdNodeAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:704:1: ( ( RULE_ID ) | ( RULE_STRING ) )
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
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:705:1: ( RULE_ID )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:705:1: ( RULE_ID )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:706:1: RULE_ID
                    {
                     before(grammarAccess.getAnAccess().getIdNodeIDTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__An__IdNodeAlternatives_1_01494); 
                     after(grammarAccess.getAnAccess().getIdNodeIDTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:711:6: ( RULE_STRING )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:711:6: ( RULE_STRING )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:712:1: RULE_STRING
                    {
                     before(grammarAccess.getAnAccess().getIdNodeSTRINGTerminalRuleCall_1_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__An__IdNodeAlternatives_1_01511); 
                     after(grammarAccess.getAnAccess().getIdNodeSTRINGTerminalRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__An__IdNodeAlternatives_1_0"


    // $ANTLR start "rule__Cn__IdNodeAlternatives_1_0"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:722:1: rule__Cn__IdNodeAlternatives_1_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__Cn__IdNodeAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:726:1: ( ( RULE_ID ) | ( RULE_STRING ) )
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
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:727:1: ( RULE_ID )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:727:1: ( RULE_ID )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:728:1: RULE_ID
                    {
                     before(grammarAccess.getCnAccess().getIdNodeIDTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Cn__IdNodeAlternatives_1_01543); 
                     after(grammarAccess.getCnAccess().getIdNodeIDTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:733:6: ( RULE_STRING )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:733:6: ( RULE_STRING )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:734:1: RULE_STRING
                    {
                     before(grammarAccess.getCnAccess().getIdNodeSTRINGTerminalRuleCall_1_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Cn__IdNodeAlternatives_1_01560); 
                     after(grammarAccess.getCnAccess().getIdNodeSTRINGTerminalRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__Cn__IdNodeAlternatives_1_0"


    // $ANTLR start "rule__Dn__IdNodeAlternatives_1_0"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:744:1: rule__Dn__IdNodeAlternatives_1_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__Dn__IdNodeAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:748:1: ( ( RULE_ID ) | ( RULE_STRING ) )
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
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:749:1: ( RULE_ID )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:749:1: ( RULE_ID )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:750:1: RULE_ID
                    {
                     before(grammarAccess.getDnAccess().getIdNodeIDTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Dn__IdNodeAlternatives_1_01592); 
                     after(grammarAccess.getDnAccess().getIdNodeIDTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:755:6: ( RULE_STRING )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:755:6: ( RULE_STRING )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:756:1: RULE_STRING
                    {
                     before(grammarAccess.getDnAccess().getIdNodeSTRINGTerminalRuleCall_1_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Dn__IdNodeAlternatives_1_01609); 
                     after(grammarAccess.getDnAccess().getIdNodeSTRINGTerminalRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__Dn__IdNodeAlternatives_1_0"


    // $ANTLR start "rule__Ae__IdEdgeAlternatives_1_0"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:766:1: rule__Ae__IdEdgeAlternatives_1_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__Ae__IdEdgeAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:770:1: ( ( RULE_ID ) | ( RULE_STRING ) )
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
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:771:1: ( RULE_ID )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:771:1: ( RULE_ID )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:772:1: RULE_ID
                    {
                     before(grammarAccess.getAeAccess().getIdEdgeIDTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Ae__IdEdgeAlternatives_1_01641); 
                     after(grammarAccess.getAeAccess().getIdEdgeIDTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:777:6: ( RULE_STRING )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:777:6: ( RULE_STRING )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:778:1: RULE_STRING
                    {
                     before(grammarAccess.getAeAccess().getIdEdgeSTRINGTerminalRuleCall_1_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Ae__IdEdgeAlternatives_1_01658); 
                     after(grammarAccess.getAeAccess().getIdEdgeSTRINGTerminalRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__Ae__IdEdgeAlternatives_1_0"


    // $ANTLR start "rule__Ae__IdNode1Alternatives_2_0"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:788:1: rule__Ae__IdNode1Alternatives_2_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__Ae__IdNode1Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:792:1: ( ( RULE_ID ) | ( RULE_STRING ) )
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
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:793:1: ( RULE_ID )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:793:1: ( RULE_ID )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:794:1: RULE_ID
                    {
                     before(grammarAccess.getAeAccess().getIdNode1IDTerminalRuleCall_2_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Ae__IdNode1Alternatives_2_01690); 
                     after(grammarAccess.getAeAccess().getIdNode1IDTerminalRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:799:6: ( RULE_STRING )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:799:6: ( RULE_STRING )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:800:1: RULE_STRING
                    {
                     before(grammarAccess.getAeAccess().getIdNode1STRINGTerminalRuleCall_2_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Ae__IdNode1Alternatives_2_01707); 
                     after(grammarAccess.getAeAccess().getIdNode1STRINGTerminalRuleCall_2_0_1()); 

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
    // $ANTLR end "rule__Ae__IdNode1Alternatives_2_0"


    // $ANTLR start "rule__Ae__IdNode2Alternatives_4_0"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:810:1: rule__Ae__IdNode2Alternatives_4_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__Ae__IdNode2Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:814:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_STRING) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:815:1: ( RULE_ID )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:815:1: ( RULE_ID )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:816:1: RULE_ID
                    {
                     before(grammarAccess.getAeAccess().getIdNode2IDTerminalRuleCall_4_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Ae__IdNode2Alternatives_4_01739); 
                     after(grammarAccess.getAeAccess().getIdNode2IDTerminalRuleCall_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:821:6: ( RULE_STRING )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:821:6: ( RULE_STRING )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:822:1: RULE_STRING
                    {
                     before(grammarAccess.getAeAccess().getIdNode2STRINGTerminalRuleCall_4_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Ae__IdNode2Alternatives_4_01756); 
                     after(grammarAccess.getAeAccess().getIdNode2STRINGTerminalRuleCall_4_0_1()); 

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
    // $ANTLR end "rule__Ae__IdNode2Alternatives_4_0"


    // $ANTLR start "rule__Ce__IdNodeAlternatives_1_0"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:832:1: rule__Ce__IdNodeAlternatives_1_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__Ce__IdNodeAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:836:1: ( ( RULE_ID ) | ( RULE_STRING ) )
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
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:837:1: ( RULE_ID )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:837:1: ( RULE_ID )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:838:1: RULE_ID
                    {
                     before(grammarAccess.getCeAccess().getIdNodeIDTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Ce__IdNodeAlternatives_1_01788); 
                     after(grammarAccess.getCeAccess().getIdNodeIDTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:843:6: ( RULE_STRING )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:843:6: ( RULE_STRING )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:844:1: RULE_STRING
                    {
                     before(grammarAccess.getCeAccess().getIdNodeSTRINGTerminalRuleCall_1_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Ce__IdNodeAlternatives_1_01805); 
                     after(grammarAccess.getCeAccess().getIdNodeSTRINGTerminalRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__Ce__IdNodeAlternatives_1_0"


    // $ANTLR start "rule__De__IdEdgeAlternatives_1_0"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:854:1: rule__De__IdEdgeAlternatives_1_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__De__IdEdgeAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:858:1: ( ( RULE_ID ) | ( RULE_STRING ) )
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
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:859:1: ( RULE_ID )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:859:1: ( RULE_ID )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:860:1: RULE_ID
                    {
                     before(grammarAccess.getDeAccess().getIdEdgeIDTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__De__IdEdgeAlternatives_1_01837); 
                     after(grammarAccess.getDeAccess().getIdEdgeIDTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:865:6: ( RULE_STRING )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:865:6: ( RULE_STRING )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:866:1: RULE_STRING
                    {
                     before(grammarAccess.getDeAccess().getIdEdgeSTRINGTerminalRuleCall_1_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__De__IdEdgeAlternatives_1_01854); 
                     after(grammarAccess.getDeAccess().getIdEdgeSTRINGTerminalRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__De__IdEdgeAlternatives_1_0"


    // $ANTLR start "rule__Attribute__Alternatives_0"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:876:1: rule__Attribute__Alternatives_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__Attribute__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:880:1: ( ( '+' ) | ( '-' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==14) ) {
                alt13=1;
            }
            else if ( (LA13_0==15) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:881:1: ( '+' )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:881:1: ( '+' )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:882:1: '+'
                    {
                     before(grammarAccess.getAttributeAccess().getPlusSignKeyword_0_0()); 
                    match(input,14,FOLLOW_14_in_rule__Attribute__Alternatives_01887); 
                     after(grammarAccess.getAttributeAccess().getPlusSignKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:889:6: ( '-' )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:889:6: ( '-' )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:890:1: '-'
                    {
                     before(grammarAccess.getAttributeAccess().getHyphenMinusKeyword_0_1()); 
                    match(input,15,FOLLOW_15_in_rule__Attribute__Alternatives_01907); 
                     after(grammarAccess.getAttributeAccess().getHyphenMinusKeyword_0_1()); 

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
    // $ANTLR end "rule__Attribute__Alternatives_0"


    // $ANTLR start "rule__Attribute__IdAttributeAlternatives_1_0"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:902:1: rule__Attribute__IdAttributeAlternatives_1_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__Attribute__IdAttributeAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:906:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_STRING) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:907:1: ( RULE_ID )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:907:1: ( RULE_ID )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:908:1: RULE_ID
                    {
                     before(grammarAccess.getAttributeAccess().getIdAttributeIDTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__IdAttributeAlternatives_1_01941); 
                     after(grammarAccess.getAttributeAccess().getIdAttributeIDTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:913:6: ( RULE_STRING )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:913:6: ( RULE_STRING )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:914:1: RULE_STRING
                    {
                     before(grammarAccess.getAttributeAccess().getIdAttributeSTRINGTerminalRuleCall_1_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Attribute__IdAttributeAlternatives_1_01958); 
                     after(grammarAccess.getAttributeAccess().getIdAttributeSTRINGTerminalRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__Attribute__IdAttributeAlternatives_1_0"


    // $ANTLR start "rule__Value__Alternatives"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:924:1: rule__Value__Alternatives : ( ( ( rule__Value__StringAssignment_0 ) ) | ( ( rule__Value__RealAssignment_1 ) ) | ( ( rule__Value__ArrayAssignment_2 ) ) | ( ( rule__Value__MapAssignment_3 ) ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:928:1: ( ( ( rule__Value__StringAssignment_0 ) ) | ( ( rule__Value__RealAssignment_1 ) ) | ( ( rule__Value__ArrayAssignment_2 ) ) | ( ( rule__Value__MapAssignment_3 ) ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt15=1;
                }
                break;
            case RULE_INT:
                {
                alt15=2;
                }
                break;
            case 25:
                {
                alt15=3;
                }
                break;
            case 27:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:929:1: ( ( rule__Value__StringAssignment_0 ) )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:929:1: ( ( rule__Value__StringAssignment_0 ) )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:930:1: ( rule__Value__StringAssignment_0 )
                    {
                     before(grammarAccess.getValueAccess().getStringAssignment_0()); 
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:931:1: ( rule__Value__StringAssignment_0 )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:931:2: rule__Value__StringAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Value__StringAssignment_0_in_rule__Value__Alternatives1990);
                    rule__Value__StringAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getStringAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:935:6: ( ( rule__Value__RealAssignment_1 ) )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:935:6: ( ( rule__Value__RealAssignment_1 ) )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:936:1: ( rule__Value__RealAssignment_1 )
                    {
                     before(grammarAccess.getValueAccess().getRealAssignment_1()); 
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:937:1: ( rule__Value__RealAssignment_1 )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:937:2: rule__Value__RealAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Value__RealAssignment_1_in_rule__Value__Alternatives2008);
                    rule__Value__RealAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getRealAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:941:6: ( ( rule__Value__ArrayAssignment_2 ) )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:941:6: ( ( rule__Value__ArrayAssignment_2 ) )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:942:1: ( rule__Value__ArrayAssignment_2 )
                    {
                     before(grammarAccess.getValueAccess().getArrayAssignment_2()); 
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:943:1: ( rule__Value__ArrayAssignment_2 )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:943:2: rule__Value__ArrayAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Value__ArrayAssignment_2_in_rule__Value__Alternatives2026);
                    rule__Value__ArrayAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getArrayAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:947:6: ( ( rule__Value__MapAssignment_3 ) )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:947:6: ( ( rule__Value__MapAssignment_3 ) )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:948:1: ( rule__Value__MapAssignment_3 )
                    {
                     before(grammarAccess.getValueAccess().getMapAssignment_3()); 
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:949:1: ( rule__Value__MapAssignment_3 )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:949:2: rule__Value__MapAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Value__MapAssignment_3_in_rule__Value__Alternatives2044);
                    rule__Value__MapAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getMapAssignment_3()); 

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


    // $ANTLR start "rule__Mapping__IdAlternatives_0_0"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:958:1: rule__Mapping__IdAlternatives_0_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__Mapping__IdAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:962:1: ( ( RULE_ID ) | ( RULE_STRING ) )
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
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:963:1: ( RULE_ID )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:963:1: ( RULE_ID )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:964:1: RULE_ID
                    {
                     before(grammarAccess.getMappingAccess().getIdIDTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Mapping__IdAlternatives_0_02077); 
                     after(grammarAccess.getMappingAccess().getIdIDTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:969:6: ( RULE_STRING )
                    {
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:969:6: ( RULE_STRING )
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:970:1: RULE_STRING
                    {
                     before(grammarAccess.getMappingAccess().getIdSTRINGTerminalRuleCall_0_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Mapping__IdAlternatives_0_02094); 
                     after(grammarAccess.getMappingAccess().getIdSTRINGTerminalRuleCall_0_0_1()); 

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
    // $ANTLR end "rule__Mapping__IdAlternatives_0_0"


    // $ANTLR start "rule__Dgs__Group__0"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:982:1: rule__Dgs__Group__0 : rule__Dgs__Group__0__Impl rule__Dgs__Group__1 ;
    public final void rule__Dgs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:986:1: ( rule__Dgs__Group__0__Impl rule__Dgs__Group__1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:987:2: rule__Dgs__Group__0__Impl rule__Dgs__Group__1
            {
            pushFollow(FOLLOW_rule__Dgs__Group__0__Impl_in_rule__Dgs__Group__02124);
            rule__Dgs__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Dgs__Group__1_in_rule__Dgs__Group__02127);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:994:1: rule__Dgs__Group__0__Impl : ( ( rule__Dgs__HeaderAssignment_0 ) ) ;
    public final void rule__Dgs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:998:1: ( ( ( rule__Dgs__HeaderAssignment_0 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:999:1: ( ( rule__Dgs__HeaderAssignment_0 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:999:1: ( ( rule__Dgs__HeaderAssignment_0 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1000:1: ( rule__Dgs__HeaderAssignment_0 )
            {
             before(grammarAccess.getDgsAccess().getHeaderAssignment_0()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1001:1: ( rule__Dgs__HeaderAssignment_0 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1001:2: rule__Dgs__HeaderAssignment_0
            {
            pushFollow(FOLLOW_rule__Dgs__HeaderAssignment_0_in_rule__Dgs__Group__0__Impl2154);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1011:1: rule__Dgs__Group__1 : rule__Dgs__Group__1__Impl ;
    public final void rule__Dgs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1015:1: ( rule__Dgs__Group__1__Impl )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1016:2: rule__Dgs__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Dgs__Group__1__Impl_in_rule__Dgs__Group__12184);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1022:1: rule__Dgs__Group__1__Impl : ( ( rule__Dgs__Alternatives_1 )* ) ;
    public final void rule__Dgs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1026:1: ( ( ( rule__Dgs__Alternatives_1 )* ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1027:1: ( ( rule__Dgs__Alternatives_1 )* )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1027:1: ( ( rule__Dgs__Alternatives_1 )* )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1028:1: ( rule__Dgs__Alternatives_1 )*
            {
             before(grammarAccess.getDgsAccess().getAlternatives_1()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1029:1: ( rule__Dgs__Alternatives_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_EOL||LA17_0==RULE_COMMENT||LA17_0==RULE_CL||(LA17_0>=16 && LA17_0<=23)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1029:2: rule__Dgs__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__Dgs__Alternatives_1_in_rule__Dgs__Group__1__Impl2211);
            	    rule__Dgs__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1043:1: rule__Header__Group__0 : rule__Header__Group__0__Impl rule__Header__Group__1 ;
    public final void rule__Header__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1047:1: ( rule__Header__Group__0__Impl rule__Header__Group__1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1048:2: rule__Header__Group__0__Impl rule__Header__Group__1
            {
            pushFollow(FOLLOW_rule__Header__Group__0__Impl_in_rule__Header__Group__02246);
            rule__Header__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group__1_in_rule__Header__Group__02249);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1055:1: rule__Header__Group__0__Impl : ( ( rule__Header__MagicAssignment_0 ) ) ;
    public final void rule__Header__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1059:1: ( ( ( rule__Header__MagicAssignment_0 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1060:1: ( ( rule__Header__MagicAssignment_0 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1060:1: ( ( rule__Header__MagicAssignment_0 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1061:1: ( rule__Header__MagicAssignment_0 )
            {
             before(grammarAccess.getHeaderAccess().getMagicAssignment_0()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1062:1: ( rule__Header__MagicAssignment_0 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1062:2: rule__Header__MagicAssignment_0
            {
            pushFollow(FOLLOW_rule__Header__MagicAssignment_0_in_rule__Header__Group__0__Impl2276);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1072:1: rule__Header__Group__1 : rule__Header__Group__1__Impl rule__Header__Group__2 ;
    public final void rule__Header__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1076:1: ( rule__Header__Group__1__Impl rule__Header__Group__2 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1077:2: rule__Header__Group__1__Impl rule__Header__Group__2
            {
            pushFollow(FOLLOW_rule__Header__Group__1__Impl_in_rule__Header__Group__12306);
            rule__Header__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group__2_in_rule__Header__Group__12309);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1084:1: rule__Header__Group__1__Impl : ( RULE_EOL ) ;
    public final void rule__Header__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1088:1: ( ( RULE_EOL ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1089:1: ( RULE_EOL )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1089:1: ( RULE_EOL )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1090:1: RULE_EOL
            {
             before(grammarAccess.getHeaderAccess().getEOLTerminalRuleCall_1()); 
            match(input,RULE_EOL,FOLLOW_RULE_EOL_in_rule__Header__Group__1__Impl2336); 
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1101:1: rule__Header__Group__2 : rule__Header__Group__2__Impl rule__Header__Group__3 ;
    public final void rule__Header__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1105:1: ( rule__Header__Group__2__Impl rule__Header__Group__3 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1106:2: rule__Header__Group__2__Impl rule__Header__Group__3
            {
            pushFollow(FOLLOW_rule__Header__Group__2__Impl_in_rule__Header__Group__22365);
            rule__Header__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group__3_in_rule__Header__Group__22368);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1113:1: rule__Header__Group__2__Impl : ( ( rule__Header__NameAssignment_2 ) ) ;
    public final void rule__Header__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1117:1: ( ( ( rule__Header__NameAssignment_2 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1118:1: ( ( rule__Header__NameAssignment_2 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1118:1: ( ( rule__Header__NameAssignment_2 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1119:1: ( rule__Header__NameAssignment_2 )
            {
             before(grammarAccess.getHeaderAccess().getNameAssignment_2()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1120:1: ( rule__Header__NameAssignment_2 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1120:2: rule__Header__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Header__NameAssignment_2_in_rule__Header__Group__2__Impl2395);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1130:1: rule__Header__Group__3 : rule__Header__Group__3__Impl rule__Header__Group__4 ;
    public final void rule__Header__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1134:1: ( rule__Header__Group__3__Impl rule__Header__Group__4 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1135:2: rule__Header__Group__3__Impl rule__Header__Group__4
            {
            pushFollow(FOLLOW_rule__Header__Group__3__Impl_in_rule__Header__Group__32425);
            rule__Header__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group__4_in_rule__Header__Group__32428);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1142:1: rule__Header__Group__3__Impl : ( ( rule__Header__NumberOfStepsAssignment_3 ) ) ;
    public final void rule__Header__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1146:1: ( ( ( rule__Header__NumberOfStepsAssignment_3 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1147:1: ( ( rule__Header__NumberOfStepsAssignment_3 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1147:1: ( ( rule__Header__NumberOfStepsAssignment_3 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1148:1: ( rule__Header__NumberOfStepsAssignment_3 )
            {
             before(grammarAccess.getHeaderAccess().getNumberOfStepsAssignment_3()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1149:1: ( rule__Header__NumberOfStepsAssignment_3 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1149:2: rule__Header__NumberOfStepsAssignment_3
            {
            pushFollow(FOLLOW_rule__Header__NumberOfStepsAssignment_3_in_rule__Header__Group__3__Impl2455);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1159:1: rule__Header__Group__4 : rule__Header__Group__4__Impl rule__Header__Group__5 ;
    public final void rule__Header__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1163:1: ( rule__Header__Group__4__Impl rule__Header__Group__5 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1164:2: rule__Header__Group__4__Impl rule__Header__Group__5
            {
            pushFollow(FOLLOW_rule__Header__Group__4__Impl_in_rule__Header__Group__42485);
            rule__Header__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Header__Group__5_in_rule__Header__Group__42488);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1171:1: rule__Header__Group__4__Impl : ( ( rule__Header__NumberOfEventsAssignment_4 ) ) ;
    public final void rule__Header__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1175:1: ( ( ( rule__Header__NumberOfEventsAssignment_4 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1176:1: ( ( rule__Header__NumberOfEventsAssignment_4 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1176:1: ( ( rule__Header__NumberOfEventsAssignment_4 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1177:1: ( rule__Header__NumberOfEventsAssignment_4 )
            {
             before(grammarAccess.getHeaderAccess().getNumberOfEventsAssignment_4()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1178:1: ( rule__Header__NumberOfEventsAssignment_4 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1178:2: rule__Header__NumberOfEventsAssignment_4
            {
            pushFollow(FOLLOW_rule__Header__NumberOfEventsAssignment_4_in_rule__Header__Group__4__Impl2515);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1188:1: rule__Header__Group__5 : rule__Header__Group__5__Impl ;
    public final void rule__Header__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1192:1: ( rule__Header__Group__5__Impl )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1193:2: rule__Header__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Header__Group__5__Impl_in_rule__Header__Group__52545);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1199:1: rule__Header__Group__5__Impl : ( RULE_EOL ) ;
    public final void rule__Header__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1203:1: ( ( RULE_EOL ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1204:1: ( RULE_EOL )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1204:1: ( RULE_EOL )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1205:1: RULE_EOL
            {
             before(grammarAccess.getHeaderAccess().getEOLTerminalRuleCall_5()); 
            match(input,RULE_EOL,FOLLOW_RULE_EOL_in_rule__Header__Group__5__Impl2572); 
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1228:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1232:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1233:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__02613);
            rule__Event__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Event__Group__1_in_rule__Event__Group__02616);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1240:1: rule__Event__Group__0__Impl : ( ( rule__Event__Alternatives_0 ) ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1244:1: ( ( ( rule__Event__Alternatives_0 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1245:1: ( ( rule__Event__Alternatives_0 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1245:1: ( ( rule__Event__Alternatives_0 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1246:1: ( rule__Event__Alternatives_0 )
            {
             before(grammarAccess.getEventAccess().getAlternatives_0()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1247:1: ( rule__Event__Alternatives_0 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1247:2: rule__Event__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Event__Alternatives_0_in_rule__Event__Group__0__Impl2643);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1257:1: rule__Event__Group__1 : rule__Event__Group__1__Impl ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1261:1: ( rule__Event__Group__1__Impl )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1262:2: rule__Event__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__12673);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1268:1: rule__Event__Group__1__Impl : ( ( rule__Event__Alternatives_1 ) ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1272:1: ( ( ( rule__Event__Alternatives_1 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1273:1: ( ( rule__Event__Alternatives_1 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1273:1: ( ( rule__Event__Alternatives_1 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1274:1: ( rule__Event__Alternatives_1 )
            {
             before(grammarAccess.getEventAccess().getAlternatives_1()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1275:1: ( rule__Event__Alternatives_1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1275:2: rule__Event__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Event__Alternatives_1_in_rule__Event__Group__1__Impl2700);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1289:1: rule__An__Group__0 : rule__An__Group__0__Impl rule__An__Group__1 ;
    public final void rule__An__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1293:1: ( rule__An__Group__0__Impl rule__An__Group__1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1294:2: rule__An__Group__0__Impl rule__An__Group__1
            {
            pushFollow(FOLLOW_rule__An__Group__0__Impl_in_rule__An__Group__02734);
            rule__An__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__An__Group__1_in_rule__An__Group__02737);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1301:1: rule__An__Group__0__Impl : ( 'an' ) ;
    public final void rule__An__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1305:1: ( ( 'an' ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1306:1: ( 'an' )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1306:1: ( 'an' )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1307:1: 'an'
            {
             before(grammarAccess.getAnAccess().getAnKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__An__Group__0__Impl2765); 
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1320:1: rule__An__Group__1 : rule__An__Group__1__Impl rule__An__Group__2 ;
    public final void rule__An__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1324:1: ( rule__An__Group__1__Impl rule__An__Group__2 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1325:2: rule__An__Group__1__Impl rule__An__Group__2
            {
            pushFollow(FOLLOW_rule__An__Group__1__Impl_in_rule__An__Group__12796);
            rule__An__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__An__Group__2_in_rule__An__Group__12799);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1332:1: rule__An__Group__1__Impl : ( ( rule__An__IdNodeAssignment_1 ) ) ;
    public final void rule__An__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1336:1: ( ( ( rule__An__IdNodeAssignment_1 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1337:1: ( ( rule__An__IdNodeAssignment_1 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1337:1: ( ( rule__An__IdNodeAssignment_1 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1338:1: ( rule__An__IdNodeAssignment_1 )
            {
             before(grammarAccess.getAnAccess().getIdNodeAssignment_1()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1339:1: ( rule__An__IdNodeAssignment_1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1339:2: rule__An__IdNodeAssignment_1
            {
            pushFollow(FOLLOW_rule__An__IdNodeAssignment_1_in_rule__An__Group__1__Impl2826);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1349:1: rule__An__Group__2 : rule__An__Group__2__Impl ;
    public final void rule__An__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1353:1: ( rule__An__Group__2__Impl )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1354:2: rule__An__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__An__Group__2__Impl_in_rule__An__Group__22856);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1360:1: rule__An__Group__2__Impl : ( ( rule__An__AttributesAssignment_2 ) ) ;
    public final void rule__An__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1364:1: ( ( ( rule__An__AttributesAssignment_2 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1365:1: ( ( rule__An__AttributesAssignment_2 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1365:1: ( ( rule__An__AttributesAssignment_2 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1366:1: ( rule__An__AttributesAssignment_2 )
            {
             before(grammarAccess.getAnAccess().getAttributesAssignment_2()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1367:1: ( rule__An__AttributesAssignment_2 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1367:2: rule__An__AttributesAssignment_2
            {
            pushFollow(FOLLOW_rule__An__AttributesAssignment_2_in_rule__An__Group__2__Impl2883);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1383:1: rule__Cn__Group__0 : rule__Cn__Group__0__Impl rule__Cn__Group__1 ;
    public final void rule__Cn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1387:1: ( rule__Cn__Group__0__Impl rule__Cn__Group__1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1388:2: rule__Cn__Group__0__Impl rule__Cn__Group__1
            {
            pushFollow(FOLLOW_rule__Cn__Group__0__Impl_in_rule__Cn__Group__02919);
            rule__Cn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cn__Group__1_in_rule__Cn__Group__02922);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1395:1: rule__Cn__Group__0__Impl : ( 'cn' ) ;
    public final void rule__Cn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1399:1: ( ( 'cn' ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1400:1: ( 'cn' )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1400:1: ( 'cn' )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1401:1: 'cn'
            {
             before(grammarAccess.getCnAccess().getCnKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Cn__Group__0__Impl2950); 
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1414:1: rule__Cn__Group__1 : rule__Cn__Group__1__Impl rule__Cn__Group__2 ;
    public final void rule__Cn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1418:1: ( rule__Cn__Group__1__Impl rule__Cn__Group__2 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1419:2: rule__Cn__Group__1__Impl rule__Cn__Group__2
            {
            pushFollow(FOLLOW_rule__Cn__Group__1__Impl_in_rule__Cn__Group__12981);
            rule__Cn__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cn__Group__2_in_rule__Cn__Group__12984);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1426:1: rule__Cn__Group__1__Impl : ( ( rule__Cn__IdNodeAssignment_1 ) ) ;
    public final void rule__Cn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1430:1: ( ( ( rule__Cn__IdNodeAssignment_1 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1431:1: ( ( rule__Cn__IdNodeAssignment_1 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1431:1: ( ( rule__Cn__IdNodeAssignment_1 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1432:1: ( rule__Cn__IdNodeAssignment_1 )
            {
             before(grammarAccess.getCnAccess().getIdNodeAssignment_1()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1433:1: ( rule__Cn__IdNodeAssignment_1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1433:2: rule__Cn__IdNodeAssignment_1
            {
            pushFollow(FOLLOW_rule__Cn__IdNodeAssignment_1_in_rule__Cn__Group__1__Impl3011);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1443:1: rule__Cn__Group__2 : rule__Cn__Group__2__Impl ;
    public final void rule__Cn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1447:1: ( rule__Cn__Group__2__Impl )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1448:2: rule__Cn__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Cn__Group__2__Impl_in_rule__Cn__Group__23041);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1454:1: rule__Cn__Group__2__Impl : ( ( rule__Cn__AttributesAssignment_2 ) ) ;
    public final void rule__Cn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1458:1: ( ( ( rule__Cn__AttributesAssignment_2 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1459:1: ( ( rule__Cn__AttributesAssignment_2 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1459:1: ( ( rule__Cn__AttributesAssignment_2 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1460:1: ( rule__Cn__AttributesAssignment_2 )
            {
             before(grammarAccess.getCnAccess().getAttributesAssignment_2()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1461:1: ( rule__Cn__AttributesAssignment_2 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1461:2: rule__Cn__AttributesAssignment_2
            {
            pushFollow(FOLLOW_rule__Cn__AttributesAssignment_2_in_rule__Cn__Group__2__Impl3068);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1477:1: rule__Dn__Group__0 : rule__Dn__Group__0__Impl rule__Dn__Group__1 ;
    public final void rule__Dn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1481:1: ( rule__Dn__Group__0__Impl rule__Dn__Group__1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1482:2: rule__Dn__Group__0__Impl rule__Dn__Group__1
            {
            pushFollow(FOLLOW_rule__Dn__Group__0__Impl_in_rule__Dn__Group__03104);
            rule__Dn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Dn__Group__1_in_rule__Dn__Group__03107);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1489:1: rule__Dn__Group__0__Impl : ( 'dn' ) ;
    public final void rule__Dn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1493:1: ( ( 'dn' ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1494:1: ( 'dn' )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1494:1: ( 'dn' )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1495:1: 'dn'
            {
             before(grammarAccess.getDnAccess().getDnKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Dn__Group__0__Impl3135); 
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1508:1: rule__Dn__Group__1 : rule__Dn__Group__1__Impl ;
    public final void rule__Dn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1512:1: ( rule__Dn__Group__1__Impl )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1513:2: rule__Dn__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Dn__Group__1__Impl_in_rule__Dn__Group__13166);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1519:1: rule__Dn__Group__1__Impl : ( ( rule__Dn__IdNodeAssignment_1 ) ) ;
    public final void rule__Dn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1523:1: ( ( ( rule__Dn__IdNodeAssignment_1 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1524:1: ( ( rule__Dn__IdNodeAssignment_1 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1524:1: ( ( rule__Dn__IdNodeAssignment_1 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1525:1: ( rule__Dn__IdNodeAssignment_1 )
            {
             before(grammarAccess.getDnAccess().getIdNodeAssignment_1()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1526:1: ( rule__Dn__IdNodeAssignment_1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1526:2: rule__Dn__IdNodeAssignment_1
            {
            pushFollow(FOLLOW_rule__Dn__IdNodeAssignment_1_in_rule__Dn__Group__1__Impl3193);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1540:1: rule__Ae__Group__0 : rule__Ae__Group__0__Impl rule__Ae__Group__1 ;
    public final void rule__Ae__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1544:1: ( rule__Ae__Group__0__Impl rule__Ae__Group__1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1545:2: rule__Ae__Group__0__Impl rule__Ae__Group__1
            {
            pushFollow(FOLLOW_rule__Ae__Group__0__Impl_in_rule__Ae__Group__03227);
            rule__Ae__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ae__Group__1_in_rule__Ae__Group__03230);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1552:1: rule__Ae__Group__0__Impl : ( 'ae' ) ;
    public final void rule__Ae__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1556:1: ( ( 'ae' ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1557:1: ( 'ae' )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1557:1: ( 'ae' )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1558:1: 'ae'
            {
             before(grammarAccess.getAeAccess().getAeKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Ae__Group__0__Impl3258); 
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1571:1: rule__Ae__Group__1 : rule__Ae__Group__1__Impl rule__Ae__Group__2 ;
    public final void rule__Ae__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1575:1: ( rule__Ae__Group__1__Impl rule__Ae__Group__2 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1576:2: rule__Ae__Group__1__Impl rule__Ae__Group__2
            {
            pushFollow(FOLLOW_rule__Ae__Group__1__Impl_in_rule__Ae__Group__13289);
            rule__Ae__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ae__Group__2_in_rule__Ae__Group__13292);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1583:1: rule__Ae__Group__1__Impl : ( ( rule__Ae__IdEdgeAssignment_1 ) ) ;
    public final void rule__Ae__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1587:1: ( ( ( rule__Ae__IdEdgeAssignment_1 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1588:1: ( ( rule__Ae__IdEdgeAssignment_1 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1588:1: ( ( rule__Ae__IdEdgeAssignment_1 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1589:1: ( rule__Ae__IdEdgeAssignment_1 )
            {
             before(grammarAccess.getAeAccess().getIdEdgeAssignment_1()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1590:1: ( rule__Ae__IdEdgeAssignment_1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1590:2: rule__Ae__IdEdgeAssignment_1
            {
            pushFollow(FOLLOW_rule__Ae__IdEdgeAssignment_1_in_rule__Ae__Group__1__Impl3319);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1600:1: rule__Ae__Group__2 : rule__Ae__Group__2__Impl rule__Ae__Group__3 ;
    public final void rule__Ae__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1604:1: ( rule__Ae__Group__2__Impl rule__Ae__Group__3 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1605:2: rule__Ae__Group__2__Impl rule__Ae__Group__3
            {
            pushFollow(FOLLOW_rule__Ae__Group__2__Impl_in_rule__Ae__Group__23349);
            rule__Ae__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ae__Group__3_in_rule__Ae__Group__23352);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1612:1: rule__Ae__Group__2__Impl : ( ( rule__Ae__IdNode1Assignment_2 ) ) ;
    public final void rule__Ae__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1616:1: ( ( ( rule__Ae__IdNode1Assignment_2 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1617:1: ( ( rule__Ae__IdNode1Assignment_2 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1617:1: ( ( rule__Ae__IdNode1Assignment_2 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1618:1: ( rule__Ae__IdNode1Assignment_2 )
            {
             before(grammarAccess.getAeAccess().getIdNode1Assignment_2()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1619:1: ( rule__Ae__IdNode1Assignment_2 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1619:2: rule__Ae__IdNode1Assignment_2
            {
            pushFollow(FOLLOW_rule__Ae__IdNode1Assignment_2_in_rule__Ae__Group__2__Impl3379);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1629:1: rule__Ae__Group__3 : rule__Ae__Group__3__Impl rule__Ae__Group__4 ;
    public final void rule__Ae__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1633:1: ( rule__Ae__Group__3__Impl rule__Ae__Group__4 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1634:2: rule__Ae__Group__3__Impl rule__Ae__Group__4
            {
            pushFollow(FOLLOW_rule__Ae__Group__3__Impl_in_rule__Ae__Group__33409);
            rule__Ae__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ae__Group__4_in_rule__Ae__Group__33412);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1641:1: rule__Ae__Group__3__Impl : ( ( rule__Ae__DirectionAssignment_3 )? ) ;
    public final void rule__Ae__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1645:1: ( ( ( rule__Ae__DirectionAssignment_3 )? ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1646:1: ( ( rule__Ae__DirectionAssignment_3 )? )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1646:1: ( ( rule__Ae__DirectionAssignment_3 )? )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1647:1: ( rule__Ae__DirectionAssignment_3 )?
            {
             before(grammarAccess.getAeAccess().getDirectionAssignment_3()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1648:1: ( rule__Ae__DirectionAssignment_3 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_DIRECTION) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1648:2: rule__Ae__DirectionAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Ae__DirectionAssignment_3_in_rule__Ae__Group__3__Impl3439);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1658:1: rule__Ae__Group__4 : rule__Ae__Group__4__Impl rule__Ae__Group__5 ;
    public final void rule__Ae__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1662:1: ( rule__Ae__Group__4__Impl rule__Ae__Group__5 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1663:2: rule__Ae__Group__4__Impl rule__Ae__Group__5
            {
            pushFollow(FOLLOW_rule__Ae__Group__4__Impl_in_rule__Ae__Group__43470);
            rule__Ae__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ae__Group__5_in_rule__Ae__Group__43473);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1670:1: rule__Ae__Group__4__Impl : ( ( rule__Ae__IdNode2Assignment_4 ) ) ;
    public final void rule__Ae__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1674:1: ( ( ( rule__Ae__IdNode2Assignment_4 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1675:1: ( ( rule__Ae__IdNode2Assignment_4 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1675:1: ( ( rule__Ae__IdNode2Assignment_4 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1676:1: ( rule__Ae__IdNode2Assignment_4 )
            {
             before(grammarAccess.getAeAccess().getIdNode2Assignment_4()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1677:1: ( rule__Ae__IdNode2Assignment_4 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1677:2: rule__Ae__IdNode2Assignment_4
            {
            pushFollow(FOLLOW_rule__Ae__IdNode2Assignment_4_in_rule__Ae__Group__4__Impl3500);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1687:1: rule__Ae__Group__5 : rule__Ae__Group__5__Impl ;
    public final void rule__Ae__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1691:1: ( rule__Ae__Group__5__Impl )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1692:2: rule__Ae__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Ae__Group__5__Impl_in_rule__Ae__Group__53530);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1698:1: rule__Ae__Group__5__Impl : ( ( rule__Ae__AttributesAssignment_5 ) ) ;
    public final void rule__Ae__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1702:1: ( ( ( rule__Ae__AttributesAssignment_5 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1703:1: ( ( rule__Ae__AttributesAssignment_5 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1703:1: ( ( rule__Ae__AttributesAssignment_5 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1704:1: ( rule__Ae__AttributesAssignment_5 )
            {
             before(grammarAccess.getAeAccess().getAttributesAssignment_5()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1705:1: ( rule__Ae__AttributesAssignment_5 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1705:2: rule__Ae__AttributesAssignment_5
            {
            pushFollow(FOLLOW_rule__Ae__AttributesAssignment_5_in_rule__Ae__Group__5__Impl3557);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1727:1: rule__Ce__Group__0 : rule__Ce__Group__0__Impl rule__Ce__Group__1 ;
    public final void rule__Ce__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1731:1: ( rule__Ce__Group__0__Impl rule__Ce__Group__1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1732:2: rule__Ce__Group__0__Impl rule__Ce__Group__1
            {
            pushFollow(FOLLOW_rule__Ce__Group__0__Impl_in_rule__Ce__Group__03599);
            rule__Ce__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ce__Group__1_in_rule__Ce__Group__03602);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1739:1: rule__Ce__Group__0__Impl : ( 'ce' ) ;
    public final void rule__Ce__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1743:1: ( ( 'ce' ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1744:1: ( 'ce' )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1744:1: ( 'ce' )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1745:1: 'ce'
            {
             before(grammarAccess.getCeAccess().getCeKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Ce__Group__0__Impl3630); 
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1758:1: rule__Ce__Group__1 : rule__Ce__Group__1__Impl rule__Ce__Group__2 ;
    public final void rule__Ce__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1762:1: ( rule__Ce__Group__1__Impl rule__Ce__Group__2 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1763:2: rule__Ce__Group__1__Impl rule__Ce__Group__2
            {
            pushFollow(FOLLOW_rule__Ce__Group__1__Impl_in_rule__Ce__Group__13661);
            rule__Ce__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Ce__Group__2_in_rule__Ce__Group__13664);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1770:1: rule__Ce__Group__1__Impl : ( ( rule__Ce__IdNodeAssignment_1 ) ) ;
    public final void rule__Ce__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1774:1: ( ( ( rule__Ce__IdNodeAssignment_1 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1775:1: ( ( rule__Ce__IdNodeAssignment_1 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1775:1: ( ( rule__Ce__IdNodeAssignment_1 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1776:1: ( rule__Ce__IdNodeAssignment_1 )
            {
             before(grammarAccess.getCeAccess().getIdNodeAssignment_1()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1777:1: ( rule__Ce__IdNodeAssignment_1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1777:2: rule__Ce__IdNodeAssignment_1
            {
            pushFollow(FOLLOW_rule__Ce__IdNodeAssignment_1_in_rule__Ce__Group__1__Impl3691);
            rule__Ce__IdNodeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCeAccess().getIdNodeAssignment_1()); 

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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1787:1: rule__Ce__Group__2 : rule__Ce__Group__2__Impl ;
    public final void rule__Ce__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1791:1: ( rule__Ce__Group__2__Impl )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1792:2: rule__Ce__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Ce__Group__2__Impl_in_rule__Ce__Group__23721);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1798:1: rule__Ce__Group__2__Impl : ( ( rule__Ce__AttributesAssignment_2 ) ) ;
    public final void rule__Ce__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1802:1: ( ( ( rule__Ce__AttributesAssignment_2 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1803:1: ( ( rule__Ce__AttributesAssignment_2 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1803:1: ( ( rule__Ce__AttributesAssignment_2 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1804:1: ( rule__Ce__AttributesAssignment_2 )
            {
             before(grammarAccess.getCeAccess().getAttributesAssignment_2()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1805:1: ( rule__Ce__AttributesAssignment_2 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1805:2: rule__Ce__AttributesAssignment_2
            {
            pushFollow(FOLLOW_rule__Ce__AttributesAssignment_2_in_rule__Ce__Group__2__Impl3748);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1821:1: rule__De__Group__0 : rule__De__Group__0__Impl rule__De__Group__1 ;
    public final void rule__De__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1825:1: ( rule__De__Group__0__Impl rule__De__Group__1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1826:2: rule__De__Group__0__Impl rule__De__Group__1
            {
            pushFollow(FOLLOW_rule__De__Group__0__Impl_in_rule__De__Group__03784);
            rule__De__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__De__Group__1_in_rule__De__Group__03787);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1833:1: rule__De__Group__0__Impl : ( 'de' ) ;
    public final void rule__De__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1837:1: ( ( 'de' ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1838:1: ( 'de' )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1838:1: ( 'de' )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1839:1: 'de'
            {
             before(grammarAccess.getDeAccess().getDeKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__De__Group__0__Impl3815); 
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1852:1: rule__De__Group__1 : rule__De__Group__1__Impl ;
    public final void rule__De__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1856:1: ( rule__De__Group__1__Impl )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1857:2: rule__De__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__De__Group__1__Impl_in_rule__De__Group__13846);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1863:1: rule__De__Group__1__Impl : ( ( rule__De__IdEdgeAssignment_1 ) ) ;
    public final void rule__De__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1867:1: ( ( ( rule__De__IdEdgeAssignment_1 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1868:1: ( ( rule__De__IdEdgeAssignment_1 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1868:1: ( ( rule__De__IdEdgeAssignment_1 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1869:1: ( rule__De__IdEdgeAssignment_1 )
            {
             before(grammarAccess.getDeAccess().getIdEdgeAssignment_1()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1870:1: ( rule__De__IdEdgeAssignment_1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1870:2: rule__De__IdEdgeAssignment_1
            {
            pushFollow(FOLLOW_rule__De__IdEdgeAssignment_1_in_rule__De__Group__1__Impl3873);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1884:1: rule__Cg__Group__0 : rule__Cg__Group__0__Impl rule__Cg__Group__1 ;
    public final void rule__Cg__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1888:1: ( rule__Cg__Group__0__Impl rule__Cg__Group__1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1889:2: rule__Cg__Group__0__Impl rule__Cg__Group__1
            {
            pushFollow(FOLLOW_rule__Cg__Group__0__Impl_in_rule__Cg__Group__03907);
            rule__Cg__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Cg__Group__1_in_rule__Cg__Group__03910);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1896:1: rule__Cg__Group__0__Impl : ( 'cg' ) ;
    public final void rule__Cg__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1900:1: ( ( 'cg' ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1901:1: ( 'cg' )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1901:1: ( 'cg' )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1902:1: 'cg'
            {
             before(grammarAccess.getCgAccess().getCgKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Cg__Group__0__Impl3938); 
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1915:1: rule__Cg__Group__1 : rule__Cg__Group__1__Impl ;
    public final void rule__Cg__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1919:1: ( rule__Cg__Group__1__Impl )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1920:2: rule__Cg__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Cg__Group__1__Impl_in_rule__Cg__Group__13969);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1926:1: rule__Cg__Group__1__Impl : ( ( rule__Cg__AttributesAssignment_1 ) ) ;
    public final void rule__Cg__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1930:1: ( ( ( rule__Cg__AttributesAssignment_1 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1931:1: ( ( rule__Cg__AttributesAssignment_1 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1931:1: ( ( rule__Cg__AttributesAssignment_1 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1932:1: ( rule__Cg__AttributesAssignment_1 )
            {
             before(grammarAccess.getCgAccess().getAttributesAssignment_1()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1933:1: ( rule__Cg__AttributesAssignment_1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1933:2: rule__Cg__AttributesAssignment_1
            {
            pushFollow(FOLLOW_rule__Cg__AttributesAssignment_1_in_rule__Cg__Group__1__Impl3996);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1947:1: rule__St__Group__0 : rule__St__Group__0__Impl rule__St__Group__1 ;
    public final void rule__St__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1951:1: ( rule__St__Group__0__Impl rule__St__Group__1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1952:2: rule__St__Group__0__Impl rule__St__Group__1
            {
            pushFollow(FOLLOW_rule__St__Group__0__Impl_in_rule__St__Group__04030);
            rule__St__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__St__Group__1_in_rule__St__Group__04033);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1959:1: rule__St__Group__0__Impl : ( 'st' ) ;
    public final void rule__St__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1963:1: ( ( 'st' ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1964:1: ( 'st' )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1964:1: ( 'st' )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1965:1: 'st'
            {
             before(grammarAccess.getStAccess().getStKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__St__Group__0__Impl4061); 
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1978:1: rule__St__Group__1 : rule__St__Group__1__Impl ;
    public final void rule__St__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1982:1: ( rule__St__Group__1__Impl )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1983:2: rule__St__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__St__Group__1__Impl_in_rule__St__Group__14092);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1989:1: rule__St__Group__1__Impl : ( ( rule__St__RealAssignment_1 ) ) ;
    public final void rule__St__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1993:1: ( ( ( rule__St__RealAssignment_1 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1994:1: ( ( rule__St__RealAssignment_1 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1994:1: ( ( rule__St__RealAssignment_1 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1995:1: ( rule__St__RealAssignment_1 )
            {
             before(grammarAccess.getStAccess().getRealAssignment_1()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1996:1: ( rule__St__RealAssignment_1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:1996:2: rule__St__RealAssignment_1
            {
            pushFollow(FOLLOW_rule__St__RealAssignment_1_in_rule__St__Group__1__Impl4119);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2010:1: rule__Attributes__Group__0 : rule__Attributes__Group__0__Impl rule__Attributes__Group__1 ;
    public final void rule__Attributes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2014:1: ( rule__Attributes__Group__0__Impl rule__Attributes__Group__1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2015:2: rule__Attributes__Group__0__Impl rule__Attributes__Group__1
            {
            pushFollow(FOLLOW_rule__Attributes__Group__0__Impl_in_rule__Attributes__Group__04153);
            rule__Attributes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attributes__Group__1_in_rule__Attributes__Group__04156);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2022:1: rule__Attributes__Group__0__Impl : ( () ) ;
    public final void rule__Attributes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2026:1: ( ( () ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2027:1: ( () )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2027:1: ( () )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2028:1: ()
            {
             before(grammarAccess.getAttributesAccess().getAttributesAction_0()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2029:1: ()
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2031:1: 
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2041:1: rule__Attributes__Group__1 : rule__Attributes__Group__1__Impl ;
    public final void rule__Attributes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2045:1: ( rule__Attributes__Group__1__Impl )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2046:2: rule__Attributes__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Attributes__Group__1__Impl_in_rule__Attributes__Group__14214);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2052:1: rule__Attributes__Group__1__Impl : ( ( rule__Attributes__AttributeAssignment_1 )* ) ;
    public final void rule__Attributes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2056:1: ( ( ( rule__Attributes__AttributeAssignment_1 )* ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2057:1: ( ( rule__Attributes__AttributeAssignment_1 )* )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2057:1: ( ( rule__Attributes__AttributeAssignment_1 )* )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2058:1: ( rule__Attributes__AttributeAssignment_1 )*
            {
             before(grammarAccess.getAttributesAccess().getAttributeAssignment_1()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2059:1: ( rule__Attributes__AttributeAssignment_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_STRING)||(LA19_0>=14 && LA19_0<=15)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2059:2: rule__Attributes__AttributeAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Attributes__AttributeAssignment_1_in_rule__Attributes__Group__1__Impl4241);
            	    rule__Attributes__AttributeAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2073:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2077:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2078:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__04276);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__04279);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2085:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__Alternatives_0 )? ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2089:1: ( ( ( rule__Attribute__Alternatives_0 )? ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2090:1: ( ( rule__Attribute__Alternatives_0 )? )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2090:1: ( ( rule__Attribute__Alternatives_0 )? )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2091:1: ( rule__Attribute__Alternatives_0 )?
            {
             before(grammarAccess.getAttributeAccess().getAlternatives_0()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2092:1: ( rule__Attribute__Alternatives_0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=14 && LA20_0<=15)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2092:2: rule__Attribute__Alternatives_0
                    {
                    pushFollow(FOLLOW_rule__Attribute__Alternatives_0_in_rule__Attribute__Group__0__Impl4306);
                    rule__Attribute__Alternatives_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getAlternatives_0()); 

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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2102:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2106:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2107:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__14337);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__14340);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2114:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__IdAttributeAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2118:1: ( ( ( rule__Attribute__IdAttributeAssignment_1 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2119:1: ( ( rule__Attribute__IdAttributeAssignment_1 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2119:1: ( ( rule__Attribute__IdAttributeAssignment_1 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2120:1: ( rule__Attribute__IdAttributeAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getIdAttributeAssignment_1()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2121:1: ( rule__Attribute__IdAttributeAssignment_1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2121:2: rule__Attribute__IdAttributeAssignment_1
            {
            pushFollow(FOLLOW_rule__Attribute__IdAttributeAssignment_1_in_rule__Attribute__Group__1__Impl4367);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2131:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2135:1: ( rule__Attribute__Group__2__Impl )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2136:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__24397);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2142:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__Group_2__0 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2146:1: ( ( ( rule__Attribute__Group_2__0 )? ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2147:1: ( ( rule__Attribute__Group_2__0 )? )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2147:1: ( ( rule__Attribute__Group_2__0 )? )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2148:1: ( rule__Attribute__Group_2__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_2()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2149:1: ( rule__Attribute__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ASSIGN) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2149:2: rule__Attribute__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Attribute__Group_2__0_in_rule__Attribute__Group__2__Impl4424);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2165:1: rule__Attribute__Group_2__0 : rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1 ;
    public final void rule__Attribute__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2169:1: ( rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2170:2: rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group_2__0__Impl_in_rule__Attribute__Group_2__04461);
            rule__Attribute__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group_2__1_in_rule__Attribute__Group_2__04464);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2177:1: rule__Attribute__Group_2__0__Impl : ( ( rule__Attribute__AssignAssignment_2_0 ) ) ;
    public final void rule__Attribute__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2181:1: ( ( ( rule__Attribute__AssignAssignment_2_0 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2182:1: ( ( rule__Attribute__AssignAssignment_2_0 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2182:1: ( ( rule__Attribute__AssignAssignment_2_0 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2183:1: ( rule__Attribute__AssignAssignment_2_0 )
            {
             before(grammarAccess.getAttributeAccess().getAssignAssignment_2_0()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2184:1: ( rule__Attribute__AssignAssignment_2_0 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2184:2: rule__Attribute__AssignAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Attribute__AssignAssignment_2_0_in_rule__Attribute__Group_2__0__Impl4491);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2194:1: rule__Attribute__Group_2__1 : rule__Attribute__Group_2__1__Impl rule__Attribute__Group_2__2 ;
    public final void rule__Attribute__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2198:1: ( rule__Attribute__Group_2__1__Impl rule__Attribute__Group_2__2 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2199:2: rule__Attribute__Group_2__1__Impl rule__Attribute__Group_2__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group_2__1__Impl_in_rule__Attribute__Group_2__14521);
            rule__Attribute__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group_2__2_in_rule__Attribute__Group_2__14524);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2206:1: rule__Attribute__Group_2__1__Impl : ( ( rule__Attribute__ValueAssignment_2_1 ) ) ;
    public final void rule__Attribute__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2210:1: ( ( ( rule__Attribute__ValueAssignment_2_1 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2211:1: ( ( rule__Attribute__ValueAssignment_2_1 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2211:1: ( ( rule__Attribute__ValueAssignment_2_1 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2212:1: ( rule__Attribute__ValueAssignment_2_1 )
            {
             before(grammarAccess.getAttributeAccess().getValueAssignment_2_1()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2213:1: ( rule__Attribute__ValueAssignment_2_1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2213:2: rule__Attribute__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Attribute__ValueAssignment_2_1_in_rule__Attribute__Group_2__1__Impl4551);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2223:1: rule__Attribute__Group_2__2 : rule__Attribute__Group_2__2__Impl ;
    public final void rule__Attribute__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2227:1: ( rule__Attribute__Group_2__2__Impl )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2228:2: rule__Attribute__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group_2__2__Impl_in_rule__Attribute__Group_2__24581);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2234:1: rule__Attribute__Group_2__2__Impl : ( ( rule__Attribute__Group_2_2__0 )* ) ;
    public final void rule__Attribute__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2238:1: ( ( ( rule__Attribute__Group_2_2__0 )* ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2239:1: ( ( rule__Attribute__Group_2_2__0 )* )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2239:1: ( ( rule__Attribute__Group_2_2__0 )* )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2240:1: ( rule__Attribute__Group_2_2__0 )*
            {
             before(grammarAccess.getAttributeAccess().getGroup_2_2()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2241:1: ( rule__Attribute__Group_2_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==24) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2241:2: rule__Attribute__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Attribute__Group_2_2__0_in_rule__Attribute__Group_2__2__Impl4608);
            	    rule__Attribute__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2257:1: rule__Attribute__Group_2_2__0 : rule__Attribute__Group_2_2__0__Impl rule__Attribute__Group_2_2__1 ;
    public final void rule__Attribute__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2261:1: ( rule__Attribute__Group_2_2__0__Impl rule__Attribute__Group_2_2__1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2262:2: rule__Attribute__Group_2_2__0__Impl rule__Attribute__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group_2_2__0__Impl_in_rule__Attribute__Group_2_2__04645);
            rule__Attribute__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group_2_2__1_in_rule__Attribute__Group_2_2__04648);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2269:1: rule__Attribute__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Attribute__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2273:1: ( ( ',' ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2274:1: ( ',' )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2274:1: ( ',' )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2275:1: ','
            {
             before(grammarAccess.getAttributeAccess().getCommaKeyword_2_2_0()); 
            match(input,24,FOLLOW_24_in_rule__Attribute__Group_2_2__0__Impl4676); 
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2288:1: rule__Attribute__Group_2_2__1 : rule__Attribute__Group_2_2__1__Impl ;
    public final void rule__Attribute__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2292:1: ( rule__Attribute__Group_2_2__1__Impl )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2293:2: rule__Attribute__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group_2_2__1__Impl_in_rule__Attribute__Group_2_2__14707);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2299:1: rule__Attribute__Group_2_2__1__Impl : ( ( rule__Attribute__OtherValuesAssignment_2_2_1 ) ) ;
    public final void rule__Attribute__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2303:1: ( ( ( rule__Attribute__OtherValuesAssignment_2_2_1 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2304:1: ( ( rule__Attribute__OtherValuesAssignment_2_2_1 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2304:1: ( ( rule__Attribute__OtherValuesAssignment_2_2_1 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2305:1: ( rule__Attribute__OtherValuesAssignment_2_2_1 )
            {
             before(grammarAccess.getAttributeAccess().getOtherValuesAssignment_2_2_1()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2306:1: ( rule__Attribute__OtherValuesAssignment_2_2_1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2306:2: rule__Attribute__OtherValuesAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Attribute__OtherValuesAssignment_2_2_1_in_rule__Attribute__Group_2_2__1__Impl4734);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2320:1: rule__Array__Group__0 : rule__Array__Group__0__Impl rule__Array__Group__1 ;
    public final void rule__Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2324:1: ( rule__Array__Group__0__Impl rule__Array__Group__1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2325:2: rule__Array__Group__0__Impl rule__Array__Group__1
            {
            pushFollow(FOLLOW_rule__Array__Group__0__Impl_in_rule__Array__Group__04768);
            rule__Array__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Array__Group__1_in_rule__Array__Group__04771);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2332:1: rule__Array__Group__0__Impl : ( () ) ;
    public final void rule__Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2336:1: ( ( () ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2337:1: ( () )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2337:1: ( () )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2338:1: ()
            {
             before(grammarAccess.getArrayAccess().getArrayAction_0()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2339:1: ()
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2341:1: 
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2351:1: rule__Array__Group__1 : rule__Array__Group__1__Impl rule__Array__Group__2 ;
    public final void rule__Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2355:1: ( rule__Array__Group__1__Impl rule__Array__Group__2 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2356:2: rule__Array__Group__1__Impl rule__Array__Group__2
            {
            pushFollow(FOLLOW_rule__Array__Group__1__Impl_in_rule__Array__Group__14829);
            rule__Array__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Array__Group__2_in_rule__Array__Group__14832);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2363:1: rule__Array__Group__1__Impl : ( '{' ) ;
    public final void rule__Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2367:1: ( ( '{' ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2368:1: ( '{' )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2368:1: ( '{' )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2369:1: '{'
            {
             before(grammarAccess.getArrayAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__Array__Group__1__Impl4860); 
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2382:1: rule__Array__Group__2 : rule__Array__Group__2__Impl rule__Array__Group__3 ;
    public final void rule__Array__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2386:1: ( rule__Array__Group__2__Impl rule__Array__Group__3 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2387:2: rule__Array__Group__2__Impl rule__Array__Group__3
            {
            pushFollow(FOLLOW_rule__Array__Group__2__Impl_in_rule__Array__Group__24891);
            rule__Array__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Array__Group__3_in_rule__Array__Group__24894);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2394:1: rule__Array__Group__2__Impl : ( ( rule__Array__Group_2__0 )? ) ;
    public final void rule__Array__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2398:1: ( ( ( rule__Array__Group_2__0 )? ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2399:1: ( ( rule__Array__Group_2__0 )? )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2399:1: ( ( rule__Array__Group_2__0 )? )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2400:1: ( rule__Array__Group_2__0 )?
            {
             before(grammarAccess.getArrayAccess().getGroup_2()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2401:1: ( rule__Array__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_STRING && LA23_0<=RULE_INT)||LA23_0==25||LA23_0==27) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2401:2: rule__Array__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Array__Group_2__0_in_rule__Array__Group__2__Impl4921);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2411:1: rule__Array__Group__3 : rule__Array__Group__3__Impl ;
    public final void rule__Array__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2415:1: ( rule__Array__Group__3__Impl )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2416:2: rule__Array__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Array__Group__3__Impl_in_rule__Array__Group__34952);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2422:1: rule__Array__Group__3__Impl : ( '}' ) ;
    public final void rule__Array__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2426:1: ( ( '}' ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2427:1: ( '}' )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2427:1: ( '}' )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2428:1: '}'
            {
             before(grammarAccess.getArrayAccess().getRightCurlyBracketKeyword_3()); 
            match(input,26,FOLLOW_26_in_rule__Array__Group__3__Impl4980); 
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2449:1: rule__Array__Group_2__0 : rule__Array__Group_2__0__Impl rule__Array__Group_2__1 ;
    public final void rule__Array__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2453:1: ( rule__Array__Group_2__0__Impl rule__Array__Group_2__1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2454:2: rule__Array__Group_2__0__Impl rule__Array__Group_2__1
            {
            pushFollow(FOLLOW_rule__Array__Group_2__0__Impl_in_rule__Array__Group_2__05019);
            rule__Array__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Array__Group_2__1_in_rule__Array__Group_2__05022);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2461:1: rule__Array__Group_2__0__Impl : ( ( rule__Array__ValueAssignment_2_0 ) ) ;
    public final void rule__Array__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2465:1: ( ( ( rule__Array__ValueAssignment_2_0 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2466:1: ( ( rule__Array__ValueAssignment_2_0 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2466:1: ( ( rule__Array__ValueAssignment_2_0 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2467:1: ( rule__Array__ValueAssignment_2_0 )
            {
             before(grammarAccess.getArrayAccess().getValueAssignment_2_0()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2468:1: ( rule__Array__ValueAssignment_2_0 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2468:2: rule__Array__ValueAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Array__ValueAssignment_2_0_in_rule__Array__Group_2__0__Impl5049);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2478:1: rule__Array__Group_2__1 : rule__Array__Group_2__1__Impl ;
    public final void rule__Array__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2482:1: ( rule__Array__Group_2__1__Impl )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2483:2: rule__Array__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Array__Group_2__1__Impl_in_rule__Array__Group_2__15079);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2489:1: rule__Array__Group_2__1__Impl : ( ( rule__Array__Group_2_1__0 )* ) ;
    public final void rule__Array__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2493:1: ( ( ( rule__Array__Group_2_1__0 )* ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2494:1: ( ( rule__Array__Group_2_1__0 )* )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2494:1: ( ( rule__Array__Group_2_1__0 )* )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2495:1: ( rule__Array__Group_2_1__0 )*
            {
             before(grammarAccess.getArrayAccess().getGroup_2_1()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2496:1: ( rule__Array__Group_2_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==24) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2496:2: rule__Array__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Array__Group_2_1__0_in_rule__Array__Group_2__1__Impl5106);
            	    rule__Array__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2510:1: rule__Array__Group_2_1__0 : rule__Array__Group_2_1__0__Impl rule__Array__Group_2_1__1 ;
    public final void rule__Array__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2514:1: ( rule__Array__Group_2_1__0__Impl rule__Array__Group_2_1__1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2515:2: rule__Array__Group_2_1__0__Impl rule__Array__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__Array__Group_2_1__0__Impl_in_rule__Array__Group_2_1__05141);
            rule__Array__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Array__Group_2_1__1_in_rule__Array__Group_2_1__05144);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2522:1: rule__Array__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Array__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2526:1: ( ( ',' ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2527:1: ( ',' )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2527:1: ( ',' )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2528:1: ','
            {
             before(grammarAccess.getArrayAccess().getCommaKeyword_2_1_0()); 
            match(input,24,FOLLOW_24_in_rule__Array__Group_2_1__0__Impl5172); 
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2541:1: rule__Array__Group_2_1__1 : rule__Array__Group_2_1__1__Impl ;
    public final void rule__Array__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2545:1: ( rule__Array__Group_2_1__1__Impl )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2546:2: rule__Array__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Array__Group_2_1__1__Impl_in_rule__Array__Group_2_1__15203);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2552:1: rule__Array__Group_2_1__1__Impl : ( ( rule__Array__OtherValuesAssignment_2_1_1 ) ) ;
    public final void rule__Array__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2556:1: ( ( ( rule__Array__OtherValuesAssignment_2_1_1 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2557:1: ( ( rule__Array__OtherValuesAssignment_2_1_1 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2557:1: ( ( rule__Array__OtherValuesAssignment_2_1_1 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2558:1: ( rule__Array__OtherValuesAssignment_2_1_1 )
            {
             before(grammarAccess.getArrayAccess().getOtherValuesAssignment_2_1_1()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2559:1: ( rule__Array__OtherValuesAssignment_2_1_1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2559:2: rule__Array__OtherValuesAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__Array__OtherValuesAssignment_2_1_1_in_rule__Array__Group_2_1__1__Impl5230);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2573:1: rule__Map__Group__0 : rule__Map__Group__0__Impl rule__Map__Group__1 ;
    public final void rule__Map__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2577:1: ( rule__Map__Group__0__Impl rule__Map__Group__1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2578:2: rule__Map__Group__0__Impl rule__Map__Group__1
            {
            pushFollow(FOLLOW_rule__Map__Group__0__Impl_in_rule__Map__Group__05264);
            rule__Map__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Map__Group__1_in_rule__Map__Group__05267);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2585:1: rule__Map__Group__0__Impl : ( '[' ) ;
    public final void rule__Map__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2589:1: ( ( '[' ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2590:1: ( '[' )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2590:1: ( '[' )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2591:1: '['
            {
             before(grammarAccess.getMapAccess().getLeftSquareBracketKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__Map__Group__0__Impl5295); 
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2604:1: rule__Map__Group__1 : rule__Map__Group__1__Impl rule__Map__Group__2 ;
    public final void rule__Map__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2608:1: ( rule__Map__Group__1__Impl rule__Map__Group__2 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2609:2: rule__Map__Group__1__Impl rule__Map__Group__2
            {
            pushFollow(FOLLOW_rule__Map__Group__1__Impl_in_rule__Map__Group__15326);
            rule__Map__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Map__Group__2_in_rule__Map__Group__15329);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2616:1: rule__Map__Group__1__Impl : ( ( rule__Map__MappingAssignment_1 ) ) ;
    public final void rule__Map__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2620:1: ( ( ( rule__Map__MappingAssignment_1 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2621:1: ( ( rule__Map__MappingAssignment_1 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2621:1: ( ( rule__Map__MappingAssignment_1 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2622:1: ( rule__Map__MappingAssignment_1 )
            {
             before(grammarAccess.getMapAccess().getMappingAssignment_1()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2623:1: ( rule__Map__MappingAssignment_1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2623:2: rule__Map__MappingAssignment_1
            {
            pushFollow(FOLLOW_rule__Map__MappingAssignment_1_in_rule__Map__Group__1__Impl5356);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2633:1: rule__Map__Group__2 : rule__Map__Group__2__Impl rule__Map__Group__3 ;
    public final void rule__Map__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2637:1: ( rule__Map__Group__2__Impl rule__Map__Group__3 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2638:2: rule__Map__Group__2__Impl rule__Map__Group__3
            {
            pushFollow(FOLLOW_rule__Map__Group__2__Impl_in_rule__Map__Group__25386);
            rule__Map__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Map__Group__3_in_rule__Map__Group__25389);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2645:1: rule__Map__Group__2__Impl : ( ( rule__Map__Group_2__0 )* ) ;
    public final void rule__Map__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2649:1: ( ( ( rule__Map__Group_2__0 )* ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2650:1: ( ( rule__Map__Group_2__0 )* )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2650:1: ( ( rule__Map__Group_2__0 )* )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2651:1: ( rule__Map__Group_2__0 )*
            {
             before(grammarAccess.getMapAccess().getGroup_2()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2652:1: ( rule__Map__Group_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==24) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2652:2: rule__Map__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Map__Group_2__0_in_rule__Map__Group__2__Impl5416);
            	    rule__Map__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2662:1: rule__Map__Group__3 : rule__Map__Group__3__Impl ;
    public final void rule__Map__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2666:1: ( rule__Map__Group__3__Impl )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2667:2: rule__Map__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Map__Group__3__Impl_in_rule__Map__Group__35447);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2673:1: rule__Map__Group__3__Impl : ( ']' ) ;
    public final void rule__Map__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2677:1: ( ( ']' ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2678:1: ( ']' )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2678:1: ( ']' )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2679:1: ']'
            {
             before(grammarAccess.getMapAccess().getRightSquareBracketKeyword_3()); 
            match(input,28,FOLLOW_28_in_rule__Map__Group__3__Impl5475); 
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2700:1: rule__Map__Group_2__0 : rule__Map__Group_2__0__Impl rule__Map__Group_2__1 ;
    public final void rule__Map__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2704:1: ( rule__Map__Group_2__0__Impl rule__Map__Group_2__1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2705:2: rule__Map__Group_2__0__Impl rule__Map__Group_2__1
            {
            pushFollow(FOLLOW_rule__Map__Group_2__0__Impl_in_rule__Map__Group_2__05514);
            rule__Map__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Map__Group_2__1_in_rule__Map__Group_2__05517);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2712:1: rule__Map__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Map__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2716:1: ( ( ',' ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2717:1: ( ',' )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2717:1: ( ',' )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2718:1: ','
            {
             before(grammarAccess.getMapAccess().getCommaKeyword_2_0()); 
            match(input,24,FOLLOW_24_in_rule__Map__Group_2__0__Impl5545); 
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2731:1: rule__Map__Group_2__1 : rule__Map__Group_2__1__Impl ;
    public final void rule__Map__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2735:1: ( rule__Map__Group_2__1__Impl )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2736:2: rule__Map__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Map__Group_2__1__Impl_in_rule__Map__Group_2__15576);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2742:1: rule__Map__Group_2__1__Impl : ( ( rule__Map__OtherMappingAssignment_2_1 ) ) ;
    public final void rule__Map__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2746:1: ( ( ( rule__Map__OtherMappingAssignment_2_1 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2747:1: ( ( rule__Map__OtherMappingAssignment_2_1 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2747:1: ( ( rule__Map__OtherMappingAssignment_2_1 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2748:1: ( rule__Map__OtherMappingAssignment_2_1 )
            {
             before(grammarAccess.getMapAccess().getOtherMappingAssignment_2_1()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2749:1: ( rule__Map__OtherMappingAssignment_2_1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2749:2: rule__Map__OtherMappingAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Map__OtherMappingAssignment_2_1_in_rule__Map__Group_2__1__Impl5603);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2763:1: rule__Mapping__Group__0 : rule__Mapping__Group__0__Impl rule__Mapping__Group__1 ;
    public final void rule__Mapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2767:1: ( rule__Mapping__Group__0__Impl rule__Mapping__Group__1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2768:2: rule__Mapping__Group__0__Impl rule__Mapping__Group__1
            {
            pushFollow(FOLLOW_rule__Mapping__Group__0__Impl_in_rule__Mapping__Group__05637);
            rule__Mapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mapping__Group__1_in_rule__Mapping__Group__05640);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2775:1: rule__Mapping__Group__0__Impl : ( ( rule__Mapping__IdAssignment_0 ) ) ;
    public final void rule__Mapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2779:1: ( ( ( rule__Mapping__IdAssignment_0 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2780:1: ( ( rule__Mapping__IdAssignment_0 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2780:1: ( ( rule__Mapping__IdAssignment_0 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2781:1: ( rule__Mapping__IdAssignment_0 )
            {
             before(grammarAccess.getMappingAccess().getIdAssignment_0()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2782:1: ( rule__Mapping__IdAssignment_0 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2782:2: rule__Mapping__IdAssignment_0
            {
            pushFollow(FOLLOW_rule__Mapping__IdAssignment_0_in_rule__Mapping__Group__0__Impl5667);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2792:1: rule__Mapping__Group__1 : rule__Mapping__Group__1__Impl rule__Mapping__Group__2 ;
    public final void rule__Mapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2796:1: ( rule__Mapping__Group__1__Impl rule__Mapping__Group__2 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2797:2: rule__Mapping__Group__1__Impl rule__Mapping__Group__2
            {
            pushFollow(FOLLOW_rule__Mapping__Group__1__Impl_in_rule__Mapping__Group__15697);
            rule__Mapping__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mapping__Group__2_in_rule__Mapping__Group__15700);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2804:1: rule__Mapping__Group__1__Impl : ( ( rule__Mapping__AssignAssignment_1 ) ) ;
    public final void rule__Mapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2808:1: ( ( ( rule__Mapping__AssignAssignment_1 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2809:1: ( ( rule__Mapping__AssignAssignment_1 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2809:1: ( ( rule__Mapping__AssignAssignment_1 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2810:1: ( rule__Mapping__AssignAssignment_1 )
            {
             before(grammarAccess.getMappingAccess().getAssignAssignment_1()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2811:1: ( rule__Mapping__AssignAssignment_1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2811:2: rule__Mapping__AssignAssignment_1
            {
            pushFollow(FOLLOW_rule__Mapping__AssignAssignment_1_in_rule__Mapping__Group__1__Impl5727);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2821:1: rule__Mapping__Group__2 : rule__Mapping__Group__2__Impl ;
    public final void rule__Mapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2825:1: ( rule__Mapping__Group__2__Impl )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2826:2: rule__Mapping__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Mapping__Group__2__Impl_in_rule__Mapping__Group__25757);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2832:1: rule__Mapping__Group__2__Impl : ( ( rule__Mapping__ValueAssignment_2 ) ) ;
    public final void rule__Mapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2836:1: ( ( ( rule__Mapping__ValueAssignment_2 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2837:1: ( ( rule__Mapping__ValueAssignment_2 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2837:1: ( ( rule__Mapping__ValueAssignment_2 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2838:1: ( rule__Mapping__ValueAssignment_2 )
            {
             before(grammarAccess.getMappingAccess().getValueAssignment_2()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2839:1: ( rule__Mapping__ValueAssignment_2 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2839:2: rule__Mapping__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Mapping__ValueAssignment_2_in_rule__Mapping__Group__2__Impl5784);
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


    // $ANTLR start "rule__Real__Group__0"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2855:1: rule__Real__Group__0 : rule__Real__Group__0__Impl rule__Real__Group__1 ;
    public final void rule__Real__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2859:1: ( rule__Real__Group__0__Impl rule__Real__Group__1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2860:2: rule__Real__Group__0__Impl rule__Real__Group__1
            {
            pushFollow(FOLLOW_rule__Real__Group__0__Impl_in_rule__Real__Group__05820);
            rule__Real__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Real__Group__1_in_rule__Real__Group__05823);
            rule__Real__Group__1();

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
    // $ANTLR end "rule__Real__Group__0"


    // $ANTLR start "rule__Real__Group__0__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2867:1: rule__Real__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Real__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2871:1: ( ( RULE_INT ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2872:1: ( RULE_INT )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2872:1: ( RULE_INT )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2873:1: RULE_INT
            {
             before(grammarAccess.getRealAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Real__Group__0__Impl5850); 
             after(grammarAccess.getRealAccess().getINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Real__Group__0__Impl"


    // $ANTLR start "rule__Real__Group__1"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2884:1: rule__Real__Group__1 : rule__Real__Group__1__Impl ;
    public final void rule__Real__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2888:1: ( rule__Real__Group__1__Impl )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2889:2: rule__Real__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Real__Group__1__Impl_in_rule__Real__Group__15879);
            rule__Real__Group__1__Impl();

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
    // $ANTLR end "rule__Real__Group__1"


    // $ANTLR start "rule__Real__Group__1__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2895:1: rule__Real__Group__1__Impl : ( ( rule__Real__Group_1__0 ) ) ;
    public final void rule__Real__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2899:1: ( ( ( rule__Real__Group_1__0 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2900:1: ( ( rule__Real__Group_1__0 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2900:1: ( ( rule__Real__Group_1__0 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2901:1: ( rule__Real__Group_1__0 )
            {
             before(grammarAccess.getRealAccess().getGroup_1()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2902:1: ( rule__Real__Group_1__0 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2902:2: rule__Real__Group_1__0
            {
            pushFollow(FOLLOW_rule__Real__Group_1__0_in_rule__Real__Group__1__Impl5906);
            rule__Real__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getRealAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Real__Group__1__Impl"


    // $ANTLR start "rule__Real__Group_1__0"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2916:1: rule__Real__Group_1__0 : rule__Real__Group_1__0__Impl rule__Real__Group_1__1 ;
    public final void rule__Real__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2920:1: ( rule__Real__Group_1__0__Impl rule__Real__Group_1__1 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2921:2: rule__Real__Group_1__0__Impl rule__Real__Group_1__1
            {
            pushFollow(FOLLOW_rule__Real__Group_1__0__Impl_in_rule__Real__Group_1__05940);
            rule__Real__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Real__Group_1__1_in_rule__Real__Group_1__05943);
            rule__Real__Group_1__1();

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
    // $ANTLR end "rule__Real__Group_1__0"


    // $ANTLR start "rule__Real__Group_1__0__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2928:1: rule__Real__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Real__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2932:1: ( ( '.' ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2933:1: ( '.' )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2933:1: ( '.' )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2934:1: '.'
            {
             before(grammarAccess.getRealAccess().getFullStopKeyword_1_0()); 
            match(input,29,FOLLOW_29_in_rule__Real__Group_1__0__Impl5971); 
             after(grammarAccess.getRealAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__Real__Group_1__0__Impl"


    // $ANTLR start "rule__Real__Group_1__1"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2947:1: rule__Real__Group_1__1 : rule__Real__Group_1__1__Impl rule__Real__Group_1__2 ;
    public final void rule__Real__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2951:1: ( rule__Real__Group_1__1__Impl rule__Real__Group_1__2 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2952:2: rule__Real__Group_1__1__Impl rule__Real__Group_1__2
            {
            pushFollow(FOLLOW_rule__Real__Group_1__1__Impl_in_rule__Real__Group_1__16002);
            rule__Real__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Real__Group_1__2_in_rule__Real__Group_1__16005);
            rule__Real__Group_1__2();

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
    // $ANTLR end "rule__Real__Group_1__1"


    // $ANTLR start "rule__Real__Group_1__1__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2959:1: rule__Real__Group_1__1__Impl : ( ( '0' )* ) ;
    public final void rule__Real__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2963:1: ( ( ( '0' )* ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2964:1: ( ( '0' )* )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2964:1: ( ( '0' )* )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2965:1: ( '0' )*
            {
             before(grammarAccess.getRealAccess().getDigitZeroKeyword_1_1()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2966:1: ( '0' )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==30) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2967:2: '0'
            	    {
            	    match(input,30,FOLLOW_30_in_rule__Real__Group_1__1__Impl6034); 

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getRealAccess().getDigitZeroKeyword_1_1()); 

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
    // $ANTLR end "rule__Real__Group_1__1__Impl"


    // $ANTLR start "rule__Real__Group_1__2"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2978:1: rule__Real__Group_1__2 : rule__Real__Group_1__2__Impl ;
    public final void rule__Real__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2982:1: ( rule__Real__Group_1__2__Impl )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2983:2: rule__Real__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Real__Group_1__2__Impl_in_rule__Real__Group_1__26067);
            rule__Real__Group_1__2__Impl();

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
    // $ANTLR end "rule__Real__Group_1__2"


    // $ANTLR start "rule__Real__Group_1__2__Impl"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2989:1: rule__Real__Group_1__2__Impl : ( RULE_INT ) ;
    public final void rule__Real__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2993:1: ( ( RULE_INT ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2994:1: ( RULE_INT )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2994:1: ( RULE_INT )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:2995:1: RULE_INT
            {
             before(grammarAccess.getRealAccess().getINTTerminalRuleCall_1_2()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Real__Group_1__2__Impl6094); 
             after(grammarAccess.getRealAccess().getINTTerminalRuleCall_1_2()); 

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
    // $ANTLR end "rule__Real__Group_1__2__Impl"


    // $ANTLR start "rule__Dgs__HeaderAssignment_0"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3013:1: rule__Dgs__HeaderAssignment_0 : ( ruleHeader ) ;
    public final void rule__Dgs__HeaderAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3017:1: ( ( ruleHeader ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3018:1: ( ruleHeader )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3018:1: ( ruleHeader )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3019:1: ruleHeader
            {
             before(grammarAccess.getDgsAccess().getHeaderHeaderParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleHeader_in_rule__Dgs__HeaderAssignment_06134);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3028:1: rule__Dgs__EventAssignment_1_0 : ( ruleEvent ) ;
    public final void rule__Dgs__EventAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3032:1: ( ( ruleEvent ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3033:1: ( ruleEvent )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3033:1: ( ruleEvent )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3034:1: ruleEvent
            {
             before(grammarAccess.getDgsAccess().getEventEventParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleEvent_in_rule__Dgs__EventAssignment_1_06165);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3043:1: rule__Dgs__CommentAssignment_1_1 : ( RULE_COMMENT ) ;
    public final void rule__Dgs__CommentAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3047:1: ( ( RULE_COMMENT ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3048:1: ( RULE_COMMENT )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3048:1: ( RULE_COMMENT )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3049:1: RULE_COMMENT
            {
             before(grammarAccess.getDgsAccess().getCommentCOMMENTTerminalRuleCall_1_1_0()); 
            match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_rule__Dgs__CommentAssignment_1_16196); 
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3058:1: rule__Header__MagicAssignment_0 : ( RULE_MAGIC ) ;
    public final void rule__Header__MagicAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3062:1: ( ( RULE_MAGIC ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3063:1: ( RULE_MAGIC )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3063:1: ( RULE_MAGIC )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3064:1: RULE_MAGIC
            {
             before(grammarAccess.getHeaderAccess().getMagicMAGICTerminalRuleCall_0_0()); 
            match(input,RULE_MAGIC,FOLLOW_RULE_MAGIC_in_rule__Header__MagicAssignment_06227); 
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3073:1: rule__Header__NameAssignment_2 : ( ( rule__Header__NameAlternatives_2_0 ) ) ;
    public final void rule__Header__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3077:1: ( ( ( rule__Header__NameAlternatives_2_0 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3078:1: ( ( rule__Header__NameAlternatives_2_0 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3078:1: ( ( rule__Header__NameAlternatives_2_0 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3079:1: ( rule__Header__NameAlternatives_2_0 )
            {
             before(grammarAccess.getHeaderAccess().getNameAlternatives_2_0()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3080:1: ( rule__Header__NameAlternatives_2_0 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3080:2: rule__Header__NameAlternatives_2_0
            {
            pushFollow(FOLLOW_rule__Header__NameAlternatives_2_0_in_rule__Header__NameAssignment_26258);
            rule__Header__NameAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getHeaderAccess().getNameAlternatives_2_0()); 

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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3089:1: rule__Header__NumberOfStepsAssignment_3 : ( RULE_INT ) ;
    public final void rule__Header__NumberOfStepsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3093:1: ( ( RULE_INT ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3094:1: ( RULE_INT )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3094:1: ( RULE_INT )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3095:1: RULE_INT
            {
             before(grammarAccess.getHeaderAccess().getNumberOfStepsINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Header__NumberOfStepsAssignment_36291); 
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3104:1: rule__Header__NumberOfEventsAssignment_4 : ( RULE_INT ) ;
    public final void rule__Header__NumberOfEventsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3108:1: ( ( RULE_INT ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3109:1: ( RULE_INT )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3109:1: ( RULE_INT )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3110:1: RULE_INT
            {
             before(grammarAccess.getHeaderAccess().getNumberOfEventsINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Header__NumberOfEventsAssignment_46322); 
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3119:1: rule__Event__AnAssignment_0_0 : ( ruleAn ) ;
    public final void rule__Event__AnAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3123:1: ( ( ruleAn ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3124:1: ( ruleAn )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3124:1: ( ruleAn )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3125:1: ruleAn
            {
             before(grammarAccess.getEventAccess().getAnAnParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleAn_in_rule__Event__AnAssignment_0_06353);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3134:1: rule__Event__CnAssignment_0_1 : ( ruleCn ) ;
    public final void rule__Event__CnAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3138:1: ( ( ruleCn ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3139:1: ( ruleCn )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3139:1: ( ruleCn )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3140:1: ruleCn
            {
             before(grammarAccess.getEventAccess().getCnCnParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleCn_in_rule__Event__CnAssignment_0_16384);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3149:1: rule__Event__DnAssignment_0_2 : ( ruleDn ) ;
    public final void rule__Event__DnAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3153:1: ( ( ruleDn ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3154:1: ( ruleDn )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3154:1: ( ruleDn )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3155:1: ruleDn
            {
             before(grammarAccess.getEventAccess().getDnDnParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleDn_in_rule__Event__DnAssignment_0_26415);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3164:1: rule__Event__AeAssignment_0_3 : ( ruleAe ) ;
    public final void rule__Event__AeAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3168:1: ( ( ruleAe ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3169:1: ( ruleAe )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3169:1: ( ruleAe )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3170:1: ruleAe
            {
             before(grammarAccess.getEventAccess().getAeAeParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_ruleAe_in_rule__Event__AeAssignment_0_36446);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3179:1: rule__Event__CeAssignment_0_4 : ( ruleCe ) ;
    public final void rule__Event__CeAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3183:1: ( ( ruleCe ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3184:1: ( ruleCe )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3184:1: ( ruleCe )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3185:1: ruleCe
            {
             before(grammarAccess.getEventAccess().getCeCeParserRuleCall_0_4_0()); 
            pushFollow(FOLLOW_ruleCe_in_rule__Event__CeAssignment_0_46477);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3194:1: rule__Event__DeAssignment_0_5 : ( ruleDe ) ;
    public final void rule__Event__DeAssignment_0_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3198:1: ( ( ruleDe ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3199:1: ( ruleDe )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3199:1: ( ruleDe )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3200:1: ruleDe
            {
             before(grammarAccess.getEventAccess().getDeDeParserRuleCall_0_5_0()); 
            pushFollow(FOLLOW_ruleDe_in_rule__Event__DeAssignment_0_56508);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3209:1: rule__Event__CgAssignment_0_6 : ( ruleCg ) ;
    public final void rule__Event__CgAssignment_0_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3213:1: ( ( ruleCg ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3214:1: ( ruleCg )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3214:1: ( ruleCg )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3215:1: ruleCg
            {
             before(grammarAccess.getEventAccess().getCgCgParserRuleCall_0_6_0()); 
            pushFollow(FOLLOW_ruleCg_in_rule__Event__CgAssignment_0_66539);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3224:1: rule__Event__StAssignment_0_7 : ( ruleSt ) ;
    public final void rule__Event__StAssignment_0_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3228:1: ( ( ruleSt ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3229:1: ( ruleSt )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3229:1: ( ruleSt )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3230:1: ruleSt
            {
             before(grammarAccess.getEventAccess().getStStParserRuleCall_0_7_0()); 
            pushFollow(FOLLOW_ruleSt_in_rule__Event__StAssignment_0_76570);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3239:1: rule__Event__ClAssignment_0_8 : ( RULE_CL ) ;
    public final void rule__Event__ClAssignment_0_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3243:1: ( ( RULE_CL ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3244:1: ( RULE_CL )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3244:1: ( RULE_CL )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3245:1: RULE_CL
            {
             before(grammarAccess.getEventAccess().getClClTerminalRuleCall_0_8_0()); 
            match(input,RULE_CL,FOLLOW_RULE_CL_in_rule__Event__ClAssignment_0_86601); 
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3254:1: rule__Event__CommentAssignment_1_0 : ( RULE_COMMENT ) ;
    public final void rule__Event__CommentAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3258:1: ( ( RULE_COMMENT ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3259:1: ( RULE_COMMENT )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3259:1: ( RULE_COMMENT )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3260:1: RULE_COMMENT
            {
             before(grammarAccess.getEventAccess().getCommentCOMMENTTerminalRuleCall_1_0_0()); 
            match(input,RULE_COMMENT,FOLLOW_RULE_COMMENT_in_rule__Event__CommentAssignment_1_06632); 
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3269:1: rule__An__IdNodeAssignment_1 : ( ( rule__An__IdNodeAlternatives_1_0 ) ) ;
    public final void rule__An__IdNodeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3273:1: ( ( ( rule__An__IdNodeAlternatives_1_0 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3274:1: ( ( rule__An__IdNodeAlternatives_1_0 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3274:1: ( ( rule__An__IdNodeAlternatives_1_0 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3275:1: ( rule__An__IdNodeAlternatives_1_0 )
            {
             before(grammarAccess.getAnAccess().getIdNodeAlternatives_1_0()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3276:1: ( rule__An__IdNodeAlternatives_1_0 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3276:2: rule__An__IdNodeAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__An__IdNodeAlternatives_1_0_in_rule__An__IdNodeAssignment_16663);
            rule__An__IdNodeAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAnAccess().getIdNodeAlternatives_1_0()); 

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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3285:1: rule__An__AttributesAssignment_2 : ( ruleAttributes ) ;
    public final void rule__An__AttributesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3289:1: ( ( ruleAttributes ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3290:1: ( ruleAttributes )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3290:1: ( ruleAttributes )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3291:1: ruleAttributes
            {
             before(grammarAccess.getAnAccess().getAttributesAttributesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAttributes_in_rule__An__AttributesAssignment_26696);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3300:1: rule__Cn__IdNodeAssignment_1 : ( ( rule__Cn__IdNodeAlternatives_1_0 ) ) ;
    public final void rule__Cn__IdNodeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3304:1: ( ( ( rule__Cn__IdNodeAlternatives_1_0 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3305:1: ( ( rule__Cn__IdNodeAlternatives_1_0 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3305:1: ( ( rule__Cn__IdNodeAlternatives_1_0 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3306:1: ( rule__Cn__IdNodeAlternatives_1_0 )
            {
             before(grammarAccess.getCnAccess().getIdNodeAlternatives_1_0()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3307:1: ( rule__Cn__IdNodeAlternatives_1_0 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3307:2: rule__Cn__IdNodeAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__Cn__IdNodeAlternatives_1_0_in_rule__Cn__IdNodeAssignment_16727);
            rule__Cn__IdNodeAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getCnAccess().getIdNodeAlternatives_1_0()); 

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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3316:1: rule__Cn__AttributesAssignment_2 : ( ruleAttributes ) ;
    public final void rule__Cn__AttributesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3320:1: ( ( ruleAttributes ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3321:1: ( ruleAttributes )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3321:1: ( ruleAttributes )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3322:1: ruleAttributes
            {
             before(grammarAccess.getCnAccess().getAttributesAttributesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAttributes_in_rule__Cn__AttributesAssignment_26760);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3331:1: rule__Dn__IdNodeAssignment_1 : ( ( rule__Dn__IdNodeAlternatives_1_0 ) ) ;
    public final void rule__Dn__IdNodeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3335:1: ( ( ( rule__Dn__IdNodeAlternatives_1_0 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3336:1: ( ( rule__Dn__IdNodeAlternatives_1_0 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3336:1: ( ( rule__Dn__IdNodeAlternatives_1_0 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3337:1: ( rule__Dn__IdNodeAlternatives_1_0 )
            {
             before(grammarAccess.getDnAccess().getIdNodeAlternatives_1_0()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3338:1: ( rule__Dn__IdNodeAlternatives_1_0 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3338:2: rule__Dn__IdNodeAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__Dn__IdNodeAlternatives_1_0_in_rule__Dn__IdNodeAssignment_16791);
            rule__Dn__IdNodeAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getDnAccess().getIdNodeAlternatives_1_0()); 

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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3347:1: rule__Ae__IdEdgeAssignment_1 : ( ( rule__Ae__IdEdgeAlternatives_1_0 ) ) ;
    public final void rule__Ae__IdEdgeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3351:1: ( ( ( rule__Ae__IdEdgeAlternatives_1_0 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3352:1: ( ( rule__Ae__IdEdgeAlternatives_1_0 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3352:1: ( ( rule__Ae__IdEdgeAlternatives_1_0 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3353:1: ( rule__Ae__IdEdgeAlternatives_1_0 )
            {
             before(grammarAccess.getAeAccess().getIdEdgeAlternatives_1_0()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3354:1: ( rule__Ae__IdEdgeAlternatives_1_0 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3354:2: rule__Ae__IdEdgeAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__Ae__IdEdgeAlternatives_1_0_in_rule__Ae__IdEdgeAssignment_16824);
            rule__Ae__IdEdgeAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAeAccess().getIdEdgeAlternatives_1_0()); 

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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3363:1: rule__Ae__IdNode1Assignment_2 : ( ( rule__Ae__IdNode1Alternatives_2_0 ) ) ;
    public final void rule__Ae__IdNode1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3367:1: ( ( ( rule__Ae__IdNode1Alternatives_2_0 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3368:1: ( ( rule__Ae__IdNode1Alternatives_2_0 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3368:1: ( ( rule__Ae__IdNode1Alternatives_2_0 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3369:1: ( rule__Ae__IdNode1Alternatives_2_0 )
            {
             before(grammarAccess.getAeAccess().getIdNode1Alternatives_2_0()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3370:1: ( rule__Ae__IdNode1Alternatives_2_0 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3370:2: rule__Ae__IdNode1Alternatives_2_0
            {
            pushFollow(FOLLOW_rule__Ae__IdNode1Alternatives_2_0_in_rule__Ae__IdNode1Assignment_26857);
            rule__Ae__IdNode1Alternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getAeAccess().getIdNode1Alternatives_2_0()); 

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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3379:1: rule__Ae__DirectionAssignment_3 : ( RULE_DIRECTION ) ;
    public final void rule__Ae__DirectionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3383:1: ( ( RULE_DIRECTION ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3384:1: ( RULE_DIRECTION )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3384:1: ( RULE_DIRECTION )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3385:1: RULE_DIRECTION
            {
             before(grammarAccess.getAeAccess().getDirectionDIRECTIONTerminalRuleCall_3_0()); 
            match(input,RULE_DIRECTION,FOLLOW_RULE_DIRECTION_in_rule__Ae__DirectionAssignment_36890); 
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3394:1: rule__Ae__IdNode2Assignment_4 : ( ( rule__Ae__IdNode2Alternatives_4_0 ) ) ;
    public final void rule__Ae__IdNode2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3398:1: ( ( ( rule__Ae__IdNode2Alternatives_4_0 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3399:1: ( ( rule__Ae__IdNode2Alternatives_4_0 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3399:1: ( ( rule__Ae__IdNode2Alternatives_4_0 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3400:1: ( rule__Ae__IdNode2Alternatives_4_0 )
            {
             before(grammarAccess.getAeAccess().getIdNode2Alternatives_4_0()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3401:1: ( rule__Ae__IdNode2Alternatives_4_0 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3401:2: rule__Ae__IdNode2Alternatives_4_0
            {
            pushFollow(FOLLOW_rule__Ae__IdNode2Alternatives_4_0_in_rule__Ae__IdNode2Assignment_46921);
            rule__Ae__IdNode2Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getAeAccess().getIdNode2Alternatives_4_0()); 

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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3410:1: rule__Ae__AttributesAssignment_5 : ( ruleAttributes ) ;
    public final void rule__Ae__AttributesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3414:1: ( ( ruleAttributes ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3415:1: ( ruleAttributes )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3415:1: ( ruleAttributes )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3416:1: ruleAttributes
            {
             before(grammarAccess.getAeAccess().getAttributesAttributesParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleAttributes_in_rule__Ae__AttributesAssignment_56954);
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


    // $ANTLR start "rule__Ce__IdNodeAssignment_1"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3425:1: rule__Ce__IdNodeAssignment_1 : ( ( rule__Ce__IdNodeAlternatives_1_0 ) ) ;
    public final void rule__Ce__IdNodeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3429:1: ( ( ( rule__Ce__IdNodeAlternatives_1_0 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3430:1: ( ( rule__Ce__IdNodeAlternatives_1_0 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3430:1: ( ( rule__Ce__IdNodeAlternatives_1_0 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3431:1: ( rule__Ce__IdNodeAlternatives_1_0 )
            {
             before(grammarAccess.getCeAccess().getIdNodeAlternatives_1_0()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3432:1: ( rule__Ce__IdNodeAlternatives_1_0 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3432:2: rule__Ce__IdNodeAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__Ce__IdNodeAlternatives_1_0_in_rule__Ce__IdNodeAssignment_16985);
            rule__Ce__IdNodeAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getCeAccess().getIdNodeAlternatives_1_0()); 

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
    // $ANTLR end "rule__Ce__IdNodeAssignment_1"


    // $ANTLR start "rule__Ce__AttributesAssignment_2"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3441:1: rule__Ce__AttributesAssignment_2 : ( ruleAttributes ) ;
    public final void rule__Ce__AttributesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3445:1: ( ( ruleAttributes ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3446:1: ( ruleAttributes )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3446:1: ( ruleAttributes )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3447:1: ruleAttributes
            {
             before(grammarAccess.getCeAccess().getAttributesAttributesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAttributes_in_rule__Ce__AttributesAssignment_27018);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3456:1: rule__De__IdEdgeAssignment_1 : ( ( rule__De__IdEdgeAlternatives_1_0 ) ) ;
    public final void rule__De__IdEdgeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3460:1: ( ( ( rule__De__IdEdgeAlternatives_1_0 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3461:1: ( ( rule__De__IdEdgeAlternatives_1_0 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3461:1: ( ( rule__De__IdEdgeAlternatives_1_0 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3462:1: ( rule__De__IdEdgeAlternatives_1_0 )
            {
             before(grammarAccess.getDeAccess().getIdEdgeAlternatives_1_0()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3463:1: ( rule__De__IdEdgeAlternatives_1_0 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3463:2: rule__De__IdEdgeAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__De__IdEdgeAlternatives_1_0_in_rule__De__IdEdgeAssignment_17049);
            rule__De__IdEdgeAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getDeAccess().getIdEdgeAlternatives_1_0()); 

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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3472:1: rule__Cg__AttributesAssignment_1 : ( ruleAttributes ) ;
    public final void rule__Cg__AttributesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3476:1: ( ( ruleAttributes ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3477:1: ( ruleAttributes )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3477:1: ( ruleAttributes )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3478:1: ruleAttributes
            {
             before(grammarAccess.getCgAccess().getAttributesAttributesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAttributes_in_rule__Cg__AttributesAssignment_17082);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3487:1: rule__St__RealAssignment_1 : ( ruleReal ) ;
    public final void rule__St__RealAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3491:1: ( ( ruleReal ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3492:1: ( ruleReal )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3492:1: ( ruleReal )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3493:1: ruleReal
            {
             before(grammarAccess.getStAccess().getRealRealParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleReal_in_rule__St__RealAssignment_17113);
            ruleReal();

            state._fsp--;

             after(grammarAccess.getStAccess().getRealRealParserRuleCall_1_0()); 

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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3502:1: rule__Attributes__AttributeAssignment_1 : ( ruleAttribute ) ;
    public final void rule__Attributes__AttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3506:1: ( ( ruleAttribute ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3507:1: ( ruleAttribute )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3507:1: ( ruleAttribute )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3508:1: ruleAttribute
            {
             before(grammarAccess.getAttributesAccess().getAttributeAttributeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__Attributes__AttributeAssignment_17144);
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


    // $ANTLR start "rule__Attribute__IdAttributeAssignment_1"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3517:1: rule__Attribute__IdAttributeAssignment_1 : ( ( rule__Attribute__IdAttributeAlternatives_1_0 ) ) ;
    public final void rule__Attribute__IdAttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3521:1: ( ( ( rule__Attribute__IdAttributeAlternatives_1_0 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3522:1: ( ( rule__Attribute__IdAttributeAlternatives_1_0 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3522:1: ( ( rule__Attribute__IdAttributeAlternatives_1_0 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3523:1: ( rule__Attribute__IdAttributeAlternatives_1_0 )
            {
             before(grammarAccess.getAttributeAccess().getIdAttributeAlternatives_1_0()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3524:1: ( rule__Attribute__IdAttributeAlternatives_1_0 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3524:2: rule__Attribute__IdAttributeAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__Attribute__IdAttributeAlternatives_1_0_in_rule__Attribute__IdAttributeAssignment_17175);
            rule__Attribute__IdAttributeAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getIdAttributeAlternatives_1_0()); 

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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3533:1: rule__Attribute__AssignAssignment_2_0 : ( RULE_ASSIGN ) ;
    public final void rule__Attribute__AssignAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3537:1: ( ( RULE_ASSIGN ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3538:1: ( RULE_ASSIGN )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3538:1: ( RULE_ASSIGN )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3539:1: RULE_ASSIGN
            {
             before(grammarAccess.getAttributeAccess().getAssignASSIGNTerminalRuleCall_2_0_0()); 
            match(input,RULE_ASSIGN,FOLLOW_RULE_ASSIGN_in_rule__Attribute__AssignAssignment_2_07208); 
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3548:1: rule__Attribute__ValueAssignment_2_1 : ( ruleValue ) ;
    public final void rule__Attribute__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3552:1: ( ( ruleValue ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3553:1: ( ruleValue )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3553:1: ( ruleValue )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3554:1: ruleValue
            {
             before(grammarAccess.getAttributeAccess().getValueValueParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Attribute__ValueAssignment_2_17239);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3563:1: rule__Attribute__OtherValuesAssignment_2_2_1 : ( ruleValue ) ;
    public final void rule__Attribute__OtherValuesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3567:1: ( ( ruleValue ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3568:1: ( ruleValue )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3568:1: ( ruleValue )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3569:1: ruleValue
            {
             before(grammarAccess.getAttributeAccess().getOtherValuesValueParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Attribute__OtherValuesAssignment_2_2_17270);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3578:1: rule__Value__StringAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Value__StringAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3582:1: ( ( RULE_STRING ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3583:1: ( RULE_STRING )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3583:1: ( RULE_STRING )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3584:1: RULE_STRING
            {
             before(grammarAccess.getValueAccess().getStringSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Value__StringAssignment_07301); 
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3593:1: rule__Value__RealAssignment_1 : ( ruleReal ) ;
    public final void rule__Value__RealAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3597:1: ( ( ruleReal ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3598:1: ( ruleReal )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3598:1: ( ruleReal )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3599:1: ruleReal
            {
             before(grammarAccess.getValueAccess().getRealRealParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleReal_in_rule__Value__RealAssignment_17332);
            ruleReal();

            state._fsp--;

             after(grammarAccess.getValueAccess().getRealRealParserRuleCall_1_0()); 

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


    // $ANTLR start "rule__Value__ArrayAssignment_2"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3608:1: rule__Value__ArrayAssignment_2 : ( ruleArray ) ;
    public final void rule__Value__ArrayAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3612:1: ( ( ruleArray ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3613:1: ( ruleArray )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3613:1: ( ruleArray )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3614:1: ruleArray
            {
             before(grammarAccess.getValueAccess().getArrayArrayParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleArray_in_rule__Value__ArrayAssignment_27363);
            ruleArray();

            state._fsp--;

             after(grammarAccess.getValueAccess().getArrayArrayParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Value__ArrayAssignment_2"


    // $ANTLR start "rule__Value__MapAssignment_3"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3623:1: rule__Value__MapAssignment_3 : ( ruleMap ) ;
    public final void rule__Value__MapAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3627:1: ( ( ruleMap ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3628:1: ( ruleMap )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3628:1: ( ruleMap )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3629:1: ruleMap
            {
             before(grammarAccess.getValueAccess().getMapMapParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleMap_in_rule__Value__MapAssignment_37394);
            ruleMap();

            state._fsp--;

             after(grammarAccess.getValueAccess().getMapMapParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Value__MapAssignment_3"


    // $ANTLR start "rule__Array__ValueAssignment_2_0"
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3638:1: rule__Array__ValueAssignment_2_0 : ( ruleValue ) ;
    public final void rule__Array__ValueAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3642:1: ( ( ruleValue ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3643:1: ( ruleValue )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3643:1: ( ruleValue )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3644:1: ruleValue
            {
             before(grammarAccess.getArrayAccess().getValueValueParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Array__ValueAssignment_2_07425);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3653:1: rule__Array__OtherValuesAssignment_2_1_1 : ( ruleValue ) ;
    public final void rule__Array__OtherValuesAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3657:1: ( ( ruleValue ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3658:1: ( ruleValue )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3658:1: ( ruleValue )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3659:1: ruleValue
            {
             before(grammarAccess.getArrayAccess().getOtherValuesValueParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Array__OtherValuesAssignment_2_1_17456);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3668:1: rule__Map__MappingAssignment_1 : ( ruleMapping ) ;
    public final void rule__Map__MappingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3672:1: ( ( ruleMapping ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3673:1: ( ruleMapping )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3673:1: ( ruleMapping )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3674:1: ruleMapping
            {
             before(grammarAccess.getMapAccess().getMappingMappingParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMapping_in_rule__Map__MappingAssignment_17487);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3683:1: rule__Map__OtherMappingAssignment_2_1 : ( ruleMapping ) ;
    public final void rule__Map__OtherMappingAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3687:1: ( ( ruleMapping ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3688:1: ( ruleMapping )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3688:1: ( ruleMapping )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3689:1: ruleMapping
            {
             before(grammarAccess.getMapAccess().getOtherMappingMappingParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleMapping_in_rule__Map__OtherMappingAssignment_2_17518);
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3698:1: rule__Mapping__IdAssignment_0 : ( ( rule__Mapping__IdAlternatives_0_0 ) ) ;
    public final void rule__Mapping__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3702:1: ( ( ( rule__Mapping__IdAlternatives_0_0 ) ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3703:1: ( ( rule__Mapping__IdAlternatives_0_0 ) )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3703:1: ( ( rule__Mapping__IdAlternatives_0_0 ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3704:1: ( rule__Mapping__IdAlternatives_0_0 )
            {
             before(grammarAccess.getMappingAccess().getIdAlternatives_0_0()); 
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3705:1: ( rule__Mapping__IdAlternatives_0_0 )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3705:2: rule__Mapping__IdAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__Mapping__IdAlternatives_0_0_in_rule__Mapping__IdAssignment_07549);
            rule__Mapping__IdAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getIdAlternatives_0_0()); 

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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3714:1: rule__Mapping__AssignAssignment_1 : ( RULE_ASSIGN ) ;
    public final void rule__Mapping__AssignAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3718:1: ( ( RULE_ASSIGN ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3719:1: ( RULE_ASSIGN )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3719:1: ( RULE_ASSIGN )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3720:1: RULE_ASSIGN
            {
             before(grammarAccess.getMappingAccess().getAssignASSIGNTerminalRuleCall_1_0()); 
            match(input,RULE_ASSIGN,FOLLOW_RULE_ASSIGN_in_rule__Mapping__AssignAssignment_17582); 
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
    // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3729:1: rule__Mapping__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__Mapping__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3733:1: ( ( ruleValue ) )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3734:1: ( ruleValue )
            {
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3734:1: ( ruleValue )
            // ../org.graphstream.DGSPlugin.ui/src-gen/org/graphstream/ui/contentassist/antlr/internal/InternalDGS.g:3735:1: ruleValue
            {
             before(grammarAccess.getMappingAccess().getValueValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleValue_in_rule__Mapping__ValueAssignment_27613);
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
    public static final BitSet FOLLOW_ruleReal_in_entryRuleReal1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReal1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__0_in_ruleReal1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dgs__EventAssignment_1_0_in_rule__Dgs__Alternatives_11150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dgs__CommentAssignment_1_1_in_rule__Dgs__Alternatives_11168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EOL_in_rule__Dgs__Alternatives_11186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Header__NameAlternatives_2_01218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Header__NameAlternatives_2_01235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__AnAssignment_0_0_in_rule__Event__Alternatives_01267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__CnAssignment_0_1_in_rule__Event__Alternatives_01285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__DnAssignment_0_2_in_rule__Event__Alternatives_01303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__AeAssignment_0_3_in_rule__Event__Alternatives_01321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__CeAssignment_0_4_in_rule__Event__Alternatives_01339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__DeAssignment_0_5_in_rule__Event__Alternatives_01357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__CgAssignment_0_6_in_rule__Event__Alternatives_01375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__StAssignment_0_7_in_rule__Event__Alternatives_01393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__ClAssignment_0_8_in_rule__Event__Alternatives_01411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__CommentAssignment_1_0_in_rule__Event__Alternatives_11444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EOL_in_rule__Event__Alternatives_11462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__An__IdNodeAlternatives_1_01494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__An__IdNodeAlternatives_1_01511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Cn__IdNodeAlternatives_1_01543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Cn__IdNodeAlternatives_1_01560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Dn__IdNodeAlternatives_1_01592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Dn__IdNodeAlternatives_1_01609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Ae__IdEdgeAlternatives_1_01641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Ae__IdEdgeAlternatives_1_01658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Ae__IdNode1Alternatives_2_01690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Ae__IdNode1Alternatives_2_01707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Ae__IdNode2Alternatives_4_01739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Ae__IdNode2Alternatives_4_01756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Ce__IdNodeAlternatives_1_01788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Ce__IdNodeAlternatives_1_01805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__De__IdEdgeAlternatives_1_01837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__De__IdEdgeAlternatives_1_01854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Attribute__Alternatives_01887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Attribute__Alternatives_01907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__IdAttributeAlternatives_1_01941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Attribute__IdAttributeAlternatives_1_01958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__StringAssignment_0_in_rule__Value__Alternatives1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__RealAssignment_1_in_rule__Value__Alternatives2008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__ArrayAssignment_2_in_rule__Value__Alternatives2026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__MapAssignment_3_in_rule__Value__Alternatives2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Mapping__IdAlternatives_0_02077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Mapping__IdAlternatives_0_02094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dgs__Group__0__Impl_in_rule__Dgs__Group__02124 = new BitSet(new long[]{0x0000000000FF0510L});
    public static final BitSet FOLLOW_rule__Dgs__Group__1_in_rule__Dgs__Group__02127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dgs__HeaderAssignment_0_in_rule__Dgs__Group__0__Impl2154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dgs__Group__1__Impl_in_rule__Dgs__Group__12184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dgs__Alternatives_1_in_rule__Dgs__Group__1__Impl2211 = new BitSet(new long[]{0x0000000000FF0512L});
    public static final BitSet FOLLOW_rule__Header__Group__0__Impl_in_rule__Header__Group__02246 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Header__Group__1_in_rule__Header__Group__02249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__MagicAssignment_0_in_rule__Header__Group__0__Impl2276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group__1__Impl_in_rule__Header__Group__12306 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__Header__Group__2_in_rule__Header__Group__12309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EOL_in_rule__Header__Group__1__Impl2336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group__2__Impl_in_rule__Header__Group__22365 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Header__Group__3_in_rule__Header__Group__22368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__NameAssignment_2_in_rule__Header__Group__2__Impl2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group__3__Impl_in_rule__Header__Group__32425 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Header__Group__4_in_rule__Header__Group__32428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__NumberOfStepsAssignment_3_in_rule__Header__Group__3__Impl2455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group__4__Impl_in_rule__Header__Group__42485 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Header__Group__5_in_rule__Header__Group__42488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__NumberOfEventsAssignment_4_in_rule__Header__Group__4__Impl2515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__Group__5__Impl_in_rule__Header__Group__52545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EOL_in_rule__Header__Group__5__Impl2572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__02613 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_rule__Event__Group__1_in_rule__Event__Group__02616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Alternatives_0_in_rule__Event__Group__0__Impl2643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__12673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Alternatives_1_in_rule__Event__Group__1__Impl2700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__An__Group__0__Impl_in_rule__An__Group__02734 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__An__Group__1_in_rule__An__Group__02737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__An__Group__0__Impl2765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__An__Group__1__Impl_in_rule__An__Group__12796 = new BitSet(new long[]{0x000000000000C060L});
    public static final BitSet FOLLOW_rule__An__Group__2_in_rule__An__Group__12799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__An__IdNodeAssignment_1_in_rule__An__Group__1__Impl2826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__An__Group__2__Impl_in_rule__An__Group__22856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__An__AttributesAssignment_2_in_rule__An__Group__2__Impl2883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cn__Group__0__Impl_in_rule__Cn__Group__02919 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__Cn__Group__1_in_rule__Cn__Group__02922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Cn__Group__0__Impl2950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cn__Group__1__Impl_in_rule__Cn__Group__12981 = new BitSet(new long[]{0x000000000000C060L});
    public static final BitSet FOLLOW_rule__Cn__Group__2_in_rule__Cn__Group__12984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cn__IdNodeAssignment_1_in_rule__Cn__Group__1__Impl3011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cn__Group__2__Impl_in_rule__Cn__Group__23041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cn__AttributesAssignment_2_in_rule__Cn__Group__2__Impl3068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dn__Group__0__Impl_in_rule__Dn__Group__03104 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__Dn__Group__1_in_rule__Dn__Group__03107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Dn__Group__0__Impl3135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dn__Group__1__Impl_in_rule__Dn__Group__13166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dn__IdNodeAssignment_1_in_rule__Dn__Group__1__Impl3193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ae__Group__0__Impl_in_rule__Ae__Group__03227 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__Ae__Group__1_in_rule__Ae__Group__03230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Ae__Group__0__Impl3258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ae__Group__1__Impl_in_rule__Ae__Group__13289 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__Ae__Group__2_in_rule__Ae__Group__13292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ae__IdEdgeAssignment_1_in_rule__Ae__Group__1__Impl3319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ae__Group__2__Impl_in_rule__Ae__Group__23349 = new BitSet(new long[]{0x0000000000000860L});
    public static final BitSet FOLLOW_rule__Ae__Group__3_in_rule__Ae__Group__23352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ae__IdNode1Assignment_2_in_rule__Ae__Group__2__Impl3379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ae__Group__3__Impl_in_rule__Ae__Group__33409 = new BitSet(new long[]{0x0000000000000860L});
    public static final BitSet FOLLOW_rule__Ae__Group__4_in_rule__Ae__Group__33412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ae__DirectionAssignment_3_in_rule__Ae__Group__3__Impl3439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ae__Group__4__Impl_in_rule__Ae__Group__43470 = new BitSet(new long[]{0x000000000000C060L});
    public static final BitSet FOLLOW_rule__Ae__Group__5_in_rule__Ae__Group__43473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ae__IdNode2Assignment_4_in_rule__Ae__Group__4__Impl3500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ae__Group__5__Impl_in_rule__Ae__Group__53530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ae__AttributesAssignment_5_in_rule__Ae__Group__5__Impl3557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ce__Group__0__Impl_in_rule__Ce__Group__03599 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__Ce__Group__1_in_rule__Ce__Group__03602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Ce__Group__0__Impl3630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ce__Group__1__Impl_in_rule__Ce__Group__13661 = new BitSet(new long[]{0x000000000000C060L});
    public static final BitSet FOLLOW_rule__Ce__Group__2_in_rule__Ce__Group__13664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ce__IdNodeAssignment_1_in_rule__Ce__Group__1__Impl3691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ce__Group__2__Impl_in_rule__Ce__Group__23721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ce__AttributesAssignment_2_in_rule__Ce__Group__2__Impl3748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__De__Group__0__Impl_in_rule__De__Group__03784 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__De__Group__1_in_rule__De__Group__03787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__De__Group__0__Impl3815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__De__Group__1__Impl_in_rule__De__Group__13846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__De__IdEdgeAssignment_1_in_rule__De__Group__1__Impl3873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cg__Group__0__Impl_in_rule__Cg__Group__03907 = new BitSet(new long[]{0x000000000000C060L});
    public static final BitSet FOLLOW_rule__Cg__Group__1_in_rule__Cg__Group__03910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Cg__Group__0__Impl3938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cg__Group__1__Impl_in_rule__Cg__Group__13969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cg__AttributesAssignment_1_in_rule__Cg__Group__1__Impl3996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__St__Group__0__Impl_in_rule__St__Group__04030 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__St__Group__1_in_rule__St__Group__04033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__St__Group__0__Impl4061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__St__Group__1__Impl_in_rule__St__Group__14092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__St__RealAssignment_1_in_rule__St__Group__1__Impl4119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attributes__Group__0__Impl_in_rule__Attributes__Group__04153 = new BitSet(new long[]{0x000000000000C060L});
    public static final BitSet FOLLOW_rule__Attributes__Group__1_in_rule__Attributes__Group__04156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attributes__Group__1__Impl_in_rule__Attributes__Group__14214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attributes__AttributeAssignment_1_in_rule__Attributes__Group__1__Impl4241 = new BitSet(new long[]{0x000000000000C062L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__04276 = new BitSet(new long[]{0x000000000000C060L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__04279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Alternatives_0_in_rule__Attribute__Group__0__Impl4306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__14337 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__14340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__IdAttributeAssignment_1_in_rule__Attribute__Group__1__Impl4367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__24397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2__0_in_rule__Attribute__Group__2__Impl4424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2__0__Impl_in_rule__Attribute__Group_2__04461 = new BitSet(new long[]{0x000000000A0000C0L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2__1_in_rule__Attribute__Group_2__04464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__AssignAssignment_2_0_in_rule__Attribute__Group_2__0__Impl4491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2__1__Impl_in_rule__Attribute__Group_2__14521 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2__2_in_rule__Attribute__Group_2__14524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ValueAssignment_2_1_in_rule__Attribute__Group_2__1__Impl4551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2__2__Impl_in_rule__Attribute__Group_2__24581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2_2__0_in_rule__Attribute__Group_2__2__Impl4608 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2_2__0__Impl_in_rule__Attribute__Group_2_2__04645 = new BitSet(new long[]{0x000000000A0000C0L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2_2__1_in_rule__Attribute__Group_2_2__04648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Attribute__Group_2_2__0__Impl4676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2_2__1__Impl_in_rule__Attribute__Group_2_2__14707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__OtherValuesAssignment_2_2_1_in_rule__Attribute__Group_2_2__1__Impl4734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__0__Impl_in_rule__Array__Group__04768 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Array__Group__1_in_rule__Array__Group__04771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__1__Impl_in_rule__Array__Group__14829 = new BitSet(new long[]{0x000000000E0000C0L});
    public static final BitSet FOLLOW_rule__Array__Group__2_in_rule__Array__Group__14832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Array__Group__1__Impl4860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__2__Impl_in_rule__Array__Group__24891 = new BitSet(new long[]{0x000000000E0000C0L});
    public static final BitSet FOLLOW_rule__Array__Group__3_in_rule__Array__Group__24894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group_2__0_in_rule__Array__Group__2__Impl4921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__3__Impl_in_rule__Array__Group__34952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Array__Group__3__Impl4980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group_2__0__Impl_in_rule__Array__Group_2__05019 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Array__Group_2__1_in_rule__Array__Group_2__05022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__ValueAssignment_2_0_in_rule__Array__Group_2__0__Impl5049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group_2__1__Impl_in_rule__Array__Group_2__15079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group_2_1__0_in_rule__Array__Group_2__1__Impl5106 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Array__Group_2_1__0__Impl_in_rule__Array__Group_2_1__05141 = new BitSet(new long[]{0x000000000A0000C0L});
    public static final BitSet FOLLOW_rule__Array__Group_2_1__1_in_rule__Array__Group_2_1__05144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Array__Group_2_1__0__Impl5172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group_2_1__1__Impl_in_rule__Array__Group_2_1__15203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__OtherValuesAssignment_2_1_1_in_rule__Array__Group_2_1__1__Impl5230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Map__Group__0__Impl_in_rule__Map__Group__05264 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__Map__Group__1_in_rule__Map__Group__05267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Map__Group__0__Impl5295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Map__Group__1__Impl_in_rule__Map__Group__15326 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_rule__Map__Group__2_in_rule__Map__Group__15329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Map__MappingAssignment_1_in_rule__Map__Group__1__Impl5356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Map__Group__2__Impl_in_rule__Map__Group__25386 = new BitSet(new long[]{0x0000000011000000L});
    public static final BitSet FOLLOW_rule__Map__Group__3_in_rule__Map__Group__25389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Map__Group_2__0_in_rule__Map__Group__2__Impl5416 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Map__Group__3__Impl_in_rule__Map__Group__35447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Map__Group__3__Impl5475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Map__Group_2__0__Impl_in_rule__Map__Group_2__05514 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_rule__Map__Group_2__1_in_rule__Map__Group_2__05517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Map__Group_2__0__Impl5545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Map__Group_2__1__Impl_in_rule__Map__Group_2__15576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Map__OtherMappingAssignment_2_1_in_rule__Map__Group_2__1__Impl5603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__0__Impl_in_rule__Mapping__Group__05637 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Mapping__Group__1_in_rule__Mapping__Group__05640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__IdAssignment_0_in_rule__Mapping__Group__0__Impl5667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__1__Impl_in_rule__Mapping__Group__15697 = new BitSet(new long[]{0x000000000A0000C0L});
    public static final BitSet FOLLOW_rule__Mapping__Group__2_in_rule__Mapping__Group__15700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__AssignAssignment_1_in_rule__Mapping__Group__1__Impl5727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__2__Impl_in_rule__Mapping__Group__25757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__ValueAssignment_2_in_rule__Mapping__Group__2__Impl5784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__0__Impl_in_rule__Real__Group__05820 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Real__Group__1_in_rule__Real__Group__05823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Real__Group__0__Impl5850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__1__Impl_in_rule__Real__Group__15879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group_1__0_in_rule__Real__Group__1__Impl5906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group_1__0__Impl_in_rule__Real__Group_1__05940 = new BitSet(new long[]{0x0000000040000080L});
    public static final BitSet FOLLOW_rule__Real__Group_1__1_in_rule__Real__Group_1__05943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Real__Group_1__0__Impl5971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group_1__1__Impl_in_rule__Real__Group_1__16002 = new BitSet(new long[]{0x0000000040000080L});
    public static final BitSet FOLLOW_rule__Real__Group_1__2_in_rule__Real__Group_1__16005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Real__Group_1__1__Impl6034 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__Real__Group_1__2__Impl_in_rule__Real__Group_1__26067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Real__Group_1__2__Impl6094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeader_in_rule__Dgs__HeaderAssignment_06134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__Dgs__EventAssignment_1_06165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_rule__Dgs__CommentAssignment_1_16196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MAGIC_in_rule__Header__MagicAssignment_06227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Header__NameAlternatives_2_0_in_rule__Header__NameAssignment_26258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Header__NumberOfStepsAssignment_36291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Header__NumberOfEventsAssignment_46322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAn_in_rule__Event__AnAssignment_0_06353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCn_in_rule__Event__CnAssignment_0_16384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDn_in_rule__Event__DnAssignment_0_26415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAe_in_rule__Event__AeAssignment_0_36446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCe_in_rule__Event__CeAssignment_0_46477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDe_in_rule__Event__DeAssignment_0_56508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCg_in_rule__Event__CgAssignment_0_66539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSt_in_rule__Event__StAssignment_0_76570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CL_in_rule__Event__ClAssignment_0_86601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_in_rule__Event__CommentAssignment_1_06632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__An__IdNodeAlternatives_1_0_in_rule__An__IdNodeAssignment_16663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributes_in_rule__An__AttributesAssignment_26696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cn__IdNodeAlternatives_1_0_in_rule__Cn__IdNodeAssignment_16727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributes_in_rule__Cn__AttributesAssignment_26760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dn__IdNodeAlternatives_1_0_in_rule__Dn__IdNodeAssignment_16791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ae__IdEdgeAlternatives_1_0_in_rule__Ae__IdEdgeAssignment_16824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ae__IdNode1Alternatives_2_0_in_rule__Ae__IdNode1Assignment_26857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DIRECTION_in_rule__Ae__DirectionAssignment_36890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ae__IdNode2Alternatives_4_0_in_rule__Ae__IdNode2Assignment_46921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributes_in_rule__Ae__AttributesAssignment_56954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ce__IdNodeAlternatives_1_0_in_rule__Ce__IdNodeAssignment_16985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributes_in_rule__Ce__AttributesAssignment_27018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__De__IdEdgeAlternatives_1_0_in_rule__De__IdEdgeAssignment_17049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributes_in_rule__Cg__AttributesAssignment_17082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReal_in_rule__St__RealAssignment_17113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__Attributes__AttributeAssignment_17144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__IdAttributeAlternatives_1_0_in_rule__Attribute__IdAttributeAssignment_17175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ASSIGN_in_rule__Attribute__AssignAssignment_2_07208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Attribute__ValueAssignment_2_17239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Attribute__OtherValuesAssignment_2_2_17270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Value__StringAssignment_07301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReal_in_rule__Value__RealAssignment_17332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_rule__Value__ArrayAssignment_27363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMap_in_rule__Value__MapAssignment_37394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Array__ValueAssignment_2_07425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Array__OtherValuesAssignment_2_1_17456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_rule__Map__MappingAssignment_17487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_rule__Map__OtherMappingAssignment_2_17518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__IdAlternatives_0_0_in_rule__Mapping__IdAssignment_07549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ASSIGN_in_rule__Mapping__AssignAssignment_17582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Mapping__ValueAssignment_27613 = new BitSet(new long[]{0x0000000000000002L});

}