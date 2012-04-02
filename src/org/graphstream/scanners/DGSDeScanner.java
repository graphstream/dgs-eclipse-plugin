package org.graphstream.scanners;

import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.graphstream.editor.DGSConstants;
import org.graphstream.rules.EventRule;
import org.graphstream.rules.NextWordRule;

public class DGSDeScanner extends RuleBasedScanner {

	public DGSDeScanner() {

		IRule[] rules = new IRule[]{
				new EventRule("de",DGSConstants.EVENT),
				new NextWordRule(DGSConstants.ID)
		};

		setRules(rules);
	}
}
