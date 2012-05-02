package org.graphstream.rules;

import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;
import org.graphstream.editor.DGSConstants;
import org.graphstream.partitionner.DGSPartitioner;

public class DGSUnknownRule extends DGSRule {

	public DGSUnknownRule() {
		super(Token.UNDEFINED);
	}

	public IToken evaluateLine(ICharacterScanner scanner) {
		
		// Increments line if no rules have matched
		DGSPartitioner.line++;
		
		// *DEBUG MODE* beginning
        if(DGSConstants.DEBUG_MODE) System.out.print("Line redirected to DGSUnknownScanner ...\n\n");
        // *DEBUG MODE* end
        
		return Token.UNDEFINED;
	}
}
