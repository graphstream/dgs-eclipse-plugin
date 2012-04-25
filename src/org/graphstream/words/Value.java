package org.graphstream.words;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.graphstream.editor.DGSConstants;

public class Value extends Word {

	public Value() {
		super();
		token = new Token(new TextAttribute(
				new Color(Display.getCurrent(), DGSConstants.VALUE_FOREGROUND),
				new Color(Display.getCurrent(), DGSConstants.VALUE_BACKGROUND),
				DGSConstants.VALUE_STYLE));
	}
	
	public String getPattern() {
		return DGSConstants.VALUE_PATTERN;
	}

	public String getPatternErrorMessage() {
		return DGSConstants.VALUE_ERROR_MESSAGE;
	}
}
