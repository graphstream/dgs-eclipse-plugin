package org.graphstream.listener;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IMarkerDelta;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;

public class DGSListener implements IResourceChangeListener {

	public void resourceChanged(IResourceChangeEvent event) {
		for(IMarkerDelta imd : event.findMarkerDeltas(IMarker.PROBLEM, true)){
			if(imd.getKind() == IResourceDelta.ADDED)
				System.out.println(imd.getMarker() + " created");
			if(imd.getKind() == IResourceDelta.REMOVED)
				System.out.println(imd.getMarker() + " removed");
			if(imd.getKind() == IResourceDelta.CHANGED)
				System.out.println(imd.getMarker() + " changed");
		}
	}
}
