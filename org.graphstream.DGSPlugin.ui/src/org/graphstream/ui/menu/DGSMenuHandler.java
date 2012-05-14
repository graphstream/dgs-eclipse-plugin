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

package org.graphstream.ui.menu;

import java.io.File;

import javax.swing.JFrame;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.ui.swingViewer.View;
import org.graphstream.ui.swingViewer.Viewer;

/************************************ Begin of Summary ************************************/
/*
 This class handle the action of the plugin's interface element.

 The plugin must reference GraphStream resources, it's a very simple use of it.
 */
/************************************* End of Summary *************************************/

public class DGSMenuHandler extends AbstractHandler {

	/************************************ Constructors ***********************************/

	/*
	 * This method can be considered as a constructor, it displays the current
	 * graph
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchPart workbenchPart = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage().getActivePart();
		IFile file = (IFile) workbenchPart.getSite().getPage()
				.getActiveEditor().getEditorInput().getAdapter(IFile.class);
		JFrame jf = new JFrame();
		jf.setTitle("Graph Visualisation");
		jf.setSize(600, 400);
		Viewer viewer = new Viewer(getGraph(file.getLocation().toFile()),
				Viewer.ThreadingModel.GRAPH_IN_ANOTHER_THREAD);
		viewer.enableAutoLayout();
		View view = viewer.addDefaultView(false);
		jf.add(view);
		jf.setVisible(true);
		return null;
	}

	/* Returns current graph */
	public Graph getGraph(File file) {
		Graph graph = new SingleGraph(file.getName());
		try {
			graph.read(file.getPath());
		} catch (Exception e) {
		}
		return graph;
	}
}
