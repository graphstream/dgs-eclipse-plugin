package org.graphstream.rules;

import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.WordRule;

public class EventRule extends WordRule implements IPredicateRule {
	
	private final IToken fSuccessToken;

	public EventRule(String event, IToken successToken) {
		super(new EventDetector());
		fSuccessToken = successToken;
        addWord(event, fSuccessToken);
	}

	public IToken evaluate(ICharacterScanner scanner, boolean resume) {
		return super.evaluate(scanner);
	}
	
	public IToken getSuccessToken() {
		return fSuccessToken;
	}
}
