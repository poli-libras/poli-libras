package br.usp.libras.syntax;

import java.util.List;

/**
 * Finds the verb
 * 
 * For now, we consider that there is only one verb in the sentence
 * @author leonardo
 *
 */
public class VerbFinder {
	
	/**
	 * 
	 * @param tokens
	 * @return <code>null</code> if verb is not found
	 */
	public TokenMorph findVerb(List<TokenMorph> tokens) {

		for (TokenMorph tk: tokens) {
			if (MorphTags.isVerb(tk.getMorphTag())) {
				return tk;
			}
		}
		return null;
	}
}
