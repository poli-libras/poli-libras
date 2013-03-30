package br.usp.libras.syntax;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SubjectFinderTest {
	
	@Test
	public void shouldFindSubjectTokens() {
		
		List<TokenMorph> tokens = getStatement();
		SubjectFinder finder = new SubjectFinder();
		List<TokenMorph> subject = finder.findSubject(tokens);
		
		assertEquals(2, subject.size());
		assertEquals("O", subject.get(0).getLexeme());
		assertEquals("cachorro", subject.get(1).getLexeme());
	}
	
	private List<TokenMorph> getStatement() {
		
		List<TokenMorph> tokens = new ArrayList<TokenMorph>();
		TokenMorph tk = new TokenMorph("O", SyntacticTags.SUBJ, MorphTags.ART);
		tokens.add(tk);
		
		tk = new TokenMorph("cachorro", SyntacticTags.SUBJ, MorphTags.NOUN);
		tokens.add(tk);
		
		tk = new TokenMorph("latiu", SyntacticTags.VERB, MorphTags.V_FIN);
		tokens.add(tk);
		
		tk = new TokenMorph("para", SyntacticTags.ACC, MorphTags.PRP);
		tokens.add(tk);
		
		tk = new TokenMorph("o", SyntacticTags.ACC, MorphTags.ART);
		tokens.add(tk);
		
		tk = new TokenMorph("dono", SyntacticTags.ACC, MorphTags.NOUN);
		tokens.add(tk);

		return tokens;
	}
}
