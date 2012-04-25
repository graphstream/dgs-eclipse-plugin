package org.graphstream.words;

import org.eclipse.jface.text.rules.Token;

public class Undefined extends Word {
	
	public Undefined() {
		super();
		token = Token.UNDEFINED;
	}

	public String getPattern() {
		return null;
	}

	public String getPatternErrorMessage() {
		return null;
	}
}
