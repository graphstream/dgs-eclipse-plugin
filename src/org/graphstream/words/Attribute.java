package org.graphstream.words;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.graphstream.editor.DGSConstants;

public class Attribute extends Word {

	public Attribute() {
		super();
		token = new Token(new TextAttribute(
				new Color(Display.getCurrent(), DGSConstants.ATTRIBUTE_FOREGROUND),
				new Color(Display.getCurrent(), DGSConstants.ATTRIBUTE_BACKGROUND),
				DGSConstants.ATTRIBUTE_STYLE));
	}

	public String getPattern() {
		return DGSConstants.ATTRIBUTE_PATTERN;
	}

	public String getPatternErrorMessage() {
		return DGSConstants.ATTRIBUTE_ERROR_MESSAGE;
	}
}
