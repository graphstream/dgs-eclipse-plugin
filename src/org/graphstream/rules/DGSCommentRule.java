package org.graphstream.rules;

import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;
import org.graphstream.editor.DGSConstants;
import org.graphstream.editor.DGSEditor;
import org.graphstream.partitionner.DGSPartitioner;

public class DGSCommentRule extends DGSRule {
	
	/* Begin Sequence */
	private String beginSequence;

	public DGSCommentRule(String beginSequence, IToken token) {
		super(token);
		this.beginSequence = beginSequence;
		
		// *DEBUG MODE* beginning
        if(DGSConstants.DEBUG_MODE) System.out.print(this.getClass().getSimpleName() + " detected, begin with : " + beginSequence + "\n" );
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
		        System.out.print("---> " + this.getClass().getSimpleName() + " has found :  " + beginSequence + "\n\n");
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
				if((char) c == '\n') DGSPartitioner.line++;
					
				// *DEBUG MODE* beginning
			    if(DGSConstants.DEBUG_MODE) System.out.print(DGSEditor.displayCharacter(c));
			    // *DEBUG MODE* end
			   
			}while(c != ICharacterScanner.EOF && c != '\n'); 
		}
		else{
				
			// *DEBUG MODE* beginning
		    if(DGSConstants.DEBUG_MODE) System.out.print("---> " + this.getClass().getSimpleName() + " has found nothing\n\n");
		    // *DEBUG MODE* end
				
			return Token.UNDEFINED;
		}
	        
	    // Returns partition
		return TOKEN;
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
