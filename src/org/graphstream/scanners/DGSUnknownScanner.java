package org.graphstream.scanners;

import org.graphstream.words.Word;
import org.graphstream.words.Error;

public class DGSUnknownScanner extends DGSScanner {

	public Word wordType(int wordNumber) {
		return new Error();
	}

	public int getParametersNumberMin() {
		return 0;
	}

	public int getParametersNumberMax() {
		return 99;
	}
}
