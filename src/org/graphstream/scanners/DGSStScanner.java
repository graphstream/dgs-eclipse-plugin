package org.graphstream.scanners;

import org.graphstream.editor.DGSConstants;
import org.graphstream.words.Error;
import org.graphstream.words.Event;
import org.graphstream.words.Number;
import org.graphstream.words.Undefined;
import org.graphstream.words.Word;

public class DGSStScanner extends DGSScanner {
	
	public Word wordType(int wordNumber){
		if(wordNumber == 1) return new Event();
		else if(wordNumber == 2) return new Number();
		else if(wordNumber > getParametersNumberMax()+1) return new Error();
		else return new Undefined();
	}

	public int getParametersNumberMin() {
		return DGSConstants.ST_PARAMATERS_NUMBER_MIN;
	}

	public int getParametersNumberMax() {
		return DGSConstants.ST_PARAMATERS_NUMBER_MAX;
	}
}
