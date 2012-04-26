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
import org.graphstream.words.Word;

/************************************ Begin of Summary ************************************/
/*
	The superclass of all line scanners.
	
	All errors have been cleared before see DGSEditor.java in package editor.
	
	setRange() check the line and initialize our CharacterScanner's implementation.
	
	wordDetector() : 1) Split the line following separators in a word collection.
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
    
    /* Is document initialized ? */
    protected static boolean documentInitialized;
    
    /* ----------- Current Line ----------- */
    
    /* The current line to be read */
    protected int line;
    
    /* The offset of the current line to be read */
    protected int lineOffset;
    
    /* The length of the current line to be read */
    protected int lineLength;
    
    /* The current character to be read */
    protected int current;
    
    /* The offset of the next character to be read */
    protected int nextOffset;
    
    /* The end offset of the range to be scanned */
    protected int rangeEnd;
    
    /* ---------- Word Detection ---------- */
    
    /* Collections of word of the current line */
    protected Vector<Word> words;
    
    /* Loop on words */
    private int wordsCounter = 0;
    
    /* ---------- Error Detection --------- */
    
    /* If a parameter error has been found */
    protected boolean parametersErrorFound;
    
    /* ------------- Coloring ------------- */
    
    /* The offset of the last read token */
    protected int tokenOffset;
    
    /* The offset of the last read token */
    protected int tokenLength;
    
    
    /************************************ Constructors ***********************************/

    /* Call to initialize each line, so it can be considered as a constructor */
	public void setRange(IDocument document, int offset, int length) {
	
		// Check the line
        Assert.isLegal(document != null);
        documentLength = document.getLength();
        checkRange(offset, length, documentLength);

        // Initialize attributes
        this.document = document;
        try { line = document.getLineOfOffset(offset)+1; } catch (BadLocationException e) {}
        lineOffset = offset;
        lineLength = length; 
        nextOffset = offset;
        rangeEnd = offset + length;
        parametersErrorFound = false;
        
        // *DEBUG MODE* beginning
        if(DGSConstants.DEBUG_MODE){
        	if(!documentInitialized){
        		if(offset == 0){
        			System.out.print("\n//////////////////////////////////////////////// End of Partitionning ////////////////////////////////////////////////////\n\n");
        			System.out.print("\n/////////////////////////////////////////////// Begin of Line Treatment //////////////////////////////////////////////////\n");
        		}
        		System.out.print("\n\n_________________________ Line n°" + line + " __________________________\n\n");
        	}
        	else
        		System.out.print("\n\n___________________ Line n°" + line + " has changed ____________________\n\n");
        	System.out.print("offset =  " + offset + ", length = " + length + "\n");
        	System.out.print("Scanner associé : " + this.getClass().getSimpleName() + "\n");
        	System.out.print("\n************* Word Detection *************\n\n");
        }
        // *DEBUG MODE* end
        
        // Word Detection (Type, Errors, ...)
        words = wordDetector();
        
        // Re-initialize attributes in case of futures updates (keep this in mind !)
        nextOffset = offset;
        
        // *DEBUG MODE* beginning
        if(DGSConstants.DEBUG_MODE){
        	System.out.print("\n\n*********** Errors Detected ************\n\n");
	    	try {
				for(IMarker newError : DGSEditor.getErrors()){
					System.out.println(newError.getType() + " : Severity = " + newError.getAttribute(IMarker.SEVERITY) + 
								", Priority = " + newError.getAttribute(IMarker.PRIORITY) + " (line n°" + line + ")");
				}
			} catch (CoreException e) {}
	    	System.out.print("\n\n*************** Coloring ***************\n\n");
        }
        // *DEBUG MODE* end
	}

	/* Check if this line is in the document */
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
        return nextOffset - lineOffset;
    }
    
    /* Useless but has to be implemented */
	public char[][] getLegalLineDelimiters() {
		return null;
	}
	
	
	/********************************** Word Detection ***********************************/
	
	/* Cuts the line in a collections of words (and finds errors on the fly) */
	public Vector<Word> wordDetector(){
		
		// Initialize locals attributes
		Vector<Word> lineWords = new Vector<Word>();
		String word = "";
		int wordNumber = 1;
        int wordOffset = nextOffset;
        int wordLength = 0;
        
        // While End Of Line has not been reached
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
	        		lineWords.add(createWord(word, wordNumber, wordOffset, wordLength));
	        		
	        		// *DEBUG MODE* beginning
	                if(DGSConstants.DEBUG_MODE) System.out.println("[Word n°" + wordNumber + " detected : type = " + 
	                		lineWords.get(lineWords.size()-1).getClass().toString().substring(lineWords.get(lineWords.size()-1).getClass().toString().lastIndexOf(".") + 1) 
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
        } while(current != EOF);
        
        // Returns collection
		return lineWords;
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
		
		// For each word in the current line (don't use local counter since a scanner read all lines without distinctions)
		if(wordsCounter < words.size()){
			
			// Store current word's offset and length (used by the Repairer)
			tokenOffset = words.get(wordsCounter).getOffset();
			tokenLength = words.get(wordsCounter).getLength();
			
    		// *DEBUG MODE* beginning
            if(DGSConstants.DEBUG_MODE){
            	System.out.println("Word n°" + (wordsCounter + 1) + 
            			" : text = " + words.get(wordsCounter).getWord()+", " + 
            			"(offset = "+ tokenOffset + ", length = " + tokenLength + 
            			"), token associé = " + words.get(words.size()-1).getClass().toString().substring(words.get(words.size()-1).getClass().toString().lastIndexOf(".") + 1));
            	if(!documentInitialized && rangeEnd >= documentLength && wordsCounter == words.size()-1){
            		System.out.print("\n//////////////////////////////////////////////// End of Line Treatment ///////////////////////////////////////////////////");
            		System.out.print("\n\n################################################################# DOCUMENT INITIALIZED ################################################################\n");
            		System.out.print("\n\n################################################################## USER MODIFICATIONS #################################################################\n");
            	}
            		
            }
            // *DEBUG MODE* end
            
            // Documents has been initialized
            if(!documentInitialized && rangeEnd >= documentLength && wordsCounter == words.size()-1) documentInitialized = true;
            
            // Don't use other loop formats
            wordsCounter++;
            
            // Returns current word's token (foreground color, background color and style)
			return words.get(wordsCounter-1).getToken();
		}
		
		// If End Of Line has been reached
		else{
			
			// Re-initialize counter 
			wordsCounter = 0;
			
			// Returns special token for End Of Line (see Token's Javadoc)
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
}
