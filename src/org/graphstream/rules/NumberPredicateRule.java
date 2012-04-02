package org.graphstream.rules;

import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.NumberRule;

public class NumberPredicateRule extends NumberRule implements IPredicateRule {
	
	private final IToken fSuccessToken;

	public NumberPredicateRule(IToken successToken) {
		super(successToken);
		fSuccessToken = successToken;
	}
	
	public IToken evaluate(ICharacterScanner scanner, boolean resume) {
		return super.evaluate(scanner);
	}

	public IToken getSuccessToken() {
		return fSuccessToken;
	}
}
