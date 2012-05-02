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

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.ui.editors.text.TextSourceViewerConfiguration;
import org.graphstream.partitionner.DGSPartitionScanner;
import org.graphstream.scanners.*;

/************************************ Begin of Summary ************************************/
/*
	This class allows to associate text regions and treatments.
	
	Until now, only partitioning is handled by this class, however, other features could be.
	
	If you want to add a new partition treatment, just add a new scanner the some way as others.
	
	To add a new partition type, see DGSDocumentPartitioner.java in package partitioner.
	
	Beware of your scanners' order, since a scanner read what scanners before him have not read yet.
 */
/************************************* End of Summary *************************************/

public class DGSConfiguration extends TextSourceViewerConfiguration{
	
	/************************************* Attributes *************************************/
	
	/* Scanners of each partition type, there must be one only instance of each scanner */
	private DGSMagicScanner dgsMagicScanner = null;
	private DGSNameObsoleteScanner dgsNameObsoleteScanner = null;
	private DGSAnScanner dgsAnScanner = null;
	private DGSCnScanner dgsCnScanner = null;
	private DGSDnScanner dgsDnScanner = null;
	private DGSAeScanner dgsAeScanner = null;
	private DGSCeScanner dgsCeScanner = null;
	private DGSDeScanner dgsDeScanner = null;
	private DGSCgScanner dgsCgScanner = null;
	private DGSStScanner dgsStScanner = null;
	private DGSClScanner dgsClScanner = null;
	private DGSCommentScanner dgsCommentScanner = null;
	private DGSUnknownScanner dgsUnknownScanner = null;
	
	
	/************************************ Constructors ***********************************/
	
	/* First line of the document, "DGS003, "DGS004" ... */
	protected DGSMagicScanner getDGSMagicScanner(){
        if(dgsMagicScanner == null) dgsMagicScanner = new DGSMagicScanner();
        return dgsMagicScanner;
    }
    
	/* Second line of the document, tend to be obsolete */
    protected DGSNameObsoleteScanner getDGSNameObsoleteScanner(){
        if(dgsNameObsoleteScanner == null) dgsNameObsoleteScanner = new DGSNameObsoleteScanner();
        return dgsNameObsoleteScanner;
    }
    
    /* Lines which begin with "an " */
    protected DGSAnScanner getDGSAnScanner(){
        if(dgsAnScanner == null) dgsAnScanner = new DGSAnScanner();
        return dgsAnScanner;
    }
    
    /* Lines which begin with "cn " */
    protected DGSCnScanner getDGSCnScanner(){
        if(dgsCnScanner == null) dgsCnScanner = new DGSCnScanner();
        return dgsCnScanner;
    }
    
    /* Lines which begin with "dn " */
    protected DGSDnScanner getDGSDnScanner(){
        if(dgsDnScanner == null) dgsDnScanner = new DGSDnScanner();
        return dgsDnScanner;
    }
    
    /* Lines which begin with "ae " */
    protected DGSAeScanner getDGSAeScanner(){
        if(dgsAeScanner == null) dgsAeScanner = new DGSAeScanner();
        return dgsAeScanner;
    }
    
    /* Lines which begin with "ce " */
    protected DGSCeScanner getDGSCeScanner(){
        if(dgsCeScanner == null) dgsCeScanner = new DGSCeScanner();
        return dgsCeScanner;
    }
    
    /* Lines which begin with "de " */
    protected DGSDeScanner getDGSDeScanner(){
        if(dgsDeScanner == null) dgsDeScanner = new DGSDeScanner();
        return dgsDeScanner;
    }
    
    /* Lines which begin with "cg " */
    protected DGSCgScanner getDGSCgScanner(){
        if(dgsCgScanner == null) dgsCgScanner = new DGSCgScanner();
        return dgsCgScanner;
    }
    
    /* Lines which begin with "st " */
    protected DGSStScanner getDGSStScanner(){
        if(dgsStScanner == null) dgsStScanner = new DGSStScanner();
        return dgsStScanner;
    }
    
    /* Lines which begin with "cl " */
    protected DGSClScanner getDGSClScanner(){
        if(dgsClScanner == null) dgsClScanner = new DGSClScanner();
        return dgsClScanner;
    }
    
    /* Lines which begin with "#" */
    protected DGSCommentScanner getDGSCommentScanner(){
        if(dgsCommentScanner == null) dgsCommentScanner = new DGSCommentScanner();
        return dgsCommentScanner;
    }
    
    /* Other lines (to distinguish errors and empty lines) */
    protected DGSUnknownScanner getDGSUnknownScanner(){
        if(dgsUnknownScanner == null) dgsUnknownScanner = new DGSUnknownScanner();
        return dgsUnknownScanner;
    }
	
    
	/****************************** Presentation Reconciler ******************************/

    /* Associates a partition to a scanner, damager extracts modified text, repairer put colors and style */
	public IPresentationReconciler getPresentationReconciler(ISourceViewer sourceViewer) {
		
        // *DEBUG MODE* beginning
        if(DGSConstants.DEBUG_MODE) System.out.print("\n**************** Scanners **************** \n\n");
        // *DEBUG MODE* end
        
		PresentationReconciler reconciler = new PresentationReconciler();
 
		DefaultDamagerRepairer dr = new DefaultDamagerRepairer(getDGSMagicScanner());
		reconciler.setDamager(dr, DGSPartitionScanner.DGS_MAGIC);
		reconciler.setRepairer(dr, DGSPartitionScanner.DGS_MAGIC);
		
		dr = new DefaultDamagerRepairer(getDGSNameObsoleteScanner());
		reconciler.setDamager(dr, DGSPartitionScanner.DGS_NAME_OBSOLETE);
		reconciler.setRepairer(dr, DGSPartitionScanner.DGS_NAME_OBSOLETE);
		
		dr = new DefaultDamagerRepairer(getDGSCommentScanner());
		reconciler.setDamager(dr, DGSPartitionScanner.DGS_COMMENT);
		reconciler.setRepairer(dr, DGSPartitionScanner.DGS_COMMENT);
		
		dr = new DefaultDamagerRepairer(getDGSAnScanner());
		reconciler.setDamager(dr, DGSPartitionScanner.DGS_AN);
		reconciler.setRepairer(dr, DGSPartitionScanner.DGS_AN);
		
		dr = new DefaultDamagerRepairer(getDGSCnScanner());
		reconciler.setDamager(dr, DGSPartitionScanner.DGS_CN);
		reconciler.setRepairer(dr, DGSPartitionScanner.DGS_CN);
		
		dr = new DefaultDamagerRepairer(getDGSDnScanner());
		reconciler.setDamager(dr, DGSPartitionScanner.DGS_DN);
		reconciler.setRepairer(dr, DGSPartitionScanner.DGS_DN);
		
		dr = new DefaultDamagerRepairer(getDGSAeScanner());
		reconciler.setDamager(dr, DGSPartitionScanner.DGS_AE);
		reconciler.setRepairer(dr, DGSPartitionScanner.DGS_AE);
		
		dr = new DefaultDamagerRepairer(getDGSCeScanner());
		reconciler.setDamager(dr, DGSPartitionScanner.DGS_CE);
		reconciler.setRepairer(dr, DGSPartitionScanner.DGS_CE);
		
		dr = new DefaultDamagerRepairer(getDGSDeScanner());
		reconciler.setDamager(dr, DGSPartitionScanner.DGS_DE);
		reconciler.setRepairer(dr, DGSPartitionScanner.DGS_DE);
		
		dr = new DefaultDamagerRepairer(getDGSCgScanner());
		reconciler.setDamager(dr, DGSPartitionScanner.DGS_CG);
		reconciler.setRepairer(dr, DGSPartitionScanner.DGS_CG);
		
		dr = new DefaultDamagerRepairer(getDGSStScanner());
		reconciler.setDamager(dr, DGSPartitionScanner.DGS_ST);
		reconciler.setRepairer(dr, DGSPartitionScanner.DGS_ST);
		
		dr = new DefaultDamagerRepairer(getDGSClScanner());
		reconciler.setDamager(dr, DGSPartitionScanner.DGS_CL);
		reconciler.setRepairer(dr, DGSPartitionScanner.DGS_CL);
 
		dr= new DefaultDamagerRepairer(getDGSUnknownScanner());
		reconciler.setDamager(dr, IDocument.DEFAULT_CONTENT_TYPE);
		reconciler.setRepairer(dr, IDocument.DEFAULT_CONTENT_TYPE);
		
		return reconciler;
	}
}
