package org.graphstream.words;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.graphstream.editor.DGSConstants;

public class Operator extends Word {

	public Operator() {
		super();
		token = new Token(new TextAttribute(
				new Color(Display.getCurrent(), DGSConstants.OPERATOR_FOREGROUND),
				new Color(Display.getCurrent(), DGSConstants.OPERATOR_BACKGROUND),
				DGSConstants.OPERATOR_STYLE));
	}

	public String getPattern() {
		return null;
	}

	public String getPatternErrorMessage() {
		return null;
	}
}
