package org.graphstream.markers;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.graphstream.editor.DGSEditor;

/************************************ Begin of Summary ************************************/
/*
	This class allows to create and delete a marker.
	
	In reality, markers are stored in InputFile, this class just simplify their use.
 */
/************************************* End of Summary *************************************/

public class DGSMarker {

	/************************************* Attributes *************************************/
	
	/* The marker */
	private IMarker marker;
	
	
	/************************************ Constructors ***********************************/
	
	/* Creates an error */
	public DGSMarker(String type, String message, int lineNumber, int severity, int priority) {
		marker = null;
		try {
			marker = DGSEditor.getInputFile().createMarker(type);
			marker.setAttribute(IMarker.MESSAGE, message);
			marker.setAttribute(IMarker.LINE_NUMBER, lineNumber);
			marker.setAttribute(IMarker.SEVERITY, severity);
			marker.setAttribute(IMarker.PRIORITY, priority);
			marker.setAttribute(IMarker.TRANSIENT, false);
		} catch (CoreException e) {}
	}
	
	
	/************************************* Deletors **************************************/
	
	/* Deletes an error */
	public void delete(){
		try {
			marker.delete();
		} catch (CoreException e) {}
	}
	
	
	/************************************* Accessors *************************************/

	/* Returns marker */
	public IMarker getMarker() {
		return marker;
	}
}

