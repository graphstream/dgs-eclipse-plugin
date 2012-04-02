package org.graphstream.rules;

import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;

public class NextWordRule implements IRule {

	private IToken fToken;
	
	public NextWordRule(IToken token){
		super();
		fToken = token;
	}
	
	public IToken evaluate(ICharacterScanner scanner) {
		int c = scanner.read();
		if((char) c != '\n' && c != ICharacterScanner.EOF){
			do{
				//System.out.print((char) c);
				c = scanner.read();
			}while((char) c != '\n' && c != ICharacterScanner.EOF);
			//System.out.println();
			return fToken;
		}
		return Token.UNDEFINED;
	}
}
