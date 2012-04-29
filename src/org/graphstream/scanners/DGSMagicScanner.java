package org.graphstream.scanners;

import org.eclipse.core.resources.IMarker;
import org.eclipse.jface.text.BadLocationException;
import org.graphstream.editor.DGSConstants;
import org.graphstream.markers.DGSMarker;
import org.graphstream.words.Error;
import org.graphstream.words.Magic;
import org.graphstream.words.Word;

public class DGSMagicScanner extends DGSScanner {
	
	public Word wordType(int wordNumber){
		if(wordNumber == 1) return new Magic();
		else{
			if(!parametersErrorFound){
				parametersErrorFound = true;
				try {
					new DGSMarker(IMarker.PROBLEM, DGSConstants.MAGIC_PARAMETERS_ERROR_MESSAGE, document.getLineOfOffset(words.get(wordNumber).getOffset()), IMarker.SEVERITY_ERROR, IMarker.PRIORITY_HIGH);
				} catch (BadLocationException e) {}
			}
			return new Error();
		}
	}
}
