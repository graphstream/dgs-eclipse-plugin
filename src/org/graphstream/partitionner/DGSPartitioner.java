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

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.rules.FastPartitioner;
import org.eclipse.jface.text.rules.IPartitionTokenScanner;

/************************************ Begin of Summary ************************************/
/*
	This class handle the partitioning.
 */
/************************************* End of Summary *************************************/

public class DGSPartitioner extends FastPartitioner {
	
	/* Current analyzed line */
	public static int line;

	/************************************ Constructors ***********************************/
	
	/* Creates a partitioner */
	public DGSPartitioner(IPartitionTokenScanner scanner, String[] legalContentTypes){
		super(scanner, legalContentTypes);
	}
	
	
	/************************************ Partitioning ***********************************/

	/* Called when partitioner has been connected with document */
	public void connect(IDocument document, boolean delayInitialization){
		line = 1;
		super.connect(document, delayInitialization);
	}
	
	/* Update partitions when document changed */
	public IRegion documentChanged2(DocumentEvent de){
		try {
			line = de.getDocument().getLineOfOffset(de.getOffset())+1;
		} catch (BadLocationException e) {}
		return super.documentChanged2(de);
	}
}
