package org.graphstream.rules;

import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;

public class NextLineRule implements IPredicateRule {

	private IToken fToken;
	private boolean trouve = false;
	
	public NextLineRule(IToken token){
		super();
		fToken = token;
	}
	
	public IToken evaluate(ICharacterScanner scanner, boolean resume) {
		return evaluate(scanner);
	}
	
	public IToken evaluate(ICharacterScanner scanner) {
		if(scanner.getColumn() == 0 && !trouve){
			int c;
			do{
				c = scanner.read();
			}while((char) c != '\n' && c != ICharacterScanner.EOF);
			trouve = true;
			return fToken;
		}
		return Token.UNDEFINED;
	}

	public IToken getSuccessToken() {
		return fToken;
	}
}
