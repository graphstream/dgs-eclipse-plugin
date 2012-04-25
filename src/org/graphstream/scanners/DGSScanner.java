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

public abstract class DGSScanner implements ICharacterScanner, ITokenScanner {
	
	/************************************* Attributes *************************************/
	
	/* ------------- Document ------------- */
	
    /* The document to be scanned */
    protected IDocument document;
    
    /* Document's length */
    protected int documentLength;
    
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
    
    /* Parameters number error's existence */
    protected boolean parametersNumberError;
    
    /* ------------- Coloring -------------- */
    
    /* The offset of the last read token */
    protected int tokenOffset;
    
    /* The offset of the last read token */
    protected int tokenLength;
    
    
    /************************************** Constants *************************************/
    
    /* Honrizontal Tab (Ascii) */
    protected static final int HT = 9;
    
    /* New Line (Ascii) */
    protected static final int NL = 10;
    
    /* Carriage return (Ascii) */
    protected static final int CR = 13;
    
    /* WhiteSpace (Ascii) */
    protected static final int WS = 32;
    
    /* Operator (Ascii), 58 = ':', 61 = '=' */
    protected static final int[] OP = {58,61};
    
    
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
        
        // *DEBUG MODE* beginning
        if(DGSConstants.DEBUG_MODE){
        	System.out.print("\n\n------------------------------------------ Line n°" + line + " : offset = " + offset + ", length = " + length + " ---------------------------------------------\n\n");
        	System.out.print("\n************* Word Detection *************\n\n");
        }
        // *DEBUG MODE* end
        
        // Word Detection
        words = wordDetector();
        
        // Re-initialize attributes in case of futures updates (keep this in mind !)
        nextOffset = offset;
        
        // *DEBUG MODE* beginning
        if(DGSConstants.DEBUG_MODE) System.out.print("\n\n*********** Error Detection ************\n\n");
        // *DEBUG MODE* end
        
    	// Clear all errors
    	DGSEditor.clearErrors();
    	
        // Error Detection
        parametersNumberError = false;
        errorDetector();
        
        // *DEBUG MODE* beginning
        if(DGSConstants.DEBUG_MODE) System.out.print("\n\n*************** Coloring ***************\n\n");
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
	
	/* Cut the line in a collections of words */
	public Vector<Word> wordDetector(){
		
		// Initialize locals attributes
		Vector<Word> tab = new Vector<Word>();
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
	        		tab.add(createWord(word, wordNumber, wordOffset, wordLength));
	        		
	        		// *DEBUG MODE* beginning
	                if(DGSConstants.DEBUG_MODE) System.out.println("[Word n°" + wordNumber + " detected : text = " + word + 
	                											   ", offset = " + wordOffset + ", length = " + wordLength + "]");
	                // *DEBUG MODE* end
	                
	                // Re_initialize attributes to next words
	                word = "";
	        		wordNumber++;
	        		wordOffset += wordLength+1;
	        		wordLength = 0;
	        		
	        		// If the separator was an operator, we add him in the collection
	        		if(isOperator(current))
	        			tab.add(createWord((char) current + "", wordNumber++, wordOffset-1, 1));
        		}
        		
        		// *DEBUG MODE* beginning
                if(DGSConstants.DEBUG_MODE) System.out.println((nextOffset-1) + " : " + (char) current + ", (separator)");
                // *DEBUG MODE* end
        	}
        } while(current != EOF);
        
        // Returns collection
		return tab;
	}
	
	/* Create a word (not using a real constructor in order to simplify plugin's administration since there are no parameters) */
	public Word createWord(String word, int wordNumber, int wordOffset, int wordLength){
		Word w = wordType(wordNumber);
		w.setWord(word);
		w.setNumber(wordNumber);
		w.setOffset(wordOffset);
		w.setLength(wordLength);
		return w;
	}
	
	/* Give words' type, each sub-scanner has its definition */
	public abstract Word wordType(int wordNumber);
	
	/* Returns if the character is a separator */
	public boolean isSeparator(int c){
		return isOperator(c) || current == EOF || current == WS || current == NL || current == CR || current == HT ;
	}
	
	/* Returns if the character is an operator */
	public boolean isOperator(int c){
		for(int i=0;i<OP.length;i++)
			if(OP[i] == c) return true;
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
            if(DGSConstants.DEBUG_MODE) 
            	System.out.println("Word n°" + (wordsCounter + 1) + 
            			" : text = " + words.get(wordsCounter).getWord()+", " + 
            			"(offset = "+ tokenOffset + ", length = " + tokenLength + 
            			"), type associé = " + words.get(wordsCounter).getClass().toString().substring(words.get(wordsCounter).getClass().toString().lastIndexOf(".") + 1));
            // *DEBUG MODE* end
            
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
    
	
    /********************************* Error Detection ***********************************/
	
    /* Handle error detection, be aware markers are persistants ! */
    public void errorDetector(){
    	
		// Parameters number error
		if(DGSConstants.ERROR_ON_PARAMETERS_NUMBER_IS_ACTIVE)
			parametersNumberError = numberOfParametersError(getParametersNumberMin(), getParametersNumberMax());
		
		// Word syntax errors
		if(!parametersNumberError && DGSConstants.ERROR_ON_PATTERN_IS_ACTIVE){
			
			// Call error detection function for each word
			//for(Word word : words) word.errorDetector(line);
		}
		
		// *DEBUG MODE* beginning
        if(DGSConstants.DEBUG_MODE){
    	
        	// Add each line's errors to the global collection (and so active them)
        	try {
				for(IMarker newError : DGSEditor.getErrors()){
					System.out.println(newError.getType() + " : Severity = " + newError.getAttribute(IMarker.SEVERITY) + 
								", Priority = " + newError.getAttribute(IMarker.PRIORITY) + " (line n°" + line + ")");
				}
			} catch (CoreException e) {}
    	}
        // *DEBUG MODE* end
    }
    
    /* Create an error */
	public static void createMarker(String type, String message, int lineNumber, int severity, int priority) {
		IMarker marker = null;
		try {
			marker = DGSEditor.getInputFile().createMarker(type);
			marker.setAttribute(IMarker.MESSAGE, message);
			marker.setAttribute(IMarker.LINE_NUMBER, lineNumber);
			marker.setAttribute(IMarker.SEVERITY, severity);
			marker.setAttribute(IMarker.PRIORITY, priority);
			marker.setAttribute(IMarker.TRANSIENT, false);
		} catch (CoreException e) {}
	}

	/* Returns possible number of parameters' error*/
	public boolean numberOfParametersError(int numberOfParametersMin, int numberOfParametersMax) {
		boolean exist = false;
		String message = "";
		
		// Returns the right error message between too much and not enough
		if(words.size()-1 < numberOfParametersMin){
			message = DGSConstants.ERROR_ON_PARAMETERS_NUMBER_MESSAGE_LESS;
			exist = true;
		}
		if(words.size()-1 > numberOfParametersMax){
			message = DGSConstants.ERROR_ON_PARAMETERS_NUMBER_MESSAGE_MORE;
			exist = true;
		}
		
		// If there is an error, create it
		if(exist) createMarker("org.graphstream.editor.DGSError", message, line, DGSConstants.ERROR_ON_PARAMETERS_NUMBER_SEVERITY, DGSConstants.ERROR_ON_PARAMETERS_NUMBER_PRIORITY);
		
		// Returns if the error exist
		return exist;
	}
	
	public abstract int getParametersNumberMin();
	
	public abstract int getParametersNumberMax();
}
