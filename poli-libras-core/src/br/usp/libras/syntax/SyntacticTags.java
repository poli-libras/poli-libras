package br.usp.libras.syntax;

/**
 * Syntatic tags matching Cogroo tags.
 * 
 * 1.1. Argumentos ao nível da oração (governados por valência) em
 * http://www.linguateca.pt/floresta/BibliaFlorestal/anexo1.html
 * @author leonardo
 *
 */
public class SyntacticTags {

	public static final String SUBJ = "SUBJ";
	public static final String VERB = "P";
	public static final String ACC = "ACC";
	public static final String ACC_PAS = "ACC-PAS";
	public static final String DAT = "DAT";
	public static final String PIV = "PIV";
	public static final String ADVL = "ADVL";
	public static final String SC = "SC";
	public static final String OTHER = "O";
	
	public static boolean isObject(String tag) {
		return (tag.equals(ACC) || tag.equals(ACC_PAS) || tag.equals(DAT) || tag.equals(PIV));
	}

}
