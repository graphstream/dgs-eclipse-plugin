package org.graphstream.words;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.graphstream.editor.DGSConstants;

public class Number extends Word {

	public Number() {
		super();
		token = new Token(new TextAttribute(
				new Color(Display.getCurrent(), DGSConstants.NUMBER_FOREGROUND),
				new Color(Display.getCurrent(), DGSConstants.NUMBER_BACKGROUND),
				DGSConstants.NUMBER_STYLE));
	}
	
	public String getPattern() {
		return DGSConstants.NUMBER_PATTERN;
	}

	public String getPatternErrorMessage() {
		return DGSConstants.NUMBER_ERROR_MESSAGE;
	}
}
