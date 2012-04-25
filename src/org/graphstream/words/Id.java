package org.graphstream.words;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.graphstream.editor.DGSConstants;

public class Id extends Word {
	
	public Id() {
		super();
		token = new Token(new TextAttribute(
				new Color(Display.getCurrent(), DGSConstants.ID_FOREGROUND),
				new Color(Display.getCurrent(), DGSConstants.ID_BACKGROUND),
				DGSConstants.ID_STYLE));
	}
	
	public String getPattern() {
		return DGSConstants.ID_PATTERN;
	}

	public String getPatternErrorMessage() {
		return DGSConstants.ID_ERROR_MESSAGE;
	}
}
