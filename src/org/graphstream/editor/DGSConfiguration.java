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
import org.graphstream.scanners.DGSAeScanner;
import org.graphstream.scanners.DGSAnScanner;
import org.graphstream.scanners.DGSCeScanner;
import org.graphstream.scanners.DGSCgScanner;
import org.graphstream.scanners.DGSClScanner;
import org.graphstream.scanners.DGSCnScanner;
import org.graphstream.scanners.DGSCommentScanner;
import org.graphstream.scanners.DGSDeScanner;
import org.graphstream.scanners.DGSDnScanner;
import org.graphstream.scanners.DGSMagicScanner;
import org.graphstream.scanners.DGSNameObsoleteScanner;
import org.graphstream.scanners.DGSPartitionScanner;
import org.graphstream.scanners.DGSStScanner;

public class DGSConfiguration extends TextSourceViewerConfiguration{
	
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
	
	public String[] getConfiguredContentTypes(ISourceViewer sourceViewer){
	    return new String[]{
	            IDocument.DEFAULT_CONTENT_TYPE,
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
	    };
	}
	
	public IPresentationReconciler getPresentationReconciler(ISourceViewer sourceViewer) {
		PresentationReconciler reconciler = new PresentationReconciler();
 
		DefaultDamagerRepairer dr = new DefaultDamagerRepairer(getDGSMagicScanner());
		reconciler.setDamager(dr, DGSPartitionScanner.DGS_MAGIC);
		reconciler.setRepairer(dr, DGSPartitionScanner.DGS_MAGIC);
		
		dr = new DefaultDamagerRepairer(getDGSNameObsoleteScanner());
		reconciler.setDamager(dr, DGSPartitionScanner.DGS_NAME_OBSOLETE);
		reconciler.setRepairer(dr, DGSPartitionScanner.DGS_NAME_OBSOLETE);
		
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
		
		dr = new DefaultDamagerRepairer(getDGSCommentScanner());
		reconciler.setDamager(dr, DGSPartitionScanner.DGS_COMMENT);
		reconciler.setRepairer(dr, DGSPartitionScanner.DGS_COMMENT);
 
		return reconciler;
	}
	
    protected DGSMagicScanner getDGSMagicScanner(){
        if(dgsMagicScanner == null){
        	dgsMagicScanner = new DGSMagicScanner();
        }
        return dgsMagicScanner;
    }
    
    protected DGSNameObsoleteScanner getDGSNameObsoleteScanner(){
        if(dgsNameObsoleteScanner == null){
        	dgsNameObsoleteScanner = new DGSNameObsoleteScanner();
        }
        return dgsNameObsoleteScanner;
    }
    
    protected DGSAnScanner getDGSAnScanner(){
        if(dgsAnScanner == null){
        	dgsAnScanner = new DGSAnScanner();
        }
        return dgsAnScanner;
    }
    
    protected DGSCnScanner getDGSCnScanner(){
        if(dgsCnScanner == null){
        	dgsCnScanner = new DGSCnScanner();
        }
        return dgsCnScanner;
    }
    
    protected DGSDnScanner getDGSDnScanner(){
        if(dgsDnScanner == null){
        	dgsDnScanner = new DGSDnScanner();
        }
        return dgsDnScanner;
    }
    
    protected DGSAeScanner getDGSAeScanner(){
        if(dgsAeScanner == null){
        	dgsAeScanner = new DGSAeScanner();
        }
        return dgsAeScanner;
    }
    
    protected DGSCeScanner getDGSCeScanner(){
        if(dgsCeScanner == null){
        	dgsCeScanner = new DGSCeScanner();
        }
        return dgsCeScanner;
    }
    
    protected DGSDeScanner getDGSDeScanner(){
        if(dgsDeScanner == null){
        	dgsDeScanner = new DGSDeScanner();
        }
        return dgsDeScanner;
    }
    
    protected DGSCgScanner getDGSCgScanner(){
        if(dgsCgScanner == null){
        	dgsCgScanner = new DGSCgScanner();
        }
        return dgsCgScanner;
    }
    
    protected DGSStScanner getDGSStScanner(){
        if(dgsStScanner == null){
        	dgsStScanner = new DGSStScanner();
        }
        return dgsStScanner;
    }
    
    protected DGSClScanner getDGSClScanner(){
        if(dgsClScanner == null){
        	dgsClScanner = new DGSClScanner();
        }
        return dgsClScanner;
    }
    
    protected DGSCommentScanner getDGSCommentScanner(){
        if(dgsCommentScanner == null){
        	dgsCommentScanner = new DGSCommentScanner();
        }
        return dgsCommentScanner;
    }
}
