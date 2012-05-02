package org.graphstream.words;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IMarker;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;
import org.graphstream.markers.DGSMarker;

public abstract class Word {

	protected String word;
	protected int number, offset, length;
	protected IToken token;
	protected DGSMarker patternError = null;

	public Word() {
		this.word = null;
		this.number = -1;
		this.offset = -1;
		this.length = 0;
		this.token = Token.UNDEFINED;
	}
	
	public void errorDetector(int line){
		String message = patternError();
		
		// If this error doesn't exist but should
		if(patternError == null && message != null){
			patternError = new DGSMarker(IMarker.PROBLEM, message, line, IMarker.SEVERITY_ERROR, IMarker.PRIORITY_HIGH);
		}
		
		// If this error exists but should not
		if(patternError != null && message == null){
			patternError.delete();
			patternError = null;
		}
	}
	
    /* Returns possible pattern error message */
	public String patternError() {
		
		// Returns the error message if it exists
		if(getPattern() != null && !isCorrect(word, getPattern())) return getPatternErrorMessage();
		
		// If no error returns null
		return null;
	}

	private boolean isCorrect(String word, String pattern) {
		Pattern patt = Pattern.compile(pattern);
		Matcher m = patt.matcher(word);
		return m.matches();
	}

	public abstract String getPattern();
	
	public abstract String getPatternErrorMessage();

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	public IToken getToken() {
		return token;
	}
	
	public void setToken(IToken token) {
		this.token = token;
	}

	public String toString() {
		return "Word [word=" + word + ", number=" + number
				+ ", offset=" + offset + ", length=" + length + "]";
	}
}
