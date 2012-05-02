package org.graphstream.rules;

import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;
import org.graphstream.editor.DGSConstants;
import org.graphstream.partitionner.DGSPartitioner;

public class DGSInitializeRule extends DGSRule {

	public DGSInitializeRule() {
		super(Token.UNDEFINED);
	}

	public IToken evaluateLine(ICharacterScanner scanner) {
		
		// *DEBUG MODE* beginning
	    if(DGSConstants.DEBUG_MODE) System.out.print("\n******* Line n°" + DGSPartitioner.line + " is being analyzed ******* \n\n");
	    // *DEBUG MODE* end
		
		return Token.UNDEFINED;
	}
}
