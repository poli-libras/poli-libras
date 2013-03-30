package br.usp.libras.syntax;

import java.util.ArrayList;
import java.util.List;

public class SubjectFinder {

	public List<TokenMorph> findSubject(List<TokenMorph> tokens) {
		
		List<TokenMorph> subject = new ArrayList<TokenMorph>();
		for (TokenMorph tk: tokens) {
			if (tk.getSyntaticTag().equals(SyntacticTags.SUBJ)) 
				subject.add(tk);
		}
		return subject;
	}
}
