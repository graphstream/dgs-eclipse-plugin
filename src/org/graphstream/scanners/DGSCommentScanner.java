package org.graphstream.scanners;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.EndOfLineRule;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.graphstream.editor.DGSConstants;

public class DGSCommentScanner extends RuleBasedScanner {

	public static final IToken COMMENT = new Token(new TextAttribute(
			new Color(Display.getCurrent(), DGSConstants.COMMENT_FOREGROUND),
			new Color(Display.getCurrent(), DGSConstants.COMMENT_BACKGROUND),
			DGSConstants.COMMENT_STYLE));
	
	public DGSCommentScanner() {

		IRule[] rules = new IRule[]{
				new EndOfLineRule("#", COMMENT)
		};
		
		setRules(rules);
	}
}
