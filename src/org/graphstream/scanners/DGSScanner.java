package org.graphstream.scanners;

import java.util.Vector;

import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.ITokenScanner;

public abstract class DGSScanner implements ICharacterScanner, ITokenScanner {
	
	/* ---------------------------- Attributes ---------------------------- */
	
    // The document to be scanned
    protected IDocument document;
    
    // Collections of word of the current line
    protected Vector<Word> words;
    
    // The current character to be read
    protected int current;
    
    // The offset of the next character to be read
    protected int nextOffset;
    
    // The end offset of the range to be scanned
    protected int rangeEnd;
    
    // The offset of the last read token
    protected int tokenOffset;
    
    // The offset of the last read token
    protected int tokenLength;
    
    // The cached column of the current scanner position
    protected int column;
    
    /* ---------------------------- Constants ---------------------------- */
    
    // Internal setting for the un-initialized column cache.
    protected static final int EOF = -1;
    
    // Honrizontal Tab (Ascii)
    protected static final int HT = 9;
    
    // New Line (Ascii)
    protected static final int NL = 10;
    
    // Carriage return (Ascii)
    protected static final int CR = 13;
    
    // WhiteSpace (Ascii)
    protected static final int WS = 32;
    
    // Operator (Ascii)
    protected static final int[] OP = {58,61};
    
    /* ------------------------------ Range ------------------------------- */

	public void setRange(IDocument document, int offset, int length) {
        Assert.isLegal(document != null);
        final int documentLength= document.getLength();
        checkRange(offset, length, documentLength);

        this.document = document;
        nextOffset = offset;
        column = EOF;
        rangeEnd = offset + length;
        
        System.out.println("\n\n");
        words = wordDetector();
        System.out.println("--------");
        
        nextOffset = offset;
        column = EOF;
        //errorDetector();
	}

	public void checkRange(int offset, int length, int documentLength) {
        Assert.isLegal(offset > -1);
        Assert.isLegal(length > -1);
        Assert.isLegal(offset + length <= documentLength);
    }
	
	/* ------------------------ Character Scanner ------------------------- */

    public int getColumn() {
        if (column == EOF) {
            try {
                int line = document.getLineOfOffset(nextOffset);
                int start = document.getLineOffset(line);
                column = nextOffset - start;
            } catch (BadLocationException ex) {
            }
        }
        return column;
    }

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
            column= EOF;
        }
    }

    public void unread() {
        --nextOffset;
        column= EOF;
    }
    
    // Useless but has to be implemented
	public char[][] getLegalLineDelimiters() {
		return null;
	}
	
	/* -------------------------- Word Detector --------------------------- */
	
	public Vector<Word> wordDetector(){
		Vector<Word> tab = new Vector<Word>();
		String word = "";
		int wordNumber = 1;
        int wordOffset = nextOffset;
        int wordLength = 0;
        do{
        	current = read();
        	if(!isSeparator(current)){
        		word += (char) current;
        		wordLength++;
        	}
        	else{
        		if(isSeparator(current) && word.equals("")){
        			wordOffset++;
        			System.out.println("Abandonné !");
        		}
        		else{
	        		tab.add(new Word(word, wordNumber, wordOffset, wordLength));
	        		System.out.println("Mot n°" + wordNumber + " crée : " + wordOffset + " -> " + wordLength);
	        		word = "";
	        		wordNumber++;
	        		wordOffset += wordLength+1;
	        		wordLength = 0;
	        		if(isOperator(current))
	        			tab.add(new Word((char) current + "", wordNumber++, wordOffset-1, 1));
        		}
        	}
        	System.out.println((nextOffset-1)+" : "+ current + ", word = " + word + ", length = " + wordLength);
        } while(current != EOF);
		return tab;
	}
	
	public boolean isOperator(int c){
		for(int i=0;i<OP.length;i++)
			if(OP[i] == c) return true;
		return false;
	}
	
	public boolean isSeparator(int c){
		return isOperator(c) || current == EOF || current == WS || current == NL || current == CR || current == HT ;
	}
	
	/* ----------------------------- Coloring ----------------------------- */
	
	public IToken nextToken(){
		return coloring();
	}

    public abstract IToken coloring();
    
	public int getTokenOffset() {
        return tokenOffset;
    }

    public int getTokenLength() {
        return tokenLength;
    }
	
	/* -------------------------- Error Detector -------------------------- */
	
	public abstract void errorDetector();

}
