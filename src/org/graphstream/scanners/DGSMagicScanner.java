package org.graphstream.scanners;

import org.eclipse.jface.text.rules.EndOfLineRule;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.graphstream.editor.DGSConstants;

public class DGSMagicScanner extends RuleBasedScanner {

	public DGSMagicScanner() {

		IRule[] rules = new IRule[]{
				new SingleLineRule("DG", "S", DGSConstants.ID),
				new EndOfLineRule("0", DGSConstants.NUMBER)
		};
		
		setRules(rules);
	}
}
