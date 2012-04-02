package org.graphstream.scanners;

import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.graphstream.editor.DGSConstants;
import org.graphstream.rules.EventRule;
import org.graphstream.rules.NextWordRule;

public class DGSStScanner extends RuleBasedScanner {

	public DGSStScanner() {

		IRule[] rules = new IRule[]{
				new EventRule("st",DGSConstants.EVENT),
				new NextWordRule(DGSConstants.ID)
		};

		setRules(rules);
	}
}
