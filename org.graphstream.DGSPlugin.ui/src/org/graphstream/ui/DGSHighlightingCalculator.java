package org.graphstream.ui;


import org.eclipse.xtext.impl.ParserRuleImpl;
import org.eclipse.xtext.impl.RuleCallImpl;
import org.eclipse.xtext.impl.TerminalRuleImpl;
import org.eclipse.xtext.nodemodel.*;
import org.eclipse.xtext.nodemodel.impl.AbstractNode;
import org.eclipse.xtext.nodemodel.impl.CompositeNode;
import org.eclipse.xtext.nodemodel.impl.CompositeNodeWithSemanticElement;
import org.eclipse.xtext.nodemodel.impl.CompositeNodeWithSemanticElementAndSyntaxError;
import org.eclipse.xtext.nodemodel.impl.HiddenLeafNode;
import org.eclipse.xtext.nodemodel.impl.LeafNode;
import org.eclipse.xtext.nodemodel.impl.LeafNodeWithSyntaxError;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.*;

public class DGSHighlightingCalculator implements ISemanticHighlightingCalculator{
	
	public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor){
		if(resource == null || resource.getParseResult() == null) return;

		INode root = resource.getParseResult().getRootNode();
		for (INode node : root.getAsTreeIterable()) {
			
			if(node instanceof AbstractNode){
				AbstractNode abstractNode = (AbstractNode) node;
				
				if(node instanceof CompositeNode){
					CompositeNode compositeNode = (CompositeNode) node;
					if(compositeNode instanceof CompositeNodeWithSemanticElement){
						CompositeNodeWithSemanticElement compositeNodeWithSemanticElement = (CompositeNodeWithSemanticElement) node;
						if(!(compositeNodeWithSemanticElement instanceof CompositeNodeWithSemanticElementAndSyntaxError)){
							
							if(compositeNodeWithSemanticElement.getGrammarElement() instanceof ParserRuleImpl){
								ParserRuleImpl rootRule = (ParserRuleImpl) compositeNodeWithSemanticElement.getGrammarElement();
								String ruleName = rootRule.getName();
								
								if(ruleName.equals("Dgs")) 
									acceptor.addPosition(node.getOffset(), node.getLength(), DGSHighlightingConfiguration.DGS);
							}
							
							if(compositeNodeWithSemanticElement.getGrammarElement() instanceof RuleCallImpl){
								RuleCallImpl compositeNodeWithSemanticElementRule = (RuleCallImpl) compositeNodeWithSemanticElement.getGrammarElement();
								String ruleName = compositeNodeWithSemanticElementRule.getRule().getName();
								
								if(ruleName.equals("Ae")) 
									acceptor.addPosition(node.getOffset(), node.getLength(), DGSHighlightingConfiguration.AE);
								
								if(ruleName.equals("An")) 
									acceptor.addPosition(node.getOffset(), node.getLength(), DGSHighlightingConfiguration.AN);
								
								if(ruleName.equals("Array")) 
									acceptor.addPosition(node.getOffset(), node.getLength(), DGSHighlightingConfiguration.ARRAY);
								
								if(ruleName.equals("Attribute")) 
									acceptor.addPosition(node.getOffset(), node.getLength(), DGSHighlightingConfiguration.ATTRIBUTE);
								
								if(ruleName.equals("Attributes")) 
									acceptor.addPosition(node.getOffset(), node.getLength(), DGSHighlightingConfiguration.ATTRIBUTES);
								
								if(ruleName.equals("Ce")) 
									acceptor.addPosition(node.getOffset(), node.getLength(), DGSHighlightingConfiguration.CE);
								
								if(ruleName.equals("Cg")) 
									acceptor.addPosition(node.getOffset(), node.getLength(), DGSHighlightingConfiguration.CG);
								
								if(ruleName.equals("Cn")) 
									acceptor.addPosition(node.getOffset(), node.getLength(), DGSHighlightingConfiguration.CN);
								
								if(ruleName.equals("De")) 
									acceptor.addPosition(node.getOffset(), node.getLength(), DGSHighlightingConfiguration.DE);
								
								if(ruleName.equals("Dn")) 
									acceptor.addPosition(node.getOffset(), node.getLength(), DGSHighlightingConfiguration.DN);
								
								if(ruleName.equals("Event")) 
									acceptor.addPosition(node.getOffset(), node.getLength(), DGSHighlightingConfiguration.EVENT);
								
								if(ruleName.equals("Header"))
									acceptor.addPosition(node.getOffset(), node.getLength(), DGSHighlightingConfiguration.HEADER);
								
								if(ruleName.equals("Map")) 
									acceptor.addPosition(node.getOffset(), node.getLength(), DGSHighlightingConfiguration.MAP);
								
								if(ruleName.equals("Mapping")) 
									acceptor.addPosition(node.getOffset(), node.getLength(), DGSHighlightingConfiguration.MAPPING);
								
								if(ruleName.equals("Real")) 
									acceptor.addPosition(node.getOffset(), node.getLength(), DGSHighlightingConfiguration.REAL);
								
								if(ruleName.equals("St")) 
									acceptor.addPosition(node.getOffset(), node.getLength(), DGSHighlightingConfiguration.ST);
								
								if(ruleName.equals("Value")) 
									acceptor.addPosition(node.getOffset(), node.getLength(), DGSHighlightingConfiguration.VALUE);
							}
						}
					}
				}
				
				if(abstractNode instanceof LeafNode){
					LeafNode leafNode = (LeafNode) abstractNode;
					if(!(leafNode instanceof LeafNodeWithSyntaxError) && !(leafNode instanceof HiddenLeafNode)){
						if(leafNode.getGrammarElement() instanceof RuleCallImpl){
							RuleCallImpl leafRule = (RuleCallImpl) leafNode.getGrammarElement();
							if(leafRule.getRule() instanceof TerminalRuleImpl){
								TerminalRuleImpl rule = (TerminalRuleImpl) leafRule.getRule();
								String ruleName = rule.getName();
								
								if(ruleName.equals("ASSIGN")) 
									acceptor.addPosition(node.getOffset(), node.getLength(), DGSHighlightingConfiguration.ASSIGN);
								
								if(ruleName.equals("CL")) 
									acceptor.addPosition(node.getOffset(), node.getLength(), DGSHighlightingConfiguration.CL);
								
								if(ruleName.equals("COMMENT")) 
									acceptor.addPosition(node.getOffset(), node.getLength(), DGSHighlightingConfiguration.COMMENT);
								
								if(ruleName.equals("DIRECTION")) 
									acceptor.addPosition(node.getOffset(), node.getLength(), DGSHighlightingConfiguration.DIRECTION);
								
								if(ruleName.equals("ID")) 
									acceptor.addPosition(node.getOffset(), node.getLength(), DGSHighlightingConfiguration.ID);
								
								if(ruleName.equals("INT")) 
									acceptor.addPosition(node.getOffset(), node.getLength(), DGSHighlightingConfiguration.INT);
								
								if(ruleName.equals("MAGIC")) 
									acceptor.addPosition(node.getOffset(), node.getLength(), DGSHighlightingConfiguration.MAGIC);
								
								if(ruleName.equals("STRING")) 
									acceptor.addPosition(node.getOffset(), node.getLength(), DGSHighlightingConfiguration.STRING);
							}
						}
					}
				}
			}
		}
	}
}
