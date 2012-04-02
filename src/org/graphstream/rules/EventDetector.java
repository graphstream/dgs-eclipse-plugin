package org.graphstream.rules;

import org.eclipse.jface.text.rules.IWordDetector;

public class EventDetector implements IWordDetector {

	public boolean isWordStart(char c) {
		return Character.isJavaIdentifierStart(c);
	}

	public boolean isWordPart(char c) {
		return Character.isJavaIdentifierPart(c);
	}
}
