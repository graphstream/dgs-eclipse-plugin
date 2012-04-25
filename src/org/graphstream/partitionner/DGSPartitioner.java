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
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITypedRegion;
import org.eclipse.jface.text.rules.FastPartitioner;
import org.eclipse.jface.text.rules.IPartitionTokenScanner;
import org.graphstream.editor.DGSConstants;

/************************************ Begin of Summary ************************************/
/*
	This class handle the partitioning.
 */
/************************************* End of Summary *************************************/

public class DGSPartitioner extends FastPartitioner {

	/************************************ Constructors ***********************************/
	
	/* Creates a partitioner */
	public DGSPartitioner(IPartitionTokenScanner scanner, String[] legalContentTypes){
		super(scanner, legalContentTypes);
	}
	
	
	/************************************ Partitionning **********************************/

	/* Called when document has changed */
	public void connect(IDocument document, boolean delayInitialization){
		super.connect(document, delayInitialization);
		
        // *DEBUG MODE* beginning
        if(DGSConstants.DEBUG_MODE) printPartitions(document);
        // *DEBUG MODE* end
	}
	
	
	/************************************** Affichage ************************************/

	/* Print all partitions if debug mode is active */
	public void printPartitions(IDocument document){
		StringBuffer buffer = new StringBuffer();

		ITypedRegion[] partitions = computePartitioning(0, document.getLength());
		buffer.append("---------------------------------------------- Beginning of Partitionning --------------------------------------------------\n\n");
		for (int i=0;i<partitions.length;i++){
			try{
				buffer.append("Partition type: " + partitions[i].getType() + ", offset: " + partitions[i].getOffset()
						+ ", length: " + partitions[i].getLength());
				buffer.append("\n");
				buffer.append("Text:\n");
				buffer.append(document.get(partitions[i].getOffset(), partitions[i].getLength()));
				if(i!=partitions.length-1)buffer.append("\n---------------------------\n\n");
			}
			catch (BadLocationException e){
				e.printStackTrace();
			}
		}
		buffer.append("\n------------------------------------------------- End of Partitionning -----------------------------------------------------\n\n");
		System.out.print(buffer);
	}
}
