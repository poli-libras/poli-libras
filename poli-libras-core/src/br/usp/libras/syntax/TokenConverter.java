package br.usp.libras.syntax;

import java.util.ArrayList;
import java.util.List;

import org.cogroo.text.Token;

/**
 * Convert Cogroo tokens to our tokens
 * @author leonardo
 *
 */
public class TokenConverter {

	public List<TokenMorph> convertTokens(List<Token> tokens) {
		
		List<TokenMorph> tokensMorph = new ArrayList<TokenMorph>();
		
		for (Token tk: tokens) {

			String syntaticTag = tk.getSyntacticTag().replace("B-", "").replace("I-", "");
			String phraseTag = tk.getChunkTag().replace("B-", "").replace("I-", "");
			TokenMorph tkm = new TokenMorph(tk.getLexeme(), tk.getLemmas()[0], syntaticTag, phraseTag, tk.getPOSTag(), tk.getFeatures());
			tokensMorph.add(tkm);
		}
		
		return tokensMorph;
	}
	
}
