package org.graphstream.scanners;

import org.eclipse.jface.text.rules.EndOfLineRule;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.graphstream.editor.DGSConstants;

public class DGSCommentScanner extends RuleBasedScanner {

	public DGSCommentScanner() {

		IRule[] rules = new IRule[]{
				new EndOfLineRule("#", DGSConstants.COMMENT)
		};
		
		setRules(rules);
	}
}
