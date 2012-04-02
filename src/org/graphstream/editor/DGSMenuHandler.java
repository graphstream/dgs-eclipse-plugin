package org.graphstream.editor;

import java.io.File;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;

public class DGSMenuHandler extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {
		chargerGraphe(DGSEditor.getInputFile().getLocation().toFile()).display();
		return null;
	}
	
	public Graph chargerGraphe(File fichier){
		Graph graph = new SingleGraph(fichier.getName());
		try{
			graph.read(fichier.getPath());
		} catch (Exception e){}
		return graph;
	}
}
