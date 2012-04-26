package org.graphstream.scanners;

import org.graphstream.editor.DGSConstants;
import org.graphstream.words.Error;
import org.graphstream.words.Event;
import org.graphstream.words.Number;
import org.graphstream.words.Undefined;
import org.graphstream.words.Word;

public class DGSNameObsoleteScanner extends DGSScanner {
	
	public Word wordType(int wordNumber){
		if(wordNumber == 1) return new Event();
		else if(wordNumber == 2) return new Number();
		else if(wordNumber == 3) return new Number();
		else if(wordNumber > 3) return new Error();
		else return new Undefined();
	}
}

