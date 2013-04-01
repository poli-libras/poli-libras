package br.usp.libras.syntax;

import java.util.ArrayList;
import java.util.List;

public class ObjectFinder {
	
    /**
     * Retorna todos os tokens que fazem parte do OBJETO da frase.
     * @param tokens Tokens que representam a frase a ser analisada.
     * @return Nova lista contendo apenas os tokens do objeto. Se não houver nenhum, retorna uma lista vazia.
     */
	public List<TokenMorph> findObject(List<TokenMorph> tokens) {
		
		List<TokenMorph> object = new ArrayList<TokenMorph>();
		for (TokenMorph tk : tokens) {
			if (SyntacticTags.isObject(tk.getSyntaticTag())) 
				object.add(tk);
		}
		return object;

	}

}
