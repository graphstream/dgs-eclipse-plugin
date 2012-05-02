/*
* Copyright 2006 - 2012
* Florian Yger <yf080428@etu.univ-lehavre.fr> 
*
* GraphStream is a library whose purpose is to handle static or dynamic
* graph, create them from scratch, file or any source and display them.
*
* This program is free software distributed under the terms of two licenses, the
* CeCILL-C license that fits European law, and the GNU Lesser General Public
* License. You can use, modify and/ or redistribute the software under the terms
* of the CeCILL-C license as circulated by CEA, CNRS and INRIA at the following
* URL <http://www.cecill.info> or under the terms of the GNU LGPL as published by
* the Free Software Foundation, either version 3 of the License, or (at your
* option) any later version.
*
* This program is distributed in the hope that it will be useful, but WITHOUT ANY
* WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
* PARTICULAR PURPOSE. See the GNU Lesser General Public License for more details.
*
* You should have received a copy of the GNU Lesser General Public License
* along with this program. If not, see <http://www.gnu.org/licenses/>.
*
* The fact that you are presently reading this means that you have had
* knowledge of the CeCILL-C and LGPL licenses and that you accept their terms.
*/

package org.graphstream.rules;

import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;
import org.graphstream.editor.DGSConstants;
import org.graphstream.editor.DGSEditor;
import org.graphstream.partitionner.DGSPartitioner;

/************************************ Begin of Summary ************************************/
/*
	Rule created for this plugin, it returns the line whose number is asked.
	
	Used for line 1 (Magic) and line 2 (Name_Obsolete).
 */
/************************************* End of Summary *************************************/

public class DGSLineRule extends DGSRule {

	/************************************* Attributes *************************************/
	
	/* Stop research once line founded */
	protected int lineNumber;
	
	
	/************************************ Constructors ***********************************/
	
	public DGSLineRule(IToken token, int lineNumber){
		super(token);
		this.lineNumber = lineNumber;
		
		// *DEBUG MODE* beginning
        if(DGSConstants.DEBUG_MODE) System.out.print(this.getClass().getSimpleName() + " detected, line searched : " + lineNumber + "\n" );
        // *DEBUG MODE* end
	}
	
	
	/************************************** Evaluate *************************************/
	
	/* Search asked line and returns success Token (which automatically takes offset and length of the CharacterScanner) */
	public IToken evaluateLine(ICharacterScanner scanner) {
		
		// If we are at the beginning of the asked line
		if(DGSPartitioner.line == lineNumber){
			int c;
			length = 0;
			
			// *DEBUG MODE* beginning
	        if(DGSConstants.DEBUG_MODE) System.out.print("---> " + this.getClass().getSimpleName() + " (line n°" + lineNumber + ") has matched.\n\n");
	        // *DEBUG MODE* end
	        
	        // Read characters until end of line or end of file
			do{
				c = scanner.read();
				
				// *DEBUG MODE* beginning
		        if(DGSConstants.DEBUG_MODE) System.out.print(DGSEditor.displayCharacter(c));
		        // *DEBUG MODE* end
		        
				length++;
			}while((char) c != '\n' && c != ICharacterScanner.EOF);
			
			// Increments line
			DGSPartitioner.line++;
	        
	        // Returns partition
			return TOKEN;
		}
		else{
			
			// *DEBUG MODE* beginning
	        if(DGSConstants.DEBUG_MODE) System.out.print("---> " + this.getClass().getSimpleName() + " (line n°" + lineNumber + ") has found nothing\n\n");
	        // *DEBUG MODE* end
		}
		return Token.UNDEFINED;
	}
}
