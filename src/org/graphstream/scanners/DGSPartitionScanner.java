package org.graphstream.scanners;

import org.eclipse.jface.text.rules.EndOfLineRule;
import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.RuleBasedPartitionScanner;
import org.eclipse.jface.text.rules.Token;
import org.graphstream.rules.NextLineRule;
import org.graphstream.rules.NonMatchingRule;
public class DGSPartitionScanner extends RuleBasedPartitionScanner {
	
	public final static String DGS_MAGIC = "__dgs_magic";
	public final static String DGS_NAME_OBSOLETE = "__dgs_name_obsolete";
	public final static String DGS_AN = "__dgs_an";
	public final static String DGS_CN = "__dgs_cn";
	public final static String DGS_DN = "__dgs_dn";
	public final static String DGS_AE = "__dgs_ae";
	public final static String DGS_CE = "__dgs_ce";
	public final static String DGS_DE = "__dgs_de";
	public final static String DGS_CG = "__dgs_cg";
	public final static String DGS_ST = "__dgs_st";
	public final static String DGS_CL = "__dgs_cl";
	public final static String DGS_COMMENT = "__dgs_comment";
	
	public DGSPartitionScanner(){

		IToken dgsMagic = new Token(DGS_MAGIC);
		IToken dgsNameObsolete = new Token(DGS_NAME_OBSOLETE);
		IToken dgsAn = new Token(DGS_AN);
		IToken dgsCn = new Token(DGS_CN);
		IToken dgsDn = new Token(DGS_DN);
		IToken dgsAe = new Token(DGS_AE);
		IToken dgsCe = new Token(DGS_CE);
		IToken dgsDe = new Token(DGS_DE);
		IToken dgsCg = new Token(DGS_CG);
		IToken dgsSt = new Token(DGS_ST);
		IToken dgsCl = new Token(DGS_CL);
		IToken dgsComment = new Token(DGS_COMMENT);

		IPredicateRule[] rules = new IPredicateRule[]{
				new NonMatchingRule(),
				new NextLineRule(dgsMagic),
				new NextLineRule(dgsNameObsolete),
				new EndOfLineRule("an ",dgsAn),
				new EndOfLineRule("cn ",dgsCn),
				new EndOfLineRule("dn ",dgsDn),
				new EndOfLineRule("ae ",dgsAe),
				new EndOfLineRule("ce ",dgsCe),
				new EndOfLineRule("de ",dgsDe),
				new EndOfLineRule("cg ",dgsCg),
				new EndOfLineRule("st ",dgsSt),
				new EndOfLineRule("cl ",dgsCl),
				new EndOfLineRule("#", dgsComment)
		};

		setPredicateRules(rules);
	}
}
