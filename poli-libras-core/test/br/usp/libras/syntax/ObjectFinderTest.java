package br.usp.libras.syntax;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

	@Test 
	public void shouldReturnEmptyListWhenThereIsNoObject(){
		
		List<TokenMorph> tokens = getStatementWithoutObject();
		ObjectFinder finder = new ObjectFinder();
		List<TokenMorph> object = finder.findObject(tokens);
		
		assertTrue(object.isEmpty());
	}
	
	@Test
	public void shouldFindOneObjectTokens() {
		
		List<TokenMorph> tokens = getStatementWithOneObject();
		ObjectFinder finder = new ObjectFinder();
		List<TokenMorph> object = finder.findObject(tokens);
		
		assertEquals(1, object.size());
		assertEquals("ração", object.get(0).getLexeme());
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
	
	/**
	 * Retorna "O cachorro latiu"
	 * @return
	 */
	private List<TokenMorph> getStatementWithoutObject() {
		
		List<TokenMorph> tokens = new ArrayList<TokenMorph>();
		TokenMorph tk = new TokenMorph("O", SyntacticTags.SUBJ, MorphTags.ART);
		tokens.add(tk);
		
		tk = new TokenMorph("cachorro", SyntacticTags.SUBJ, MorphTags.NOUN);
		tokens.add(tk);
		
		tk = new TokenMorph("latiu", SyntacticTags.VERB, MorphTags.V_FIN);
		tokens.add(tk);

		return tokens;
	}
	
	/**
	 * Retorna "O cachorro comeu ração"
	 * @return
	 */
	private List<TokenMorph> getStatementWithOneObject() {
		
		List<TokenMorph> tokens = new ArrayList<TokenMorph>();
		
		TokenMorph tk = new TokenMorph("O", SyntacticTags.SUBJ, MorphTags.ART);
		tokens.add(tk);
		
		tk = new TokenMorph("cachorro", SyntacticTags.SUBJ, MorphTags.NOUN);
		tokens.add(tk);
		
		tk = new TokenMorph("comeu", SyntacticTags.VERB, MorphTags.V_FIN);
		
		tk = new TokenMorph("ração", SyntacticTags.ACC, MorphTags.NOUN);
		tokens.add(tk);

		return tokens;
	}
	

}
