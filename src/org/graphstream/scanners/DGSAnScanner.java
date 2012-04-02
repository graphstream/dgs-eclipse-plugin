package org.graphstream.scanners;

import org.eclipse.core.resources.IMarker;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;
import org.graphstream.editor.DGSConstants;
import org.graphstream.editor.DGSMarker;

public class DGSAnScanner extends DGSScanner {
	
	private int cpt = 0;
	
	public IToken coloring() {
		if (cpt < words.size()){
			tokenOffset = words.get(cpt).getOffset();
			tokenLength = words.get(cpt).getLength();
			System.out.println(cpt+" - "+words.get(cpt).getWord()+" : "+ tokenOffset + " -- " + tokenLength);
			cpt++;
			if(cpt == 1) return DGSConstants.EVENT;
			else if(cpt == 2) return DGSConstants.ID;
			else if(cpt == 3) return DGSConstants.ATTRIBUTE;
			else if(cpt == 5) return DGSConstants.VALEUR;
			else return Token.UNDEFINED;
		}
		else{
			cpt = 0;
			return Token.EOF;
		}
	}

	public void errorDetector() {
		//DGSMarker marker = new DGSMarker(IMarker.PROBLEM,"test",2,IMarker.SEVERITY_ERROR,IMarker.PRIORITY_NORMAL);
		//marker.delete();
	}
}
