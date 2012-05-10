package org.graphstream.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.graphstream.services.DGSGrammarAccess;

@SuppressWarnings("restriction")
public class AbstractDGSSyntacticSequencer extends AbstractSyntacticSequencer {

	protected DGSGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Attribute___HyphenMinusKeyword_0_1_or_PlusSignKeyword_0_0__q;
	protected AbstractElementAlias match_Dgs_EOLTerminalRuleCall_1_2_a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (DGSGrammarAccess) access;
		match_Attribute___HyphenMinusKeyword_0_1_or_PlusSignKeyword_0_0__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getAttributeAccess().getHyphenMinusKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getAttributeAccess().getPlusSignKeyword_0_0()));
		match_Dgs_EOLTerminalRuleCall_1_2_a = new TokenAlias(true, true, grammarAccess.getDgsAccess().getEOLTerminalRuleCall_1_2());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getEOLRule())
			return getEOLToken(semanticObject, ruleCall, node);
		return "";
	}
	
	protected String getEOLToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\n";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Attribute___HyphenMinusKeyword_0_1_or_PlusSignKeyword_0_0__q.equals(syntax))
				emit_Attribute___HyphenMinusKeyword_0_1_or_PlusSignKeyword_0_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Dgs_EOLTerminalRuleCall_1_2_a.equals(syntax))
				emit_Dgs_EOLTerminalRuleCall_1_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('-' | '+')?
	 */
	protected void emit_Attribute___HyphenMinusKeyword_0_1_or_PlusSignKeyword_0_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     EOL*
	 */
	protected void emit_Dgs_EOLTerminalRuleCall_1_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
