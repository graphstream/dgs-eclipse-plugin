package org.graphstream.scanners;

public class Word {

	private String word;
	private int number, offset, length;

	public Word(String word, int number, int offset, int length) {
		this.word = word;
		this.number = number;
		this.offset = offset;
		this.length = length;
	}

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

	public String toString() {
		return "Word [word=" + word + ", number=" + number
				+ ", offset=" + offset + ", length=" + length + "]";
	}
	
}
