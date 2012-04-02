package org.graphstream.rules;

import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.WhitespaceRule;

public class WhiteSpacePredicateRule extends WhitespaceRule implements IPredicateRule {

	private final IToken fSuccessToken;

	public WhiteSpacePredicateRule(IToken successToken) {
		super(new WhitespaceDetector());
		fSuccessToken = successToken;
	}
	
	public IToken evaluate(ICharacterScanner scanner, boolean resume) {
		return super.evaluate(scanner);
	}

	public IToken getSuccessToken() {
		return fSuccessToken;
	}
}
