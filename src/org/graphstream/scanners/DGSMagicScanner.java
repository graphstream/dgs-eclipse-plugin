package org.graphstream.scanners;

import org.eclipse.core.resources.IMarker;
import org.graphstream.editor.DGSConstants;
import org.graphstream.words.Error;
import org.graphstream.words.Magic;
import org.graphstream.words.Word;

public class DGSMagicScanner extends DGSScanner {
	
	public Word wordType(int wordNumber){
		if(wordNumber == 1) return new Magic();
		else return new Error();
	}

	public void errorDetection() {
		if(words.size() != 1){
			error(DGSConstants.MAGIC_ERROR_MESSAGE, partitionOffset, IMarker.PRIORITY_HIGH);
		}
	}
}
