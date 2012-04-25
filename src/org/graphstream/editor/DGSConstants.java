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

import org.eclipse.core.resources.IMarker;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;

/************************************ Begin of Summary ************************************/
/*
	This class contains all constants that you can modify safely (colors, styles, ...).
 */
/************************************* End of Summary *************************************/

public class DGSConstants {
	
	/********************************* Error Detection **********************************/
	
	// IMarker.SEVERITY_INFO < IMarker.SEVERITY_WARNING < IMarker.SEVERITY_ERROR, see IMarker's Javadoc for more 
	
	// IMarker.PRIORITY_LOW < IMarker.PRIORITY_NORMAL < IMarker.PRIORITY_HIGH, see IMarker's Javadoc for more 
	
	/* ------------------ Parameters Number ----------------- */
	
	public static final boolean ERROR_ON_PARAMETERS_NUMBER_IS_ACTIVE = true;
	
	public static final String ERROR_ON_PARAMETERS_NUMBER_MESSAGE_MORE = "Too much parameters";
	public static final String ERROR_ON_PARAMETERS_NUMBER_MESSAGE_LESS = "Not enough parameters";
	public static final int ERROR_ON_PARAMETERS_NUMBER_SEVERITY = IMarker.SEVERITY_ERROR;
	public static final int ERROR_ON_PARAMETERS_NUMBER_PRIORITY = IMarker.PRIORITY_NORMAL;
	
	public static final int MAGIC_PARAMATERS_NUMBER_MIN = 0;
	public static final int MAGIC_PARAMATERS_NUMBER_MAX = 0;
	public static final int NAME_OBSOLETE_PARAMATERS_NUMBER_MIN = 2;
	public static final int NAME_OBSOLETE_PARAMATERS_NUMBER_MAX = 2;
	public static final int AN_PARAMATERS_NUMBER_MIN = 4;
	public static final int AN_PARAMATERS_NUMBER_MAX = 4;
	public static final int CN_PARAMATERS_NUMBER_MIN = 4;
	public static final int CN_PARAMATERS_NUMBER_MAX = 4;
	public static final int DN_PARAMATERS_NUMBER_MIN = 1;
	public static final int DN_PARAMATERS_NUMBER_MAX = 1;
	public static final int AE_PARAMATERS_NUMBER_MIN = 6;
	public static final int AE_PARAMATERS_NUMBER_MAX = 7;
	public static final int CE_PARAMATERS_NUMBER_MIN = 4;
	public static final int CE_PARAMATERS_NUMBER_MAX = 4;
	public static final int DE_PARAMATERS_NUMBER_MIN = 3;
	public static final int DE_PARAMATERS_NUMBER_MAX = 3;
	public static final int CG_PARAMATERS_NUMBER_MIN = 3;
	public static final int CG_PARAMATERS_NUMBER_MAX = 3;
	public static final int ST_PARAMATERS_NUMBER_MIN = 1;
	public static final int ST_PARAMATERS_NUMBER_MAX = 1;
	public static final int CL_PARAMATERS_NUMBER_MIN = 0;
	public static final int CL_PARAMATERS_NUMBER_MAX = 0;
	
	/* ------------------- Pattern Errors ------------------- */
	
	public static final boolean ERROR_ON_PATTERN_IS_ACTIVE = true;
	
	public static final int ERROR_ON_PATTERN_SEVERITY = IMarker.SEVERITY_ERROR;
	public static final int ERROR_ON_PATTERN_PRIORITY = IMarker.PRIORITY_LOW;
	
	public static final String ATTRIBUTE_PATTERN = "test";
	public static final String ID_PATTERN = "test";
	public static final String NUMBER_PATTERN = "test";
	public static final String VALUE_PATTERN = "test";
	
	public static final String ATTRIBUTE_ERROR_MESSAGE = "Syntax error";
	public static final String ID_ERROR_MESSAGE = "Syntax error";
	public static final String NUMBER_ERROR_MESSAGE = "Syntax error";
	public static final String VALUE_ERROR_MESSAGE = "Synatx error";
	
	
	/************************************* Coloring *************************************/
	
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
	
	/* ------------------ Text Color List ------------------- */
	
	public static final RGB ATTRIBUTE_FOREGROUND = NOIR;
	public static final RGB COMMENT_FOREGROUND = VERT_CLAIR;
	public static final RGB ERROR_FOREGROUND = NOIR;
	public static final RGB EVENT_FOREGROUND = VIOLET;
	public static final RGB ID_FOREGROUND = BLEU;
	public static final RGB NUMBER_FOREGROUND = ORANGE;
	public static final RGB OPERATOR_FOREGROUND = NOIR;
	public static final RGB VALUE_FOREGROUND = GRIS_CLAIR;
	
	/* --------------- Background Color List ---------------- */

	public static final RGB ATTRIBUTE_BACKGROUND = BLANC;
	public static final RGB COMMENT_BACKGROUND = BLANC;
	public static final RGB ERROR_BACKGROUND = ROUGE;
	public static final RGB EVENT_BACKGROUND = BLANC;
	public static final RGB ID_BACKGROUND = BLANC;
	public static final RGB NUMBER_BACKGROUND = BLANC;
	public static final RGB OPERATOR_BACKGROUND = BLANC;
	public static final RGB VALUE_BACKGROUND = BLANC;
	
	/* --------------------- Style List --------------------- */
	
	// 0 for no style, SWT.BOLD, SWT.ITALIC, see SWT's Javadoc for others
	
	public static final int ATTRIBUTE_STYLE = SWT.BOLD;
	public static final int COMMENT_STYLE = SWT.ITALIC;
	public static final int ERROR_STYLE = 0;
	public static final int EVENT_STYLE = 0;
	public static final int ID_STYLE = 0;
	public static final int NUMBER_STYLE = 0;
	public static final int OPERATOR_STYLE = 0;
	public static final int VALUE_STYLE = SWT.ITALIC;
	
	
	/*********************************** Miscellaneous **********************************/
	
	/* --------------------- Debug Mode --------------------- */
	
	public static final boolean DEBUG_MODE = true;
}
