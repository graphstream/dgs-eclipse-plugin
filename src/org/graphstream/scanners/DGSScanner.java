package org.graphstream.scanners;

import java.util.Vector;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.ITokenScanner;
import org.eclipse.jface.text.rules.Token;
import org.graphstream.editor.DGSConstants;
import org.graphstream.editor.DGSEditor;
import org.graphstream.markers.DGSMarker;
import org.graphstream.words.Word;

/************************************ Begin of Summary ************************************/
/*
	The superclass of all partition scanners.
	
	All errors have been cleared before, see DGSEditor.java in package editor.
	
	setRange() check the partition and initialize our CharacterScanner's implementation.
	
	wordDetector() : 1) Split the partition following separators in a word collection.
				     2) For each word, calls abstract wordType() which determine word's type.
				     3) If a word is not recognized by scanner -> parameter error.
				     4) wordType() is implemented in subclasses, and creates word's instances.
				     5) Each word instance has a pattern error detector.
				     6) Each word instance has a token (color, style).
				     7) nextToken() loop on words collection and returns token
				     
	Two things to keep in mind : 
		- An error is associated to the document as soon as it's instanced and stored in the input,
		  that's why, wanting to organize them, copy them ... leads to conflicts.
		  The best thing to do is to clear them at the beginning and recompute them on the fly.
		  
		- nextToken is the only function which can affect token, unless you want to recreate the repairer
		and the presentationreconciler, this would be a loss of time.
 */
/************************************* End of Summary *************************************/

public abstract class DGSScanner implements ICharacterScanner, ITokenScanner {
	
	/************************************* Attributes *************************************/
	
	/* ------------- Document ------------- */
	
    /* The document to be scanned */
    protected IDocument document;
    
    /* Document's length */
    protected int documentLength;
    
    /* --------- Current Partition -------- */
    
    /* The offset of the current partition */
    protected int partitionOffset;
    
    /* The length of the current partition */
    protected int partitionLength;
    
    /* The beginning line of the current partition */
    protected int beginningLine;
    
    /* The end line of the current partition */
    protected int endLine;
    
    /* --------- Character Scanner -------- */
    
    /* The current character to be read */
    protected int current;
    
    /* The offset of the next character to be read */
    protected int nextOffset;
    
    /* The end offset of the range to be scanned */
    protected int rangeEnd;
    
    /* ---------- Word Detection ---------- */
    
    /* Collections of word of the current  */
    protected Vector<Word> words;
    
    /* Loop on words */
    protected int wordsCounter = 0;
    
    /* ---------- Error Detection --------- */
    
    /* Tells if an error on parameters has been found */
    protected boolean hasErrorOnParameters = false;
    
    /* ------------- Coloring ------------- */
    
    /* The offset of the last read token */
    protected int tokenOffset;
    
    /* The offset of the last read token */
    protected int tokenLength;
    
    
    /************************************ Constructors ***********************************/

    public DGSScanner(){
    	
        // *DEBUG MODE* beginning
        if(DGSConstants.DEBUG_MODE) System.out.print("Scanner created : " + this.getClass().getSimpleName() + "\n");
        // *DEBUG MODE* end
    }
    
    /* Call to initialize each partition, so it can be considered as a constructor */
	public void setRange(IDocument document, int offset, int length) {
	
		// Check the document
        Assert.isLegal(document != null);
        documentLength = document.getLength();
        checkRange(offset, length, documentLength);

        // Initialize current partition
		this.document = document;
        partitionOffset = offset;
        partitionLength = length; 
        nextOffset = offset;
        rangeEnd = offset + length;
        try { 
        	beginningLine = document.getLineOfOffset(nextOffset) + 1;
        	endLine = document.getLineOfOffset(rangeEnd) + 1;
		} catch (BadLocationException e1) {}
          
        // Delete line's previous errors
		for(IMarker newError : DGSEditor.getErrors()){
			if(newError.getAttribute(IMarker.LINE_NUMBER,-1) >= beginningLine && newError.getAttribute(IMarker.LINE_NUMBER,-1) <= endLine)
				try { newError.delete();
					} catch (CoreException e) {}
		}
        
        // *DEBUG MODE* beginning
        if(DGSConstants.DEBUG_MODE){
        	if(!DGSEditor.documentInitialized){
        		if(offset == 0){
        			System.out.print("\n//////////////////////////////////////////////// End of Partitionning ////////////////////////////////////////////////////\n\n");
        			System.out.print("\n//////////////////////////////////////////// Begin of Partitions Treatment ///////////////////////////////////////////////\n");
        		}
        		try {
					System.out.print("\n\n______________________ Partition " + document.getPartition(nextOffset).getType() + " ________________________\n\n");
				} catch (BadLocationException e) {}
        	} else
				try {
					System.out.print("\n\n________________ Partition " + document.getPartition(nextOffset).getType() + " has changed __________________\n\n");
				} catch (BadLocationException e) {}
        	System.out.print("From line n°" + beginningLine + " to line n°" + endLine + ", offset = " + offset + ", length = " + length + "\n");
        	System.out.print("Associated scanner : " + this.getClass().getSimpleName() + "\n");
        	System.out.print("\n************* Word Detection *************\n\n");
        }
        // *DEBUG MODE* end
        
        // Word Detection
        words = wordDetector();
        
        // Error Detection
        errorDetection();
        
        // Re-initialize attributes in case of futures updates (keep this in mind !)
        nextOffset = offset;
        
        // *DEBUG MODE* beginning
        if(DGSConstants.DEBUG_MODE){
        	System.out.print("\n\n*********** Errors Detected ************\n\n");
	    	try {
				for(IMarker newError : DGSEditor.getErrors()){
					if(newError.getAttribute(IMarker.LINE_NUMBER,-1) >= beginningLine && newError.getAttribute(IMarker.LINE_NUMBER,-1) <= endLine)
						System.out.println(newError.getAttribute(IMarker.MESSAGE) + "  : Line n°" + newError.getAttribute(IMarker.LINE_NUMBER,-1) + 
								", Priority = " + newError.getAttribute(IMarker.PRIORITY));
				}
			} catch (CoreException e) {}
	    	System.out.print("\n\n*************** Coloring ***************\n\n");
        }
        // *DEBUG MODE* end
	}

	/* Check if this partition is in the document */
	public void checkRange(int offset, int length, int documentLength) {
        Assert.isLegal(offset > -1);
        Assert.isLegal(length > -1);
        Assert.isLegal(offset + length <= documentLength);
    }
	
	
	/********************************* Character Scanner *********************************/

    /* Read next character */
    public int read() {
        try {
            if (nextOffset < rangeEnd) {
                try {
                    return document.getChar(nextOffset);
                } catch (BadLocationException e) {}
            }
            return EOF;
        } finally {
            ++nextOffset;
        }
    }

    /* Unread next character */
    public void unread() {
        --nextOffset;
    }
    
	/* Returns current column */
    public int getColumn() {
        return nextOffset - partitionOffset;
    }
    
    /* Useless but has to be implemented */
	public char[][] getLegalLineDelimiters() {
		return null;
	}

	
	/********************************** Word Detection ***********************************/
	
	/* Cuts the partition in a collections of words (and finds errors on the fly) */
	public Vector<Word> wordDetector(){
		
		// Initialize locals attributes
		Vector<Word> partitionWords = new Vector<Word>();
		String word = "";
		int wordNumber = 1;
        int wordOffset = nextOffset;
        int wordLength = 0;
        
        // While End Of File has not been reached
        do{
        	// Read the next character
        	current = read();
        	
        	// If it's not a separator, we are (still) in a word
        	if(!isSeparator(current)){
        		// Incrementing word's attributes
        		word += (char) current;
        		wordLength++;
        		
        		// *DEBUG MODE* beginning
                if(DGSConstants.DEBUG_MODE) System.out.print((nextOffset-1) + " : " + (char) current + ", ");
                // *DEBUG MODE* end
        	}
        	
        	// If it's a separator, we are not in a word (anymore)
        	else{
        		
        		// If the current word is empty, we are in a separator sequence, so we do nothing
        		if(isSeparator(current) && word.equals("")) wordOffset++;
        		
        		// If the current word is not empty, we are at the end of a word
        		else{
        			
        			// We add this new word to the collection
	        		partitionWords.add(createWord(word, wordNumber, wordOffset, wordLength));
	        		
	        		// *DEBUG MODE* beginning
	                if(DGSConstants.DEBUG_MODE) System.out.println("[Word n°" + wordNumber + " detected : type = " + partitionWords.get(partitionWords.size()-1).getClass().getSimpleName() 
	                		+ ", text = " + word + ", offset = " + wordOffset + ", length = " + wordLength + "]");
	                
	                // *DEBUG MODE* end
	                
	                // Re_initialize attributes to next words
	                word = "";
	        		wordNumber++;
	        		wordOffset += wordLength+1;
	        		wordLength = 0;
        		}
        		
        		// *DEBUG MODE* beginning
                if(DGSConstants.DEBUG_MODE) System.out.println((nextOffset-1) + " : " + (char) current + ", (separator)");
                // *DEBUG MODE* end
        	}
        } while(current != EOF && nextOffset < rangeEnd);
        
        // Returns collection
		return partitionWords;
	}
	
	/* Creates a word (not using a real constructor in order to simplify plugin's administration since there are no parameters) */
	public Word createWord(String word, int wordNumber, int wordOffset, int wordLength){
		Word w = wordType(wordNumber);
		w.setWord(word);
		w.setNumber(wordNumber);
		w.setOffset(wordOffset);
		w.setLength(wordLength);
		return w;
	}
	
	/* Gives word's type and detects errors on the fly, each sub-scanner has its definition */
	public abstract Word wordType(int wordNumber);
	
	/* Returns if the character is a separator */
	public boolean isSeparator(int c){
		for(int separator : DGSConstants.SEPARATORS)
			if(c == separator) return true;
		return false;
	}
	
	
	/************************************* Coloring **************************************/
	
	/* Returns the last token (used by the Repairer) */
	public IToken nextToken(){
		
		// For each word in the current  (don't use local counter since a scanner read all s without distinctions)
		if(wordsCounter < words.size()){
			
			// Store current word's offset and length (used by the Repairer)
			tokenOffset = words.get(wordsCounter).getOffset();
			tokenLength = words.get(wordsCounter).getLength();
			
    		// *DEBUG MODE* beginning
            if(DGSConstants.DEBUG_MODE){
            	System.out.println("Word n°" + (wordsCounter + 1) + " : text = " + words.get(wordsCounter).getWord()+", " + 
            			"(offset = "+ tokenOffset + ", length = " + tokenLength + "), token associé = " + words.get(wordsCounter).getClass().getSimpleName());
            	if(!DGSEditor.documentInitialized && rangeEnd >= documentLength && wordsCounter == words.size()-1){
            		System.out.print("\n//////////////////////////////////////////////// End of Partition Treatment ///////////////////////////////////////////////////");
            		System.out.print("\n\n################################################################# DOCUMENT INITIALIZED ################################################################\n");
            		System.out.print("\n\n################################################################## USER MODIFICATIONS #################################################################\n");
            	}
            		
            }
            // *DEBUG MODE* end
            
            // Documents has been initialized
            if(!DGSEditor.documentInitialized && rangeEnd >= documentLength && wordsCounter == words.size()-1) DGSEditor.documentInitialized = true;
            
            // Don't use other loop formats
            wordsCounter++;
            
            // Returns current word's token (foreground color, background color and style)
			return words.get(wordsCounter-1).getToken();
		}
		
		// If End Of Line has been reached
		else{
			
			// Re-initialize counter 
			wordsCounter = 0;
			
			// Returns special token for End Of  (see Token's Javadoc)
			return Token.EOF;
		}
	}
    
	/* Returns offset of the last token (used by the Repairer) */
	public int getTokenOffset() {
        return tokenOffset;
    }

	/* Returns length of the last token (used by the Repairer) */
    public int getTokenLength() {
        return tokenLength;
    }
    
    
    /*********************************** Error Detector **********************************/
    
    /* Each scanner has its own error detector */
    public abstract void errorDetection();
    
    /* Creates an error (only certain errors type interests us) */
    public void error(String message, int offset, int priority){
		try {
			new DGSMarker(IMarker.PROBLEM, message, document.getLineOfOffset(offset)+1, IMarker.SEVERITY_ERROR, priority);
		} catch (BadLocationException e) {}
    }
}
