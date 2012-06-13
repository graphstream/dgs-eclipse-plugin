/*
 * Copyright 2006 - 2012
 *      Stefan Balev       <stefan.balev@graphstream-project.org>
 *      Julien Baudry   <julien.baudry@graphstream-project.org>
 *      Antoine Dutot   <antoine.dutot@graphstream-project.org>
 *      Yoann Pigné     <yoann.pigne@graphstream-project.org>
 *      Guilhelm Savin  <guilhelm.savin@graphstream-project.org>
 *  
 * GraphStream is a library whose purpose is to handle static or dynamic
 * graph, create them from scratch, file or any source and display them.
 * 
 * This program is free software distributed under the terms of two licenses, the
 * CeCILL-C license that fits European law, and the GNU Lesser General Public
 * License. You can  use, modify and/ or redistribute the software under the terms
 * of the CeCILL-C license as circulated by CEA, CNRS and INRIA at the following
 * URL <http://www.cecill.info> or under the terms of the GNU LGPL as published by
 * the Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * The fact that you are presently reading this means that you have had
 * knowledge of the CeCILL-C and LGPL licenses and that you accept their terms.
 * 
 * Special mention for dgs-eclipse-plugin :
 * 
 * Copyright 2012
 *      Florian Yger <florian.yger@graphstream-project.org> 
 */
package org.graphstream.validation;

import org.eclipse.xtext.validation.Check;
import org.graphstream.dgs.Ae;
import org.graphstream.dgs.An;
import org.graphstream.dgs.Attribute;
import org.graphstream.dgs.Ce;
import org.graphstream.dgs.Cn;
import org.graphstream.dgs.DgsPackage;
import org.graphstream.dgs.De;
import org.graphstream.dgs.Dgs;
import org.graphstream.dgs.Dn;
import org.graphstream.dgs.Event;
import org.graphstream.dgs.Header;
import org.graphstream.graph.Edge;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.AdjacencyListGraph;

/**
 * This class allows to add new errors to error parser. Used to implements
 * warnings (idNode, idEdge, idAttribute).
 */
public class DGSJavaValidator extends AbstractDGSJavaValidator {

	// Current graph
	Graph graph = new AdjacencyListGraph("Temp");

	// First node = clear the graph
	@Check
	public void clearGraphEachCall(Dgs dgs) {
		graph.clear();
	}

	// Header node = warning if text is different from "null 0 0"
	@Check
	public void deprecatedHeader(Header header) {
		if (!header.getName().equals("null"))
			warning("Deprecated, use 'null'", DgsPackage.Literals.HEADER__NAME);
		if (header.getNumberOfSteps() != 0)
			warning("Deprecated, put '0'",
					DgsPackage.Literals.HEADER__NUMBER_OF_STEPS);
		if (header.getNumberOfEvents() != 0)
			warning("Deprecated, put '0'",
					DgsPackage.Literals.HEADER__NUMBER_OF_EVENTS);
	}

	// Cl node = clear the graph
	@Check
	public void clearGraph(Event event) {
		if (event.getCl().equals("cl"))
			graph.clear();
	}

	// An node = verify IdNode, verify + & - for Attributes, store Node with
	// Attributes
	@Check
	public void addAn(An an) {
		String id = an.getIdNode();
		if (graph.getNode(id) == null) {
			graph.addNode(id);
			for (Attribute a : an.getAttributes().getAttribute()) {
				if (a.getOperator() == null || a.getOperator().equals("+"))
					graph.getNode(id).addAttribute(a.getIdAttribute(),
							"value_is_not_interesting_here");
				if (a.getOperator().equals("+"))
					warning("'+' has no sense here",
							DgsPackage.Literals.AN__ATTRIBUTES);
				if (a.getOperator().equals("-"))
					warning("'-' has no sense here",
							DgsPackage.Literals.AN__ATTRIBUTES);
			}
		} else
			warning("This id already exists", DgsPackage.Literals.AN__ID_NODE);
	}

	// Ae node = verify IdEdge and IdNodes, verify + & - for Attributes, store
	// Edge with Attributes
	@Check
	public void addAe(Ae ae) {
		if (graph.getEdge(ae.getIdEdge()) != null)
			warning("This id already exists", DgsPackage.Literals.AE__ID_EDGE);

		if (graph.getNode(ae.getIdNode1()) == null)
			warning("This id doesn't exist", DgsPackage.Literals.AE__ID_NODE1);

		if (graph.getNode(ae.getIdNode2()) == null)
			warning("This id doesn't exist", DgsPackage.Literals.AE__ID_NODE2);

		String id = ae.getIdEdge();
		if (graph.getEdge(id) == null && graph.getNode(ae.getIdNode1()) != null
				&& graph.getNode(ae.getIdNode2()) != null) {
			graph.addEdge(id, ae.getIdNode1(), ae.getIdNode2());
			for (Attribute a : ae.getAttributes().getAttribute()) {
				if (a.getOperator() == null || a.getOperator().equals("+"))
					graph.getEdge(id).addAttribute(a.getIdAttribute(),
							"value_is_not_interesting_here");
				if (a.getOperator().equals("+"))
					warning("'+' has no sense here",
							DgsPackage.Literals.AE__ATTRIBUTES);
				if (a.getOperator().equals("-"))
					warning("'-' has no sense here",
							DgsPackage.Literals.AE__ATTRIBUTES);
			}
		}
	}

	// Cn node = verify IdNode, IdAttributes.
	@Check
	public void changeCn(Cn cn) {
		Node n = graph.getNode(cn.getIdNode());
		if (n != null) {
			for (Attribute a : cn.getAttributes().getAttribute()) {
				if (n.getAttribute(a.getIdAttribute()) == null) {
					if (a.getOperator() == null || a.getOperator().equals("+"))
						graph.getNode(n.getId()).addAttribute(
								a.getIdAttribute(),
								"value_is_not_interesting_here");
					else
						warning("This id doesn't exist",
								DgsPackage.Literals.CN__ATTRIBUTES);
				} else {
					if (a.getOperator().equals("-"))
						graph.getNode(n.getId()).removeAttribute(
								a.getIdAttribute());
				}
			}
		} else
			warning("This id doesn't exist", DgsPackage.Literals.CN__ID_NODE);
	}

	// Ce node = verify IdEdge, IdAttributes.
	@Check
	public void changeCe(Ce ce) {
		Edge e = graph.getEdge(ce.getIdEdge());
		if (e != null) {
			for (Attribute a : ce.getAttributes().getAttribute()) {
				if (e.getAttribute(a.getIdAttribute()) == null) {
					if (a.getOperator() == null || a.getOperator().equals("+"))
						graph.getEdge(e.getId()).addAttribute(
								a.getIdAttribute(),
								"value_is_not_interesting_here");
					else
						warning("This id doesn't exist",
								DgsPackage.Literals.CE__ATTRIBUTES);
				} else {
					if (a.getOperator().equals("-"))
						graph.getEdge(e.getId()).removeAttribute(
								a.getIdAttribute());
				}
			}
		} else
			warning("This id doesn't exist", DgsPackage.Literals.CE__ID_EDGE);
	}

	// Dn node = verify IdNode, remove node
	@Check
	public void removeDn(Dn dn) {
		if (graph.getNode(dn.getIdNode()) != null) {
			graph.removeNode(dn.getIdNode());
		} else
			warning("This id doesn't exist", DgsPackage.Literals.DN__ID_NODE);
	}

	// Dn node = verify IdEdge, remove edge
	@Check
	public void removeDe(De de) {
		if (graph.getEdge(de.getIdEdge()) != null) {
			graph.removeEdge(de.getIdEdge());
		} else
			warning("This id doesn't exist", DgsPackage.Literals.DE__ID_EDGE);
	}
}
