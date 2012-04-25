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

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentPartitioner;
import org.eclipse.ui.editors.text.FileDocumentProvider;

/************************************ Begin of Summary ************************************/
/*
	This class associates the document and the partitioner.
 */
/************************************* End of Summary *************************************/

public class DGSDocumentProvider extends FileDocumentProvider {
	
	/************************************ Constructors ***********************************/
	
	/* This method is called when a DocumentProvider is created, it can be considered as a constructor */
	protected IDocument createDocument(Object element) throws CoreException{
	    IDocument document = super.createDocument(element);
	    if (document != null){
	    	
	    	// Here, put your partitions
	        IDocumentPartitioner partitioner = new DGSPartitioner(new DGSPartitionScanner(), new String[]{
	        		DGSPartitionScanner.DGS_MAGIC,
	        		DGSPartitionScanner.DGS_NAME_OBSOLETE,
	        		DGSPartitionScanner.DGS_AN,
	        		DGSPartitionScanner.DGS_CN,
	        		DGSPartitionScanner.DGS_DN,
	        		DGSPartitionScanner.DGS_AE,
	        		DGSPartitionScanner.DGS_CE,
	        		DGSPartitionScanner.DGS_DE,
	        		DGSPartitionScanner.DGS_CG,
	        		DGSPartitionScanner.DGS_ST,
	        		DGSPartitionScanner.DGS_CL,
	        	    DGSPartitionScanner.DGS_COMMENT
	        });
	        partitioner.connect(document);
	        document.setDocumentPartitioner(partitioner);
	    }
	    return document;
	}
}
