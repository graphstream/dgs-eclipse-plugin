package org.graphstream.validation;

import org.eclipse.xtext.validation.Check;
import org.graphstream.dGS.Ae;
import org.graphstream.dGS.An;
import org.graphstream.dGS.DGSPackage;
import org.graphstream.dGS.De;
import org.graphstream.dGS.Dgs;
import org.graphstream.dGS.Dn;
import org.graphstream.dGS.Event;
import org.graphstream.dGS.Header;
import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.AdjacencyListGraph;
 
public class DGSJavaValidator extends AbstractDGSJavaValidator {

	Graph graph = new AdjacencyListGraph("Temp");
	
	@Check
	public void clearGraphEachCall(Dgs dgs) {
		graph.clear();
	}
	
	@Check
	public void deprecatedHeader(Header header) {
		if(!header.getName().equals("null"))
			warning("Deprecated, use 'null'", DGSPackage.Literals.HEADER__NAME);
		if(header.getNumberOfSteps() != 0)
			warning("Deprecated, put '0'", DGSPackage.Literals.HEADER__NUMBER_OF_STEPS);
		if(header.getNumberOfEvents() != 0)
			warning("Deprecated, put '0'", DGSPackage.Literals.HEADER__NUMBER_OF_EVENTS);
	}
	
	@Check
	public void clearGraph(Event event) {
		if(event.getCl().equals("cl"))
			graph.clear();
	}
	
	@Check
	public void addAn(An an) {
		String id = an.getIdNode();
		if(graph.getNode(id) == null){
			graph.addNode(id);
			/*for(Attribute a : an.getAttributes().getAttribute()){
				
				graph.getNode(id).addAttribute(id,);
			}*/
		}
		else warning("This id already exists", DGSPackage.Literals.AN__ID_NODE);
	}
	
	@Check
	public void addAe(Ae ae) {
		if(graph.getEdge(ae.getIdEdge()) != null)
			warning("This id already exists", DGSPackage.Literals.AE__ID_EDGE);
		
		if(graph.getNode(ae.getIdNode1()) == null)
			warning("This id doesn't exist", DGSPackage.Literals.AE__ID_NODE1);
		
		if(graph.getNode(ae.getIdNode2()) == null)
			warning("This id doesn't exist", DGSPackage.Literals.AE__ID_NODE2);
		
		if(graph.getEdge(ae.getIdEdge()) == null && graph.getNode(ae.getIdNode1()) != null && graph.getNode(ae.getIdNode2()) != null)
			graph.addEdge(ae.getIdEdge(),ae.getIdNode1(),ae.getIdNode2());
	}
	
	@Check
	public void removeDn(Dn dn) {
		if(graph.getNode(dn.getIdNode()) != null){
			graph.removeNode(dn.getIdNode());
		}
		else warning("This id doesn't exist", DGSPackage.Literals.DN__ID_NODE);
	}
	
	@Check
	public void removeDe(De de) {
		if(graph.getNode(de.getIdEdge()) != null){
			graph.removeNode(de.getIdEdge());
		}
		else warning("This id doesn't exist", DGSPackage.Literals.DE__ID_EDGE);
	}
}
