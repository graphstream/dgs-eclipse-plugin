package org.graphstream.words;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.graphstream.editor.DGSConstants;

public class Magic extends Word {

	public Magic() {
		super();
		token = new Token(new TextAttribute(
				new Color(Display.getCurrent(), DGSConstants.MAGIC_FOREGROUND),
				new Color(Display.getCurrent(), DGSConstants.MAGIC_BACKGROUND),
				DGSConstants.MAGIC_STYLE));
	}
	
	public String getPattern() {
		return null;
	}

	public String getPatternErrorMessage() {
		return null;
	}
}
