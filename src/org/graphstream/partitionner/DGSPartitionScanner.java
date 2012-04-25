/*
* Copyright 2006 - 2012
* Florian Yger <yf080428@etu.univ-lehavre.fr> 
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

package org.graphstream.partitionner;

import org.eclipse.jface.text.rules.EndOfLineRule;
import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.RuleBasedPartitionScanner;
import org.eclipse.jface.text.rules.Token;
import org.graphstream.rules.NextLineRule;

/************************************ Begin of Summary ************************************/
/*
	This scanner reads the current document and determines text region-partition connections.
	
	This is a rule scanner, the first rule reads the entire document.
	                        the second rule reads what first rule has not determined.
	                        ...
	                        
	As a consequence, rules' order is important.
	
	To know default rule types like EndOfLineRule, see IRule's Javadoc.
	
	You can implement your own rules, see NextLineRule.java in package rules.
 */
/************************************* End of Summary *************************************/

public class DGSPartitionScanner extends RuleBasedPartitionScanner {
	
	/************************************* Attributes *************************************/
	
	/* Partitions' name, can be changed */
	public final static String DGS_MAGIC = "__dgs_magic";
	public final static String DGS_NAME_OBSOLETE = "__dgs_name_obsolete";
	public final static String DGS_AN = "__dgs_an";
	public final static String DGS_CN = "__dgs_cn";
	public final static String DGS_DN = "__dgs_dn";
	public final static String DGS_AE = "__dgs_ae";
	public final static String DGS_CE = "__dgs_ce";
	public final static String DGS_DE = "__dgs_de";
	public final static String DGS_CG = "__dgs_cg";
	public final static String DGS_ST = "__dgs_st";
	public final static String DGS_CL = "__dgs_cl";
	public final static String DGS_COMMENT = "__dgs_comment";
	
	/************************************ Constructors ***********************************/
	
	public DGSPartitionScanner(){

		// Create partitions
		IToken dgsMagic = new Token(DGS_MAGIC);
		IToken dgsNameObsolete = new Token(DGS_NAME_OBSOLETE);
		IToken dgsAn = new Token(DGS_AN);
		IToken dgsCn = new Token(DGS_CN);
		IToken dgsDn = new Token(DGS_DN);
		IToken dgsAe = new Token(DGS_AE);
		IToken dgsCe = new Token(DGS_CE);
		IToken dgsDe = new Token(DGS_DE);
		IToken dgsCg = new Token(DGS_CG);
		IToken dgsSt = new Token(DGS_ST);
		IToken dgsCl = new Token(DGS_CL);
		IToken dgsComment = new Token(DGS_COMMENT);

		// Affecting them
		IPredicateRule[] rules = new IPredicateRule[]{
				new NextLineRule(dgsMagic),
				new NextLineRule(dgsNameObsolete),
				new EndOfLineRule("an ",dgsAn),
				new EndOfLineRule("cn ",dgsCn),
				new EndOfLineRule("dn ",dgsDn),
				new EndOfLineRule("ae ",dgsAe),
				new EndOfLineRule("ce ",dgsCe),
				new EndOfLineRule("de ",dgsDe),
				new EndOfLineRule("cg ",dgsCg),
				new EndOfLineRule("st ",dgsSt),
				new EndOfLineRule("cl ",dgsCl),
				new EndOfLineRule("#", dgsComment)
		};

		setPredicateRules(rules);
	}
}
