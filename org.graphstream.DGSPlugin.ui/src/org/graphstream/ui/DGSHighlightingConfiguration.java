package org.graphstream.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.*;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class DGSHighlightingConfiguration implements IHighlightingConfiguration{
	 
	/* ------------------- Partition Name ------------------- */
	
	public final static String AE = "ae";
	public final static String AN = "an";
	public final static String ARRAY = "array";
	public final static String ASSIGN = "assign";
	public final static String ATTRIBUTE = "attribute";
	public final static String ATTRIBUTES = "attributes";
	public final static String CE = "ce";
	public final static String CG = "cg";
	public final static String CL = "cl";
	public final static String CN = "cn";
	public final static String COMMENT = "comment";
	public final static String DE = "de";
	public final static String DGS = "dgs";
	public final static String DIRECTION = "direction";
	public final static String DN = "dn";
	public final static String EVENT = "event";
	public final static String HEADER = "header";
	public final static String ID = "id";
	public final static String INT = "int";
	public final static String MAGIC = "magic";
	public final static String MAP = "map";
	public final static String MAPPING = "mapping";
	public final static String REAL = "real";
	public final static String ST = "st";
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
		
	/* ------------------- Default Style -------------------- */

	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		acceptor.acceptDefaultHighlighting(AE, "Ae", getTextStyle(VIOLET, BLANC, 0));
		acceptor.acceptDefaultHighlighting(AN, "An", getTextStyle(VIOLET, BLANC, 0));
		acceptor.acceptDefaultHighlighting(ARRAY, "Array", getTextStyle(NOIR, BLANC, 0));
		acceptor.acceptDefaultHighlighting(ASSIGN, "Assign", getTextStyle(NOIR, BLANC, 0));
		acceptor.acceptDefaultHighlighting(ATTRIBUTE, "Attribute", getTextStyle(NOIR, BLANC, SWT.BOLD));
		acceptor.acceptDefaultHighlighting(ATTRIBUTES, "Attributes", getTextStyle(NOIR, BLANC, 0));
		acceptor.acceptDefaultHighlighting(CE, "Ce", getTextStyle(VIOLET, BLANC, 0));
		acceptor.acceptDefaultHighlighting(CG, "Cg", getTextStyle(VIOLET, BLANC, 0));
		acceptor.acceptDefaultHighlighting(CL, "Cl", getTextStyle(VIOLET, BLANC, 0));
		acceptor.acceptDefaultHighlighting(CN, "Cn", getTextStyle(VIOLET, BLANC, 0));
		acceptor.acceptDefaultHighlighting(COMMENT, "Comment", getTextStyle(VERT_CLAIR, BLANC, SWT.ITALIC));
		acceptor.acceptDefaultHighlighting(DE, "De", getTextStyle(VIOLET, BLANC, 0));
		acceptor.acceptDefaultHighlighting(DGS, "Dgs", getTextStyle(NOIR, BLANC, 0));
		acceptor.acceptDefaultHighlighting(DIRECTION, "Direction", getTextStyle(NOIR, BLANC, 0));
		acceptor.acceptDefaultHighlighting(DN, "Dn", getTextStyle(VIOLET, BLANC, 0));
		acceptor.acceptDefaultHighlighting(EVENT, "Event", getTextStyle(NOIR, BLANC, 0));
		acceptor.acceptDefaultHighlighting(HEADER, "Header", getTextStyle(NOIR, BLANC, 0));
		acceptor.acceptDefaultHighlighting(ID, "Id", getTextStyle(BLEU, BLANC, 0));
		acceptor.acceptDefaultHighlighting(INT, "Int", getTextStyle(ORANGE, BLANC, 0));
		acceptor.acceptDefaultHighlighting(MAGIC, "Magic", getTextStyle(KAKI, BLANC, 0));
		acceptor.acceptDefaultHighlighting(MAP, "Map", getTextStyle(NOIR, BLANC, 0));
		acceptor.acceptDefaultHighlighting(MAPPING, "Mapping", getTextStyle(NOIR, BLANC, 0));
		acceptor.acceptDefaultHighlighting(REAL, "Real", getTextStyle(ORANGE, BLANC, 0));
		acceptor.acceptDefaultHighlighting(ST, "St", getTextStyle(VIOLET, BLANC, 0));
		acceptor.acceptDefaultHighlighting(STRING, "String", getTextStyle(BLEU, BLANC, 0));
		acceptor.acceptDefaultHighlighting(VALUE, "Value", getTextStyle(GRIS_CLAIR, BLANC, SWT.ITALIC));
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
