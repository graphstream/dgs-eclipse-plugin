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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.editors.text.TextEditor;

public class DGSEditor extends TextEditor {
	
	
	private static IEditorInput input;
	
	/*
	 * Création de l'éditeur et mise en place de la configuration de celui-ci.
	 */
	
	public DGSEditor(){
		super();
		setSourceViewerConfiguration(new DGSConfiguration());
		setDocumentProvider(new DGSDocumentProvider());
	}
	
	public void editorSaved(){
		super.editorSaved();
	}
	
	public void doSetInput(IEditorInput newInput) throws CoreException{
		super.doSetInput(newInput);
		DGSEditor.input = newInput;
	}
	
	public IDocument getInputDocument(){
		IDocument document = getDocumentProvider().getDocument(input);
		return document;
	}

	public static IFile getInputFile(){
		IFileEditorInput ife = (IFileEditorInput) input;
		IFile file = ife.getFile();
		return file;
	}
	
	public static IEditorInput getInput(){
		return input;
	}
}
