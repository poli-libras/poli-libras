package br.usp.libras.syntax;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ObjectFinderTest {
	
	@Test
	public void shouldFindObjectTokens() {
		
		List<TokenMorph> tokens = getStatement();
		ObjectFinder finder = new ObjectFinder();
		List<TokenMorph> object = finder.findObject(tokens);
		
		assertEquals(3, object.size());
		assertEquals("para", object.get(0).getLexeme());
		assertEquals("o", object.get(1).getLexeme());
		assertEquals("dono", object.get(2).getLexeme());
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
