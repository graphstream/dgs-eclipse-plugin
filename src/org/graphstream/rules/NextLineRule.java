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

package org.graphstream.rules;

import org.eclipse.jface.text.rules.ICharacterScanner;
import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;

/************************************ Begin of Summary ************************************/
/*
	Rule created for this plugin, it returns the first line that have not been affected yet.
	
	Used for line 1 (Magic) and line 2 (Name_Obsolete).
 */
/************************************* End of Summary *************************************/

public class NextLineRule implements IPredicateRule {

	/************************************* Attributes *************************************/
	
	/* Success Token */
	private IToken fToken;
	
	/* Stop research once line founded */
	private boolean trouve = false;
	
	
	/************************************ Constructors ***********************************/
	
	public NextLineRule(IToken token){
		super();
		fToken = token;
	}
	
	
	/************************************** Evaluate *************************************/
	
	/* Has to be implemented due to IPredicateRule */
	public IToken evaluate(ICharacterScanner scanner, boolean resume) {
		return evaluate(scanner);
	}
	
	/* Search first occurence of "\n" or "End Of File" and returns success Token (which automatically takes offset and length of the CharacterScanner) */
	public IToken evaluate(ICharacterScanner scanner) {
		if(scanner.getColumn() == 0 && !trouve){
			int c;
			do{
				c = scanner.read();
			}while((char) c != '\n' && c != ICharacterScanner.EOF);
			trouve = true;
			return fToken;
		}
		return Token.UNDEFINED;
	}
	
	
	/************************************* Accessors *************************************/

	/* Return success token, has to be implemented due to IPredicateRule */
	public IToken getSuccessToken() {
		return fToken;
	}
}
