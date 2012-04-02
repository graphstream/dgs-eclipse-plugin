package org.graphstream.scanners;

import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.graphstream.editor.DGSConstants;
import org.graphstream.rules.EventRule;
import org.graphstream.rules.NextWordRule;
import org.graphstream.rules.WhiteSpacePredicateRule;

public class DGSCeScanner extends RuleBasedScanner {
	
	public DGSCeScanner() {

		IRule[] rules = new IRule[]{
				new WhiteSpacePredicateRule(DGSConstants.COMMENT),
				new EventRule("ce",DGSConstants.EVENT),
				new NextWordRule(DGSConstants.ID)
		};

		setRules(rules);
	}
}
