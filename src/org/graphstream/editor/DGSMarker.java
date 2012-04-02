package org.graphstream.editor;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;

public class DGSMarker {

	private IMarker marker;
	
	public DGSMarker(String type, String message, int lineNumber, int severity, int priority) {
		try {
			marker = DGSEditor.getInputFile().createMarker(type);
			marker.setAttribute(IMarker.MESSAGE, message);
			marker.setAttribute(IMarker.LINE_NUMBER, lineNumber);
			marker.setAttribute(IMarker.SEVERITY, severity);
			marker.setAttribute(IMarker.PRIORITY, priority);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	public IMarker getMarker() {
		return marker;
	}

	public void setMarker(IMarker marker) {
		this.marker = marker;
	}
	
	public void delete(){
		try {
			marker.delete();
		} catch (CoreException e) {}
	}
}
