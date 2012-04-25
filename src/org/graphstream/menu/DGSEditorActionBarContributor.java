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

package org.graphstream.menu;

import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.menus.CommandContributionItem;
import org.eclipse.ui.menus.CommandContributionItemParameter;
import org.eclipse.ui.part.EditorActionBarContributor;

/************************************ Begin of Summary ************************************/
/*
	This class allows to add elements on eclipse interface.
	
	See plugins' commands extensions for more informations.
 */
/************************************* End of Summary *************************************/

public class DGSEditorActionBarContributor extends EditorActionBarContributor {
	
	/************************************* Attributes *************************************/
	
	/* Instance of an DGS interface element */
	private IContributionItem ref = new CommandContributionItem(new CommandContributionItemParameter(
			PlatformUI.getWorkbench(), "DGSMenu",
			"org.graphstream.editor.DGSMenu",
			CommandContributionItem.STYLE_PUSH));
	
	
	/************************************* Interfaces *************************************/
	
	/* To add elements to menu */
	public void contributeToMenu(IMenuManager menuManager) {}
	
	/* To add elements to status bar */
	public void contributeToStatusLine(IStatusLineManager statusLineManager) {}
	
	/* To add elements to toolbar */
	public void contributeToToolBar(IToolBarManager toolBarManager) {
		toolBarManager.add(ref);
	}
}
