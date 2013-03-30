package br.usp.libras.syntax.transforms;

import java.util.List;

import br.usp.libras.syntax.TokenMorph;

/**
 * Changes the structure of the sentence 
 * @author leonardo
 *
 */
public interface TokensTransform {
	
	public List<TokenMorph> transform(List<TokenMorph> tokens);

}
