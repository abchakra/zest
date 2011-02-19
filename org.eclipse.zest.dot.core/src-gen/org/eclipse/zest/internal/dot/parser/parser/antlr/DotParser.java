/*
* generated by Xtext
*/
package org.eclipse.zest.internal.dot.parser.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.zest.internal.dot.parser.services.DotGrammarAccess;

public class DotParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private DotGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.eclipse.zest.internal.dot.parser.parser.antlr.internal.InternalDotParser createParser(XtextTokenStream stream) {
		return new org.eclipse.zest.internal.dot.parser.parser.antlr.internal.InternalDotParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "GraphvizModel";
	}
	
	public DotGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(DotGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}