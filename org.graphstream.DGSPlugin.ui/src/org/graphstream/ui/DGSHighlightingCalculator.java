/*
 * Copyright 2006 - 2012
 * Florian Yger <florian.yger@graphstream-project.org> 
 *
 * GraphStream is a library whose purpose is to handle static or dynamic
 * graph, create them from scratch, file or any source and display them.
 *
 * This program is free software distributed under the terms of two licenses, the
 * CeCILL-C license that fits European law, and the GNU Lesser General Public
 * License. You can use, modify and/ or redistribute the software under the terms
 * of the CeCILL-C license as circulated by CEA, CNRS and INRIA at the following
 * URL <http://www.cecill.info> or under the terms of the GNU LGPL as published by
 * the Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE. See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 *
 * The fact that you are presently reading this means that you have had
 * knowledge of the CeCILL-C and LGPL licenses and that you accept their terms.
 */

package org.graphstream.ui;

import org.eclipse.xtext.impl.ParserRuleImpl;
import org.eclipse.xtext.impl.RuleCallImpl;
import org.eclipse.xtext.impl.TerminalRuleImpl;
import org.eclipse.xtext.nodemodel.*;
import org.eclipse.xtext.nodemodel.impl.AbstractNode;
import org.eclipse.xtext.nodemodel.impl.CompositeNodeWithSemanticElementAndSyntaxError;
import org.eclipse.xtext.nodemodel.impl.CompositeNodeWithSyntaxError;
import org.eclipse.xtext.nodemodel.impl.HiddenLeafNode;
import org.eclipse.xtext.nodemodel.impl.LeafNodeWithSyntaxError;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.*;

/************************************ Begin of Summary ************************************/
/*
 This class allows to associate AST Node and TextStyle via the acceptor.
 */
/************************************* End of Summary *************************************/

public class DGSHighlightingCalculator implements
		ISemanticHighlightingCalculator {

	// Returns node's rule
	public String getRule(INode node) {

		// AST's Node
		if (node instanceof AbstractNode) {
			AbstractNode abstractNode = (AbstractNode) node;

			// Not hidden and without errors Node
			if (!(abstractNode instanceof CompositeNodeWithSyntaxError)
					&& !(abstractNode instanceof CompositeNodeWithSemanticElementAndSyntaxError)
					&& !(abstractNode instanceof LeafNodeWithSyntaxError)
					&& !(abstractNode instanceof HiddenLeafNode)) {

				// Root Node
				if (abstractNode.getGrammarElement() instanceof ParserRuleImpl)
					return ((ParserRuleImpl) abstractNode.getGrammarElement())
							.getName();
				
				// Composite node
				if (abstractNode.getGrammarElement() instanceof RuleCallImpl)
					return ((RuleCallImpl) abstractNode.getGrammarElement())
							.getRule().getName();

				// Leaf node
				if (abstractNode.getGrammarElement() instanceof TerminalRuleImpl)
					return ((TerminalRuleImpl) abstractNode.getGrammarElement())
							.getName();
			}
		}
		return "Non_Interesting_Rule";
	}

	// Associates nodes and style
	public void provideHighlightingFor(XtextResource resource,
			IHighlightedPositionAcceptor acceptor) {
		if (resource == null || resource.getParseResult() == null)
			return;

		INode root = resource.getParseResult().getRootNode();
		for (INode node : root.getAsTreeIterable()) {
			String ruleName = getRule(node);

			// Attribute node
			if (ruleName.equals("Attribute"))
				acceptor.addPosition(node.getOffset(), node.getLength(),
						DGSHighlightingConfiguration.ATTRIBUTE);

			// Event node
			if (ruleName.equals("Event"))
				acceptor.addPosition(node.getOffset(), node.getLength(),
						DGSHighlightingConfiguration.EVENT);

			// Id node which parent is not Mapping or Attribute
			if (ruleName.equals("Id")) {
				if (!getRule(node.getParent()).equals("Mapping")
						&& !getRule(node.getParent()).equals("Attribute"))
					acceptor.addPosition(node.getOffset(), node.getLength(),
							DGSHighlightingConfiguration.ID);
			}

			// Value node
			if (ruleName.equals("Value"))
				acceptor.addPosition(node.getOffset(), node.getLength(),
						DGSHighlightingConfiguration.VALUE);

			// Assign node
			if (ruleName.equals("ASSIGN"))
				acceptor.addPosition(node.getOffset(), node.getLength(),
						DGSHighlightingConfiguration.ASSIGN);

			// Comment node
			if (ruleName.equals("COMMENT"))
				acceptor.addPosition(node.getOffset(), node.getLength(),
						DGSHighlightingConfiguration.COMMENT);

			// Direction node
			if (ruleName.equals("DIRECTION"))
				acceptor.addPosition(node.getOffset(), node.getLength(),
						DGSHighlightingConfiguration.DIRECTION);

			// Int node which parent is not Id
			if (ruleName.equals("INT"))
				if (!getRule(node.getParent()).equals("Id"))
					acceptor.addPosition(node.getOffset(), node.getLength(),
							DGSHighlightingConfiguration.INT);

			// Magic node
			if (ruleName.equals("MAGIC"))
				acceptor.addPosition(node.getOffset(), node.getLength(),
						DGSHighlightingConfiguration.MAGIC);

			// Real node
			if (ruleName.equals("REAL"))
				acceptor.addPosition(node.getOffset(), node.getLength(),
						DGSHighlightingConfiguration.REAL);

			// String node which parent is not Id
			if (ruleName.equals("STRING"))
				if (!getRule(node.getParent()).equals("Id"))
					acceptor.addPosition(node.getOffset(), node.getLength(),
							DGSHighlightingConfiguration.STRING);

		}
	}
}
