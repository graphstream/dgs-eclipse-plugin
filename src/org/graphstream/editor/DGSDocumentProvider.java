package org.graphstream.editor;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentPartitioner;
import org.eclipse.ui.editors.text.FileDocumentProvider;
import org.graphstream.scanners.DGSPartitionScanner;

public class DGSDocumentProvider extends FileDocumentProvider {
	
	protected IDocument createDocument(Object element) throws CoreException{
	    IDocument document = super.createDocument(element);
	    if (document != null)
	    {
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
