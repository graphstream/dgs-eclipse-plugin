/*
* generated by Xtext
*/
package org.graphstream.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.graphstream.services.DGSGrammarAccess;

public class DGSParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private DGSGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS");
	}
	
	@Override
	protected org.graphstream.parser.antlr.internal.InternalDGSParser createParser(XtextTokenStream stream) {
		return new org.graphstream.parser.antlr.internal.InternalDGSParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Dgs";
	}
	
	public DGSGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(DGSGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}