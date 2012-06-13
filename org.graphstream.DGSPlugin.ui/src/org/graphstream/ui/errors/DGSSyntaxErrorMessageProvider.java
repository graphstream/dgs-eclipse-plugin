/*
 * Copyright 2006 - 2012
 *      Stefan Balev       <stefan.balev@graphstream-project.org>
 *      Julien Baudry   <julien.baudry@graphstream-project.org>
 *      Antoine Dutot   <antoine.dutot@graphstream-project.org>
 *      Yoann Pigné     <yoann.pigne@graphstream-project.org>
 *      Guilhelm Savin  <guilhelm.savin@graphstream-project.org>
 *  
 * GraphStream is a library whose purpose is to handle static or dynamic
 * graph, create them from scratch, file or any source and display them.
 * 
 * This program is free software distributed under the terms of two licenses, the
 * CeCILL-C license that fits European law, and the GNU Lesser General Public
 * License. You can  use, modify and/ or redistribute the software under the terms
 * of the CeCILL-C license as circulated by CEA, CNRS and INRIA at the following
 * URL <http://www.cecill.info> or under the terms of the GNU LGPL as published by
 * the Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * The fact that you are presently reading this means that you have had
 * knowledge of the CeCILL-C and LGPL licenses and that you accept their terms.
 * 
 * Special mention for dgs-eclipse-plugin :
 * 
 * Copyright 2012
 *      Florian Yger <florian.yger@graphstream-project.org> 
 */
package org.graphstream.ui.errors;

import java.text.MessageFormat;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.diagnostics.Diagnostic;
import org.eclipse.xtext.impl.ParserRuleImpl;
import org.eclipse.xtext.impl.RuleCallImpl;
import org.eclipse.xtext.impl.TerminalRuleImpl;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.SyntaxErrorMessage;
import org.eclipse.xtext.nodemodel.impl.AbstractNode;
import org.eclipse.xtext.nodemodel.impl.CompositeNodeWithSemanticElementAndSyntaxError;
import org.eclipse.xtext.nodemodel.impl.CompositeNodeWithSyntaxError;
import org.eclipse.xtext.nodemodel.impl.HiddenLeafNode;
import org.eclipse.xtext.nodemodel.impl.LeafNodeWithSyntaxError;
import org.eclipse.xtext.parser.antlr.ISyntaxErrorMessageProvider;

/**
 * This class allows to change ANTLR's default error messages.
 */
public class DGSSyntaxErrorMessageProvider implements
		ISyntaxErrorMessageProvider {

	public SyntaxErrorMessage getSyntaxErrorMessage(IParserErrorContext context) {
		String errorMessage = context.getDefaultMessage();
		RecognitionException recognitionException = context
				.getRecognitionException();
		if (recognitionException != null && recognitionException.token != null
				&& recognitionException.token.getText() != null) {
			errorMessage = recognitionException.token.getText();
		}
		String rule = getRule(context.getCurrentNode());

		if (rule.equals("Header"))
			return new SyntaxErrorMessage(
					MessageFormat.format(
							"Unexpected value: {0}, Header must be : MAGIC EOL Id INT INT EOL",
							errorMessage), Diagnostic.SYNTAX_DIAGNOSTIC);

		return new SyntaxErrorMessage(MessageFormat.format(
				"Unexpected value: {0}", errorMessage),
				Diagnostic.SYNTAX_DIAGNOSTIC);
	}

	public SyntaxErrorMessage getSyntaxErrorMessage(
			IValueConverterErrorContext context) {
		String errorMessage = context.getDefaultMessage();
		ValueConverterException valueConverterException = context
				.getValueConverterException();
		if (valueConverterException != null
				&& valueConverterException.getMessage() != null) {
			errorMessage = valueConverterException.getMessage();
		}
		return new SyntaxErrorMessage(errorMessage,
				Diagnostic.SYNTAX_DIAGNOSTIC);
	}

	public String getRule(INode node) {

		if (node instanceof AbstractNode) {
			AbstractNode abstractNode = (AbstractNode) node;

			if (!(abstractNode instanceof CompositeNodeWithSyntaxError)
					&& !(abstractNode instanceof CompositeNodeWithSemanticElementAndSyntaxError)
					&& !(abstractNode instanceof LeafNodeWithSyntaxError)
					&& !(abstractNode instanceof HiddenLeafNode)) {

				if (abstractNode.getGrammarElement() instanceof ParserRuleImpl)
					return ((ParserRuleImpl) abstractNode.getGrammarElement())
							.getName();

				if (abstractNode.getGrammarElement() instanceof RuleCallImpl)
					return ((RuleCallImpl) abstractNode.getGrammarElement())
							.getRule().getName();

				if (abstractNode.getGrammarElement() instanceof TerminalRuleImpl)
					return ((TerminalRuleImpl) abstractNode.getGrammarElement())
							.getName();
			}
		}
		return "Nothing";
	}
}
