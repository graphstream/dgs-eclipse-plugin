package org.graphstream.words;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.graphstream.editor.DGSConstants;

public class Event extends Word {

	public Event() {
		super();
		token = new Token(new TextAttribute(
				new Color(Display.getCurrent(), DGSConstants.EVENT_FOREGROUND),
				new Color(Display.getCurrent(), DGSConstants.EVENT_BACKGROUND),
				DGSConstants.EVENT_STYLE));
	}

	public String getPattern() {
		return null;
	}

	public String getPatternErrorMessage() {
		return null;
	}
}
