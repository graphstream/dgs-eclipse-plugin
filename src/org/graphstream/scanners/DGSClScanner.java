package org.graphstream.scanners;

import org.graphstream.editor.DGSConstants;
import org.graphstream.words.Error;
import org.graphstream.words.Event;
import org.graphstream.words.Undefined;
import org.graphstream.words.Word;

public class DGSClScanner extends DGSScanner {
	
	public Word wordType(int wordNumber){
		if(wordNumber == 1) return new Event();
		else if(wordNumber > getParametersNumberMax()+1) return new Error();
		else return new Undefined();
	}

	public int getParametersNumberMin() {
		return DGSConstants.CL_PARAMATERS_NUMBER_MIN;
	}

	public int getParametersNumberMax() {
		return DGSConstants.CL_PARAMATERS_NUMBER_MAX;
	}
}
