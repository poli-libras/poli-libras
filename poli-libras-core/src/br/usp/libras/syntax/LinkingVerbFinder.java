package br.usp.libras.syntax;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * A verb is a linking verb if the object syntactic tag is SC and the verb lemma is in:
 * ser, estar, parecer, permanecer, ficar, continuar, andar
 * 
 * @author leonardo
 *
 */
public class LinkingVerbFinder {

    private Properties tags = new Properties();
	
	public LinkingVerbFinder() {
		Tagger tagger = new Tagger();
		tags = tagger.getTags();
	}
	
	/**
	 * Dada uma lista de TokenMorph, retorna uma nova lista contendo apenas os tokens que são verbos de ligação. 
	 * @param tokens
	 * @return Lista contendo tokens do verbo de ligação. Se não houver nenhum, retorna uma lista vazia.
	 */
	public List<TokenMorph> findLinkingVerbs(List<TokenMorph> tokens) {
		
		List<TokenMorph> linkingVerbs = new ArrayList<TokenMorph>(1);
		for (TokenMorph tk : tokens) {
			String lemma = tk.getLemma();
			if (lemma != null) {
				String tag = this.tags.getProperty(tk.getLemma());
				if (TokenProperties.LINKING_VERB.equals(tag)) {
					linkingVerbs.add(tk);
				}
			}
		}
		return linkingVerbs;
	}
}
