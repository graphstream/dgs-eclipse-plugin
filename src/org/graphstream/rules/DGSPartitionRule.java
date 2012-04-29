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

/************************************ Begin of Summary ************************************/
/*
	Rule created for this plugin, it returns a DGS Partition (except Header).
	
	A DGS Partition begin with an event (an, cn, ...) and end with another.
	
	Each line is read by all rules (following the order) before reading next one.
	
	When a rule has matched begin sequence, it reads characters until it founds an end sequence.
	
	If no rules have matched a line, this one is redirected to DGSWunknownScanner.
 */
/************************************* End of Summary *************************************/

public class DGSPartitionRule extends DGSRule {

	/************************************* Attributes *************************************/
	
	/* Id Counter */
	protected static int id = 0;
	
	/* Begin Sequence */
	private String beginSequence;
	
	/* End Sequences */
	private String[] endSequences = {"ae ","an ","ce ","cg ","cl ","cn ","de ","dn ","st ","#"};
	
	
	/************************************ Constructors ***********************************/
	
	public DGSPartitionRule(String beginSequence, IToken token){
		super(token);
		this.beginSequence = beginSequence;
		id++;
		this.idRule = id;
		
		// *DEBUG MODE* beginning
        if(DGSConstants.DEBUG_MODE) System.out.print(this.getClass().getSimpleName() + " n°" + idRule + " detected : begin sequence searched = " + beginSequence + "\n" );
        // *DEBUG MODE* end
	}
	
	
	/************************************** Evaluate *************************************/
	
	/* Search first occurence of "\n" or "End Of File" and returns success Token (which automatically takes offset and length of the CharacterScanner) */
	public IToken evaluateLine(ICharacterScanner scanner) {
	        
		// Re-initialize length by testing findBeginningOfPartition method which returns whitespaces and horizontal tab before begin sequence or -1 if no sequence
		length = findBeginningOfPartition(scanner,beginSequence);
			
		// If we are at the beginning of a partition
		if(length != -1){
				
			// *DEBUG MODE* beginning
		    if(DGSConstants.DEBUG_MODE){
		        System.out.print("---> " + this.getClass().getSimpleName() + " n°" + idRule + " has found :  " + beginSequence + "\n\n");
		        System.out.print(beginSequence);
		    }
		    // *DEBUG MODE* end
		        
		    // Add beginning sequence to partition
		    length += beginSequence.length();
		    for(int i=0;i<length;i++) scanner.read();
		        
		    // Read characters until end of file or end of partition
		    int c;
		    do{
				c = scanner.read();
				length++;
				if((char) c == '\n') line++;
					
				// *DEBUG MODE* beginning
			    if(DGSConstants.DEBUG_MODE) System.out.print(DGSEditor.displayCharacter(c));
			    // *DEBUG MODE* end
			   
			}while(c != ICharacterScanner.EOF && (scanner.getColumn() != 0 || !findEndOfPartition(scanner))); 
		}
		else{
				
			// *DEBUG MODE* beginning
		    if(DGSConstants.DEBUG_MODE) System.out.print("---> " + this.getClass().getSimpleName() + " n°" + idRule + " has found nothing\n\n");
		    // *DEBUG MODE* end
				
			return Token.UNDEFINED;
		}
	        
	    // Returns partition
		return TOKEN;
	}
	
	/* Returns if an end sequence can be found */
	public boolean findEndOfPartition(ICharacterScanner scanner){
		for(String sequence : endSequences){
			if(findBeginningOfPartition(scanner,sequence) != -1) return true;
		}
		return false;
	}
	
	/* Finds if begin sequence can be found, returns beginning of partition offset or -1 */
	public int findBeginningOfPartition(ICharacterScanner scanner, String sequence){
		boolean found = true;
		int charCounter = 0;
		int c;
			
		// While sequence has not been founded
		while(!findSequence(scanner, sequence)){
				
			// Reads next character
			c = scanner.read();
			charCounter++;
				
			// If this character is not a whitespace or an horizontal tab, returns false
			if(c != DGSConstants.HORIZONTAL_TAB && c != DGSConstants.WHITESPACE){
				found = false;
				break;
			}
		}
		
		// Unread
		for(int i=0;i<charCounter;i++) scanner.unread();
		
		// Returns if beginning of partition has been founded
		if(found) return charCounter;
		return -1;
	}
	
	/* Returns if sequence can be found */
	public boolean findSequence(ICharacterScanner scanner, String sequence){
		boolean found = true;
		int charCounter = 0;
		
		// Check each sequence's characters
		for(char c : sequence.toCharArray()){
			if((char) scanner.read() != c) found = false;
			charCounter++;
			if(!found) break;
		}
		
		// Unread
		for(int i=0;i<charCounter;i++) scanner.unread();
		
		// Returns if sequence has been founded
		return found;
	}
}
