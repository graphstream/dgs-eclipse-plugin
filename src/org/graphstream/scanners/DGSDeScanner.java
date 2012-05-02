package org.graphstream.scanners;

import org.graphstream.editor.DGSConstants;
import org.graphstream.words.Attribute;
import org.graphstream.words.Error;
import org.graphstream.words.Event;
import org.graphstream.words.Operator;
import org.graphstream.words.Undefined;
import org.graphstream.words.Value;
import org.graphstream.words.Word;

public class DGSDeScanner extends DGSScanner {
	
	public Word wordType(int wordNumber){
		if(wordNumber == 1) return new Event();
		else if(wordNumber == 2) return new Attribute();
		else if(wordNumber == 3) return new Operator();
		else if(wordNumber == 4) return new Value();
		else if(wordNumber > 4) return new Error();
		else return new Undefined();
	}

	@Override
	public void errorDetection() {
		// TODO Auto-generated method stub
		
	}
}
