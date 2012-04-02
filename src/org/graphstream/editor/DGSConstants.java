package org.graphstream.editor;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

public class DGSConstants {
	
	/*
	 * Liste des couleurs
	 */
	
	private static RGB BLANC = new RGB(255, 255, 255);
	private static RGB BLEU = new RGB(50, 50, 255);
	private static RGB BLEU_CLAIR = new RGB(102, 255, 255);
	private static RGB BLEU_FONCE = new RGB(0, 0, 153);
	private static RGB GRIS = new RGB(153, 153, 153);
	private static RGB GRIS_CLAIR = new RGB(192, 192, 192);
	private static RGB GRIS_FONCE = new RGB(102, 102, 102);
	private static RGB JAUNE = new RGB(255, 255, 0);
	private static RGB KAKI = new RGB(102, 102, 0);
	private static RGB NOIR = new RGB(0, 0, 0);
	private static RGB ORANGE = new RGB(255, 153, 0);
	private static RGB ROSE = new RGB(255, 204, 204);
	private static RGB ROUGE = new RGB(255, 0, 0);
	private static RGB VERT = new RGB(51, 204, 0);
	private static RGB VERT_CLAIR = new RGB(0, 153, 0);
	private static RGB VERT_FONCE = new RGB(0, 102, 0);
	private static RGB VIOLET = new RGB(140, 10, 210);
	
	/*
	 * Liste des couleurs textes
	 */
	
	private static RGB EVENT_FOREGROUND = VIOLET;
	private static RGB ID_FOREGROUND = BLEU;
	private static RGB ATTRIBUTE_FOREGROUND = NOIR;
	private static RGB VALEUR_FOREGROUND = GRIS_CLAIR;
	private static RGB NUMBER_FOREGROUND = ORANGE;
	private static RGB COMMENT_FOREGROUND = VERT_CLAIR;
	
	/*
	 * Liste des couleurs fond
	 */
	
	private static RGB EVENT_BACKGROUND = BLANC;
	private static RGB ID_BACKGROUND = BLANC;
	private static RGB ATTRIBUTE_BACKGROUND = BLANC;
	private static RGB VALEUR_BACKGROUND = BLANC;
	private static RGB NUMBER_BACKGROUND = BLANC;
	private static RGB COMMENT_BACKGROUND = BLANC;
	
	/*
	 * Liste des styles
	 */
	
	private static int EVENT_STYLE = 0;
	private static int ID_STYLE = 0;
	private static int ATTRIBUTE_STYLE = SWT.BOLD;
	private static int VALEUR_STYLE = SWT.ITALIC;
	private static int NUMBER_STYLE = 0;
	private static int COMMENT_STYLE = SWT.ITALIC;
	
	/*
	 * Liste des tokens
	 */
	
	public static IToken EVENT = new Token(new TextAttribute(
			new Color(Display.getCurrent(), EVENT_FOREGROUND),
			new Color(Display.getCurrent(), EVENT_BACKGROUND),
			EVENT_STYLE));
	
	public static IToken ID = new Token(new TextAttribute(
			new Color(Display.getCurrent(), ID_FOREGROUND),
			new Color(Display.getCurrent(), ID_BACKGROUND),
			ID_STYLE));
	
	public static IToken ATTRIBUTE = new Token(new TextAttribute(
			new Color(Display.getCurrent(), ATTRIBUTE_FOREGROUND),
			new Color(Display.getCurrent(), ATTRIBUTE_BACKGROUND),
			ATTRIBUTE_STYLE));
	
	public static IToken VALEUR = new Token(new TextAttribute(
			new Color(Display.getCurrent(), VALEUR_FOREGROUND),
			new Color(Display.getCurrent(), VALEUR_BACKGROUND),
			VALEUR_STYLE));
	
	public static IToken NUMBER = new Token(new TextAttribute(
			new Color(Display.getCurrent(), NUMBER_FOREGROUND),
			new Color(Display.getCurrent(), NUMBER_BACKGROUND),
			NUMBER_STYLE));
	
	public static IToken COMMENT = new Token(new TextAttribute(
			new Color(Display.getCurrent(), COMMENT_FOREGROUND),
			new Color(Display.getCurrent(), COMMENT_BACKGROUND),
			COMMENT_STYLE));
}
