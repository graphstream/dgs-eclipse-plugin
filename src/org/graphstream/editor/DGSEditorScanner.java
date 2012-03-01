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

package org.graphstream.editor;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.IWordDetector;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WordRule;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

public class DGSEditorScanner extends RuleBasedScanner {
	
	public static final String [] KEYWORDS = {"an","cn","dn","ae","ce","de","cg","st","cl"};
	private static RGB COMMENT = new RGB(128, 128, 128);
	private static RGB KEYWORD= new RGB(140, 10, 210);
	private static RGB DEFAULT = new RGB(0,0,0);
	private IWordDetector iwd = new IWordDetector() {
		@Override
		public boolean isWordPart(char c) {
			return Character.isJavaIdentifierPart(c) ;
		}

		@Override
		public boolean isWordStart(char c) {
			return Character.isJavaIdentifierStart(c) ;
		}
	};
	 
	public DGSEditorScanner() {
		super();
		setRules(extractRules());
	}
 
	private IRule[] extractRules() {
		IToken keyword = new Token(new TextAttribute(new Color(Display.getCurrent(), KEYWORD), null, SWT.BOLD));
		IToken comment = new Token(new TextAttribute(new Color(Display.getCurrent(), COMMENT), null, SWT.ITALIC));
		IToken defaut = new Token(new TextAttribute(new Color(Display.getCurrent(), DEFAULT)));
 
		WordRule rule = new WordRule(iwd, defaut);
 
		for (String k : KEYWORDS) {
            rule.addWord(k, keyword);
		}
 
		IRule [] rules = new IRule[2];
		rules[0]=rule;
		rules[1]=new SingleLineRule("#", null, comment);
 
		return rules;
	}
}
