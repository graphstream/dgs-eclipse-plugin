/*
 * Copyright 2006 - 2012
 * Florian Yger <florian.yger@graphstream-project.org> 
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

package org.graphstream.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.*;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

/************************************ Begin of Summary ************************************/
/*
 This class creates TextStyle in the acceptor.
 */
/************************************* End of Summary *************************************/

public class DGSHighlightingConfiguration implements IHighlightingConfiguration {

	/* --------------------- Node Name ---------------------- */

	public final static String ASSIGN = "assign";
	public final static String ATTRIBUTE = "attribute";
	public final static String COMMENT = "comment";
	public final static String DIRECTION = "direction";
	public final static String EVENT = "event";
	public final static String ID = "id";
	public final static String INT = "int";
	public final static String MAGIC = "magic";
	public final static String REAL = "real";
	public final static String STRING = "string";
	public final static String VALUE = "value";

	/* --------------------- Color List --------------------- */

	public static final RGB BLANC = new RGB(255, 255, 255);
	public static final RGB BLEU = new RGB(50, 50, 255);
	public static final RGB BLEU_CLAIR = new RGB(102, 255, 255);
	public static final RGB BLEU_FONCE = new RGB(0, 0, 153);
	public static final RGB GRIS = new RGB(153, 153, 153);
	public static final RGB GRIS_CLAIR = new RGB(192, 192, 192);
	public static final RGB GRIS_FONCE = new RGB(102, 102, 102);
	public static final RGB JAUNE = new RGB(255, 255, 0);
	public static final RGB KAKI = new RGB(102, 102, 0);
	public static final RGB NOIR = new RGB(0, 0, 0);
	public static final RGB ORANGE = new RGB(255, 153, 0);
	public static final RGB ROSE = new RGB(255, 204, 204);
	public static final RGB ROUGE = new RGB(255, 0, 0);
	public static final RGB VERT = new RGB(51, 204, 0);
	public static final RGB VERT_CLAIR = new RGB(0, 153, 0);
	public static final RGB VERT_FONCE = new RGB(0, 102, 0);
	public static final RGB VIOLET = new RGB(140, 10, 210);
	public static final RGB VIOLET_FONCE = new RGB(64, 0, 64);

	/* ------------------- Default Style -------------------- */

	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		acceptor.acceptDefaultHighlighting(ASSIGN, "Assign",
				getTextStyle(NOIR, BLANC, 0));
		acceptor.acceptDefaultHighlighting(ATTRIBUTE, "Attribute",
				getTextStyle(VIOLET_FONCE, BLANC, SWT.BOLD));
		acceptor.acceptDefaultHighlighting(COMMENT, "Comment",
				getTextStyle(VERT_CLAIR, BLANC, SWT.ITALIC));
		acceptor.acceptDefaultHighlighting(DIRECTION, "Direction",
				getTextStyle(NOIR, BLANC, 0));
		acceptor.acceptDefaultHighlighting(EVENT, "Event",
				getTextStyle(VIOLET, BLANC, 0));
		acceptor.acceptDefaultHighlighting(ID, "Id",
				getTextStyle(BLEU, BLANC, 0));
		acceptor.acceptDefaultHighlighting(INT, "Int",
				getTextStyle(ORANGE, BLANC, 0));
		acceptor.acceptDefaultHighlighting(MAGIC, "Magic",
				getTextStyle(KAKI, BLANC, 0));
		acceptor.acceptDefaultHighlighting(REAL, "Real",
				getTextStyle(ORANGE, BLANC, 0));
		acceptor.acceptDefaultHighlighting(STRING, "String",
				getTextStyle(BLEU, BLANC, SWT.ITALIC));
		acceptor.acceptDefaultHighlighting(VALUE, "Value",
				getTextStyle(GRIS_FONCE, BLANC, SWT.ITALIC));
	}

	/* -------------------- Text Style ---------------------- */

	public TextStyle getTextStyle(RGB foreground, RGB background, int style) {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(foreground);
		textStyle.setBackgroundColor(background);
		textStyle.setStyle(style);
		return textStyle;
	}
}
