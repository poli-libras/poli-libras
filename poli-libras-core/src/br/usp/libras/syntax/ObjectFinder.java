package br.usp.libras.syntax;

import java.util.ArrayList;
import java.util.List;

public class ObjectFinder {
	
	public List<TokenMorph> findObject(List<TokenMorph> tokens) {
		
		List<TokenMorph> object = new ArrayList<TokenMorph>();
		for (TokenMorph tk: tokens) {
			if (SyntacticTags.isObject(tk.getSyntaticTag())) 
				object.add(tk);
		}
		return object;

	}

}
