package org.graphstream.scanners;

import org.graphstream.editor.DGSConstants;
import org.graphstream.words.Attribute;
import org.graphstream.words.Error;
import org.graphstream.words.Event;
import org.graphstream.words.Id;
import org.graphstream.words.Operator;
import org.graphstream.words.Undefined;
import org.graphstream.words.Value;
import org.graphstream.words.Word;

public class DGSAeScanner extends DGSScanner {
	
	public Word wordType(int wordNumber){
		if(wordNumber == 1) return new Event();
		else if(wordNumber == 2) return new Id();
		else if(wordNumber == 3) return new Id();
		else if(wordNumber == 4) return new Id();
		/* Operator */
		else if(wordNumber == 5) return new Attribute();
		else if(wordNumber == 6) return new Operator();
		else if(wordNumber == 7) return new Value();
		else if(wordNumber > getParametersNumberMax()+1) return new Error();
		else return new Undefined();
	}

	public int getParametersNumberMin() {
		return DGSConstants.AE_PARAMATERS_NUMBER_MIN;
	}

	public int getParametersNumberMax() {
		return DGSConstants.AE_PARAMATERS_NUMBER_MAX;
	}
}
