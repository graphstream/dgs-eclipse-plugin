package org.graphstream.editor;

import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.menus.CommandContributionItem;
import org.eclipse.ui.menus.CommandContributionItemParameter;
import org.eclipse.ui.part.EditorActionBarContributor;

public class DGSEditorActionBarContributor extends EditorActionBarContributor {
	
	private IContributionItem ref = new CommandContributionItem(new CommandContributionItemParameter(
			PlatformUI.getWorkbench(), "DGSMenu",
			"org.graphstream.editor.DGSMenu",
			CommandContributionItem.STYLE_PUSH));
	
	public void contributeToMenu(IMenuManager menuManager) {
		/*super.contributeToMenu(menuManager);
		IMenuManager menu = new MenuManager("DGS Editor");
		menuManager.prependToGroup(IWorkbenchActionConstants.MB_ADDITIONS, menu);
		menuManager.findMenuUsingPath("File").add(ref);*/
	}
	
	public void contributeToStatusLine(IStatusLineManager statusLineManager) {
		//statusLineManager.add(ref);
	}
	
	public void contributeToToolBar(IToolBarManager toolBarManager) {
		toolBarManager.add(ref);
	}
}
